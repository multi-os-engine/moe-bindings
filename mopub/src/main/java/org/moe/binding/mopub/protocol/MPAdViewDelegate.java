package org.moe.binding.mopub.protocol;


import apple.uikit.UIViewController;
import org.moe.binding.mopub.MPAdView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPAdViewDelegate")
public interface MPAdViewDelegate {
	@Generated
	@IsOptional
	@Selector("adViewDidFailToLoadAd:")
	default void adViewDidFailToLoadAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("adViewDidLoadAd:")
	default void adViewDidLoadAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didDismissModalViewForAd:")
	default void didDismissModalViewForAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();

	@Generated
	@IsOptional
	@Selector("willLeaveApplicationFromAd:")
	default void willLeaveApplicationFromAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willPresentModalViewForAd:")
	default void willPresentModalViewForAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}
}