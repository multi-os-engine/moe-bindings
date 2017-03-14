package com.migeran.moe.ui;

import org.moe.binding.googlesignin.GIDSignIn;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import java.util.Vector;

import apple.NSObject;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSBundle;
import apple.foundation.NSIndexPath;
import apple.foundation.NSString;
import apple.uikit.UIFont;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewHeaderFooterView;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import apple.uikit.enums.UITableViewCellSelectionStyle;
import apple.uikit.enums.UITableViewCellStyle;
import apple.uikit.enums.UITableViewStyle;
import apple.uikit.protocol.UITableViewDataSource;
import apple.uikit.protocol.UITableViewDelegate;

import static apple.coregraphics.c.CoreGraphics.CGSizeMake;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AuthInspectorViewController")
@RegisterOnStartup
public class AuthInspectorViewController extends UIViewController implements UITableViewDataSource, UITableViewDelegate {

    private String kReusableCellIdentifier = "AuthInspectorCell";
    private float kVeryTallConstraint = 10000.f;
    private float kTableViewCellFontSize = 16.f;
    private float kTableViewCellPadding = 22.f;
    private Vector<String> keyPaths;

    @Owned
    @Selector("alloc")
    public static native AuthInspectorViewController alloc();

    @Selector("init")
    public native AuthInspectorViewController init();

    protected AuthInspectorViewController(Pointer peer) {
        super(peer);
    }

    @Override
    public AuthInspectorViewController initWithNibNameBundle(String s, NSBundle nsBundle) {
        AuthInspectorViewController controller = (AuthInspectorViewController) super.initWithNibNameBundle(s, nsBundle);
        this.keyPaths = new Vector<>();
        keyPaths.add("authentication.accessToken");
        keyPaths.add("authentication.accessTokenExpirationDate");
        keyPaths.add("authentication.refreshToken");
        keyPaths.add("authentication.idToken");
        keyPaths.add("accessibleScopes");
        keyPaths.add("userID");
        keyPaths.add("serverAuthCode");
        keyPaths.add("profile.email");
        keyPaths.add("profile.name");
        return controller;
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        UITableView tableView = UITableView.alloc().initWithFrameStyle(CoreGraphics.CGRectZero(),
                UITableViewStyle.Grouped);
        tableView.setDelegate(this);
        tableView.setDataSource(this);
        tableView.setFrame(view().bounds());
        view().addSubview(tableView);
    }

    @Override
    public void viewDidLayoutSubviews() {
        if (view().subviews().count() > 0) {
            view().subviews().get(0).setFrame(view().bounds());
        }
    }

    @Override
    public long numberOfSectionsInTableView(UITableView tableView) {
        return keyPaths.size();
    }

    @Override
    public String tableViewTitleForHeaderInSection(UITableView tableView, @NInt long section) {
        return contentForSectionHeader((int) section);
    }

    @Override
    public long tableViewNumberOfRowsInSection(UITableView uiTableView, @NInt long l) {
        return 1;
    }

    @Override
    public UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        UITableViewCell cell = tableView.dequeueReusableCellWithIdentifier(kReusableCellIdentifier);
        if (cell == null) {
            cell = UITableViewCell.alloc().initWithStyleReuseIdentifier(UITableViewCellStyle
                    .Default, kReusableCellIdentifier);
        }
        cell.textLabel().setFont(UIFont.systemFontOfSize(kTableViewCellFontSize));
        cell.textLabel().setNumberOfLines(0);
        cell.textLabel().setText(contentForRowAtIndexPath(indexPath));
        cell.setSelectionStyle(UITableViewCellSelectionStyle.None);

        return cell;
    }

    @Override
    public void tableViewWillDisplayHeaderViewForSection(UITableView tableView, UIView view, @NInt long section) {
        if (view instanceof UITableViewHeaderFooterView) {
            ((UITableViewHeaderFooterView)view).textLabel().setText
                    (contentForSectionHeader((int) section));
        }
    }

    @Override
    public double tableViewHeightForHeaderInSection(UITableView tableView, @NInt long section) {
        return heightForTableView(tableView, contentForSectionHeader((int) section))
        - (section == 0 ? kTableViewCellPadding : 0);
    }

    @Override
    public double tableViewHeightForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        return heightForTableView(tableView, contentForRowAtIndexPath(indexPath));
    }

    private String contentForSectionHeader(int section) {
        return keyPaths.get(section);
    }

    private String contentForRowAtIndexPath(NSIndexPath indexPath) {
        String keyPath = keyPaths.get((int) indexPath.section());
        Object o = GIDSignIn.sharedInstance().currentUser().valueForKeyPath(keyPath);
        if (o == null) {
            return "";
        }
        if (o instanceof NSObject) {
            return ((NSObject)o).description();
        }
        return (String) o;
    }

    private float heightForTableView(UITableView tableView, String s) {
        NSString content = NSString.alloc().initWithString(s);
        CGSize constraintSize =
                CGSizeMake(tableView.frame().size().width() - 2 * kTableViewCellPadding,
                        kVeryTallConstraint);
        CGSize size;
        UIFont font = UIFont.systemFontOfSize(kTableViewCellFontSize);
        size = content.sizeWithFontConstrainedToSize(font, constraintSize);
        return (float) (size.height() + kTableViewCellPadding);
    }
}
