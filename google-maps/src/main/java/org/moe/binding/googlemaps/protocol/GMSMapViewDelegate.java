package org.moe.binding.googlemaps.protocol;


import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.uikit.UIView;
import org.moe.binding.googlemaps.GMSCameraPosition;
import org.moe.binding.googlemaps.GMSMapView;
import org.moe.binding.googlemaps.GMSMarker;
import org.moe.binding.googlemaps.GMSOverlay;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleMaps")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GMSMapViewDelegate")
public interface GMSMapViewDelegate {
	@Generated
	@IsOptional
	@Selector("didTapMyLocationButtonForMapView:")
	default boolean didTapMyLocationButtonForMapView(GMSMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didBeginDraggingMarker:")
	default void mapViewDidBeginDraggingMarker(GMSMapView mapView,
			GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didChangeCameraPosition:")
	default void mapViewDidChangeCameraPosition(GMSMapView mapView,
			GMSCameraPosition position) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didCloseInfoWindowOfMarker:")
	default void mapViewDidCloseInfoWindowOfMarker(GMSMapView mapView,
			GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didDragMarker:")
	default void mapViewDidDragMarker(GMSMapView mapView, GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didEndDraggingMarker:")
	default void mapViewDidEndDraggingMarker(GMSMapView mapView,
			GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didLongPressAtCoordinate:")
	default void mapViewDidLongPressAtCoordinate(GMSMapView mapView,
			@ByValue CLLocationCoordinate2D coordinate) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didLongPressInfoWindowOfMarker:")
	default void mapViewDidLongPressInfoWindowOfMarker(GMSMapView mapView,
			GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didTapAtCoordinate:")
	default void mapViewDidTapAtCoordinate(GMSMapView mapView,
			@ByValue CLLocationCoordinate2D coordinate) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didTapInfoWindowOfMarker:")
	default void mapViewDidTapInfoWindowOfMarker(GMSMapView mapView,
			GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didTapMarker:")
	default boolean mapViewDidTapMarker(GMSMapView mapView, GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didTapOverlay:")
	default void mapViewDidTapOverlay(GMSMapView mapView, GMSOverlay overlay) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:didTapPOIWithPlaceID:name:location:")
	default void mapViewDidTapPOIWithPlaceIDNameLocation(GMSMapView mapView,
			String placeID, String name,
			@ByValue CLLocationCoordinate2D location) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:idleAtCameraPosition:")
	default void mapViewIdleAtCameraPosition(GMSMapView mapView,
			GMSCameraPosition position) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:markerInfoContents:")
	default UIView mapViewMarkerInfoContents(GMSMapView mapView,
			GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:markerInfoWindow:")
	default UIView mapViewMarkerInfoWindow(GMSMapView mapView, GMSMarker marker) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapView:willMove:")
	default void mapViewWillMove(GMSMapView mapView, boolean gesture) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapViewDidFinishTileRendering:")
	default void mapViewDidFinishTileRendering(GMSMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapViewDidStartTileRendering:")
	default void mapViewDidStartTileRendering(GMSMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mapViewSnapshotReady:")
	default void mapViewSnapshotReady(GMSMapView mapView) {
		throw new java.lang.UnsupportedOperationException();
	}
}