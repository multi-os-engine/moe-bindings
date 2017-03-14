package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGQuestMilestoneState {
	@Generated
	private GPGQuestMilestoneState() {
	}

	@Generated
	@NInt
	public static final long NotStarted = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long NotCompleted = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long CompletedNotClaimed = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long Claimed = 0x0000000000000003L;
}