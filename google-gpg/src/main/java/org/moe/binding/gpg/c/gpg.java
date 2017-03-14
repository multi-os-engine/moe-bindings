package org.moe.binding.gpg.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("gpg")
@Runtime(CRuntime.class)
public final class gpg {
	static {
		NatJ.register();
	}

	@Generated
	private gpg() {
	}

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GPGErrorDomain();

	@Generated
	@CVariable()
	public static native int kGPGMultiplayerVariantDefault();

	@Generated
	@CVariable()
	public static native int kGPGMultiplayerVariantMin();

	@Generated
	@CVariable()
	public static native int kGPGRealTimeMinPlayers();

	@Generated
	@CVariable()
	public static native int kGPGRealTimeMaxPlayers();

	@Generated
	@CVariable()
	public static native int kGPGRealTimeInvalidReliableSendId();

	@Generated
	@CVariable()
	public static native int kGPGTurnBasedMinPlayers();

	@Generated
	@CVariable()
	public static native int kGPGTurnBasedMaxPlayers();

	@Generated
	@CVariable()
	public static native int kGPGTurnBasedParticipantResultPlacingUninitialized();
}