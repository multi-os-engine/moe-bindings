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
public class GPGLeaderboard extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGLeaderboard(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGLeaderboard alloc();

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
	@Selector("hasNextPage")
	public native boolean hasNextPage();

	@Generated
	@Selector("hasPreviousPage")
	public native boolean hasPreviousPage();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GPGLeaderboard init();

	@Generated
	@Selector("initWithLeaderboardId:")
	public native GPGLeaderboard initWithLeaderboardId(String leaderboardId);

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
	@Selector("isLoading")
	public native boolean isLoading();

	@Generated
	@Selector("isPersonalWindow")
	public native boolean isPersonalWindow();

	@Generated
	@Selector("isSocial")
	public native boolean isSocial();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("leaderboardId")
	public native String leaderboardId();

	@Generated
	@Selector("leaderboardWithId:")
	public static native GPGLeaderboard leaderboardWithId(String leaderboardId);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("loadNextPageOfScoresWithCompletionHandler:")
	public native void loadNextPageOfScoresWithCompletionHandler(
			@ObjCBlock(name = "call_loadNextPageOfScoresWithCompletionHandler") Block_loadNextPageOfScoresWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadNextPageOfScoresWithCompletionHandler {
		@Generated
		void call_loadNextPageOfScoresWithCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("loadPreviousPageOfScoresWithCompletionHandler:")
	public native void loadPreviousPageOfScoresWithCompletionHandler(
			@ObjCBlock(name = "call_loadPreviousPageOfScoresWithCompletionHandler") Block_loadPreviousPageOfScoresWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadPreviousPageOfScoresWithCompletionHandler {
		@Generated
		void call_loadPreviousPageOfScoresWithCompletionHandler(
				NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Selector("loadScoresFromDataSource:completionHandler:")
	public native void loadScoresFromDataSourceCompletionHandler(
			int dataSource,
			@ObjCBlock(name = "call_loadScoresFromDataSourceCompletionHandler") Block_loadScoresFromDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadScoresFromDataSourceCompletionHandler {
		@Generated
		void call_loadScoresFromDataSourceCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("loadScoresWithCompletionHandler:")
	public native void loadScoresWithCompletionHandler(
			@ObjCBlock(name = "call_loadScoresWithCompletionHandler") Block_loadScoresWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadScoresWithCompletionHandler {
		@Generated
		void call_loadScoresWithCompletionHandler(NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Selector("loadingNextPage")
	public native boolean loadingNextPage();

	@Generated
	@Selector("loadingPreviousPage")
	public native boolean loadingPreviousPage();

	@Generated
	@Selector("localPlayerScore")
	public native GPGLocalPlayerScore localPlayerScore();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resetScoreWithCompletionHandler:")
	public native void resetScoreWithCompletionHandler(
			@ObjCBlock(name = "call_resetScoreWithCompletionHandler") Block_resetScoreWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_resetScoreWithCompletionHandler {
		@Generated
		void call_resetScoreWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("scores")
	public native NSArray<?> scores();

	@Generated
	@Selector("setPersonalWindow:")
	public native void setPersonalWindow(boolean value);

	@Generated
	@Selector("setSocial:")
	public native void setSocial(boolean value);

	@Generated
	@Selector("setTimeScope:")
	public native void setTimeScope(@NInt long value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("timeScope")
	@NInt
	public native long timeScope();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}