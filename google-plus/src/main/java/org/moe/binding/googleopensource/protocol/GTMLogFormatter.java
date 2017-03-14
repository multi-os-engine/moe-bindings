package org.moe.binding.googleopensource.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTMLogFormatter")
public interface GTMLogFormatter {
	@Generated
	@Selector("stringForFunc:withFormat:valist:level:")
	String stringForFuncWithFormatValistLevel(String func, String fmt,
			BytePtr args, int level);
}