//
//  GoogleMaps.m
//

#import </Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS.sdk/System/Library/Frameworks/CoreLocation.framework/Headers/CLLocation.h>
#import </Users/rolandvigh/Public/moe-bindings/google-maps/xcode/Pods/GoogleMaps/Maps/Frameworks/GoogleMaps.framework/Headers/GMSOrientation.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT GMSOrientation __natj_inline_GMSOrientationMake(CLLocationDirection heading, double pitch) {
	return GMSOrientationMake(heading, pitch);
}


