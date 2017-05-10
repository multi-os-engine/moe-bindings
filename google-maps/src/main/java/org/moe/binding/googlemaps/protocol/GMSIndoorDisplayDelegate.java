package org.moe.binding.googlemaps.protocol;


import org.moe.binding.googlemaps.GMSIndoorBuilding;
import org.moe.binding.googlemaps.GMSIndoorLevel;
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
@ObjCProtocolName("GMSIndoorDisplayDelegate")
public interface GMSIndoorDisplayDelegate {
	@Generated
	@IsOptional
	@Selector("didChangeActiveBuilding:")
	default void didChangeActiveBuilding(GMSIndoorBuilding building) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didChangeActiveLevel:")
	default void didChangeActiveLevel(GMSIndoorLevel level) {
		throw new java.lang.UnsupportedOperationException();
	}
}