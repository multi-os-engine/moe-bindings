package org.moe.binding.mopub.protocol;


import apple.foundation.NSError;
import org.moe.binding.mopub.MPNativeAd;
import org.moe.binding.mopub.MPNativeCustomEvent;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeCustomEventDelegate")
public interface MPNativeCustomEventDelegate {
	@Generated
	@Selector("nativeCustomEvent:didFailToLoadAdWithError:")
	void nativeCustomEventDidFailToLoadAdWithError(MPNativeCustomEvent event,
			NSError error);

	@Generated
	@Selector("nativeCustomEvent:didLoadAd:")
	void nativeCustomEventDidLoadAd(MPNativeCustomEvent event,
			MPNativeAd adObject);
}