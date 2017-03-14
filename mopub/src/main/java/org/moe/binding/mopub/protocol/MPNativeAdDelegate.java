package org.moe.binding.mopub.protocol;


import apple.uikit.UIViewController;
import org.moe.binding.mopub.MPNativeAd;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdDelegate")
public interface MPNativeAdDelegate {
	@Generated
	@IsOptional
	@Selector("didDismissModalForNativeAd:")
	default void didDismissModalForNativeAd(MPNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();

	@Generated
	@IsOptional
	@Selector("willLeaveApplicationFromNativeAd:")
	default void willLeaveApplicationFromNativeAd(MPNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willPresentModalForNativeAd:")
	default void willPresentModalForNativeAd(MPNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}
}