package org.moe.binding.mopub.protocol;


import apple.foundation.NSError;
import org.moe.binding.mopub.MPRewardedVideoCustomEvent;
import org.moe.binding.mopub.MPRewardedVideoReward;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPRewardedVideoCustomEventDelegate")
public interface MPRewardedVideoCustomEventDelegate {
	@Generated
	@Selector("customerIdForRewardedVideoCustomEvent:")
	String customerIdForRewardedVideoCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("instanceMediationSettingsForClass:")
	@MappedReturn(ObjCObjectMapper.class)
	Object instanceMediationSettingsForClass(Class aClass);

	@Generated
	@Selector("rewardedVideoDidAppearForCustomEvent:")
	void rewardedVideoDidAppearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidDisappearForCustomEvent:")
	void rewardedVideoDidDisappearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidExpireForCustomEvent:")
	void rewardedVideoDidExpireForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidFailToLoadAdForCustomEvent:error:")
	void rewardedVideoDidFailToLoadAdForCustomEventError(
			MPRewardedVideoCustomEvent customEvent, NSError error);

	@Generated
	@Selector("rewardedVideoDidFailToPlayForCustomEvent:error:")
	void rewardedVideoDidFailToPlayForCustomEventError(
			MPRewardedVideoCustomEvent customEvent, NSError error);

	@Generated
	@Selector("rewardedVideoDidLoadAdForCustomEvent:")
	void rewardedVideoDidLoadAdForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidReceiveTapEventForCustomEvent:")
	void rewardedVideoDidReceiveTapEventForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoShouldRewardUserForCustomEvent:reward:")
	void rewardedVideoShouldRewardUserForCustomEventReward(
			MPRewardedVideoCustomEvent customEvent, MPRewardedVideoReward reward);

	@Generated
	@Selector("rewardedVideoWillAppearForCustomEvent:")
	void rewardedVideoWillAppearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoWillDisappearForCustomEvent:")
	void rewardedVideoWillDisappearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoWillLeaveApplicationForCustomEvent:")
	void rewardedVideoWillLeaveApplicationForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("trackClick")
	void trackClick();

	@Generated
	@Selector("trackImpression")
	void trackImpression();
}