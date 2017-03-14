package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGQuestState {
	@Generated
	private GPGQuestState() {
	}

	@Generated
	@NInt
	public static final long Upcoming = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Open = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Accepted = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long Completed = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long Expired = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long Failed = 0x0000000000000005L;
}