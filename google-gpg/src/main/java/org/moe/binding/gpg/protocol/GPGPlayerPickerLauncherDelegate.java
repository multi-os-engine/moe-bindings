package org.moe.binding.gpg.protocol;


import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPGPlayerPickerLauncherDelegate")
public interface GPGPlayerPickerLauncherDelegate {
	@Generated
	@Selector("maxPlayersForPlayerPickerLauncher")
	int maxPlayersForPlayerPickerLauncher();

	@Generated
	@Selector("minPlayersForPlayerPickerLauncher")
	int minPlayersForPlayerPickerLauncher();

	@Generated
	@Selector("playerPickerLauncherDidPickPlayers:autoPickPlayerCount:")
	void playerPickerLauncherDidPickPlayersAutoPickPlayerCount(
			NSArray<?> players, int autoPickPlayerCount);
}