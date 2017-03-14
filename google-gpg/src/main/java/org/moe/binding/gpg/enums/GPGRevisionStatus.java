package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGRevisionStatus {
	@Generated
	private GPGRevisionStatus() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
	@Generated
	@NInt
	public static final long OK = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Deprecated = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Invalid = 0x0000000000000002L;
}