package org.moe.binding.mapsiosutil.protocol;


import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GMUClusterRenderer")
public interface GMUClusterRenderer {
	@Generated
	@Selector("renderClusters:")
	void renderClusters(NSArray<?> clusters);

	@Generated
	@Selector("update")
	void update();
}