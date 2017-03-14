package com.migeran.moe.ui;

import org.moe.binding.googleplus.GPPSignIn;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import apple.foundation.NSBundle;
import apple.foundation.NSIndexPath;
import apple.uikit.UIColor;
import apple.uikit.UIDevice;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewController;
import apple.uikit.UIViewController;
import apple.uikit.enums.UIInterfaceOrientationMask;
import apple.uikit.enums.UITableViewCellAccessoryType;
import apple.uikit.enums.UITableViewCellSelectionStyle;
import apple.uikit.enums.UITableViewCellStyle;
import apple.uikit.enums.UIUserInterfaceIdiom;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("MasterViewController")
@RegisterOnStartup
public class MasterViewController extends UITableViewController {

    private static int kNumViewControllers = 4;

    static String[] kMenuOptions = new String[]{
            "Sign in"/*, "Share", "People", "App Activities"*/};

    private static String[] kUnselectableMenuOptions = new String[]{
            null, null, "Sign in to list people", "Sign in to edit app activities"};

    static String[] kNibNames = new String[]{
            "SignInViewController",
            "ShareViewController",
            "ListPeopleViewController",
            "MomentsViewController"};

    @Owned
    @Selector("alloc")
    public static native MasterViewController alloc();

    @Selector("init")
    public native MasterViewController init();

    protected MasterViewController(Pointer peer) {
        super(peer);
    }

    @Override
    public MasterViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil) {
        MasterViewController controller = (MasterViewController) super.initWithNibNameBundle(nibNameOrNil, nibBundleOrNil);
        if (controller != null) {
            controller.setTitle("Google+ SDK Sample");
        }
        return controller;
    }

    @Override
    public long supportedInterfaceOrientations() {
        if (UIDevice.currentDevice().userInterfaceIdiom() == UIUserInterfaceIdiom.Phone) {
            return UIInterfaceOrientationMask.AllButUpsideDown;
        }
        return UIInterfaceOrientationMask.All;
    }

    @Override
    public void viewWillAppear(boolean animated) {
        super.viewWillAppear(animated);
        tableView().reloadData();
    }

    @Override
    public long numberOfSectionsInTableView(UITableView tableView) {
        return 1;
    }

    @Override
    public long tableViewNumberOfRowsInSection(UITableView tableView, @NInt long section) {
        return /*kNumViewControllers*/ 1;
    }

    @Override
    public UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        boolean selectable = isSelectable(indexPath);
        String kCellIdentifier = selectable ? "Cell" : "GreyCell";
        UITableViewCell cell =
                tableView.dequeueReusableCellWithIdentifier(kCellIdentifier);
        if (cell == null) {
            cell =
                    UITableViewCell.alloc().initWithStyleReuseIdentifier(UITableViewCellStyle.Default,
                            kCellIdentifier);
            if (selectable) {
                cell.setAccessoryType(UITableViewCellAccessoryType.DisclosureIndicator);
            } else {
                cell.setSelectionStyle(UITableViewCellSelectionStyle.None);
                cell.textLabel().setTextColor(UIColor.lightGrayColor());
            }
        }
        cell.textLabel().setText(selectable ? kMenuOptions[(int) indexPath
                .row()] : kUnselectableMenuOptions[(int) indexPath
                .row()]);
        cell.setAccessibilityLabel(cell.textLabel().text());

        return cell;
    }

    @Override
    public void tableViewDidSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        if (!isSelectable(indexPath)) {
            return;
        }

        SignInViewController controller =
                SignInViewController.alloc().initWithNibNameBundle(kNibNames[(int)
                        indexPath.row()], null);
        controller.navigationItem().setTitle(kMenuOptions[(int) indexPath.row()]);

        navigationController().pushViewControllerAnimated(controller, true);
    }

    private boolean isSelectable(NSIndexPath indexPath) {
        if (kUnselectableMenuOptions[(int) indexPath.row()] != null) {
            // To use Google+ app activities, you need to sign in.
            return GPPSignIn.sharedInstance().hasAuthInKeychain();
        }
        return true;
    }
}
