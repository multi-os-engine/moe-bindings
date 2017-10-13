package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
public class GTLObject extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLObject(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("JSON")
	public native NSMutableDictionary<?, ?> JSON();

	@Generated
	@Selector("JSONString")
	public native String JSONString();

	@Generated
	@Selector("JSONValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object JSONValueForKey(String key);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("additionalJSONKeys")
	public native NSArray<?> additionalJSONKeys();

	@Generated
	@Selector("additionalProperties")
	public native NSDictionary<?, ?> additionalProperties();

	@Generated
	@Selector("additionalPropertyForName:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object additionalPropertyForName(String name);

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLObject alloc();

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
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForAdditionalProperties")
	public static native Class classForAdditionalProperties();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

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
	@Selector("fieldsDescription")
	public native String fieldsDescription();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTLObject init();

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
	@Selector("nullValue")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object nullValue();

	@Generated
	@Selector("object")
	public static native GTLObject object_static();

	@Generated
	@Selector("objectForJSON:defaultClass:surrogates:batchClassMap:")
	public static native GTLObject objectForJSONDefaultClassSurrogatesBatchClassMap(
			NSMutableDictionary<?, ?> json, Class defaultClass,
			NSDictionary<?, ?> surrogates, NSDictionary<?, ?> batchClassMap);

	@Generated
	@Selector("objectWithJSON:")
	public static native GTLObject objectWithJSON(NSMutableDictionary<?, ?> dict);

	@Generated
	@Selector("patchObjectFromOriginal:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object patchObjectFromOriginal(GTLObject original);

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String key);

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
	@Selector("setAdditionalProperty:forName:")
	public native void setAdditionalPropertyForName(
			@Mapped(ObjCObjectMapper.class) Object obj, String name);

	@Generated
	@Selector("setJSON:")
	public native void setJSON(NSMutableDictionary<?, ?> value);

	@Generated
	@Selector("setJSONValue:forKey:")
	public native void setJSONValueForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

	@Generated
	@Selector("setProperty:forKey:")
	public native void setPropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

	@Generated
	@Selector("setSurrogates:")
	public native void setSurrogates(NSDictionary<?, ?> value);

	@Generated
	@Selector("setUserData:")
	public native void setUserData(@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("setUserProperties:")
	public native void setUserProperties(NSMutableDictionary<?, ?> value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("surrogates")
	public native NSDictionary<?, ?> surrogates();

	@Generated
	@Selector("userData")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object userData();

	@Generated
	@Selector("userProperties")
	public native NSMutableDictionary<?, ?> userProperties();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}