package org.moe.binding.gpg;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
public class GPGRealTimeRoom extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GPGRealTimeRoom(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GPGRealTimeRoom alloc();

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
	@Selector("config")
	public native GPGMultiplayerConfig config();

	@Generated
	@Selector("connectedParticipants")
	public native NSArray<?> connectedParticipants();

	@Generated
	@Selector("creationDetails")
	public native GPGRealTimeRoomModifyDetails creationDetails();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("enumerateConnectedParticipantsUsingBlock:")
	public native void enumerateConnectedParticipantsUsingBlock(
			@ObjCBlock(name = "call_enumerateConnectedParticipantsUsingBlock") Block_enumerateConnectedParticipantsUsingBlock iterator);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateConnectedParticipantsUsingBlock {
		@Generated
		void call_enumerateConnectedParticipantsUsingBlock(
				GPGRealTimeParticipant arg0);
	}

	@Generated
	@Selector("enumerateOtherParticipantsUsingBlock:")
	public native void enumerateOtherParticipantsUsingBlock(
			@ObjCBlock(name = "call_enumerateOtherParticipantsUsingBlock") Block_enumerateOtherParticipantsUsingBlock iterator);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateOtherParticipantsUsingBlock {
		@Generated
		void call_enumerateOtherParticipantsUsingBlock(
				GPGRealTimeParticipant arg0);
	}

	@Generated
	@Selector("enumerateParticipantsUsingBlock:")
	public native void enumerateParticipantsUsingBlock(
			@ObjCBlock(name = "call_enumerateParticipantsUsingBlock") Block_enumerateParticipantsUsingBlock iterator);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateParticipantsUsingBlock {
		@Generated
		void call_enumerateParticipantsUsingBlock(GPGRealTimeParticipant arg0);
	}

	@Generated
	@Selector("findParticipantById:")
	public native GPGRealTimeParticipant findParticipantById(
			String participantId);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("inConnectedSet")
	public native boolean inConnectedSet();

	@Generated
	@Selector("init")
	public native GPGRealTimeRoom init();

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
	@Selector("leave")
	public native void leave();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("localParticipant")
	public native GPGRealTimeParticipant localParticipant();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("participants")
	public native NSArray<?> participants();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("roomDescription")
	public native String roomDescription();

	@Generated
	@Selector("roomID")
	public native String roomID();

	@Generated
	@Selector("sendReliableData:toParticipants:")
	public native int sendReliableDataToParticipants(NSData data,
			NSArray<?> participants);

	@Generated
	@Selector("sendReliableDataToAll:")
	public native int sendReliableDataToAll(NSData data);

	@Generated
	@Selector("sendReliableDataToOthers:")
	public native int sendReliableDataToOthers(NSData data);

	@Generated
	@Selector("sendUnreliableData:toParticipants:")
	public native void sendUnreliableDataToParticipants(NSData data,
			NSArray<?> participants);

	@Generated
	@Selector("sendUnreliableDataToAll:")
	public native void sendUnreliableDataToAll(NSData data);

	@Generated
	@Selector("sendUnreliableDataToOthers:")
	public native void sendUnreliableDataToOthers(NSData data);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("status")
	@NInt
	public native long status();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("waitEstimateSeconds")
	public native NSNumber waitEstimateSeconds();
}