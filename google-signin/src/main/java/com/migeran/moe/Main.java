package com.migeran.moe;

import com.migeran.moe.ui.SignInViewController;

import org.moe.binding.googlesignin.GIDSignIn;
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

    private static final String kClientID =
            "550783450168-9hhtduug5et57qj4ha6lo7itf1p3p3hf.apps.googleusercontent.com";

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
        // Set app's client ID for |GIDSignIn|.
        GIDSignIn.sharedInstance().setClientID(kClientID);

        this.window = UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
        SignInViewController signInViewController = SignInViewController.alloc()
                .initWithNibNameBundle("SignInViewController", null);
        this.navigationController = UINavigationController.alloc().initWithRootViewController
                (signInViewController);
        window().setRootViewController(navigationController);
        window().makeKeyAndVisible();
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
        return GIDSignIn.sharedInstance().handleURLSourceApplicationAnnotation(url,
                sourceApplication, annotation);
    }
}
