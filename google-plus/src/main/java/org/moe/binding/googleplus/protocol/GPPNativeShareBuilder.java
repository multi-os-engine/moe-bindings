package org.moe.binding.googleplus.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GooglePlus")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GPPNativeShareBuilder")
public interface GPPNativeShareBuilder extends GPPShareBuilder {
	@Generated
	@Selector("attachImage:")
	@MappedReturn(ObjCObjectMapper.class)
	Object attachImage(UIImage imageAttachment);

	@Generated
	@Selector("attachImageData:")
	@MappedReturn(ObjCObjectMapper.class)
	Object attachImageData(NSData imageData);

	@Generated
	@Selector("attachVideoURL:")
	@MappedReturn(ObjCObjectMapper.class)
	Object attachVideoURL(NSURL videoAttachment);

	@Generated
	@Selector("setPreselectedPeopleIDs:")
	@MappedReturn(ObjCObjectMapper.class)
	Object setPreselectedPeopleIDs(NSArray<?> preselectedPeopleIDs);
}