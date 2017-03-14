package org.moe.binding.mopub;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCachedURLResponse;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSInputStream;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLConnection;
import apple.foundation.NSURLProtectionSpace;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import apple.foundation.protocol.NSURLConnectionDataDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdConversionTracker extends NSObject implements
		NSURLConnectionDataDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdConversionTracker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdConversionTracker alloc();

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
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@IsOptional
	@Deprecated
	@Selector("connection:canAuthenticateAgainstProtectionSpace:")
	public native boolean connectionCanAuthenticateAgainstProtectionSpace(
			NSURLConnection connection, NSURLProtectionSpace protectionSpace);

	@Generated
	@IsOptional
	@Deprecated
	@Selector("connection:didCancelAuthenticationChallenge:")
	public native void connectionDidCancelAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connection:didFailWithError:")
	public native void connectionDidFailWithError(NSURLConnection connection,
			NSError error);

	@Generated
	@IsOptional
	@Deprecated
	@Selector("connection:didReceiveAuthenticationChallenge:")
	public native void connectionDidReceiveAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connection:didReceiveData:")
	public native void connectionDidReceiveData(NSURLConnection connection,
			NSData data);

	@Generated
	@IsOptional
	@Selector("connection:didReceiveResponse:")
	public native void connectionDidReceiveResponse(NSURLConnection connection,
			NSURLResponse response);

	@Generated
	@IsOptional
	@Selector("connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
	public native void connectionDidSendBodyDataTotalBytesWrittenTotalBytesExpectedToWrite(
			NSURLConnection connection, @NInt long bytesWritten,
			@NInt long totalBytesWritten, @NInt long totalBytesExpectedToWrite);

	@Generated
	@IsOptional
	@Selector("connection:needNewBodyStream:")
	public native NSInputStream connectionNeedNewBodyStream(
			NSURLConnection connection, NSURLRequest request);

	@Generated
	@IsOptional
	@Selector("connection:willCacheResponse:")
	public native NSCachedURLResponse connectionWillCacheResponse(
			NSURLConnection connection, NSCachedURLResponse cachedResponse);

	@Generated
	@IsOptional
	@Selector("connection:willSendRequest:redirectResponse:")
	public native NSURLRequest connectionWillSendRequestRedirectResponse(
			NSURLConnection connection, NSURLRequest request,
			NSURLResponse response);

	@Generated
	@IsOptional
	@Selector("connection:willSendRequestForAuthenticationChallenge:")
	public native void connectionWillSendRequestForAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connectionDidFinishLoading:")
	public native void connectionDidFinishLoading(NSURLConnection connection);

	@Generated
	@IsOptional
	@Selector("connectionShouldUseCredentialStorage:")
	public native boolean connectionShouldUseCredentialStorage(
			NSURLConnection connection);

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
	public native MPAdConversionTracker init();

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
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("reportApplicationOpenForApplicationID:")
	public native void reportApplicationOpenForApplicationID(String appID);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("sharedConversionTracker")
	public static native MPAdConversionTracker sharedConversionTracker();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}