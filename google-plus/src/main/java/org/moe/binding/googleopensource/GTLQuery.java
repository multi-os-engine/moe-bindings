package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
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
public class GTLQuery extends NSObject implements GTLQueryProtocol {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLQuery(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("JSON")
	public native NSMutableDictionary<?, ?> JSON();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("additionalHTTPHeaders")
	public native NSDictionary<?, ?> additionalHTTPHeaders();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLQuery alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("arrayPropertyToClassMap")
	public static native NSDictionary<?, ?> arrayPropertyToClassMap();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("bodyObject")
	public native GTLObject bodyObject();

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
	@Selector("completionBlock")
	@ObjCBlock(name = "call_completionBlock_ret")
	public native Block_completionBlock_ret completionBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_completionBlock_ret {
		@Generated
		void call_completionBlock_ret(GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("executionDidStop")
	public native void executionDidStop();

	@Generated
	@Selector("expectedObjectClass")
	public native Class expectedObjectClass();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTLQuery init();

	@Generated
	@Selector("initWithMethodName:")
	public native GTLQuery initWithMethodName(String method);

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
	@Selector("isBatchQuery")
	public native boolean isBatchQuery();

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
	@Selector("methodName")
	public native String methodName();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("nextRequestID")
	public static native String nextRequestID();

	@Generated
	@Selector("parameterNameMap")
	public static native NSDictionary<?, ?> parameterNameMap();

	@Generated
	@Selector("queryWithMethodName:")
	public static native GTLQuery queryWithMethodName(String methodName);

	@Generated
	@Selector("requestID")
	public native String requestID();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAdditionalHTTPHeaders:")
	public native void setAdditionalHTTPHeaders(NSDictionary<?, ?> value);

	@Generated
	@Selector("setBodyObject:")
	public native void setBodyObject(GTLObject value);

	@Generated
	@Selector("setCompletionBlock:")
	public native void setCompletionBlock(
			@ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setCompletionBlock {
		@Generated
		void call_setCompletionBlock(GTLServiceTicket arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("setCustomParameter:forKey:")
	public native void setCustomParameterForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

	@Generated
	@Selector("setExpectedObjectClass:")
	public native void setExpectedObjectClass(Class value);

	@Generated
	@Selector("setJSON:")
	public native void setJSON(NSMutableDictionary<?, ?> value);

	@Generated
	@Selector("setRequestID:")
	public native void setRequestID(String value);

	@Generated
	@Selector("setShouldSkipAuthorization:")
	public native void setShouldSkipAuthorization(boolean value);

	@Generated
	@Selector("setUploadParameters:")
	public native void setUploadParameters(GTLUploadParameters value);

	@Generated
	@Selector("setUrlQueryParameters:")
	public native void setUrlQueryParameters(NSDictionary<?, ?> value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldSkipAuthorization")
	public native boolean shouldSkipAuthorization();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("uploadParameters")
	public native GTLUploadParameters uploadParameters();

	@Generated
	@Selector("urlQueryParameters")
	public native NSDictionary<?, ?> urlQueryParameters();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}