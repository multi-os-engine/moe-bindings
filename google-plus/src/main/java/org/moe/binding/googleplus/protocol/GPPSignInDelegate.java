package org.moe.binding.googleplus.protocol;


import apple.foundation.NSError;
import org.moe.binding.googleopensource.GTMOAuth2Authentication;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GooglePlus")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPPSignInDelegate")
public interface GPPSignInDelegate {
	@Generated
	@IsOptional
	@Selector("didDisconnectWithError:")
	default void didDisconnectWithError(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("finishedWithAuth:error:")
	void finishedWithAuthError(GTMOAuth2Authentication auth, NSError error);
}