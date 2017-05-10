package org.moe.binding.googlemobileads.protocol;


import org.moe.binding.googlemobileads.GADBannerView;
import org.moe.binding.googlemobileads.struct.GADAdSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleMobileAds")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GADAdSizeDelegate")
public interface GADAdSizeDelegate {
	@Generated
	@Selector("adView:willChangeAdSizeTo:")
	void adViewWillChangeAdSizeTo(GADBannerView bannerView,
			@ByValue GADAdSize size);
}