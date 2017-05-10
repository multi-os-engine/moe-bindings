package org.moe.binding.mapsiosutil.protocol;


import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GMUClusterAlgorithm")
public interface GMUClusterAlgorithm {
	@Generated
	@Selector("addItems:")
	void addItems(NSArray<?> items);

	@Generated
	@Selector("clearItems")
	void clearItems();

	@Generated
	@Selector("clustersAtZoom:")
	NSArray<?> clustersAtZoom(float zoom);

	@Generated
	@Selector("removeItem:")
	void removeItem(@Mapped(ObjCObjectMapper.class) Object item);
}