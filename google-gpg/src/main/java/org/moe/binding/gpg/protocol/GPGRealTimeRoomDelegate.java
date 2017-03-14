package org.moe.binding.gpg.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.binding.gpg.GPGRealTimeParticipant;
import org.moe.binding.gpg.GPGRealTimeRoom;
import org.moe.binding.gpg.GPGRealTimeRoomData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPGRealTimeRoomDelegate")
public interface GPGRealTimeRoomDelegate {
	@Generated
	@IsOptional
	@Selector("didAcceptRealTimeInviteForRoom:")
	default void didAcceptRealTimeInviteForRoom(GPGRealTimeRoomData roomData) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didDeclineRealTimeInviteForRoom:")
	default void didDeclineRealTimeInviteForRoom(GPGRealTimeRoomData roomData) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didReceiveRealTimeInviteForRoom:")
	default void didReceiveRealTimeInviteForRoom(GPGRealTimeRoomData roomData) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("room:didChangeConnectedSet:")
	default void roomDidChangeConnectedSet(GPGRealTimeRoom room,
			boolean connected) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("room:didChangeStatus:")
	default void roomDidChangeStatus(GPGRealTimeRoom room, @NInt long status) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("room:didFailWithError:")
	default void roomDidFailWithError(GPGRealTimeRoom room, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("room:didReceiveData:fromParticipant:dataMode:")
	default void roomDidReceiveDataFromParticipantDataMode(
			GPGRealTimeRoom room, NSData data,
			GPGRealTimeParticipant participant, @NInt long dataMode) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("room:didSendReliableId:results:")
	default void roomDidSendReliableIdResults(GPGRealTimeRoom room,
			int reliableId, NSArray<?> results) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("room:participant:didChangeStatus:")
	default void roomParticipantDidChangeStatus(GPGRealTimeRoom room,
			GPGRealTimeParticipant participant, @NInt long status) {
		throw new java.lang.UnsupportedOperationException();
	}
}