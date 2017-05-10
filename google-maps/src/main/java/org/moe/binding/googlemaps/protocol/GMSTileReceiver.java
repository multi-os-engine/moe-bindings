package org.moe.binding.googlemaps.protocol;


import apple.uikit.UIImage;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleMaps")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GMSTileReceiver")
public interface GMSTileReceiver {
	@Generated
	@Selector("receiveTileWithX:y:zoom:image:")
	void receiveTileWithXYZoomImage(@NUInt long x, @NUInt long y,
			@NUInt long zoom, UIImage image);
}