package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSNumber;
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
@ObjCProtocolName("GTLQueryCollectionProtocol")
public interface GTLQueryCollectionProtocol {
	@Generated
	@IsOptional
	@Selector("pageToken")
	default String pageToken() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("setPageToken:")
	default void setPageToken(String value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("setStartIndex:")
	default void setStartIndex(NSNumber value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("startIndex")
	default NSNumber startIndex() {
		throw new java.lang.UnsupportedOperationException();
	}
}