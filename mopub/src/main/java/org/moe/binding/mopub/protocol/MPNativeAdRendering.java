package org.moe.binding.mopub.protocol;


import apple.foundation.NSDictionary;
import apple.foundation.NSNumber;
import apple.uikit.UIImageView;
import apple.uikit.UILabel;
import apple.uikit.UINib;
import apple.uikit.UIView;
import org.moe.binding.mopub.MPNativeAdRenderingImageLoader;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdRendering")
public interface MPNativeAdRendering {
	@Generated
	@IsOptional
	@Selector("layoutCustomAssetsWithProperties:imageLoader:")
	default void layoutCustomAssetsWithPropertiesImageLoader(
			NSDictionary<?, ?> customProperties,
			MPNativeAdRenderingImageLoader imageLoader) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("layoutStarRating:")
	default void layoutStarRating(NSNumber starRating) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeCallToActionTextLabel")
	default UILabel nativeCallToActionTextLabel() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeIconImageView")
	default UIImageView nativeIconImageView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeMainImageView")
	default UIImageView nativeMainImageView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeMainTextLabel")
	default UILabel nativeMainTextLabel() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativePrivacyInformationIconImageView")
	default UIImageView nativePrivacyInformationIconImageView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeTitleTextLabel")
	default UILabel nativeTitleTextLabel() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeVideoView")
	default UIView nativeVideoView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nibForAd")
	@ProtocolClassMethod("nibForAd")
	default UINib _nibForAd() {
		throw new java.lang.UnsupportedOperationException();
	}
}