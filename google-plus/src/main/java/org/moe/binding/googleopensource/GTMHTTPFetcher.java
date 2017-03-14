package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSFileHandle;
import apple.foundation.NSInputStream;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSMutableURLRequest;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.foundation.NSThread;
import apple.foundation.NSURL;
import apple.foundation.NSURLCredential;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.binding.googleopensource.protocol.GTMCookieStorageProtocol;
import org.moe.binding.googleopensource.protocol.GTMFetcherAuthorizationProtocol;
import org.moe.binding.googleopensource.protocol.GTMHTTPFetchHistoryProtocol;
import org.moe.binding.googleopensource.protocol.GTMHTTPFetcherServiceProtocol;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
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
public class GTMHTTPFetcher extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMHTTPFetcher(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addPropertiesFromDictionary:")
	public native void addPropertiesFromDictionary(NSDictionary<?, ?> dict);

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMHTTPFetcher alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("allowLocalhostRequest")
	public native boolean allowLocalhostRequest();

	@Generated
	@Selector("allowedInsecureSchemes")
	public native NSArray<?> allowedInsecureSchemes();

	@Generated
	@Selector("authorizer")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMFetcherAuthorizationProtocol authorizer();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("beginFetchWithCompletionHandler:")
	public native boolean beginFetchWithCompletionHandler(
			@ObjCBlock(name = "call_beginFetchWithCompletionHandler") Block_beginFetchWithCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_beginFetchWithCompletionHandler {
		@Generated
		void call_beginFetchWithCompletionHandler(NSData arg0, NSError arg1);
	}

	@Generated
	@Selector("beginFetchWithDelegate:didFinishSelector:")
	public native boolean beginFetchWithDelegateDidFinishSelector(
			@Mapped(ObjCObjectMapper.class) Object delegate, SEL finishedSEL);

	@Generated
	@Selector("bodyData")
	public native NSData bodyData();

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
	@Selector("comment")
	public native String comment();

	@Generated
	@Selector("connectionClass")
	public static native Class connectionClass();

	@Generated
	@Selector("cookieStorageMethod")
	@NInt
	public native long cookieStorageMethod();

	@Generated
	@Selector("credential")
	public native NSURLCredential credential();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("delegateQueue")
	public native NSOperationQueue delegateQueue();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("doesSupportSentDataCallback")
	public static native boolean doesSupportSentDataCallback();

	@Generated
	@Selector("downloadFileHandle")
	public native NSFileHandle downloadFileHandle();

	@Generated
	@Selector("downloadPath")
	public native String downloadPath();

	@Generated
	@Selector("downloadedData")
	public native NSData downloadedData();

	@Generated
	@Selector("downloadedLength")
	public native long downloadedLength();

	@Generated
	@Selector("fetchHistory")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMHTTPFetchHistoryProtocol fetchHistory();

	@Generated
	@Selector("fetcherWithRequest:")
	public static native GTMHTTPFetcher fetcherWithRequest(NSURLRequest request);

	@Generated
	@Selector("fetcherWithURL:")
	public static native GTMHTTPFetcher fetcherWithURL(NSURL requestURL);

	@Generated
	@Selector("fetcherWithURLString:")
	public static native GTMHTTPFetcher fetcherWithURLString(
			String requestURLString);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("htmlFileName")
	public static native String htmlFileName();

	@Generated
	@Selector("init")
	public native GTMHTTPFetcher init();

	@Generated
	@Selector("initWithRequest:")
	public native GTMHTTPFetcher initWithRequest(NSURLRequest request);

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
	@Selector("isFetching")
	public native boolean isFetching();

	@Generated
	@Selector("isLoggingEnabled")
	public static native boolean isLoggingEnabled();

	@Generated
	@Selector("isLoggingToFileEnabled")
	public static native boolean isLoggingToFileEnabled();

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
	@Selector("log")
	public native String log();

	@Generated
	@Selector("logCapturePostStream")
	public native boolean logCapturePostStream();

	@Generated
	@Selector("logFetchWithError:")
	public native void logFetchWithError(NSError error);

	@Generated
	@Selector("logRequestBody")
	public native String logRequestBody();

	@Generated
	@Selector("logResponseBody")
	public native String logResponseBody();

	@Generated
	@Selector("loggingDateStamp")
	public static native String loggingDateStamp();

	@Generated
	@Selector("loggingDirectory")
	public static native String loggingDirectory();

	@Generated
	@Selector("loggingProcessName")
	public static native String loggingProcessName();

	@Generated
	@Selector("maxRetryInterval")
	public native double maxRetryInterval();

	@Generated
	@Selector("minRetryInterval")
	public native double minRetryInterval();

	@Generated
	@Selector("mutableRequest")
	public native NSMutableURLRequest mutableRequest();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("nextRetryInterval")
	public native double nextRetryInterval();

	@Generated
	@Selector("postData")
	public native NSData postData();

	@Generated
	@Selector("postStream")
	public native NSInputStream postStream();

	@Generated
	@Selector("processNameLogPrefix")
	public static native String processNameLogPrefix();

	@Generated
	@Selector("properties")
	public native NSMutableDictionary<?, ?> properties();

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String key);

	@Generated
	@Selector("proxyCredential")
	public native NSURLCredential proxyCredential();

	@Generated
	@Selector("receivedDataBlock")
	@ObjCBlock(name = "call_receivedDataBlock_ret")
	public native Block_receivedDataBlock_ret receivedDataBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_receivedDataBlock_ret {
		@Generated
		void call_receivedDataBlock_ret(NSData arg0);
	}

	@Generated
	@Selector("receivedDataSelector")
	public native SEL receivedDataSelector();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("response")
	public native NSURLResponse response();

	@Generated
	@Selector("responseHeaders")
	public native NSDictionary<?, ?> responseHeaders();

	@Generated
	@Selector("retryBlock")
	@ObjCBlock(name = "call_retryBlock_ret")
	public native Block_retryBlock_ret retryBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_retryBlock_ret {
		@Generated
		boolean call_retryBlock_ret(boolean arg0, NSError arg1);
	}

	@Generated
	@Selector("retryCount")
	@NUInt
	public native long retryCount();

	@Generated
	@Selector("retryFactor")
	public native double retryFactor();

	@Generated
	@Selector("retrySelector")
	public native SEL retrySelector();

	@Generated
	@Selector("runLoopModes")
	public native NSArray<?> runLoopModes();

	@Generated
	@Selector("sentDataBlock")
	@ObjCBlock(name = "call_sentDataBlock_ret")
	public native Block_sentDataBlock_ret sentDataBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sentDataBlock_ret {
		@Generated
		void call_sentDataBlock_ret(@NInt long arg0, @NInt long arg1,
				@NInt long arg2);
	}

	@Generated
	@Selector("sentDataSelector")
	public native SEL sentDataSelector();

	@Generated
	@Selector("service")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMHTTPFetcherServiceProtocol service();

	@Generated
	@Selector("serviceHost")
	public native String serviceHost();

	@Generated
	@Selector("servicePriority")
	@NInt
	public native long servicePriority();

	@Generated
	@Selector("setAllowLocalhostRequest:")
	public native void setAllowLocalhostRequest(boolean value);

	@Generated
	@Selector("setAllowedInsecureSchemes:")
	public native void setAllowedInsecureSchemes(NSArray<?> value);

	@Generated
	@Selector("setAuthorizer:")
	public native void setAuthorizer(
			@Mapped(ObjCObjectMapper.class) GTMFetcherAuthorizationProtocol value);

	@Generated
	@Selector("setBodyData:")
	public native void setBodyData(NSData value);

	@Generated
	@Selector("setComment:")
	public native void setComment(String value);

	@Generated
	@Variadic()
	@Selector("setCommentWithFormat:")
	public native void setCommentWithFormat(String format, Object... varargs);

	@Generated
	@Selector("setConnectionClass:")
	public static native void setConnectionClass(Class theClass);

	@Generated
	@Selector("setCookieStorageMethod:")
	public native void setCookieStorageMethod(@NInt long value);

	@Generated
	@Selector("setCredential:")
	public native void setCredential(NSURLCredential value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setDelegateQueue:")
	public native void setDelegateQueue(NSOperationQueue value);

	@Generated
	@Selector("setDownloadFileHandle:")
	public native void setDownloadFileHandle(NSFileHandle value);

	@Generated
	@Selector("setDownloadPath:")
	public native void setDownloadPath(String value);

	@Generated
	@Selector("setFetchHistory:")
	public native void setFetchHistory(
			@Mapped(ObjCObjectMapper.class) GTMHTTPFetchHistoryProtocol value);

	@Generated
	@Selector("setLog:")
	public native void setLog(String value);

	@Generated
	@Selector("setLogRequestBody:")
	public native void setLogRequestBody(String bodyString);

	@Generated
	@Selector("setLogResponseBody:")
	public native void setLogResponseBody(String bodyString);

	@Generated
	@Selector("setLoggingDateStamp:")
	public static native void setLoggingDateStamp(String str);

	@Generated
	@Selector("setLoggingDirectory:")
	public static native void setLoggingDirectory(String path);

	@Generated
	@Selector("setLoggingEnabled:")
	public static native void setLoggingEnabled(boolean flag);

	@Generated
	@Selector("setLoggingProcessName:")
	public static native void setLoggingProcessName(String str);

	@Generated
	@Selector("setLoggingToFileEnabled:")
	public static native void setLoggingToFileEnabled(boolean flag);

	@Generated
	@Selector("setMaxRetryInterval:")
	public native void setMaxRetryInterval(double value);

	@Generated
	@Selector("setMinRetryInterval:")
	public native void setMinRetryInterval(double value);

	@Generated
	@Selector("setMutableRequest:")
	public native void setMutableRequest(NSMutableURLRequest value);

	@Generated
	@Selector("setPostData:")
	public native void setPostData(NSData value);

	@Generated
	@Selector("setPostStream:")
	public native void setPostStream(NSInputStream value);

	@Generated
	@Selector("setProperties:")
	public native void setProperties(NSMutableDictionary<?, ?> value);

	@Generated
	@Selector("setProperty:forKey:")
	public native void setPropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

	@Generated
	@Selector("setProxyCredential:")
	public native void setProxyCredential(NSURLCredential value);

	@Generated
	@Selector("setReceivedDataBlock:")
	public native void setReceivedDataBlock(
			@ObjCBlock(name = "call_setReceivedDataBlock") Block_setReceivedDataBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setReceivedDataBlock {
		@Generated
		void call_setReceivedDataBlock(NSData arg0);
	}

	@Generated
	@Selector("setReceivedDataSelector:")
	public native void setReceivedDataSelector(SEL value);

	@Generated
	@Selector("setResponse:")
	public native void setResponse(NSURLResponse value);

	@Generated
	@Selector("setRetryBlock:")
	public native void setRetryBlock(
			@ObjCBlock(name = "call_setRetryBlock") Block_setRetryBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setRetryBlock {
		@Generated
		boolean call_setRetryBlock(boolean arg0, NSError arg1);
	}

	@Generated
	@Selector("setRetryEnabled:")
	public native void setRetryEnabled(boolean value);

	@Generated
	@Selector("setRetryFactor:")
	public native void setRetryFactor(double value);

	@Generated
	@Selector("setRetrySelector:")
	public native void setRetrySelector(SEL value);

	@Generated
	@Selector("setRunLoopModes:")
	public native void setRunLoopModes(NSArray<?> value);

	@Generated
	@Selector("setSentDataBlock:")
	public native void setSentDataBlock(
			@ObjCBlock(name = "call_setSentDataBlock") Block_setSentDataBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setSentDataBlock {
		@Generated
		void call_setSentDataBlock(@NInt long arg0, @NInt long arg1,
				@NInt long arg2);
	}

	@Generated
	@Selector("setSentDataSelector:")
	public native void setSentDataSelector(SEL value);

	@Generated
	@Selector("setService:")
	public native void setService(
			@Mapped(ObjCObjectMapper.class) GTMHTTPFetcherServiceProtocol value);

	@Generated
	@Selector("setServiceHost:")
	public native void setServiceHost(String value);

	@Generated
	@Selector("setServicePriority:")
	public native void setServicePriority(@NInt long value);

	@Generated
	@Selector("setShouldDeferResponseBodyLogging:")
	public native void setShouldDeferResponseBodyLogging(boolean flag);

	@Generated
	@Selector("setShouldFetchInBackground:")
	public native void setShouldFetchInBackground(boolean value);

	@Generated
	@Selector("setThread:")
	public native void setThread(NSThread value);

	@Generated
	@Selector("setUserData:")
	public native void setUserData(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldDeferResponseBodyLogging")
	public native boolean shouldDeferResponseBodyLogging();

	@Generated
	@Selector("shouldFetchInBackground")
	public native boolean shouldFetchInBackground();

	@Generated
	@Selector("staticCookieStorage")
	@MappedReturn(ObjCObjectMapper.class)
	public static native GTMCookieStorageProtocol staticCookieStorage();

	@Generated
	@Selector("statusCode")
	@NInt
	public native long statusCode();

	@Generated
	@Selector("stopFetching")
	public native void stopFetching();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("symlinkNameSuffix")
	public static native String symlinkNameSuffix();

	@Generated
	@Selector("thread")
	public native NSThread thread();

	@Generated
	@Selector("ticket")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object ticket();

	@Generated
	@Selector("userData")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object userData();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("waitForCompletionWithTimeout:")
	public native void waitForCompletionWithTimeout(double timeoutInSeconds);
}