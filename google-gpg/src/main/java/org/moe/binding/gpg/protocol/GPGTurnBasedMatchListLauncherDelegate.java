package org.moe.binding.gpg.protocol;


import org.moe.binding.gpg.GPGTurnBasedMatch;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPGTurnBasedMatchListLauncherDelegate")
public interface GPGTurnBasedMatchListLauncherDelegate {
	@Generated
	@IsOptional
	@Selector("turnBasedMatchListLauncherDidDeclineMatch:")
	default void turnBasedMatchListLauncherDidDeclineMatch(
			GPGTurnBasedMatch match) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("turnBasedMatchListLauncherDidJoinMatch:")
	void turnBasedMatchListLauncherDidJoinMatch(GPGTurnBasedMatch match);

	@Generated
	@Selector("turnBasedMatchListLauncherDidRematch:")
	void turnBasedMatchListLauncherDidRematch(GPGTurnBasedMatch match);

	@Generated
	@Selector("turnBasedMatchListLauncherDidSelectMatch:")
	void turnBasedMatchListLauncherDidSelectMatch(GPGTurnBasedMatch match);
}