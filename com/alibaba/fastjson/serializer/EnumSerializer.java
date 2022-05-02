package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

class EnumSerializer implements ObjectSerializer {
    EnumSerializer() {
    }

    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if ((serializeWriter.features & SerializerFeature.WriteEnumUsingToString.mask) != 0) {
            String obj3 = ((Enum) obj).toString();
            if ((serializeWriter.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
                serializeWriter.writeStringWithSingleQuote(obj3);
            } else {
                serializeWriter.writeStringWithDoubleQuote(obj3, 0, false);
            }
        } else {
            serializeWriter.writeInt(((Enum) obj).ordinal());
        }
    }
}
