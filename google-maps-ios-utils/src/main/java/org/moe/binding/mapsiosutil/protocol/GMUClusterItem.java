package org.moe.binding.mapsiosutil.protocol;


import apple.corelocation.struct.CLLocationCoordinate2D;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GMUClusterItem")
public interface GMUClusterItem {
	@Generated
	@Selector("position")
	@ByValue
	CLLocationCoordinate2D position();
}