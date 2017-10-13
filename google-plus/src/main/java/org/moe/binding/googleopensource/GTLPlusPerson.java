package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSNumber;
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
public class GTLPlusPerson extends GTLObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLPlusPerson(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("ETag")
	public native String ETag();

	@Generated
	@Selector("aboutMe")
	public native String aboutMe();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("ageRange")
	public native GTLPlusPersonAgeRange ageRange();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLPlusPerson alloc();

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
	@Selector("birthday")
	public native String birthday();

	@Generated
	@Selector("braggingRights")
	public native String braggingRights();

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
	@Selector("circledByCount")
	public native NSNumber circledByCount();

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
	@Selector("cover")
	public native GTLPlusPersonCover cover();

	@Generated
	@Selector("currentLocation")
	public native String currentLocation();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("displayName")
	public native String displayName();

	@Generated
	@Selector("domain")
	public native String domain();

	@Generated
	@Selector("emails")
	public native NSArray<?> emails();

	@Generated
	@Selector("gender")
	public native String gender();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("image")
	public native GTLPlusPersonImage image();

	@Generated
	@Selector("init")
	public native GTLPlusPerson init();

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
	@Selector("isPlusUser")
	public native NSNumber isPlusUser();

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
	@Selector("language")
	public native String language();

	@Generated
	@Selector("name")
	public native GTLPlusPersonName name();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("nickname")
	public native String nickname();

	@Generated
	@Selector("nullValue")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object nullValue();

	@Generated
	@Selector("object")
	public static native GTLPlusPerson object_static();

	@Generated
	@Selector("objectForJSON:defaultClass:surrogates:batchClassMap:")
	public static native GTLObject objectForJSONDefaultClassSurrogatesBatchClassMap(
			NSMutableDictionary<?, ?> json, Class defaultClass,
			NSDictionary<?, ?> surrogates, NSDictionary<?, ?> batchClassMap);

	@Generated
	@Selector("objectType")
	public native String objectType();

	@Generated
	@Selector("objectWithJSON:")
	public static native GTLPlusPerson objectWithJSON(
			NSMutableDictionary<?, ?> dict);

	@Generated
	@Selector("occupation")
	public native String occupation();

	@Generated
	@Selector("organizations")
	public native NSArray<?> organizations();

	@Generated
	@Selector("placesLived")
	public native NSArray<?> placesLived();

	@Generated
	@Selector("plusOneCount")
	public native NSNumber plusOneCount();

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
	@Selector("relationshipStatus")
	public native String relationshipStatus();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAboutMe:")
	public native void setAboutMe(String value);

	@Generated
	@Selector("setAgeRange:")
	public native void setAgeRange(GTLPlusPersonAgeRange value);

	@Generated
	@Selector("setBirthday:")
	public native void setBirthday(String value);

	@Generated
	@Selector("setBraggingRights:")
	public native void setBraggingRights(String value);

	@Generated
	@Selector("setCircledByCount:")
	public native void setCircledByCount(NSNumber value);

	@Generated
	@Selector("setCover:")
	public native void setCover(GTLPlusPersonCover value);

	@Generated
	@Selector("setCurrentLocation:")
	public native void setCurrentLocation(String value);

	@Generated
	@Selector("setDisplayName:")
	public native void setDisplayName(String value);

	@Generated
	@Selector("setDomain:")
	public native void setDomain(String value);

	@Generated
	@Selector("setETag:")
	public native void setETag(String value);

	@Generated
	@Selector("setEmails:")
	public native void setEmails(NSArray<?> value);

	@Generated
	@Selector("setGender:")
	public native void setGender(String value);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setImage:")
	public native void setImage(GTLPlusPersonImage value);

	@Generated
	@Selector("setIsPlusUser:")
	public native void setIsPlusUser(NSNumber value);

	@Generated
	@Selector("setKind:")
	public native void setKind(String value);

	@Generated
	@Selector("setLanguage:")
	public native void setLanguage(String value);

	@Generated
	@Selector("setName:")
	public native void setName(GTLPlusPersonName value);

	@Generated
	@Selector("setNickname:")
	public native void setNickname(String value);

	@Generated
	@Selector("setObjectType:")
	public native void setObjectType(String value);

	@Generated
	@Selector("setOccupation:")
	public native void setOccupation(String value);

	@Generated
	@Selector("setOrganizations:")
	public native void setOrganizations(NSArray<?> value);

	@Generated
	@Selector("setPlacesLived:")
	public native void setPlacesLived(NSArray<?> value);

	@Generated
	@Selector("setPlusOneCount:")
	public native void setPlusOneCount(NSNumber value);

	@Generated
	@Selector("setRelationshipStatus:")
	public native void setRelationshipStatus(String value);

	@Generated
	@Selector("setSkills:")
	public native void setSkills(String value);

	@Generated
	@Selector("setTagline:")
	public native void setTagline(String value);

	@Generated
	@Selector("setUrl:")
	public native void setUrl(String value);

	@Generated
	@Selector("setUrls:")
	public native void setUrls(NSArray<?> value);

	@Generated
	@Selector("setVerified:")
	public native void setVerified(NSNumber value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("skills")
	public native String skills();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("tagline")
	public native String tagline();

	@Generated
	@Selector("url")
	public native String url();

	@Generated
	@Selector("urls")
	public native NSArray<?> urls();

	@Generated
	@Selector("verified")
	public native NSNumber verified();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}