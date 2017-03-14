package com.migeran.moe.ui;

import org.moe.binding.crashlytics.Crashlytics;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.coregraphics.c.CoreGraphics;
import apple.uikit.UIButton;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;
import apple.uikit.enums.UIButtonType;
import apple.uikit.enums.UIControlEvents;
import apple.uikit.enums.UIControlState;

import static apple.coregraphics.c.CoreGraphics.CGRectMake;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
public class AppViewController extends UIViewController {

    @Owned
    @Selector("alloc")
    public static native AppViewController alloc();

    @Selector("init")
    public native AppViewController init();

    protected AppViewController(Pointer peer) {
        super(peer);
    }

    private UIButton button;

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        button = UIButton.buttonWithType(UIButtonType.RoundedRect);
        button.setFrame(CGRectMake(20, 50, 100, 30));
        button.setTitleForState("Crash", UIControlState.Normal);
        button.addTargetActionForControlEvents(this, new SEL("crashButtonTapped"), UIControlEvents
                .TouchUpInside);
        view().addSubview(button);
    }

    @Selector("crashButtonTapped")
    public void crashButtonTapped() {
        Crashlytics.sharedInstance().crash();
    }
}
