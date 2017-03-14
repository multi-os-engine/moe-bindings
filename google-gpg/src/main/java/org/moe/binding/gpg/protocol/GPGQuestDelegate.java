package org.moe.binding.gpg.protocol;


import org.moe.binding.gpg.GPGQuest;
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
@ObjCProtocolName("GPGQuestDelegate")
public interface GPGQuestDelegate {
	@Generated
	@IsOptional
	@Selector("didCompleteQuest:")
	default void didCompleteQuest(GPGQuest quest) {
		throw new java.lang.UnsupportedOperationException();
	}
}