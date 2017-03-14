package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTLCollectionProtocol")
public interface GTLCollectionProtocol {
	@Generated
	@IsOptional
	@Selector("items")
	default NSArray<?> items() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("setItems:")
	default void setItems(NSArray<?> value) {
		throw new java.lang.UnsupportedOperationException();
	}
}