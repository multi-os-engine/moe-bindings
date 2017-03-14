package org.moe.binding.mopub.protocol;


import org.moe.binding.mopub.MPInterstitialAdController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPInterstitialAdControllerDelegate")
public interface MPInterstitialAdControllerDelegate {
	@Generated
	@IsOptional
	@Selector("interstitialDidAppear:")
	default void interstitialDidAppear(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidDisappear:")
	default void interstitialDidDisappear(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidExpire:")
	default void interstitialDidExpire(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidFailToLoadAd:")
	default void interstitialDidFailToLoadAd(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidLoadAd:")
	default void interstitialDidLoadAd(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidReceiveTapEvent:")
	default void interstitialDidReceiveTapEvent(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialWillAppear:")
	default void interstitialWillAppear(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialWillDisappear:")
	default void interstitialWillDisappear(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}
}