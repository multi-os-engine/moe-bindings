package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableURLRequest;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.binding.googleopensource.protocol.GTLQueryProtocol;
import org.moe.binding.googleopensource.protocol.GTMFetcherAuthorizationProtocol;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GTLService extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLService(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("APIKey")
	public native String APIKey();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("additionalHTTPHeaders")
	public native NSDictionary<?, ?> additionalHTTPHeaders();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLService alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("allowInsecureQueries")
	public native boolean allowInsecureQueries();

	@Generated
	@Selector("apiVersion")
	public native String apiVersion();

	@Generated
	@Selector("authorizer")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMFetcherAuthorizationProtocol authorizer();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("cookieStorageMethod")
	@NInt
	public native long cookieStorageMethod();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("defaultServiceUploadChunkSize")
	@NUInt
	public static native long defaultServiceUploadChunkSize();

	@Generated
	@Selector("delegateQueue")
	public native NSOperationQueue delegateQueue();

	@Generated
	@Selector("deleteResourceURL:ETag:completionHandler:")
	public native GTLServiceTicket deleteResourceURLETagCompletionHandler(
			NSURL destinationURL,
			String etagOrNil,
			@ObjCBlock(name = "call_deleteResourceURLETagCompletionHandler") Block_deleteResourceURLETagCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteResourceURLETagCompletionHandler {
		@Generated
		void call_deleteResourceURLETagCompletionHandler(GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("deleteResourceURL:ETag:delegate:didFinishSelector:")
	public native GTLServiceTicket deleteResourceURLETagDelegateDidFinishSelector(
			NSURL destinationURL, String etagOrNil,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("executeQuery:completionHandler:")
	public native GTLServiceTicket executeQueryCompletionHandler(
			@Mapped(ObjCObjectMapper.class) GTLQueryProtocol query,
			@ObjCBlock(name = "call_executeQueryCompletionHandler") Block_executeQueryCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_executeQueryCompletionHandler {
		@Generated
		void call_executeQueryCompletionHandler(GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("executeQuery:delegate:didFinishSelector:")
	public native GTLServiceTicket executeQueryDelegateDidFinishSelector(
			@Mapped(ObjCObjectMapper.class) GTLQueryProtocol query,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchObjectByInsertingObject:forURL:completionHandler:")
	public native GTLServiceTicket fetchObjectByInsertingObjectForURLCompletionHandler(
			GTLObject bodyToPut,
			NSURL destinationURL,
			@ObjCBlock(name = "call_fetchObjectByInsertingObjectForURLCompletionHandler") Block_fetchObjectByInsertingObjectForURLCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchObjectByInsertingObjectForURLCompletionHandler {
		@Generated
		void call_fetchObjectByInsertingObjectForURLCompletionHandler(
				GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("fetchObjectByInsertingObject:forURL:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchObjectByInsertingObjectForURLDelegateDidFinishSelector(
			GTLObject bodyToPut, NSURL destinationURL,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchObjectByUpdatingObject:forURL:completionHandler:")
	public native GTLServiceTicket fetchObjectByUpdatingObjectForURLCompletionHandler(
			GTLObject bodyToPut,
			NSURL destinationURL,
			@ObjCBlock(name = "call_fetchObjectByUpdatingObjectForURLCompletionHandler") Block_fetchObjectByUpdatingObjectForURLCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchObjectByUpdatingObjectForURLCompletionHandler {
		@Generated
		void call_fetchObjectByUpdatingObjectForURLCompletionHandler(
				GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("fetchObjectByUpdatingObject:forURL:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchObjectByUpdatingObjectForURLDelegateDidFinishSelector(
			GTLObject bodyToPut, NSURL destinationURL,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchObjectWithMethodNamed:insertingObject:objectClass:completionHandler:")
	public native GTLServiceTicket fetchObjectWithMethodNamedInsertingObjectObjectClassCompletionHandler(
			String methodName,
			GTLObject bodyObject,
			Class objectClass,
			@ObjCBlock(name = "call_fetchObjectWithMethodNamedInsertingObjectObjectClassCompletionHandler") Block_fetchObjectWithMethodNamedInsertingObjectObjectClassCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchObjectWithMethodNamedInsertingObjectObjectClassCompletionHandler {
		@Generated
		void call_fetchObjectWithMethodNamedInsertingObjectObjectClassCompletionHandler(
				GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("fetchObjectWithMethodNamed:insertingObject:objectClass:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchObjectWithMethodNamedInsertingObjectObjectClassDelegateDidFinishSelector(
			String methodName, GTLObject bodyObject, Class objectClass,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchObjectWithMethodNamed:parameters:insertingObject:objectClass:completionHandler:")
	public native GTLServiceTicket fetchObjectWithMethodNamedParametersInsertingObjectObjectClassCompletionHandler(
			String methodName,
			NSDictionary<?, ?> parameters,
			GTLObject bodyObject,
			Class objectClass,
			@ObjCBlock(name = "call_fetchObjectWithMethodNamedParametersInsertingObjectObjectClassCompletionHandler") Block_fetchObjectWithMethodNamedParametersInsertingObjectObjectClassCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchObjectWithMethodNamedParametersInsertingObjectObjectClassCompletionHandler {
		@Generated
		void call_fetchObjectWithMethodNamedParametersInsertingObjectObjectClassCompletionHandler(
				GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("fetchObjectWithMethodNamed:parameters:insertingObject:objectClass:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchObjectWithMethodNamedParametersInsertingObjectObjectClassDelegateDidFinishSelector(
			String methodName, NSDictionary<?, ?> parameters,
			GTLObject bodyObject, Class objectClass,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchObjectWithMethodNamed:parameters:objectClass:completionHandler:")
	public native GTLServiceTicket fetchObjectWithMethodNamedParametersObjectClassCompletionHandler(
			String methodName,
			NSDictionary<?, ?> parameters,
			Class objectClass,
			@ObjCBlock(name = "call_fetchObjectWithMethodNamedParametersObjectClassCompletionHandler") Block_fetchObjectWithMethodNamedParametersObjectClassCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchObjectWithMethodNamedParametersObjectClassCompletionHandler {
		@Generated
		void call_fetchObjectWithMethodNamedParametersObjectClassCompletionHandler(
				GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("fetchObjectWithMethodNamed:parameters:objectClass:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchObjectWithMethodNamedParametersObjectClassDelegateDidFinishSelector(
			String methodName, NSDictionary<?, ?> parameters,
			Class objectClass, @Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchObjectWithURL:completionHandler:")
	public native GTLServiceTicket fetchObjectWithURLCompletionHandler(
			NSURL objectURL,
			@ObjCBlock(name = "call_fetchObjectWithURLCompletionHandler") Block_fetchObjectWithURLCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchObjectWithURLCompletionHandler {
		@Generated
		void call_fetchObjectWithURLCompletionHandler(GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("fetchObjectWithURL:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchObjectWithURLDelegateDidFinishSelector(
			NSURL objectURL, @Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchObjectWithURL:objectClass:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchObjectWithURLObjectClassDelegateDidFinishSelector(
			NSURL objectURL, Class objectClass,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetchPublicObjectWithURL:objectClass:delegate:didFinishSelector:")
	public native GTLServiceTicket fetchPublicObjectWithURLObjectClassDelegateDidFinishSelector(
			NSURL objectURL, Class objectClass,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("fetcherService")
	public native GTMHTTPFetcherService fetcherService();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTLService init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isRESTDataWrapperRequired")
	public native boolean isRESTDataWrapperRequired();

	@Generated
	@Selector("isRetryEnabled")
	public native boolean isRetryEnabled();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("maxRetryInterval")
	public native double maxRetryInterval();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("objectRequestForURL:object:ETag:httpMethod:isREST:additionalHeaders:ticket:")
	public native NSMutableURLRequest objectRequestForURLObjectETagHttpMethodIsRESTAdditionalHeadersTicket(
			NSURL url, GTLObject object, String etag, String httpMethod,
			boolean isREST, NSDictionary<?, ?> additionalHeaders,
			GTLServiceTicket ticket);

	@Generated
	@Selector("parseQueue")
	public native NSOperationQueue parseQueue();

	@Generated
	@Selector("requestForURL:ETag:httpMethod:")
	public native NSMutableURLRequest requestForURLETagHttpMethod(NSURL url,
			String etagOrNil, String httpMethodOrNil);

	@Generated
	@Selector("requestUserAgent")
	public native String requestUserAgent();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("retryBlock")
	@ObjCBlock(name = "call_retryBlock_ret")
	public native Block_retryBlock_ret retryBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_retryBlock_ret {
		@Generated
		boolean call_retryBlock_ret(GTLServiceTicket arg0, boolean arg1,
				NSError arg2);
	}

	@Generated
	@Selector("retrySelector")
	public native SEL retrySelector();

	@Generated
	@Selector("rpcURL")
	public native NSURL rpcURL();

	@Generated
	@Selector("rpcUploadURL")
	public native NSURL rpcUploadURL();

	@Generated
	@Selector("runLoopModes")
	public native NSArray<?> runLoopModes();

	@Generated
	@Selector("serviceProperties")
	public native NSDictionary<?, ?> serviceProperties();

	@Generated
	@Selector("servicePropertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object servicePropertyForKey(String key);

	@Generated
	@Selector("serviceUploadChunkSize")
	@NUInt
	public native long serviceUploadChunkSize();

	@Generated
	@Selector("serviceUserData")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object serviceUserData();

	@Generated
	@Selector("setAPIKey:")
	public native void setAPIKey(String value);

	@Generated
	@Selector("setAdditionalHTTPHeaders:")
	public native void setAdditionalHTTPHeaders(NSDictionary<?, ?> value);

	@Generated
	@Selector("setAllowInsecureQueries:")
	public native void setAllowInsecureQueries(boolean value);

	@Generated
	@Selector("setApiVersion:")
	public native void setApiVersion(String value);

	@Generated
	@Selector("setAuthorizer:")
	public native void setAuthorizer(
			@Mapped(ObjCObjectMapper.class) GTMFetcherAuthorizationProtocol value);

	@Generated
	@Selector("setCookieStorageMethod:")
	public native void setCookieStorageMethod(@NInt long value);

	@Generated
	@Selector("setDelegateQueue:")
	public native void setDelegateQueue(NSOperationQueue value);

	@Generated
	@Selector("setFetcherService:")
	public native void setFetcherService(GTMHTTPFetcherService value);

	@Generated
	@Selector("setIsRESTDataWrapperRequired:")
	public native void setIsRESTDataWrapperRequired(boolean value);

	@Generated
	@Selector("setMaxRetryInterval:")
	public native void setMaxRetryInterval(double value);

	@Generated
	@Selector("setParseQueue:")
	public native void setParseQueue(NSOperationQueue value);

	@Generated
	@Selector("setRetryBlock:")
	public native void setRetryBlock(
			@ObjCBlock(name = "call_setRetryBlock") Block_setRetryBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setRetryBlock {
		@Generated
		boolean call_setRetryBlock(GTLServiceTicket arg0, boolean arg1,
				NSError arg2);
	}

	@Generated
	@Selector("setRetryEnabled:")
	public native void setRetryEnabled(boolean value);

	@Generated
	@Selector("setRetrySelector:")
	public native void setRetrySelector(SEL value);

	@Generated
	@Selector("setRpcURL:")
	public native void setRpcURL(NSURL value);

	@Generated
	@Selector("setRpcUploadURL:")
	public native void setRpcUploadURL(NSURL value);

	@Generated
	@Selector("setRunLoopModes:")
	public native void setRunLoopModes(NSArray<?> value);

	@Generated
	@Selector("setServiceProperties:")
	public native void setServiceProperties(NSDictionary<?, ?> value);

	@Generated
	@Selector("setServiceProperty:forKey:")
	public native void setServicePropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

	@Generated
	@Selector("setServiceUploadChunkSize:")
	public native void setServiceUploadChunkSize(@NUInt long value);

	@Generated
	@Selector("setServiceUserData:")
	public native void setServiceUserData(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setShouldFetchInBackground:")
	public native void setShouldFetchInBackground(boolean value);

	@Generated
	@Selector("setShouldFetchNextPages:")
	public native void setShouldFetchNextPages(boolean value);

	@Generated
	@Selector("setSurrogates:")
	public native void setSurrogates(NSDictionary<?, ?> value);

	@Generated
	@Selector("setUploadProgressBlock:")
	public native void setUploadProgressBlock(
			@ObjCBlock(name = "call_setUploadProgressBlock") Block_setUploadProgressBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setUploadProgressBlock {
		@Generated
		void call_setUploadProgressBlock(GTLServiceTicket arg0, long arg1,
				long arg2);
	}

	@Generated
	@Selector("setUploadProgressSelector:")
	public native void setUploadProgressSelector(SEL value);

	@Generated
	@Selector("setUrlQueryParameters:")
	public native void setUrlQueryParameters(NSDictionary<?, ?> value);

	@Generated
	@Selector("setUserAgent:")
	public native void setUserAgent(String value);

	@Generated
	@Selector("setUserAgentAddition:")
	public native void setUserAgentAddition(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldFetchInBackground")
	public native boolean shouldFetchInBackground();

	@Generated
	@Selector("shouldFetchNextPages")
	public native boolean shouldFetchNextPages();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("surrogates")
	public native NSDictionary<?, ?> surrogates();

	@Generated
	@Selector("uploadProgressBlock")
	@ObjCBlock(name = "call_uploadProgressBlock_ret")
	public native Block_uploadProgressBlock_ret uploadProgressBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_uploadProgressBlock_ret {
		@Generated
		void call_uploadProgressBlock_ret(GTLServiceTicket arg0, long arg1,
				long arg2);
	}

	@Generated
	@Selector("uploadProgressSelector")
	public native SEL uploadProgressSelector();

	@Generated
	@Selector("urlQueryParameters")
	public native NSDictionary<?, ?> urlQueryParameters();

	@Generated
	@Selector("userAgent")
	public native String userAgent();

	@Generated
	@Selector("userAgentAddition")
	public native String userAgentAddition();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("waitForTicket:timeout:fetchedObject:error:")
	public native boolean waitForTicketTimeoutFetchedObjectError(
			GTLServiceTicket ticket,
			double timeoutInSeconds,
			@ReferenceInfo(type = GTLObject.class) Ptr<GTLObject> outObjectOrNil,
			@ReferenceInfo(type = NSError.class) Ptr<NSError> outErrorOrNil);
}