package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("gpg")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GPGSnapshotMetadata extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGSnapshotMetadata(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGSnapshotMetadata alloc();

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
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("commitWithMetadataChange:data:completionHandler:")
	public native void commitWithMetadataChangeDataCompletionHandler(
			GPGSnapshotMetadataChange metadataChange,
			NSData data,
			@ObjCBlock(name = "call_commitWithMetadataChangeDataCompletionHandler") Block_commitWithMetadataChangeDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_commitWithMetadataChangeDataCompletionHandler {
		@Generated
		void call_commitWithMetadataChangeDataCompletionHandler(
				GPGSnapshotMetadata arg0, NSError arg1);
	}

	@Generated
	@Selector("coverImageUrl")
	public native NSURL coverImageUrl();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("deleteWithCompletionHandler:")
	public native void deleteWithCompletionHandler(
			@ObjCBlock(name = "call_deleteWithCompletionHandler") Block_deleteWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteWithCompletionHandler {
		@Generated
		void call_deleteWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("fileName")
	public native String fileName();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GPGSnapshotMetadata init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

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
	@Selector("isOpen")
	public native boolean isOpen();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("lastModifiedTimestamp")
	public native long lastModifiedTimestamp();

	@Generated
	@Selector("listWithCompletionHandler:")
	public static native void listWithCompletionHandler(
			@ObjCBlock(name = "call_listWithCompletionHandler") Block_listWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_listWithCompletionHandler {
		@Generated
		void call_listWithCompletionHandler(NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("openWithFileName:conflictPolicy:completionHandler:")
	public static native void openWithFileNameConflictPolicyCompletionHandler(
			String fileName,
			@NInt long conflictPolicy,
			@ObjCBlock(name = "call_openWithFileNameConflictPolicyCompletionHandler") Block_openWithFileNameConflictPolicyCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_openWithFileNameConflictPolicyCompletionHandler {
		@Generated
		void call_openWithFileNameConflictPolicyCompletionHandler(
				GPGSnapshotMetadata arg0, String arg1,
				GPGSnapshotMetadata arg2, GPGSnapshotMetadata arg3, NSError arg4);
	}

	@Generated
	@Selector("playedTime")
	public native long playedTime();

	@Generated
	@Selector("progressValue")
	public native long progressValue();

	@Generated
	@Selector("readWithCompletionHandler:")
	public native void readWithCompletionHandler(
			@ObjCBlock(name = "call_readWithCompletionHandler") Block_readWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_readWithCompletionHandler {
		@Generated
		void call_readWithCompletionHandler(NSData arg0, NSError arg1);
	}

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("resolveWithMetadataChange:conflictId:data:completionHandler:")
	public native void resolveWithMetadataChangeConflictIdDataCompletionHandler(
			GPGSnapshotMetadataChange metadataChange,
			String conflictId,
			NSData data,
			@ObjCBlock(name = "call_resolveWithMetadataChangeConflictIdDataCompletionHandler") Block_resolveWithMetadataChangeConflictIdDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_resolveWithMetadataChangeConflictIdDataCompletionHandler {
		@Generated
		void call_resolveWithMetadataChangeConflictIdDataCompletionHandler(
				GPGSnapshotMetadata arg0, NSError arg1);
	}

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("snapshotDescription")
	public native String snapshotDescription();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}