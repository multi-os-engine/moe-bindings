package org.moe.binding.mopub.protocol;


import apple.corelocation.CLLocation;
import apple.foundation.NSError;
import org.moe.binding.mopub.MPInterstitialCustomEvent;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPInterstitialCustomEventDelegate")
public interface MPInterstitialCustomEventDelegate {
	@Generated
	@Selector("interstitialCustomEvent:didFailToLoadAdWithError:")
	void interstitialCustomEventDidFailToLoadAdWithError(
			MPInterstitialCustomEvent customEvent, NSError error);

	@Generated
	@Selector("interstitialCustomEvent:didLoadAd:")
	void interstitialCustomEventDidLoadAd(
			MPInterstitialCustomEvent customEvent,
			@Mapped(ObjCObjectMapper.class) Object ad);

	@Generated
	@Selector("interstitialCustomEventDidAppear:")
	void interstitialCustomEventDidAppear(MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidDisappear:")
	void interstitialCustomEventDidDisappear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidExpire:")
	void interstitialCustomEventDidExpire(MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidReceiveTapEvent:")
	void interstitialCustomEventDidReceiveTapEvent(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillAppear:")
	void interstitialCustomEventWillAppear(MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillDisappear:")
	void interstitialCustomEventWillDisappear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillLeaveApplication:")
	void interstitialCustomEventWillLeaveApplication(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("trackClick")
	void trackClick();

	@Generated
	@Selector("trackImpression")
	void trackImpression();
}