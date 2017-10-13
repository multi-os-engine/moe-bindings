package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLCredential;
import apple.foundation.NSURLRequest;
import org.moe.binding.googleopensource.protocol.GTMFetcherAuthorizationProtocol;
import org.moe.binding.googleopensource.protocol.GTMHTTPFetcherServiceProtocol;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GTMHTTPFetcherService extends NSObject implements
		GTMHTTPFetcherServiceProtocol {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMHTTPFetcherService(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMHTTPFetcherService alloc();

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
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("clearETaggedDataCache")
	public native void clearETaggedDataCache();

	@Generated
	@Selector("clearHistory")
	public native void clearHistory();

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
	@Selector("delayedHosts")
	public native NSDictionary<?, ?> delayedHosts();

	@Generated
	@Selector("delegateQueue")
	public native NSOperationQueue delegateQueue();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("fetchHistory")
	public native GTMHTTPFetchHistory fetchHistory();

	@Generated
	@Selector("fetcherDidStop:")
	public native void fetcherDidStop(GTMHTTPFetcher fetcher);

	@Generated
	@Selector("fetcherShouldBeginFetching:")
	public native boolean fetcherShouldBeginFetching(GTMHTTPFetcher fetcher);

	@Generated
	@Selector("fetcherWithRequest:")
	public native GTMHTTPFetcher fetcherWithRequest(NSURLRequest request);

	@Generated
	@Selector("fetcherWithRequest:fetcherClass:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object fetcherWithRequestFetcherClass(NSURLRequest request,
			Class fetcherClass);

	@Generated
	@Selector("fetcherWithURL:")
	public native GTMHTTPFetcher fetcherWithURL(NSURL requestURL);

	@Generated
	@Selector("fetcherWithURLString:")
	public native GTMHTTPFetcher fetcherWithURLString(String requestURLString);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTMHTTPFetcherService init();

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
	@Selector("isDelayingFetcher:")
	public native boolean isDelayingFetcher(GTMHTTPFetcher fetcher);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("issuedFetchersWithRequestURL:")
	public native NSArray<?> issuedFetchersWithRequestURL(NSURL requestURL);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("maxRunningFetchersPerHost")
	@NUInt
	public native long maxRunningFetchersPerHost();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("numberOfDelayedFetchers")
	@NUInt
	public native long numberOfDelayedFetchers();

	@Generated
	@Selector("numberOfFetchers")
	@NUInt
	public native long numberOfFetchers();

	@Generated
	@Selector("numberOfRunningFetchers")
	@NUInt
	public native long numberOfRunningFetchers();

	@Generated
	@Selector("proxyCredential")
	public native NSURLCredential proxyCredential();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("runLoopModes")
	public native NSArray<?> runLoopModes();

	@Generated
	@Selector("runningHosts")
	public native NSDictionary<?, ?> runningHosts();

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
	@Selector("setCookieStorageMethod:")
	public native void setCookieStorageMethod(@NInt long value);

	@Generated
	@Selector("setCredential:")
	public native void setCredential(NSURLCredential value);

	@Generated
	@Selector("setDelegateQueue:")
	public native void setDelegateQueue(NSOperationQueue value);

	@Generated
	@Selector("setFetchHistory:")
	public native void setFetchHistory(GTMHTTPFetchHistory value);

	@Generated
	@Selector("setMaxRunningFetchersPerHost:")
	public native void setMaxRunningFetchersPerHost(@NUInt long value);

	@Generated
	@Selector("setProxyCredential:")
	public native void setProxyCredential(NSURLCredential value);

	@Generated
	@Selector("setRunLoopModes:")
	public native void setRunLoopModes(NSArray<?> value);

	@Generated
	@Selector("setShouldCacheETaggedData:")
	public native void setShouldCacheETaggedData(boolean value);

	@Generated
	@Selector("setShouldFetchInBackground:")
	public native void setShouldFetchInBackground(boolean value);

	@Generated
	@Selector("setShouldRememberETags:")
	public native void setShouldRememberETags(boolean value);

	@Generated
	@Selector("setTimeout:")
	public native void setTimeout(double value);

	@Generated
	@Selector("setUserAgent:")
	public native void setUserAgent(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldCacheETaggedData")
	public native boolean shouldCacheETaggedData();

	@Generated
	@Selector("shouldFetchInBackground")
	public native boolean shouldFetchInBackground();

	@Generated
	@Selector("shouldRememberETags")
	public native boolean shouldRememberETags();

	@Generated
	@Selector("stopAllFetchers")
	public native void stopAllFetchers();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("timeout")
	public native double timeout();

	@Generated
	@Selector("userAgent")
	public native String userAgent();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("waitForCompletionOfAllFetchersWithTimeout:")
	public native void waitForCompletionOfAllFetchersWithTimeout(
			double timeoutInSeconds);
}