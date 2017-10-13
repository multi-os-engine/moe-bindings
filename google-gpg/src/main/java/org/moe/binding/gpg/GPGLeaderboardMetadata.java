package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
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
public class GPGLeaderboardMetadata extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGLeaderboardMetadata(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allMetadataFromDataSource:completionHandler:")
	public static native void allMetadataFromDataSourceCompletionHandler(
			int dataSource,
			@ObjCBlock(name = "call_allMetadataFromDataSourceCompletionHandler") Block_allMetadataFromDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_allMetadataFromDataSourceCompletionHandler {
		@Generated
		void call_allMetadataFromDataSourceCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("allMetadataWithCompletionHandler:")
	public static native void allMetadataWithCompletionHandler(
			@ObjCBlock(name = "call_allMetadataWithCompletionHandler") Block_allMetadataWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_allMetadataWithCompletionHandler {
		@Generated
		void call_allMetadataWithCompletionHandler(NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGLeaderboardMetadata alloc();

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
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("iconUrl")
	public native NSURL iconUrl();

	@Generated
	@Selector("init")
	public native GPGLeaderboardMetadata init();

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
	@Selector("leaderboardId")
	public native String leaderboardId();

	@Generated
	@Selector("metadataForLeaderboardId:completionHandler:")
	public static native void metadataForLeaderboardIdCompletionHandler(
			String leaderboardId,
			@ObjCBlock(name = "call_metadataForLeaderboardIdCompletionHandler") Block_metadataForLeaderboardIdCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_metadataForLeaderboardIdCompletionHandler {
		@Generated
		void call_metadataForLeaderboardIdCompletionHandler(
				GPGLeaderboardMetadata arg0, NSError arg1);
	}

	@Generated
	@Selector("metadataForLeaderboardId:dataSource:completionHandler:")
	public static native void metadataForLeaderboardIdDataSourceCompletionHandler(
			String leaderboardId,
			int dataSource,
			@ObjCBlock(name = "call_metadataForLeaderboardIdDataSourceCompletionHandler") Block_metadataForLeaderboardIdDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_metadataForLeaderboardIdDataSourceCompletionHandler {
		@Generated
		void call_metadataForLeaderboardIdDataSourceCompletionHandler(
				GPGLeaderboardMetadata arg0, NSError arg1);
	}

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("order")
	@NInt
	public native long order();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}