package org.moe.binding.mopub.protocol;


import apple.corelocation.CLLocation;
import apple.foundation.NSError;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import org.moe.binding.mopub.MPBannerCustomEvent;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPBannerCustomEventDelegate")
public interface MPBannerCustomEventDelegate {
	@Generated
	@Selector("bannerCustomEvent:didFailToLoadAdWithError:")
	void bannerCustomEventDidFailToLoadAdWithError(MPBannerCustomEvent event,
			NSError error);

	@Generated
	@Selector("bannerCustomEvent:didLoadAd:")
	void bannerCustomEventDidLoadAd(MPBannerCustomEvent event, UIView ad);

	@Generated
	@Selector("bannerCustomEventDidFinishAction:")
	void bannerCustomEventDidFinishAction(MPBannerCustomEvent event);

	@Generated
	@Selector("bannerCustomEventWillBeginAction:")
	void bannerCustomEventWillBeginAction(MPBannerCustomEvent event);

	@Generated
	@Selector("bannerCustomEventWillLeaveApplication:")
	void bannerCustomEventWillLeaveApplication(MPBannerCustomEvent event);

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("trackClick")
	void trackClick();

	@Generated
	@Selector("trackImpression")
	void trackImpression();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}