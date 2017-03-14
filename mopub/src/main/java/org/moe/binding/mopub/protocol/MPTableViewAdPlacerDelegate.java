package org.moe.binding.mopub.protocol;


import org.moe.binding.mopub.MPTableViewAdPlacer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPTableViewAdPlacerDelegate")
public interface MPTableViewAdPlacerDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdDidDismissModalForTableViewAdPlacer:")
	default void nativeAdDidDismissModalForTableViewAdPlacer(
			MPTableViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillLeaveApplicationFromTableViewAdPlacer:")
	default void nativeAdWillLeaveApplicationFromTableViewAdPlacer(
			MPTableViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillPresentModalForTableViewAdPlacer:")
	default void nativeAdWillPresentModalForTableViewAdPlacer(
			MPTableViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}
}