package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSData;
import apple.foundation.NSMutableURLRequest;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTMHTTPFetchHistoryProtocol")
public interface GTMHTTPFetchHistoryProtocol {
	@Generated
	@Selector("cachedDataForRequest:")
	NSData cachedDataForRequest(NSURLRequest request);

	@Generated
	@Selector("cookieStorage")
	@MappedReturn(ObjCObjectMapper.class)
	Object cookieStorage();

	@Generated
	@Selector("removeCachedDataForRequest:")
	void removeCachedDataForRequest(NSURLRequest request);

	@Generated
	@Selector("shouldCacheETaggedData")
	boolean shouldCacheETaggedData();

	@Generated
	@Selector("updateFetchHistoryWithRequest:response:downloadedData:")
	void updateFetchHistoryWithRequestResponseDownloadedData(
			NSURLRequest request, NSURLResponse response, NSData downloadedData);

	@Generated
	@Selector("updateRequest:isHTTPGet:")
	void updateRequestIsHTTPGet(NSMutableURLRequest request, boolean isHTTPGet);
}