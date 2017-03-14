package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSMutableURLRequest;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
import org.moe.binding.googleopensource.protocol.GTMFetcherAuthorizationProtocol;
import org.moe.binding.googleopensource.protocol.GTMHTTPFetcherServiceProtocol;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GTMOAuth2Authentication extends NSObject implements
		GTMFetcherAuthorizationProtocol {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMOAuth2Authentication(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("accessToken")
	public native String accessToken();

	@Generated
	@Selector("additionalGrantTypeRequestParameters")
	public native NSDictionary<?, ?> additionalGrantTypeRequestParameters();

	@Generated
	@Selector("additionalTokenRequestParameters")
	public native NSDictionary<?, ?> additionalTokenRequestParameters();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMOAuth2Authentication alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("assertion")
	public native String assertion();

	@Generated
	@Selector("authenticationWithServiceProvider:tokenURL:redirectURI:clientID:clientSecret:")
	public static native GTMOAuth2Authentication authenticationWithServiceProviderTokenURLRedirectURIClientIDClientSecret(
			String serviceProvider, NSURL tokenURL, String redirectURI,
			String clientID, String clientSecret);

	@Generated
	@Selector("authorizationTokenKey")
	public native String authorizationTokenKey();

	@Generated
	@Selector("authorizeRequest:")
	public native boolean authorizeRequest(NSMutableURLRequest request);

	@Generated
	@Selector("authorizeRequest:completionHandler:")
	public native void authorizeRequestCompletionHandler(
			NSMutableURLRequest request,
			@ObjCBlock(name = "call_authorizeRequestCompletionHandler") GTMFetcherAuthorizationProtocol.Block_authorizeRequestCompletionHandler handler);

	@Generated
	@Selector("authorizeRequest:delegate:didFinishSelector:")
	public native void authorizeRequestDelegateDidFinishSelector(
			NSMutableURLRequest request,
			@Mapped(ObjCObjectMapper.class) Object delegate, SEL sel);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("beginTokenFetchWithDelegate:didFinishSelector:")
	public native GTMHTTPFetcher beginTokenFetchWithDelegateDidFinishSelector(
			@Mapped(ObjCObjectMapper.class) Object delegate, SEL finishedSel);

	@Generated
	@Selector("canAuthorize")
	public native boolean canAuthorize();

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
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("clientID")
	public native String clientID();

	@Generated
	@Selector("clientSecret")
	public native String clientSecret();

	@Generated
	@Selector("code")
	public native String code();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("dictionaryWithJSONData:")
	public static native NSDictionary<?, ?> dictionaryWithJSONData(NSData data);

	@Generated
	@Selector("dictionaryWithResponseString:")
	public static native NSDictionary<?, ?> dictionaryWithResponseString(
			String responseStr);

	@Generated
	@Selector("encodedOAuthValueForString:")
	public static native String encodedOAuthValueForString(String str);

	@Generated
	@Selector("encodedQueryParametersForDictionary:")
	public static native String encodedQueryParametersForDictionary(
			NSDictionary<?, ?> dict);

	@Generated
	@Selector("errorString")
	public native String errorString();

	@Generated
	@Selector("expirationDate")
	public native NSDate expirationDate();

	@Generated
	@Selector("expiresIn")
	public native NSNumber expiresIn();

	@Generated
	@Selector("fetcherService")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMHTTPFetcherServiceProtocol fetcherService();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTMOAuth2Authentication init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

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
	@Selector("isAuthorizedRequest:")
	public native boolean isAuthorizedRequest(NSURLRequest request);

	@Generated
	@Selector("isAuthorizingRequest:")
	public native boolean isAuthorizingRequest(NSURLRequest request);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("notifyFetchIsRunning:fetcher:type:")
	public native void notifyFetchIsRunningFetcherType(boolean isStarting,
			GTMHTTPFetcher fetcher, String fetchType);

	@Generated
	@Selector("parameters")
	public native NSMutableDictionary<?, ?> parameters();

	@Generated
	@Selector("parserClass")
	public native Class parserClass();

	@Generated
	@Selector("persistenceResponseString")
	public native String persistenceResponseString();

	@Generated
	@IsOptional
	@Selector("primeForRefresh")
	public native boolean primeForRefresh();

	@Generated
	@Selector("properties")
	public native NSDictionary<?, ?> properties();

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String key);

	@Generated
	@Selector("redirectURI")
	public native String redirectURI();

	@Generated
	@Selector("refreshFetcher")
	public native GTMHTTPFetcher refreshFetcher();

	@Generated
	@Selector("refreshScope")
	public native String refreshScope();

	@Generated
	@Selector("refreshToken")
	public native String refreshToken();

	@Generated
	@Selector("reset")
	public native void reset();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("scope")
	public native String scope();

	@Generated
	@Variadic()
	@Selector("scopeWithStrings:")
	public static native String scopeWithStrings(String firstStr,
			Object... varargs);

	@Generated
	@Selector("serviceProvider")
	public native String serviceProvider();

	@Generated
	@Selector("setAccessToken:")
	public native void setAccessToken(String value);

	@Generated
	@Selector("setAdditionalGrantTypeRequestParameters:")
	public native void setAdditionalGrantTypeRequestParameters(
			NSDictionary<?, ?> value);

	@Generated
	@Selector("setAdditionalTokenRequestParameters:")
	public native void setAdditionalTokenRequestParameters(
			NSDictionary<?, ?> value);

	@Generated
	@Selector("setAssertion:")
	public native void setAssertion(String value);

	@Generated
	@Selector("setAuthorizationTokenKey:")
	public native void setAuthorizationTokenKey(String value);

	@Generated
	@Selector("setClientID:")
	public native void setClientID(String value);

	@Generated
	@Selector("setClientSecret:")
	public native void setClientSecret(String value);

	@Generated
	@Selector("setCode:")
	public native void setCode(String value);

	@Generated
	@Selector("setErrorString:")
	public native void setErrorString(String value);

	@Generated
	@Selector("setExpirationDate:")
	public native void setExpirationDate(NSDate value);

	@Generated
	@Selector("setExpiresIn:")
	public native void setExpiresIn(NSNumber value);

	@Generated
	@Selector("setFetcherService:")
	public native void setFetcherService_unsafe(
			@Mapped(ObjCObjectMapper.class) GTMHTTPFetcherServiceProtocol value);

	@Generated
	public void setFetcherService(
			@Mapped(ObjCObjectMapper.class) GTMHTTPFetcherServiceProtocol value) {
		Object __old = fetcherService();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setFetcherService_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setKeysForPersistenceResponseString:")
	public native void setKeysForPersistenceResponseString(String str);

	@Generated
	@Selector("setKeysForResponseDictionary:")
	public native void setKeysForResponseDictionary(NSDictionary<?, ?> dict);

	@Generated
	@Selector("setKeysForResponseString:")
	public native void setKeysForResponseString(String str);

	@Generated
	@Selector("setParameters:")
	public native void setParameters(NSMutableDictionary<?, ?> value);

	@Generated
	@Selector("setParserClass:")
	public native void setParserClass(Class value);

	@Generated
	@Selector("setProperties:")
	public native void setProperties(NSDictionary<?, ?> value);

	@Generated
	@Selector("setProperty:forKey:")
	public native void setPropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

	@Generated
	@Selector("setRedirectURI:")
	public native void setRedirectURI(String value);

	@Generated
	@Selector("setRefreshFetcher:")
	public native void setRefreshFetcher(GTMHTTPFetcher value);

	@Generated
	@Selector("setRefreshScope:")
	public native void setRefreshScope(String value);

	@Generated
	@Selector("setRefreshToken:")
	public native void setRefreshToken(String value);

	@Generated
	@Selector("setScope:")
	public native void setScope(String value);

	@Generated
	@Selector("setServiceProvider:")
	public native void setServiceProvider(String value);

	@Generated
	@Selector("setShouldAuthorizeAllRequests:")
	public native void setShouldAuthorizeAllRequests(boolean value);

	@Generated
	@Selector("setTokenType:")
	public native void setTokenType(String value);

	@Generated
	@Selector("setTokenURL:")
	public native void setTokenURL(NSURL value);

	@Generated
	@Selector("setUserData:")
	public native void setUserData(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setUserEmail:")
	public native void setUserEmail(String value);

	@Generated
	@Selector("setUserEmailIsVerified:")
	public native void setUserEmailIsVerified(String value);

	@Generated
	@Selector("setUserID:")
	public native void setUserID(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldAuthorizeAllRequests")
	public native boolean shouldAuthorizeAllRequests();

	@Generated
	@Selector("stopAuthorization")
	public native void stopAuthorization();

	@Generated
	@Selector("stopAuthorizationForRequest:")
	public native void stopAuthorizationForRequest(NSURLRequest request);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("tokenType")
	public native String tokenType();

	@Generated
	@Selector("tokenURL")
	public native NSURL tokenURL();

	@Generated
	@Selector("userAgent")
	public native String userAgent();

	@Generated
	@Selector("userData")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object userData();

	@Generated
	@Selector("userEmail")
	public native String userEmail();

	@Generated
	@Selector("userEmailIsVerified")
	public native String userEmailIsVerified();

	@Generated
	@Selector("userID")
	public native String userID();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("waitForCompletionWithTimeout:")
	public native void waitForCompletionWithTimeout(double timeoutInSeconds);
}