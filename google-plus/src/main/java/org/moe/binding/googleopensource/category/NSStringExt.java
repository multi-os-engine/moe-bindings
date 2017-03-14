package org.moe.binding.googleopensource.category;


import apple.foundation.NSString;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCCategory;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSString.class)
public final class NSStringExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSStringExt() {
	}

	@Generated
	@Selector("gtm_stringByEscapingForURLArgument")
	public static native String gtm_stringByEscapingForURLArgument(
			String _object);

	@Generated
	@Selector("gtm_stringByUnescapingFromURLArgument")
	public static native String gtm_stringByUnescapingFromURLArgument(
			String _object);
}