package org.moe.binding.googleopensource.protocol;


import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleOpenSource")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GTLRuntimeCommon")
public interface GTLRuntimeCommon {
	@Generated
	@Selector("JSONValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	Object JSONValueForKey(String key);

	@Generated
	@Selector("ancestorClass")
	@ProtocolClassMethod("ancestorClass")
	@MappedReturn(ObjCObjectMapper.class)
	Object _ancestorClass();

	@Generated
	@Selector("arrayPropertyToClassMapForClass:")
	@ProtocolClassMethod("arrayPropertyToClassMapForClass")
	NSDictionary<?, ?> _arrayPropertyToClassMapForClass(
			@Mapped(ObjCObjectMapper.class) Object aClass);

	@Generated
	@Selector("cacheChildForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	Object cacheChildForKey(String key);

	@Generated
	@Selector("propertyToJSONKeyMapForClass:")
	@ProtocolClassMethod("propertyToJSONKeyMapForClass")
	NSDictionary<?, ?> _propertyToJSONKeyMapForClass(
			@Mapped(ObjCObjectMapper.class) Object aClass);

	@Generated
	@Selector("setCacheChild:forKey:")
	void setCacheChildForKey(@Mapped(ObjCObjectMapper.class) Object obj,
			String key);

	@Generated
	@Selector("setJSONValue:forKey:")
	void setJSONValueForKey(@Mapped(ObjCObjectMapper.class) Object obj,
			String key);

	@Generated
	@Selector("surrogates")
	NSDictionary<?, ?> surrogates();
}