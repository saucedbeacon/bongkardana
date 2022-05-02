package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.IOException;
import java.lang.reflect.Type;

public final class BooleanCodec implements ObjectSerializer, ObjectDeserializer {
    public static final BooleanCodec instance = new BooleanCodec();

    private BooleanCodec() {
    }

    public final void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((serializeWriter.features & SerializerFeature.WriteNullBooleanAsFalse.mask) != 0) {
                serializeWriter.write("false");
            } else {
                serializeWriter.writeNull();
            }
        } else if (bool.booleanValue()) {
            serializeWriter.write(SummaryActivity.CHECKED);
        } else {
            serializeWriter.write("false");
        }
    }

    public final <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token();
        if (i == 6) {
            jSONLexer.nextToken(16);
            return Boolean.TRUE;
        } else if (i == 7) {
            jSONLexer.nextToken(16);
            return Boolean.FALSE;
        } else if (i == 2) {
            int intValue = jSONLexer.intValue();
            jSONLexer.nextToken(16);
            if (intValue == 1) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } else {
            Object parse = defaultJSONParser.parse();
            if (parse == null) {
                return null;
            }
            return TypeUtils.castToBoolean(parse);
        }
    }
}
