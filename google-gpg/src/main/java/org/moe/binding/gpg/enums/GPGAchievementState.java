package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGAchievementState {
	@Generated
	private GPGAchievementState() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
	@Generated
	@NInt
	public static final long Hidden = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Revealed = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Unlocked = 0x0000000000000002L;
}