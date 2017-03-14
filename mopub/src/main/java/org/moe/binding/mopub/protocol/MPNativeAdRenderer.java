package org.moe.binding.mopub.protocol;


import apple.coregraphics.struct.CGSize;
import apple.foundation.NSError;
import apple.uikit.UIView;
import org.moe.binding.mopub.MPNativeAdRendererConfiguration;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdRenderer")
public interface MPNativeAdRenderer {
	@Generated
	@IsOptional
	@Selector("adViewWillMoveToSuperview:")
	default void adViewWillMoveToSuperview(UIView superview) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("initWithRendererSettings:")
	@MappedReturn(ObjCObjectMapper.class)
	Object initWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) Object rendererSettings);

	@Generated
	@IsOptional
	@Selector("nativeAdTapped")
	default void nativeAdTapped() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("rendererConfigurationWithRendererSettings:")
	@ProtocolClassMethod("rendererConfigurationWithRendererSettings")
	MPNativeAdRendererConfiguration _rendererConfigurationWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) Object rendererSettings);

	@Generated
	@Selector("retrieveViewWithAdapter:error:")
	UIView retrieveViewWithAdapterError(
			@Mapped(ObjCObjectMapper.class) Object adapter,
			@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

	@Generated
	@IsOptional
	@Selector("viewSizeHandler")
	@ObjCBlock(name = "call_viewSizeHandler_ret")
	default Block_viewSizeHandler_ret viewSizeHandler() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_viewSizeHandler_ret {
		@Generated
		@ByValue
		CGSize call_viewSizeHandler_ret(@NFloat double arg0);
	}
}