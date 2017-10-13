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
public class GTLPlusItemScope extends GTLObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLPlusItemScope(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("about")
	public native GTLPlusItemScope about();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("additionalName")
	public native NSArray<?> additionalName();

	@Generated
	@Selector("address")
	public native GTLPlusItemScope address();

	@Generated
	@Selector("addressCountry")
	public native String addressCountry();

	@Generated
	@Selector("addressLocality")
	public native String addressLocality();

	@Generated
	@Selector("addressRegion")
	public native String addressRegion();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLPlusItemScope alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("arrayPropertyToClassMap")
	public static native NSDictionary<?, ?> arrayPropertyToClassMap();

	@Generated
	@Selector("associatedMedia")
	public native NSArray<?> associatedMedia();

	@Generated
	@Selector("attendeeCount")
	public native NSNumber attendeeCount();

	@Generated
	@Selector("attendees")
	public native NSArray<?> attendees();

	@Generated
	@Selector("audio")
	public native GTLPlusItemScope audio();

	@Generated
	@Selector("author")
	public native NSArray<?> author();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("bestRating")
	public native String bestRating();

	@Generated
	@Selector("birthDate")
	public native String birthDate();

	@Generated
	@Selector("byArtist")
	public native GTLPlusItemScope byArtist();

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
	@Selector("caption")
	public native String caption();

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
	@Selector("contentSize")
	public native String contentSize();

	@Generated
	@Selector("contentUrl")
	public native String contentUrl();

	@Generated
	@Selector("contributor")
	public native NSArray<?> contributor();

	@Generated
	@Selector("dateCreated")
	public native String dateCreated();

	@Generated
	@Selector("dateModified")
	public native String dateModified();

	@Generated
	@Selector("datePublished")
	public native String datePublished();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("descriptionProperty")
	public native String descriptionProperty();

	@Generated
	@Selector("duration")
	public native String duration();

	@Generated
	@Selector("embedUrl")
	public native String embedUrl();

	@Generated
	@Selector("endDate")
	public native String endDate();

	@Generated
	@Selector("familyName")
	public native String familyName();

	@Generated
	@Selector("gender")
	public native String gender();

	@Generated
	@Selector("geo")
	public native GTLPlusItemScope geo();

	@Generated
	@Selector("givenName")
	public native String givenName();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("height")
	public native String height();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("image")
	public native String image();

	@Generated
	@Selector("inAlbum")
	public native GTLPlusItemScope inAlbum();

	@Generated
	@Selector("init")
	public native GTLPlusItemScope init();

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
	@Selector("latitude")
	public native NSNumber latitude();

	@Generated
	@Selector("location")
	public native GTLPlusItemScope location();

	@Generated
	@Selector("longitude")
	public native NSNumber longitude();

	@Generated
	@Selector("name")
	public native String name();

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
	public static native GTLPlusItemScope object_static();

	@Generated
	@Selector("objectForJSON:defaultClass:surrogates:batchClassMap:")
	public static native GTLObject objectForJSONDefaultClassSurrogatesBatchClassMap(
			NSMutableDictionary<?, ?> json, Class defaultClass,
			NSDictionary<?, ?> surrogates, NSDictionary<?, ?> batchClassMap);

	@Generated
	@Selector("objectWithJSON:")
	public static native GTLPlusItemScope objectWithJSON(
			NSMutableDictionary<?, ?> dict);

	@Generated
	@Selector("partOfTVSeries")
	public native GTLPlusItemScope partOfTVSeries();

	@Generated
	@Selector("performers")
	public native NSArray<?> performers();

	@Generated
	@Selector("playerType")
	public native String playerType();

	@Generated
	@Selector("postOfficeBoxNumber")
	public native String postOfficeBoxNumber();

	@Generated
	@Selector("postalCode")
	public native String postalCode();

	@Generated
	@Selector("propertyToJSONKeyMap")
	public static native NSDictionary<?, ?> propertyToJSONKeyMap();

	@Generated
	@Selector("ratingValue")
	public native String ratingValue();

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
	@Selector("reviewRating")
	public native GTLPlusItemScope reviewRating();

	@Generated
	@Selector("setAbout:")
	public native void setAbout(GTLPlusItemScope value);

	@Generated
	@Selector("setAdditionalName:")
	public native void setAdditionalName(NSArray<?> value);

	@Generated
	@Selector("setAddress:")
	public native void setAddress(GTLPlusItemScope value);

	@Generated
	@Selector("setAddressCountry:")
	public native void setAddressCountry(String value);

	@Generated
	@Selector("setAddressLocality:")
	public native void setAddressLocality(String value);

	@Generated
	@Selector("setAddressRegion:")
	public native void setAddressRegion(String value);

	@Generated
	@Selector("setAssociatedMedia:")
	public native void setAssociatedMedia(NSArray<?> value);

	@Generated
	@Selector("setAttendeeCount:")
	public native void setAttendeeCount(NSNumber value);

	@Generated
	@Selector("setAttendees:")
	public native void setAttendees(NSArray<?> value);

	@Generated
	@Selector("setAudio:")
	public native void setAudio(GTLPlusItemScope value);

	@Generated
	@Selector("setAuthor:")
	public native void setAuthor(NSArray<?> value);

	@Generated
	@Selector("setBestRating:")
	public native void setBestRating(String value);

	@Generated
	@Selector("setBirthDate:")
	public native void setBirthDate(String value);

	@Generated
	@Selector("setByArtist:")
	public native void setByArtist(GTLPlusItemScope value);

	@Generated
	@Selector("setCaption:")
	public native void setCaption(String value);

	@Generated
	@Selector("setContentSize:")
	public native void setContentSize(String value);

	@Generated
	@Selector("setContentUrl:")
	public native void setContentUrl(String value);

	@Generated
	@Selector("setContributor:")
	public native void setContributor(NSArray<?> value);

	@Generated
	@Selector("setDateCreated:")
	public native void setDateCreated(String value);

	@Generated
	@Selector("setDateModified:")
	public native void setDateModified(String value);

	@Generated
	@Selector("setDatePublished:")
	public native void setDatePublished(String value);

	@Generated
	@Selector("setDescriptionProperty:")
	public native void setDescriptionProperty(String value);

	@Generated
	@Selector("setDuration:")
	public native void setDuration(String value);

	@Generated
	@Selector("setEmbedUrl:")
	public native void setEmbedUrl(String value);

	@Generated
	@Selector("setEndDate:")
	public native void setEndDate(String value);

	@Generated
	@Selector("setFamilyName:")
	public native void setFamilyName(String value);

	@Generated
	@Selector("setGender:")
	public native void setGender(String value);

	@Generated
	@Selector("setGeo:")
	public native void setGeo(GTLPlusItemScope value);

	@Generated
	@Selector("setGivenName:")
	public native void setGivenName(String value);

	@Generated
	@Selector("setHeight:")
	public native void setHeight(String value);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setImage:")
	public native void setImage(String value);

	@Generated
	@Selector("setInAlbum:")
	public native void setInAlbum(GTLPlusItemScope value);

	@Generated
	@Selector("setKind:")
	public native void setKind(String value);

	@Generated
	@Selector("setLatitude:")
	public native void setLatitude(NSNumber value);

	@Generated
	@Selector("setLocation:")
	public native void setLocation(GTLPlusItemScope value);

	@Generated
	@Selector("setLongitude:")
	public native void setLongitude(NSNumber value);

	@Generated
	@Selector("setName:")
	public native void setName(String value);

	@Generated
	@Selector("setPartOfTVSeries:")
	public native void setPartOfTVSeries(GTLPlusItemScope value);

	@Generated
	@Selector("setPerformers:")
	public native void setPerformers(NSArray<?> value);

	@Generated
	@Selector("setPlayerType:")
	public native void setPlayerType(String value);

	@Generated
	@Selector("setPostOfficeBoxNumber:")
	public native void setPostOfficeBoxNumber(String value);

	@Generated
	@Selector("setPostalCode:")
	public native void setPostalCode(String value);

	@Generated
	@Selector("setRatingValue:")
	public native void setRatingValue(String value);

	@Generated
	@Selector("setReviewRating:")
	public native void setReviewRating(GTLPlusItemScope value);

	@Generated
	@Selector("setStartDate:")
	public native void setStartDate(String value);

	@Generated
	@Selector("setStreetAddress:")
	public native void setStreetAddress(String value);

	@Generated
	@Selector("setText:")
	public native void setText(String value);

	@Generated
	@Selector("setThumbnail:")
	public native void setThumbnail(GTLPlusItemScope value);

	@Generated
	@Selector("setThumbnailUrl:")
	public native void setThumbnailUrl(String value);

	@Generated
	@Selector("setTickerSymbol:")
	public native void setTickerSymbol(String value);

	@Generated
	@Selector("setType:")
	public native void setType(String value);

	@Generated
	@Selector("setUrl:")
	public native void setUrl(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setWidth:")
	public native void setWidth(String value);

	@Generated
	@Selector("setWorstRating:")
	public native void setWorstRating(String value);

	@Generated
	@Selector("startDate")
	public native String startDate();

	@Generated
	@Selector("streetAddress")
	public native String streetAddress();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("text")
	public native String text();

	@Generated
	@Selector("thumbnail")
	public native GTLPlusItemScope thumbnail();

	@Generated
	@Selector("thumbnailUrl")
	public native String thumbnailUrl();

	@Generated
	@Selector("tickerSymbol")
	public native String tickerSymbol();

	@Generated
	@Selector("type")
	public native String type();

	@Generated
	@Selector("url")
	public native String url();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("width")
	public native String width();

	@Generated
	@Selector("worstRating")
	public native String worstRating();
}