package org.moe.binding.googleplus.protocol;


import org.moe.binding.googleplus.GPPDeepLink;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GooglePlus")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPPDeepLinkDelegate")
public interface GPPDeepLinkDelegate {
	@Generated
	@Selector("didReceiveDeepLink:")
	void didReceiveDeepLink(GPPDeepLink deepLink);
}