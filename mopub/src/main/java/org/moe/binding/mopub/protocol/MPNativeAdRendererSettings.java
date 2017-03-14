package org.moe.binding.mopub.protocol;


import apple.coregraphics.struct.CGSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdRendererSettings")
public interface MPNativeAdRendererSettings {
	@Generated
	@IsOptional
	@Selector("setViewSizeHandler:")
	default void setViewSizeHandler(
			@ObjCBlock(name = "call_setViewSizeHandler") Block_setViewSizeHandler value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setViewSizeHandler {
		@Generated
		@ByValue
		CGSize call_setViewSizeHandler(@NFloat double arg0);
	}

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