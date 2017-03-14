package org.moe.binding.mopub.c;


import apple.coregraphics.struct.CGSize;
import apple.foundation.NSError;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Runtime(CRuntime.class)
public final class Globals {
	static {
		NatJ.register();
	}

	@Generated
	private Globals() {
	}

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForInvalidAdServerResponse(
			@Mapped(ObjCStringMapper.class) String reason);

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForAdUnitWarmingUp();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForNoInventory();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForNetworkConnectionError();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForInvalidImageURL();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForImageDownloadFailure();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForContentDisplayErrorMissingRootController();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForContentDisplayErrorInvalidURL();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForVASTParsingFailure();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForVideoConfigInvalid();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForRenderValueTypeError();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_BANNER_SIZE();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_MEDIUM_RECT_SIZE();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_LEADERBOARD_SIZE();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_WIDE_SKYSCRAPER_SIZE();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kMPRewardedVideoRewardCurrencyTypeUnspecified();

	@Generated
	@CVariable()
	@NInt
	public static native long kMPRewardedVideoRewardCurrencyAmountUnspecified();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MoPubRewardedVideoAdsSDKDomain();

	@Generated
	@CVariable()
	@NFloat
	public static native double kUniversalStarRatingScale();

	@Generated
	@CVariable()
	@NFloat
	public static native double kStarRatingMaxValue();

	@Generated
	@CVariable()
	@NFloat
	public static native double kStarRatingMinValue();

	@Generated
	@CVariable()
	public static native double kDefaultRequiredSecondsForImpression();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTitleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTextKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdIconImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdMainImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdCTATextKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdStarRatingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kVideoConfigKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kVASTVideoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kNativeVideoAdConfigKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdDAAIconImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kDAAIconImageName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kDAAIconTapDestinationURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kImpressionTrackerURLsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kDefaultActionURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kClickTrackerURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kLogEventRequestPropertiesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MoPubNativeAdsSDKDomain();
}