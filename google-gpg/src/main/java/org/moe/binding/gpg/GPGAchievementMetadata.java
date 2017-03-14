package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
public class GPGAchievementMetadata extends NSObject implements NSCopying,
		NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGAchievementMetadata(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("achievementDescription")
	public native String achievementDescription();

	@Generated
	@Selector("achievementId")
	public native String achievementId();

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
	public static native GPGAchievementMetadata alloc();

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
	@Selector("completedSteps")
	public native int completedSteps();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("experiencePoints")
	public native int experiencePoints();

	@Generated
	@Selector("formattedCompletedSteps")
	public native String formattedCompletedSteps();

	@Generated
	@Selector("formattedNumberOfSteps")
	public native String formattedNumberOfSteps();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GPGAchievementMetadata init();

	@Generated
	@Selector("initWithCoder:")
	public native GPGAchievementMetadata initWithCoder(NSCoder aDecoder);

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
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("lastUpdatedTimestamp")
	public native long lastUpdatedTimestamp();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("metadataForAchievementId:completionHandler:")
	public static native void metadataForAchievementIdCompletionHandler(
			String achievementId,
			@ObjCBlock(name = "call_metadataForAchievementIdCompletionHandler") Block_metadataForAchievementIdCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_metadataForAchievementIdCompletionHandler {
		@Generated
		void call_metadataForAchievementIdCompletionHandler(
				GPGAchievementMetadata arg0, NSError arg1);
	}

	@Generated
	@Selector("metadataForAchievementId:dataSource:completionHandler:")
	public static native void metadataForAchievementIdDataSourceCompletionHandler(
			String achievementId,
			int dataSource,
			@ObjCBlock(name = "call_metadataForAchievementIdDataSourceCompletionHandler") Block_metadataForAchievementIdDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_metadataForAchievementIdDataSourceCompletionHandler {
		@Generated
		void call_metadataForAchievementIdDataSourceCompletionHandler(
				GPGAchievementMetadata arg0, NSError arg1);
	}

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("numberOfSteps")
	public native int numberOfSteps();

	@Generated
	@Selector("progress")
	@NFloat
	public native double progress();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("revealedIconUrl")
	public native NSURL revealedIconUrl();

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("state")
	@NInt
	public native long state();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("type")
	@NInt
	public native long type();

	@Generated
	@Selector("unlockedIconUrl")
	public native NSURL unlockedIconUrl();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}