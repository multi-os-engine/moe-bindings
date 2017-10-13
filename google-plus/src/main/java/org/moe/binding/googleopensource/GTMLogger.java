package org.moe.binding.googleopensource;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.binding.googleopensource.protocol.GTMLogFilter;
import org.moe.binding.googleopensource.protocol.GTMLogFormatter;
import org.moe.binding.googleopensource.protocol.GTMLogWriter;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CStringMapper;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
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
public class GTMLogger extends NSObject implements GTMLogWriter {
	static {
		NatJ.register();
	}

	@Generated
	protected GTMLogger(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GTMLogger alloc();

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
	@Selector("filter")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMLogFilter filter();

	@Generated
	@Selector("formatter")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMLogFormatter formatter();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GTMLogger init();

	@Generated
	@Selector("initWithWriter:formatter:filter:")
	public native GTMLogger initWithWriterFormatterFilter(
			@Mapped(ObjCObjectMapper.class) GTMLogWriter writer,
			@Mapped(ObjCObjectMapper.class) GTMLogFormatter formatter,
			@Mapped(ObjCObjectMapper.class) GTMLogFilter filter);

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
	@Variadic()
	@Selector("logAssert:")
	public native void logAssert(String fmt, Object... varargs);

	@Generated
	@Variadic()
	@Selector("logDebug:")
	public native void logDebug(String fmt, Object... varargs);

	@Generated
	@Variadic()
	@Selector("logError:")
	public native void logError(String fmt, Object... varargs);

	@Generated
	@Variadic()
	@Selector("logFuncAssert:msg:")
	public native void logFuncAssertMsg(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String func,
			String fmt, Object... varargs);

	@Generated
	@Variadic()
	@Selector("logFuncDebug:msg:")
	public native void logFuncDebugMsg(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String func,
			String fmt, Object... varargs);

	@Generated
	@Variadic()
	@Selector("logFuncError:msg:")
	public native void logFuncErrorMsg(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String func,
			String fmt, Object... varargs);

	@Generated
	@Variadic()
	@Selector("logFuncInfo:msg:")
	public native void logFuncInfoMsg(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String func,
			String fmt, Object... varargs);

	@Generated
	@Variadic()
	@Selector("logInfo:")
	public native void logInfo(String fmt, Object... varargs);

	@Generated
	@Selector("logInternalFunc:format:valist:level:")
	public native void logInternalFuncFormatValistLevel(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String func,
			String fmt, BytePtr args, int level);

	@Generated
	@Selector("logMessage:level:")
	public native void logMessageLevel(String msg, int level);

	@Generated
	@Selector("logger")
	public static native GTMLogger logger();

	@Generated
	@Selector("loggerWithWriter:formatter:filter:")
	public static native GTMLogger loggerWithWriterFormatterFilter(
			@Mapped(ObjCObjectMapper.class) GTMLogWriter writer,
			@Mapped(ObjCObjectMapper.class) GTMLogFormatter formatter,
			@Mapped(ObjCObjectMapper.class) GTMLogFilter filter);

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
	@Selector("setFilter:")
	public native void setFilter(
			@Mapped(ObjCObjectMapper.class) GTMLogFilter filter);

	@Generated
	@Selector("setFormatter:")
	public native void setFormatter(
			@Mapped(ObjCObjectMapper.class) GTMLogFormatter formatter);

	@Generated
	@Selector("setSharedLogger:")
	public static native void setSharedLogger(GTMLogger logger);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setWriter:")
	public native void setWriter(
			@Mapped(ObjCObjectMapper.class) GTMLogWriter writer);

	@Generated
	@Selector("sharedLogger")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedLogger();

	@Generated
	@Selector("standardLogger")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object standardLogger();

	@Generated
	@Selector("standardLoggerWithPath:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object standardLoggerWithPath(String path);

	@Generated
	@Selector("standardLoggerWithStderr")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object standardLoggerWithStderr();

	@Generated
	@Selector("standardLoggerWithStdoutAndStderr")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object standardLoggerWithStdoutAndStderr();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("writer")
	@MappedReturn(ObjCObjectMapper.class)
	public native GTMLogWriter writer();
}