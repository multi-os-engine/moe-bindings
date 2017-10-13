package org.moe.binding.googlemaps;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
@Library("GoogleMaps")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GMSUISettings extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GMSUISettings(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GMSUISettings alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("allowScrollGesturesDuringRotateOrZoom")
	public native boolean allowScrollGesturesDuringRotateOrZoom();

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
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("compassButton")
	public native boolean compassButton();

	@Generated
	@Selector("consumesGesturesInView")
	public native boolean consumesGesturesInView();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("indoorPicker")
	public native boolean indoorPicker();

	@Generated
	@Selector("init")
	public native GMSUISettings init();

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
	@Selector("myLocationButton")
	public native boolean myLocationButton();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("rotateGestures")
	public native boolean rotateGestures();

	@Generated
	@Selector("scrollGestures")
	public native boolean scrollGestures();

	@Generated
	@Selector("setAllGesturesEnabled:")
	public native void setAllGesturesEnabled(boolean enabled);

	@Generated
	@Selector("setAllowScrollGesturesDuringRotateOrZoom:")
	public native void setAllowScrollGesturesDuringRotateOrZoom(boolean value);

	@Generated
	@Selector("setCompassButton:")
	public native void setCompassButton(boolean value);

	@Generated
	@Selector("setConsumesGesturesInView:")
	public native void setConsumesGesturesInView(boolean value);

	@Generated
	@Selector("setIndoorPicker:")
	public native void setIndoorPicker(boolean value);

	@Generated
	@Selector("setMyLocationButton:")
	public native void setMyLocationButton(boolean value);

	@Generated
	@Selector("setRotateGestures:")
	public native void setRotateGestures(boolean value);

	@Generated
	@Selector("setScrollGestures:")
	public native void setScrollGestures(boolean value);

	@Generated
	@Selector("setTiltGestures:")
	public native void setTiltGestures(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setZoomGestures:")
	public native void setZoomGestures(boolean value);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("tiltGestures")
	public native boolean tiltGestures();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("zoomGestures")
	public native boolean zoomGestures();
}