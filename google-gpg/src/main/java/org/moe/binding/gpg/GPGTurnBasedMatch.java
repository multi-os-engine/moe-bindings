package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
public class GPGTurnBasedMatch extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGTurnBasedMatch(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allMatchesFromDataSource:completionHandler:")
	public static native void allMatchesFromDataSourceCompletionHandler(
			int dataSource,
			@ObjCBlock(name = "call_allMatchesFromDataSourceCompletionHandler") Block_allMatchesFromDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_allMatchesFromDataSourceCompletionHandler {
		@Generated
		void call_allMatchesFromDataSourceCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("allMatchesWithCompletionHandler:")
	public static native void allMatchesWithCompletionHandler(
			@ObjCBlock(name = "call_allMatchesWithCompletionHandler") Block_allMatchesWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_allMatchesWithCompletionHandler {
		@Generated
		void call_allMatchesWithCompletionHandler(NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGTurnBasedMatch alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("canParticipantTakeTurn:")
	public native boolean canParticipantTakeTurn(String participantId);

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
	@Selector("cancelWithCompletionHandler:")
	public native void cancelWithCompletionHandler(
			@ObjCBlock(name = "call_cancelWithCompletionHandler") Block_cancelWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_cancelWithCompletionHandler {
		@Generated
		void call_cancelWithCompletionHandler(NSError arg0);
	}

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
	@Selector("createMatchWithConfig:completionHandler:")
	@NInt
	public static native long createMatchWithConfigCompletionHandler(
			GPGMultiplayerConfig config,
			@ObjCBlock(name = "call_createMatchWithConfigCompletionHandler") Block_createMatchWithConfigCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_createMatchWithConfigCompletionHandler {
		@Generated
		void call_createMatchWithConfigCompletionHandler(
				GPGTurnBasedMatch arg0, NSError arg1);
	}

	@Generated
	@Selector("creationParticipant")
	public native GPGTurnBasedParticipant creationParticipant();

	@Generated
	@Selector("creationTimestamp")
	public native long creationTimestamp();

	@Generated
	@Selector("data")
	public native NSData data();

	@Generated
	@Selector("dataAvailable")
	public native boolean dataAvailable();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("declineWithCompletionHandler:")
	public native void declineWithCompletionHandler(
			@ObjCBlock(name = "call_declineWithCompletionHandler") Block_declineWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_declineWithCompletionHandler {
		@Generated
		void call_declineWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("dismissWithCompletionHandler:")
	public native void dismissWithCompletionHandler(
			@ObjCBlock(name = "call_dismissWithCompletionHandler") Block_dismissWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_dismissWithCompletionHandler {
		@Generated
		void call_dismissWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("fetchMatchWithId:includeMatchData:completionHandler:")
	public static native void fetchMatchWithIdIncludeMatchDataCompletionHandler(
			String matchId,
			boolean includeMatchData,
			@ObjCBlock(name = "call_fetchMatchWithIdIncludeMatchDataCompletionHandler") Block_fetchMatchWithIdIncludeMatchDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchMatchWithIdIncludeMatchDataCompletionHandler {
		@Generated
		void call_fetchMatchWithIdIncludeMatchDataCompletionHandler(
				GPGTurnBasedMatch arg0, NSError arg1);
	}

	@Generated
	@Selector("finishWithData:results:completionHandler:")
	public native void finishWithDataResultsCompletionHandler(
			NSData data,
			NSArray<?> results,
			@ObjCBlock(name = "call_finishWithDataResultsCompletionHandler") Block_finishWithDataResultsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_finishWithDataResultsCompletionHandler {
		@Generated
		void call_finishWithDataResultsCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GPGTurnBasedMatch init();

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
	@Selector("inviterParticipant")
	public native GPGTurnBasedParticipant inviterParticipant();

	@Generated
	@Selector("isMyTurn")
	public native boolean isMyTurn();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("joinWithCompletionHandler:")
	public native void joinWithCompletionHandler(
			@ObjCBlock(name = "call_joinWithCompletionHandler") Block_joinWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_joinWithCompletionHandler {
		@Generated
		void call_joinWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("lastUpdateParticipant")
	public native GPGTurnBasedParticipant lastUpdateParticipant();

	@Generated
	@Selector("lastUpdateTimestamp")
	public native long lastUpdateTimestamp();

	@Generated
	@Selector("leaveDuringTurnWithNextParticipantId:completionHandler:")
	public native void leaveDuringTurnWithNextParticipantIdCompletionHandler(
			String nextParticipantId,
			@ObjCBlock(name = "call_leaveDuringTurnWithNextParticipantIdCompletionHandler") Block_leaveDuringTurnWithNextParticipantIdCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_leaveDuringTurnWithNextParticipantIdCompletionHandler {
		@Generated
		void call_leaveDuringTurnWithNextParticipantIdCompletionHandler(
				NSError arg0);
	}

	@Generated
	@Selector("leaveOutOfTurnWithCompletionHandler:")
	public native void leaveOutOfTurnWithCompletionHandler(
			@ObjCBlock(name = "call_leaveOutOfTurnWithCompletionHandler") Block_leaveOutOfTurnWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_leaveOutOfTurnWithCompletionHandler {
		@Generated
		void call_leaveOutOfTurnWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("listForIncludeMatchData:maxCompletedMatches:maxResults:pageToken:completionHandler:")
	public static native void listForIncludeMatchDataMaxCompletedMatchesMaxResultsPageTokenCompletionHandler(
			boolean includeMatchData,
			int maxCompletedMatches,
			int maxResults,
			String pageToken,
			@ObjCBlock(name = "call_listForIncludeMatchDataMaxCompletedMatchesMaxResultsPageTokenCompletionHandler") Block_listForIncludeMatchDataMaxCompletedMatchesMaxResultsPageTokenCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_listForIncludeMatchDataMaxCompletedMatchesMaxResultsPageTokenCompletionHandler {
		@Generated
		void call_listForIncludeMatchDataMaxCompletedMatchesMaxResultsPageTokenCompletionHandler(
				NSArray<?> arg0, String arg1, NSError arg2);
	}

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("localParticipant")
	public native GPGTurnBasedParticipant localParticipant();

	@Generated
	@Selector("localParticipantId")
	public native String localParticipantId();

	@Generated
	@Selector("matchConfig")
	public native GPGMultiplayerConfig matchConfig();

	@Generated
	@Selector("matchDescription")
	public native String matchDescription();

	@Generated
	@Selector("matchId")
	public native String matchId();

	@Generated
	@Selector("matchNumber")
	public native int matchNumber();

	@Generated
	@Selector("matchVersion")
	public native int matchVersion();

	@Generated
	@Selector("matchesForMatchStatus:completionHandler:")
	public static native void matchesForMatchStatusCompletionHandler(
			@NInt long status,
			@ObjCBlock(name = "call_matchesForMatchStatusCompletionHandler") Block_matchesForMatchStatusCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_matchesForMatchStatusCompletionHandler {
		@Generated
		void call_matchesForMatchStatusCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("matchesForMatchStatus:dataSource:completionHandler:")
	public static native void matchesForMatchStatusDataSourceCompletionHandler(
			@NInt long status,
			int dataSource,
			@ObjCBlock(name = "call_matchesForMatchStatusDataSourceCompletionHandler") Block_matchesForMatchStatusDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_matchesForMatchStatusDataSourceCompletionHandler {
		@Generated
		void call_matchesForMatchStatusDataSourceCompletionHandler(
				NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Selector("matchesForUserMatchStatus:completionHandler:")
	public static native void matchesForUserMatchStatusCompletionHandler(
			@NInt long status,
			@ObjCBlock(name = "call_matchesForUserMatchStatusCompletionHandler") Block_matchesForUserMatchStatusCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_matchesForUserMatchStatusCompletionHandler {
		@Generated
		void call_matchesForUserMatchStatusCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("matchesForUserMatchStatus:dataSource:completionHandler:")
	public static native void matchesForUserMatchStatusDataSourceCompletionHandler(
			@NInt long status,
			int dataSource,
			@ObjCBlock(name = "call_matchesForUserMatchStatusDataSourceCompletionHandler") Block_matchesForUserMatchStatusDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_matchesForUserMatchStatusDataSourceCompletionHandler {
		@Generated
		void call_matchesForUserMatchStatusDataSourceCompletionHandler(
				NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Selector("myResult")
	public native GPGTurnBasedParticipantResult myResult();

	@Generated
	@Selector("myStatus")
	@NInt
	public native long myStatus();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("participantForId:")
	public native GPGTurnBasedParticipant participantForId(String participantId);

	@Generated
	@Selector("participantIdForPlayerId:")
	public native String participantIdForPlayerId(String playerId);

	@Generated
	@Selector("participants")
	public native NSArray<?> participants();

	@Generated
	@Selector("pendingParticipant")
	public native GPGTurnBasedParticipant pendingParticipant();

	@Generated
	@Selector("pendingPlayer")
	public native GPGPlayer pendingPlayer();

	@Generated
	@Selector("previousMatchData")
	public native NSData previousMatchData();

	@Generated
	@Selector("previousMatchDataAvailable")
	public native boolean previousMatchDataAvailable();

	@Generated
	@Selector("rematchId")
	public native String rematchId();

	@Generated
	@Selector("rematchWithCompletionHandler:")
	public native void rematchWithCompletionHandler(
			@ObjCBlock(name = "call_rematchWithCompletionHandler") Block_rematchWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_rematchWithCompletionHandler {
		@Generated
		void call_rematchWithCompletionHandler(GPGTurnBasedMatch arg0,
				NSError arg1);
	}

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("resultForParticipantId:")
	public native GPGTurnBasedParticipantResult resultForParticipantId(
			String participantId);

	@Generated
	@Selector("results")
	public native NSArray<?> results();

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("status")
	@NInt
	public native long status();

	@Generated
	@Selector("statusForPlayerId:")
	@NInt
	public native long statusForPlayerId(String playerId);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("takeTurnWithNextParticipantId:data:results:completionHandler:")
	public native void takeTurnWithNextParticipantIdDataResultsCompletionHandler(
			String nextParticipantId,
			NSData data,
			NSArray<?> results,
			@ObjCBlock(name = "call_takeTurnWithNextParticipantIdDataResultsCompletionHandler") Block_takeTurnWithNextParticipantIdDataResultsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_takeTurnWithNextParticipantIdDataResultsCompletionHandler {
		@Generated
		void call_takeTurnWithNextParticipantIdDataResultsCompletionHandler(
				NSError arg0);
	}

	@Generated
	@Selector("userMatchStatus")
	@NInt
	public native long userMatchStatus();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}