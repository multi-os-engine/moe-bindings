package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCoding;
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
public class GPGScore extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGScore(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGScore alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Deprecated
	@Selector("avatarUrl")
	public native NSURL avatarUrl();

	@Generated
	@Selector("batchSubmitScores:completionHandler:")
	public static native void batchSubmitScoresCompletionHandler(
			NSArray<?> scores,
			@ObjCBlock(name = "call_batchSubmitScoresCompletionHandler") Block_batchSubmitScoresCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_batchSubmitScoresCompletionHandler {
		@Generated
		void call_batchSubmitScoresCompletionHandler(GPGScoreReport arg0,
				NSError arg1);
	}

	@Generated
	@Deprecated
	@Selector("batchSubmitScores:withCompletionHandler:")
	public static native void batchSubmitScoresWithCompletionHandler(
			NSArray<?> scores,
			@ObjCBlock(name = "call_batchSubmitScoresWithCompletionHandler") Block_batchSubmitScoresWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_batchSubmitScoresWithCompletionHandler {
		@Generated
		void call_batchSubmitScoresWithCompletionHandler(GPGScoreReport arg0,
				NSError arg1);
	}

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
	@Deprecated
	@Selector("displayName")
	public native String displayName();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("formattedRank")
	public native String formattedRank();

	@Generated
	@Selector("formattedScore")
	public native String formattedScore();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GPGScore init();

	@Generated
	@Selector("initWithCoder:")
	public native GPGScore initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithLeaderboardId:")
	public native GPGScore initWithLeaderboardId(String leaderboardId);

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
	@Selector("leaderboardId")
	public native String leaderboardId();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("player")
	public native GPGPlayer player();

	@Generated
	@Deprecated
	@Selector("playerId")
	public native String playerId();

	@Generated
	@Selector("rank")
	public native long rank();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("scoreTag")
	public native String scoreTag();

	@Generated
	@Selector("scoreWithLeaderboardId:")
	public static native GPGScore scoreWithLeaderboardId(String leaderboardId);

	@Generated
	@Selector("setScoreTag:")
	public native void setScoreTag(String value);

	@Generated
	@Selector("setValue:")
	public native void setValue(long value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("submitScoreWithCompletionHandler:")
	public native boolean submitScoreWithCompletionHandler(
			@ObjCBlock(name = "call_submitScoreWithCompletionHandler") Block_submitScoreWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_submitScoreWithCompletionHandler {
		@Generated
		void call_submitScoreWithCompletionHandler(GPGScoreReport arg0,
				NSError arg1);
	}

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("timeSpan")
	public native String timeSpan();

	@Generated
	@Selector("value")
	public native long value();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("writeTimestamp")
	public native long writeTimestamp();
}