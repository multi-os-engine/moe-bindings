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
public class GPGQuest extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGQuest(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptWithCompletionHandler:")
	public native void acceptWithCompletionHandler(
			@ObjCBlock(name = "call_acceptWithCompletionHandler") Block_acceptWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_acceptWithCompletionHandler {
		@Generated
		void call_acceptWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("acceptedTimestamp")
	public native long acceptedTimestamp();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allQuestsFromDataSource:completionHandler:")
	public static native void allQuestsFromDataSourceCompletionHandler(
			int dataSource,
			@ObjCBlock(name = "call_allQuestsFromDataSourceCompletionHandler") Block_allQuestsFromDataSourceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_allQuestsFromDataSourceCompletionHandler {
		@Generated
		void call_allQuestsFromDataSourceCompletionHandler(NSArray<?> arg0,
				NSError arg1);
	}

	@Generated
	@Selector("allQuestsWithCompletionHandler:")
	public static native void allQuestsWithCompletionHandler(
			@ObjCBlock(name = "call_allQuestsWithCompletionHandler") Block_allQuestsWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_allQuestsWithCompletionHandler {
		@Generated
		void call_allQuestsWithCompletionHandler(NSArray<?> arg0, NSError arg1);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGQuest alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("bannerUrl")
	public native NSURL bannerUrl();

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
	@Selector("currentMilestone")
	public native GPGQuestMilestone currentMilestone();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("expirationTimestamp")
	public native long expirationTimestamp();

	@Generated
	@Selector("fetchQuestWithId:completionHandler:")
	public static native void fetchQuestWithIdCompletionHandler(
			String questId,
			@ObjCBlock(name = "call_fetchQuestWithIdCompletionHandler") Block_fetchQuestWithIdCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchQuestWithIdCompletionHandler {
		@Generated
		void call_fetchQuestWithIdCompletionHandler(GPGQuest arg0, NSError arg1);
	}

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("iconUrl")
	public native NSURL iconUrl();

	@Generated
	@Selector("init")
	public native GPGQuest init();

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
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("questDescription")
	public native String questDescription();

	@Generated
	@Selector("questId")
	public native String questId();

	@Generated
	@Selector("questsForState:completionHandler:")
	public static native void questsForStateCompletionHandler(
			@NInt long state,
			@ObjCBlock(name = "call_questsForStateCompletionHandler") Block_questsForStateCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_questsForStateCompletionHandler {
		@Generated
		void call_questsForStateCompletionHandler(NSArray<?> arg0, NSError arg1);
	}

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
	@Selector("startTimestamp")
	public native long startTimestamp();

	@Generated
	@Selector("state")
	@NInt
	public native long state();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}