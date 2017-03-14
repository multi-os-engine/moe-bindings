package com.migeran.moe;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import apple.foundation.NSDictionary;
import apple.foundation.NSURL;
import apple.uikit.UIApplication;
import apple.uikit.UINavigationController;
import apple.uikit.UIResponder;
import apple.uikit.UIScreen;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;

@RegisterOnStartup
public class Main extends UIResponder implements UIApplicationDelegate {

    private UINavigationController navigationController;;

    public static void main(String[] args) {
        UIKit.UIApplicationMain(0, null, null, Main.class.getName());
    }

    @Selector("alloc")
    public static native Main alloc();

    protected Main(Pointer peer) {
        super(peer);
    }

    private UIWindow window;

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application,
                                                            NSDictionary launchOptions) {
        return true;
    }

    @Override
    public void setWindow(UIWindow value) {
        window = value;
    }

    @Override
    public UIWindow window() {
        return window;
    }

}
