package org.moe.binding.gpg.protocol;


import apple.uikit.UIViewController;
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
@ObjCProtocolName("GPGLauncherDelegate")
public interface GPGLauncherDelegate {
	@Generated
	@IsOptional
	@Selector("launcherDidAppear")
	default void launcherDidAppear() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("launcherDidDisappear")
	default void launcherDidDisappear() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("launcherDismissed")
	default void launcherDismissed() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("launcherWillAppear")
	default void launcherWillAppear() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("launcherWillDisappear")
	default void launcherWillDisappear() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Deprecated
	@Selector("presentingViewControllerForLauncher")
	default UIViewController presentingViewControllerForLauncher() {
		throw new java.lang.UnsupportedOperationException();
	}
}