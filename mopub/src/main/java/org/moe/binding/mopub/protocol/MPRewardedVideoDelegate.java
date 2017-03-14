package org.moe.binding.mopub.protocol;


import apple.foundation.NSError;
import org.moe.binding.mopub.MPRewardedVideoReward;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPRewardedVideoDelegate")
public interface MPRewardedVideoDelegate {
	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidAppearForAdUnitID:")
	default void rewardedVideoAdDidAppearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidDisappearForAdUnitID:")
	default void rewardedVideoAdDidDisappearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidExpireForAdUnitID:")
	default void rewardedVideoAdDidExpireForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidFailToLoadForAdUnitID:error:")
	default void rewardedVideoAdDidFailToLoadForAdUnitIDError(String adUnitID,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidFailToPlayForAdUnitID:error:")
	default void rewardedVideoAdDidFailToPlayForAdUnitIDError(String adUnitID,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidLoadForAdUnitID:")
	default void rewardedVideoAdDidLoadForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidReceiveTapEventForAdUnitID:")
	default void rewardedVideoAdDidReceiveTapEventForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdShouldRewardForAdUnitID:reward:")
	default void rewardedVideoAdShouldRewardForAdUnitIDReward(String adUnitID,
			MPRewardedVideoReward reward) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdWillAppearForAdUnitID:")
	default void rewardedVideoAdWillAppearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdWillDisappearForAdUnitID:")
	default void rewardedVideoAdWillDisappearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdWillLeaveApplicationForAdUnitID:")
	default void rewardedVideoAdWillLeaveApplicationForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}
}