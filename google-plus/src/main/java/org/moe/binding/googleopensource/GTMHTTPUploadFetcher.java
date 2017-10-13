package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSFileHandle;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
import org.moe.binding.googleopensource.protocol.GTMCookieStorageProtocol;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GTMHTTPUploadFetcher extends GTMHTTPFetcher {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMHTTPUploadFetcher(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("activeFetcher")
	public native GTMHTTPFetcher activeFetcher();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMHTTPUploadFetcher alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

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
	@Selector("chunkFetcher")
	public native GTMHTTPFetcher chunkFetcher();

	@Generated
	@Selector("chunkSize")
	@NUInt
	public native long chunkSize();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("connectionClass")
	public static native Class connectionClass();

	@Generated
	@Selector("currentOffset")
	@NUInt
	public native long currentOffset();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("doesSupportSentDataCallback")
	public static native boolean doesSupportSentDataCallback();

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
	public native GTMHTTPUploadFetcher init();

	@Generated
	@Selector("initWithRequest:")
	public native GTMHTTPUploadFetcher initWithRequest(NSURLRequest request);

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
	@Selector("isLoggingEnabled")
	public static native boolean isLoggingEnabled();

	@Generated
	@Selector("isLoggingToFileEnabled")
	public static native boolean isLoggingToFileEnabled();

	@Generated
	@Selector("isPaused")
	public native boolean isPaused();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("locationChangeBlock")
	@ObjCBlock(name = "call_locationChangeBlock_ret")
	public native Block_locationChangeBlock_ret locationChangeBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_locationChangeBlock_ret {
		@Generated
		void call_locationChangeBlock_ret(NSURL arg0);
	}

	@Generated
	@Selector("locationURL")
	public native NSURL locationURL();

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
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("pauseFetching")
	public native void pauseFetching();

	@Generated
	@Selector("processNameLogPrefix")
	public static native String processNameLogPrefix();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("responseHeaders")
	public native NSDictionary<?, ?> responseHeaders();

	@Generated
	@Selector("resumeFetching")
	public native void resumeFetching();

	@Generated
	@Selector("setChunkFetcher:")
	public native void setChunkFetcher(GTMHTTPFetcher value);

	@Generated
	@Selector("setChunkSize:")
	public native void setChunkSize(@NUInt long value);

	@Generated
	@Selector("setConnectionClass:")
	public static native void setConnectionClass(Class theClass);

	@Generated
	@Selector("setCurrentOffset:")
	public native void setCurrentOffset(@NUInt long value);

	@Generated
	@Selector("setLocationChangeBlock:")
	public native void setLocationChangeBlock(
			@ObjCBlock(name = "call_setLocationChangeBlock") Block_setLocationChangeBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setLocationChangeBlock {
		@Generated
		void call_setLocationChangeBlock(NSURL arg0);
	}

	@Generated
	@Selector("setLocationURL:")
	public native void setLocationURL(NSURL value);

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
	@Selector("setResponseHeaders:")
	public native void setResponseHeaders(NSDictionary<?, ?> value);

	@Generated
	@Selector("setStatusCode:")
	public native void setStatusCode(@NInt long value);

	@Generated
	@Selector("setUploadData:")
	public native void setUploadData(NSData value);

	@Generated
	@Selector("setUploadFileHandle:")
	public native void setUploadFileHandle(NSFileHandle value);

	@Generated
	@Selector("setUploadMIMEType:")
	public native void setUploadMIMEType(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("staticCookieStorage")
	@MappedReturn(ObjCObjectMapper.class)
	public static native GTMCookieStorageProtocol staticCookieStorage();

	@Generated
	@Selector("statusCode")
	@NInt
	public native long statusCode();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("symlinkNameSuffix")
	public static native String symlinkNameSuffix();

	@Generated
	@Selector("uploadData")
	public native NSData uploadData();

	@Generated
	@Selector("uploadFetcherWithLocation:uploadFileHandle:uploadMIMEType:chunkSize:fetcherService:")
	public static native GTMHTTPUploadFetcher uploadFetcherWithLocationUploadFileHandleUploadMIMETypeChunkSizeFetcherService(
			NSURL locationURL, NSFileHandle fileHandle, String uploadMIMEType,
			@NUInt long chunkSize, GTMHTTPFetcherService fetcherServiceOrNil);

	@Generated
	@Selector("uploadFetcherWithRequest:uploadData:uploadMIMEType:chunkSize:fetcherService:")
	public static native GTMHTTPUploadFetcher uploadFetcherWithRequestUploadDataUploadMIMETypeChunkSizeFetcherService(
			NSURLRequest request, NSData data, String uploadMIMEType,
			@NUInt long chunkSize, GTMHTTPFetcherService fetcherServiceOrNil);

	@Generated
	@Selector("uploadFetcherWithRequest:uploadFileHandle:uploadMIMEType:chunkSize:fetcherService:")
	public static native GTMHTTPUploadFetcher uploadFetcherWithRequestUploadFileHandleUploadMIMETypeChunkSizeFetcherService(
			NSURLRequest request, NSFileHandle fileHandle,
			String uploadMIMEType, @NUInt long chunkSize,
			GTMHTTPFetcherService fetcherServiceOrNil);

	@Generated
	@Selector("uploadFileHandle")
	public native NSFileHandle uploadFileHandle();

	@Generated
	@Selector("uploadMIMEType")
	public native String uploadMIMEType();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}