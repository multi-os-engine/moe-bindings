package org.moe.binding.googleplus.protocol;


import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GooglePlus")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPPShareDelegate")
public interface GPPShareDelegate {
	@Generated
	@IsOptional
	@Selector("finishedSharing:")
	default void finishedSharing(boolean shared) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("finishedSharingWithError:")
	default void finishedSharingWithError(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}
}