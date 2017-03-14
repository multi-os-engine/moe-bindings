package org.moe.binding.mopub.protocol;


import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdAdapterDelegate")
public interface MPNativeAdAdapterDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdDidClick:")
	default void nativeAdDidClick(
			@Mapped(ObjCObjectMapper.class) Object adAdapter) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("nativeAdDidDismissModalForAdapter:")
	void nativeAdDidDismissModalForAdapter(
			@Mapped(ObjCObjectMapper.class) Object adapter);

	@Generated
	@Selector("nativeAdWillLeaveApplicationFromAdapter:")
	void nativeAdWillLeaveApplicationFromAdapter(
			@Mapped(ObjCObjectMapper.class) Object adapter);

	@Generated
	@IsOptional
	@Selector("nativeAdWillLogImpression:")
	default void nativeAdWillLogImpression(
			@Mapped(ObjCObjectMapper.class) Object adAdapter) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("nativeAdWillPresentModalForAdapter:")
	void nativeAdWillPresentModalForAdapter(
			@Mapped(ObjCObjectMapper.class) Object adapter);

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}