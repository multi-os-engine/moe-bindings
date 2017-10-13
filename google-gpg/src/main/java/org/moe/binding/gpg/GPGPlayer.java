package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
public class GPGPlayer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGPlayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGPlayer alloc();

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
	@Selector("connectedPlayersFromDataSource:completionHandler:")
	public static native void connectedPlayersFromDataSourceCompletionHandler(
			int dataSource,
			@ObjCBlock(name = "call_connectedPlayersFromDataSourceCompletionHandler") Block_connectedPlayersFromDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_connectedPlayersFromDataSourceCompletionHandler {
		@Generated
		void call_connectedPlayersFromDataSourceCompletionHandler(
				NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Selector("connectedPlayersWithCompletionHandler:")
	public static native void connectedPlayersWithCompletionHandler(
			@ObjCBlock(name = "call_connectedPlayersWithCompletionHandler") Block_connectedPlayersWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_connectedPlayersWithCompletionHandler {
		@Generated
		void call_connectedPlayersWithCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("currentExperiencePoints")
	public native long currentExperiencePoints();

	@Generated
	@Selector("currentLevel")
	public native GPGPlayerLevel currentLevel();

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
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("imageUrl")
	public native NSURL imageUrl();

	@Generated
	@Selector("init")
	public native GPGPlayer init();

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
	@Selector("lastLevelUpTimestamp")
	public native long lastLevelUpTimestamp();

	@Generated
	@Selector("localPlayerFromDataSource:completionHandler:")
	public static native void localPlayerFromDataSourceCompletionHandler(
			int dataSource,
			@ObjCBlock(name = "call_localPlayerFromDataSourceCompletionHandler") Block_localPlayerFromDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_localPlayerFromDataSourceCompletionHandler {
		@Generated
		void call_localPlayerFromDataSourceCompletionHandler(GPGPlayer arg0,
				NSError arg1);
	}

	@Generated
	@Selector("localPlayerWithCompletionHandler:")
	public static native void localPlayerWithCompletionHandler(
			@ObjCBlock(name = "call_localPlayerWithCompletionHandler") Block_localPlayerWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_localPlayerWithCompletionHandler {
		@Generated
		void call_localPlayerWithCompletionHandler(GPGPlayer arg0, NSError arg1);
	}

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("nextLevel")
	public native GPGPlayerLevel nextLevel();

	@Generated
	@Selector("playerId")
	public native String playerId();

	@Generated
	@Selector("recentlyPlayedPlayersFromDataSource:completionHandler:")
	public static native void recentlyPlayedPlayersFromDataSourceCompletionHandler(
			int dataSource,
			@ObjCBlock(name = "call_recentlyPlayedPlayersFromDataSourceCompletionHandler") Block_recentlyPlayedPlayersFromDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_recentlyPlayedPlayersFromDataSourceCompletionHandler {
		@Generated
		void call_recentlyPlayedPlayersFromDataSourceCompletionHandler(
				NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Selector("recentlyPlayedPlayersWithCompletionHandler:")
	public static native void recentlyPlayedPlayersWithCompletionHandler(
			@ObjCBlock(name = "call_recentlyPlayedPlayersWithCompletionHandler") Block_recentlyPlayedPlayersWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_recentlyPlayedPlayersWithCompletionHandler {
		@Generated
		void call_recentlyPlayedPlayersWithCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

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
	@Selector("version")
	@NInt
	public static native long version_static();
}