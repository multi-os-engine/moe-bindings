package com.migeran.moe.ui;

import org.moe.binding.firebaseanalytics.FIRAnalytics;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.foundation.NSMutableDictionary;
import apple.uikit.UIButton;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
public class AppViewController extends UIViewController {

    static String kFIREventSelectContent = "select_content";
    static String kFIRParameterItemID = "item_id";
    static String kFIRParameterItemName = "item_name";
    static String kFIRParameterContentType = "content_type";

    @Owned
    @Selector("alloc")
    public static native AppViewController alloc();

    @Selector("init")
    public native AppViewController init();

    protected AppViewController(Pointer peer) {
        super(peer);
    }

    @Override
    public void viewDidAppear(boolean animated) {
        super.viewDidAppear(animated);

        setTitle("Test Analytics");

        recordScreenView();

        // [START custom_event_objc]
        NSMutableDictionary dictionary = NSMutableDictionary.alloc().init();
        dictionary.put(kFIRParameterItemID, "id-" + title());
        dictionary.put(kFIRParameterItemName, title());
        dictionary.put(kFIRParameterContentType, "image");

        FIRAnalytics.logEventWithNameParameters(kFIREventSelectContent, dictionary);
        // [END custom_event_objc]
    }

    private void recordScreenView() {
        // These strings must be <= 36 characters long in order for setScreenName:screenClass: to succeed.
        String screenName = title();
        String screenClass = classForCoder().toString();

        // [START set_current_screen]
        FIRAnalytics.setScreenNameScreenClass(screenName, screenClass);
        // [END set_current_screen]
    }
}
