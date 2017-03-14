package org.moe.binding.gpg.protocol;


import org.moe.binding.gpg.GPGQuest;
import org.moe.binding.gpg.GPGQuestMilestone;
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
@ObjCProtocolName("GPGQuestListLauncherDelegate")
public interface GPGQuestListLauncherDelegate {
	@Generated
	@Selector("questListLauncherDidAcceptQuest:")
	void questListLauncherDidAcceptQuest(GPGQuest quest);

	@Generated
	@Selector("questListLauncherDidClaimRewardsForQuestMilestone:")
	void questListLauncherDidClaimRewardsForQuestMilestone(
			GPGQuestMilestone milestone);

	@Generated
	@IsOptional
	@Selector("questListLauncherShouldShowQuest:")
	default boolean questListLauncherShouldShowQuest(GPGQuest quest) {
		throw new java.lang.UnsupportedOperationException();
	}
}