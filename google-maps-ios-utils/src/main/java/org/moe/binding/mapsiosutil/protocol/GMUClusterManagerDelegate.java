package org.moe.binding.mapsiosutil.protocol;


import org.moe.binding.mapsiosutil.GMUClusterManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GMUClusterManagerDelegate")
public interface GMUClusterManagerDelegate {
	@Generated
	@IsOptional
	@Selector("clusterManager:didTapCluster:")
	default boolean clusterManagerDidTapCluster(GMUClusterManager clusterManager,
			@Mapped(ObjCObjectMapper.class) Object cluster) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("clusterManager:didTapClusterItem:")
	default boolean clusterManagerDidTapClusterItem(
			GMUClusterManager clusterManager,
			@Mapped(ObjCObjectMapper.class) Object clusterItem) {
		throw new java.lang.UnsupportedOperationException();
	}
}