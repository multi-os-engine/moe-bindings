package com.migeran.moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import apple.uikit.UIViewController;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AuthInspectorViewController")
@RegisterOnStartup
public class AuthInspectorViewController extends UIViewController {

    @Owned
    @Selector("alloc")
    public static native AuthInspectorViewController alloc();

    @Selector("init")
    public native AuthInspectorViewController init();

    protected AuthInspectorViewController(Pointer peer) {
        super(peer);
    }
}
