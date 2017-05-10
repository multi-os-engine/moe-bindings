package org.moe.binding.mapsiosutil.protocol;


import org.moe.binding.mapsiosutil.struct.GQTPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GQTPointQuadTreeItem")
public interface GQTPointQuadTreeItem {
	@Generated
	@Selector("point")
	@ByValue
	GQTPoint point();
}