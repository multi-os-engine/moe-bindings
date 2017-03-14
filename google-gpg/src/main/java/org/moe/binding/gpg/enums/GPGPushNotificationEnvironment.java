package org.moe.binding.gpg.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GPGPushNotificationEnvironment {
	@Generated
	private GPGPushNotificationEnvironment() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Production = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Sandbox = 0x0000000000000002L;
}