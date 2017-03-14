package org.moe.binding.mopub.protocol;


import apple.foundation.NSDictionary;
import apple.foundation.NSURL;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdAdapter")
public interface MPNativeAdAdapter {
	@Generated
	@Selector("defaultActionURL")
	NSURL defaultActionURL();

	@Generated
	@IsOptional
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	default Object delegate() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("displayContentForDAAIconTap")
	default void displayContentForDAAIconTap() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("displayContentForURL:rootViewController:")
	default void displayContentForURLRootViewController(NSURL URL,
			UIViewController controller) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("enableThirdPartyClickTracking")
	default boolean enableThirdPartyClickTracking() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mainMediaView")
	default UIView mainMediaView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("privacyInformationIconView")
	default UIView privacyInformationIconView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("properties")
	NSDictionary<?, ?> properties();

	@Generated
	@IsOptional
	@Selector("setDelegate:")
	default void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("trackClick")
	default void trackClick() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willAttachToView:")
	default void willAttachToView(UIView view) {
		throw new java.lang.UnsupportedOperationException();
	}
}