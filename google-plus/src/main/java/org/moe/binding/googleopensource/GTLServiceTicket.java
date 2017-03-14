package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.binding.googleopensource.protocol.GTLQueryProtocol;
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
public class GTLServiceTicket extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLServiceTicket(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("APIKey")
	public native String APIKey();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLServiceTicket alloc();

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
	@Selector("cancelTicket")
	public native void cancelTicket();

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
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("executingQuery")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTLQueryProtocol executingQuery();

	@Generated
	@Selector("fetchError")
	public native NSError fetchError();

	@Generated
	@Selector("fetchedObject")
	public native GTLObject fetchedObject();

	@Generated
	@Selector("hasCalledCallback")
	public native boolean hasCalledCallback();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTLServiceTicket init();

	@Generated
	@Selector("initWithService:")
	public native GTLServiceTicket initWithService(GTLService service);

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
	@Selector("isRetryEnabled")
	public native boolean isRetryEnabled();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("isUploadPaused")
	public native boolean isUploadPaused();

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
	@Selector("objectFetcher")
	public native GTMHTTPFetcher objectFetcher();

	@Generated
	@Selector("originalQuery")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTLQueryProtocol originalQuery();

	@Generated
	@Selector("pagesFetchedCounter")
	@NUInt
	public native long pagesFetchedCounter();

	@Generated
	@Selector("pauseUpload")
	public native void pauseUpload();

	@Generated
	@Selector("postedObject")
	public native GTLObject postedObject();

	@Generated
	@Selector("properties")
	public native NSDictionary<?, ?> properties();

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String key);

	@Generated
	@Selector("queryForRequestID:")
	public native GTLQuery queryForRequestID(String requestID);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("resumeUpload")
	public native void resumeUpload();

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
	@Selector("service")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object service();

	@Generated
	@Selector("setAPIKey:")
	public native void setAPIKey(String value);

	@Generated
	@Selector("setExecutingQuery:")
	public native void setExecutingQuery(
			@Mapped(ObjCObjectMapper.class) GTLQueryProtocol value);

	@Generated
	@Selector("setFetchError:")
	public native void setFetchError(NSError value);

	@Generated
	@Selector("setFetchedObject:")
	public native void setFetchedObject(GTLObject value);

	@Generated
	@Selector("setHasCalledCallback:")
	public native void setHasCalledCallback(boolean value);

	@Generated
	@Selector("setMaxRetryInterval:")
	public native void setMaxRetryInterval(double value);

	@Generated
	@Selector("setObjectFetcher:")
	public native void setObjectFetcher(GTMHTTPFetcher value);

	@Generated
	@Selector("setOriginalQuery:")
	public native void setOriginalQuery(
			@Mapped(ObjCObjectMapper.class) GTLQueryProtocol value);

	@Generated
	@Selector("setPagesFetchedCounter:")
	public native void setPagesFetchedCounter(@NUInt long value);

	@Generated
	@Selector("setPostedObject:")
	public native void setPostedObject(GTLObject value);

	@Generated
	@Selector("setProperties:")
	public native void setProperties(NSDictionary<?, ?> value);

	@Generated
	@Selector("setProperty:forKey:")
	public native void setPropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

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
	@Selector("setUserData:")
	public native void setUserData(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldFetchNextPages")
	public native boolean shouldFetchNextPages();

	@Generated
	@Selector("statusCode")
	@NInt
	public native long statusCode();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("surrogates")
	public native NSDictionary<?, ?> surrogates();

	@Generated
	@Selector("ticketForService:")
	public static native GTLServiceTicket ticketForService(GTLService service);

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
	@Selector("userData")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object userData();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}