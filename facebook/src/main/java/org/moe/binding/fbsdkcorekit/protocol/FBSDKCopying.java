package org.moe.binding.fbsdkcorekit.protocol;


import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FBSDKCoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("FBSDKCopying")
public interface FBSDKCopying extends NSCopying {
	@Generated
	@Owned
	@Selector("copy")
	@MappedReturn(ObjCObjectMapper.class)
	Object copy();
}