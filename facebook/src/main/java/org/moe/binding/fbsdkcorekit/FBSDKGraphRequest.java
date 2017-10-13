package org.moe.binding.fbsdkcorekit;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
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
@Library("FBSDKCoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class FBSDKGraphRequest extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected FBSDKGraphRequest(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("HTTPMethod")
	public native String HTTPMethod();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native FBSDKGraphRequest alloc();

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
	@Selector("graphPath")
	public native String graphPath();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native FBSDKGraphRequest init();

	@Generated
	@Selector("initWithGraphPath:parameters:")
	public native FBSDKGraphRequest initWithGraphPathParameters(
			String graphPath, NSDictionary<?, ?> parameters);

	@Generated
	@Selector("initWithGraphPath:parameters:HTTPMethod:")
	public native FBSDKGraphRequest initWithGraphPathParametersHTTPMethod(
			String graphPath, NSDictionary<?, ?> parameters, String HTTPMethod);

	@Generated
	@Selector("initWithGraphPath:parameters:tokenString:version:HTTPMethod:")
	public native FBSDKGraphRequest initWithGraphPathParametersTokenStringVersionHTTPMethod(
			String graphPath, NSDictionary<?, ?> parameters,
			String tokenString, String version, String HTTPMethod);

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
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("parameters")
	public native NSMutableDictionary<?, ?> parameters();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setGraphErrorRecoveryDisabled:")
	public native void setGraphErrorRecoveryDisabled(boolean disable);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("startWithCompletionHandler:")
	public native FBSDKGraphRequestConnection startWithCompletionHandler(
			@ObjCBlock(name = "call_startWithCompletionHandler") Block_startWithCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_startWithCompletionHandler {
		@Generated
		void call_startWithCompletionHandler(FBSDKGraphRequestConnection arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, NSError arg2);
	}

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("tokenString")
	public native String tokenString();

	@Generated
	@Selector("version")
	public native String version();
}