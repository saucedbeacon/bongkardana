package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateCodec implements ObjectSerializer, ObjectDeserializer {
    public static final DateCodec instance = new DateCodec();

    private DateCodec() {
    }

    public final void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        Date date;
        char[] cArr;
        JSONSerializer jSONSerializer2 = jSONSerializer;
        Object obj3 = obj;
        SerializeWriter serializeWriter = jSONSerializer2.out;
        if (obj3 == null) {
            serializeWriter.writeNull();
        } else if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) == 0 || obj.getClass() == type) {
            if (obj3 instanceof Calendar) {
                date = ((Calendar) obj3).getTime();
            } else {
                date = (Date) obj3;
            }
            if ((serializeWriter.features & SerializerFeature.WriteDateUseDateFormat.mask) != 0) {
                DateFormat dateFormat = jSONSerializer.getDateFormat();
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(JSON.DEFFAULT_DATE_FORMAT, jSONSerializer2.locale);
                    dateFormat.setTimeZone(jSONSerializer2.timeZone);
                }
                serializeWriter.writeString(dateFormat.format(date));
                return;
            }
            long time = date.getTime();
            if ((serializeWriter.features & SerializerFeature.UseISO8601DateFormat.mask) != 0) {
                if ((serializeWriter.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
                    serializeWriter.write(39);
                } else {
                    serializeWriter.write(34);
                }
                Calendar instance2 = Calendar.getInstance(jSONSerializer2.timeZone, jSONSerializer2.locale);
                instance2.setTimeInMillis(time);
                int i = instance2.get(1);
                int i2 = instance2.get(2) + 1;
                int i3 = instance2.get(5);
                int i4 = instance2.get(11);
                int i5 = instance2.get(12);
                int i6 = instance2.get(13);
                int i7 = instance2.get(14);
                if (i7 != 0) {
                    cArr = "0000-00-00T00:00:00.000".toCharArray();
                    SerializeWriter.getChars((long) i7, 23, cArr);
                    SerializeWriter.getChars((long) i6, 19, cArr);
                    SerializeWriter.getChars((long) i5, 16, cArr);
                    SerializeWriter.getChars((long) i4, 13, cArr);
                    SerializeWriter.getChars((long) i3, 10, cArr);
                    SerializeWriter.getChars((long) i2, 7, cArr);
                    SerializeWriter.getChars((long) i, 4, cArr);
                } else if (i6 == 0 && i5 == 0 && i4 == 0) {
                    cArr = "0000-00-00".toCharArray();
                    SerializeWriter.getChars((long) i3, 10, cArr);
                    SerializeWriter.getChars((long) i2, 7, cArr);
                    SerializeWriter.getChars((long) i, 4, cArr);
                } else {
                    cArr = "0000-00-00T00:00:00".toCharArray();
                    SerializeWriter.getChars((long) i6, 19, cArr);
                    SerializeWriter.getChars((long) i5, 16, cArr);
                    SerializeWriter.getChars((long) i4, 13, cArr);
                    SerializeWriter.getChars((long) i3, 10, cArr);
                    SerializeWriter.getChars((long) i2, 7, cArr);
                    SerializeWriter.getChars((long) i, 4, cArr);
                }
                serializeWriter.write(cArr);
                if ((serializeWriter.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
                    serializeWriter.write(39);
                } else {
                    serializeWriter.write(34);
                }
            } else {
                serializeWriter.writeLong(time);
            }
        } else if (obj.getClass() == Date.class) {
            serializeWriter.write("new Date(");
            serializeWriter.writeLong(((Date) obj3).getTime());
            serializeWriter.write(41);
        } else {
            serializeWriter.write(123);
            serializeWriter.writeFieldName(JSON.DEFAULT_TYPE_KEY, false);
            jSONSerializer2.write(obj.getClass().getName());
            serializeWriter.write(44);
            serializeWriter.writeFieldName("val", false);
            serializeWriter.writeLong(((Date) obj3).getTime());
            serializeWriter.write(125);
        }
    }

    public final <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return deserialze(defaultJSONParser, type, obj, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r11, java.lang.reflect.Type r12, java.lang.Object r13, java.lang.String r14) {
        /*
            r10 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r11.lexer
            int r1 = r0.token()
            r2 = 0
            r3 = 2
            r4 = 16
            if (r1 != r3) goto L_0x001a
            long r5 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.nextToken(r4)
        L_0x0017:
            r7 = r1
            goto L_0x0108
        L_0x001a:
            r5 = 4
            if (r1 != r5) goto L_0x004b
            java.lang.String r1 = r0.stringVal()
            r0.nextToken(r4)
            int r3 = r0.features
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat
            int r4 = r4.mask
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0017
            com.alibaba.fastjson.parser.JSONLexer r3 = new com.alibaba.fastjson.parser.JSONLexer
            r3.<init>(r1)
            r4 = 1
            boolean r4 = r3.scanISO8601DateIfMatch(r4)
            if (r4 == 0) goto L_0x0047
            java.util.Calendar r1 = r3.calendar
            java.lang.Class<java.util.Calendar> r4 = java.util.Calendar.class
            if (r12 != r4) goto L_0x0043
            r3.close()
            return r1
        L_0x0043:
            java.util.Date r1 = r1.getTime()
        L_0x0047:
            r3.close()
            goto L_0x0017
        L_0x004b:
            r6 = 8
            if (r1 != r6) goto L_0x0055
            r0.nextToken()
            r7 = r2
            goto L_0x0108
        L_0x0055:
            r6 = 12
            r7 = 13
            r8 = 17
            java.lang.String r9 = "syntax error"
            if (r1 != r6) goto L_0x00ca
            r0.nextToken()
            int r1 = r0.token()
            if (r1 != r5) goto L_0x00c4
            java.lang.String r1 = r0.stringVal()
            java.lang.String r6 = "@type"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0090
            r0.nextToken()
            r11.accept(r8)
            java.lang.String r1 = r0.stringVal()
            com.alibaba.fastjson.parser.ParserConfig r6 = r11.config
            int r8 = r0.features
            java.lang.Class r1 = r6.checkAutoType(r1, r2, r8)
            if (r1 == 0) goto L_0x008a
            r12 = r1
        L_0x008a:
            r11.accept(r5)
            r11.accept(r4)
        L_0x0090:
            r1 = 58
            r0.nextTokenWithChar(r1)
            int r1 = r0.token()
            if (r1 != r3) goto L_0x00ab
            long r3 = r0.longValue()
            r0.nextToken()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r11.accept(r7)
            goto L_0x0017
        L_0x00ab:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "syntax error : "
            r12.<init>(r13)
            java.lang.String r13 = com.alibaba.fastjson.parser.JSONToken.name(r1)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c4:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            r11.<init>(r9)
            throw r11
        L_0x00ca:
            int r1 = r11.resolveStatus
            if (r1 != r3) goto L_0x0102
            r1 = 0
            r11.resolveStatus = r1
            r11.accept(r4)
            int r1 = r0.token()
            if (r1 != r5) goto L_0x00fc
            java.lang.String r1 = r0.stringVal()
            java.lang.String r3 = "val"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x00f6
            r0.nextToken()
            r11.accept(r8)
            java.lang.Object r1 = r11.parse()
            r11.accept(r7)
            goto L_0x0017
        L_0x00f6:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            r11.<init>(r9)
            throw r11
        L_0x00fc:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            r11.<init>(r9)
            throw r11
        L_0x0102:
            java.lang.Object r1 = r11.parse()
            goto L_0x0017
        L_0x0108:
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r14
            java.lang.Object r11 = r3.cast(r4, r5, r6, r7, r8)
            java.lang.Class<java.util.Calendar> r13 = java.util.Calendar.class
            if (r12 != r13) goto L_0x012b
            boolean r12 = r11 instanceof java.util.Calendar
            if (r12 == 0) goto L_0x011a
            return r11
        L_0x011a:
            java.util.Date r11 = (java.util.Date) r11
            if (r11 != 0) goto L_0x011f
            return r2
        L_0x011f:
            java.util.TimeZone r12 = r0.timeZone
            java.util.Locale r13 = r0.locale
            java.util.Calendar r12 = java.util.Calendar.getInstance(r12, r13)
            r12.setTime(r11)
            return r12
        L_0x012b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.DateCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final <T> T cast(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2, String str) {
        DateFormat dateFormat;
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof Date) {
            return obj2;
        }
        if (obj2 instanceof Number) {
            return new Date(((Number) obj2).longValue());
        }
        if (obj2 instanceof String) {
            String str2 = (String) obj2;
            if (str2.length() == 0) {
                return null;
            }
            JSONLexer jSONLexer = new JSONLexer(str2);
            try {
                if (jSONLexer.scanISO8601DateIfMatch(false)) {
                    T t = jSONLexer.calendar;
                    if (type == Calendar.class) {
                        return t;
                    }
                    T time = t.getTime();
                    jSONLexer.close();
                    return time;
                }
                jSONLexer.close();
                if ("0000-00-00".equals(str2) || "0000-00-00T00:00:00".equalsIgnoreCase(str2) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                    return null;
                }
                if (str != null) {
                    dateFormat = new SimpleDateFormat(str);
                } else {
                    dateFormat = defaultJSONParser.getDateFormat();
                }
                try {
                    return dateFormat.parse(str2);
                } catch (ParseException unused) {
                    return new Date(Long.parseLong(str2));
                }
            } finally {
                jSONLexer.close();
            }
        } else {
            throw new JSONException("parse error");
        }
    }
}
