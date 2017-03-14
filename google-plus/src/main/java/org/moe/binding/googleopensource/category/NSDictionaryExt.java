package org.moe.binding.googleopensource.category;


import apple.foundation.NSDictionary;
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
@ObjCCategory(NSDictionary.class)
public final class NSDictionaryExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSDictionaryExt() {
	}

	@Generated
	@Selector("gtm_dictionaryWithHttpArgumentsString:")
	@CategoryClassMethod
	public static native NSDictionary<?, ?> gtm_dictionaryWithHttpArgumentsString(
			String argString);

	@Generated
	@Selector("gtm_httpArgumentsString")
	public static native String gtm_httpArgumentsString(
			NSDictionary<?, ?> _object);
}