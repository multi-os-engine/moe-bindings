package org.moe.binding.googleopensource.category;


import apple.foundation.NSFileHandle;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.CategoryClassMethod;
import org.moe.natj.objc.ann.ObjCCategory;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSFileHandle.class)
public final class NSFileHandleExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSFileHandleExt() {
	}

	@Generated
	@Selector("fileHandleForLoggingAtPath:mode:")
	@CategoryClassMethod
	public static native NSFileHandle fileHandleForLoggingAtPathMode(
			String path, char mode);
}