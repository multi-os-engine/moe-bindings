package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGLeaderboardTimeScope {
	@Generated
	private GPGLeaderboardTimeScope() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
	@Generated
	@NInt
	public static final long Today = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long ThisWeek = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long AllTime = 0x0000000000000003L;
}