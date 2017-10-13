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
public class GTLPlusActivity extends GTLObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLPlusActivity(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("ETag")
	public native String ETag();

	@Generated
	@Selector("access")
	public native GTLPlusAcl access();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("actor")
	public native GTLPlusActivityActor actor();

	@Generated
	@Selector("address")
	public native String address();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLPlusActivity alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("annotation")
	public native String annotation();

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
	@Selector("crosspostSource")
	public native String crosspostSource();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("geocode")
	public native String geocode();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native GTLPlusActivity init();

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
	@Selector("location")
	public native GTLPlusPlace location();

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
	public native GTLPlusActivityObject object();

	@Generated
	@Selector("object")
	public static native GTLPlusActivity object_static();

	@Generated
	@Selector("objectForJSON:defaultClass:surrogates:batchClassMap:")
	public static native GTLObject objectForJSONDefaultClassSurrogatesBatchClassMap(
			NSMutableDictionary<?, ?> json, Class defaultClass,
			NSDictionary<?, ?> surrogates, NSDictionary<?, ?> batchClassMap);

	@Generated
	@Selector("objectWithJSON:")
	public static native GTLPlusActivity objectWithJSON(
			NSMutableDictionary<?, ?> dict);

	@Generated
	@Selector("placeId")
	public native String placeId();

	@Generated
	@Selector("placeName")
	public native String placeName();

	@Generated
	@Selector("propertyToJSONKeyMap")
	public static native NSDictionary<?, ?> propertyToJSONKeyMap();

	@Generated
	@Selector("provider")
	public native GTLPlusActivityProvider provider();

	@Generated
	@Selector("published")
	public native GTLDateTime published();

	@Generated
	@Selector("radius")
	public native String radius();

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
	@Selector("setAccess:")
	public native void setAccess(GTLPlusAcl value);

	@Generated
	@Selector("setActor:")
	public native void setActor(GTLPlusActivityActor value);

	@Generated
	@Selector("setAddress:")
	public native void setAddress(String value);

	@Generated
	@Selector("setAnnotation:")
	public native void setAnnotation(String value);

	@Generated
	@Selector("setCrosspostSource:")
	public native void setCrosspostSource(String value);

	@Generated
	@Selector("setETag:")
	public native void setETag(String value);

	@Generated
	@Selector("setGeocode:")
	public native void setGeocode(String value);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setKind:")
	public native void setKind(String value);

	@Generated
	@Selector("setLocation:")
	public native void setLocation(GTLPlusPlace value);

	@Generated
	@Selector("setObject:")
	public native void setObject(GTLPlusActivityObject value);

	@Generated
	@Selector("setPlaceId:")
	public native void setPlaceId(String value);

	@Generated
	@Selector("setPlaceName:")
	public native void setPlaceName(String value);

	@Generated
	@Selector("setProvider:")
	public native void setProvider(GTLPlusActivityProvider value);

	@Generated
	@Selector("setPublished:")
	public native void setPublished(GTLDateTime value);

	@Generated
	@Selector("setRadius:")
	public native void setRadius(String value);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String value);

	@Generated
	@Selector("setUpdated:")
	public native void setUpdated(GTLDateTime value);

	@Generated
	@Selector("setUrl:")
	public native void setUrl(String value);

	@Generated
	@Selector("setVerb:")
	public native void setVerb(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("updated")
	public native GTLDateTime updated();

	@Generated
	@Selector("url")
	public native String url();

	@Generated
	@Selector("verb")
	public native String verb();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}