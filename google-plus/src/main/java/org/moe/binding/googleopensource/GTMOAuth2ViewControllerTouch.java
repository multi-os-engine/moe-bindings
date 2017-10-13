package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
import apple.uikit.UIActivityIndicatorView;
import apple.uikit.UIBarButtonItem;
import apple.uikit.UIButton;
import apple.uikit.UINavigationController;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import apple.uikit.UIWebView;
import apple.uikit.protocol.UINavigationControllerDelegate;
import apple.uikit.protocol.UIWebViewDelegate;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
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
public class GTMOAuth2ViewControllerTouch extends UIViewController implements
		UINavigationControllerDelegate, UIWebViewDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMOAuth2ViewControllerTouch(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMOAuth2ViewControllerTouch alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptRotationToDeviceOrientation")
	public static native void attemptRotationToDeviceOrientation();

	@Generated
	@Selector("authForGoogleFromKeychainForName:clientID:clientSecret:")
	public static native GTMOAuth2Authentication authForGoogleFromKeychainForNameClientIDClientSecret(
			String keychainItemName, String clientID, String clientSecret);

	@Generated
	@Selector("authForGoogleFromKeychainForName:clientID:clientSecret:error:")
	public static native GTMOAuth2Authentication authForGoogleFromKeychainForNameClientIDClientSecretError(
			String keychainItemName, String clientID, String clientSecret,
			@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

	@Generated
	@Selector("authNibBundle")
	public static native NSBundle authNibBundle();

	@Generated
	@Selector("authNibName")
	public static native String authNibName();

	@Generated
	@Selector("authentication")
	public native GTMOAuth2Authentication authentication();

	@Generated
	@Selector("authorizeFromKeychainForName:authentication:error:")
	public static native boolean authorizeFromKeychainForNameAuthenticationError(
			String keychainItemName, GTMOAuth2Authentication auth,
			@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("backButton")
	public native UIButton backButton();

	@Generated
	@Selector("browserCookiesURL")
	public native NSURL browserCookiesURL();

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
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

	@Generated
	@Selector("controllerWithAuthentication:authorizationURL:keychainItemName:completionHandler:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object controllerWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler(
			GTMOAuth2Authentication auth,
			NSURL authorizationURL,
			String keychainItemName,
			@ObjCBlock(name = "call_controllerWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler") Block_controllerWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_controllerWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler {
		@Generated
		void call_controllerWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler(
				GTMOAuth2ViewControllerTouch arg0,
				GTMOAuth2Authentication arg1, NSError arg2);
	}

	@Generated
	@Selector("controllerWithAuthentication:authorizationURL:keychainItemName:delegate:finishedSelector:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object controllerWithAuthenticationAuthorizationURLKeychainItemNameDelegateFinishedSelector(
			GTMOAuth2Authentication auth, NSURL authorizationURL,
			String keychainItemName,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("controllerWithScope:clientID:clientSecret:keychainItemName:completionHandler:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object controllerWithScopeClientIDClientSecretKeychainItemNameCompletionHandler(
			String scope,
			String clientID,
			String clientSecret,
			String keychainItemName,
			@ObjCBlock(name = "call_controllerWithScopeClientIDClientSecretKeychainItemNameCompletionHandler") Block_controllerWithScopeClientIDClientSecretKeychainItemNameCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_controllerWithScopeClientIDClientSecretKeychainItemNameCompletionHandler {
		@Generated
		void call_controllerWithScopeClientIDClientSecretKeychainItemNameCompletionHandler(
				GTMOAuth2ViewControllerTouch arg0,
				GTMOAuth2Authentication arg1, NSError arg2);
	}

	@Generated
	@Selector("controllerWithScope:clientID:clientSecret:keychainItemName:delegate:finishedSelector:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object controllerWithScopeClientIDClientSecretKeychainItemNameDelegateFinishedSelector(
			String scope, String clientID, String clientSecret,
			String keychainItemName,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("forwardButton")
	public native UIButton forwardButton();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTMOAuth2ViewControllerTouch init();

	@Generated
	@Selector("initWithAuthentication:authorizationURL:keychainItemName:completionHandler:")
	public native GTMOAuth2ViewControllerTouch initWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler(
			GTMOAuth2Authentication auth,
			NSURL authorizationURL,
			String keychainItemName,
			@ObjCBlock(name = "call_initWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler") Block_initWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_initWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler {
		@Generated
		void call_initWithAuthenticationAuthorizationURLKeychainItemNameCompletionHandler(
				GTMOAuth2ViewControllerTouch arg0,
				GTMOAuth2Authentication arg1, NSError arg2);
	}

	@Generated
	@Selector("initWithAuthentication:authorizationURL:keychainItemName:delegate:finishedSelector:")
	public native GTMOAuth2ViewControllerTouch initWithAuthenticationAuthorizationURLKeychainItemNameDelegateFinishedSelector(
			GTMOAuth2Authentication auth, NSURL authorizationURL,
			String keychainItemName,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("initWithCoder:")
	public native GTMOAuth2ViewControllerTouch initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native GTMOAuth2ViewControllerTouch initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithScope:clientID:clientSecret:keychainItemName:completionHandler:")
	public native GTMOAuth2ViewControllerTouch initWithScopeClientIDClientSecretKeychainItemNameCompletionHandler(
			String scope,
			String clientID,
			String clientSecret,
			String keychainItemName,
			@ObjCBlock(name = "call_initWithScopeClientIDClientSecretKeychainItemNameCompletionHandler") Block_initWithScopeClientIDClientSecretKeychainItemNameCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_initWithScopeClientIDClientSecretKeychainItemNameCompletionHandler {
		@Generated
		void call_initWithScopeClientIDClientSecretKeychainItemNameCompletionHandler(
				GTMOAuth2ViewControllerTouch arg0,
				GTMOAuth2Authentication arg1, NSError arg2);
	}

	@Generated
	@Selector("initWithScope:clientID:clientSecret:keychainItemName:delegate:finishedSelector:")
	public native GTMOAuth2ViewControllerTouch initWithScopeClientIDClientSecretKeychainItemNameDelegateFinishedSelector(
			String scope, String clientID, String clientSecret,
			String keychainItemName,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL finishedSelector);

	@Generated
	@Selector("initialActivityIndicator")
	public native UIActivityIndicatorView initialActivityIndicator();

	@Generated
	@Selector("initialHTMLString")
	public native String initialHTMLString();

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
	@Selector("keychainItemAccessibility")
	public native ConstVoidPtr keychainItemAccessibility();

	@Generated
	@Selector("keychainItemName")
	public native String keychainItemName();

	@Generated
	@Selector("navButtonsView")
	public native UIView navButtonsView();

	@Generated
	@IsOptional
	@Selector("navigationController:animationControllerForOperation:fromViewController:toViewController:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object navigationControllerAnimationControllerForOperationFromViewControllerToViewController(
			UINavigationController navigationController, @NInt long operation,
			UIViewController fromVC, UIViewController toVC);

	@Generated
	@IsOptional
	@Selector("navigationController:didShowViewController:animated:")
	public native void navigationControllerDidShowViewControllerAnimated(
			UINavigationController navigationController,
			UIViewController viewController, boolean animated);

	@Generated
	@IsOptional
	@Selector("navigationController:interactionControllerForAnimationController:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object navigationControllerInteractionControllerForAnimationController(
			UINavigationController navigationController,
			@Mapped(ObjCObjectMapper.class) Object animationController);

	@Generated
	@IsOptional
	@Selector("navigationController:willShowViewController:animated:")
	public native void navigationControllerWillShowViewControllerAnimated(
			UINavigationController navigationController,
			UIViewController viewController, boolean animated);

	@Generated
	@IsOptional
	@Selector("navigationControllerPreferredInterfaceOrientationForPresentation:")
	@NInt
	public native long navigationControllerPreferredInterfaceOrientationForPresentation(
			UINavigationController navigationController);

	@Generated
	@IsOptional
	@Selector("navigationControllerSupportedInterfaceOrientations:")
	@NUInt
	public native long navigationControllerSupportedInterfaceOrientations(
			UINavigationController navigationController);

	@Generated
	@Selector("networkLossTimeoutInterval")
	public native double networkLossTimeoutInterval();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("popViewBlock")
	@ObjCBlock(name = "call_popViewBlock_ret")
	public native Block_popViewBlock_ret popViewBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_popViewBlock_ret {
		@Generated
		void call_popViewBlock_ret();
	}

	@Generated
	@Selector("properties")
	public native NSDictionary<?, ?> properties();

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String key);

	@Generated
	@Selector("removeAuthFromKeychainForName:")
	public static native boolean removeAuthFromKeychainForName(
			String keychainItemName);

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
	@Selector("rightBarButtonItem")
	public native UIBarButtonItem rightBarButtonItem();

	@Generated
	@Selector("saveParamsToKeychainForName:accessibility:authentication:error:")
	public static native boolean saveParamsToKeychainForNameAccessibilityAuthenticationError(
			String keychainItemName, ConstVoidPtr accessibility,
			GTMOAuth2Authentication auth,
			@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

	@Generated
	@Selector("saveParamsToKeychainForName:authentication:")
	public static native boolean saveParamsToKeychainForNameAuthentication(
			String keychainItemName, GTMOAuth2Authentication auth);

	@Generated
	@Selector("setBackButton:")
	public native void setBackButton(UIButton value);

	@Generated
	@Selector("setBrowserCookiesURL:")
	public native void setBrowserCookiesURL(NSURL value);

	@Generated
	@Selector("setForwardButton:")
	public native void setForwardButton(UIButton value);

	@Generated
	@Selector("setInitialActivityIndicator:")
	public native void setInitialActivityIndicator(UIActivityIndicatorView value);

	@Generated
	@Selector("setInitialHTMLString:")
	public native void setInitialHTMLString(String value);

	@Generated
	@Selector("setKeychainItemAccessibility:")
	public native void setKeychainItemAccessibility(ConstVoidPtr value);

	@Generated
	@Selector("setKeychainItemName:")
	public native void setKeychainItemName(String value);

	@Generated
	@Selector("setNavButtonsView:")
	public native void setNavButtonsView(UIView value);

	@Generated
	@Selector("setNetworkLossTimeoutInterval:")
	public native void setNetworkLossTimeoutInterval(double value);

	@Generated
	@Selector("setPopViewBlock:")
	public native void setPopViewBlock(
			@ObjCBlock(name = "call_setPopViewBlock") Block_setPopViewBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setPopViewBlock {
		@Generated
		void call_setPopViewBlock();
	}

	@Generated
	@Selector("setProperties:")
	public native void setProperties(NSDictionary<?, ?> value);

	@Generated
	@Selector("setProperty:forKey:")
	public native void setPropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object obj, String key);

	@Generated
	@Selector("setRightBarButtonItem:")
	public native void setRightBarButtonItem(UIBarButtonItem value);

	@Generated
	@Selector("setShowsInitialActivityIndicator:")
	public native void setShowsInitialActivityIndicator(boolean value);

	@Generated
	@Selector("setSignInClass:")
	public static native void setSignInClass(Class theClass);

	@Generated
	@Selector("setUpNavigation")
	public native void setUpNavigation();

	@Generated
	@Selector("setUserData:")
	public native void setUserData(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setWebView:")
	public native void setWebView(UIWebView value);

	@Generated
	@Selector("showsInitialActivityIndicator")
	public native boolean showsInitialActivityIndicator();

	@Generated
	@Selector("signIn")
	public native GTMOAuth2SignIn signIn();

	@Generated
	@Selector("signInClass")
	public static native Class signInClass();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("userData")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object userData();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("webView")
	public native UIWebView webView();

	@Generated
	@IsOptional
	@Selector("webView:didFailLoadWithError:")
	public native void webViewDidFailLoadWithError(UIWebView webView,
			NSError error);

	@Generated
	@IsOptional
	@Selector("webView:shouldStartLoadWithRequest:navigationType:")
	public native boolean webViewShouldStartLoadWithRequestNavigationType(
			UIWebView webView, NSURLRequest request, @NInt long navigationType);

	@Generated
	@IsOptional
	@Selector("webViewDidFinishLoad:")
	public native void webViewDidFinishLoad(UIWebView webView);

	@Generated
	@IsOptional
	@Selector("webViewDidStartLoad:")
	public native void webViewDidStartLoad(UIWebView webView);
}