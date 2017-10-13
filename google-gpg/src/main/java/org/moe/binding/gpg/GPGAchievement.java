package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GPGAchievement extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGAchievement(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("achievementId")
	public native String achievementId();

	@Generated
	@Selector("achievementWithId:")
	public static native GPGAchievement achievementWithId(String achievementId);

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGAchievement alloc();

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
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("incrementAchievementNumSteps:completionHandler:")
	public native void incrementAchievementNumStepsCompletionHandler(
			@NInt long steps,
			@ObjCBlock(name = "call_incrementAchievementNumStepsCompletionHandler") Block_incrementAchievementNumStepsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_incrementAchievementNumStepsCompletionHandler {
		@Generated
		void call_incrementAchievementNumStepsCompletionHandler(boolean arg0,
				int arg1, NSError arg2);
	}

	@Generated
	@Selector("init")
	public native GPGAchievement init();

	@Generated
	@Selector("initWithAchievementId:")
	public native GPGAchievement initWithAchievementId(String achievementId);

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
	@Selector("resetAchievementWithCompletionHandler:")
	public native void resetAchievementWithCompletionHandler(
			@ObjCBlock(name = "call_resetAchievementWithCompletionHandler") Block_resetAchievementWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_resetAchievementWithCompletionHandler {
		@Generated
		void call_resetAchievementWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("resetAllAchievementsWithCompletionHandler:")
	public static native void resetAllAchievementsWithCompletionHandler(
			@ObjCBlock(name = "call_resetAllAchievementsWithCompletionHandler") Block_resetAllAchievementsWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_resetAllAchievementsWithCompletionHandler {
		@Generated
		void call_resetAllAchievementsWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("revealAchievementWithCompletionHandler:")
	public native void revealAchievementWithCompletionHandler(
			@ObjCBlock(name = "call_revealAchievementWithCompletionHandler") Block_revealAchievementWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_revealAchievementWithCompletionHandler {
		@Generated
		void call_revealAchievementWithCompletionHandler(@NInt long arg0,
				NSError arg1);
	}

	@Generated
	@Selector("setShowsCompletionNotification:")
	public native void setShowsCompletionNotification(boolean value);

	@Generated
	@Selector("setSteps:completionHandler:")
	public native void setStepsCompletionHandler(
			@NInt long steps,
			@ObjCBlock(name = "call_setStepsCompletionHandler") Block_setStepsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setStepsCompletionHandler {
		@Generated
		void call_setStepsCompletionHandler(boolean arg0, int arg1, NSError arg2);
	}

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("showsCompletionNotification")
	public native boolean showsCompletionNotification();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("unlockAchievementWithCompletionHandler:")
	public native void unlockAchievementWithCompletionHandler(
			@ObjCBlock(name = "call_unlockAchievementWithCompletionHandler") Block_unlockAchievementWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_unlockAchievementWithCompletionHandler {
		@Generated
		void call_unlockAchievementWithCompletionHandler(boolean arg0,
				NSError arg1);
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}