package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGTurnBasedParticipantResultStatus {
	@Generated
	private GPGTurnBasedParticipantResultStatus() {
	}

	@Generated
	@NInt
	public static final long Uninitialized = 0xFFFFFFFFFFFFFFFFL;
	@Generated
	@NInt
	public static final long Win = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Loss = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Tie = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long None = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long Disconnect = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long Disagreed = 0x0000000000000005L;
}