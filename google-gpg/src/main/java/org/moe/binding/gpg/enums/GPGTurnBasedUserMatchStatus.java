package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGTurnBasedUserMatchStatus {
	@Generated
	private GPGTurnBasedUserMatchStatus() {
	}

	@Generated
	@NInt
	public static final long Invited = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long AwaitingTurn = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Turn = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long MatchCompleted = 0x0000000000000003L;
}