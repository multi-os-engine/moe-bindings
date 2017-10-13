package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
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
public class GTLQueryPlus extends GTLQuery {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLQueryPlus(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("activityId")
	public native String activityId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLQueryPlus alloc();

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
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("collection")
	public native String collection();

	@Generated
	@Selector("commentId")
	public native String commentId();

	@Generated
	@Selector("debug")
	public native boolean debug();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("fields")
	public native String fields();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native GTLQueryPlus init();

	@Generated
	@Selector("initWithMethodName:")
	public native GTLQueryPlus initWithMethodName(String method);

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
	@Selector("language")
	public native String language();

	@Generated
	@Selector("maxResults")
	@NUInt
	public native long maxResults();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("nextRequestID")
	public static native String nextRequestID();

	@Generated
	@Selector("orderBy")
	public native String orderBy();

	@Generated
	@Selector("pageToken")
	public native String pageToken();

	@Generated
	@Selector("parameterNameMap")
	public static native NSDictionary<?, ?> parameterNameMap();

	@Generated
	@Selector("query")
	public native String query();

	@Generated
	@Selector("queryForActivitiesGetWithActivityId:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForActivitiesGetWithActivityId(
			String activityId);

	@Generated
	@Selector("queryForActivitiesListWithUserId:collection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForActivitiesListWithUserIdCollection(
			String userId, String collection);

	@Generated
	@Selector("queryForActivitiesSearchWithQuery:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForActivitiesSearchWithQuery(String query);

	@Generated
	@Selector("queryForCommentsGetWithCommentId:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForCommentsGetWithCommentId(
			String commentId);

	@Generated
	@Selector("queryForCommentsListWithActivityId:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForCommentsListWithActivityId(
			String activityId);

	@Generated
	@Selector("queryForMomentsInsertWithObject:userId:collection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForMomentsInsertWithObjectUserIdCollection(
			GTLPlusMoment object, String userId, String collection);

	@Generated
	@Selector("queryForMomentsListWithUserId:collection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForMomentsListWithUserIdCollection(
			String userId, String collection);

	@Generated
	@Selector("queryForMomentsRemoveWithIdentifier:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForMomentsRemoveWithIdentifier(
			String identifier);

	@Generated
	@Selector("queryForPeopleGetWithUserId:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForPeopleGetWithUserId(String userId);

	@Generated
	@Selector("queryForPeopleListByActivityWithActivityId:collection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForPeopleListByActivityWithActivityIdCollection(
			String activityId, String collection);

	@Generated
	@Selector("queryForPeopleListWithUserId:collection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForPeopleListWithUserIdCollection(
			String userId, String collection);

	@Generated
	@Selector("queryForPeopleSearchWithQuery:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object queryForPeopleSearchWithQuery(String query);

	@Generated
	@Selector("queryWithMethodName:")
	public static native GTLQueryPlus queryWithMethodName(String methodName);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setActivityId:")
	public native void setActivityId(String value);

	@Generated
	@Selector("setCollection:")
	public native void setCollection(String value);

	@Generated
	@Selector("setCommentId:")
	public native void setCommentId(String value);

	@Generated
	@Selector("setDebug:")
	public native void setDebug(boolean value);

	@Generated
	@Selector("setFields:")
	public native void setFields(String value);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setLanguage:")
	public native void setLanguage(String value);

	@Generated
	@Selector("setMaxResults:")
	public native void setMaxResults(@NUInt long value);

	@Generated
	@Selector("setOrderBy:")
	public native void setOrderBy(String value);

	@Generated
	@Selector("setPageToken:")
	public native void setPageToken(String value);

	@Generated
	@Selector("setQuery:")
	public native void setQuery(String value);

	@Generated
	@Selector("setSortOrder:")
	public native void setSortOrder(String value);

	@Generated
	@Selector("setTargetUrl:")
	public native void setTargetUrl(String value);

	@Generated
	@Selector("setType:")
	public native void setType(String value);

	@Generated
	@Selector("setUserId:")
	public native void setUserId(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("sortOrder")
	public native String sortOrder();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("targetUrl")
	public native String targetUrl();

	@Generated
	@Selector("type")
	public native String type();

	@Generated
	@Selector("userId")
	public native String userId();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}