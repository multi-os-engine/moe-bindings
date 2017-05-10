package org.moe.binding.mapsiosutil.protocol;


import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GMUCluster")
public interface GMUCluster {
	@Generated
	@Selector("count")
	@NUInt
	long count();

	@Generated
	@Selector("items")
	NSArray<?> items();

	@Generated
	@Selector("position")
	@ByValue
	CLLocationCoordinate2D position();
}