package org.moe.binding.gpg.protocol;


import apple.foundation.NSError;
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
@ObjCProtocolName("GPGStatusDelegate")
public interface GPGStatusDelegate {
	@Generated
	@IsOptional
	@Selector("didDisconnectWithError:")
	default void didDisconnectWithError(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didFinishGamesSignInWithError:")
	default void didFinishGamesSignInWithError(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didFinishGamesSignOutWithError:")
	default void didFinishGamesSignOutWithError(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didFinishGoogleAuthWithError:")
	default void didFinishGoogleAuthWithError(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("shouldReauthenticateWithError:")
	default boolean shouldReauthenticateWithError(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willReauthenticate:")
	default void willReauthenticate(NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}
}