package org.moe.binding.googlemaps;


import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIImage;
import apple.uikit.UIView;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class GMSMarker extends GMSOverlay {
	static {
		NatJ.register();
	}

	@Generated
	protected GMSMarker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GMSMarker alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("appearAnimation")
	@NUInt
	public native long appearAnimation();

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
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("groundAnchor")
	@ByValue
	public native CGPoint groundAnchor();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("icon")
	public native UIImage icon();

	@Generated
	@Selector("iconView")
	public native UIView iconView();

	@Generated
	@Selector("infoWindowAnchor")
	@ByValue
	public native CGPoint infoWindowAnchor();

	@Generated
	@Selector("init")
	public native GMSMarker init();

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
	@Selector("isDraggable")
	public native boolean isDraggable();

	@Generated
	@Selector("isFlat")
	public native boolean isFlat();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("layer")
	public native GMSMarkerLayer layer();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("markerImageWithColor:")
	public static native UIImage markerImageWithColor(UIColor color);

	@Generated
	@Selector("markerWithPosition:")
	public static native GMSMarker markerWithPosition(
			@ByValue CLLocationCoordinate2D position);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("opacity")
	public native float opacity();

	@Generated
	@Selector("panoramaView")
	public native GMSPanoramaView panoramaView();

	@Generated
	@Selector("position")
	@ByValue
	public native CLLocationCoordinate2D position();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("rotation")
	public native double rotation();

	@Generated
	@Selector("setAppearAnimation:")
	public native void setAppearAnimation(@NUInt long value);

	@Generated
	@Selector("setDraggable:")
	public native void setDraggable(boolean value);

	@Generated
	@Selector("setFlat:")
	public native void setFlat(boolean value);

	@Generated
	@Selector("setGroundAnchor:")
	public native void setGroundAnchor(@ByValue CGPoint value);

	@Generated
	@Selector("setIcon:")
	public native void setIcon(UIImage value);

	@Generated
	@Selector("setIconView:")
	public native void setIconView(UIView value);

	@Generated
	@Selector("setInfoWindowAnchor:")
	public native void setInfoWindowAnchor(@ByValue CGPoint value);

	@Generated
	@Selector("setOpacity:")
	public native void setOpacity(float value);

	@Generated
	@Selector("setPanoramaView:")
	public native void setPanoramaView_unsafe(GMSPanoramaView value);

	@Generated
	public void setPanoramaView(GMSPanoramaView value) {
		Object __old = panoramaView();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setPanoramaView_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setPosition:")
	public native void setPosition(@ByValue CLLocationCoordinate2D value);

	@Generated
	@Selector("setRotation:")
	public native void setRotation(double value);

	@Generated
	@Selector("setSnippet:")
	public native void setSnippet(String value);

	@Generated
	@Selector("setTracksInfoWindowChanges:")
	public native void setTracksInfoWindowChanges(boolean value);

	@Generated
	@Selector("setTracksViewChanges:")
	public native void setTracksViewChanges(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("snippet")
	public native String snippet();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("tracksInfoWindowChanges")
	public native boolean tracksInfoWindowChanges();

	@Generated
	@Selector("tracksViewChanges")
	public native boolean tracksViewChanges();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}