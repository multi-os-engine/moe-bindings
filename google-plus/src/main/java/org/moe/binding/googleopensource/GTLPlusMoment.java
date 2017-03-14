package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GTLPlusMoment extends GTLObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLPlusMoment(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLPlusMoment alloc();

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
	@Selector("classForAdditionalProperties")
	public static native Class classForAdditionalProperties();

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
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native GTLPlusMoment init();

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
	@Selector("kind")
	public native String kind();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("nullValue")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object nullValue();

	@Generated
	@Selector("object")
	public static native GTLPlusMoment object_static();

	@Generated
	@Selector("objectForJSON:defaultClass:surrogates:batchClassMap:")
	public static native GTLObject objectForJSONDefaultClassSurrogatesBatchClassMap(
			NSMutableDictionary<?, ?> json, Class defaultClass,
			NSDictionary<?, ?> surrogates, NSDictionary<?, ?> batchClassMap);

	@Generated
	@Selector("objectWithJSON:")
	public static native GTLPlusMoment objectWithJSON(
			NSMutableDictionary<?, ?> dict);

	@Generated
	@Selector("propertyToJSONKeyMap")
	public static native NSDictionary<?, ?> propertyToJSONKeyMap();

	@Generated
	@Selector("registerObjectClassForKind:")
	public static native void registerObjectClassForKind(String kind);

	@Generated
	@Selector("registeredObjectClassForKind:")
	public static native Class registeredObjectClassForKind(String kind);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("result")
	public native GTLPlusItemScope result();

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setKind:")
	public native void setKind(String value);

	@Generated
	@Selector("setResult:")
	public native void setResult(GTLPlusItemScope value);

	@Generated
	@Selector("setStartDate:")
	public native void setStartDate(GTLDateTime value);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(GTLPlusItemScope value);

	@Generated
	@Selector("setType:")
	public native void setType(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("startDate")
	public native GTLDateTime startDate();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("target")
	public native GTLPlusItemScope target();

	@Generated
	@Selector("type")
	public native String type();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}