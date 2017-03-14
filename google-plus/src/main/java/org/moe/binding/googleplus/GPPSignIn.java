package org.moe.binding.googleplus;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.binding.googleopensource.GTLPlusPerson;
import org.moe.binding.googleopensource.GTLServicePlus;
import org.moe.binding.googleopensource.GTMOAuth2Authentication;
import org.moe.binding.googleplus.protocol.GPPSignInDelegate;
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
@Library("GooglePlus")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GPPSignIn extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPPSignIn(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("actions")
	public native NSArray<?> actions();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPPSignIn alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptSSO")
	public native boolean attemptSSO();

	@Generated
	@Selector("authenticate")
	public native void authenticate();

	@Generated
	@Selector("authentication")
	public native GTMOAuth2Authentication authentication();

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
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GPPSignInDelegate delegate();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("disconnect")
	public native void disconnect();

	@Generated
	@Selector("googlePlusUser")
	public native GTLPlusPerson googlePlusUser();

	@Generated
	@Selector("handleURL:sourceApplication:annotation:")
	public native boolean handleURLSourceApplicationAnnotation(NSURL url,
			String sourceApplication,
			@Mapped(ObjCObjectMapper.class) Object annotation);

	@Generated
	@Selector("hasAuthInKeychain")
	public native boolean hasAuthInKeychain();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("homeServerAuthorizationCode")
	public native String homeServerAuthorizationCode();

	@Generated
	@Selector("homeServerClientID")
	public native String homeServerClientID();

	@Generated
	@Selector("idToken")
	public native String idToken();

	@Generated
	@Selector("init")
	public native GPPSignIn init();

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
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("keychainName")
	public native String keychainName();

	@Generated
	@Selector("language")
	public native String language();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("openIDRealm")
	public native String openIDRealm();

	@Generated
	@Selector("plusService")
	public native GTLServicePlus plusService();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("scopes")
	public native NSArray<?> scopes();

	@Generated
	@Selector("setActions:")
	public native void setActions(NSArray<?> value);

	@Generated
	@Selector("setAttemptSSO:")
	public native void setAttemptSSO(boolean value);

	@Generated
	@Selector("setClientID:")
	public native void setClientID(String value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GPPSignInDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) GPPSignInDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setHomeServerClientID:")
	public native void setHomeServerClientID(String value);

	@Generated
	@Selector("setKeychainName:")
	public native void setKeychainName(String value);

	@Generated
	@Selector("setLanguage:")
	public native void setLanguage(String value);

	@Generated
	@Selector("setOpenIDRealm:")
	public native void setOpenIDRealm(String value);

	@Generated
	@Selector("setScopes:")
	public native void setScopes(NSArray<?> value);

	@Generated
	@Selector("setShouldFetchGooglePlusUser:")
	public native void setShouldFetchGooglePlusUser(boolean value);

	@Generated
	@Selector("setShouldFetchGoogleUserEmail:")
	public native void setShouldFetchGoogleUserEmail(boolean value);

	@Generated
	@Selector("setShouldFetchGoogleUserID:")
	public native void setShouldFetchGoogleUserID(boolean value);

	@Generated
	@Selector("setUseClientIDForURLScheme:")
	public native void setUseClientIDForURLScheme(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("sharedInstance")
	public static native GPPSignIn sharedInstance();

	@Generated
	@Selector("shouldFetchGooglePlusUser")
	public native boolean shouldFetchGooglePlusUser();

	@Generated
	@Selector("shouldFetchGoogleUserEmail")
	public native boolean shouldFetchGoogleUserEmail();

	@Generated
	@Selector("shouldFetchGoogleUserID")
	public native boolean shouldFetchGoogleUserID();

	@Generated
	@Selector("signOut")
	public native void signOut();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("trySilentAuthentication")
	public native boolean trySilentAuthentication();

	@Generated
	@Selector("useClientIDForURLScheme")
	public native boolean useClientIDForURLScheme();

	@Generated
	@Selector("userEmail")
	public native String userEmail();

	@Generated
	@Selector("userID")
	public native String userID();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}