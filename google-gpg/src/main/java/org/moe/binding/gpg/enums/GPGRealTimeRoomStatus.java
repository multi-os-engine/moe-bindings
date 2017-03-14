package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGRealTimeRoomStatus {
	@Generated
	private GPGRealTimeRoomStatus() {
	}

	@Generated
	@NInt
	public static final long Inviting = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Connecting = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long AutoMatching = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long Active = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long Deleted = 0x0000000000000004L;
}