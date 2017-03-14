package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.binding.gpg.protocol.GPGQuestDelegate;
import org.moe.binding.gpg.protocol.GPGRealTimeRoomDelegate;
import org.moe.binding.gpg.protocol.GPGStatusDelegate;
import org.moe.binding.gpg.protocol.GPGTurnBasedMatchDelegate;
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
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GPGManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("achievementUnlockedOffset")
	@NUInt
	public native long achievementUnlockedOffset();

	@Generated
	@Selector("achievementUnlockedToastPlacement")
	@NInt
	public native long achievementUnlockedToastPlacement();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGManager alloc();

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
	public native GPGManager init();

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
	@Selector("isRevisionValid")
	public native boolean isRevisionValid();

	@Generated
	@Selector("isSignedIn")
	public native boolean isSignedIn();

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
	@Selector("questCompletedOffset")
	@NUInt
	public native long questCompletedOffset();

	@Generated
	@Selector("questCompletedToastPlacement")
	@NInt
	public native long questCompletedToastPlacement();

	@Generated
	@Selector("questDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGQuestDelegate questDelegate();

	@Generated
	@Selector("realTimeRoomDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGRealTimeRoomDelegate realTimeRoomDelegate();

	@Generated
	@Selector("refreshRevisionStatus:")
	public native void refreshRevisionStatus(
			@ObjCBlock(name = "call_refreshRevisionStatus") Block_refreshRevisionStatus revisionCheckHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_refreshRevisionStatus {
		@Generated
		void call_refreshRevisionStatus(@NInt long arg0, NSError arg1);
	}

	@Generated
	@Selector("registerDeviceToken:forEnvironment:")
	public native void registerDeviceTokenForEnvironment(
			NSData deviceTokenData, @NInt long environment);

	@Generated
	@Selector("registerForInteractiveGamesNotificationsWithType:")
	public static native void registerForInteractiveGamesNotificationsWithType(
			@NUInt long type);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("revisionStatus")
	@NInt
	public native long revisionStatus();

	@Generated
	@Selector("sdkTag")
	@NUInt
	public native long sdkTag();

	@Generated
	@Selector("setAchievementUnlockedOffset:")
	public native void setAchievementUnlockedOffset(@NUInt long value);

	@Generated
	@Selector("setAchievementUnlockedToastPlacement:")
	public native void setAchievementUnlockedToastPlacement(@NInt long value);

	@Generated
	@Selector("setQuestCompletedOffset:")
	public native void setQuestCompletedOffset(@NUInt long value);

	@Generated
	@Selector("setQuestCompletedToastPlacement:")
	public native void setQuestCompletedToastPlacement(@NInt long value);

	@Generated
	@Selector("setQuestDelegate:")
	public native void setQuestDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGQuestDelegate value);

	@Generated
	public void setQuestDelegate(
			@Mapped(ObjCObjectMapper.class) GPGQuestDelegate value) {
		Object __old = questDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setQuestDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setRealTimeRoomDelegate:")
	public native void setRealTimeRoomDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGRealTimeRoomDelegate value);

	@Generated
	public void setRealTimeRoomDelegate(
			@Mapped(ObjCObjectMapper.class) GPGRealTimeRoomDelegate value) {
		Object __old = realTimeRoomDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setRealTimeRoomDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setSdkTag:")
	public native void setSdkTag(@NUInt long value);

	@Generated
	@Selector("setSnapshotsEnabled:")
	public native void setSnapshotsEnabled(boolean value);

	@Generated
	@Selector("setStatusDelegate:")
	public native void setStatusDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGStatusDelegate value);

	@Generated
	public void setStatusDelegate(
			@Mapped(ObjCObjectMapper.class) GPGStatusDelegate value) {
		Object __old = statusDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setStatusDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setTurnBasedMatchDelegate:")
	public native void setTurnBasedMatchDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGTurnBasedMatchDelegate value);

	@Generated
	public void setTurnBasedMatchDelegate(
			@Mapped(ObjCObjectMapper.class) GPGTurnBasedMatchDelegate value) {
		Object __old = turnBasedMatchDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setTurnBasedMatchDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Deprecated
	@Selector("setValidOrientationFlags:")
	public native void setValidOrientationFlags(@NUInt long value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setWelcomeBackOffset:")
	public native void setWelcomeBackOffset(@NUInt long value);

	@Generated
	@Selector("setWelcomeBackToastPlacement:")
	public native void setWelcomeBackToastPlacement(@NInt long value);

	@Generated
	@Selector("sharedInstance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedInstance();

	@Generated
	@Selector("signIn")
	public native void signIn();

	@Generated
	@Selector("signInWithClientID:silently:")
	public native boolean signInWithClientIDSilently(String clientID,
			boolean silently);

	@Generated
	@Selector("signInWithClientID:silently:withExtraScopes:")
	public native boolean signInWithClientIDSilentlyWithExtraScopes(
			String clientID, boolean silently, NSArray<?> scopes);

	@Generated
	@Selector("signOut")
	public native void signOut();

	@Generated
	@Selector("snapshotsEnabled")
	public native boolean snapshotsEnabled();

	@Generated
	@Selector("statusDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGStatusDelegate statusDelegate();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("tryHandleRemoteNotification:")
	public native boolean tryHandleRemoteNotification(
			NSDictionary<?, ?> userInfo);

	@Generated
	@Selector("tryHandleRemoteNotification:forActionWithIdentifier:completionHandler:")
	public native boolean tryHandleRemoteNotificationForActionWithIdentifierCompletionHandler(
			NSDictionary<?, ?> userInfo,
			String identifier,
			@ObjCBlock(name = "call_tryHandleRemoteNotificationForActionWithIdentifierCompletionHandler") Block_tryHandleRemoteNotificationForActionWithIdentifierCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_tryHandleRemoteNotificationForActionWithIdentifierCompletionHandler {
		@Generated
		void call_tryHandleRemoteNotificationForActionWithIdentifierCompletionHandler();
	}

	@Generated
	@Selector("turnBasedMatchDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGTurnBasedMatchDelegate turnBasedMatchDelegate();

	@Generated
	@Selector("unregisterCurrentDeviceToken")
	public native void unregisterCurrentDeviceToken();

	@Generated
	@Deprecated
	@Selector("validOrientationFlags")
	@NUInt
	public native long validOrientationFlags();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("welcomeBackOffset")
	@NUInt
	public native long welcomeBackOffset();

	@Generated
	@Selector("welcomeBackToastPlacement")
	@NInt
	public native long welcomeBackToastPlacement();
}