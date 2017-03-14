package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTMCookieStorageProtocol")
public interface GTMCookieStorageProtocol {
	@Generated
	@Selector("cookiesForURL:")
	NSArray<?> cookiesForURL(NSURL theURL);

	@Generated
	@Selector("setCookies:")
	void setCookies(NSArray<?> newCookies);
}