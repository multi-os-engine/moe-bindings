package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGRealTimeRoomCreationResult {
	@Generated
	private GPGRealTimeRoomCreationResult() {
	}

	@Generated
	@NInt
	public static final long Success = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long FailedMissingCreationData = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long FailedMissingDelegate = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long FailedInvalidVariant = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long FailedInvalidAutoMatchCount = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long FailedInvalidPlayerCount = 0x0000000000000005L;
	@Generated
	@NInt
	public static final long FailedRoomNotInviting = 0x0000000000000006L;
	@Generated
	@NInt
	public static final long FailedMultiplayerNotEnabled = 0x0000000000000007L;
	@Generated
	@NInt
	public static final long FailedNotSignedIn = 0x0000000000000008L;
	@Generated
	@NInt
	public static final long FailedNotOnline = 0x0000000000000009L;
	@Generated
	@NInt
	public static final long FailedUnknown = 0x000000000000000AL;
}