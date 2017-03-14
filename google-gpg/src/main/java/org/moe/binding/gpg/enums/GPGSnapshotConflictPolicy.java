package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGSnapshotConflictPolicy {
	@Generated
	private GPGSnapshotConflictPolicy() {
	}

	@Generated
	@NInt
	public static final long Manual = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long LongestPlaytime = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long LastKnownGood = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long MostRecentlyModified = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long HighestProgress = 0x0000000000000004L;
}