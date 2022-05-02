package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;

public class DefaultFieldDeserializer extends FieldDeserializer {
    protected ObjectDeserializer fieldValueDeserilizer;

    public DefaultFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
        super(cls, fieldInfo, 2);
    }

    public ObjectDeserializer getFieldValueDeserilizer(ParserConfig parserConfig) {
        if (this.fieldValueDeserilizer == null) {
            this.fieldValueDeserilizer = parserConfig.getDeserializer(this.fieldInfo.fieldClass, this.fieldInfo.fieldType);
        }
        return this.fieldValueDeserilizer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parseField(com.alibaba.fastjson.parser.DefaultJSONParser r6, java.lang.Object r7, java.lang.reflect.Type r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r5 = this;
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r5.fieldValueDeserilizer
            if (r0 != 0) goto L_0x0014
            com.alibaba.fastjson.parser.ParserConfig r0 = r6.config
            com.alibaba.fastjson.util.FieldInfo r1 = r5.fieldInfo
            java.lang.Class<?> r1 = r1.fieldClass
            com.alibaba.fastjson.util.FieldInfo r2 = r5.fieldInfo
            java.lang.reflect.Type r2 = r2.fieldType
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r1, r2)
            r5.fieldValueDeserilizer = r0
        L_0x0014:
            com.alibaba.fastjson.util.FieldInfo r0 = r5.fieldInfo
            java.lang.reflect.Type r0 = r0.fieldType
            boolean r1 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x0030
            com.alibaba.fastjson.parser.ParseContext r2 = r6.contex
            if (r2 == 0) goto L_0x0022
            r2.type = r8
        L_0x0022:
            java.lang.Class r2 = r5.clazz
            java.lang.reflect.Type r0 = com.alibaba.fastjson.util.FieldInfo.getFieldType(r2, r8, r0)
            com.alibaba.fastjson.parser.ParserConfig r2 = r6.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r2 = r2.getDeserializer(r0)
            r5.fieldValueDeserilizer = r2
        L_0x0030:
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            r1 = r0
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type[] r2 = r1.getActualTypeArguments()
            java.lang.reflect.Type r3 = r8.getRawType()
            boolean r4 = r3 instanceof java.lang.Class
            if (r4 == 0) goto L_0x0064
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.reflect.TypeVariable[] r3 = r3.getTypeParameters()
            java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()
            boolean r8 = com.alibaba.fastjson.util.TypeUtils.getArgument(r2, r3, r8)
            if (r8 == 0) goto L_0x0064
            com.alibaba.fastjson.util.ParameterizedTypeImpl r0 = new com.alibaba.fastjson.util.ParameterizedTypeImpl
            java.lang.reflect.Type r8 = r1.getOwnerType()
            java.lang.reflect.Type r1 = r1.getRawType()
            r0.<init>(r2, r8, r1)
        L_0x0064:
            com.alibaba.fastjson.util.FieldInfo r8 = r5.fieldInfo
            java.lang.String r8 = r8.format
            if (r8 == 0) goto L_0x007b
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = r5.fieldValueDeserilizer
            boolean r2 = r1 instanceof com.alibaba.fastjson.serializer.DateCodec
            if (r2 == 0) goto L_0x007b
            com.alibaba.fastjson.serializer.DateCodec r1 = (com.alibaba.fastjson.serializer.DateCodec) r1
            com.alibaba.fastjson.util.FieldInfo r2 = r5.fieldInfo
            java.lang.String r2 = r2.name
            java.lang.Object r8 = r1.deserialze(r6, r0, r2, r8)
            goto L_0x0085
        L_0x007b:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r8 = r5.fieldValueDeserilizer
            com.alibaba.fastjson.util.FieldInfo r1 = r5.fieldInfo
            java.lang.String r1 = r1.name
            java.lang.Object r8 = r8.deserialze(r6, r0, r1)
        L_0x0085:
            int r0 = r6.resolveStatus
            r1 = 1
            if (r0 != r1) goto L_0x0098
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r7 = r6.getLastResolveTask()
            r7.fieldDeserializer = r5
            com.alibaba.fastjson.parser.ParseContext r8 = r6.contex
            r7.ownerContext = r8
            r7 = 0
            r6.resolveStatus = r7
            return
        L_0x0098:
            if (r7 != 0) goto L_0x00a2
            com.alibaba.fastjson.util.FieldInfo r6 = r5.fieldInfo
            java.lang.String r6 = r6.name
            r9.put(r6, r8)
            return
        L_0x00a2:
            if (r8 != 0) goto L_0x00b9
            com.alibaba.fastjson.util.FieldInfo r6 = r5.fieldInfo
            java.lang.Class<?> r6 = r6.fieldClass
            java.lang.Class r9 = java.lang.Byte.TYPE
            if (r6 == r9) goto L_0x00b8
            java.lang.Class r9 = java.lang.Short.TYPE
            if (r6 == r9) goto L_0x00b8
            java.lang.Class r9 = java.lang.Float.TYPE
            if (r6 == r9) goto L_0x00b8
            java.lang.Class r9 = java.lang.Double.TYPE
            if (r6 != r9) goto L_0x00b9
        L_0x00b8:
            return
        L_0x00b9:
            r5.setValue((java.lang.Object) r7, (java.lang.Object) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultFieldDeserializer.parseField(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.Object, java.lang.reflect.Type, java.util.Map):void");
    }
}
