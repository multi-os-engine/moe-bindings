package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.binding.gpg.protocol.GPGLauncherDelegate;
import org.moe.binding.gpg.protocol.GPGPlayerPickerLauncherDelegate;
import org.moe.binding.gpg.protocol.GPGQuestListLauncherDelegate;
import org.moe.binding.gpg.protocol.GPGSnapshotListLauncherDelegate;
import org.moe.binding.gpg.protocol.GPGTurnBasedMatchListLauncherDelegate;
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
public class GPGLauncherController extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGLauncherController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGLauncherController alloc();

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
	@Selector("dismissAnimated:completionHandler:")
	public native void dismissAnimatedCompletionHandler(
			boolean animated,
			@ObjCBlock(name = "call_dismissAnimatedCompletionHandler") Block_dismissAnimatedCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_dismissAnimatedCompletionHandler {
		@Generated
		void call_dismissAnimatedCompletionHandler();
	}

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GPGLauncherController init();

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
	@Selector("launcherDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGLauncherDelegate launcherDelegate();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("playerPickerLauncherDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGPlayerPickerLauncherDelegate playerPickerLauncherDelegate();

	@Generated
	@Selector("presentAchievementList")
	public native void presentAchievementList();

	@Generated
	@Selector("presentLeaderboardList")
	public native void presentLeaderboardList();

	@Generated
	@Selector("presentLeaderboardWithLeaderboardId:")
	public native void presentLeaderboardWithLeaderboardId(String leaderboardId);

	@Generated
	@Selector("presentLeaderboardWithLeaderboardId:andTimeScope:")
	public native void presentLeaderboardWithLeaderboardIdAndTimeScope(
			String leaderboardId, @NInt long timeScope);

	@Generated
	@Selector("presentPlayerPicker")
	public native void presentPlayerPicker();

	@Generated
	@Selector("presentQuestList")
	public native void presentQuestList();

	@Generated
	@Selector("presentQuestListWithQuestId:")
	public native void presentQuestListWithQuestId(String questId);

	@Generated
	@Selector("presentRealTimeInviteWithMinPlayers:maxPlayers:")
	public native void presentRealTimeInviteWithMinPlayersMaxPlayers(
			int minPlayers, int maxPlayers);

	@Generated
	@Selector("presentRealTimeInviteWithMinPlayers:maxPlayers:exclusiveBitMask:variant:")
	public native void presentRealTimeInviteWithMinPlayersMaxPlayersExclusiveBitMaskVariant(
			int minPlayers, int maxPlayers, long exclusiveBitMask, int variant);

	@Generated
	@Selector("presentRealTimeInvitesWithRoomDataList:")
	public native void presentRealTimeInvitesWithRoomDataList(
			NSArray<?> roomDataList);

	@Generated
	@Selector("presentRealTimeWaitingRoomWithConfig:")
	public native void presentRealTimeWaitingRoomWithConfig(
			GPGMultiplayerConfig config);

	@Generated
	@Selector("presentRealTimeWaitingRoomWithRoomData:")
	public native void presentRealTimeWaitingRoomWithRoomData(
			GPGRealTimeRoomData roomData);

	@Generated
	@Selector("presentSettings")
	public native void presentSettings();

	@Generated
	@Selector("presentSnapshotList")
	public native void presentSnapshotList();

	@Generated
	@Selector("presentTurnBasedMatchList")
	public native void presentTurnBasedMatchList();

	@Generated
	@Selector("presentTurnBasedMatchListWithMatches:")
	public native void presentTurnBasedMatchListWithMatches(NSArray<?> matches);

	@Generated
	@Selector("presentingLauncherType")
	@NInt
	public native long presentingLauncherType();

	@Generated
	@Selector("questListLauncherDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGQuestListLauncherDelegate questListLauncherDelegate();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setLauncherDelegate:")
	public native void setLauncherDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGLauncherDelegate value);

	@Generated
	public void setLauncherDelegate(
			@Mapped(ObjCObjectMapper.class) GPGLauncherDelegate value) {
		Object __old = launcherDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setLauncherDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setPlayerPickerLauncherDelegate:")
	public native void setPlayerPickerLauncherDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGPlayerPickerLauncherDelegate value);

	@Generated
	public void setPlayerPickerLauncherDelegate(
			@Mapped(ObjCObjectMapper.class) GPGPlayerPickerLauncherDelegate value) {
		Object __old = playerPickerLauncherDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setPlayerPickerLauncherDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setQuestListLauncherDelegate:")
	public native void setQuestListLauncherDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGQuestListLauncherDelegate value);

	@Generated
	public void setQuestListLauncherDelegate(
			@Mapped(ObjCObjectMapper.class) GPGQuestListLauncherDelegate value) {
		Object __old = questListLauncherDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setQuestListLauncherDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setSnapshotListLauncherDelegate:")
	public native void setSnapshotListLauncherDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGSnapshotListLauncherDelegate value);

	@Generated
	public void setSnapshotListLauncherDelegate(
			@Mapped(ObjCObjectMapper.class) GPGSnapshotListLauncherDelegate value) {
		Object __old = snapshotListLauncherDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setSnapshotListLauncherDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setTurnBasedMatchListLauncherDelegate:")
	public native void setTurnBasedMatchListLauncherDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPGTurnBasedMatchListLauncherDelegate value);

	@Generated
	public void setTurnBasedMatchListLauncherDelegate(
			@Mapped(ObjCObjectMapper.class) GPGTurnBasedMatchListLauncherDelegate value) {
		Object __old = turnBasedMatchListLauncherDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setTurnBasedMatchListLauncherDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("sharedInstance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedInstance();

	@Generated
	@Selector("snapshotListLauncherDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGSnapshotListLauncherDelegate snapshotListLauncherDelegate();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("turnBasedMatchListLauncherDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPGTurnBasedMatchListLauncherDelegate turnBasedMatchListLauncherDelegate();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}