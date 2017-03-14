package org.moe.binding.googleopensource.c;


import apple.foundation.NSBundle;
import apple.foundation.NSData;
import apple.foundation.NSNumber;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(CRuntime.class)
public final class GoogleOpenSource {
	static {
		NatJ.register();
	}

	@Generated
	private GoogleOpenSource() {
	}

	@Generated
	@Variadic()
	@CFunction
	public static native void _GTMUnitTestDevLog(
			@Mapped(ObjCStringMapper.class) String format, Object... varargs);

	@Generated
	@Variadic()
	@CFunction
	public static native void GTMAssertSelectorNilOrImplementedWithArgs(
			@Mapped(ObjCObjectMapper.class) Object obj, SEL sel,
			Object... varargs);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String GTMCleanedUserAgentString(
			@Mapped(ObjCStringMapper.class) String str);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String GTMSystemVersionString();

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String GTMApplicationIdentifier(NSBundle bundle);

	@Generated
	@CFunction
	public static native NSData GTLDecodeBase64(
			@Mapped(ObjCStringMapper.class) String base64Str);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String GTLEncodeBase64(NSData data);

	@Generated
	@CFunction
	public static native NSData GTLDecodeWebSafeBase64(
			@Mapped(ObjCStringMapper.class) String base64Str);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String GTLEncodeWebSafeBase64(NSData data);

	@Generated
	@CFunction
	public static native boolean GTL_AreEqualOrBothNil(
			@Mapped(ObjCObjectMapper.class) Object obj1,
			@Mapped(ObjCObjectMapper.class) Object obj2);

	@Generated
	@CFunction
	public static native boolean GTL_AreBoolsEqual(boolean b1, boolean b2);

	@Generated
	@CFunction
	public static native NSNumber GTL_EnsureNSNumber(NSNumber num);

	@Generated
	@CFunction
	public static native void GTLFrameworkVersion(NUIntPtr major,
			NUIntPtr minor, NUIntPtr release);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String GTLFrameworkVersionString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherStartedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherStoppedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherRetryDelayStartedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherRetryDelayStoppedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherStatusDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherErrorChallengeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMHTTPFetcherStatusDataKey();

	@Generated
	@CVariable()
	@NUInt
	public static native long kGTMDefaultETaggedDataCacheMemoryCapacity();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ServiceProviderGoogle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorMessageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorRequestKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorJSONKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetchStarted();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetchStopped();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetcherKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetchTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetchTypeToken();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetchTypeRefresh();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetchTypeAssertion();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2FetchTypeUserInfo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorObjectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorInvalidRequest();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorInvalidClient();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorInvalidGrant();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorUnauthorizedClient();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorUnsupportedGrantType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2ErrorInvalidScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2UserSignedIn();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2AccessTokenRefreshed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2RefreshTokenChanged();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2AccessTokenRefreshFailed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2WebViewStartedLoading();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2WebViewStoppedLoading();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2WebViewKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2WebViewStopKindKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2WebViewFinished();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2WebViewFailed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2WebViewCancelled();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2NetworkLost();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2NetworkFound();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2KeychainErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2CookiesWillSwapOut();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTMOAuth2CookiesDidSwapIn();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLServiceErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLJSONRPCErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLServerErrorStringKey();

	@Generated
	@CVariable()
	public static native Class kGTLUseRegisteredClass();

	@Generated
	@CVariable()
	@NUInt
	public static native long kGTLStandardUploadChunkSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLStructuredErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLETagWildcard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLServiceTicketParsingStartedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLServiceTicketParsingStoppedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLAuthScopePlusLogin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLAuthScopePlusMe();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLAuthScopePlusUserinfoEmail();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLAuthScopePlusUserinfoProfile();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusCollectionConnected();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusCollectionPlusoners();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusCollectionPublic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusCollectionResharers();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusCollectionVault();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusCollectionVisible();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusOrderByAlphabetical();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusOrderByBest();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusOrderByRecent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusSortOrderAscending();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGTLPlusSortOrderDescending();
}