package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGLeaderboardOrder {
	@Generated
	private GPGLeaderboardOrder() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
	@Generated
	@NInt
	public static final long LargerIsBetter = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long SmallerIsBetter = 0x0000000000000001L;
}