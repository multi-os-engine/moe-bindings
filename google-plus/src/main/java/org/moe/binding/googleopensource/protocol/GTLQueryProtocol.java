package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSDictionary;
import apple.foundation.protocol.NSCopying;
import org.moe.binding.googleopensource.GTLUploadParameters;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTLQueryProtocol")
public interface GTLQueryProtocol extends NSCopying {
	@Generated
	@Selector("additionalHTTPHeaders")
	NSDictionary<?, ?> additionalHTTPHeaders();

	@Generated
	@Selector("executionDidStop")
	void executionDidStop();

	@Generated
	@Selector("isBatchQuery")
	boolean isBatchQuery();

	@Generated
	@Selector("shouldSkipAuthorization")
	boolean shouldSkipAuthorization();

	@Generated
	@Selector("uploadParameters")
	GTLUploadParameters uploadParameters();

	@Generated
	@Selector("urlQueryParameters")
	NSDictionary<?, ?> urlQueryParameters();
}