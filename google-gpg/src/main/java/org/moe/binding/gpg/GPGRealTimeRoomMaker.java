package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
public class GPGRealTimeRoomMaker extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGRealTimeRoomMaker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("activeRoom")
	public static native GPGRealTimeRoom activeRoom();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGRealTimeRoomMaker alloc();

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
	@Selector("createRoomFromConfig:")
	@NInt
	public static native long createRoomFromConfig(GPGMultiplayerConfig config);

	@Generated
	@Selector("createRoomFromConfig:operationHandle:")
	@NInt
	public static native long createRoomFromConfigOperationHandle(
			GPGMultiplayerConfig config,
			@ReferenceInfo(type = GPGRealTimeRoomCreationHandle.class) Ptr<GPGRealTimeRoomCreationHandle> handle);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("declineRoomFromData:completionHandler:")
	public static native void declineRoomFromDataCompletionHandler(
			GPGRealTimeRoomData data,
			@ObjCBlock(name = "call_declineRoomFromDataCompletionHandler") Block_declineRoomFromDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_declineRoomFromDataCompletionHandler {
		@Generated
		void call_declineRoomFromDataCompletionHandler(
				GPGRealTimeRoomData arg0, NSError arg1);
	}

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("dismissRoomFromData:completionHandler:")
	public static native void dismissRoomFromDataCompletionHandler(
			GPGRealTimeRoomData data,
			@ObjCBlock(name = "call_dismissRoomFromDataCompletionHandler") Block_dismissRoomFromDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_dismissRoomFromDataCompletionHandler {
		@Generated
		void call_dismissRoomFromDataCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("getRoomFromData:completionHandler:")
	public static native void getRoomFromDataCompletionHandler(
			GPGRealTimeRoomData roomData,
			@ObjCBlock(name = "call_getRoomFromDataCompletionHandler") Block_getRoomFromDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_getRoomFromDataCompletionHandler {
		@Generated
		void call_getRoomFromDataCompletionHandler(GPGRealTimeRoomData arg0,
				NSError arg1);
	}

	@Generated
	@Selector("getRoomWithId:completionHandler:")
	public static native void getRoomWithIdCompletionHandler(
			String roomId,
			@ObjCBlock(name = "call_getRoomWithIdCompletionHandler") Block_getRoomWithIdCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_getRoomWithIdCompletionHandler {
		@Generated
		void call_getRoomWithIdCompletionHandler(GPGRealTimeRoomData arg0,
				NSError arg1);
	}

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GPGRealTimeRoomMaker init();

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
	@Selector("joinRoomFromData:")
	@NInt
	public static native long joinRoomFromData(GPGRealTimeRoomData data);

	@Generated
	@Selector("joinRoomFromData:operationHandle:")
	@NInt
	public static native long joinRoomFromDataOperationHandle(
			GPGRealTimeRoomData data,
			@ReferenceInfo(type = GPGRealTimeRoomCreationHandle.class) Ptr<GPGRealTimeRoomCreationHandle> handle);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("listRoomsWithMaxResults:completionHandler:")
	public static native void listRoomsWithMaxResultsCompletionHandler(
			int maxResults,
			@ObjCBlock(name = "call_listRoomsWithMaxResultsCompletionHandler") Block_listRoomsWithMaxResultsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_listRoomsWithMaxResultsCompletionHandler {
		@Generated
		void call_listRoomsWithMaxResultsCompletionHandler(NSArray<?> arg0,
				NSError arg1);
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
	@Selector("version")
	@NInt
	public static native long version_static();
}