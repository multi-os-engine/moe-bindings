package com.migeran.moe.ui;

import org.moe.binding.googlesignin.GIDGoogleUser;
import org.moe.binding.googlesignin.GIDSignIn;
import org.moe.binding.googlesignin.GIDSignInButton;
import org.moe.binding.googlesignin.enums.GIDSignInButtonColorScheme;
import org.moe.binding.googlesignin.enums.GIDSignInButtonStyle;
import org.moe.binding.googlesignin.protocol.GIDSignInDelegate;
import org.moe.binding.googlesignin.protocol.GIDSignInUIDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import apple.c.Globals;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSIndexPath;
import apple.foundation.NSString;
import apple.foundation.NSURL;
import apple.foundation.NSURLResponse;
import apple.foundation.NSURLSession;
import apple.foundation.NSURLSessionTask;
import apple.uikit.UIBarButtonItem;
import apple.uikit.UIButton;
import apple.uikit.UIImage;
import apple.uikit.UIImageView;
import apple.uikit.UILabel;
import apple.uikit.UIScreen;
import apple.uikit.UISlider;
import apple.uikit.UISwitch;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewController;
import apple.uikit.UIViewController;
import apple.uikit.enums.UIBarButtonItemStyle;
import apple.uikit.enums.UIControlEvents;
import apple.uikit.enums.UITableViewCellAccessoryType;
import apple.uikit.enums.UITableViewCellStyle;
import apple.uikit.protocol.UIAlertViewDelegate;

import static apple.coregraphics.c.CoreGraphics.CGRectMake;

// A view controller for the Google+ sign-in button which initiates a standard
// OAuth 2.0 flow and provides an access token and a refresh token. A "Sign out"
// button is provided to allow users to sign out of this application.
@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("SignInViewController")
@RegisterOnStartup
public class SignInViewController extends UITableViewController implements GIDSignInDelegate,
        GIDSignInUIDelegate, UIAlertViewDelegate {

    private String kPlaceholderUserName = "<Name>";
    private String kPlaceholderEmailAddress = "<Email>";
    private String kPlaceholderAvatarImageName = "PlaceholderAvatar.png";

    // Labels for the cells that have in-cell control elements.
    private String kGetUserProfileCellLabel = "Get user Basic Profile";
    private String kButtonWidthCellLabel = "Width";

    // Labels for the cells that drill down to data pickers.
    private String kColorSchemeCellLabel = "Color scheme";
    private String kStyleCellLabel = "Style";

    // Strings for Alert Views.
    private String kSignInViewTitle = "Sign in View";
    private String kSignOutAlertViewTitle = "Warning";
    private String kSignOutAlertCancelTitle = "Cancel";
    private String kSignOutAlertConfirmTitle = "Continue";

    // Accessibility Identifiers.
    private String kCredentialsButtonAccessibilityIdentifier = "Credentials";

    private DataPickerState colorSchemeState;
    private DataPickerState styleState;
    private Vector<Vector<String>> sectionCellLabels;
    private Vector<String> drillDownCells;
    private Vector<String> switchCells;
    private Vector<String> sliderCells;
    private Map<String, DataPickerState> drilldownCellState;
    private UISlider signInButtonWidthSlider;

    @Owned
    @Selector("alloc")
    public static native SignInViewController alloc();

    @Selector("init")
    public native SignInViewController init();

    protected SignInViewController(Pointer peer) {
        super(peer);
    }

    private void setup() {
        this.sectionCellLabels = new Vector<>();
        Vector<String> sec1 = new Vector<>();
        sec1.add(kColorSchemeCellLabel);
        sec1.add(kStyleCellLabel);
        sec1.add(kButtonWidthCellLabel);
        sectionCellLabels.add(sec1);

        Vector<String> sec2 = new Vector<>();
        sec2.add(kGetUserProfileCellLabel);
        sectionCellLabels.add(sec2);

        this.drillDownCells = new Vector<>();
        drillDownCells.add(kColorSchemeCellLabel);
        drillDownCells.add(kStyleCellLabel);

        this.switchCells = new Vector<>();
        switchCells.add(kGetUserProfileCellLabel);

        this.sliderCells = new Vector<>();
        sliderCells.add(kButtonWidthCellLabel);

        String dictionaryPath = NSBundle.mainBundle().pathForResourceOfType
                ("DataPickerDictionary", "plist");
        NSDictionary configOptionsDict = NSDictionary.dictionaryWithContentsOfFile(dictionaryPath);

        NSDictionary colorSchemeDict = (NSDictionary) configOptionsDict.objectForKey(kColorSchemeCellLabel);
        NSDictionary styleDict = (NSDictionary) configOptionsDict.objectForKey(kStyleCellLabel);

        colorSchemeState = DataPickerState.alloc().initWithDictionary(colorSchemeDict);
        styleState = DataPickerState.alloc().initWithDictionary(styleDict);

        drilldownCellState = new HashMap<>();
        drilldownCellState.put(kColorSchemeCellLabel, colorSchemeState);
        drilldownCellState.put(kStyleCellLabel, styleState);

        GIDSignInButton.alloc();

        GIDSignIn signIn = GIDSignIn.sharedInstance();
        signIn.setShouldFetchBasicProfile(true);
        signIn.setDelegate(this);
        signIn.setUiDelegate(this);
    }

    @Override
    public SignInViewController initWithNibNameBundle(String s, NSBundle nsBundle) {
        SignInViewController controller = (SignInViewController) super.initWithNibNameBundle(s, nsBundle);
        controller.setup();
        controller.setTitle(kSignInViewTitle);
        return controller;
    }

    @Override
    public SignInViewController initWithCoder(NSCoder nsCoder) {
        SignInViewController controller = (SignInViewController) super.initWithCoder(nsCoder);
        controller.setup();
        controller.setTitle(kSignInViewTitle);
        return controller;
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        credentialsButton().setAccessibilityIdentifier(kCredentialsButtonAccessibilityIdentifier);
    }

    @Override
    public void viewWillAppear(boolean b) {
        super.viewWillAppear(b);

        adoptUserSettings();
        reportAuthStatus();
        updateButtons();
        tableView().reloadData();
    }

    @Selector("signIn:didSignInForUser:withError:")
    public void signInDidSignInForUserWithError(GIDSignIn signIn, GIDGoogleUser googleUser,
                                                NSError error) {

        if (error != null) {
            signInAuthStatus().setText(NSString.stringWithFormat("Status: Authentication error: " +
                    "%@", error).toString());
        }

        reportAuthStatus();
        updateButtons();
    }

    @Override
    public void signInDidDisconnectWithUserWithError(GIDSignIn gidSignIn, GIDGoogleUser
            gidGoogleUser, NSError nsError) {

        if (nsError != null) {
            signInAuthStatus().setText(NSString.stringWithFormat("Status: Failed to disconnect: " +
                    "%@", nsError).toString());
        } else {
            signInAuthStatus().setText(NSString.stringWithFormat("Status: Disconnected").toString());
        }

        reportAuthStatus();
        updateButtons();
    }

    @Override
    public void signInPresentViewController(GIDSignIn gidSignIn, UIViewController uiViewController) {
        navigationController().pushViewControllerAnimated(uiViewController, true);
    }

    private void adoptUserSettings() {
        for (String scheme : colorSchemeState.getSelectedCells()) {
            if (scheme.equals("Light")) {
                signInButton().setColorScheme(GIDSignInButtonColorScheme.Light);
            } else {
                signInButton().setColorScheme(GIDSignInButtonColorScheme.Dark);
            }
        }

        for (String style : styleState.getSelectedCells()) {
            long newStyle;

            if (signInButtonWidthSlider != null) {
                if (style.equals("Standard")) {
                    newStyle = GIDSignInButtonStyle.Standard;
                    signInButtonWidthSlider.setEnabled(true);
                } else if (style.equals("Wide")) {
                    newStyle = GIDSignInButtonStyle.Wide;
                    signInButtonWidthSlider.setEnabled(true);
                } else {
                    newStyle = GIDSignInButtonStyle.IconOnly;
                    signInButtonWidthSlider.setEnabled(false);
                }
                if (signInButton().style() != newStyle) {
                    signInButton().setStyle(newStyle);
                    signInButtonWidthSlider.setMinimumValue(minimumButtonWidth());
                }
                signInButtonWidthSlider.setValue((float) signInButton().frame().size().width());
            }
        }
    }

    private void reportAuthStatus() {
        GIDGoogleUser googleUser = GIDSignIn.sharedInstance().currentUser();
        if (googleUser != null && googleUser.authentication() != null) {
            signInAuthStatus().setText("Status: Authenticated");
        } else {
            signInAuthStatus().setText("Status: Not authenticated");
        }

        refreshUserInfo();
    }

    private float minimumButtonWidth() {
        CGRect frame = signInButton().frame();
        signInButton().setFrame(CoreGraphics.CGRectZero());

        System.out.println("Minimum width: " + signInButton().frame().size().width());
        float minimumWidth = (float) signInButton().frame().size().width();
        signInButton().setFrame(frame);

        return minimumWidth;
    }

    private void refreshUserInfo() {
        if (GIDSignIn.sharedInstance().currentUser() == null || GIDSignIn.sharedInstance()
                .currentUser().authentication() == null) {
            userName().setText(kPlaceholderUserName);
            userEmailAddress().setText(kPlaceholderEmailAddress);
            userAvatar().setImage(UIImage.imageNamed(kPlaceholderAvatarImageName));
            return;
        }
        userEmailAddress().setText(GIDSignIn.sharedInstance().currentUser().profile().email());
        userName().setText(GIDSignIn.sharedInstance().currentUser().profile().name());

        if (!GIDSignIn.sharedInstance().currentUser().profile().hasImage()) {
            // There is no Profile Image to be loaded.
            return;
        }

        long dimension = Math.round(userAvatar().frame().size().width() * UIScreen.mainScreen().scale());

        NSURL nsurl = GIDSignIn.sharedInstance().currentUser().profile().imageURLWithDimension(dimension);

        NSURLSessionTask task = NSURLSession.sharedSession().dataTaskWithURLCompletionHandler
                (nsurl, new NSURLSession.Block_dataTaskWithURLCompletionHandler() {
            @Override
            public void call_dataTaskWithURLCompletionHandler(NSData nsData, NSURLResponse
                    nsurlResponse, NSError nsError) {
                if (nsData == null) {
                    return;
                }

                UIImage image = UIImage.imageWithData(nsData);

                if (image == null) {
                    return;
                }

                Globals.dispatch_async(Globals.dispatch_get_main_queue(), new Globals
                        .Block_dispatch_async() {
                            @Override
                            public void call_dispatch_async() {
                                userAvatar().setImage(image);
                            }
                        }
                );

            }
        });

        task.resume();
    }

    private void updateButtons() {
        boolean authenticated = GIDSignIn.sharedInstance().currentUser() != null && GIDSignIn
                .sharedInstance().currentUser().authentication() != null;

        signInButton().setEnabled(!authenticated);
        signOutButton().setEnabled(authenticated);
        disconnectButton().setEnabled(authenticated);
        credentialsButton().setHidden(!authenticated);

        if (authenticated) {
            signInButton().setAlpha(0.5);
            disconnectButton().setAlpha(1.0);
            signOutButton().setAlpha(1.0);
        } else {
            signInButton().setAlpha(1.0);
            disconnectButton().setAlpha(0.5);
            signOutButton().setAlpha(0.5);
        }
    }

    @Selector("signOut:")
    public void signOut(Object sender) {
        GIDSignIn.sharedInstance().signOut();
        reportAuthStatus();
        updateButtons();
    }

    @Selector("disconnect:")
    public void disconnect(Object sender) {
        GIDSignIn.sharedInstance().disconnect();
    }

    @Selector("showAuthInspector:")
    public void showAuthInspector(Object sender) {
        AuthInspectorViewController authInspector = AuthInspectorViewController.alloc().init();
        navigationController().pushViewControllerAnimated(authInspector, true);
    }

    @Selector("checkSignIn:")
    public void checkSignIn(Object sender) {
        reportAuthStatus();
    }

    @Selector("toggleBasicProfile")
    public void toggleBasicProfile(UISwitch sender) {
        GIDSignIn.sharedInstance().setShouldFetchBasicProfile(sender.isOn());
    }

    @Selector("changeSignInButtonWidth:")
    public void changeSignInButtonWidth(UISlider sender) {
        CGRect frame = signInButton().frame();
        System.out.println("Width: " + sender.value());
        frame.size().setWidth(sender.value());
        signInButton().setFrame(frame);
    }

    @Override
    public long numberOfSectionsInTableView(UITableView uiTableView) {
        return sectionCellLabels.size();
    }

    @Override
    public long tableViewNumberOfRowsInSection(UITableView uiTableView, @NInt long section) {
        return sectionCellLabels.get((int) section).size();
    }

    @Override
    public String tableViewTitleForHeaderInSection(UITableView uiTableView, @NInt long section) {
        if (section == 0) {
            return "Sign-in Button Configuration";
        } else if (section == 1) {
            return "Other Configurations";
        } else {
            return "";
        }
    }

    @Override
    public boolean tableViewShouldHighlightRowAtIndexPath(UITableView uiTableView, NSIndexPath nsIndexPath) {
        String label = sectionCellLabels.get((int) nsIndexPath.section()).get((int) nsIndexPath.row());
        if (drillDownCells.contains(label)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        String kDrilldownCell = "DrilldownCell";
        String kSwitchCell = "SwitchCell";
        String kSliderCell = "SliderCell";

        String label = sectionCellLabels.get((int) indexPath.section()).get((int) indexPath.row());
        UITableViewCell cell;
        String identifier = null;

        if (drillDownCells.contains(label)) {
            identifier = kDrilldownCell;
        } else if (switchCells.contains(label)) {
            identifier = kSwitchCell;
        } else if (sliderCells.contains(label)) {
            identifier = kSliderCell;
        }

        cell = tableView.dequeueReusableCellWithIdentifier(identifier);

        if (cell == null) {
            cell = UITableViewCell.alloc().initWithStyleReuseIdentifier(UITableViewCellStyle
                    .Value1, identifier);
        }
        // Assign accessibility labels to each cell row.
        cell.setAccessibilityLabel(label);

        if (identifier == kDrilldownCell) {
            cell.setAccessoryType(UITableViewCellAccessoryType.DisclosureIndicator);
            DataPickerState dataState = drilldownCellState.get(label);
            if (dataState.isMultipleSelectEnabled()) {
                cell.detailTextLabel().setText("");
            } else {
                cell.detailTextLabel().setText(dataState.getSelectedCells().get(0));
            }
            cell.setAccessibilityValue(cell.detailTextLabel().text());
        } else if (identifier == kSwitchCell) {
            UISwitch toggle = UISwitch.alloc().initWithFrame(CoreGraphics.CGRectZero());

            if (label.equals(kGetUserProfileCellLabel)) {
                toggle.addTargetActionForControlEvents(this, new SEL("toggleBasicProfile"),
                        UIControlEvents.ValueChanged);
                toggle.setOn(GIDSignIn.sharedInstance().shouldFetchBasicProfile());
            }

            toggle.setAccessibilityLabel(cell
                    .accessibilityLabel() + " Switch");
            cell.setAccessoryView(toggle);
        } else if (identifier == kSliderCell) {

            UISlider slider = UISlider.alloc().initWithFrame(CGRectMake(0, 0, 150, 0));
            slider.setMinimumValue(minimumButtonWidth());
            slider.setMaximumValue(268);
            slider.setValue((float) signInButton().frame().size().width());
            slider.setEnabled(signInButton().style() != GIDSignInButtonStyle.IconOnly);

            slider.addTargetActionForControlEvents(this, new SEL("changeSignInButtonWidth:"),
                    UIControlEvents.ValueChanged);

            slider.setAccessibilityIdentifier(label + " Slider");
            this.signInButtonWidthSlider = slider;
            cell.setAccessoryView(slider);
            signInButtonWidthSlider.sizeToFit();
        }

        cell.textLabel().setText(label);

        return cell;
    }

    @Override
    public void tableViewDidSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        tableView.deselectRowAtIndexPathAnimated(indexPath, true);
        UITableViewCell selectedCell = tableView.cellForRowAtIndexPath(indexPath);
        String label = selectedCell.textLabel().text();

        DataPickerState dataState = drilldownCellState.get(label);
        if (dataState == null) {
            return;
        }

        DataPickerViewController dataPicker =
        DataPickerViewController.alloc().initWithNibNameBundle(null,
        null,
        dataState);
        dataPicker.navigationItem().setTitle(label);

        // Force the back button title to be 'Back'
        UIBarButtonItem newBackButton =
        UIBarButtonItem.alloc().initWithTitleStyleTargetAction("Back",
        UIBarButtonItemStyle.Plain,
        null,
        null);
        navigationItem().setBackBarButtonItem(newBackButton);
        navigationController().pushViewControllerAnimated(dataPicker, true);
    }

    @Selector("signInButton")
    @Property
    public native GIDSignInButton signInButton();

    @Selector("signInAuthStatus")
    @Property
    public native UILabel signInAuthStatus();

    @Selector("userName")
    @Property
    public native UILabel userName();

    @Selector("userEmailAddress")
    @Property
    public native UILabel userEmailAddress();

    @Selector("signOutButton")
    @Property
    public native UIButton signOutButton();

    @Selector("userAvatar")
    @Property
    public native UIImageView userAvatar();

    @Selector("disconnectButton")
    @Property
    public native UIButton disconnectButton();

    @Selector("credentialsButton")
    @Property
    public native UIButton credentialsButton();

}
