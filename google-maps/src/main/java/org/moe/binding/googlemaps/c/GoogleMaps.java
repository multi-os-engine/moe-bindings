package org.moe.binding.googlemaps.c;


import apple.coregraphics.struct.CGPoint;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import apple.uikit.UIImage;
import org.moe.binding.googlemaps.GMSPath;
import org.moe.binding.googlemaps.GMSStrokeStyle;
import org.moe.binding.googlemaps.GMSStyleSpan;
import org.moe.binding.googlemaps.struct.GMSMapPoint;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.moe.binding.googlemaps.struct.GMSOrientation;
import org.moe.natj.c.ann.Inline;

@Generated
@Library("GoogleMaps")
@Runtime(CRuntime.class)
public final class GoogleMaps {
	static {
		NatJ.register();
	}

	@Generated
	private GoogleMaps() {
	}

	@Generated
	@CFunction
	@ByValue
	public static native GMSMapPoint GMSProject(
			@ByValue CLLocationCoordinate2D coordinate);

	@Generated
	@CFunction
	@ByValue
	public static native CLLocationCoordinate2D GMSUnproject(
			@ByValue GMSMapPoint point);

	@Generated
	@CFunction
	@ByValue
	public static native GMSMapPoint GMSMapPointInterpolate(
			@ByValue GMSMapPoint a, @ByValue GMSMapPoint b, double t);

	@Generated
	@CFunction
	public static native double GMSMapPointDistance(@ByValue GMSMapPoint a,
			@ByValue GMSMapPoint b);

	@Generated
	@CFunction
	public static native boolean GMSGeometryContainsLocation(
			@ByValue CLLocationCoordinate2D point, GMSPath path,
			boolean geodesic);

	@Generated
	@CFunction
	public static native boolean GMSGeometryIsLocationOnPathTolerance(
			@ByValue CLLocationCoordinate2D point, GMSPath path,
			boolean geodesic, double tolerance);

	@Generated
	@CFunction
	public static native boolean GMSGeometryIsLocationOnPath(
			@ByValue CLLocationCoordinate2D point, GMSPath path,
			boolean geodesic);

	@Generated
	@CFunction
	public static native double GMSGeometryDistance(
			@ByValue CLLocationCoordinate2D from,
			@ByValue CLLocationCoordinate2D to);

	@Generated
	@CFunction
	public static native double GMSGeometryLength(GMSPath path);

	@Generated
	@CFunction
	public static native double GMSGeometryArea(GMSPath path);

	@Generated
	@CFunction
	public static native double GMSGeometrySignedArea(GMSPath path);

	@Generated
	@CFunction
	public static native double GMSGeometryHeading(
			@ByValue CLLocationCoordinate2D from,
			@ByValue CLLocationCoordinate2D to);

	@Generated
	@CFunction
	@ByValue
	public static native CLLocationCoordinate2D GMSGeometryOffset(
			@ByValue CLLocationCoordinate2D from, double distance,
			double heading);

	@Generated
	@CFunction
	@ByValue
	public static native CLLocationCoordinate2D GMSGeometryInterpolate(
			@ByValue CLLocationCoordinate2D from,
			@ByValue CLLocationCoordinate2D to, double fraction);

	@Generated
	@CFunction
	public static native NSArray<? extends GMSStyleSpan> GMSStyleSpans(
			GMSPath path, NSArray<? extends GMSStrokeStyle> styles,
			NSArray<? extends NSNumber> lengths, @NUInt long lengthKind);

	@Generated
	@CFunction
	public static native NSArray<? extends GMSStyleSpan> GMSStyleSpansOffset(
			GMSPath path, NSArray<? extends GMSStrokeStyle> styles,
			NSArray<? extends NSNumber> lengths, @NUInt long lengthKind,
			double lengthOffset);

	@Generated
	@CVariable()
	public static native float kGMSMaxZoomLevel();

	@Generated
	@CVariable()
	public static native float kGMSMinZoomLevel();

	@Generated
	@CVariable()
	public static native double kGMSEquatorProjectedMeter();

	@Generated
	public static final double kGMSEarthRadius = 0x41584DB040000000L;

	@Generated
	@CVariable()
	@ByValue
	public static native CGPoint kGMSGroundOverlayDefaultAnchor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerCameraLatitudeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerCameraLongitudeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerCameraBearingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerCameraZoomLevelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerCameraViewingAngleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSAccessibilityCompass();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSAccessibilityMyLocation();

	@Generated
	@CVariable()
	@ByValue
	public static native CGPoint kGMSMarkerDefaultGroundAnchor();

	@Generated
	@CVariable()
	@ByValue
	public static native CGPoint kGMSMarkerDefaultInfoWindowAnchor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSMarkerLayerLatitude();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSMarkerLayerLongitude();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSMarkerLayerRotation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSMarkerLayerOpacity();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerPanoramaHeadingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerPanoramaPitchKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerPanoramaZoomKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGMSLayerPanoramaFOVKey();

	@Generated
	@CVariable()
	public static native UIImage kGMSTileLayerNoTile();

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GMSOrientation GMSOrientationMake(double heading,
			double pitch);
}