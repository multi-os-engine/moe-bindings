package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableURLRequest;
import apple.foundation.NSSet;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.binding.googleopensource.protocol.GTMHTTPFetchHistoryProtocol;
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
public class GTMHTTPFetchHistory extends NSObject implements
		GTMHTTPFetchHistoryProtocol {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMHTTPFetchHistory(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMHTTPFetchHistory alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cachedDataForRequest:")
	public native NSData cachedDataForRequest(NSURLRequest request);

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
	@Selector("cookieStorage")
	public native GTMCookieStorage cookieStorage();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTMHTTPFetchHistory init();

	@Generated
	@Selector("initWithMemoryCapacity:shouldCacheETaggedData:")
	public native GTMHTTPFetchHistory initWithMemoryCapacityShouldCacheETaggedData(
			@NUInt long totalBytes, boolean shouldCacheETaggedData);

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
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("memoryCapacity")
	@NUInt
	public native long memoryCapacity();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("removeAllCookies")
	public native void removeAllCookies();

	@Generated
	@Selector("removeCachedDataForRequest:")
	public native void removeCachedDataForRequest(NSURLRequest request);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setCookieStorage:")
	public native void setCookieStorage(GTMCookieStorage value);

	@Generated
	@Selector("setMemoryCapacity:")
	public native void setMemoryCapacity(@NUInt long value);

	@Generated
	@Selector("setShouldCacheETaggedData:")
	public native void setShouldCacheETaggedData(boolean value);

	@Generated
	@Selector("setShouldRememberETags:")
	public native void setShouldRememberETags(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldCacheETaggedData")
	public native boolean shouldCacheETaggedData();

	@Generated
	@Selector("shouldRememberETags")
	public native boolean shouldRememberETags();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("updateFetchHistoryWithRequest:response:downloadedData:")
	public native void updateFetchHistoryWithRequestResponseDownloadedData(
			NSURLRequest request, NSURLResponse response, NSData downloadedData);

	@Generated
	@Selector("updateRequest:isHTTPGet:")
	public native void updateRequestIsHTTPGet(NSMutableURLRequest request,
			boolean isHTTPGet);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}