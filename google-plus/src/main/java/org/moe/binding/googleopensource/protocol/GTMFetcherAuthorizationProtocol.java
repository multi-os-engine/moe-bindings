package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSError;
import apple.foundation.NSMutableURLRequest;
import apple.foundation.NSURLRequest;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTMFetcherAuthorizationProtocol")
public interface GTMFetcherAuthorizationProtocol {
	@Generated
	@IsOptional
	@Selector("authorizeRequest:completionHandler:")
	default void authorizeRequestCompletionHandler(
			NSMutableURLRequest request,
			@ObjCBlock(name = "call_authorizeRequestCompletionHandler") Block_authorizeRequestCompletionHandler handler) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_authorizeRequestCompletionHandler {
		@Generated
		void call_authorizeRequestCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("authorizeRequest:delegate:didFinishSelector:")
	void authorizeRequestDelegateDidFinishSelector(NSMutableURLRequest request,
			@Mapped(ObjCObjectMapper.class) Object delegate, SEL sel);

	@Generated
	@IsOptional
	@Selector("canAuthorize")
	default boolean canAuthorize() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("fetcherService")
	@MappedReturn(ObjCObjectMapper.class)
	default Object fetcherService() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("isAuthorizedRequest:")
	boolean isAuthorizedRequest(NSURLRequest request);

	@Generated
	@Selector("isAuthorizingRequest:")
	boolean isAuthorizingRequest(NSURLRequest request);

	@Generated
	@IsOptional
	@Selector("primeForRefresh")
	default boolean primeForRefresh() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("setFetcherService:")
	default void setFetcherService(@Mapped(ObjCObjectMapper.class) Object value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("setShouldAuthorizeAllRequests:")
	default void setShouldAuthorizeAllRequests(boolean value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("shouldAuthorizeAllRequests")
	default boolean shouldAuthorizeAllRequests() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("stopAuthorization")
	void stopAuthorization();

	@Generated
	@Selector("stopAuthorizationForRequest:")
	void stopAuthorizationForRequest(NSURLRequest request);

	@Generated
	@Selector("userEmail")
	String userEmail();
}