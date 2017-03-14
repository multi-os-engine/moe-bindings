package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGTurnBasedParticipantStatus {
	@Generated
	private GPGTurnBasedParticipantStatus() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
	@Generated
	@NInt
	public static final long NotInvited = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Invited = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Joined = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long Declined = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long Left = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long Finished = 0x0000000000000005L;
	@Generated
	@NInt
	public static final long Unresponsive = 0x0000000000000006L;
}