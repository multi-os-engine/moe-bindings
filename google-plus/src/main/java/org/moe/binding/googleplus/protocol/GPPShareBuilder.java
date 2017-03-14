package org.moe.binding.googleplus.protocol;


import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
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
@ObjCProtocolName("GPPShareBuilder")
public interface GPPShareBuilder extends NSCopying {
	@Generated
	@Selector("open")
	boolean open();

	@Generated
	@Selector("setCallToActionButtonWithLabel:URL:deepLinkID:")
	@MappedReturn(ObjCObjectMapper.class)
	Object setCallToActionButtonWithLabelURLDeepLinkID(String label, NSURL url,
			String deepLinkID);

	@Generated
	@Selector("setContentDeepLinkID:")
	@MappedReturn(ObjCObjectMapper.class)
	Object setContentDeepLinkID(String contentDeepLinkID);

	@Generated
	@Selector("setPrefillText:")
	@MappedReturn(ObjCObjectMapper.class)
	Object setPrefillText(String prefillText);

	@Generated
	@Selector("setTitle:description:thumbnailURL:")
	@MappedReturn(ObjCObjectMapper.class)
	Object setTitleDescriptionThumbnailURL(String title, String description,
			NSURL thumbnailURL);

	@Generated
	@Selector("setURLToShare:")
	@MappedReturn(ObjCObjectMapper.class)
	Object setURLToShare(NSURL urlToShare);
}