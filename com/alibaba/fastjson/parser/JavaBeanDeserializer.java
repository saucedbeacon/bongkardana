package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.text.Typography;

public class JavaBeanDeserializer implements ObjectDeserializer {
    private final Map<String, FieldDeserializer> alterNameFieldDeserializers;
    public final JavaBeanInfo beanInfo;
    protected final Class<?> clazz;
    private ConcurrentMap<String, Object> extraFieldDeserializers;
    private final FieldDeserializer[] fieldDeserializers;
    private transient long[] smartMatchHashArray;
    private transient int[] smartMatchHashArrayMapping;
    private final FieldDeserializer[] sortedFieldDeserializers;

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type) {
        this(parserConfig, cls, type, JavaBeanInfo.build(cls, cls.getModifiers(), type, false, true, true, true, parserConfig.propertyNamingStrategy));
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type, JavaBeanInfo javaBeanInfo) {
        this.clazz = cls;
        this.beanInfo = javaBeanInfo;
        this.sortedFieldDeserializers = new FieldDeserializer[javaBeanInfo.sortedFields.length];
        int length = javaBeanInfo.sortedFields.length;
        HashMap hashMap = null;
        for (int i = 0; i < length; i++) {
            FieldInfo fieldInfo = javaBeanInfo.sortedFields[i];
            FieldDeserializer createFieldDeserializer = parserConfig.createFieldDeserializer(parserConfig, cls, fieldInfo);
            this.sortedFieldDeserializers[i] = createFieldDeserializer;
            for (String str : fieldInfo.alternateNames) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str, createFieldDeserializer);
            }
        }
        this.alterNameFieldDeserializers = hashMap;
        this.fieldDeserializers = new FieldDeserializer[javaBeanInfo.fields.length];
        int length2 = javaBeanInfo.fields.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.fieldDeserializers[i2] = getFieldDeserializer(javaBeanInfo.fields[i2].name);
        }
    }

    /* access modifiers changed from: protected */
    public Object createInstance(DefaultJSONParser defaultJSONParser, Type type) {
        Object obj;
        if ((type instanceof Class) && this.clazz.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new JSONObject((defaultJSONParser.lexer.features & Feature.OrderedField.mask) != 0));
        } else if (this.beanInfo.defaultConstructor == null && this.beanInfo.factoryMethod == null) {
            return null;
        } else {
            if (this.beanInfo.factoryMethod != null && this.beanInfo.defaultConstructorParameterSize > 0) {
                return null;
            }
            try {
                Constructor<?> constructor = this.beanInfo.defaultConstructor;
                if (this.beanInfo.defaultConstructorParameterSize != 0) {
                    obj = constructor.newInstance(new Object[]{defaultJSONParser.contex.object});
                } else if (constructor != null) {
                    obj = constructor.newInstance(new Object[0]);
                } else {
                    obj = this.beanInfo.factoryMethod.invoke((Object) null, new Object[0]);
                }
                if (!(defaultJSONParser == null || (defaultJSONParser.lexer.features & Feature.InitStringFieldAsEmpty.mask) == 0)) {
                    for (FieldInfo fieldInfo : this.beanInfo.fields) {
                        if (fieldInfo.fieldClass == String.class) {
                            fieldInfo.set(obj, "");
                        }
                    }
                }
                return obj;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("create instance error, class ");
                sb.append(this.clazz.getName());
                throw new JSONException(sb.toString(), e);
            }
        }
    }

    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return deserialze(defaultJSONParser, type, obj, (Object) null);
    }

    private <T> T deserialzeArrayMapping(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        Enum enumR;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        String str;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        DefaultJSONParser defaultJSONParser2 = defaultJSONParser;
        JSONLexer jSONLexer = defaultJSONParser2.lexer;
        T createInstance = createInstance(defaultJSONParser, type);
        int length = this.sortedFieldDeserializers.length;
        int i = 0;
        while (i < length) {
            char c17 = i == length + -1 ? ']' : ',';
            FieldDeserializer fieldDeserializer = this.sortedFieldDeserializers[i];
            FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
            Class<?> cls = fieldInfo.fieldClass;
            try {
                if (cls == Integer.TYPE) {
                    int scanLongValue = (int) jSONLexer.scanLongValue();
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.setInt(createInstance, scanLongValue);
                    } else {
                        fieldDeserializer.setValue((Object) createInstance, (Object) Integer.valueOf(scanLongValue));
                    }
                    if (jSONLexer.ch == ',') {
                        int i2 = jSONLexer.bp + 1;
                        jSONLexer.bp = i2;
                        if (i2 >= jSONLexer.len) {
                            c16 = JSONLexer.EOI;
                        } else {
                            c16 = jSONLexer.text.charAt(i2);
                        }
                        jSONLexer.ch = c16;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i3 = jSONLexer.bp + 1;
                        jSONLexer.bp = i3;
                        if (i3 >= jSONLexer.len) {
                            c15 = JSONLexer.EOI;
                        } else {
                            c15 = jSONLexer.text.charAt(i3);
                        }
                        jSONLexer.ch = c15;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else if (cls == String.class) {
                    if (jSONLexer.ch == '\"') {
                        str = jSONLexer.scanStringValue(Typography.quote);
                    } else if (jSONLexer.ch != 'n' || !jSONLexer.text.startsWith("null", jSONLexer.bp)) {
                        throw new JSONException("not match string. feild : ".concat(String.valueOf(obj)));
                    } else {
                        jSONLexer.bp += 4;
                        int i4 = jSONLexer.bp;
                        if (jSONLexer.bp >= jSONLexer.len) {
                            c14 = JSONLexer.EOI;
                        } else {
                            c14 = jSONLexer.text.charAt(i4);
                        }
                        jSONLexer.ch = c14;
                        str = null;
                    }
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.set(createInstance, str);
                    } else {
                        fieldDeserializer.setValue((Object) createInstance, (Object) str);
                    }
                    if (jSONLexer.ch == ',') {
                        int i5 = jSONLexer.bp + 1;
                        jSONLexer.bp = i5;
                        if (i5 >= jSONLexer.len) {
                            c13 = JSONLexer.EOI;
                        } else {
                            c13 = jSONLexer.text.charAt(i5);
                        }
                        jSONLexer.ch = c13;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i6 = jSONLexer.bp + 1;
                        jSONLexer.bp = i6;
                        if (i6 >= jSONLexer.len) {
                            c12 = JSONLexer.EOI;
                        } else {
                            c12 = jSONLexer.text.charAt(i6);
                        }
                        jSONLexer.ch = c12;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else if (cls == Long.TYPE) {
                    long scanLongValue2 = jSONLexer.scanLongValue();
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.setLong(createInstance, scanLongValue2);
                    } else {
                        fieldDeserializer.setValue((Object) createInstance, (Object) new Long(scanLongValue2));
                    }
                    if (jSONLexer.ch == ',') {
                        int i7 = jSONLexer.bp + 1;
                        jSONLexer.bp = i7;
                        if (i7 >= jSONLexer.len) {
                            c11 = JSONLexer.EOI;
                        } else {
                            c11 = jSONLexer.text.charAt(i7);
                        }
                        jSONLexer.ch = c11;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i8 = jSONLexer.bp + 1;
                        jSONLexer.bp = i8;
                        if (i8 >= jSONLexer.len) {
                            c10 = JSONLexer.EOI;
                        } else {
                            c10 = jSONLexer.text.charAt(i8);
                        }
                        jSONLexer.ch = c10;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else if (cls == Boolean.TYPE) {
                    boolean scanBoolean = jSONLexer.scanBoolean();
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.setBoolean(createInstance, scanBoolean);
                    } else {
                        fieldDeserializer.setValue((Object) createInstance, (Object) Boolean.valueOf(scanBoolean));
                    }
                    if (jSONLexer.ch == ',') {
                        int i9 = jSONLexer.bp + 1;
                        jSONLexer.bp = i9;
                        if (i9 >= jSONLexer.len) {
                            c9 = JSONLexer.EOI;
                        } else {
                            c9 = jSONLexer.text.charAt(i9);
                        }
                        jSONLexer.ch = c9;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i10 = jSONLexer.bp + 1;
                        jSONLexer.bp = i10;
                        if (i10 >= jSONLexer.len) {
                            c8 = JSONLexer.EOI;
                        } else {
                            c8 = jSONLexer.text.charAt(i10);
                        }
                        jSONLexer.ch = c8;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else if (cls.isEnum()) {
                    char c18 = jSONLexer.ch;
                    if (c18 == '\"') {
                        String scanSymbol = jSONLexer.scanSymbol(defaultJSONParser2.symbolTable);
                        if (scanSymbol == null) {
                            enumR = null;
                        } else {
                            enumR = Enum.valueOf(cls, scanSymbol);
                        }
                    } else if (c18 < '0' || c18 > '9') {
                        StringBuilder sb = new StringBuilder("illegal enum.");
                        sb.append(jSONLexer.info());
                        throw new JSONException(sb.toString());
                    } else {
                        enumR = ((EnumDeserializer) ((DefaultFieldDeserializer) fieldDeserializer).getFieldValueDeserilizer(defaultJSONParser2.config)).ordinalEnums[(int) jSONLexer.scanLongValue()];
                    }
                    fieldDeserializer.setValue((Object) createInstance, (Object) enumR);
                    if (jSONLexer.ch == ',') {
                        int i11 = jSONLexer.bp + 1;
                        jSONLexer.bp = i11;
                        if (i11 >= jSONLexer.len) {
                            c7 = JSONLexer.EOI;
                        } else {
                            c7 = jSONLexer.text.charAt(i11);
                        }
                        jSONLexer.ch = c7;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i12 = jSONLexer.bp + 1;
                        jSONLexer.bp = i12;
                        if (i12 >= jSONLexer.len) {
                            c6 = JSONLexer.EOI;
                        } else {
                            c6 = jSONLexer.text.charAt(i12);
                        }
                        jSONLexer.ch = c6;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else if (cls == Date.class && jSONLexer.ch == '1') {
                    fieldDeserializer.setValue((Object) createInstance, (Object) new Date(jSONLexer.scanLongValue()));
                    if (jSONLexer.ch == ',') {
                        int i13 = jSONLexer.bp + 1;
                        jSONLexer.bp = i13;
                        if (i13 >= jSONLexer.len) {
                            c5 = JSONLexer.EOI;
                        } else {
                            c5 = jSONLexer.text.charAt(i13);
                        }
                        jSONLexer.ch = c5;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i14 = jSONLexer.bp + 1;
                        jSONLexer.bp = i14;
                        if (i14 >= jSONLexer.len) {
                            c4 = JSONLexer.EOI;
                        } else {
                            c4 = jSONLexer.text.charAt(i14);
                        }
                        jSONLexer.ch = c4;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else {
                    if (jSONLexer.ch == '[') {
                        int i15 = jSONLexer.bp + 1;
                        jSONLexer.bp = i15;
                        if (i15 >= jSONLexer.len) {
                            c3 = JSONLexer.EOI;
                        } else {
                            c3 = jSONLexer.text.charAt(i15);
                        }
                        jSONLexer.ch = c3;
                        jSONLexer.token = 14;
                    } else if (jSONLexer.ch == '{') {
                        int i16 = jSONLexer.bp + 1;
                        jSONLexer.bp = i16;
                        if (i16 >= jSONLexer.len) {
                            c2 = JSONLexer.EOI;
                        } else {
                            c2 = jSONLexer.text.charAt(i16);
                        }
                        jSONLexer.ch = c2;
                        jSONLexer.token = 12;
                    } else {
                        jSONLexer.nextToken();
                    }
                    fieldDeserializer.parseField(defaultJSONParser2, createInstance, fieldInfo.fieldType, (Map<String, Object>) null);
                    if (c17 == ']') {
                        if (jSONLexer.token != 15) {
                            throw new JSONException("syntax error");
                        }
                    } else if (c17 != ',') {
                        continue;
                    } else if (jSONLexer.token != 16) {
                        throw new JSONException("syntax error");
                    }
                }
                i++;
            } catch (IllegalAccessException e) {
                StringBuilder sb2 = new StringBuilder("set ");
                sb2.append(fieldInfo.name);
                sb2.append("error");
                throw new JSONException(sb2.toString(), e);
            }
        }
        if (jSONLexer.ch == ',') {
            int i17 = jSONLexer.bp + 1;
            jSONLexer.bp = i17;
            if (i17 >= jSONLexer.len) {
                c = JSONLexer.EOI;
            } else {
                c = jSONLexer.text.charAt(i17);
            }
            jSONLexer.ch = c;
            jSONLexer.token = 16;
        } else {
            jSONLexer.nextToken();
        }
        return createInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:237:0x02d1, code lost:
        if (r11 != 16) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        r10.nextTokenWithChar(':');
        r0 = r10.token;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x02ea, code lost:
        if (r0 != 4) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x02ec, code lost:
        r0 = r10.stringVal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x02f6, code lost:
        if (com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool.PREFIX_ID.equals(r0) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r0 = r14.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x02fa, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0304, code lost:
        if ("..".equals(r0) == false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        r2 = r14.parent;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x030a, code lost:
        if (r2.object == null) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x030c, code lost:
        r0 = r2.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x030f, code lost:
        r8.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r2, r0));
        r8.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0321, code lost:
        if ("$".equals(r0) == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0323, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0326, code lost:
        if (r2.parent == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0328, code lost:
        r2 = r2.parent;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x032d, code lost:
        if (r2.object == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x032f, code lost:
        r0 = r2.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0332, code lost:
        r8.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r2, r0));
        r8.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:?, code lost:
        r8.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r14, r0));
        r8.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x034a, code lost:
        r10.nextToken(13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x034f, code lost:
        if (r10.token != 13) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0351, code lost:
        r10.nextToken(16);
        r8.setContext(r14, r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0359, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x035b, code lost:
        if (r2 == null) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x035d, code lost:
        r2.object = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x035f, code lost:
        r8.setContext(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0362, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0363, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x036c, code lost:
        throw new com.alibaba.fastjson.JSONException("illegal ref");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x036d, code lost:
        r2 = r20;
        r4 = new java.lang.StringBuilder("illegal ref, ");
        r4.append(com.alibaba.fastjson.parser.JSONToken.name(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0386, code lost:
        throw new com.alibaba.fastjson.JSONException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0387, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0397, code lost:
        if (r3.equals(r2) == false) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x03ca, code lost:
        r11 = r1;
        r15 = r21;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x03e6, code lost:
        if (r5 != null) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x03e8, code lost:
        r5 = r8.config.checkAutoType(r2, r7.clazz, r10.features);
        r0 = com.alibaba.fastjson.util.TypeUtils.getClass(r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x03f6, code lost:
        if (r0 == null) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x03f8, code lost:
        if (r5 == null) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x03fe, code lost:
        if (r0.isAssignableFrom(r5) == false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0409, code lost:
        throw new com.alibaba.fastjson.JSONException("type not match");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x040a, code lost:
        r34 = r5;
        r5 = r8.config.getDeserializer(r5);
        r0 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0416, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0419, code lost:
        if ((r5 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x041b, code lost:
        r5 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r5;
        r0 = r5.deserialze(r8, r0, r9, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0422, code lost:
        if (r3 == null) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0424, code lost:
        r5.getFieldDeserializer(r3).setValue((java.lang.Object) r0, (java.lang.Object) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x042c, code lost:
        r0 = r5.deserialze(r8, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0430, code lost:
        if (r4 == null) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0432, code lost:
        r4.object = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0434, code lost:
        r8.setContext(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0437, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0652, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:?, code lost:
        r2 = new java.lang.StringBuilder("create instance error, ");
        r2.append(r7.beanInfo.creatorConstructor.toGenericString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x066e, code lost:
        throw new com.alibaba.fastjson.JSONException(r2.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x067f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:?, code lost:
        r2 = new java.lang.StringBuilder("create factory method error, ");
        r2.append(r7.beanInfo.factoryMethod.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x069b, code lost:
        throw new com.alibaba.fastjson.JSONException(r2.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x069c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x069d, code lost:
        r12 = r4;
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x06ce, code lost:
        throw new com.alibaba.fastjson.JSONException(r1.toString());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:465:0x05d4, B:490:0x061e, B:507:0x0675] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0449 A[Catch:{ all -> 0x0443, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0454 A[ADDED_TO_REGION, Catch:{ all -> 0x0443, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f A[Catch:{ all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x05c5 A[Catch:{ all -> 0x06ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x06cf A[Catch:{ all -> 0x06ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x06fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r36, java.lang.reflect.Type r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            r35 = this;
            r7 = r35
            r8 = r36
            r0 = r37
            r9 = r38
            java.lang.Class<com.alibaba.fastjson.JSON> r1 = com.alibaba.fastjson.JSON.class
            if (r0 == r1) goto L_0x0700
            java.lang.Class<com.alibaba.fastjson.JSONObject> r1 = com.alibaba.fastjson.JSONObject.class
            if (r0 != r1) goto L_0x0012
            goto L_0x0700
        L_0x0012:
            com.alibaba.fastjson.parser.JSONLexer r10 = r8.lexer
            int r1 = r10.token
            r2 = 8
            r11 = 16
            r12 = 0
            if (r1 != r2) goto L_0x0021
            r10.nextToken(r11)
            return r12
        L_0x0021:
            boolean r13 = r10.disableCircularReferenceDetect
            com.alibaba.fastjson.parser.ParseContext r2 = r8.contex
            if (r39 == 0) goto L_0x002b
            if (r2 == 0) goto L_0x002b
            com.alibaba.fastjson.parser.ParseContext r2 = r2.parent
        L_0x002b:
            r14 = r2
            r15 = 13
            if (r1 != r15) goto L_0x0045
            r10.nextToken(r11)     // Catch:{ all -> 0x0040 }
            if (r39 != 0) goto L_0x003a
            java.lang.Object r0 = r35.createInstance((com.alibaba.fastjson.parser.DefaultJSONParser) r36, (java.lang.reflect.Type) r37)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x003a:
            r0 = r39
        L_0x003c:
            r8.setContext(r14)
            return r0
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            r1 = r39
            goto L_0x06f8
        L_0x0045:
            r2 = 14
            r6 = 0
            if (r1 != r2) goto L_0x0067
            com.alibaba.fastjson.parser.JavaBeanInfo r2 = r7.beanInfo     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.supportBeanToArray     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x005c
            int r2 = r10.features     // Catch:{ all -> 0x0040 }
            com.alibaba.fastjson.parser.Feature r3 = com.alibaba.fastjson.parser.Feature.SupportArrayToBean     // Catch:{ all -> 0x0040 }
            int r3 = r3.mask     // Catch:{ all -> 0x0040 }
            r2 = r2 & r3
            if (r2 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r2 = 0
            goto L_0x005d
        L_0x005c:
            r2 = 1
        L_0x005d:
            if (r2 == 0) goto L_0x0067
            java.lang.Object r0 = r35.deserialzeArrayMapping(r36, r37, r38, r39)     // Catch:{ all -> 0x0040 }
            r8.setContext(r14)
            return r0
        L_0x0067:
            r2 = 12
            r4 = 4
            if (r1 == r2) goto L_0x00b0
            if (r1 == r11) goto L_0x00b0
            boolean r0 = r10.isBlankInput()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0078
            r8.setContext(r14)
            return r12
        L_0x0078:
            if (r1 != r4) goto L_0x008b
            java.lang.String r0 = r10.stringVal()     // Catch:{ all -> 0x0040 }
            int r0 = r0.length()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x008b
            r10.nextToken()     // Catch:{ all -> 0x0040 }
            r8.setContext(r14)
            return r12
        L_0x008b:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "syntax error, expect {, actual "
            r0.<init>(r1)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = r10.info()     // Catch:{ all -> 0x0040 }
            r0.append(r1)     // Catch:{ all -> 0x0040 }
            boolean r1 = r9 instanceof java.lang.String     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x00a6
            java.lang.String r1 = ", fieldName "
            r0.append(r1)     // Catch:{ all -> 0x0040 }
            r0.append(r9)     // Catch:{ all -> 0x0040 }
        L_0x00a6:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0040 }
            r1.<init>(r0)     // Catch:{ all -> 0x0040 }
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x00b0:
            int r1 = r8.resolveStatus     // Catch:{ all -> 0x06f4 }
            r2 = 2
            if (r1 != r2) goto L_0x00b7
            r8.resolveStatus = r6     // Catch:{ all -> 0x0040 }
        L_0x00b7:
            com.alibaba.fastjson.parser.JavaBeanInfo r1 = r7.beanInfo     // Catch:{ all -> 0x06f4 }
            java.lang.String r3 = r1.typeKey     // Catch:{ all -> 0x06f4 }
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r1 = r7.sortedFieldDeserializers     // Catch:{ all -> 0x06f4 }
            int r2 = r1.length     // Catch:{ all -> 0x06f4 }
            r16 = 0
            r1 = r39
            r20 = r12
            r21 = r20
            r18 = r13
            r12 = r16
        L_0x00ca:
            int r22 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r22 == 0) goto L_0x00e8
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r12 = r7.getFieldDeserializerByHash(r12)     // Catch:{ all -> 0x00e3 }
            if (r12 == 0) goto L_0x00d9
            com.alibaba.fastjson.util.FieldInfo r13 = r12.fieldInfo     // Catch:{ all -> 0x00e3 }
            java.lang.Class<?> r5 = r13.fieldClass     // Catch:{ all -> 0x00e3 }
            goto L_0x00db
        L_0x00d9:
            r5 = 0
            r13 = 0
        L_0x00db:
            r24 = r5
            r5 = r12
            r23 = r13
            r12 = r16
            goto L_0x00ed
        L_0x00e3:
            r0 = move-exception
            r12 = r20
            goto L_0x06f8
        L_0x00e8:
            r5 = 0
            r23 = 0
            r24 = 0
        L_0x00ed:
            if (r5 != 0) goto L_0x00ff
            if (r6 >= r2) goto L_0x00fd
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r5 = r7.sortedFieldDeserializers     // Catch:{ all -> 0x00e3 }
            r5 = r5[r6]     // Catch:{ all -> 0x00e3 }
            com.alibaba.fastjson.util.FieldInfo r4 = r5.fieldInfo     // Catch:{ all -> 0x00e3 }
            java.lang.Class<?> r11 = r4.fieldClass     // Catch:{ all -> 0x00e3 }
            r23 = r4
            r24 = r11
        L_0x00fd:
            int r6 = r6 + 1
        L_0x00ff:
            r11 = r6
            r4 = r23
            r6 = r24
            r23 = 0
            r25 = 0
            if (r5 == 0) goto L_0x02a2
            r39 = r11
            r27 = r12
            long r11 = r4.nameHashCode     // Catch:{ all -> 0x00e3 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e3 }
            r15 = -2
            if (r6 == r13) goto L_0x0282
            java.lang.Class<java.lang.Integer> r13 = java.lang.Integer.class
            if (r6 != r13) goto L_0x011b
            goto L_0x0282
        L_0x011b:
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e3 }
            if (r6 == r13) goto L_0x0261
            java.lang.Class<java.lang.Long> r13 = java.lang.Long.class
            if (r6 != r13) goto L_0x0125
            goto L_0x0261
        L_0x0125:
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r6 != r13) goto L_0x0142
            java.lang.String r11 = r10.scanFieldString(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x0136
        L_0x0131:
            r29 = r25
        L_0x0133:
            r12 = 0
            goto L_0x028e
        L_0x0136:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x013e:
            r29 = r25
            goto L_0x02a9
        L_0x0142:
            java.lang.Class<java.util.Date> r13 = java.util.Date.class
            if (r6 != r13) goto L_0x0157
            java.util.Date r11 = r10.scanFieldDate(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x014f
            goto L_0x0131
        L_0x014f:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x0157:
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00e3 }
            if (r6 == r13) goto L_0x024c
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            if (r6 != r13) goto L_0x0161
            goto L_0x024c
        L_0x0161:
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ all -> 0x00e3 }
            if (r6 == r13) goto L_0x022e
            java.lang.Class<java.lang.Float> r13 = java.lang.Float.class
            if (r6 != r13) goto L_0x016b
            goto L_0x022e
        L_0x016b:
            java.lang.Class r13 = java.lang.Double.TYPE     // Catch:{ all -> 0x00e3 }
            if (r6 == r13) goto L_0x0219
            java.lang.Class<java.lang.Double> r13 = java.lang.Double.class
            if (r6 != r13) goto L_0x0175
            goto L_0x0219
        L_0x0175:
            boolean r13 = r4.isEnum     // Catch:{ all -> 0x00e3 }
            if (r13 == 0) goto L_0x0198
            com.alibaba.fastjson.parser.ParserConfig r13 = r8.config     // Catch:{ all -> 0x00e3 }
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r13 = r13.getDeserializer(r6)     // Catch:{ all -> 0x00e3 }
            boolean r13 = r13 instanceof com.alibaba.fastjson.parser.EnumDeserializer     // Catch:{ all -> 0x00e3 }
            if (r13 == 0) goto L_0x0198
            long r11 = r10.scanFieldSymbol(r11)     // Catch:{ all -> 0x00e3 }
            int r13 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r13 <= 0) goto L_0x0190
            java.lang.Enum r11 = r5.getEnumByHashCode(r11)     // Catch:{ all -> 0x00e3 }
            goto L_0x0131
        L_0x0190:
            int r11 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r11 != r15) goto L_0x02a6
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x0198:
            java.lang.Class<int[]> r13 = int[].class
            if (r6 != r13) goto L_0x01ad
            int[] r11 = r10.scanFieldIntArray(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x01a5
            goto L_0x0131
        L_0x01a5:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x01ad:
            java.lang.Class<float[]> r13 = float[].class
            if (r6 != r13) goto L_0x01c3
            float[] r11 = r10.scanFieldFloatArray(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x01bb
            goto L_0x0131
        L_0x01bb:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x01c3:
            java.lang.Class<double[]> r13 = double[].class
            if (r6 != r13) goto L_0x01d9
            double[] r11 = r10.scanFieldDoubleArray(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x01d1
            goto L_0x0131
        L_0x01d1:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x01d9:
            java.lang.Class<float[][]> r13 = float[][].class
            if (r6 != r13) goto L_0x01ef
            float[][] r11 = r10.scanFieldFloatArray2(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x01e7
            goto L_0x0131
        L_0x01e7:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x01ef:
            java.lang.Class<double[][]> r13 = double[][].class
            if (r6 != r13) goto L_0x0205
            double[][] r11 = r10.scanFieldDoubleArray2(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x01fd
            goto L_0x0131
        L_0x01fd:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x0205:
            long r11 = r4.nameHashCode     // Catch:{ all -> 0x00e3 }
            boolean r11 = r10.matchField(r11)     // Catch:{ all -> 0x00e3 }
            if (r11 == 0) goto L_0x0215
            r29 = r25
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 1
            goto L_0x02ac
        L_0x0215:
            r31 = r2
            goto L_0x02d4
        L_0x0219:
            double r25 = r10.scanFieldDouble(r11)     // Catch:{ all -> 0x00e3 }
            int r11 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r11 <= 0) goto L_0x0226
            r29 = r25
            r11 = 0
            goto L_0x0133
        L_0x0226:
            int r11 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r11 != r15) goto L_0x02a6
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x022e:
            float r23 = r10.scanFieldFloat(r11)     // Catch:{ all -> 0x00e3 }
            int r11 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r11 <= 0) goto L_0x023d
            r13 = r23
            r29 = r25
            r11 = 0
            r12 = 0
            goto L_0x028f
        L_0x023d:
            int r11 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r11 != r15) goto L_0x0244
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x0244:
            r13 = r23
            r29 = r25
            r11 = 0
            r12 = 0
            goto L_0x02ab
        L_0x024c:
            boolean r11 = r10.scanFieldBoolean(r11)     // Catch:{ all -> 0x00e3 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x025a
            goto L_0x0131
        L_0x025a:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x013e
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x0261:
            long r11 = r10.scanFieldLong(r11)     // Catch:{ all -> 0x00e3 }
            int r13 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r13 <= 0) goto L_0x0274
            r29 = r25
            r13 = 0
            r15 = 1
            r23 = 1
        L_0x026f:
            r25 = r11
            r11 = 0
            r12 = 0
            goto L_0x02b0
        L_0x0274:
            int r13 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r13 != r15) goto L_0x027b
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
            goto L_0x0299
        L_0x027b:
            r29 = r25
            r13 = 0
            r15 = 0
            r23 = 0
            goto L_0x026f
        L_0x0282:
            int r11 = r10.scanFieldInt(r11)     // Catch:{ all -> 0x00e3 }
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 <= 0) goto L_0x0293
            r12 = r11
            r29 = r25
            r11 = 0
        L_0x028e:
            r13 = 0
        L_0x028f:
            r15 = 1
            r23 = 1
            goto L_0x02ae
        L_0x0293:
            int r12 = r10.matchStat     // Catch:{ all -> 0x00e3 }
            if (r12 != r15) goto L_0x029d
            long r12 = r10.fieldHash     // Catch:{ all -> 0x00e3 }
        L_0x0299:
            r6 = r39
            goto L_0x03d9
        L_0x029d:
            r12 = r11
            r29 = r25
            r11 = 0
            goto L_0x02aa
        L_0x02a2:
            r39 = r11
            r27 = r12
        L_0x02a6:
            r29 = r25
            r11 = 0
        L_0x02a9:
            r12 = 0
        L_0x02aa:
            r13 = 0
        L_0x02ab:
            r15 = 0
        L_0x02ac:
            r23 = 0
        L_0x02ae:
            r25 = r16
        L_0x02b0:
            if (r15 != 0) goto L_0x0449
            r31 = r2
            com.alibaba.fastjson.parser.SymbolTable r2 = r8.symbolTable     // Catch:{ all -> 0x0443 }
            java.lang.String r2 = r10.scanSymbol(r2)     // Catch:{ all -> 0x0443 }
            if (r2 != 0) goto L_0x02d8
            r32 = r11
            int r11 = r10.token     // Catch:{ all -> 0x00e3 }
            r33 = r4
            r4 = 13
            if (r11 != r4) goto L_0x02cf
            r4 = 16
            r10.nextToken(r4)     // Catch:{ all -> 0x00e3 }
            r4 = r20
            goto L_0x03ca
        L_0x02cf:
            r4 = 16
            if (r11 == r4) goto L_0x02d4
            goto L_0x02dc
        L_0x02d4:
            r4 = r20
            goto L_0x03d1
        L_0x02d8:
            r33 = r4
            r32 = r11
        L_0x02dc:
            java.lang.String r4 = "$ref"
            r11 = 58
            if (r4 != r2) goto L_0x038f
            if (r14 == 0) goto L_0x038f
            r10.nextTokenWithChar(r11)     // Catch:{ all -> 0x0389 }
            int r0 = r10.token     // Catch:{ all -> 0x0389 }
            r2 = 4
            if (r0 != r2) goto L_0x036d
            java.lang.String r0 = r10.stringVal()     // Catch:{ all -> 0x0389 }
            java.lang.String r2 = "@"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0389 }
            if (r2 == 0) goto L_0x02fe
            java.lang.Object r0 = r14.object     // Catch:{ all -> 0x00e3 }
        L_0x02fa:
            r1 = r0
        L_0x02fb:
            r0 = 13
            goto L_0x034a
        L_0x02fe:
            java.lang.String r2 = ".."
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0389 }
            if (r2 == 0) goto L_0x031b
            com.alibaba.fastjson.parser.ParseContext r2 = r14.parent     // Catch:{ all -> 0x00e3 }
            java.lang.Object r3 = r2.object     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x030f
            java.lang.Object r0 = r2.object     // Catch:{ all -> 0x00e3 }
            goto L_0x02fa
        L_0x030f:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r3 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch:{ all -> 0x00e3 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x00e3 }
            r8.addResolveTask(r3)     // Catch:{ all -> 0x00e3 }
            r0 = 1
            r8.resolveStatus = r0     // Catch:{ all -> 0x00e3 }
            goto L_0x02fb
        L_0x031b:
            java.lang.String r2 = "$"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0389 }
            if (r2 == 0) goto L_0x033e
            r2 = r14
        L_0x0324:
            com.alibaba.fastjson.parser.ParseContext r3 = r2.parent     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x032b
            com.alibaba.fastjson.parser.ParseContext r2 = r2.parent     // Catch:{ all -> 0x00e3 }
            goto L_0x0324
        L_0x032b:
            java.lang.Object r3 = r2.object     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x0332
            java.lang.Object r0 = r2.object     // Catch:{ all -> 0x00e3 }
            goto L_0x02fa
        L_0x0332:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r3 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch:{ all -> 0x00e3 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x00e3 }
            r8.addResolveTask(r3)     // Catch:{ all -> 0x00e3 }
            r0 = 1
            r8.resolveStatus = r0     // Catch:{ all -> 0x00e3 }
            goto L_0x02fb
        L_0x033e:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r2 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch:{ all -> 0x0389 }
            r2.<init>(r14, r0)     // Catch:{ all -> 0x0389 }
            r8.addResolveTask(r2)     // Catch:{ all -> 0x0389 }
            r4 = 1
            r8.resolveStatus = r4     // Catch:{ all -> 0x0389 }
            goto L_0x02fb
        L_0x034a:
            r10.nextToken(r0)     // Catch:{ all -> 0x0389 }
            int r2 = r10.token     // Catch:{ all -> 0x0389 }
            if (r2 != r0) goto L_0x0363
            r0 = 16
            r10.nextToken(r0)     // Catch:{ all -> 0x0389 }
            r8.setContext(r14, r1, r9)     // Catch:{ all -> 0x0389 }
            r2 = r20
            if (r2 == 0) goto L_0x035f
            r2.object = r1
        L_0x035f:
            r8.setContext(r14)
            return r1
        L_0x0363:
            r2 = r20
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0387 }
            java.lang.String r3 = "illegal ref"
            r0.<init>(r3)     // Catch:{ all -> 0x0387 }
            throw r0     // Catch:{ all -> 0x0387 }
        L_0x036d:
            r2 = r20
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0387 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0387 }
            java.lang.String r5 = "illegal ref, "
            r4.<init>(r5)     // Catch:{ all -> 0x0387 }
            java.lang.String r0 = com.alibaba.fastjson.parser.JSONToken.name(r0)     // Catch:{ all -> 0x0387 }
            r4.append(r0)     // Catch:{ all -> 0x0387 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0387 }
            r3.<init>(r0)     // Catch:{ all -> 0x0387 }
            throw r3     // Catch:{ all -> 0x0387 }
        L_0x0387:
            r0 = move-exception
            goto L_0x038c
        L_0x0389:
            r0 = move-exception
            r2 = r20
        L_0x038c:
            r12 = r2
            goto L_0x06f8
        L_0x038f:
            r4 = r20
            if (r3 == 0) goto L_0x0399
            boolean r20 = r3.equals(r2)     // Catch:{ all -> 0x0477 }
            if (r20 != 0) goto L_0x039d
        L_0x0399:
            java.lang.String r11 = "@type"
            if (r11 != r2) goto L_0x0441
        L_0x039d:
            r2 = 58
            r10.nextTokenWithChar(r2)     // Catch:{ all -> 0x0477 }
            int r2 = r10.token     // Catch:{ all -> 0x0477 }
            r5 = 4
            if (r2 != r5) goto L_0x0438
            java.lang.String r2 = r10.stringVal()     // Catch:{ all -> 0x0477 }
            r5 = 16
            r10.nextToken(r5)     // Catch:{ all -> 0x0477 }
            boolean r5 = r0 instanceof java.lang.Class     // Catch:{ all -> 0x0477 }
            if (r5 == 0) goto L_0x03de
            r5 = r0
            java.lang.Class r5 = (java.lang.Class) r5     // Catch:{ all -> 0x0477 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0477 }
            boolean r5 = r2.equals(r5)     // Catch:{ all -> 0x0477 }
            if (r5 == 0) goto L_0x03de
            int r2 = r10.token     // Catch:{ all -> 0x0477 }
            r5 = 13
            if (r2 != r5) goto L_0x03d1
            r10.nextToken()     // Catch:{ all -> 0x0477 }
        L_0x03ca:
            r11 = r1
            r15 = r21
            r19 = 0
            goto L_0x05d0
        L_0x03d1:
            r6 = r39
            r20 = r4
            r12 = r27
            r2 = r31
        L_0x03d9:
            r4 = 4
            r11 = 16
            goto L_0x06e2
        L_0x03de:
            com.alibaba.fastjson.parser.ParserConfig r5 = r8.config     // Catch:{ all -> 0x0477 }
            com.alibaba.fastjson.parser.JavaBeanInfo r6 = r7.beanInfo     // Catch:{ all -> 0x0477 }
            com.alibaba.fastjson.parser.JavaBeanDeserializer r5 = r7.getSeeAlso(r5, r6, r2)     // Catch:{ all -> 0x0477 }
            if (r5 != 0) goto L_0x0416
            com.alibaba.fastjson.parser.ParserConfig r5 = r8.config     // Catch:{ all -> 0x0477 }
            java.lang.Class<?> r6 = r7.clazz     // Catch:{ all -> 0x0477 }
            int r10 = r10.features     // Catch:{ all -> 0x0477 }
            java.lang.Class r5 = r5.checkAutoType(r2, r6, r10)     // Catch:{ all -> 0x0477 }
            java.lang.Class r0 = com.alibaba.fastjson.util.TypeUtils.getClass(r37)     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x040a
            if (r5 == 0) goto L_0x0401
            boolean r0 = r0.isAssignableFrom(r5)     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0401
            goto L_0x040a
        L_0x0401:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0477 }
            java.lang.String r2 = "type not match"
            r0.<init>(r2)     // Catch:{ all -> 0x0477 }
            throw r0     // Catch:{ all -> 0x0477 }
        L_0x040a:
            com.alibaba.fastjson.parser.ParserConfig r0 = r8.config     // Catch:{ all -> 0x0477 }
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r5)     // Catch:{ all -> 0x0477 }
            r34 = r5
            r5 = r0
            r0 = r34
            goto L_0x0417
        L_0x0416:
            r0 = 0
        L_0x0417:
            boolean r6 = r5 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x042c
            com.alibaba.fastjson.parser.JavaBeanDeserializer r5 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r5     // Catch:{ all -> 0x0477 }
            r6 = 0
            java.lang.Object r0 = r5.deserialze(r8, r0, r9, r6)     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x0430
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r3 = r5.getFieldDeserializer(r3)     // Catch:{ all -> 0x0477 }
            r3.setValue((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x0477 }
            goto L_0x0430
        L_0x042c:
            java.lang.Object r0 = r5.deserialze(r8, r0, r9)     // Catch:{ all -> 0x0477 }
        L_0x0430:
            if (r4 == 0) goto L_0x0434
            r4.object = r1
        L_0x0434:
            r8.setContext(r14)
            return r0
        L_0x0438:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0477 }
            java.lang.String r2 = "syntax error"
            r0.<init>(r2)     // Catch:{ all -> 0x0477 }
            throw r0     // Catch:{ all -> 0x0477 }
        L_0x0441:
            r11 = r2
            goto L_0x0452
        L_0x0443:
            r0 = move-exception
            r4 = r20
        L_0x0446:
            r12 = r4
            goto L_0x06f8
        L_0x0449:
            r31 = r2
            r33 = r4
            r32 = r11
            r4 = r20
            r11 = 0
        L_0x0452:
            if (r1 != 0) goto L_0x0479
            if (r21 != 0) goto L_0x0479
            java.lang.Object r1 = r35.createInstance((com.alibaba.fastjson.parser.DefaultJSONParser) r36, (java.lang.reflect.Type) r37)     // Catch:{ all -> 0x0477 }
            if (r1 != 0) goto L_0x0469
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0477 }
            r20 = r3
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r3 = r7.fieldDeserializers     // Catch:{ all -> 0x0477 }
            int r3 = r3.length     // Catch:{ all -> 0x0477 }
            r2.<init>(r3)     // Catch:{ all -> 0x0477 }
            r21 = r2
            goto L_0x046b
        L_0x0469:
            r20 = r3
        L_0x046b:
            if (r18 != 0) goto L_0x047b
            com.alibaba.fastjson.parser.ParseContext r2 = r8.setContext(r14, r1, r9)     // Catch:{ all -> 0x0477 }
            r4 = r1
            r3 = r21
            r21 = r2
            goto L_0x0480
        L_0x0477:
            r0 = move-exception
            goto L_0x0446
        L_0x0479:
            r20 = r3
        L_0x047b:
            r3 = r21
            r21 = r4
            r4 = r1
        L_0x0480:
            if (r15 == 0) goto L_0x058c
            if (r23 != 0) goto L_0x0498
            r5.parseField(r8, r4, r0, r3)     // Catch:{ all -> 0x0494 }
        L_0x0487:
            r15 = r3
            r11 = r4
            r13 = r20
            r12 = r31
            r0 = 1
            r19 = 0
            r20 = 4
            goto L_0x05bf
        L_0x0494:
            r0 = move-exception
            r1 = r4
            goto L_0x06f1
        L_0x0498:
            if (r4 != 0) goto L_0x04dd
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0494 }
            if (r6 == r1) goto L_0x04d0
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r6 != r1) goto L_0x04a3
            goto L_0x04d0
        L_0x04a3:
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0494 }
            if (r6 == r1) goto L_0x04cb
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r6 != r1) goto L_0x04ac
            goto L_0x04cb
        L_0x04ac:
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch:{ all -> 0x0494 }
            if (r6 == r1) goto L_0x04c6
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r6 != r1) goto L_0x04b5
            goto L_0x04c6
        L_0x04b5:
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch:{ all -> 0x0494 }
            if (r6 == r1) goto L_0x04c1
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r6 != r1) goto L_0x04be
            goto L_0x04c1
        L_0x04be:
            r11 = r32
            goto L_0x04d4
        L_0x04c1:
            java.lang.Double r11 = java.lang.Double.valueOf(r29)     // Catch:{ all -> 0x0494 }
            goto L_0x04d4
        L_0x04c6:
            java.lang.Float r11 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x0494 }
            goto L_0x04d4
        L_0x04cb:
            java.lang.Long r11 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0494 }
            goto L_0x04d4
        L_0x04d0:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0494 }
        L_0x04d4:
            r1 = r33
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x0494 }
            r3.put(r1, r11)     // Catch:{ all -> 0x0494 }
            goto L_0x0582
        L_0x04dd:
            r1 = r33
            if (r32 != 0) goto L_0x057d
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 == r2) goto L_0x0552
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r6 != r2) goto L_0x04eb
            goto L_0x0552
        L_0x04eb:
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 == r2) goto L_0x053a
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r6 != r2) goto L_0x04f4
            goto L_0x053a
        L_0x04f4:
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 == r2) goto L_0x0526
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r6 != r2) goto L_0x04fd
            goto L_0x0526
        L_0x04fd:
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 == r2) goto L_0x050d
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            if (r6 != r2) goto L_0x0506
            goto L_0x050d
        L_0x0506:
            r11 = r32
            r5.setValue((java.lang.Object) r4, (java.lang.Object) r11)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x050d:
            boolean r2 = r1.fieldAccess     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r2 == 0) goto L_0x051c
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 != r2) goto L_0x051c
            r11 = r29
            r5.setValue((java.lang.Object) r4, (double) r11)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x051c:
            r11 = r29
            java.lang.Double r2 = java.lang.Double.valueOf(r11)     // Catch:{ IllegalAccessException -> 0x0566 }
            r5.setValue((java.lang.Object) r4, (java.lang.Object) r2)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x0526:
            boolean r2 = r1.fieldAccess     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r2 == 0) goto L_0x0532
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 != r2) goto L_0x0532
            r5.setValue((java.lang.Object) r4, (float) r13)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x0532:
            java.lang.Float r2 = java.lang.Float.valueOf(r13)     // Catch:{ IllegalAccessException -> 0x0566 }
            r5.setValue((java.lang.Object) r4, (java.lang.Object) r2)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x053a:
            boolean r2 = r1.fieldAccess     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r2 == 0) goto L_0x0548
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 != r2) goto L_0x0548
            r11 = r25
            r5.setValue((java.lang.Object) r4, (long) r11)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x0548:
            r11 = r25
            java.lang.Long r2 = java.lang.Long.valueOf(r11)     // Catch:{ IllegalAccessException -> 0x0566 }
            r5.setValue((java.lang.Object) r4, (java.lang.Object) r2)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x0552:
            boolean r2 = r1.fieldAccess     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r2 == 0) goto L_0x055e
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x0566 }
            if (r6 != r2) goto L_0x055e
            r5.setValue((java.lang.Object) r4, (int) r12)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x055e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ IllegalAccessException -> 0x0566 }
            r5.setValue((java.lang.Object) r4, (java.lang.Object) r2)     // Catch:{ IllegalAccessException -> 0x0566 }
            goto L_0x0582
        L_0x0566:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0494 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0494 }
            java.lang.String r5 = "set property error, "
            r3.<init>(r5)     // Catch:{ all -> 0x0494 }
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x0494 }
            r3.append(r1)     // Catch:{ all -> 0x0494 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0494 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0494 }
            throw r2     // Catch:{ all -> 0x0494 }
        L_0x057d:
            r11 = r32
            r5.setValue((java.lang.Object) r4, (java.lang.Object) r11)     // Catch:{ all -> 0x0494 }
        L_0x0582:
            int r1 = r10.matchStat     // Catch:{ all -> 0x0494 }
            r5 = 4
            if (r1 != r5) goto L_0x0487
            r15 = r3
            r11 = r4
            r19 = 0
            goto L_0x05ce
        L_0x058c:
            r5 = 4
            r1 = r35
            r12 = r31
            r2 = r36
            r15 = r3
            r13 = r20
            r3 = r11
            r11 = r4
            r5 = 1
            r20 = 4
            r6 = 1
            r5 = r37
            r0 = 1
            r19 = 0
            r6 = r15
            boolean r1 = r1.parseField(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x06ef }
            if (r1 != 0) goto L_0x05b9
            int r1 = r10.token     // Catch:{ all -> 0x06ef }
            r2 = 13
            if (r1 != r2) goto L_0x05b2
            r10.nextToken()     // Catch:{ all -> 0x06ef }
            goto L_0x05ce
        L_0x05b2:
            r1 = 0
            r2 = 16
        L_0x05b5:
            r3 = 13
            goto L_0x06d2
        L_0x05b9:
            int r1 = r10.token     // Catch:{ all -> 0x06ef }
            r2 = 17
            if (r1 == r2) goto L_0x06e6
        L_0x05bf:
            int r1 = r10.token     // Catch:{ all -> 0x06ef }
            r2 = 16
            if (r1 == r2) goto L_0x06cf
            int r1 = r10.token     // Catch:{ all -> 0x06ef }
            r3 = 13
            if (r1 != r3) goto L_0x06a8
            r10.nextToken(r2)     // Catch:{ all -> 0x06ef }
        L_0x05ce:
            r4 = r21
        L_0x05d0:
            if (r11 != 0) goto L_0x06a0
            if (r15 != 0) goto L_0x05e6
            java.lang.Object r1 = r35.createInstance((com.alibaba.fastjson.parser.DefaultJSONParser) r36, (java.lang.reflect.Type) r37)     // Catch:{ all -> 0x069c }
            if (r4 != 0) goto L_0x05de
            com.alibaba.fastjson.parser.ParseContext r4 = r8.setContext(r14, r1, r9)     // Catch:{ all -> 0x0477 }
        L_0x05de:
            if (r4 == 0) goto L_0x05e2
            r4.object = r1
        L_0x05e2:
            r8.setContext(r14)
            return r1
        L_0x05e6:
            com.alibaba.fastjson.parser.JavaBeanInfo r0 = r7.beanInfo     // Catch:{ all -> 0x069c }
            java.lang.String[] r0 = r0.creatorConstructorParameters     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x05ee
            int r1 = r0.length     // Catch:{ all -> 0x069c }
            goto L_0x05f1
        L_0x05ee:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r1 = r7.fieldDeserializers     // Catch:{ all -> 0x069c }
            int r1 = r1.length     // Catch:{ all -> 0x069c }
        L_0x05f1:
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x069c }
            r6 = 0
        L_0x05f4:
            if (r6 >= r1) goto L_0x0618
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r3 = r7.fieldDeserializers     // Catch:{ all -> 0x069c }
            r3 = r3[r6]     // Catch:{ all -> 0x069c }
            com.alibaba.fastjson.util.FieldInfo r3 = r3.fieldInfo     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0605
            java.lang.String r5 = r3.name     // Catch:{ all -> 0x069c }
            java.lang.Object r5 = r15.remove(r5)     // Catch:{ all -> 0x069c }
            goto L_0x060b
        L_0x0605:
            java.lang.String r5 = r3.name     // Catch:{ all -> 0x069c }
            java.lang.Object r5 = r15.get(r5)     // Catch:{ all -> 0x069c }
        L_0x060b:
            if (r5 != 0) goto L_0x0613
            java.lang.Class<?> r3 = r3.fieldClass     // Catch:{ all -> 0x069c }
            java.lang.Object r5 = com.alibaba.fastjson.util.TypeUtils.defaultValue(r3)     // Catch:{ all -> 0x069c }
        L_0x0613:
            r2[r6] = r5     // Catch:{ all -> 0x069c }
            int r6 = r6 + 1
            goto L_0x05f4
        L_0x0618:
            com.alibaba.fastjson.parser.JavaBeanInfo r1 = r7.beanInfo     // Catch:{ all -> 0x069c }
            java.lang.reflect.Constructor<?> r1 = r1.creatorConstructor     // Catch:{ all -> 0x069c }
            if (r1 == 0) goto L_0x066f
            com.alibaba.fastjson.parser.JavaBeanInfo r1 = r7.beanInfo     // Catch:{ Exception -> 0x0652 }
            java.lang.reflect.Constructor<?> r1 = r1.creatorConstructor     // Catch:{ Exception -> 0x0652 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ Exception -> 0x0652 }
            if (r0 == 0) goto L_0x0650
            java.util.Set r0 = r15.entrySet()     // Catch:{ all -> 0x0477 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0477 }
        L_0x0630:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0477 }
            if (r2 == 0) goto L_0x0650
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0477 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0477 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x0477 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0477 }
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r3 = r7.getFieldDeserializer(r3)     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x0630
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0477 }
            r3.setValue((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x0477 }
            goto L_0x0630
        L_0x0650:
            r11 = r1
            goto L_0x06a0
        L_0x0652:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x069c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x069c }
            java.lang.String r3 = "create instance error, "
            r2.<init>(r3)     // Catch:{ all -> 0x069c }
            com.alibaba.fastjson.parser.JavaBeanInfo r3 = r7.beanInfo     // Catch:{ all -> 0x069c }
            java.lang.reflect.Constructor<?> r3 = r3.creatorConstructor     // Catch:{ all -> 0x069c }
            java.lang.String r3 = r3.toGenericString()     // Catch:{ all -> 0x069c }
            r2.append(r3)     // Catch:{ all -> 0x069c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x069c }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x069c }
            throw r1     // Catch:{ all -> 0x069c }
        L_0x066f:
            com.alibaba.fastjson.parser.JavaBeanInfo r0 = r7.beanInfo     // Catch:{ all -> 0x069c }
            java.lang.reflect.Method r0 = r0.factoryMethod     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x06a0
            com.alibaba.fastjson.parser.JavaBeanInfo r0 = r7.beanInfo     // Catch:{ Exception -> 0x067f }
            java.lang.reflect.Method r0 = r0.factoryMethod     // Catch:{ Exception -> 0x067f }
            r1 = 0
            java.lang.Object r11 = r0.invoke(r1, r2)     // Catch:{ Exception -> 0x067f }
            goto L_0x06a0
        L_0x067f:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x069c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x069c }
            java.lang.String r3 = "create factory method error, "
            r2.<init>(r3)     // Catch:{ all -> 0x069c }
            com.alibaba.fastjson.parser.JavaBeanInfo r3 = r7.beanInfo     // Catch:{ all -> 0x069c }
            java.lang.reflect.Method r3 = r3.factoryMethod     // Catch:{ all -> 0x069c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x069c }
            r2.append(r3)     // Catch:{ all -> 0x069c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x069c }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x069c }
            throw r1     // Catch:{ all -> 0x069c }
        L_0x069c:
            r0 = move-exception
            r12 = r4
            r1 = r11
            goto L_0x06f8
        L_0x06a0:
            if (r4 == 0) goto L_0x06a4
            r4.object = r11
        L_0x06a4:
            r8.setContext(r14)
            return r11
        L_0x06a8:
            r1 = 0
            int r4 = r10.token     // Catch:{ all -> 0x06ef }
            r5 = 18
            if (r4 == r5) goto L_0x06b4
            int r4 = r10.token     // Catch:{ all -> 0x06ef }
            if (r4 == r0) goto L_0x06b4
            goto L_0x06d2
        L_0x06b4:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x06ef }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06ef }
            java.lang.String r2 = "syntax error, unexpect token "
            r1.<init>(r2)     // Catch:{ all -> 0x06ef }
            int r2 = r10.token     // Catch:{ all -> 0x06ef }
            java.lang.String r2 = com.alibaba.fastjson.parser.JSONToken.name(r2)     // Catch:{ all -> 0x06ef }
            r1.append(r2)     // Catch:{ all -> 0x06ef }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06ef }
            r0.<init>(r1)     // Catch:{ all -> 0x06ef }
            throw r0     // Catch:{ all -> 0x06ef }
        L_0x06cf:
            r1 = 0
            goto L_0x05b5
        L_0x06d2:
            r0 = r37
            r6 = r39
            r1 = r11
            r2 = r12
            r3 = r13
            r20 = r21
            r12 = r27
            r4 = 4
            r11 = 16
            r21 = r15
        L_0x06e2:
            r15 = 13
            goto L_0x00ca
        L_0x06e6:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x06ef }
            java.lang.String r1 = "syntax error, unexpect token ':'"
            r0.<init>(r1)     // Catch:{ all -> 0x06ef }
            throw r0     // Catch:{ all -> 0x06ef }
        L_0x06ef:
            r0 = move-exception
            r1 = r11
        L_0x06f1:
            r12 = r21
            goto L_0x06f8
        L_0x06f4:
            r0 = move-exception
            r1 = r12
            goto L_0x0041
        L_0x06f8:
            if (r12 == 0) goto L_0x06fc
            r12.object = r1
        L_0x06fc:
            r8.setContext(r14)
            throw r0
        L_0x0700:
            java.lang.Object r0 = r36.parse()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public FieldDeserializer getFieldDeserializerByHash(long j) {
        int i = 0;
        while (true) {
            FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
            if (i >= fieldDeserializerArr.length) {
                return null;
            }
            FieldDeserializer fieldDeserializer = fieldDeserializerArr[i];
            if (fieldDeserializer.fieldInfo.nameHashCode == j) {
                return fieldDeserializer;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public FieldDeserializer getFieldDeserializer(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        if (this.beanInfo.ordered) {
            while (true) {
                FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                if (i >= fieldDeserializerArr.length) {
                    return null;
                }
                FieldDeserializer fieldDeserializer = fieldDeserializerArr[i];
                if (fieldDeserializer.fieldInfo.name.equalsIgnoreCase(str)) {
                    return fieldDeserializer;
                }
                i++;
            }
        } else {
            int length = this.sortedFieldDeserializers.length - 1;
            while (i <= length) {
                int i2 = (i + length) >>> 1;
                int compareTo = this.sortedFieldDeserializers[i2].fieldInfo.name.compareTo(str);
                if (compareTo < 0) {
                    i = i2 + 1;
                } else if (compareTo <= 0) {
                    return this.sortedFieldDeserializers[i2];
                } else {
                    length = i2 - 1;
                }
            }
            Map<String, FieldDeserializer> map = this.alterNameFieldDeserializers;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
    }

    private boolean parseField(DefaultJSONParser defaultJSONParser, String str, Object obj, Type type, Map<String, Object> map) {
        boolean z;
        DefaultJSONParser defaultJSONParser2 = defaultJSONParser;
        String str2 = str;
        Object obj2 = obj;
        JSONLexer jSONLexer = defaultJSONParser2.lexer;
        FieldDeserializer fieldDeserializer = getFieldDeserializer(str2);
        if (fieldDeserializer == null) {
            long fnv_64_lower = TypeUtils.fnv_64_lower(str);
            if (this.smartMatchHashArray == null) {
                long[] jArr = new long[this.sortedFieldDeserializers.length];
                int i = 0;
                while (true) {
                    FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                    if (i >= fieldDeserializerArr.length) {
                        break;
                    }
                    jArr[i] = TypeUtils.fnv_64_lower(fieldDeserializerArr[i].fieldInfo.name);
                    i++;
                }
                Arrays.sort(jArr);
                this.smartMatchHashArray = jArr;
            }
            int binarySearch = Arrays.binarySearch(this.smartMatchHashArray, fnv_64_lower);
            if (binarySearch < 0) {
                z = str2.startsWith("is");
                if (z) {
                    binarySearch = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv_64_lower(str2.substring(2)));
                }
            } else {
                z = false;
            }
            if (binarySearch >= 0) {
                if (this.smartMatchHashArrayMapping == null) {
                    int[] iArr = new int[this.smartMatchHashArray.length];
                    Arrays.fill(iArr, -1);
                    int i2 = 0;
                    while (true) {
                        FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
                        if (i2 >= fieldDeserializerArr2.length) {
                            break;
                        }
                        int binarySearch2 = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv_64_lower(fieldDeserializerArr2[i2].fieldInfo.name));
                        if (binarySearch2 >= 0) {
                            iArr[binarySearch2] = i2;
                        }
                        i2++;
                    }
                    this.smartMatchHashArrayMapping = iArr;
                }
                int i3 = this.smartMatchHashArrayMapping[binarySearch];
                if (i3 != -1) {
                    fieldDeserializer = this.sortedFieldDeserializers[i3];
                    Class<?> cls = fieldDeserializer.fieldInfo.fieldClass;
                    if (!(!z || cls == Boolean.TYPE || cls == Boolean.class)) {
                        fieldDeserializer = null;
                    }
                }
            }
        }
        int i4 = Feature.SupportNonPublicField.mask;
        if (fieldDeserializer == null && !((defaultJSONParser2.lexer.features & i4) == 0 && (i4 & this.beanInfo.parserFeatures) == 0)) {
            if (this.extraFieldDeserializers == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1, 0.75f, 1);
                Class cls2 = this.clazz;
                while (cls2 != null && cls2 != Object.class) {
                    for (Field field : cls2.getDeclaredFields()) {
                        String name = field.getName();
                        if (getFieldDeserializer(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentHashMap.put(name, field);
                            }
                        }
                    }
                    cls2 = cls2.getSuperclass();
                }
                this.extraFieldDeserializers = concurrentHashMap;
            }
            Object obj3 = this.extraFieldDeserializers.get(str2);
            if (obj3 != null) {
                if (obj3 instanceof FieldDeserializer) {
                    fieldDeserializer = (FieldDeserializer) obj3;
                } else {
                    Field field2 = (Field) obj3;
                    field2.setAccessible(true);
                    fieldDeserializer = new DefaultFieldDeserializer(defaultJSONParser2.config, this.clazz, new FieldInfo(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.extraFieldDeserializers.put(str2, fieldDeserializer);
                }
            }
        }
        if (fieldDeserializer == null) {
            parseExtra(defaultJSONParser2, obj2, str2);
            return false;
        }
        jSONLexer.nextTokenWithChar(':');
        fieldDeserializer.parseField(defaultJSONParser2, obj2, type, map);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void parseExtra(DefaultJSONParser defaultJSONParser, Object obj, String str) {
        Object obj2;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if ((defaultJSONParser.lexer.features & Feature.IgnoreNotMatch.mask) != 0) {
            jSONLexer.nextTokenWithChar(':');
            Type type = null;
            List<ExtraTypeProvider> list = defaultJSONParser.extraTypeProviders;
            if (list != null) {
                for (ExtraTypeProvider extraType : list) {
                    type = extraType.getExtraType(obj, str);
                }
            }
            if (type == null) {
                obj2 = defaultJSONParser.parse();
            } else {
                obj2 = defaultJSONParser.parseObject(type);
            }
            if (obj instanceof ExtraProcessable) {
                ((ExtraProcessable) obj).processExtra(str, obj2);
                return;
            }
            List<ExtraProcessor> list2 = defaultJSONParser.extraProcessors;
            if (list2 != null) {
                for (ExtraProcessor processExtra : list2) {
                    processExtra.processExtra(obj, str, obj2);
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("setter not found, class ");
        sb.append(this.clazz.getName());
        sb.append(", property ");
        sb.append(str);
        throw new JSONException(sb.toString());
    }

    public Object createInstance(Map<String, Object> map, ParserConfig parserConfig) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        if (this.beanInfo.creatorConstructor == null) {
            Object createInstance = createInstance((DefaultJSONParser) null, (Type) this.clazz);
            for (Map.Entry next : map.entrySet()) {
                FieldDeserializer fieldDeserializer = getFieldDeserializer((String) next.getKey());
                if (fieldDeserializer != null) {
                    Object value = next.getValue();
                    Method method = fieldDeserializer.fieldInfo.method;
                    if (method != null) {
                        method.invoke(createInstance, new Object[]{TypeUtils.cast(value, method.getGenericParameterTypes()[0], parserConfig)});
                    } else {
                        Field field = fieldDeserializer.fieldInfo.field;
                        Type type = fieldDeserializer.fieldInfo.fieldType;
                        String str = fieldDeserializer.fieldInfo.format;
                        if (str == null || type != Date.class || !(value instanceof String)) {
                            obj = TypeUtils.cast(value, type, parserConfig);
                        } else {
                            try {
                                obj = new SimpleDateFormat(str).parse((String) value);
                            } catch (ParseException unused) {
                                obj = null;
                            }
                        }
                        field.set(createInstance, obj);
                    }
                }
            }
            return createInstance;
        }
        FieldInfo[] fieldInfoArr = this.beanInfo.fields;
        int length = fieldInfoArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            FieldInfo fieldInfo = fieldInfoArr[i];
            Object obj2 = map.get(fieldInfo.name);
            if (obj2 == null) {
                obj2 = TypeUtils.defaultValue(fieldInfo.fieldClass);
            }
            objArr[i] = obj2;
        }
        if (this.beanInfo.creatorConstructor == null) {
            return null;
        }
        try {
            return this.beanInfo.creatorConstructor.newInstance(objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("create instance error, ");
            sb.append(this.beanInfo.creatorConstructor.toGenericString());
            throw new JSONException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public JavaBeanDeserializer getSeeAlso(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, String str) {
        if (javaBeanInfo.jsonType == null) {
            return null;
        }
        for (Class deserializer : javaBeanInfo.jsonType.seeAlso()) {
            ObjectDeserializer deserializer2 = parserConfig.getDeserializer(deserializer);
            if (deserializer2 instanceof JavaBeanDeserializer) {
                JavaBeanDeserializer javaBeanDeserializer = (JavaBeanDeserializer) deserializer2;
                JavaBeanInfo javaBeanInfo2 = javaBeanDeserializer.beanInfo;
                if (javaBeanInfo2.typeName.equals(str)) {
                    return javaBeanDeserializer;
                }
                JavaBeanDeserializer seeAlso = getSeeAlso(parserConfig, javaBeanInfo2, str);
                if (seeAlso != null) {
                    return seeAlso;
                }
            }
        }
        return null;
    }
}
