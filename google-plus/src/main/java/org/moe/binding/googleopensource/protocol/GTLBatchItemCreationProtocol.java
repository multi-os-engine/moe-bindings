package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTLBatchItemCreationProtocol")
public interface GTLBatchItemCreationProtocol {
	@Generated
	@Selector("createItemsWithClassMap:")
	void createItemsWithClassMap(NSDictionary<?, ?> batchClassMap);
}