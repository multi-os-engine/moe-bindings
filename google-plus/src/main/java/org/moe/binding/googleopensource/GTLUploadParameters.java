package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSFileHandle;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GTLUploadParameters extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected GTLUploadParameters(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("MIMEType")
	public native String MIMEType();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTLUploadParameters alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("data")
	public native NSData data();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("fileHandle")
	public native NSFileHandle fileHandle();

	@Generated
	@Selector("fileURL")
	public native NSURL fileURL();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTLUploadParameters init();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setData:")
	public native void setData(NSData value);

	@Generated
	@Selector("setFileHandle:")
	public native void setFileHandle(NSFileHandle value);

	@Generated
	@Selector("setFileURL:")
	public native void setFileURL(NSURL value);

	@Generated
	@Selector("setMIMEType:")
	public native void setMIMEType(String value);

	@Generated
	@Selector("setShouldSendUploadOnly:")
	public native void setShouldSendUploadOnly(boolean value);

	@Generated
	@Selector("setSlug:")
	public native void setSlug(String value);

	@Generated
	@Selector("setUploadLocationURL:")
	public native void setUploadLocationURL(NSURL value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("shouldSendUploadOnly")
	public native boolean shouldSendUploadOnly();

	@Generated
	@Selector("slug")
	public native String slug();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("uploadLocationURL")
	public native NSURL uploadLocationURL();

	@Generated
	@Selector("uploadParametersWithData:MIMEType:")
	public static native GTLUploadParameters uploadParametersWithDataMIMEType(
			NSData data, String mimeType);

	@Generated
	@Selector("uploadParametersWithFileHandle:MIMEType:")
	public static native GTLUploadParameters uploadParametersWithFileHandleMIMEType(
			NSFileHandle fileHandle, String mimeType);

	@Generated
	@Selector("uploadParametersWithFileURL:MIMEType:")
	public static native GTLUploadParameters uploadParametersWithFileURLMIMEType(
			NSURL fileHandle, String mimeType);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}