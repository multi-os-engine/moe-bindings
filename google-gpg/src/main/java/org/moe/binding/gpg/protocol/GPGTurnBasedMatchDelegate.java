package org.moe.binding.gpg.protocol;


import apple.foundation.NSError;
import org.moe.binding.gpg.GPGTurnBasedMatch;
import org.moe.binding.gpg.GPGTurnBasedParticipant;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPGTurnBasedMatchDelegate")
public interface GPGTurnBasedMatchDelegate {
	@Generated
	@IsOptional
	@Selector("didReceiveTurnBasedInviteForMatch:participant:fromPushNotification:")
	default void didReceiveTurnBasedInviteForMatchParticipantFromPushNotification(
			GPGTurnBasedMatch match, GPGTurnBasedParticipant participant,
			boolean fromPushNotification) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didReceiveTurnEventForMatch:participant:fromPushNotification:")
	default void didReceiveTurnEventForMatchParticipantFromPushNotification(
			GPGTurnBasedMatch match, GPGTurnBasedParticipant participant,
			boolean fromPushNotification) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("failedToProcessMatchUpdate:error:")
	default void failedToProcessMatchUpdateError(GPGTurnBasedMatch match,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("matchEnded:participant:fromPushNotification:")
	default void matchEndedParticipantFromPushNotification(
			GPGTurnBasedMatch match, GPGTurnBasedParticipant participant,
			boolean fromPushNotification) {
		throw new java.lang.UnsupportedOperationException();
	}
}