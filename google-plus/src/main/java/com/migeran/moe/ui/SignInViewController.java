package com.migeran.moe.ui;

import org.moe.binding.googleopensource.GTLPlusPerson;
import org.moe.binding.googleopensource.GTMOAuth2Authentication;
import org.moe.binding.googleplus.GPPSignIn;
import org.moe.binding.googleplus.GPPSignInButton;
import org.moe.binding.googleplus.enums.GPPSignInButtonStyle;
import org.moe.binding.googleplus.protocol.GPPSignInDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IBAction;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import java.util.HashMap;
import java.util.Map;

import apple.c.Globals;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMutableArray;
import apple.foundation.NSString;
import apple.foundation.NSURL;
import apple.uikit.UIAlertView;
import apple.uikit.UIBarButtonItem;
import apple.uikit.UIButton;
import apple.uikit.UIControl;
import apple.uikit.UIImage;
import apple.uikit.UIImageView;
import apple.uikit.UILabel;
import apple.uikit.UISlider;
import apple.uikit.UISwitch;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewController;
import apple.uikit.enums.UIBarButtonItemStyle;
import apple.uikit.enums.UIControlEvents;
import apple.uikit.enums.UITableViewCellAccessoryType;
import apple.uikit.enums.UITableViewCellStyle;
import apple.uikit.protocol.UIAlertViewDelegate;

import static apple.coregraphics.c.CoreGraphics.CGRectMake;
import static org.moe.binding.googleplus.enums.GPPSignInButtonColorScheme.kGPPSignInButtonColorSchemeDark;
import static org.moe.binding.googleplus.enums.GPPSignInButtonColorScheme.kGPPSignInButtonColorSchemeLight;
import static org.moe.binding.googleplus.enums.GPPSignInButtonStyle.kGPPSignInButtonStyleIconOnly;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("SignInViewController")
@RegisterOnStartup
public class SignInViewController extends UITableViewController implements GPPSignInDelegate, UIAlertViewDelegate {

    static String kPlaceholderUserName = "<Name>";
    static String kPlaceholderEmailAddress = "<Email>";
    static String kPlaceholderAvatarImageName = "PlaceholderAvatar.png";

    // Labels for the cells that have in-cell control elements.
    static String kGetUserIDCellLabel = "Get user ID";
    static String kSingleSignOnCellLabel = "Use Single Sign-On";
    static String kButtonWidthCellLabel = "Width";

    // Labels for the cells that drill down to data pickers.
    static String kColorSchemeCellLabel = "Color scheme";
    static String kStyleCellLabel = "Style";
    static String kAppActivitiesCellLabel = "App activity types";

    // Strings for Alert Views.
    static String kSignOutAlertViewTitle = "Warning";
    static String kSignOutAlertViewMessage =
    "Modifying this element will sign you out of G+. Are you sure you wish to continue?";
    static String kSignOutAlertCancelTitle = "Cancel";
    static String kSignOutAlertConfirmTitle = "Continue";

    // Accessibility Identifiers.
    static String kCredentialsButtonAccessibilityIdentifier = "Credentials";

    // This is an array of arrays, each one corresponding to the cell
    // labels for its respective section.
    String[][] sectionCellLabels;

    // These sets contain the labels corresponding to cells that have various
    // types (each cell either drills down to another table view, contains an
    // in-cell switch, or contains a slider).
    String[] drillDownCells;
    String[] switchCells;
    String[] sliderCells;

    // States storing the current set of selected elements for each data picker.
    DataPickerState colorSchemeState;
    DataPickerState styleState;
    DataPickerState appActivitiesState;

    // Map that keeps track of which cell corresponds to which DataPickerState.
    Map<String, DataPickerState> drilldownCellState;

    NSData avatarData = null;

    private ActionBlock confirmActionBlock;
    private ActionBlock cancelActionBlock;

    UISlider signInButtonWidthSlider;

    @Owned
    @Selector("alloc")
    public static native SignInViewController alloc();

    @Selector("init")
    public native SignInViewController init();

    protected SignInViewController(Pointer peer) {
        super(peer);
    }

    public void gppInit() {

        sectionCellLabels = new String[][]{
                {kColorSchemeCellLabel, kStyleCellLabel, kButtonWidthCellLabel},
                {kAppActivitiesCellLabel, kGetUserIDCellLabel, kSingleSignOnCellLabel}
        };

        // Groupings of cell types.
        drillDownCells = new String[]{
                kColorSchemeCellLabel,
                kStyleCellLabel,
                kAppActivitiesCellLabel
        };

        switchCells = new String[] { kGetUserIDCellLabel, kSingleSignOnCellLabel };
        sliderCells = new String[] { kButtonWidthCellLabel };

        // Initialize data picker states.
        String dictionaryPath =
        NSBundle.mainBundle().pathForResourceOfType("DataPickerDictionary", "plist");
        NSDictionary configOptionsDict =
        NSDictionary.dictionaryWithContentsOfFile(dictionaryPath);

        NSDictionary colorSchemeDict =
                (NSDictionary) configOptionsDict.objectForKey(kColorSchemeCellLabel);
        NSDictionary styleDict = (NSDictionary) configOptionsDict.objectForKey(kStyleCellLabel);
        NSDictionary appActivitiesDict =
                (NSDictionary) configOptionsDict.objectForKey(kAppActivitiesCellLabel);

        colorSchemeState =
        DataPickerState.alloc().initWithDictionary(colorSchemeDict);
        styleState = DataPickerState.alloc().initWithDictionary(styleDict);
        appActivitiesState =
        DataPickerState.alloc().initWithDictionary(appActivitiesDict);

        drilldownCellState = new HashMap<>();
        drilldownCellState.put(kColorSchemeCellLabel, colorSchemeState);
        drilldownCellState.put(kStyleCellLabel, styleState);
        drilldownCellState.put(kAppActivitiesCellLabel, appActivitiesState);

        // Make sure the GPPSignInButton class is linked in because references from
        // xib file doesn't count.
        GPPSignInButton.alloc().init();

        GPPSignIn signIn = GPPSignIn.sharedInstance();
        signIn.setShouldFetchGooglePlusUser(true);
        signIn.setShouldFetchGoogleUserEmail(true);

        // Sync the current sign-in configurations to match the selected
        // app activities in the app activity picker.
        if (signIn.actions() != null) {
            appActivitiesState.getSelectedCells().clear();

            for (Object o : signIn.actions()) {
                String appActivity = (String) o;
                System.out.println("Action: " + appActivity);
                appActivitiesState.getSelectedCells().add(NSString.alloc().initWithString
                        (appActivity)
                        .lastPathComponent
                        ());
            }
        }

        signIn.setDelegate(this);
    }

    @Override
    public SignInViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil) {
        SignInViewController controller = (SignInViewController) super.initWithNibNameBundle(nibNameOrNil, nibBundleOrNil);
        if (controller != null) {
            gppInit();
        }
        return  controller;
    }

    @Override
    public UITableViewController initWithCoder(NSCoder aDecoder) {
        SignInViewController controller = (SignInViewController) super.initWithCoder(aDecoder);
        if (controller != null) {
            gppInit();
        }
        return  controller;
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        credentialsButton().setAccessibilityIdentifier(kCredentialsButtonAccessibilityIdentifier);
    }

    @Override
    public void viewWillAppear(boolean animated) {
        super.viewWillAppear(animated);
        tableView().reloadData();
        adoptUserSettings();
        GPPSignIn.sharedInstance().trySilentAuthentication();
        reportAuthStatus();
        updateButtons();
    }

    @Override
    @Selector("finishedWithAuth:error:")
    public void finishedWithAuthError(GTMOAuth2Authentication auth, NSError error) {
        if (error != null) {
            signInAuthStatus().setText("Status: Authentication error: " + error.description());
            return;
        }
        reportAuthStatus();
        updateButtons();
    }

    private  void adoptUserSettings() {
        GPPSignIn signIn = GPPSignIn.sharedInstance();

        // There should only be one selected color scheme
        for (String scheme : colorSchemeState.getSelectedCells()) {
            if (scheme.equals("Light")) {
                signInButton().setColorScheme(kGPPSignInButtonColorSchemeLight);
            } else {
                signInButton().setColorScheme(kGPPSignInButtonColorSchemeDark);
            }
        }

        // There should only be one selected style
        for (String style : styleState.getSelectedCells()) {
            int newStyle;
            if (style.equals("Standard")) {
                newStyle = GPPSignInButtonStyle.kGPPSignInButtonStyleStandard;
                if (signInButtonWidthSlider != null) {
                    signInButtonWidthSlider.setEnabled(true);
                }
            } else if (style.equals("Wide")) {
                newStyle = GPPSignInButtonStyle.kGPPSignInButtonStyleWide;
                if (signInButtonWidthSlider != null) {
                    signInButtonWidthSlider.setEnabled(true);
                }
            } else {
                newStyle = kGPPSignInButtonStyleIconOnly;
                if (signInButtonWidthSlider != null) {
                    signInButtonWidthSlider.setEnabled(false);
                }
            }
            if (signInButton().style() != newStyle) {
                signInButton().setStyle(newStyle);
                if (signInButtonWidthSlider != null) {
                    signInButtonWidthSlider.setMinimumValue(minimumButtonWidth());
                }
            }
            if (signInButtonWidthSlider != null) {
                signInButtonWidthSlider.setValue((float) signInButton().frame().size().width());
            }
        }

        // There may be multiple app activity types supported
        NSMutableArray supportedAppActivities = NSMutableArray.alloc().init();
        for (String appActivity : appActivitiesState.getSelectedCells()) {
            NSString schema =
            NSString.alloc().initWithString("http://schemas.google.com/" + appActivity);
            supportedAppActivities.addObject(schema);
        }
        signIn.setActions(supportedAppActivities);
    }

    private float minimumButtonWidth() {
        CGRect frame = signInButton().frame();
        signInButton().setFrame(CGRectMake(0, 0, 0, 0));

        float minimumWidth = (float) signInButton().frame().size().width();
        signInButton().setFrame(frame);

        return minimumWidth;
    }

    private void reportAuthStatus() {
        if (GPPSignIn.sharedInstance().authentication() != null) {
            signInAuthStatus().setText("Status: Authenticated");
        } else {
            // To authenticate, use Google+ sign-in button.
            signInAuthStatus().setText("Status: Not authenticated");
        }
        refreshUserInfo();
    }

    private void refreshUserInfo() {
        if (GPPSignIn.sharedInstance().authentication() == null) {
            userName().setText(kPlaceholderUserName);
            userEmailAddress().setText(kPlaceholderEmailAddress);
            userAvatar().setImage(UIImage.imageNamed(kPlaceholderAvatarImageName));
            return;
        }

        userEmailAddress().setText(GPPSignIn.sharedInstance().userEmail());

        // The googlePlusUser member will be populated only if the appropriate
        // scope is set when signing in.
        GTLPlusPerson person = GPPSignIn.sharedInstance().googlePlusUser();
        if (person == null) {
            return;
        }

        userName().setText(person.displayName());

        // Load avatar image asynchronously, in background
        Globals.dispatch_async(Globals.dispatch_get_global_queue
                (0, 0), new Globals
                        .Block_dispatch_async() {
                    @Override
                    public void call_dispatch_async() {
                        String imageURLString = person.image().url();
                        if (imageURLString != null) {
                            NSURL imageURL = NSURL.URLWithString(imageURLString);
                            avatarData = NSData.dataWithContentsOfURL(imageURL);
                        }

                        if (avatarData != null) {
                            // Update UI from the main thread when available
                            Globals.dispatch_async(Globals.dispatch_get_main_queue(), new Globals.Block_dispatch_async() {
                                @Override
                                public void call_dispatch_async() {
                                    userAvatar().setImage(UIImage.imageWithData(avatarData));
                                }
                            });
                        }
                    }
                }
        );

    }

    private void updateButtons() {
        boolean authenticated = GPPSignIn.sharedInstance().authentication() != null;

        signInButton().setEnabled(!authenticated);
        signOutButton().setEnabled(authenticated);
        disconnectButton().setEnabled(authenticated);
        credentialsButton().setHidden(!authenticated);

        if (authenticated) {
            signInButton().setAlpha(0.5);
            signOutButton().setAlpha(1.0);
            disconnectButton().setAlpha(1.0);
        } else {
            signInButton().setAlpha(1.0);
            signOutButton().setAlpha(0.5);
            disconnectButton().setAlpha(0.5);
        }
    }

    private void showSignOutAlertViewWithConfirmationBlock(ActionBlock confirmationBlock,
                                                           ActionBlock cancelBlock) {
        if (GPPSignIn.sharedInstance().authentication() != null) {
            this.confirmActionBlock = confirmationBlock;
            this.cancelActionBlock = cancelBlock;

            UIAlertView alertView = UIAlertView.alloc().init();
            alertView.setDelegate(this);
            alertView.setTitle(kSignOutAlertViewTitle);
            alertView.setMessage(kSignOutAlertViewMessage);
            alertView.addButtonWithTitle(kSignOutAlertConfirmTitle);
            alertView.addButtonWithTitle(kSignOutAlertCancelTitle);
                    /*.initWithTitleMessageDelegateCancelButtonTitleOtherButtonTitles
                            (kSignOutAlertViewTitle, kSignOutAlertViewMessage, this,
                                    kSignOutAlertCancelTitle, kSignOutAlertConfirmTitle, null);*/
            alertView.show();
        }
    }

    @Selector("signOut:")
    @IBAction
    public void signOut() {
        GPPSignIn.sharedInstance().signOut();
        reportAuthStatus();
        updateButtons();
    }

    @Selector("disconnect:")
    @IBAction
    public void disconnect() {
        GPPSignIn.sharedInstance().disconnect();
    }

    @Selector("showAuthInspector:")
    @IBAction
    public void showAuthInspector() {
        AuthInspectorViewController authInspector =
        AuthInspectorViewController.alloc().init();
        navigationController().pushViewControllerAnimated(authInspector, true);
    }

    @Selector("toggleUserID")
    public void toggleUserID(UISwitch sender) {
        if (GPPSignIn.sharedInstance().authentication() != null) {
            showSignOutAlertViewWithConfirmationBlock(new ActionBlock() {
                @Override
                public void clickEvent() {
                    GPPSignIn.sharedInstance().setShouldFetchGoogleUserID(sender.isOn());
                }
            }, new ActionBlock() {
                @Override
                public void clickEvent() {
                    sender.setOnAnimated(!sender.isOn(), true);
                }
            });
        } else {
            GPPSignIn.sharedInstance().setShouldFetchGoogleUserID(sender.isOn());
        }
    }

    @Selector("toggleSingleSignOn")
    public void toggleSingleSignOn(UISwitch sender) {
        GPPSignIn.sharedInstance().setAttemptSSO(sender.isOn());
    }

    @Selector("changeSignInButtonWidth")
    public void changeSignInButtonWidth(UISlider sender) {
        CGRect frame = signInButton().frame();
        frame.size().setWidth(sender.value());
        signInButton().setFrame(frame);
    }

    @Override
    @Selector("alertView:clickedButtonAtIndex:")
    public void alertViewClickedButtonAtIndex(UIAlertView alertView, @NInt long buttonIndex) {
        if (buttonIndex == alertView.cancelButtonIndex()) {
            if (cancelActionBlock != null) {
                cancelActionBlock.clickEvent();
            }
        } else {
            if (confirmActionBlock != null) {
                confirmActionBlock.clickEvent();
                refreshUserInfo();
                updateButtons();
            }
        }

        cancelActionBlock = null;
        confirmActionBlock = null;
    }

    @Override
    public long numberOfSectionsInTableView(UITableView tableView) {
        return sectionCellLabels.length;
    }

    @Override
    public long tableViewNumberOfRowsInSection(UITableView tableView, @NInt long section) {
        return sectionCellLabels[(int) section].length;
    }

    @Override
    public String tableViewTitleForHeaderInSection(UITableView tableView, @NInt long section) {
        if (section == 0) {
            return "Sign-in Button Configuration";
        } else if (section == 1) {
            return "Other Configurations";
        } else {
            return null;
        }
    }

    @Override
    public boolean tableViewShouldHighlightRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        String label = sectionCellLabels[(int) indexPath.section()][(int) indexPath.row()];
        if (containArray(drillDownCells, label)) {
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

        String label = sectionCellLabels[(int) indexPath.section()][(int) indexPath.row()];
        UITableViewCell cell;
        String identifier = "";

        if (containArray(drillDownCells, label)) {
            identifier = kDrilldownCell;
        } else if (containArray(switchCells, label)) {
            identifier = kSwitchCell;
        } else if (containArray(sliderCells, label)) {
            identifier = kSliderCell;
        }

        cell = tableView.dequeueReusableCellWithIdentifier(identifier);

        if (cell == null) {
            cell = UITableViewCell.alloc().initWithStyleReuseIdentifier
                    (UITableViewCellStyle.Value1, identifier);
        }
        // Assign accessibility labels to each cell row.
        cell.setAccessibilityLabel(label);

        if (identifier.equals(kDrilldownCell)) {
            cell.setAccessoryType(UITableViewCellAccessoryType.DisclosureIndicator);
            DataPickerState dataState = drilldownCellState.get(label);
            if (dataState.multipleSelectEnabled) {
                cell.detailTextLabel().setText("");
            } else {
                cell.detailTextLabel().setText(dataState.getSelectedCells().get(0));
            }
            cell.setAccessibilityValue(cell.detailTextLabel().text());
        } else if (identifier.equals(kSwitchCell)) {
            UISwitch toggle = UISwitch.alloc().initWithFrame(CGRectMake(0, 0, 0, 0));

            if (label.equals(kGetUserIDCellLabel)) {
                toggle.addTargetActionForControlEvents(this, new SEL("toggleUserID"),
                        UIControlEvents.ValueChanged);
                toggle.setOn(GPPSignIn.sharedInstance().shouldFetchGoogleUserID());
            } else if (label.equals(kSingleSignOnCellLabel)) {
                toggle.addTargetActionForControlEvents(this, new SEL("toggleSingleSignOn"),
                        UIControlEvents.ValueChanged);
                toggle.setOn(GPPSignIn.sharedInstance().attemptSSO());
            }
            toggle.setAccessibilityLabel(cell.accessibilityLabel() + " Switch");
            cell.setAccessoryView(toggle);
        } else if (identifier.equals(kSliderCell)) {
            UISlider slider =
            UISlider.alloc().initWithFrame(CGRectMake(0, 0, 150, 0));
            slider.setMinimumValue(minimumButtonWidth());
            slider.setMaximumValue(268.0f);
            slider.setValue((float) signInButton().frame().size().width());
            slider.setEnabled(signInButton().style() != kGPPSignInButtonStyleIconOnly);

            slider.addTargetActionForControlEvents(this, new SEL("changeSignInButtonWidth"),
                    UIControlEvents.ValueChanged);
            cell.setAccessoryView(slider);
            slider.setAccessibilityIdentifier(label + " Slider");
            signInButtonWidthSlider = slider;
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
        DataPickerViewController.alloc().initWithNibNameBundleDateState(null, null, dataState);
        dataPicker.navigationItem().setTitle(label);

        // Force the back button title to be 'Back'
        UIBarButtonItem newBackButton =
        UIBarButtonItem.alloc().initWithTitleStyleTargetAction("Back", UIBarButtonItemStyle
                .Bordered, null, null);
        navigationItem().setBackBarButtonItem(newBackButton);

        if (GPPSignIn.sharedInstance().authentication() != null &&
        label.equals(kAppActivitiesCellLabel)) {
            showSignOutAlertViewWithConfirmationBlock(new ActionBlock() {
                @Override
                public void clickEvent() {
                    navigationController().pushViewControllerAnimated(dataPicker, true);
                }
            }, null);
        } else {
            navigationController().pushViewControllerAnimated(dataPicker, true);
        }
    }

    @Selector("credentialsButton")
    @Property
    public native UIButton credentialsButton();

    @Selector("signInButton")
    @Property
    public native GPPSignInButton signInButton();

    @Selector("signInAuthStatus")
    @Property
    public native UILabel signInAuthStatus();

    @Selector("userName")
    @Property
    public native UILabel userName();

    @Selector("userEmailAddress")
    @Property
    public native UILabel userEmailAddress();

    @Selector("userAvatar")
    @Property
    public native UIImageView userAvatar();

    @Selector("signOutButton")
    @Property
    public native UIButton signOutButton();

    @Selector("disconnectButton")
    @Property
    public native UIButton disconnectButton();

    public interface ActionBlock {
        void clickEvent();
    }

    private boolean containArray(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
