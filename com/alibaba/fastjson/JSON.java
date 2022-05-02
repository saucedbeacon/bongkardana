package com.alibaba.fastjson;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;
import com.alibaba.fastjson.serializer.AfterFilter;
import com.alibaba.fastjson.serializer.BeforeFilter;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.util.TypeUtils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.Typography;

public abstract class JSON implements JSONStreamAware, JSONAware {
    public static int DEFAULT_GENERATE_FEATURE = ((((SerializerFeature.QuoteFieldNames.mask | 0) | SerializerFeature.SkipTransientField.mask) | SerializerFeature.WriteEnumUsingToString.mask) | SerializerFeature.SortField.mask);
    public static int DEFAULT_PARSER_FEATURE = (((Feature.UseBigDecimal.mask | 0) | Feature.SortFeidFastMatch.mask) | Feature.IgnoreNotMatch.mask);
    public static final String DEFAULT_TYPE_KEY = "@type";
    public static String DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String VERSION = "1.1.70";
    public static Locale defaultLocale = Locale.getDefault();
    public static TimeZone defaultTimeZone = TimeZone.getDefault();
    private static short[] getMax = null;
    private static int getMin = 0;
    private static int isInside = 1;
    private static int length;
    private static byte[] setMax;
    private static int setMin;
    private static int toFloatRange;

    static void setMax() {
        setMin = 1319392993;
        length = 630218361;
        setMax = new byte[]{-95, -86, -122, -111, -98};
        getMin = 100;
    }

    protected static /* synthetic */ void setMax(JsonReader jsonReader, int i) {
        while (true) {
            jsonReader.peek();
            JsonToken jsonToken = JsonToken.NULL;
            if (i != 18 && i != 56 && i != 71 && i != 74 && i != 98 && i != 108 && i != 111) {
                try {
                    break;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        jsonReader.skipValue();
        int i2 = isInside + 27;
        toFloatRange = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
        }
    }

    static {
        setMax();
        boolean z = false;
        int i = toFloatRange + 91;
        isInside = i % 128;
        if (i % 2 != 0) {
            z = true;
        }
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
    }

    public static final Object parse(String str) {
        int i = toFloatRange + 33;
        isInside = i % 128;
        if (i % 2 != 0) {
            return parse(str, DEFAULT_PARSER_FEATURE);
        }
        try {
            int i2 = 25 / 0;
            return parse(str, DEFAULT_PARSER_FEATURE);
        } catch (Exception e) {
            throw e;
        }
    }

    public static final Object parse(String str, int i) {
        if (str == null) {
            int i2 = toFloatRange + 75;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        try {
            DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.global, i);
            Object parse = defaultJSONParser.parse((Object) null);
            defaultJSONParser.handleResovleTask(parse);
            defaultJSONParser.close();
            int i4 = isInside + 39;
            toFloatRange = i4 % 128;
            int i5 = i4 % 2;
            return parse;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final Object parse(byte[] bArr, Feature... featureArr) {
        try {
            JSONObject parseObject = parseObject(new String(bArr, setMax((short) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 96), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1319392908, (byte) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "", 0) - 630218361, -101 - TextUtils.indexOf("", "", 0)).intern()), featureArr);
            int i = isInside + 123;
            toFloatRange = i % 128;
            if ((i % 2 != 0 ? 2 : 'E') != 2) {
                return parseObject;
            }
            Object obj = null;
            super.hashCode();
            return parseObject;
        } catch (UnsupportedEncodingException e) {
            throw new JSONException("UTF-8 not support", e);
        }
    }

    public static final Object parse(String str, Feature... featureArr) {
        int i = toFloatRange + 71;
        isInside = i % 128;
        if (i % 2 == 0) {
        }
        int i2 = DEFAULT_PARSER_FEATURE;
        int length2 = featureArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                return parse(str, i2);
            }
            i2 |= featureArr[i3].mask;
            i3++;
            try {
                int i4 = isInside + 27;
                try {
                    toFloatRange = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((r8 instanceof com.alibaba.fastjson.JSONObject) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r1 != '$') goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r0 = (com.alibaba.fastjson.JSONObject) toJSON(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        if ((DEFAULT_PARSER_FEATURE & com.alibaba.fastjson.parser.Feature.SupportAutoType.mask) == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r1 = isInside + 29;
        toFloatRange = r1 % 128;
        r1 = r1 % 2;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r1 != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r4 = isInside + 95;
        toFloatRange = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if ((r4 % 2) == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        r4 = r9.length;
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        r4 = r9.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r5 >= r4) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r7 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (r7 == 25) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        if (r9[r5] != com.alibaba.fastjson.parser.Feature.SupportAutoType) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        if (r6 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r1 == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        r1 = '?';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        r1 = 'R';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0096, code lost:
        if (r1 == '?') goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0099, code lost:
        r0.put(DEFAULT_TYPE_KEY, (java.lang.Object) r8.getClass().getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        r8 = isInside + 81;
        toFloatRange = r8 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b0, code lost:
        if ((r8 % 2) == 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b6, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b9, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.alibaba.fastjson.JSONObject parseObject(java.lang.String r8, com.alibaba.fastjson.parser.Feature... r9) {
        /*
            int r0 = toFloatRange     // Catch:{ Exception -> 0x00be }
            int r0 = r0 + 125
            int r1 = r0 % 128
            isInside = r1     // Catch:{ Exception -> 0x00be }
            int r0 = r0 % 2
            r1 = 40
            if (r0 != 0) goto L_0x0011
            r0 = 40
            goto L_0x0013
        L_0x0011:
            r0 = 21
        L_0x0013:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0025
            java.lang.Object r8 = parse((java.lang.String) r8, (com.alibaba.fastjson.parser.Feature[]) r9)
            boolean r0 = r8 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0044
            goto L_0x0037
        L_0x0025:
            java.lang.Object r8 = parse((java.lang.String) r8, (com.alibaba.fastjson.parser.Feature[]) r9)     // Catch:{ Exception -> 0x00bc }
            boolean r0 = r8 instanceof com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x00bc }
            r4 = 77
            int r4 = r4 / r2
            r4 = 36
            if (r0 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r1 = 36
        L_0x0035:
            if (r1 == r4) goto L_0x0044
        L_0x0037:
            int r9 = isInside
            int r9 = r9 + 73
            int r0 = r9 % 128
            toFloatRange = r0
            int r9 = r9 % 2
            com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8
            return r8
        L_0x0044:
            java.lang.Object r0 = toJSON(r8)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            int r1 = DEFAULT_PARSER_FEATURE
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.SupportAutoType
            int r4 = r4.mask
            r1 = r1 & r4
            if (r1 == 0) goto L_0x005f
            int r1 = isInside
            int r1 = r1 + 29
            int r4 = r1 % 128
            toFloatRange = r4
            int r1 = r1 % 2
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 != 0) goto L_0x008d
            int r4 = isInside
            int r4 = r4 + 95
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0071
            int r4 = r9.length
            r5 = 1
            goto L_0x0073
        L_0x0071:
            int r4 = r9.length
            r5 = 0
        L_0x0073:
            r6 = 25
            if (r5 >= r4) goto L_0x007a
            r7 = 25
            goto L_0x007b
        L_0x007a:
            r7 = 4
        L_0x007b:
            if (r7 == r6) goto L_0x007e
            goto L_0x008d
        L_0x007e:
            r6 = r9[r5]
            com.alibaba.fastjson.parser.Feature r7 = com.alibaba.fastjson.parser.Feature.SupportAutoType
            if (r6 != r7) goto L_0x0086
            r6 = 1
            goto L_0x0087
        L_0x0086:
            r6 = 0
        L_0x0087:
            if (r6 == 0) goto L_0x008a
            r1 = 1
        L_0x008a:
            int r5 = r5 + 1
            goto L_0x0073
        L_0x008d:
            r9 = 63
            if (r1 == 0) goto L_0x0094
            r1 = 63
            goto L_0x0096
        L_0x0094:
            r1 = 82
        L_0x0096:
            if (r1 == r9) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            java.lang.String r9 = "@type"
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r0.put((java.lang.String) r9, (java.lang.Object) r8)
        L_0x00a6:
            int r8 = isInside
            int r8 = r8 + 81
            int r9 = r8 % 128
            toFloatRange = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x00b9
            r8 = 0
            super.hashCode()     // Catch:{ all -> 0x00b7 }
            return r0
        L_0x00b7:
            r8 = move-exception
            throw r8
        L_0x00b9:
            return r0
        L_0x00ba:
            r8 = move-exception
            throw r8
        L_0x00bc:
            r8 = move-exception
            throw r8
        L_0x00be:
            r8 = move-exception
            goto L_0x00c1
        L_0x00c0:
            throw r8
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.parseObject(java.lang.String, com.alibaba.fastjson.parser.Feature[]):com.alibaba.fastjson.JSONObject");
    }

    public static final JSONObject parseObject(String str) {
        int i = toFloatRange + 95;
        isInside = i % 128;
        int i2 = i % 2;
        Object parse = parse(str);
        if (!(parse instanceof JSONObject)) {
            int i3 = toFloatRange + 33;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            if (parse != null) {
                try {
                    JSONObject jSONObject = (JSONObject) toJSON(parse);
                    boolean z = false;
                    if (!(!((DEFAULT_PARSER_FEATURE & Feature.SupportAutoType.mask) != 0))) {
                        int i5 = isInside + 79;
                        toFloatRange = i5 % 128;
                        if (i5 % 2 != 0) {
                            z = true;
                        }
                        if (!z) {
                            jSONObject.put(DEFAULT_TYPE_KEY, (Object) parse.getClass().getName());
                        } else {
                            try {
                                jSONObject.put(DEFAULT_TYPE_KEY, (Object) parse.getClass().getName());
                                Object obj = null;
                                super.hashCode();
                            } catch (Exception e) {
                                throw e;
                            }
                        }
                    }
                    return jSONObject;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return (JSONObject) parse;
    }

    public static final <T> T parseObject(String str, TypeReference<T> typeReference, Feature... featureArr) {
        int i = isInside + 25;
        toFloatRange = i % 128;
        int i2 = i % 2;
        T parseObject = parseObject(str, typeReference.type, ParserConfig.global, DEFAULT_PARSER_FEATURE, featureArr);
        int i3 = isInside + 61;
        toFloatRange = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 22 : 12) != 22) {
            return parseObject;
        }
        Object obj = null;
        super.hashCode();
        return parseObject;
    }

    public static final <T> T parseObject(String str, Class<T> cls, Feature... featureArr) {
        int i = isInside + 13;
        toFloatRange = i % 128;
        int i2 = i % 2;
        T parseObject = parseObject(str, cls, ParserConfig.global, DEFAULT_PARSER_FEATURE, featureArr);
        int i3 = isInside + 81;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        return parseObject;
    }

    public static final <T> T parseObject(String str, Class<T> cls, ParseProcess parseProcess, Feature... featureArr) {
        try {
            int i = toFloatRange + 115;
            try {
                isInside = i % 128;
                int i2 = i % 2;
                T parseObject = parseObject(str, cls, ParserConfig.global, parseProcess, DEFAULT_PARSER_FEATURE, featureArr);
                int i3 = isInside + 91;
                toFloatRange = i3 % 128;
                if ((i3 % 2 != 0 ? 0 : 'A') == 'A') {
                    return parseObject;
                }
                Object obj = null;
                super.hashCode();
                return parseObject;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final <T> T parseObject(String str, Type type, Feature... featureArr) {
        try {
            int i = toFloatRange + 93;
            isInside = i % 128;
            int i2 = i % 2;
            T parseObject = parseObject(str, type, ParserConfig.global, DEFAULT_PARSER_FEATURE, featureArr);
            int i3 = isInside + 53;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            return parseObject;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final <T> T parseObject(String str, Type type, ParseProcess parseProcess, Feature... featureArr) {
        try {
            int i = toFloatRange + 5;
            try {
                isInside = i % 128;
                int i2 = i % 2;
                T parseObject = parseObject(str, type, ParserConfig.global, parseProcess, DEFAULT_PARSER_FEATURE, featureArr);
                int i3 = toFloatRange + 21;
                isInside = i3 % 128;
                int i4 = i3 % 2;
                return parseObject;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final <T> T parseObject(String str, Type type, int i, Feature... featureArr) {
        if (str == null) {
            int i2 = toFloatRange + 125;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int length2 = featureArr.length;
        int i4 = 0;
        while (true) {
            if ((i4 < length2 ? '/' : '4') != '4') {
                try {
                    i |= featureArr[i4].mask;
                    i4++;
                    int i5 = isInside + 61;
                    toFloatRange = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.global, i);
                try {
                    T parseObject = defaultJSONParser.parseObject(type);
                    defaultJSONParser.handleResovleTask(parseObject);
                    defaultJSONParser.close();
                    return parseObject;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    public static final <T> T parseObject(String str, Type type, ParserConfig parserConfig, int i, Feature... featureArr) {
        int i2 = isInside + 51;
        toFloatRange = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return parseObject(str, type, parserConfig, (ParseProcess) null, i, featureArr);
        }
        T parseObject = parseObject(str, type, parserConfig, (ParseProcess) null, i, featureArr);
        Object obj = null;
        super.hashCode();
        return parseObject;
    }

    public static final <T> T parseObject(String str, Type type, ParserConfig parserConfig, ParseProcess parseProcess, int i, Feature... featureArr) {
        if (str == null) {
            int i2 = isInside + 45;
            toFloatRange = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        boolean z = false;
        for (Feature feature : featureArr) {
            i |= feature.mask;
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, parserConfig, i);
        try {
            if ((parseProcess instanceof ExtraTypeProvider ? Typography.amp : 'S') != 'S') {
                int i4 = toFloatRange + 107;
                isInside = i4 % 128;
                int i5 = i4 % 2;
                defaultJSONParser.getExtraTypeProviders().add((ExtraTypeProvider) parseProcess);
            }
            try {
                if (parseProcess instanceof ExtraProcessor) {
                    int i6 = toFloatRange + 87;
                    isInside = i6 % 128;
                    int i7 = i6 % 2;
                    defaultJSONParser.getExtraProcessors().add((ExtraProcessor) parseProcess);
                }
                if (!(parseProcess instanceof FieldTypeResolver)) {
                    z = true;
                }
                if (!z) {
                    int i8 = isInside + 103;
                    toFloatRange = i8 % 128;
                    int i9 = i8 % 2;
                    defaultJSONParser.fieldTypeResolver = (FieldTypeResolver) parseProcess;
                }
                T parseObject = defaultJSONParser.parseObject(type);
                defaultJSONParser.handleResovleTask(parseObject);
                defaultJSONParser.close();
                return parseObject;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final <T> T parseObject(byte[] bArr, Type type, Feature... featureArr) {
        try {
            T parseObject = parseObject(new String(bArr, setMax((short) (96 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))), -1319392908 - View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 630218362, TextUtils.lastIndexOf("", '0') - 100).intern()), type, featureArr);
            try {
                int i = toFloatRange + 83;
                isInside = i % 128;
                int i2 = i % 2;
                return parseObject;
            } catch (Exception e) {
                throw e;
            }
        } catch (UnsupportedEncodingException unused) {
            throw new JSONException("UTF-8 not support");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r7 != null ? '6' : ';') != ';') goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if ((r7 != null) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T parseObject(char[] r7, int r8, java.lang.reflect.Type r9, com.alibaba.fastjson.parser.Feature... r10) {
        /*
            int r0 = toFloatRange
            int r0 = r0 + 89
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001c
            super.hashCode()     // Catch:{ all -> 0x001a }
            if (r7 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x006e
            goto L_0x0027
        L_0x001a:
            r7 = move-exception
            throw r7
        L_0x001c:
            r0 = 59
            if (r7 == 0) goto L_0x0023
            r4 = 54
            goto L_0x0025
        L_0x0023:
            r4 = 59
        L_0x0025:
            if (r4 == r0) goto L_0x006e
        L_0x0027:
            int r0 = r7.length
            r4 = 35
            if (r0 != 0) goto L_0x002e
            r0 = 6
            goto L_0x0030
        L_0x002e:
            r0 = 35
        L_0x0030:
            if (r0 == r4) goto L_0x0033
            goto L_0x006e
        L_0x0033:
            int r0 = DEFAULT_PARSER_FEATURE     // Catch:{ Exception -> 0x006c }
            int r1 = r10.length
            r4 = 0
        L_0x0037:
            if (r4 >= r1) goto L_0x003b
            r5 = 0
            goto L_0x003c
        L_0x003b:
            r5 = 1
        L_0x003c:
            if (r5 == r3) goto L_0x0050
            int r5 = isInside
            int r5 = r5 + 95
            int r6 = r5 % 128
            toFloatRange = r6
            int r5 = r5 % 2
            r5 = r10[r4]
            int r5 = r5.mask
            r0 = r0 | r5
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0050:
            com.alibaba.fastjson.parser.DefaultJSONParser r10 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r1 = com.alibaba.fastjson.parser.ParserConfig.global
            r10.<init>(r7, r8, r1, r0)
            java.lang.Object r7 = r10.parseObject((java.lang.reflect.Type) r9)
            r10.handleResovleTask(r7)
            r10.close()
            int r8 = isInside
            int r8 = r8 + 71
            int r9 = r8 % 128
            toFloatRange = r9
            int r8 = r8 % 2
            return r7
        L_0x006c:
            r7 = move-exception
            throw r7
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.parseObject(char[], int, java.lang.reflect.Type, com.alibaba.fastjson.parser.Feature[]):java.lang.Object");
    }

    public static final <T> T parseObject(String str, Class<T> cls) {
        int i = toFloatRange + 123;
        isInside = i % 128;
        int i2 = i % 2;
        T parseObject = parseObject(str, cls, new Feature[0]);
        int i3 = toFloatRange + 95;
        isInside = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 11 : 8) == 8) {
            return parseObject;
        }
        int i4 = 68 / 0;
        return parseObject;
    }

    public static final JSONArray parseArray(String str) {
        int i = isInside + 93;
        toFloatRange = i % 128;
        JSONArray parseArray = !(i % 2 != 0) ? parseArray(str, new Feature[0]) : parseArray(str, new Feature[1]);
        try {
            int i2 = toFloatRange + 11;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            return parseArray;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final JSONArray parseArray(String str, Feature... featureArr) {
        int i = toFloatRange + 73;
        isInside = i % 128;
        int i2 = i % 2;
        JSONArray jSONArray = null;
        if (str == null) {
            int i3 = isInside + 59;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = DEFAULT_PARSER_FEATURE;
        boolean z = false;
        int i6 = 0;
        while (true) {
            if (!(i6 < featureArr.length)) {
                break;
            }
            i5 |= featureArr[i6].mask;
            i6++;
        }
        try {
            DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.global, i5);
            JSONLexer jSONLexer = defaultJSONParser.lexer;
            int i7 = jSONLexer.token();
            if (i7 == 8) {
                int i8 = toFloatRange + 39;
                isInside = i8 % 128;
                if (i8 % 2 == 0) {
                    jSONLexer.nextToken();
                    int i9 = 63 / 0;
                } else {
                    jSONLexer.nextToken();
                }
            } else {
                if (i7 != 20) {
                    z = true;
                }
                if (!z) {
                    try {
                        int i10 = isInside + 85;
                        toFloatRange = i10 % 128;
                        int i11 = i10 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    jSONArray = new JSONArray();
                    defaultJSONParser.parseArray((Collection) jSONArray);
                    defaultJSONParser.handleResovleTask(jSONArray);
                    int i12 = isInside + 37;
                    toFloatRange = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            defaultJSONParser.close();
            return jSONArray;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final <T> List<T> parseArray(String str, Class<T> cls) {
        int i = isInside + 89;
        toFloatRange = i % 128;
        int i2 = i % 2;
        boolean z = false;
        ArrayList arrayList = null;
        if (str == null) {
            int i3 = toFloatRange + 115;
            isInside = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (z) {
                super.hashCode();
            }
            return arrayList;
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.global);
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i4 = jSONLexer.token();
        if (i4 == 8) {
            jSONLexer.nextToken();
        } else {
            if (i4 == 20) {
                if (!jSONLexer.isBlankInput()) {
                    z = true;
                }
                if (!z) {
                    int i5 = toFloatRange + 41;
                    isInside = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            arrayList = new ArrayList();
            defaultJSONParser.parseArray((Class<?>) cls, (Collection) arrayList);
            defaultJSONParser.handleResovleTask(arrayList);
        }
        defaultJSONParser.close();
        return arrayList;
    }

    public static final List<Object> parseArray(String str, Type[] typeArr) {
        boolean z = false;
        List<Object> list = null;
        if (str != null) {
            DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.global);
            Object[] parseArray = defaultJSONParser.parseArray(typeArr);
            if (parseArray != null) {
                list = Arrays.asList(parseArray);
                int i = isInside + 1;
                toFloatRange = i % 128;
                int i2 = i % 2;
            } else {
                int i3 = isInside + 33;
                toFloatRange = i3 % 128;
                if (i3 % 2 == 0) {
                    z = true;
                }
                if (!z) {
                    super.hashCode();
                }
            }
            defaultJSONParser.handleResovleTask(list);
            defaultJSONParser.close();
        }
        return list;
    }

    public static Object parse(String str, ParserConfig parserConfig) {
        int i = isInside + 3;
        toFloatRange = i % 128;
        int i2 = i % 2;
        Object parse = parse(str, parserConfig, DEFAULT_PARSER_FEATURE);
        int i3 = toFloatRange + 99;
        isInside = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return parse;
        }
        int i4 = 15 / 0;
        return parse;
    }

    public static Object parse(String str, ParserConfig parserConfig, Feature... featureArr) {
        try {
            int i = toFloatRange + 59;
            isInside = i % 128;
            int i2 = i % 2;
            int i3 = DEFAULT_PARSER_FEATURE;
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i4 >= featureArr.length) {
                    return parse(str, parserConfig, i3);
                }
                int i5 = toFloatRange + 57;
                isInside = i5 % 128;
                if (i5 % 2 == 0) {
                    z = false;
                }
                if (z) {
                    i3 |= featureArr[i4].mask;
                    i4++;
                } else {
                    try {
                        i3 &= featureArr[i4].mask;
                        i4 += 93;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static Object parse(String str, ParserConfig parserConfig, int i) {
        if ((str == null ? 'G' : '9') != '9') {
            int i2 = toFloatRange + 105;
            isInside = i2 % 128;
            Object[] objArr = null;
            if ((i2 % 2 == 0 ? '\\' : 'H') == 'H') {
                return objArr;
            }
            int length2 = objArr.length;
            return objArr;
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, parserConfig, i);
        try {
            Object parse = defaultJSONParser.parse();
            defaultJSONParser.handleResovleTask(parse);
            defaultJSONParser.close();
            int i3 = toFloatRange + 59;
            isInside = i3 % 128;
            if (i3 % 2 != 0) {
                return parse;
            }
            int i4 = 88 / 0;
            return parse;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final String toJSONString(Object obj) {
        String str;
        int i = toFloatRange + 123;
        isInside = i % 128;
        if (i % 2 == 0) {
            str = toJSONString(obj, SerializeConfig.globalInstance, (SerializeFilter[]) null, (String) null, DEFAULT_GENERATE_FEATURE, new SerializerFeature[0]);
        } else {
            try {
                try {
                    str = toJSONString(obj, SerializeConfig.globalInstance, (SerializeFilter[]) null, (String) null, DEFAULT_GENERATE_FEATURE, new SerializerFeature[0]);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = toFloatRange + 23;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final String toJSONString(Object obj, SerializerFeature... serializerFeatureArr) {
        int i = isInside + 107;
        toFloatRange = i % 128;
        int i2 = i % 2;
        String jSONString = toJSONString(obj, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        int i3 = toFloatRange + 77;
        isInside = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return jSONString;
        }
        Object obj2 = null;
        super.hashCode();
        return jSONString;
    }

    public static final String toJSONString(Object obj, int i, SerializerFeature... serializerFeatureArr) {
        int i2 = isInside + 51;
        toFloatRange = i2 % 128;
        int i3 = i2 % 2;
        String jSONString = toJSONString(obj, SerializeConfig.globalInstance, (SerializeFilter[]) null, (String) null, i, serializerFeatureArr);
        int i4 = isInside + 9;
        toFloatRange = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return jSONString;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return jSONString;
    }

    public static final String toJSONStringWithDateFormat(Object obj, String str, SerializerFeature... serializerFeatureArr) {
        int i = isInside + 5;
        toFloatRange = i % 128;
        int i2 = i % 2;
        String jSONString = toJSONString(obj, SerializeConfig.globalInstance, (SerializeFilter[]) null, str, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        try {
            int i3 = toFloatRange + 33;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            return jSONString;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final String toJSONString(Object obj, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        try {
            int i = isInside + 105;
            toFloatRange = i % 128;
            int i2 = i % 2;
            String jSONString = toJSONString(obj, SerializeConfig.globalInstance, new SerializeFilter[]{serializeFilter}, (String) null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
            try {
                int i3 = toFloatRange + 79;
                isInside = i3 % 128;
                if ((i3 % 2 == 0 ? '-' : ' ') != '-') {
                    return jSONString;
                }
                Object obj2 = null;
                super.hashCode();
                return jSONString;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final String toJSONString(Object obj, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        int i = isInside + 101;
        toFloatRange = i % 128;
        int i2 = i % 2;
        String jSONString = toJSONString(obj, SerializeConfig.globalInstance, serializeFilterArr, (String) null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        try {
            int i3 = toFloatRange + 29;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            return jSONString;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: finally extract failed */
    public static final byte[] toJSONBytes(Object obj, SerializerFeature... serializerFeatureArr) {
        SerializeWriter serializeWriter = new SerializeWriter((Writer) null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        try {
            new JSONSerializer(serializeWriter, SerializeConfig.globalInstance).write(obj);
            byte[] bytes = serializeWriter.toBytes(setMax((short) (97 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), KeyEvent.getDeadChar(0, 0) - 1319392908, (byte) (TextUtils.indexOf("", '0') + 1), -630218361 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -101 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
            serializeWriter.close();
            int i = isInside + 93;
            toFloatRange = i % 128;
            int i2 = i % 2;
            return bytes;
        } catch (Throwable th) {
            serializeWriter.close();
            throw th;
        }
    }

    public static final String toJSONString(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        try {
            int i = isInside + 103;
            toFloatRange = i % 128;
            int i2 = i % 2;
            String jSONString = toJSONString(obj, serializeConfig, (SerializeFilter[]) null, (String) null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
            int i3 = toFloatRange + 77;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            return jSONString;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        try {
            int i = toFloatRange + 45;
            isInside = i % 128;
            int i2 = i % 2;
            String jSONString = toJSONString(obj, serializeConfig, new SerializeFilter[]{serializeFilter}, (String) null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
            int i3 = isInside + 19;
            toFloatRange = i3 % 128;
            if ((i3 % 2 != 0 ? 4 : 'I') != 4) {
                return jSONString;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return jSONString;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        int i = isInside + 83;
        toFloatRange = i % 128;
        if (i % 2 != 0) {
            String jSONString = toJSONString(obj, serializeConfig, serializeFilterArr, (String) null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
            Object obj2 = null;
            super.hashCode();
            return jSONString;
        }
        return toJSONString(obj, serializeConfig, serializeFilterArr, (String) null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static final String toJSONStringZ(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        int i = toFloatRange + 57;
        isInside = i % 128;
        int i2 = i % 2;
        try {
            String jSONString = toJSONString(obj, SerializeConfig.globalInstance, (SerializeFilter[]) null, (String) null, 0, serializerFeatureArr);
            int i3 = toFloatRange + 9;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            return jSONString;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.Writer] */
    public static final byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        ? r3 = 0;
        SerializeWriter serializeWriter = new SerializeWriter(r3, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        try {
            new JSONSerializer(serializeWriter, serializeConfig).write(obj);
            boolean z = false;
            byte[] bytes = serializeWriter.toBytes(setMax((short) (97 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), -1319392908 - TextUtils.indexOf("", "", 0, 0), (byte) (MotionEvent.axisFromString("") + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) - 630218360, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 101).intern());
            serializeWriter.close();
            int i = isInside + 11;
            toFloatRange = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (z) {
                return bytes;
            }
            int length2 = r3.length;
            return bytes;
        } catch (Throwable th) {
            serializeWriter.close();
            throw th;
        }
    }

    public static byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, int i, SerializerFeature... serializerFeatureArr) {
        int i2 = isInside + 77;
        toFloatRange = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        byte[] jSONBytes = toJSONBytes(obj, serializeConfig, new SerializeFilter[0], i, serializerFeatureArr);
        int i4 = isInside + 29;
        toFloatRange = i4 % 128;
        if (i4 % 2 == 0) {
            z = true;
        }
        if (z) {
            return jSONBytes;
        }
        Object obj2 = null;
        super.hashCode();
        return jSONBytes;
    }

    public static byte[] toJSONBytes(Object obj, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        boolean z = true;
        int i = toFloatRange + 1;
        isInside = i % 128;
        int i2 = i % 2;
        byte[] jSONBytes = toJSONBytes(obj, SerializeConfig.globalInstance, serializeFilterArr, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        int i3 = isInside + 95;
        toFloatRange = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (z) {
            return jSONBytes;
        }
        Object obj2 = null;
        super.hashCode();
        return jSONBytes;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.alibaba.fastjson.serializer.BeforeFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.alibaba.fastjson.serializer.PropertyFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.alibaba.fastjson.serializer.ValueFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.alibaba.fastjson.serializer.NameFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.alibaba.fastjson.serializer.PropertyPreFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.alibaba.fastjson.serializer.PropertyPreFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.alibaba.fastjson.serializer.AfterFilter} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.Writer, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] toJSONBytes(java.lang.Object r6, com.alibaba.fastjson.serializer.SerializeConfig r7, com.alibaba.fastjson.serializer.SerializeFilter[] r8, int r9, com.alibaba.fastjson.serializer.SerializerFeature... r10) {
        /*
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r1 = 0
            r0.<init>(r1, r9, r10)
            com.alibaba.fastjson.serializer.JSONSerializer r9 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch:{ all -> 0x0102 }
            r9.<init>(r0, r7)     // Catch:{ all -> 0x0102 }
            r7 = 88
            if (r8 == 0) goto L_0x0012
            r10 = 88
            goto L_0x0014
        L_0x0012:
            r10 = 47
        L_0x0014:
            r2 = 0
            if (r10 == r7) goto L_0x0018
            goto L_0x0025
        L_0x0018:
            int r7 = r8.length     // Catch:{ all -> 0x0102 }
            r10 = 0
        L_0x001a:
            r3 = 73
            if (r10 >= r7) goto L_0x0021
            r4 = 73
            goto L_0x0023
        L_0x0021:
            r4 = 58
        L_0x0023:
            if (r4 == r3) goto L_0x0061
        L_0x0025:
            r9.write((java.lang.Object) r6)     // Catch:{ all -> 0x0102 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0102 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r10 = r10 + 96
            short r6 = (short) r10     // Catch:{ all -> 0x0102 }
            r7 = -1319392908(0xffffffffb15ba974, float:-3.1965017E-9)
            int r8 = android.widget.ExpandableListView.getPackedPositionGroup(r8)     // Catch:{ all -> 0x0102 }
            int r7 = r7 - r8
            int r8 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x0102 }
            int r8 = r8 >> 16
            byte r8 = (byte) r8     // Catch:{ all -> 0x0102 }
            r9 = -630218360(0xffffffffda6fa188, float:-1.68625312E16)
            int r10 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch:{ all -> 0x0102 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0102 }
            int r10 = r10 + r9
            int r9 = android.view.View.resolveSize(r2, r2)     // Catch:{ all -> 0x0102 }
            int r9 = -101 - r9
            java.lang.String r6 = setMax(r6, r7, r8, r10, r9)     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = r6.intern()     // Catch:{ all -> 0x0102 }
            byte[] r6 = r0.toBytes(r6)     // Catch:{ all -> 0x0102 }
            r0.close()
            return r6
        L_0x0061:
            int r3 = isInside
            int r3 = r3 + 85
            int r4 = r3 % 128
            toFloatRange = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0075
            r3 = r8[r10]     // Catch:{ all -> 0x0102 }
            super.hashCode()     // Catch:{ all -> 0x0102 }
            if (r3 == 0) goto L_0x00fe
            goto L_0x0079
        L_0x0075:
            r3 = r8[r10]     // Catch:{ all -> 0x0102 }
            if (r3 == 0) goto L_0x00fe
        L_0x0079:
            boolean r4 = r3 instanceof com.alibaba.fastjson.serializer.PropertyPreFilter     // Catch:{ all -> 0x0102 }
            r5 = 1
            if (r4 == 0) goto L_0x0080
            r4 = 0
            goto L_0x0081
        L_0x0080:
            r4 = 1
        L_0x0081:
            if (r4 == r5) goto L_0x008d
            java.util.List r4 = r9.getPropertyPreFilters()     // Catch:{ all -> 0x0102 }
            r5 = r3
            com.alibaba.fastjson.serializer.PropertyPreFilter r5 = (com.alibaba.fastjson.serializer.PropertyPreFilter) r5     // Catch:{ all -> 0x0102 }
            r4.add(r5)     // Catch:{ all -> 0x0102 }
        L_0x008d:
            boolean r4 = r3 instanceof com.alibaba.fastjson.serializer.NameFilter     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x00b3
            int r4 = isInside
            int r4 = r4 + 7
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x00a9
            java.util.List r4 = r9.getNameFilters()     // Catch:{ all -> 0x0102 }
            r5 = r3
            com.alibaba.fastjson.serializer.NameFilter r5 = (com.alibaba.fastjson.serializer.NameFilter) r5     // Catch:{ all -> 0x0102 }
            r4.add(r5)     // Catch:{ all -> 0x0102 }
            int r4 = r1.length     // Catch:{ all -> 0x0102 }
            goto L_0x00b3
        L_0x00a9:
            java.util.List r4 = r9.getNameFilters()     // Catch:{ all -> 0x0102 }
            r5 = r3
            com.alibaba.fastjson.serializer.NameFilter r5 = (com.alibaba.fastjson.serializer.NameFilter) r5     // Catch:{ all -> 0x0102 }
            r4.add(r5)     // Catch:{ all -> 0x0102 }
        L_0x00b3:
            boolean r4 = r3 instanceof com.alibaba.fastjson.serializer.ValueFilter     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x00cb
            int r4 = isInside
            int r4 = r4 + 115
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            java.util.List r4 = r9.getValueFilters()     // Catch:{ all -> 0x0102 }
            r5 = r3
            com.alibaba.fastjson.serializer.ValueFilter r5 = (com.alibaba.fastjson.serializer.ValueFilter) r5     // Catch:{ all -> 0x0102 }
            r4.add(r5)     // Catch:{ all -> 0x0102 }
        L_0x00cb:
            boolean r4 = r3 instanceof com.alibaba.fastjson.serializer.PropertyFilter     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x00d9
            java.util.List r4 = r9.getPropertyFilters()     // Catch:{ all -> 0x0102 }
            r5 = r3
            com.alibaba.fastjson.serializer.PropertyFilter r5 = (com.alibaba.fastjson.serializer.PropertyFilter) r5     // Catch:{ all -> 0x0102 }
            r4.add(r5)     // Catch:{ all -> 0x0102 }
        L_0x00d9:
            boolean r4 = r3 instanceof com.alibaba.fastjson.serializer.BeforeFilter     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x00e7
            java.util.List r4 = r9.getBeforeFilters()     // Catch:{ all -> 0x0102 }
            r5 = r3
            com.alibaba.fastjson.serializer.BeforeFilter r5 = (com.alibaba.fastjson.serializer.BeforeFilter) r5     // Catch:{ all -> 0x0102 }
            r4.add(r5)     // Catch:{ all -> 0x0102 }
        L_0x00e7:
            boolean r4 = r3 instanceof com.alibaba.fastjson.serializer.AfterFilter     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x00fe
            int r4 = isInside
            int r4 = r4 + 105
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            java.util.List r4 = r9.getAfterFilters()     // Catch:{ all -> 0x0102 }
            com.alibaba.fastjson.serializer.AfterFilter r3 = (com.alibaba.fastjson.serializer.AfterFilter) r3     // Catch:{ all -> 0x0102 }
            r4.add(r3)     // Catch:{ all -> 0x0102 }
        L_0x00fe:
            int r10 = r10 + 1
            goto L_0x001a
        L_0x0102:
            r6 = move-exception
            r0.close()
            goto L_0x0108
        L_0x0107:
            throw r6
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSONBytes(java.lang.Object, com.alibaba.fastjson.serializer.SerializeConfig, com.alibaba.fastjson.serializer.SerializeFilter[], int, com.alibaba.fastjson.serializer.SerializerFeature[]):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((!r4 ? '*' : 'B') != 'B') goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4 = new com.alibaba.fastjson.serializer.SerializerFeature[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        r4[0] = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0042, code lost:
        return toJSONString(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if ((!r4) != true) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String toJSONString(java.lang.Object r3, boolean r4) {
        /*
            int r0 = isInside
            int r0 = r0 + 95
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x0014
            r4 = 1
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            if (r4 == r2) goto L_0x0025
            goto L_0x0038
        L_0x0018:
            r3 = move-exception
            throw r3
        L_0x001a:
            r0 = 66
            if (r4 != 0) goto L_0x0021
            r4 = 42
            goto L_0x0023
        L_0x0021:
            r4 = 66
        L_0x0023:
            if (r4 == r0) goto L_0x0038
        L_0x0025:
            java.lang.String r3 = toJSONString(r3)
            int r4 = toFloatRange     // Catch:{ Exception -> 0x0036 }
            int r4 = r4 + 49
            int r0 = r4 % 128
            isInside = r0     // Catch:{ Exception -> 0x0034 }
            int r4 = r4 % 2
            return r3
        L_0x0034:
            r3 = move-exception
            goto L_0x0043
        L_0x0036:
            r3 = move-exception
            goto L_0x0044
        L_0x0038:
            com.alibaba.fastjson.serializer.SerializerFeature[] r4 = new com.alibaba.fastjson.serializer.SerializerFeature[r2]     // Catch:{ Exception -> 0x0036 }
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch:{ Exception -> 0x0034 }
            r4[r1] = r0
            java.lang.String r3 = toJSONString((java.lang.Object) r3, (com.alibaba.fastjson.serializer.SerializerFeature[]) r4)     // Catch:{ Exception -> 0x0034 }
            return r3
        L_0x0043:
            throw r3
        L_0x0044:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSONString(java.lang.Object, boolean):java.lang.String");
    }

    /* JADX INFO: finally extract failed */
    public static final void writeJSONStringTo(Object obj, Writer writer, SerializerFeature... serializerFeatureArr) {
        SerializeWriter serializeWriter = new SerializeWriter(writer, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        try {
            new JSONSerializer(serializeWriter, SerializeConfig.globalInstance).write(obj);
            serializeWriter.close();
            int i = isInside + 115;
            toFloatRange = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            serializeWriter.close();
            throw th;
        }
    }

    public String toString() {
        try {
            int i = isInside + 103;
            toFloatRange = i % 128;
            int i2 = i % 2;
            String jSONString = toJSONString();
            int i3 = toFloatRange + 27;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            return jSONString;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.Writer] */
    public String toJSONString() {
        ? r3 = 0;
        SerializeWriter serializeWriter = new SerializeWriter(r3, DEFAULT_GENERATE_FEATURE, SerializerFeature.EMPTY);
        try {
            new JSONSerializer(serializeWriter, SerializeConfig.globalInstance).write((Object) this);
            String obj = serializeWriter.toString();
            serializeWriter.close();
            int i = isInside + 37;
            toFloatRange = i % 128;
            if ((i % 2 != 0 ? 'E' : Typography.amp) != 'E') {
                return obj;
            }
            int length2 = r3.length;
            return obj;
        } catch (Throwable th) {
            serializeWriter.close();
            throw th;
        }
    }

    public void writeJSONString(Appendable appendable) {
        SerializeWriter serializeWriter = new SerializeWriter((Writer) null, DEFAULT_GENERATE_FEATURE, SerializerFeature.EMPTY);
        try {
            new JSONSerializer(serializeWriter, SerializeConfig.globalInstance).write((Object) this);
            appendable.append(serializeWriter.toString());
            serializeWriter.close();
            try {
                int i = isInside + 53;
                toFloatRange = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (IOException e2) {
            throw new JSONException(e2.getMessage(), e2);
        } catch (Throwable th) {
            serializeWriter.close();
            throw th;
        }
    }

    public static final Object toJSON(Object obj) {
        int i = isInside + 55;
        toFloatRange = i % 128;
        int i2 = i % 2;
        Object json = toJSON(obj, SerializeConfig.globalInstance);
        try {
            int i3 = toFloatRange + 65;
            isInside = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return json;
            }
            Object obj2 = null;
            super.hashCode();
            return json;
        } catch (Exception e) {
            throw e;
        }
    }

    @Deprecated
    public static final Object toJSON(Object obj, ParserConfig parserConfig) {
        int i = isInside + 41;
        toFloatRange = i % 128;
        if (i % 2 == 0) {
            return toJSON(obj, SerializeConfig.globalInstance);
        }
        try {
            Object json = toJSON(obj, SerializeConfig.globalInstance);
            Object[] objArr = null;
            int length2 = objArr.length;
            return json;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a9, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01aa, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b2, code lost:
        throw new com.alibaba.fastjson.JSONException("toJSON error", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b4, code lost:
        r6 = ((java.lang.Enum) r6).name();
        r7 = toFloatRange + 23;
        isInside = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c4, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return (com.alibaba.fastjson.JSON) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return (com.alibaba.fastjson.JSON) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if ((r6 instanceof com.alibaba.fastjson.JSON) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r7 = toFloatRange + 57;
        isInside = r7 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if ((r7 % 2) != 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7 = 83 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        if ((r6 instanceof java.util.Map) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        r6 = (java.util.Map) r6;
        r7 = r6.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if ((r6 instanceof java.util.LinkedHashMap) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        r0 = new java.util.LinkedHashMap(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005e, code lost:
        if ((r6 instanceof java.util.TreeMap) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        r0 = new java.util.TreeMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r0 = new java.util.HashMap(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        r7 = new com.alibaba.fastjson.JSONObject((java.util.Map<java.lang.String, java.lang.Object>) r0);
        r6 = r6.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r6.hasNext() == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        r0 = '9';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        r0 = '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (r0 == '@') goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        r0 = isInside + 1;
        toFloatRange = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
        if ((r0 % 2) == 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        r0 = (java.util.Map.Entry) r6.next();
        r7.put(com.alibaba.fastjson.util.TypeUtils.castToString(r0.getKey()), toJSON(r0.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0 = 72 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0 = (java.util.Map.Entry) r6.next();
        r7.put(com.alibaba.fastjson.util.TypeUtils.castToString(r0.getKey()), toJSON(r0.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r6 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cb, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if ((r6 instanceof java.util.Collection) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d0, code lost:
        r6 = (java.util.Collection) r6;
        r7 = new com.alibaba.fastjson.JSONArray(r6.size());
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e3, code lost:
        if (r6.hasNext() == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e5, code lost:
        r0 = isInside + 95;
        toFloatRange = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        if ((r0 % 2) == 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f1, code lost:
        r7.add(toJSON(r6.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0 = 98 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0102, code lost:
        r7.add(toJSON(r6.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010f, code lost:
        r0 = r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0117, code lost:
        if (r0.isEnum() == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0119, code lost:
        r2 = '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011c, code lost:
        r2 = kotlin.text.Typography.dollar;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011e, code lost:
        if (r2 == '@') goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r0.isArray() == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
        r2 = java.lang.reflect.Array.getLength(r6);
        r5 = new com.alibaba.fastjson.JSONArray(r2);
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0130, code lost:
        if (r7 >= r2) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0132, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0134, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0135, code lost:
        if (r0 == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0137, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r6 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0138, code lost:
        r0 = isInside + 11;
        toFloatRange = r0 % 128;
        r0 = r0 % 2;
        r5.add(toJSON(java.lang.reflect.Array.get(r6, r7)));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0154, code lost:
        if (com.alibaba.fastjson.parser.ParserConfig.isPrimitive(r0) == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0156, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0157, code lost:
        r7 = r7.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015d, code lost:
        if ((r7 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer) == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015f, code lost:
        r7 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r7;
        r0 = new com.alibaba.fastjson.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r6 = r7.getFieldValuesMap(r6).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0176, code lost:
        if (r6.hasNext() == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0178, code lost:
        r7 = r6.next();
        r0.put((java.lang.String) r7.getKey(), toJSON(r7.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0190, code lost:
        r6 = toFloatRange + 15;
        isInside = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019c, code lost:
        if ((r6 % 2) != 0) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019e, code lost:
        r6 = kotlin.text.Typography.quote;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a1, code lost:
        r6 = '%';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a3, code lost:
        if (r6 == '%') goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r6 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a6, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object toJSON(java.lang.Object r6, com.alibaba.fastjson.serializer.SerializeConfig r7) {
        /*
            int r0 = isInside
            int r0 = r0 + 59
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0013
            int r0 = r1.length     // Catch:{ all -> 0x0011 }
            if (r6 != 0) goto L_0x0028
            goto L_0x0015
        L_0x0011:
            r6 = move-exception
            throw r6
        L_0x0013:
            if (r6 != 0) goto L_0x0028
        L_0x0015:
            int r6 = toFloatRange
            int r6 = r6 + 125
            int r7 = r6 % 128
            isInside = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0027
            super.hashCode()     // Catch:{ all -> 0x0025 }
            return r1
        L_0x0025:
            r6 = move-exception
            throw r6
        L_0x0027:
            return r1
        L_0x0028:
            boolean r0 = r6 instanceof com.alibaba.fastjson.JSON
            r2 = 57
            r3 = 0
            if (r0 == 0) goto L_0x0045
            int r7 = toFloatRange
            int r7 = r7 + r2
            int r0 = r7 % 128
            isInside = r0
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x0042
            com.alibaba.fastjson.JSON r6 = (com.alibaba.fastjson.JSON) r6
            r7 = 83
            int r7 = r7 / r3
            goto L_0x0044
        L_0x0040:
            r6 = move-exception
            throw r6
        L_0x0042:
            com.alibaba.fastjson.JSON r6 = (com.alibaba.fastjson.JSON) r6
        L_0x0044:
            return r6
        L_0x0045:
            boolean r0 = r6 instanceof java.util.Map
            r4 = 1
            r5 = 64
            if (r0 == 0) goto L_0x00cc
            java.util.Map r6 = (java.util.Map) r6
            int r7 = r6.size()
            boolean r0 = r6 instanceof java.util.LinkedHashMap
            if (r0 == 0) goto L_0x005c
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r7)
            goto L_0x006b
        L_0x005c:
            boolean r0 = r6 instanceof java.util.TreeMap
            if (r0 == 0) goto L_0x0066
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            goto L_0x006b
        L_0x0066:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r7)
        L_0x006b:
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>((java.util.Map<java.lang.String, java.lang.Object>) r0)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0078:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0081
            r0 = 57
            goto L_0x0083
        L_0x0081:
            r0 = 64
        L_0x0083:
            if (r0 == r5) goto L_0x00cb
            int r0 = isInside
            int r0 = r0 + r4
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = com.alibaba.fastjson.util.TypeUtils.castToString(r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = toJSON(r0)
            r7.put((java.lang.String) r1, (java.lang.Object) r0)
            r0 = 72
            int r0 = r0 / r3
            goto L_0x0078
        L_0x00ad:
            r6 = move-exception
            throw r6
        L_0x00af:
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x00c9 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x00c9 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r1 = com.alibaba.fastjson.util.TypeUtils.castToString(r1)     // Catch:{ Exception -> 0x00c9 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x00c9 }
            java.lang.Object r0 = toJSON(r0)     // Catch:{ Exception -> 0x00c9 }
            r7.put((java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x0078
        L_0x00c9:
            r6 = move-exception
            throw r6
        L_0x00cb:
            return r7
        L_0x00cc:
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x010f
            java.util.Collection r6 = (java.util.Collection) r6
            com.alibaba.fastjson.JSONArray r7 = new com.alibaba.fastjson.JSONArray
            int r0 = r6.size()
            r7.<init>((int) r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x00df:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x010e
            int r0 = isInside
            int r0 = r0 + 95
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = r6.next()
            java.lang.Object r0 = toJSON(r0)
            r7.add(r0)
            r0 = 98
            int r0 = r0 / r3
            goto L_0x00df
        L_0x0100:
            r6 = move-exception
            throw r6
        L_0x0102:
            java.lang.Object r0 = r6.next()
            java.lang.Object r0 = toJSON(r0)
            r7.add(r0)
            goto L_0x00df
        L_0x010e:
            return r7
        L_0x010f:
            java.lang.Class r0 = r6.getClass()
            boolean r2 = r0.isEnum()
            if (r2 == 0) goto L_0x011c
            r2 = 64
            goto L_0x011e
        L_0x011c:
            r2 = 36
        L_0x011e:
            if (r2 == r5) goto L_0x01b4
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0150
            int r2 = java.lang.reflect.Array.getLength(r6)
            com.alibaba.fastjson.JSONArray r5 = new com.alibaba.fastjson.JSONArray
            r5.<init>((int) r2)
            r7 = 0
        L_0x0130:
            if (r7 >= r2) goto L_0x0134
            r0 = 0
            goto L_0x0135
        L_0x0134:
            r0 = 1
        L_0x0135:
            if (r0 == 0) goto L_0x0138
            return r5
        L_0x0138:
            int r0 = isInside
            int r0 = r0 + 11
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            java.lang.Object r0 = java.lang.reflect.Array.get(r6, r7)
            java.lang.Object r0 = toJSON(r0)
            r5.add(r0)
            int r7 = r7 + 1
            goto L_0x0130
        L_0x0150:
            boolean r2 = com.alibaba.fastjson.parser.ParserConfig.isPrimitive(r0)
            if (r2 == 0) goto L_0x0157
            return r6
        L_0x0157:
            com.alibaba.fastjson.serializer.ObjectSerializer r7 = r7.get(r0)
            boolean r0 = r7 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer
            if (r0 == 0) goto L_0x01b3
            com.alibaba.fastjson.serializer.JavaBeanSerializer r7 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r7
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            java.util.Map r6 = r7.getFieldValuesMap(r6)     // Catch:{ Exception -> 0x01aa }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x01aa }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x01aa }
        L_0x0172:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x01aa }
            if (r7 == 0) goto L_0x0190
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x01aa }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x01aa }
            java.lang.Object r2 = r7.getKey()     // Catch:{ Exception -> 0x01aa }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01aa }
            java.lang.Object r7 = r7.getValue()     // Catch:{ Exception -> 0x01aa }
            java.lang.Object r7 = toJSON(r7)     // Catch:{ Exception -> 0x01aa }
            r0.put((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ Exception -> 0x01aa }
            goto L_0x0172
        L_0x0190:
            int r6 = toFloatRange
            int r6 = r6 + 15
            int r7 = r6 % 128
            isInside = r7
            int r6 = r6 % 2
            r7 = 37
            if (r6 != 0) goto L_0x01a1
            r6 = 34
            goto L_0x01a3
        L_0x01a1:
            r6 = 37
        L_0x01a3:
            if (r6 == r7) goto L_0x01a9
            int r6 = r1.length     // Catch:{ all -> 0x01a7 }
            return r0
        L_0x01a7:
            r6 = move-exception
            throw r6
        L_0x01a9:
            return r0
        L_0x01aa:
            r6 = move-exception
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "toJSON error"
            r7.<init>(r0, r6)
            throw r7
        L_0x01b3:
            return r1
        L_0x01b4:
            java.lang.Enum r6 = (java.lang.Enum) r6
            java.lang.String r6 = r6.name()
            int r7 = toFloatRange
            int r7 = r7 + 23
            int r0 = r7 % 128
            isInside = r0
            int r7 = r7 % 2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSON(java.lang.Object, com.alibaba.fastjson.serializer.SerializeConfig):java.lang.Object");
    }

    public static final <T> T toJavaObject(JSON json, Class<T> cls) {
        T t;
        int i = isInside + 99;
        toFloatRange = i % 128;
        if (!(i % 2 == 0)) {
            t = TypeUtils.cast((Object) json, cls, ParserConfig.global);
            Object obj = null;
            super.hashCode();
        } else {
            t = TypeUtils.cast((Object) json, cls, ParserConfig.global);
        }
        int i2 = isInside + 37;
        toFloatRange = i2 % 128;
        if ((i2 % 2 != 0 ? '-' : '!') != '-') {
            return t;
        }
        int i3 = 22 / 0;
        return t;
    }

    public <T> T toJavaObject(Class<T> cls) {
        try {
            int i = toFloatRange + 47;
            isInside = i % 128;
            int i2 = i % 2;
            T cast = TypeUtils.cast((Object) this, cls, ParserConfig.getGlobalInstance());
            int i3 = isInside + 11;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            return cast;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, String str, int i, SerializerFeature... serializerFeatureArr) {
        int i2;
        int i3;
        PropertyPreFilter propertyPreFilter;
        SerializerFeature serializerFeature;
        Writer writer = null;
        SerializeWriter serializeWriter = new SerializeWriter(writer, i, serializerFeatureArr);
        JSONSerializer jSONSerializer = new JSONSerializer(serializeWriter, serializeConfig);
        int length2 = serializerFeatureArr.length;
        int i4 = 0;
        while (true) {
            if ((i4 < length2 ? 29 : ')') != 29) {
                break;
            }
            jSONSerializer.config(serializerFeatureArr[i4], true);
            i4++;
        }
        if (!(str == null || str.length() == 0)) {
            int i5 = toFloatRange + 71;
            isInside = i5 % 128;
            if (i5 % 2 == 0) {
                jSONSerializer.setDateFormat(str);
                serializerFeature = SerializerFeature.WriteDateUseDateFormat;
            } else {
                jSONSerializer.setDateFormat(str);
                serializerFeature = SerializerFeature.WriteDateUseDateFormat;
            }
            jSONSerializer.config(serializerFeature, true);
        }
        if (serializeFilterArr != null) {
            try {
                int i6 = toFloatRange + 59;
                isInside = i6 % 128;
                if (i6 % 2 == 0) {
                    i3 = serializeFilterArr.length;
                    i2 = 1;
                } else {
                    i3 = serializeFilterArr.length;
                    i2 = 0;
                }
                while (i2 < i3) {
                    int i7 = isInside + 83;
                    toFloatRange = i7 % 128;
                    if (i7 % 2 != 0) {
                        propertyPreFilter = serializeFilterArr[i2];
                        super.hashCode();
                        if (propertyPreFilter == null) {
                            i2++;
                        }
                    } else {
                        propertyPreFilter = serializeFilterArr[i2];
                        if (propertyPreFilter == null) {
                            i2++;
                        }
                    }
                    if (propertyPreFilter instanceof PropertyPreFilter) {
                        jSONSerializer.getPropertyPreFilters().add(propertyPreFilter);
                    }
                    if (propertyPreFilter instanceof NameFilter) {
                        jSONSerializer.getNameFilters().add((NameFilter) propertyPreFilter);
                    }
                    if (propertyPreFilter instanceof ValueFilter) {
                        jSONSerializer.getValueFilters().add(propertyPreFilter);
                    }
                    if ((propertyPreFilter instanceof PropertyFilter ? 'R' : '=') == 'R') {
                        jSONSerializer.getPropertyFilters().add(propertyPreFilter);
                        int i8 = toFloatRange + 115;
                        isInside = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    try {
                        if (propertyPreFilter instanceof BeforeFilter) {
                            int i10 = isInside + 105;
                            toFloatRange = i10 % 128;
                            if (!(i10 % 2 == 0)) {
                                jSONSerializer.getBeforeFilters().add(propertyPreFilter);
                                super.hashCode();
                            } else {
                                jSONSerializer.getBeforeFilters().add(propertyPreFilter);
                            }
                        }
                        if (propertyPreFilter instanceof AfterFilter) {
                            jSONSerializer.getAfterFilters().add((AfterFilter) propertyPreFilter);
                        }
                        i2++;
                    } catch (Throwable th) {
                        serializeWriter.close();
                        throw th;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        jSONSerializer.write(obj);
        String obj2 = serializeWriter.toString();
        serializeWriter.close();
        return obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (setMax != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r1 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009e, code lost:
        r3 = r9 - 1;
        r7 = r7 + (((short) (getMax[r9] + r6)) ^ r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(short r6, int r7, byte r8, int r9, int r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = getMin
            int r10 = r10 + r1
            r1 = 37
            r2 = -1
            if (r10 != r2) goto L_0x0010
            r2 = 37
            goto L_0x0011
        L_0x0010:
            r2 = 6
        L_0x0011:
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L_0x0017
            r1 = 0
            goto L_0x0022
        L_0x0017:
            int r1 = isInside     // Catch:{ Exception -> 0x00b7 }
            int r1 = r1 + 29
            int r2 = r1 % 128
            toFloatRange = r2     // Catch:{ Exception -> 0x00b7 }
            int r1 = r1 % 2
            r1 = 1
        L_0x0022:
            r2 = 94
            if (r1 == 0) goto L_0x0029
            r5 = 94
            goto L_0x002b
        L_0x0029:
            r5 = 76
        L_0x002b:
            if (r5 == r2) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            byte[] r10 = setMax
            if (r10 == 0) goto L_0x003c
            int r5 = length
            int r5 = r5 + r9
            byte r10 = r10[r5]
            int r5 = getMin
            int r10 = r10 + r5
            byte r10 = (byte) r10
            goto L_0x0047
        L_0x003c:
            short[] r10 = getMax
            int r5 = length
            int r5 = r5 + r9
            short r10 = r10[r5]
            int r5 = getMin
            int r10 = r10 + r5
            short r10 = (short) r10
        L_0x0047:
            if (r10 <= 0) goto L_0x00b2
            int r9 = r9 + r10
            int r9 = r9 + -2
            int r5 = length     // Catch:{ Exception -> 0x00b7 }
            int r9 = r9 + r5
            if (r1 == 0) goto L_0x0052
            r3 = 1
        L_0x0052:
            int r9 = r9 + r3
            int r1 = setMin
            int r7 = r7 + r1
            char r7 = (char) r7
            r0.append(r7)
        L_0x005a:
            if (r4 >= r10) goto L_0x00b2
            int r1 = isInside     // Catch:{ Exception -> 0x00b7 }
            int r1 = r1 + 99
            int r3 = r1 % 128
            toFloatRange = r3     // Catch:{ Exception -> 0x00b7 }
            int r1 = r1 % 2
            r3 = 32
            if (r1 == 0) goto L_0x006d
            r1 = 32
            goto L_0x006f
        L_0x006d:
            r1 = 94
        L_0x006f:
            if (r1 == r3) goto L_0x0076
            byte[] r1 = setMax
            if (r1 == 0) goto L_0x009e
            goto L_0x007c
        L_0x0076:
            byte[] r1 = setMax
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x009e
        L_0x007c:
            int r1 = toFloatRange
            int r1 = r1 + 39
            int r3 = r1 % 128
            isInside = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0093
            byte[] r1 = setMax
            int r3 = r9 + 1
            byte r9 = r1[r9]
            int r9 = r9 / r6
            byte r9 = (byte) r9
            r9 = r9 ^ r8
            int r7 = r7 >>> r9
            goto L_0x00a8
        L_0x0093:
            byte[] r1 = setMax     // Catch:{ Exception -> 0x00b7 }
            int r3 = r9 + -1
            byte r9 = r1[r9]
            int r9 = r9 + r6
            byte r9 = (byte) r9
            r9 = r9 ^ r8
            int r7 = r7 + r9
            goto L_0x00a8
        L_0x009e:
            short[] r1 = getMax
            int r3 = r9 + -1
            short r9 = r1[r9]
            int r9 = r9 + r6
            short r9 = (short) r9
            r9 = r9 ^ r8
            int r7 = r7 + r9
        L_0x00a8:
            char r7 = (char) r7
            r9 = r3
            r0.append(r7)
            int r4 = r4 + 1
            goto L_0x005a
        L_0x00b0:
            r6 = move-exception
            throw r6
        L_0x00b2:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x00b7:
            r6 = move-exception
            goto L_0x00ba
        L_0x00b9:
            throw r6
        L_0x00ba:
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.setMax(short, int, byte, int, int):java.lang.String");
    }
}
