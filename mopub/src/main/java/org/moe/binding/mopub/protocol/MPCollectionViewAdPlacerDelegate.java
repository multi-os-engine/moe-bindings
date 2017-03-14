package org.moe.binding.mopub.protocol;


import org.moe.binding.mopub.MPCollectionViewAdPlacer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPCollectionViewAdPlacerDelegate")
public interface MPCollectionViewAdPlacerDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdDidDismissModalForCollectionViewAdPlacer:")
	default void nativeAdDidDismissModalForCollectionViewAdPlacer(
			MPCollectionViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillLeaveApplicationFromCollectionViewAdPlacer:")
	default void nativeAdWillLeaveApplicationFromCollectionViewAdPlacer(
			MPCollectionViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillPresentModalForCollectionViewAdPlacer:")
	default void nativeAdWillPresentModalForCollectionViewAdPlacer(
			MPCollectionViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}
}