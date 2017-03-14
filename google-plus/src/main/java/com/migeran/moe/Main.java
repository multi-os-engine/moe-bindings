package com.migeran.moe;

import com.migeran.moe.ui.MasterViewController;

import org.moe.binding.googleplus.GPPDeepLink;
import org.moe.binding.googleplus.GPPSignIn;
import org.moe.binding.googleplus.GPPURLHandler;
import org.moe.binding.googleplus.protocol.GPPDeepLinkDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import apple.foundation.NSDictionary;
import apple.foundation.NSURL;
import apple.uikit.UIAlertView;
import apple.uikit.UIApplication;
import apple.uikit.UINavigationController;
import apple.uikit.UIResponder;
import apple.uikit.UIScreen;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;

@RegisterOnStartup
public class Main extends UIResponder implements UIApplicationDelegate, GPPDeepLinkDelegate {

    private static final String kClientID =
            "452265719636-qbqmhro0t3j9jip1npl69a3er7biidd2.apps.googleusercontent.com";

    private UINavigationController navigationController;
    ;

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

        GPPSignIn.sharedInstance().setClientID(kClientID);

        this.window = UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
        MasterViewController masterViewController = MasterViewController.alloc()
                .initWithNibNameBundle("MasterViewController", null);
        this.navigationController = UINavigationController.alloc().initWithRootViewController
                (masterViewController);
        window().setRootViewController(navigationController);
        window().makeKeyAndVisible();

        GPPDeepLink.setDelegate(this);
        GPPDeepLink.readDeepLinkAfterInstall();

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

    @Override
    public boolean applicationOpenURLSourceApplicationAnnotation(UIApplication application,
                                                                 NSURL url,
                                                                 String sourceApplication,
                                                                 @Mapped(ObjCObjectMapper.class)
                                                                         Object annotation) {
        return GPPURLHandler.handleURLSourceApplicationAnnotation(url, sourceApplication, annotation);
    }

    @Override
    public void didReceiveDeepLink(GPPDeepLink deepLink) {
        UIAlertView alertView = UIAlertView.alloc()
                .initWithTitleMessageDelegateCancelButtonTitleOtherButtonTitles("Deep-link Data",
                        deepLink.deepLinkID(), null, "OK", null);
    }
}
