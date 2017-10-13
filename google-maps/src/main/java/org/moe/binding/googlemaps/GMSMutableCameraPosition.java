package org.moe.binding.googlemaps;


import apple.NSObject;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
public class GMSMutableCameraPosition extends GMSCameraPosition {
	static {
		NatJ.register();
	}

	@Generated
	protected GMSMutableCameraPosition(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GMSMutableCameraPosition alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("bearing")
	public native double bearing();

	@Generated
	@Selector("cameraWithLatitude:longitude:zoom:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object cameraWithLatitudeLongitudeZoom(
			double latitude, double longitude, float zoom);

	@Generated
	@Selector("cameraWithLatitude:longitude:zoom:bearing:viewingAngle:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object cameraWithLatitudeLongitudeZoomBearingViewingAngle(
			double latitude, double longitude, float zoom, double bearing,
			double viewingAngle);

	@Generated
	@Selector("cameraWithTarget:zoom:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object cameraWithTargetZoom(
			@ByValue CLLocationCoordinate2D target, float zoom);

	@Generated
	@Selector("cameraWithTarget:zoom:bearing:viewingAngle:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object cameraWithTargetZoomBearingViewingAngle(
			@ByValue CLLocationCoordinate2D target, float zoom, double bearing,
			double viewingAngle);

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
	@Selector("init")
	public native GMSMutableCameraPosition init();

	@Generated
	@Selector("initWithTarget:zoom:bearing:viewingAngle:")
	public native GMSMutableCameraPosition initWithTargetZoomBearingViewingAngle(
			@ByValue CLLocationCoordinate2D target, float zoom, double bearing,
			double viewingAngle);

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
	@Selector("setBearing:")
	public native void setBearing(double value);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@ByValue CLLocationCoordinate2D value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setViewingAngle:")
	public native void setViewingAngle(double value);

	@Generated
	@Selector("setZoom:")
	public native void setZoom(float value);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("target")
	@ByValue
	public native CLLocationCoordinate2D target();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("viewingAngle")
	public native double viewingAngle();

	@Generated
	@Selector("zoom")
	public native float zoom();

	@Generated
	@Selector("zoomAtCoordinate:forMeters:perPoints:")
	public static native float zoomAtCoordinateForMetersPerPoints(
			@ByValue CLLocationCoordinate2D coordinate, double meters,
			@NFloat double points);
}