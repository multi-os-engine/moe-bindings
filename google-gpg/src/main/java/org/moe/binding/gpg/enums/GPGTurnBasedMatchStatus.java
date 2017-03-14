package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGTurnBasedMatchStatus {
	@Generated
	private GPGTurnBasedMatchStatus() {
	}

	@Generated
	@NInt
	public static final long AutoMatching = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Active = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Complete = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long Canceled = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long Expired = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long Deleted = 0x0000000000000005L;
}