package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSHTTPCookieStorage;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GTMOAuth2SignIn extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMOAuth2SignIn(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("additionalAuthorizationParameters")
	public native NSDictionary<?, ?> additionalAuthorizationParameters();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMOAuth2SignIn alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("authCodeObtained")
	public native void authCodeObtained();

	@Generated
	@Selector("authentication")
	public native GTMOAuth2Authentication authentication();

	@Generated
	@Selector("authorizationURL")
	public native NSURL authorizationURL();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("cancelSigningIn")
	public native void cancelSigningIn();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("cookiesChanged:")
	public native boolean cookiesChanged(NSHTTPCookieStorage cookieStorage);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("finishedSelector")
	public native SEL finishedSelector();

	@Generated
	@Selector("googleAuthorizationURL")
	public static native NSURL googleAuthorizationURL();

	@Generated
	@Selector("googleTokenURL")
	public static native NSURL googleTokenURL();

	@Generated
	@Selector("googleUserInfoURL")
	public static native NSURL googleUserInfoURL();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTMOAuth2SignIn init();

	@Generated
	@Selector("initWithAuthentication:authorizationURL:delegate:webRequestSelector:finishedSelector:")
	public native GTMOAuth2SignIn initWithAuthenticationAuthorizationURLDelegateWebRequestSelectorFinishedSelector(
			GTMOAuth2Authentication auth, NSURL authorizationURL,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL webRequestSelector, SEL finishedSelector);

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("loadFailedWithError:")
	public native boolean loadFailedWithError(NSError error);

	@Generated
	@Selector("nativeClientRedirectURI")
	public static native String nativeClientRedirectURI();

	@Generated
	@Selector("networkLossTimeoutInterval")
	public native double networkLossTimeoutInterval();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("requestRedirectedToRequest:")
	public native boolean requestRedirectedToRequest(
			NSURLRequest redirectedRequest);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("revokeTokenForGoogleAuthentication:")
	public static native void revokeTokenForGoogleAuthentication(
			GTMOAuth2Authentication auth);

	@Generated
	@Selector("setAdditionalAuthorizationParameters:")
	public native void setAdditionalAuthorizationParameters(
			NSDictionary<?, ?> value);

	@Generated
	@Selector("setAuthentication:")
	public native void setAuthentication(GTMOAuth2Authentication value);

	@Generated
	@Selector("setAuthorizationURL:")
	public native void setAuthorizationURL(NSURL value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setFinishedSelector:")
	public native void setFinishedSelector(SEL value);

	@Generated
	@Selector("setNetworkLossTimeoutInterval:")
	public native void setNetworkLossTimeoutInterval(double value);

	@Generated
	@Selector("setShouldFetchGoogleUserEmail:")
	public native void setShouldFetchGoogleUserEmail(boolean value);

	@Generated
	@Selector("setShouldFetchGoogleUserProfile:")
	public native void setShouldFetchGoogleUserProfile(boolean value);

	@Generated
	@Selector("setUserData:")
	public native void setUserData(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setWebRequestSelector:")
	public native void setWebRequestSelector(SEL value);

	@Generated
	@Selector("shouldFetchGoogleUserEmail")
	public native boolean shouldFetchGoogleUserEmail();

	@Generated
	@Selector("shouldFetchGoogleUserProfile")
	public native boolean shouldFetchGoogleUserProfile();

	@Generated
	@Selector("standardGoogleAuthenticationForScope:clientID:clientSecret:")
	public static native GTMOAuth2Authentication standardGoogleAuthenticationForScopeClientIDClientSecret(
			String scope, String clientID, String clientSecret);

	@Generated
	@Selector("startSigningIn")
	public native boolean startSigningIn();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("titleChanged:")
	public native boolean titleChanged(String title);

	@Generated
	@Selector("userData")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object userData();

	@Generated
	@Selector("userInfoFetcherWithAuth:")
	public static native GTMHTTPFetcher userInfoFetcherWithAuth(
			GTMOAuth2Authentication auth);

	@Generated
	@Selector("userProfile")
	public native NSDictionary<?, ?> userProfile();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("webRequestSelector")
	public native SEL webRequestSelector();

	@Generated
	@Selector("windowWasClosed")
	public native void windowWasClosed();
}