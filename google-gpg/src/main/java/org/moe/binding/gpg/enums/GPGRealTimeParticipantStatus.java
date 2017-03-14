package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGRealTimeParticipantStatus {
	@Generated
	private GPGRealTimeParticipantStatus() {
	}

	@Generated
	@NInt
	public static final long Invited = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Joined = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Declined = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long Left = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long ConnectionEstablished = 0x0000000000000004L;
}