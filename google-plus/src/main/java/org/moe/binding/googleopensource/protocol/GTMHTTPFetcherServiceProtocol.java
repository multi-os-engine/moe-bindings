package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSOperationQueue;
import apple.foundation.NSURLRequest;
import org.moe.binding.googleopensource.GTMHTTPFetcher;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTMHTTPFetcherServiceProtocol")
public interface GTMHTTPFetcherServiceProtocol {
	@Generated
	@Selector("delegateQueue")
	NSOperationQueue delegateQueue();

	@Generated
	@Selector("fetcherDidStop:")
	void fetcherDidStop(GTMHTTPFetcher fetcher);

	@Generated
	@Selector("fetcherShouldBeginFetching:")
	boolean fetcherShouldBeginFetching(GTMHTTPFetcher fetcher);

	@Generated
	@Selector("fetcherWithRequest:")
	GTMHTTPFetcher fetcherWithRequest(NSURLRequest request);

	@Generated
	@Selector("isDelayingFetcher:")
	boolean isDelayingFetcher(GTMHTTPFetcher fetcher);

	@Generated
	@Selector("setDelegateQueue:")
	void setDelegateQueue(NSOperationQueue value);
}