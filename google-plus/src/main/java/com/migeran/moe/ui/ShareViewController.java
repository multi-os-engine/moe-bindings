package com.migeran.moe.ui;

import org.moe.binding.googleplus.protocol.GPPShareDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import apple.uikit.UITableViewController;
import apple.uikit.protocol.UIImagePickerControllerDelegate;
import apple.uikit.protocol.UINavigationControllerDelegate;
import apple.uikit.protocol.UITextViewDelegate;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("ShareViewController")
@RegisterOnStartup
public class ShareViewController extends UITableViewController implements UITextViewDelegate,
        GPPShareDelegate,
        UINavigationControllerDelegate,
        UIImagePickerControllerDelegate {

    static String kCellTypeEditable = "editable";
    static String kCellTypeSwitch = "switch";
    static String kCellTypeDrilldown = "drilldown";

    static String kAddURLLabel = "Add URL attachment";
    static String kAddCallToActionLabel = "Add call-to-action";
    static String kAddDeepLinkLabel = "Add deep link";
    static String kAddMediaLabel = "Add media";

    static String kPrefillAudiencesDrilldownLabel = "Pre-fill audiences";
    static String kCallToActionLabelDrilldownLabel = "Label";
    static String kAttachAssetFromLibraryDrilldownLabel = "Attach asset from library";
    static String kAttachAssetFromBundleDrilldownLabel = "Attach asset from bundle";

    @Owned
    @Selector("alloc")
    public static native ShareViewController alloc();

    @Selector("init")
    public native ShareViewController init();

    protected ShareViewController(Pointer peer) {
        super(peer);
    }
}
