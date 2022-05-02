package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    public ParserConfig config;
    protected ParseContext contex;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    protected List<ExtraProcessor> extraProcessors;
    protected List<ExtraTypeProvider> extraTypeProviders;
    public FieldTypeResolver fieldTypeResolver;
    public final JSONLexer lexer;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    public String getDateFomartPattern() {
        return this.dateFormatPattern;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.lexer.locale);
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.lexer.timeZone);
        }
        return this.dateFormat;
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        this.dateFormat = null;
    }

    public void setDateFomrat(DateFormat dateFormat2) {
        this.dateFormat = dateFormat2;
    }

    public DefaultJSONParser(String str) {
        this(str, ParserConfig.global, JSON.DEFAULT_PARSER_FEATURE);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
        this(new JSONLexer(str, JSON.DEFAULT_PARSER_FEATURE), parserConfig);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i) {
        this(new JSONLexer(str, i), parserConfig);
    }

    public DefaultJSONParser(char[] cArr, int i, ParserConfig parserConfig, int i2) {
        this(new JSONLexer(cArr, i, i2), parserConfig);
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
        this(jSONLexer, ParserConfig.global);
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
        this.dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
        this.contextArrayIndex = 0;
        this.resolveStatus = 0;
        this.extraTypeProviders = null;
        this.extraProcessors = null;
        this.fieldTypeResolver = null;
        this.lexer = jSONLexer;
        this.config = parserConfig;
        this.symbolTable = parserConfig.symbolTable;
        char c = jSONLexer.ch;
        char c2 = JSONLexer.EOI;
        if (c == '{') {
            int i = jSONLexer.bp + 1;
            jSONLexer.bp = i;
            jSONLexer.ch = i < jSONLexer.len ? jSONLexer.text.charAt(i) : c2;
            jSONLexer.token = 12;
        } else if (jSONLexer.ch == '[') {
            int i2 = jSONLexer.bp + 1;
            jSONLexer.bp = i2;
            jSONLexer.ch = i2 < jSONLexer.len ? jSONLexer.text.charAt(i2) : c2;
            jSONLexer.token = 14;
        } else {
            jSONLexer.nextToken();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x021d, code lost:
        r3.nextToken(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0224, code lost:
        if (r3.token != 13) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0226, code lost:
        r3.nextToken(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r2 = r1.config.getDeserializer(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0231, code lost:
        if ((r2 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0233, code lost:
        r2 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r2;
        r3 = r2.createInstance(r1, (java.lang.reflect.Type) r7);
        r0 = r19.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0245, code lost:
        if (r0.hasNext() == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0247, code lost:
        r4 = (java.util.Map.Entry) r0.next();
        r5 = r4.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0253, code lost:
        if ((r5 instanceof java.lang.String) == false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0255, code lost:
        r5 = r2.getFieldDeserializer((java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x025b, code lost:
        if (r5 == null) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025d, code lost:
        r5.setValue((java.lang.Object) r3, r4.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0265, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0266, code lost:
        if (r3 != null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x026a, code lost:
        if (r7 != java.lang.Cloneable.class) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x026c, code lost:
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0278, code lost:
        if ("java.util.Collections$EmptyMap".equals(r6) == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x027a, code lost:
        r3 = java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x027f, code lost:
        r3 = r7.newInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0283, code lost:
        if (r13 != false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0285, code lost:
        r1.contex = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0287, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0291, code lost:
        r1.resolveStatus = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0296, code lost:
        if (r1.contex == null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x029a, code lost:
        if ((r2 instanceof java.lang.Integer) != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x029c, code lost:
        popContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02a3, code lost:
        if (r19.size() <= 0) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02a5, code lost:
        r0 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r0, r7, r1.config);
        parseObject((java.lang.Object) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02ae, code lost:
        if (r13 != false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b0, code lost:
        r1.contex = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b2, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r0 = r1.config.getDeserializer(r7).deserialze(r1, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02bd, code lost:
        if (r13 != false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02bf, code lost:
        r1.contex = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02c1, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02d2, code lost:
        r3.nextToken(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02d7, code lost:
        if (r3.token != 4) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02d9, code lost:
        r0 = r3.stringVal();
        r3.nextToken(13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02e6, code lost:
        if (com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool.PREFIX_ID.equals(r0) == false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02e8, code lost:
        r0 = r1.contex;
        r2 = r0.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02ee, code lost:
        if ((r2 instanceof java.lang.Object[]) != false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02f2, code lost:
        if ((r2 instanceof java.util.Collection) == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02f7, code lost:
        if (r0.parent == null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02f9, code lost:
        r6 = r0.parent.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02fe, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0306, code lost:
        if ("..".equals(r0) == false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x030a, code lost:
        if (r14.object == null) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x030c, code lost:
        r6 = r14.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x030f, code lost:
        addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r14, r0));
        r1.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0321, code lost:
        if ("$".equals(r0) == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0323, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0326, code lost:
        if (r2.parent == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0328, code lost:
        r2 = r2.parent;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x032d, code lost:
        if (r2.object == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x032f, code lost:
        r6 = r2.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0332, code lost:
        addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r2, r0));
        r1.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x033e, code lost:
        addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r14, r0));
        r1.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0349, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x034c, code lost:
        if (r3.token != 13) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x034e, code lost:
        r3.nextToken(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0353, code lost:
        if (r13 != false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0355, code lost:
        r1.contex = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0357, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r2 = new java.lang.StringBuilder("syntax error, ");
        r2.append(r3.info());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x036d, code lost:
        throw new com.alibaba.fastjson.JSONException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x036e, code lost:
        r2 = new java.lang.StringBuilder("illegal ref, ");
        r2.append(com.alibaba.fastjson.parser.JSONToken.name(r3.token));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0387, code lost:
        throw new com.alibaba.fastjson.JSONException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x057a, code lost:
        if (r5 != '}') goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x057c, code lost:
        r4 = r3.bp + 1;
        r3.bp = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0584, code lost:
        if (r4 < r3.len) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0586, code lost:
        r4 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0589, code lost:
        r4 = r3.text.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x058f, code lost:
        r3.ch = r4;
        r3.sp = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0596, code lost:
        if (r4 != ',') goto L_0x05b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0598, code lost:
        r4 = r3.bp + 1;
        r3.bp = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05a0, code lost:
        if (r4 < r3.len) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05a2, code lost:
        r5 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x05a5, code lost:
        r5 = r3.text.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x05ab, code lost:
        r3.ch = r5;
        r3.token = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x05b4, code lost:
        if (r4 != '}') goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05b6, code lost:
        r4 = r3.bp + 1;
        r3.bp = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05be, code lost:
        if (r4 < r3.len) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x05c0, code lost:
        r5 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x05c3, code lost:
        r5 = r3.text.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x05c9, code lost:
        r3.ch = r5;
        r3.token = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x05d2, code lost:
        if (r4 != ']') goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x05d4, code lost:
        r4 = r3.bp + 1;
        r3.bp = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x05dc, code lost:
        if (r4 < r3.len) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x05de, code lost:
        r5 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x05e1, code lost:
        r5 = r3.text.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x05e7, code lost:
        r3.ch = r5;
        r3.token = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x05ee, code lost:
        r3.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x05f1, code lost:
        if (r13 != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x05f3, code lost:
        setContext(r1.contex, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x05f8, code lost:
        if (r13 != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x05fa, code lost:
        r1.contex = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x05fc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        r2 = new java.lang.StringBuilder("syntax error, ");
        r2.append(r3.info());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0612, code lost:
        throw new com.alibaba.fastjson.JSONException(r2.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ec A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f7 A[SYNTHETIC, Splitter:B:124:0x01f7] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x039d A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03c2 A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x04b7 A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04c6 A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x04cf A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x04d3 A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x04d8 A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x055d A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x02d2 A[EDGE_INSN: B:420:0x02d2->B:183:0x02d2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x04e1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0578 A[EDGE_INSN: B:426:0x0578->B:354:0x0578 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b1 A[Catch:{ Exception -> 0x0288, NumberFormatException -> 0x0153, all -> 0x0687 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object parseObject(java.util.Map r19, java.lang.Object r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            com.alibaba.fastjson.parser.JSONLexer r3 = r1.lexer
            int r4 = r3.token
            r5 = 8
            r6 = 0
            if (r4 != r5) goto L_0x0013
            r3.nextToken()
            return r6
        L_0x0013:
            r7 = 12
            r8 = 16
            if (r4 == r7) goto L_0x0041
            if (r4 != r8) goto L_0x001c
            goto L_0x0041
        L_0x001c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "syntax error, expect {, actual "
            r2.<init>(r5)
            java.lang.String r4 = com.alibaba.fastjson.parser.JSONToken.name(r4)
            r2.append(r4)
            java.lang.String r4 = ", "
            r2.append(r4)
            java.lang.String r3 = r3.info()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0041:
            boolean r4 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r4 == 0) goto L_0x004e
            r4 = r0
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4
            java.util.Map r4 = r4.getInnerMap()
            r11 = 1
            goto L_0x0050
        L_0x004e:
            r4 = r0
            r11 = 0
        L_0x0050:
            int r12 = r3.features
            com.alibaba.fastjson.parser.Feature r13 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat
            int r13 = r13.mask
            r12 = r12 & r13
            if (r12 == 0) goto L_0x005b
            r12 = 1
            goto L_0x005c
        L_0x005b:
            r12 = 0
        L_0x005c:
            boolean r13 = r3.disableCircularReferenceDetect
            com.alibaba.fastjson.parser.ParseContext r14 = r1.contex
            r15 = 0
        L_0x0061:
            char r6 = r3.ch     // Catch:{ all -> 0x0687 }
            r5 = 125(0x7d, float:1.75E-43)
            r7 = 34
            if (r6 == r7) goto L_0x0070
            if (r6 == r5) goto L_0x0070
            r3.skipWhitespace()     // Catch:{ all -> 0x0687 }
            char r6 = r3.ch     // Catch:{ all -> 0x0687 }
        L_0x0070:
            r8 = 44
            if (r6 != r8) goto L_0x007d
            r3.next()     // Catch:{ all -> 0x0687 }
            r3.skipWhitespace()     // Catch:{ all -> 0x0687 }
            char r6 = r3.ch     // Catch:{ all -> 0x0687 }
            goto L_0x0070
        L_0x007d:
            java.lang.String r8 = "expect ':' at "
            r9 = 58
            java.lang.String r10 = "syntax error, "
            r5 = 26
            if (r6 != r7) goto L_0x00b9
            com.alibaba.fastjson.parser.SymbolTable r6 = r1.symbolTable     // Catch:{ all -> 0x0687 }
            java.lang.String r6 = r3.scanSymbol(r6, r7)     // Catch:{ all -> 0x0687 }
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
            if (r7 == r9) goto L_0x00b6
            r3.skipWhitespace()     // Catch:{ all -> 0x0687 }
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
            if (r7 != r9) goto L_0x009a
            goto L_0x00b6
        L_0x009a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r8)     // Catch:{ all -> 0x0687 }
            int r3 = r3.pos     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = ", name "
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            r2.append(r6)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x00b6:
            r7 = 0
            goto L_0x01ad
        L_0x00b9:
            r7 = 125(0x7d, float:1.75E-43)
            if (r6 != r7) goto L_0x00dd
            int r2 = r3.bp     // Catch:{ all -> 0x0687 }
            r4 = 1
            int r2 = r2 + r4
            r3.bp = r2     // Catch:{ all -> 0x0687 }
            int r4 = r3.len     // Catch:{ all -> 0x0687 }
            if (r2 < r4) goto L_0x00c8
            goto L_0x00ce
        L_0x00c8:
            java.lang.String r4 = r3.text     // Catch:{ all -> 0x0687 }
            char r5 = r4.charAt(r2)     // Catch:{ all -> 0x0687 }
        L_0x00ce:
            r3.ch = r5     // Catch:{ all -> 0x0687 }
            r2 = 0
            r3.sp = r2     // Catch:{ all -> 0x0687 }
            r2 = 16
            r3.nextToken(r2)     // Catch:{ all -> 0x0687 }
            if (r13 != 0) goto L_0x00dc
            r1.contex = r14
        L_0x00dc:
            return r0
        L_0x00dd:
            r7 = 39
            if (r6 != r7) goto L_0x0107
            com.alibaba.fastjson.parser.SymbolTable r6 = r1.symbolTable     // Catch:{ all -> 0x0687 }
            java.lang.String r6 = r3.scanSymbol(r6, r7)     // Catch:{ all -> 0x0687 }
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
            if (r7 == r9) goto L_0x00ee
            r3.skipWhitespace()     // Catch:{ all -> 0x0687 }
        L_0x00ee:
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
            if (r7 != r9) goto L_0x00f3
            goto L_0x00b6
        L_0x00f3:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r8)     // Catch:{ all -> 0x0687 }
            int r3 = r3.pos     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x0107:
            if (r6 == r5) goto L_0x0671
            r7 = 44
            if (r6 == r7) goto L_0x065b
            r7 = 48
            if (r6 < r7) goto L_0x0115
            r7 = 57
            if (r6 <= r7) goto L_0x0119
        L_0x0115:
            r7 = 45
            if (r6 != r7) goto L_0x016b
        L_0x0119:
            r6 = 0
            r3.sp = r6     // Catch:{ all -> 0x0687 }
            r3.scanNumber()     // Catch:{ all -> 0x0687 }
            int r6 = r3.token     // Catch:{ NumberFormatException -> 0x0153 }
            r7 = 2
            if (r6 != r7) goto L_0x0129
            java.lang.Number r6 = r3.integerValue()     // Catch:{ NumberFormatException -> 0x0153 }
            goto L_0x012f
        L_0x0129:
            r6 = 1
            java.lang.Number r7 = r3.decimalValue(r6)     // Catch:{ NumberFormatException -> 0x0153 }
            r6 = r7
        L_0x012f:
            if (r11 == 0) goto L_0x0135
            java.lang.String r6 = r6.toString()     // Catch:{ NumberFormatException -> 0x0153 }
        L_0x0135:
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
            if (r7 != r9) goto L_0x013b
            goto L_0x00b6
        L_0x013b:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            java.lang.String r4 = "parse number key error, "
            r2.<init>(r4)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x0153:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            java.lang.String r4 = "parse number key error, "
            r2.<init>(r4)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x016b:
            r7 = 123(0x7b, float:1.72E-43)
            if (r6 == r7) goto L_0x01a5
            r7 = 91
            if (r6 != r7) goto L_0x0174
            goto L_0x01a5
        L_0x0174:
            com.alibaba.fastjson.parser.SymbolTable r6 = r1.symbolTable     // Catch:{ all -> 0x0687 }
            java.lang.String r6 = r3.scanSymbolUnQuoted(r6)     // Catch:{ all -> 0x0687 }
            r3.skipWhitespace()     // Catch:{ all -> 0x0687 }
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
            if (r7 != r9) goto L_0x0189
            if (r11 == 0) goto L_0x00b6
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0687 }
            goto L_0x00b6
        L_0x0189:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r8)     // Catch:{ all -> 0x0687 }
            int r3 = r3.bp     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = ", actual "
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            r2.append(r7)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x01a5:
            r3.nextToken()     // Catch:{ all -> 0x0687 }
            java.lang.Object r6 = r18.parse()     // Catch:{ all -> 0x0687 }
            r7 = 1
        L_0x01ad:
            r8 = 13
            if (r7 != 0) goto L_0x01ec
            int r7 = r3.bp     // Catch:{ all -> 0x0687 }
            r9 = 1
            int r7 = r7 + r9
            r3.bp = r7     // Catch:{ all -> 0x0687 }
            int r9 = r3.len     // Catch:{ all -> 0x0687 }
            if (r7 < r9) goto L_0x01be
            r7 = 26
            goto L_0x01c4
        L_0x01be:
            java.lang.String r9 = r3.text     // Catch:{ all -> 0x0687 }
            char r7 = r9.charAt(r7)     // Catch:{ all -> 0x0687 }
        L_0x01c4:
            r3.ch = r7     // Catch:{ all -> 0x0687 }
        L_0x01c6:
            r9 = 32
            if (r7 > r9) goto L_0x01e9
            r9 = 32
            if (r7 == r9) goto L_0x01e1
            r9 = 10
            if (r7 == r9) goto L_0x01e1
            if (r7 == r8) goto L_0x01e1
            r9 = 9
            if (r7 == r9) goto L_0x01e1
            r9 = 12
            if (r7 == r9) goto L_0x01e1
            r9 = 8
            if (r7 != r9) goto L_0x01f0
            goto L_0x01e3
        L_0x01e1:
            r9 = 8
        L_0x01e3:
            r3.next()     // Catch:{ all -> 0x0687 }
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
            goto L_0x01c6
        L_0x01e9:
            r9 = 8
            goto L_0x01f0
        L_0x01ec:
            r9 = 8
            char r7 = r3.ch     // Catch:{ all -> 0x0687 }
        L_0x01f0:
            r5 = 0
            r3.sp = r5     // Catch:{ all -> 0x0687 }
            java.lang.String r5 = "@type"
            if (r6 != r5) goto L_0x02c2
            com.alibaba.fastjson.parser.Feature r9 = com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect     // Catch:{ all -> 0x0687 }
            boolean r9 = r3.isEnabled(r9)     // Catch:{ all -> 0x0687 }
            if (r9 != 0) goto L_0x02c2
            com.alibaba.fastjson.parser.SymbolTable r6 = r1.symbolTable     // Catch:{ all -> 0x0687 }
            r7 = 34
            java.lang.String r6 = r3.scanSymbol(r6, r7)     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.parser.ParserConfig r7 = r1.config     // Catch:{ all -> 0x0687 }
            int r9 = r3.features     // Catch:{ all -> 0x0687 }
            r10 = 0
            java.lang.Class r7 = r7.checkAutoType(r6, r10, r9)     // Catch:{ all -> 0x0687 }
            if (r7 != 0) goto L_0x021d
            r0.put(r5, r6)     // Catch:{ all -> 0x0687 }
        L_0x0215:
            r5 = 8
            r7 = 12
            r8 = 16
            goto L_0x0061
        L_0x021d:
            r4 = 16
            r3.nextToken(r4)     // Catch:{ all -> 0x0687 }
            int r5 = r3.token     // Catch:{ all -> 0x0687 }
            if (r5 != r8) goto L_0x0291
            r3.nextToken(r4)     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.parser.ParserConfig r2 = r1.config     // Catch:{ Exception -> 0x0288 }
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r2 = r2.getDeserializer(r7)     // Catch:{ Exception -> 0x0288 }
            boolean r3 = r2 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer     // Catch:{ Exception -> 0x0288 }
            if (r3 == 0) goto L_0x0265
            com.alibaba.fastjson.parser.JavaBeanDeserializer r2 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r2     // Catch:{ Exception -> 0x0288 }
            java.lang.Object r3 = r2.createInstance((com.alibaba.fastjson.parser.DefaultJSONParser) r1, (java.lang.reflect.Type) r7)     // Catch:{ Exception -> 0x0288 }
            java.util.Set r0 = r19.entrySet()     // Catch:{ Exception -> 0x0288 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0288 }
        L_0x0241:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0288 }
            if (r4 == 0) goto L_0x0266
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0288 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x0288 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Exception -> 0x0288 }
            boolean r8 = r5 instanceof java.lang.String     // Catch:{ Exception -> 0x0288 }
            if (r8 == 0) goto L_0x0241
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0288 }
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r5 = r2.getFieldDeserializer(r5)     // Catch:{ Exception -> 0x0288 }
            if (r5 == 0) goto L_0x0241
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x0288 }
            r5.setValue((java.lang.Object) r3, (java.lang.Object) r4)     // Catch:{ Exception -> 0x0288 }
            goto L_0x0241
        L_0x0265:
            r3 = r10
        L_0x0266:
            if (r3 != 0) goto L_0x0283
            java.lang.Class<java.lang.Cloneable> r0 = java.lang.Cloneable.class
            if (r7 != r0) goto L_0x0272
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0288 }
            r3.<init>()     // Catch:{ Exception -> 0x0288 }
            goto L_0x0283
        L_0x0272:
            java.lang.String r0 = "java.util.Collections$EmptyMap"
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x0288 }
            if (r0 == 0) goto L_0x027f
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ Exception -> 0x0288 }
            goto L_0x0283
        L_0x027f:
            java.lang.Object r3 = r7.newInstance()     // Catch:{ Exception -> 0x0288 }
        L_0x0283:
            if (r13 != 0) goto L_0x0287
            r1.contex = r14
        L_0x0287:
            return r3
        L_0x0288:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = "create instance error"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0687 }
            throw r2     // Catch:{ all -> 0x0687 }
        L_0x0291:
            r3 = 2
            r1.resolveStatus = r3     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.parser.ParseContext r3 = r1.contex     // Catch:{ all -> 0x0687 }
            if (r3 == 0) goto L_0x029f
            boolean r3 = r2 instanceof java.lang.Integer     // Catch:{ all -> 0x0687 }
            if (r3 != 0) goto L_0x029f
            r18.popContext()     // Catch:{ all -> 0x0687 }
        L_0x029f:
            int r3 = r19.size()     // Catch:{ all -> 0x0687 }
            if (r3 <= 0) goto L_0x02b3
            com.alibaba.fastjson.parser.ParserConfig r2 = r1.config     // Catch:{ all -> 0x0687 }
            java.lang.Object r0 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r0, r7, (com.alibaba.fastjson.parser.ParserConfig) r2)     // Catch:{ all -> 0x0687 }
            r1.parseObject((java.lang.Object) r0)     // Catch:{ all -> 0x0687 }
            if (r13 != 0) goto L_0x02b2
            r1.contex = r14
        L_0x02b2:
            return r0
        L_0x02b3:
            com.alibaba.fastjson.parser.ParserConfig r0 = r1.config     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r7)     // Catch:{ all -> 0x0687 }
            java.lang.Object r0 = r0.deserialze(r1, r7, r2)     // Catch:{ all -> 0x0687 }
            if (r13 != 0) goto L_0x02c1
            r1.contex = r14
        L_0x02c1:
            return r0
        L_0x02c2:
            r5 = 0
            java.lang.String r9 = "$ref"
            r5 = 4
            if (r6 != r9) goto L_0x0388
            if (r14 == 0) goto L_0x0388
            com.alibaba.fastjson.parser.Feature r9 = com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect     // Catch:{ all -> 0x0687 }
            boolean r9 = r3.isEnabled(r9)     // Catch:{ all -> 0x0687 }
            if (r9 != 0) goto L_0x0388
            r3.nextToken(r5)     // Catch:{ all -> 0x0687 }
            int r0 = r3.token     // Catch:{ all -> 0x0687 }
            if (r0 != r5) goto L_0x036e
            java.lang.String r0 = r3.stringVal()     // Catch:{ all -> 0x0687 }
            r3.nextToken(r8)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = "@"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x0300
            com.alibaba.fastjson.parser.ParseContext r0 = r1.contex     // Catch:{ all -> 0x0687 }
            java.lang.Object r2 = r0.object     // Catch:{ all -> 0x0687 }
            boolean r4 = r2 instanceof java.lang.Object[]     // Catch:{ all -> 0x0687 }
            if (r4 != 0) goto L_0x02fe
            boolean r4 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x0687 }
            if (r4 == 0) goto L_0x02f5
            goto L_0x02fe
        L_0x02f5:
            com.alibaba.fastjson.parser.ParseContext r2 = r0.parent     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x0349
            com.alibaba.fastjson.parser.ParseContext r0 = r0.parent     // Catch:{ all -> 0x0687 }
            java.lang.Object r6 = r0.object     // Catch:{ all -> 0x0687 }
            goto L_0x034a
        L_0x02fe:
            r6 = r2
            goto L_0x034a
        L_0x0300:
            java.lang.String r2 = ".."
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x031b
            java.lang.Object r2 = r14.object     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x030f
            java.lang.Object r6 = r14.object     // Catch:{ all -> 0x0687 }
            goto L_0x034a
        L_0x030f:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r2 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch:{ all -> 0x0687 }
            r2.<init>(r14, r0)     // Catch:{ all -> 0x0687 }
            r1.addResolveTask(r2)     // Catch:{ all -> 0x0687 }
            r0 = 1
            r1.resolveStatus = r0     // Catch:{ all -> 0x0687 }
            goto L_0x0349
        L_0x031b:
            java.lang.String r2 = "$"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x033e
            r2 = r14
        L_0x0324:
            com.alibaba.fastjson.parser.ParseContext r4 = r2.parent     // Catch:{ all -> 0x0687 }
            if (r4 == 0) goto L_0x032b
            com.alibaba.fastjson.parser.ParseContext r2 = r2.parent     // Catch:{ all -> 0x0687 }
            goto L_0x0324
        L_0x032b:
            java.lang.Object r4 = r2.object     // Catch:{ all -> 0x0687 }
            if (r4 == 0) goto L_0x0332
            java.lang.Object r6 = r2.object     // Catch:{ all -> 0x0687 }
            goto L_0x034a
        L_0x0332:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r4 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch:{ all -> 0x0687 }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x0687 }
            r1.addResolveTask(r4)     // Catch:{ all -> 0x0687 }
            r0 = 1
            r1.resolveStatus = r0     // Catch:{ all -> 0x0687 }
            goto L_0x0349
        L_0x033e:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r2 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch:{ all -> 0x0687 }
            r2.<init>(r14, r0)     // Catch:{ all -> 0x0687 }
            r1.addResolveTask(r2)     // Catch:{ all -> 0x0687 }
            r0 = 1
            r1.resolveStatus = r0     // Catch:{ all -> 0x0687 }
        L_0x0349:
            r6 = 0
        L_0x034a:
            int r0 = r3.token     // Catch:{ all -> 0x0687 }
            if (r0 != r8) goto L_0x0358
            r0 = 16
            r3.nextToken(r0)     // Catch:{ all -> 0x0687 }
            if (r13 != 0) goto L_0x0357
            r1.contex = r14
        L_0x0357:
            return r6
        L_0x0358:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r10)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x036e:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            java.lang.String r4 = "illegal ref, "
            r2.<init>(r4)     // Catch:{ all -> 0x0687 }
            int r3 = r3.token     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = com.alibaba.fastjson.parser.JSONToken.name(r3)     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x0388:
            if (r13 != 0) goto L_0x0399
            if (r15 != 0) goto L_0x0399
            com.alibaba.fastjson.parser.ParseContext r9 = r1.contex     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.parser.ParseContext r9 = r1.setContext(r9, r0, r2)     // Catch:{ all -> 0x0687 }
            if (r14 != 0) goto L_0x0395
            r14 = r9
        L_0x0395:
            r9 = 34
            r15 = 1
            goto L_0x039b
        L_0x0399:
            r9 = 34
        L_0x039b:
            if (r7 != r9) goto L_0x03c2
            java.lang.String r5 = r3.scanStringValue(r9)     // Catch:{ all -> 0x0687 }
            if (r12 == 0) goto L_0x03b8
            com.alibaba.fastjson.parser.JSONLexer r7 = new com.alibaba.fastjson.parser.JSONLexer     // Catch:{ all -> 0x0687 }
            r7.<init>(r5)     // Catch:{ all -> 0x0687 }
            r9 = 1
            boolean r16 = r7.scanISO8601DateIfMatch(r9)     // Catch:{ all -> 0x0687 }
            if (r16 == 0) goto L_0x03b5
            java.util.Calendar r5 = r7.calendar     // Catch:{ all -> 0x0687 }
            java.util.Date r5 = r5.getTime()     // Catch:{ all -> 0x0687 }
        L_0x03b5:
            r7.close()     // Catch:{ all -> 0x0687 }
        L_0x03b8:
            if (r4 == 0) goto L_0x03be
            r4.put(r6, r5)     // Catch:{ all -> 0x0687 }
            goto L_0x03d5
        L_0x03be:
            r0.put(r6, r5)     // Catch:{ all -> 0x0687 }
            goto L_0x03d5
        L_0x03c2:
            r9 = 48
            if (r7 < r9) goto L_0x03ca
            r9 = 57
            if (r7 <= r9) goto L_0x03ce
        L_0x03ca:
            r9 = 45
            if (r7 != r9) goto L_0x03d9
        L_0x03ce:
            java.lang.Number r5 = r3.scanNumberValue()     // Catch:{ all -> 0x0687 }
            r4.put(r6, r5)     // Catch:{ all -> 0x0687 }
        L_0x03d5:
            r17 = r11
            goto L_0x054a
        L_0x03d9:
            r9 = 91
            if (r7 != r9) goto L_0x044b
            r5 = 14
            r3.token = r5     // Catch:{ all -> 0x0687 }
            int r5 = r3.bp     // Catch:{ all -> 0x0687 }
            r7 = 1
            int r5 = r5 + r7
            r3.bp = r5     // Catch:{ all -> 0x0687 }
            int r7 = r3.len     // Catch:{ all -> 0x0687 }
            if (r5 < r7) goto L_0x03ee
            r5 = 26
            goto L_0x03f4
        L_0x03ee:
            java.lang.String r7 = r3.text     // Catch:{ all -> 0x0687 }
            char r5 = r7.charAt(r5)     // Catch:{ all -> 0x0687 }
        L_0x03f4:
            r3.ch = r5     // Catch:{ all -> 0x0687 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0687 }
            r5.<init>()     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x0407
            java.lang.Class r7 = r20.getClass()     // Catch:{ all -> 0x0687 }
            java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
            if (r7 != r9) goto L_0x0407
            r7 = 1
            goto L_0x0408
        L_0x0407:
            r7 = 0
        L_0x0408:
            if (r7 != 0) goto L_0x040d
            r1.setContext(r14)     // Catch:{ all -> 0x0687 }
        L_0x040d:
            r1.parseArray((java.util.Collection) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.JSONArray r7 = new com.alibaba.fastjson.JSONArray     // Catch:{ all -> 0x0687 }
            r7.<init>((java.util.List<java.lang.Object>) r5)     // Catch:{ all -> 0x0687 }
            if (r4 == 0) goto L_0x041b
            r4.put(r6, r7)     // Catch:{ all -> 0x0687 }
            goto L_0x041e
        L_0x041b:
            r0.put(r6, r7)     // Catch:{ all -> 0x0687 }
        L_0x041e:
            int r5 = r3.token     // Catch:{ all -> 0x0687 }
            if (r5 != r8) goto L_0x042c
            r6 = 16
            r3.nextToken(r6)     // Catch:{ all -> 0x0687 }
            if (r13 != 0) goto L_0x042b
            r1.contex = r14
        L_0x042b:
            return r0
        L_0x042c:
            r6 = 16
            if (r5 != r6) goto L_0x0435
            r17 = r11
        L_0x0432:
            r5 = 0
            goto L_0x0575
        L_0x0435:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r10)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x044b:
            r9 = 123(0x7b, float:1.72E-43)
            if (r7 != r9) goto L_0x050b
            int r5 = r3.bp     // Catch:{ all -> 0x0687 }
            r7 = 1
            int r5 = r5 + r7
            r3.bp = r5     // Catch:{ all -> 0x0687 }
            int r7 = r3.len     // Catch:{ all -> 0x0687 }
            if (r5 < r7) goto L_0x045c
            r5 = 26
            goto L_0x0462
        L_0x045c:
            java.lang.String r7 = r3.text     // Catch:{ all -> 0x0687 }
            char r5 = r7.charAt(r5)     // Catch:{ all -> 0x0687 }
        L_0x0462:
            r3.ch = r5     // Catch:{ all -> 0x0687 }
            r9 = 12
            r3.token = r9     // Catch:{ all -> 0x0687 }
            boolean r5 = r2 instanceof java.lang.Integer     // Catch:{ all -> 0x0687 }
            int r7 = r3.features     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.parser.Feature r9 = com.alibaba.fastjson.parser.Feature.OrderedField     // Catch:{ all -> 0x0687 }
            int r9 = r9.mask     // Catch:{ all -> 0x0687 }
            r7 = r7 & r9
            if (r7 == 0) goto L_0x047e
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject     // Catch:{ all -> 0x0687 }
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0687 }
            r9.<init>()     // Catch:{ all -> 0x0687 }
            r7.<init>((java.util.Map<java.lang.String, java.lang.Object>) r9)     // Catch:{ all -> 0x0687 }
            goto L_0x0483
        L_0x047e:
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject     // Catch:{ all -> 0x0687 }
            r7.<init>()     // Catch:{ all -> 0x0687 }
        L_0x0483:
            if (r13 != 0) goto L_0x048c
            if (r5 != 0) goto L_0x048c
            com.alibaba.fastjson.parser.ParseContext r9 = r1.setContext(r14, r7, r6)     // Catch:{ all -> 0x0687 }
            goto L_0x048d
        L_0x048c:
            r9 = 0
        L_0x048d:
            com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r8 = r1.fieldTypeResolver     // Catch:{ all -> 0x0687 }
            if (r8 == 0) goto L_0x04b1
            if (r6 == 0) goto L_0x049a
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x0687 }
            r17 = r11
            goto L_0x049d
        L_0x049a:
            r17 = r11
            r8 = 0
        L_0x049d:
            com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r11 = r1.fieldTypeResolver     // Catch:{ all -> 0x0687 }
            java.lang.reflect.Type r8 = r11.resolve(r0, r8)     // Catch:{ all -> 0x0687 }
            if (r8 == 0) goto L_0x04b3
            com.alibaba.fastjson.parser.ParserConfig r11 = r1.config     // Catch:{ all -> 0x0687 }
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r11 = r11.getDeserializer(r8)     // Catch:{ all -> 0x0687 }
            java.lang.Object r8 = r11.deserialze(r1, r8, r6)     // Catch:{ all -> 0x0687 }
            r11 = 1
            goto L_0x04b5
        L_0x04b1:
            r17 = r11
        L_0x04b3:
            r8 = 0
            r11 = 0
        L_0x04b5:
            if (r11 != 0) goto L_0x04bb
            java.lang.Object r8 = r1.parseObject((java.util.Map) r7, (java.lang.Object) r6)     // Catch:{ all -> 0x0687 }
        L_0x04bb:
            if (r9 == 0) goto L_0x04c1
            if (r7 == r8) goto L_0x04c1
            r9.object = r0     // Catch:{ all -> 0x0687 }
        L_0x04c1:
            int r7 = r1.resolveStatus     // Catch:{ all -> 0x0687 }
            r9 = 1
            if (r7 != r9) goto L_0x04cd
            java.lang.String r7 = r6.toString()     // Catch:{ all -> 0x0687 }
            r1.checkMapResolve(r0, r7)     // Catch:{ all -> 0x0687 }
        L_0x04cd:
            if (r4 == 0) goto L_0x04d3
            r4.put(r6, r8)     // Catch:{ all -> 0x0687 }
            goto L_0x04d6
        L_0x04d3:
            r0.put(r6, r8)     // Catch:{ all -> 0x0687 }
        L_0x04d6:
            if (r5 == 0) goto L_0x04db
            r1.setContext(r14, r8, r6)     // Catch:{ all -> 0x0687 }
        L_0x04db:
            int r5 = r3.token     // Catch:{ all -> 0x0687 }
            r6 = 13
            if (r5 != r6) goto L_0x04ef
            r6 = 16
            r3.nextToken(r6)     // Catch:{ all -> 0x0687 }
            if (r13 != 0) goto L_0x04ea
            r1.contex = r14     // Catch:{ all -> 0x0687 }
        L_0x04ea:
            if (r13 != 0) goto L_0x04ee
            r1.contex = r14
        L_0x04ee:
            return r0
        L_0x04ef:
            r6 = 16
            if (r5 != r6) goto L_0x04f5
            goto L_0x0432
        L_0x04f5:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r10)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x050b:
            r17 = r11
            r8 = 116(0x74, float:1.63E-43)
            if (r7 != r8) goto L_0x052d
            java.lang.String r5 = r3.text     // Catch:{ all -> 0x0687 }
            java.lang.String r7 = "true"
            int r8 = r3.bp     // Catch:{ all -> 0x0687 }
            boolean r5 = r5.startsWith(r7, r8)     // Catch:{ all -> 0x0687 }
            if (r5 == 0) goto L_0x054a
            int r5 = r3.bp     // Catch:{ all -> 0x0687 }
            int r5 = r5 + 3
            r3.bp = r5     // Catch:{ all -> 0x0687 }
            r3.next()     // Catch:{ all -> 0x0687 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0687 }
            r0.put(r6, r5)     // Catch:{ all -> 0x0687 }
            goto L_0x054a
        L_0x052d:
            r8 = 102(0x66, float:1.43E-43)
            if (r7 != r8) goto L_0x0613
            java.lang.String r7 = r3.text     // Catch:{ all -> 0x0687 }
            java.lang.String r8 = "false"
            int r9 = r3.bp     // Catch:{ all -> 0x0687 }
            boolean r7 = r7.startsWith(r8, r9)     // Catch:{ all -> 0x0687 }
            if (r7 == 0) goto L_0x054a
            int r7 = r3.bp     // Catch:{ all -> 0x0687 }
            int r7 = r7 + r5
            r3.bp = r7     // Catch:{ all -> 0x0687 }
            r3.next()     // Catch:{ all -> 0x0687 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0687 }
            r0.put(r6, r5)     // Catch:{ all -> 0x0687 }
        L_0x054a:
            char r5 = r3.ch     // Catch:{ all -> 0x0687 }
            r6 = 44
            if (r5 == r6) goto L_0x0559
            r6 = 125(0x7d, float:1.75E-43)
            if (r5 == r6) goto L_0x0559
            r3.skipWhitespace()     // Catch:{ all -> 0x0687 }
            char r5 = r3.ch     // Catch:{ all -> 0x0687 }
        L_0x0559:
            r6 = 44
            if (r5 != r6) goto L_0x0578
            int r5 = r3.bp     // Catch:{ all -> 0x0687 }
            r6 = 1
            int r5 = r5 + r6
            r3.bp = r5     // Catch:{ all -> 0x0687 }
            int r6 = r3.len     // Catch:{ all -> 0x0687 }
            if (r5 < r6) goto L_0x056a
            r5 = 26
            goto L_0x0570
        L_0x056a:
            java.lang.String r6 = r3.text     // Catch:{ all -> 0x0687 }
            char r5 = r6.charAt(r5)     // Catch:{ all -> 0x0687 }
        L_0x0570:
            r3.ch = r5     // Catch:{ all -> 0x0687 }
            r5 = 0
            r6 = 16
        L_0x0575:
            r7 = 1
            goto L_0x0641
        L_0x0578:
            r4 = 125(0x7d, float:1.75E-43)
            if (r5 != r4) goto L_0x05fd
            int r4 = r3.bp     // Catch:{ all -> 0x0687 }
            r5 = 1
            int r4 = r4 + r5
            r3.bp = r4     // Catch:{ all -> 0x0687 }
            int r5 = r3.len     // Catch:{ all -> 0x0687 }
            if (r4 < r5) goto L_0x0589
            r4 = 26
            goto L_0x058f
        L_0x0589:
            java.lang.String r5 = r3.text     // Catch:{ all -> 0x0687 }
            char r4 = r5.charAt(r4)     // Catch:{ all -> 0x0687 }
        L_0x058f:
            r3.ch = r4     // Catch:{ all -> 0x0687 }
            r5 = 0
            r3.sp = r5     // Catch:{ all -> 0x0687 }
            r5 = 44
            if (r4 != r5) goto L_0x05b2
            int r4 = r3.bp     // Catch:{ all -> 0x0687 }
            r5 = 1
            int r4 = r4 + r5
            r3.bp = r4     // Catch:{ all -> 0x0687 }
            int r5 = r3.len     // Catch:{ all -> 0x0687 }
            if (r4 < r5) goto L_0x05a5
            r5 = 26
            goto L_0x05ab
        L_0x05a5:
            java.lang.String r5 = r3.text     // Catch:{ all -> 0x0687 }
            char r5 = r5.charAt(r4)     // Catch:{ all -> 0x0687 }
        L_0x05ab:
            r3.ch = r5     // Catch:{ all -> 0x0687 }
            r4 = 16
            r3.token = r4     // Catch:{ all -> 0x0687 }
            goto L_0x05f1
        L_0x05b2:
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 != r5) goto L_0x05d0
            int r4 = r3.bp     // Catch:{ all -> 0x0687 }
            r5 = 1
            int r4 = r4 + r5
            r3.bp = r4     // Catch:{ all -> 0x0687 }
            int r5 = r3.len     // Catch:{ all -> 0x0687 }
            if (r4 < r5) goto L_0x05c3
            r5 = 26
            goto L_0x05c9
        L_0x05c3:
            java.lang.String r5 = r3.text     // Catch:{ all -> 0x0687 }
            char r5 = r5.charAt(r4)     // Catch:{ all -> 0x0687 }
        L_0x05c9:
            r3.ch = r5     // Catch:{ all -> 0x0687 }
            r4 = 13
            r3.token = r4     // Catch:{ all -> 0x0687 }
            goto L_0x05f1
        L_0x05d0:
            r5 = 93
            if (r4 != r5) goto L_0x05ee
            int r4 = r3.bp     // Catch:{ all -> 0x0687 }
            r7 = 1
            int r4 = r4 + r7
            r3.bp = r4     // Catch:{ all -> 0x0687 }
            int r5 = r3.len     // Catch:{ all -> 0x0687 }
            if (r4 < r5) goto L_0x05e1
            r5 = 26
            goto L_0x05e7
        L_0x05e1:
            java.lang.String r5 = r3.text     // Catch:{ all -> 0x0687 }
            char r5 = r5.charAt(r4)     // Catch:{ all -> 0x0687 }
        L_0x05e7:
            r3.ch = r5     // Catch:{ all -> 0x0687 }
            r4 = 15
            r3.token = r4     // Catch:{ all -> 0x0687 }
            goto L_0x05f1
        L_0x05ee:
            r3.nextToken()     // Catch:{ all -> 0x0687 }
        L_0x05f1:
            if (r13 != 0) goto L_0x05f8
            com.alibaba.fastjson.parser.ParseContext r3 = r1.contex     // Catch:{ all -> 0x0687 }
            r1.setContext(r3, r0, r2)     // Catch:{ all -> 0x0687 }
        L_0x05f8:
            if (r13 != 0) goto L_0x05fc
            r1.contex = r14
        L_0x05fc:
            return r0
        L_0x05fd:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r10)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x0613:
            r5 = 0
            r7 = 1
            r3.nextToken()     // Catch:{ all -> 0x0687 }
            java.lang.Object r8 = r18.parse()     // Catch:{ all -> 0x0687 }
            java.lang.Class r9 = r19.getClass()     // Catch:{ all -> 0x0687 }
            java.lang.Class<com.alibaba.fastjson.JSONObject> r11 = com.alibaba.fastjson.JSONObject.class
            if (r9 != r11) goto L_0x0628
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0687 }
        L_0x0628:
            r0.put(r6, r8)     // Catch:{ all -> 0x0687 }
            int r6 = r3.token     // Catch:{ all -> 0x0687 }
            r8 = 13
            if (r6 != r8) goto L_0x063b
            r6 = 16
            r3.nextToken(r6)     // Catch:{ all -> 0x0687 }
            if (r13 != 0) goto L_0x063a
            r1.contex = r14
        L_0x063a:
            return r0
        L_0x063b:
            r6 = 16
            int r8 = r3.token     // Catch:{ all -> 0x0687 }
            if (r8 != r6) goto L_0x0645
        L_0x0641:
            r11 = r17
            goto L_0x0215
        L_0x0645:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r10)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x065b:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r10)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x0671:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0687 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0687 }
            r2.<init>(r10)     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r3.info()     // Catch:{ all -> 0x0687 }
            r2.append(r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0687 }
            r0.<init>(r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x0687:
            r0 = move-exception
            if (r13 != 0) goto L_0x068c
            r1.contex = r14
        L_0x068c:
            goto L_0x068e
        L_0x068d:
            throw r0
        L_0x068e:
            goto L_0x068d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public <T> T parseObject(Class<T> cls) {
        return parseObject((Type) cls, (Object) null);
    }

    public <T> T parseObject(Type type) {
        return parseObject(type, (Object) null);
    }

    public <T> T parseObject(Type type, Object obj) {
        if (this.lexer.token == 8) {
            this.lexer.nextToken();
            return null;
        }
        if (this.lexer.token == 4) {
            if (type == byte[].class) {
                Object bytesValue = this.lexer.bytesValue();
                this.lexer.nextToken();
                return bytesValue;
            } else if (type == char[].class) {
                String stringVal = this.lexer.stringVal();
                this.lexer.nextToken();
                return stringVal.toCharArray();
            }
        }
        try {
            return this.config.getDeserializer(type).deserialze(this, type, obj);
        } catch (JSONException e) {
            throw e;
        } catch (Exception e2) {
            throw new JSONException(e2.getMessage(), e2);
        }
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, (Object) null);
    }

    /* JADX INFO: finally extract failed */
    public void parseArray(Type type, Collection collection, Object obj) {
        ObjectDeserializer objectDeserializer;
        Object obj2;
        if (this.lexer.token == 21 || this.lexer.token == 22) {
            this.lexer.nextToken();
        }
        if (this.lexer.token == 14) {
            if (Integer.TYPE == type) {
                objectDeserializer = IntegerCodec.instance;
                this.lexer.nextToken(2);
            } else if (String.class == type) {
                objectDeserializer = StringCodec.instance;
                this.lexer.nextToken(4);
            } else {
                objectDeserializer = this.config.getDeserializer(type);
                this.lexer.nextToken(12);
            }
            ParseContext parseContext = this.contex;
            if (!this.lexer.disableCircularReferenceDetect) {
                setContext(this.contex, collection, obj);
            }
            int i = 0;
            while (true) {
                try {
                    if (this.lexer.token == 16) {
                        this.lexer.nextToken();
                    } else if (this.lexer.token != 15) {
                        Object obj3 = null;
                        if (Integer.TYPE == type) {
                            collection.add(IntegerCodec.instance.deserialze(this, (Type) null, (Object) null));
                        } else if (String.class == type) {
                            if (this.lexer.token == 4) {
                                obj2 = this.lexer.stringVal();
                                this.lexer.nextToken(16);
                            } else {
                                Object parse = parse();
                                if (parse != null) {
                                    obj3 = parse.toString();
                                }
                                obj2 = obj3;
                            }
                            collection.add(obj2);
                        } else {
                            if (this.lexer.token == 8) {
                                this.lexer.nextToken();
                            } else {
                                obj3 = objectDeserializer.deserialze(this, type, Integer.valueOf(i));
                            }
                            collection.add(obj3);
                            if (this.resolveStatus == 1) {
                                checkListResolve(collection);
                            }
                        }
                        if (this.lexer.token == 16) {
                            this.lexer.nextToken();
                        }
                        i++;
                    } else {
                        this.contex = parseContext;
                        this.lexer.nextToken(16);
                        return;
                    }
                } catch (Throwable th) {
                    this.contex = parseContext;
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("exepct '[', but ");
            sb.append(JSONToken.name(this.lexer.token));
            sb.append(", ");
            sb.append(this.lexer.info());
            throw new JSONException(sb.toString());
        }
    }

    public Object[] parseArray(Type[] typeArr) {
        Object obj;
        boolean z;
        Class<?> cls;
        Type[] typeArr2 = typeArr;
        int i = 8;
        if (this.lexer.token == 8) {
            this.lexer.nextToken(16);
            return null;
        } else if (this.lexer.token == 14) {
            Object[] objArr = new Object[typeArr2.length];
            if (typeArr2.length == 0) {
                this.lexer.nextToken(15);
                if (this.lexer.token == 15) {
                    this.lexer.nextToken(16);
                    return new Object[0];
                }
                StringBuilder sb = new StringBuilder("syntax error, ");
                sb.append(this.lexer.info());
                throw new JSONException(sb.toString());
            }
            this.lexer.nextToken(2);
            int i2 = 0;
            while (i2 < typeArr2.length) {
                if (this.lexer.token == i) {
                    this.lexer.nextToken(16);
                    obj = null;
                } else {
                    Type type = typeArr2[i2];
                    if (type == Integer.TYPE || type == Integer.class) {
                        if (this.lexer.token == 2) {
                            obj = Integer.valueOf(this.lexer.intValue());
                            this.lexer.nextToken(16);
                        } else {
                            obj = TypeUtils.cast(parse(), type, this.config);
                        }
                    } else if (type != String.class) {
                        if (i2 != typeArr2.length - 1 || !(type instanceof Class)) {
                            cls = null;
                            z = false;
                        } else {
                            Class cls2 = (Class) type;
                            z = cls2.isArray();
                            cls = cls2.getComponentType();
                        }
                        if (!z || this.lexer.token == 14) {
                            obj = this.config.getDeserializer(type).deserialze(this, type, (Object) null);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ObjectDeserializer deserializer = this.config.getDeserializer(cls);
                            if (this.lexer.token != 15) {
                                while (true) {
                                    arrayList.add(deserializer.deserialze(this, type, (Object) null));
                                    if (this.lexer.token != 16) {
                                        break;
                                    }
                                    this.lexer.nextToken(12);
                                }
                                if (this.lexer.token != 15) {
                                    StringBuilder sb2 = new StringBuilder("syntax error, ");
                                    sb2.append(this.lexer.info());
                                    throw new JSONException(sb2.toString());
                                }
                            }
                            obj = TypeUtils.cast((Object) arrayList, type, this.config);
                        }
                    } else if (this.lexer.token == 4) {
                        obj = this.lexer.stringVal();
                        this.lexer.nextToken(16);
                    } else {
                        obj = TypeUtils.cast(parse(), type, this.config);
                    }
                }
                objArr[i2] = obj;
                if (this.lexer.token == 15) {
                    break;
                } else if (this.lexer.token == 16) {
                    if (i2 == typeArr2.length - 1) {
                        this.lexer.nextToken(15);
                    } else {
                        this.lexer.nextToken(2);
                    }
                    i2++;
                    i = 8;
                } else {
                    StringBuilder sb3 = new StringBuilder("syntax error, ");
                    sb3.append(this.lexer.info());
                    throw new JSONException(sb3.toString());
                }
            }
            if (this.lexer.token == 15) {
                this.lexer.nextToken(16);
                return objArr;
            }
            StringBuilder sb4 = new StringBuilder("syntax error, ");
            sb4.append(this.lexer.info());
            throw new JSONException(sb4.toString());
        } else {
            StringBuilder sb5 = new StringBuilder("syntax error, ");
            sb5.append(this.lexer.info());
            throw new JSONException(sb5.toString());
        }
    }

    public void parseObject(Object obj) {
        Object obj2;
        Class<?> cls = obj.getClass();
        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        int i = this.lexer.token;
        if (i == 12 || i == 16) {
            while (true) {
                String scanSymbol = this.lexer.scanSymbol(this.symbolTable);
                if (scanSymbol == null) {
                    if (this.lexer.token == 13) {
                        this.lexer.nextToken(16);
                        return;
                    } else if (this.lexer.token == 16) {
                        continue;
                    }
                }
                FieldDeserializer fieldDeserializer = javaBeanDeserializer != null ? javaBeanDeserializer.getFieldDeserializer(scanSymbol) : null;
                if (fieldDeserializer != null) {
                    Class<?> cls2 = fieldDeserializer.fieldInfo.fieldClass;
                    Type type = fieldDeserializer.fieldInfo.fieldType;
                    if (cls2 == Integer.TYPE) {
                        this.lexer.nextTokenWithChar(':');
                        obj2 = IntegerCodec.instance.deserialze(this, type, (Object) null);
                    } else if (cls2 == String.class) {
                        this.lexer.nextTokenWithChar(':');
                        obj2 = parseString();
                    } else if (cls2 == Long.TYPE) {
                        this.lexer.nextTokenWithChar(':');
                        obj2 = IntegerCodec.instance.deserialze(this, type, (Object) null);
                    } else {
                        ObjectDeserializer deserializer2 = this.config.getDeserializer(cls2, type);
                        this.lexer.nextTokenWithChar(':');
                        obj2 = deserializer2.deserialze(this, type, (Object) null);
                    }
                    fieldDeserializer.setValue(obj, obj2);
                    if (this.lexer.token != 16 && this.lexer.token == 13) {
                        this.lexer.nextToken(16);
                        return;
                    }
                } else if ((this.lexer.features & Feature.IgnoreNotMatch.mask) != 0) {
                    this.lexer.nextTokenWithChar(':');
                    parse();
                    if (this.lexer.token == 13) {
                        this.lexer.nextToken();
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("setter not found, class ");
                    sb.append(cls.getName());
                    sb.append(", property ");
                    sb.append(scanSymbol);
                    throw new JSONException(sb.toString());
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder("syntax error, expect {, actual ");
            sb2.append(JSONToken.name(i));
            throw new JSONException(sb2.toString());
        }
    }

    public Object parseArrayWithType(Type type) {
        if (this.lexer.token == 8) {
            this.lexer.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            Type type2 = actualTypeArguments[0];
            if (type2 instanceof Class) {
                ArrayList arrayList = new ArrayList();
                parseArray((Class<?>) (Class) type2, (Collection) arrayList);
                return arrayList;
            } else if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type2;
                Type type3 = wildcardType.getUpperBounds()[0];
                if (!Object.class.equals(type3)) {
                    ArrayList arrayList2 = new ArrayList();
                    parseArray((Class<?>) (Class) type3, (Collection) arrayList2);
                    return arrayList2;
                } else if (wildcardType.getLowerBounds().length == 0) {
                    return parse();
                } else {
                    throw new JSONException("not support type : ".concat(String.valueOf(type)));
                }
            } else {
                if (type2 instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) type2;
                    Type[] bounds = typeVariable.getBounds();
                    if (bounds.length == 1) {
                        Type type4 = bounds[0];
                        if (type4 instanceof Class) {
                            ArrayList arrayList3 = new ArrayList();
                            parseArray((Class<?>) (Class) type4, (Collection) arrayList3);
                            return arrayList3;
                        }
                    } else {
                        throw new JSONException("not support : ".concat(String.valueOf(typeVariable)));
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ArrayList arrayList4 = new ArrayList();
                    parseArray((Type) (ParameterizedType) type2, (Collection) arrayList4);
                    return arrayList4;
                }
                throw new JSONException("TODO : ".concat(String.valueOf(type)));
            }
        } else {
            throw new JSONException("not support type ".concat(String.valueOf(type)));
        }
    }

    /* access modifiers changed from: protected */
    public void checkListResolve(Collection collection) {
        if (collection instanceof List) {
            ResolveTask lastResolveTask = getLastResolveTask();
            lastResolveTask.fieldDeserializer = new ResolveFieldDeserializer(this, (List) collection, collection.size() - 1);
            lastResolveTask.ownerContext = this.contex;
            this.resolveStatus = 0;
            return;
        }
        ResolveTask lastResolveTask2 = getLastResolveTask();
        lastResolveTask2.fieldDeserializer = new ResolveFieldDeserializer(collection);
        lastResolveTask2.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    /* access modifiers changed from: protected */
    public void checkMapResolve(Map map, Object obj) {
        ResolveFieldDeserializer resolveFieldDeserializer = new ResolveFieldDeserializer(map, obj);
        ResolveTask lastResolveTask = getLastResolveTask();
        lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
        lastResolveTask.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    public JSONObject parseObject() {
        return (JSONObject) parseObject((Map) (this.lexer.features & Feature.OrderedField.mask) != 0 ? new JSONObject((Map<String, Object>) new LinkedHashMap()) : new JSONObject(), (Object) null);
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104 A[Catch:{ all -> 0x0278 }] */
    public final void parseArray(java.util.Collection r17, java.lang.Object r18) {
        /*
            r16 = this;
            r1 = r16
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            int r0 = r0.token
            r2 = 21
            if (r0 == r2) goto L_0x000e
            r2 = 22
            if (r0 != r2) goto L_0x0017
        L_0x000e:
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            r0.nextToken()
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            int r0 = r0.token
        L_0x0017:
            r2 = 14
            if (r0 != r2) goto L_0x0281
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            boolean r3 = r0.disableCircularReferenceDetect
            com.alibaba.fastjson.parser.ParseContext r4 = r1.contex
            r0 = r17
            if (r3 != 0) goto L_0x002a
            r5 = r18
            r1.setContext(r4, r0, r5)
        L_0x002a:
            com.alibaba.fastjson.parser.JSONLexer r5 = r1.lexer     // Catch:{ all -> 0x027a }
            char r5 = r5.ch     // Catch:{ all -> 0x027a }
            r6 = 123(0x7b, float:1.72E-43)
            r7 = 93
            r9 = 4
            r10 = 12
            r12 = 34
            r13 = 16
            r14 = 1
            if (r5 == r12) goto L_0x0075
            if (r5 != r7) goto L_0x004d
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer     // Catch:{ all -> 0x027a }
            r0.next()     // Catch:{ all -> 0x027a }
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer     // Catch:{ all -> 0x027a }
            r0.nextToken(r13)     // Catch:{ all -> 0x027a }
            if (r3 != 0) goto L_0x004c
            r1.contex = r4
        L_0x004c:
            return
        L_0x004d:
            if (r5 != r6) goto L_0x006e
            com.alibaba.fastjson.parser.JSONLexer r5 = r1.lexer     // Catch:{ all -> 0x027a }
            int r15 = r5.bp     // Catch:{ all -> 0x027a }
            int r15 = r15 + r14
            r5.bp = r15     // Catch:{ all -> 0x027a }
            com.alibaba.fastjson.parser.JSONLexer r5 = r1.lexer     // Catch:{ all -> 0x027a }
            int r8 = r5.len     // Catch:{ all -> 0x027a }
            if (r15 < r8) goto L_0x005f
            r8 = 26
            goto L_0x0067
        L_0x005f:
            com.alibaba.fastjson.parser.JSONLexer r8 = r1.lexer     // Catch:{ all -> 0x027a }
            java.lang.String r8 = r8.text     // Catch:{ all -> 0x027a }
            char r8 = r8.charAt(r15)     // Catch:{ all -> 0x027a }
        L_0x0067:
            r5.ch = r8     // Catch:{ all -> 0x027a }
            com.alibaba.fastjson.parser.JSONLexer r5 = r1.lexer     // Catch:{ all -> 0x027a }
            r5.token = r10     // Catch:{ all -> 0x027a }
            goto L_0x0073
        L_0x006e:
            com.alibaba.fastjson.parser.JSONLexer r5 = r1.lexer     // Catch:{ all -> 0x027a }
            r5.nextToken(r10)     // Catch:{ all -> 0x027a }
        L_0x0073:
            r5 = 0
            goto L_0x0088
        L_0x0075:
            com.alibaba.fastjson.parser.JSONLexer r5 = r1.lexer     // Catch:{ all -> 0x027a }
            int r5 = r5.features     // Catch:{ all -> 0x027a }
            com.alibaba.fastjson.parser.Feature r8 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat     // Catch:{ all -> 0x027a }
            int r8 = r8.mask     // Catch:{ all -> 0x027a }
            r5 = r5 & r8
            if (r5 != 0) goto L_0x0082
            r5 = 1
            goto L_0x0088
        L_0x0082:
            com.alibaba.fastjson.parser.JSONLexer r5 = r1.lexer     // Catch:{ all -> 0x027a }
            r5.nextToken(r9)     // Catch:{ all -> 0x027a }
            goto L_0x0073
        L_0x0088:
            r8 = r1
            r15 = 0
        L_0x008a:
            if (r5 == 0) goto L_0x00fe
            com.alibaba.fastjson.parser.JSONLexer r6 = r8.lexer     // Catch:{ all -> 0x0278 }
            char r6 = r6.ch     // Catch:{ all -> 0x0278 }
            if (r6 != r12) goto L_0x00fe
            com.alibaba.fastjson.parser.JSONLexer r6 = r8.lexer     // Catch:{ all -> 0x0278 }
            java.lang.String r6 = r6.scanStringValue(r12)     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r11 = r8.lexer     // Catch:{ all -> 0x0278 }
            char r11 = r11.ch     // Catch:{ all -> 0x0278 }
            r2 = 44
            if (r11 != r2) goto L_0x00ce
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r11 = r2.bp     // Catch:{ all -> 0x0278 }
            int r11 = r11 + r14
            r2.bp = r11     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r10 = r2.len     // Catch:{ all -> 0x0278 }
            if (r11 < r10) goto L_0x00b0
            r10 = 26
            goto L_0x00b8
        L_0x00b0:
            com.alibaba.fastjson.parser.JSONLexer r10 = r8.lexer     // Catch:{ all -> 0x0278 }
            java.lang.String r10 = r10.text     // Catch:{ all -> 0x0278 }
            char r10 = r10.charAt(r11)     // Catch:{ all -> 0x0278 }
        L_0x00b8:
            r2.ch = r10     // Catch:{ all -> 0x0278 }
            r0.add(r6)     // Catch:{ all -> 0x0278 }
            int r2 = r8.resolveStatus     // Catch:{ all -> 0x0278 }
            if (r2 != r14) goto L_0x00c4
            r8.checkListResolve(r0)     // Catch:{ all -> 0x0278 }
        L_0x00c4:
            if (r10 == r12) goto L_0x00c9
            r5 = 0
            goto L_0x026c
        L_0x00c9:
            r10 = 0
        L_0x00ca:
            r11 = 123(0x7b, float:1.72E-43)
            goto L_0x0261
        L_0x00ce:
            if (r11 != r7) goto L_0x026c
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r5 = r2.bp     // Catch:{ all -> 0x0278 }
            int r5 = r5 + r14
            r2.bp = r5     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r7 = r2.len     // Catch:{ all -> 0x0278 }
            if (r5 < r7) goto L_0x00e0
            r5 = 26
            goto L_0x00e8
        L_0x00e0:
            com.alibaba.fastjson.parser.JSONLexer r7 = r8.lexer     // Catch:{ all -> 0x0278 }
            java.lang.String r7 = r7.text     // Catch:{ all -> 0x0278 }
            char r5 = r7.charAt(r5)     // Catch:{ all -> 0x0278 }
        L_0x00e8:
            r2.ch = r5     // Catch:{ all -> 0x0278 }
            r0.add(r6)     // Catch:{ all -> 0x0278 }
            int r2 = r8.resolveStatus     // Catch:{ all -> 0x0278 }
            if (r2 != r14) goto L_0x00f4
            r8.checkListResolve(r0)     // Catch:{ all -> 0x0278 }
        L_0x00f4:
            com.alibaba.fastjson.parser.JSONLexer r0 = r8.lexer     // Catch:{ all -> 0x0278 }
            r0.nextToken(r13)     // Catch:{ all -> 0x0278 }
            if (r3 != 0) goto L_0x00fd
            r8.contex = r4
        L_0x00fd:
            return
        L_0x00fe:
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r2 = r2.token     // Catch:{ all -> 0x0278 }
            if (r2 == r13) goto L_0x026c
            r6 = 2
            r10 = 0
            if (r2 == r6) goto L_0x01ed
            r6 = 3
            if (r2 == r6) goto L_0x01cb
            if (r2 == r9) goto L_0x019d
            r6 = 6
            if (r2 == r6) goto L_0x0193
            r6 = 7
            if (r2 == r6) goto L_0x0189
            r6 = 8
            if (r2 == r6) goto L_0x0181
            r6 = 12
            if (r2 == r6) goto L_0x015b
            r6 = 20
            if (r2 == r6) goto L_0x0152
            r6 = 23
            if (r2 == r6) goto L_0x014a
            r6 = 14
            if (r2 == r6) goto L_0x013d
            r10 = 15
            if (r2 == r10) goto L_0x0133
            java.lang.Object r10 = r8.parse()     // Catch:{ all -> 0x0278 }
        L_0x012f:
            r2 = r10
            r10 = 0
            goto L_0x01fb
        L_0x0133:
            com.alibaba.fastjson.parser.JSONLexer r0 = r8.lexer     // Catch:{ all -> 0x0278 }
            r0.nextToken(r13)     // Catch:{ all -> 0x0278 }
            if (r3 != 0) goto L_0x013c
            r8.contex = r4
        L_0x013c:
            return
        L_0x013d:
            com.alibaba.fastjson.JSONArray r10 = new com.alibaba.fastjson.JSONArray     // Catch:{ all -> 0x0278 }
            r10.<init>()     // Catch:{ all -> 0x0278 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0278 }
            r8.parseArray((java.util.Collection) r10, (java.lang.Object) r2)     // Catch:{ all -> 0x0278 }
            goto L_0x012f
        L_0x014a:
            r6 = 14
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.nextToken(r9)     // Catch:{ all -> 0x0278 }
            goto L_0x012f
        L_0x0152:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x0278 }
            java.lang.String r2 = "unclosed jsonArray"
            r0.<init>(r2)     // Catch:{ all -> 0x0278 }
            throw r0     // Catch:{ all -> 0x0278 }
        L_0x015b:
            r6 = 14
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r2 = r2.features     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.Feature r10 = com.alibaba.fastjson.parser.Feature.OrderedField     // Catch:{ all -> 0x0278 }
            int r10 = r10.mask     // Catch:{ all -> 0x0278 }
            r2 = r2 & r10
            if (r2 == 0) goto L_0x0173
            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject     // Catch:{ all -> 0x0278 }
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0278 }
            r10.<init>()     // Catch:{ all -> 0x0278 }
            r2.<init>((java.util.Map<java.lang.String, java.lang.Object>) r10)     // Catch:{ all -> 0x0278 }
            goto L_0x0178
        L_0x0173:
            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject     // Catch:{ all -> 0x0278 }
            r2.<init>()     // Catch:{ all -> 0x0278 }
        L_0x0178:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0278 }
            java.lang.Object r10 = r8.parseObject((java.util.Map) r2, (java.lang.Object) r10)     // Catch:{ all -> 0x0278 }
            goto L_0x012f
        L_0x0181:
            r6 = 14
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.nextToken(r9)     // Catch:{ all -> 0x0278 }
            goto L_0x012f
        L_0x0189:
            r6 = 14
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.nextToken(r13)     // Catch:{ all -> 0x0278 }
            goto L_0x012f
        L_0x0193:
            r6 = 14
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.nextToken(r13)     // Catch:{ all -> 0x0278 }
            goto L_0x012f
        L_0x019d:
            r6 = 14
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            java.lang.String r10 = r2.stringVal()     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.nextToken(r13)     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r2 = r2.features     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.Feature r11 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat     // Catch:{ all -> 0x0278 }
            int r11 = r11.mask     // Catch:{ all -> 0x0278 }
            r2 = r2 & r11
            if (r2 == 0) goto L_0x012f
            com.alibaba.fastjson.parser.JSONLexer r2 = new com.alibaba.fastjson.parser.JSONLexer     // Catch:{ all -> 0x0278 }
            r2.<init>(r10)     // Catch:{ all -> 0x0278 }
            boolean r11 = r2.scanISO8601DateIfMatch(r14)     // Catch:{ all -> 0x0278 }
            if (r11 == 0) goto L_0x01c6
            java.util.Calendar r10 = r2.calendar     // Catch:{ all -> 0x0278 }
            java.util.Date r10 = r10.getTime()     // Catch:{ all -> 0x0278 }
        L_0x01c6:
            r2.close()     // Catch:{ all -> 0x0278 }
            goto L_0x012f
        L_0x01cb:
            r6 = 14
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r2 = r2.features     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.Feature r10 = com.alibaba.fastjson.parser.Feature.UseBigDecimal     // Catch:{ all -> 0x0278 }
            int r10 = r10.mask     // Catch:{ all -> 0x0278 }
            r2 = r2 & r10
            if (r2 == 0) goto L_0x01e0
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            java.lang.Number r2 = r2.decimalValue(r14)     // Catch:{ all -> 0x0278 }
            r10 = 0
            goto L_0x01e7
        L_0x01e0:
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r10 = 0
            java.lang.Number r2 = r2.decimalValue(r10)     // Catch:{ all -> 0x0278 }
        L_0x01e7:
            com.alibaba.fastjson.parser.JSONLexer r11 = r8.lexer     // Catch:{ all -> 0x0278 }
            r11.nextToken(r13)     // Catch:{ all -> 0x0278 }
            goto L_0x01fb
        L_0x01ed:
            r6 = 14
            r10 = 0
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            java.lang.Number r2 = r2.integerValue()     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r11 = r8.lexer     // Catch:{ all -> 0x0278 }
            r11.nextToken(r13)     // Catch:{ all -> 0x0278 }
        L_0x01fb:
            r0.add(r2)     // Catch:{ all -> 0x0278 }
            int r2 = r8.resolveStatus     // Catch:{ all -> 0x0278 }
            if (r2 != r14) goto L_0x0205
            r8.checkListResolve(r0)     // Catch:{ all -> 0x0278 }
        L_0x0205:
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r2 = r2.token     // Catch:{ all -> 0x0278 }
            if (r2 != r13) goto L_0x00ca
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            char r2 = r2.ch     // Catch:{ all -> 0x0278 }
            if (r2 != r12) goto L_0x0220
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r11 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r11 = r11.bp     // Catch:{ all -> 0x0278 }
            r2.pos = r11     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.scanString()     // Catch:{ all -> 0x0278 }
            goto L_0x00ca
        L_0x0220:
            r11 = 48
            if (r2 < r11) goto L_0x0237
            r11 = 57
            if (r2 > r11) goto L_0x0237
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r11 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r11 = r11.bp     // Catch:{ all -> 0x0278 }
            r2.pos = r11     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.scanNumber()     // Catch:{ all -> 0x0278 }
            goto L_0x00ca
        L_0x0237:
            r11 = 123(0x7b, float:1.72E-43)
            if (r2 != r11) goto L_0x025c
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r6 = 12
            r2.token = r6     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r6 = r2.bp     // Catch:{ all -> 0x0278 }
            int r6 = r6 + r14
            r2.bp = r6     // Catch:{ all -> 0x0278 }
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            int r7 = r2.len     // Catch:{ all -> 0x0278 }
            if (r6 < r7) goto L_0x0251
            r6 = 26
            goto L_0x0259
        L_0x0251:
            com.alibaba.fastjson.parser.JSONLexer r7 = r8.lexer     // Catch:{ all -> 0x0278 }
            java.lang.String r7 = r7.text     // Catch:{ all -> 0x0278 }
            char r6 = r7.charAt(r6)     // Catch:{ all -> 0x0278 }
        L_0x0259:
            r2.ch = r6     // Catch:{ all -> 0x0278 }
            goto L_0x0261
        L_0x025c:
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.nextToken()     // Catch:{ all -> 0x0278 }
        L_0x0261:
            int r15 = r15 + r14
            r2 = 14
            r6 = 123(0x7b, float:1.72E-43)
            r7 = 93
            r10 = 12
            goto L_0x008a
        L_0x026c:
            r10 = 0
            r11 = 123(0x7b, float:1.72E-43)
            com.alibaba.fastjson.parser.JSONLexer r2 = r8.lexer     // Catch:{ all -> 0x0278 }
            r2.nextToken()     // Catch:{ all -> 0x0278 }
            r7 = 93
            goto L_0x00fe
        L_0x0278:
            r0 = move-exception
            goto L_0x027c
        L_0x027a:
            r0 = move-exception
            r8 = r1
        L_0x027c:
            if (r3 != 0) goto L_0x0280
            r8.contex = r4
        L_0x0280:
            throw r0
        L_0x0281:
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "syntax error, expect [, actual "
            r3.<init>(r4)
            java.lang.String r0 = com.alibaba.fastjson.parser.JSONToken.name(r0)
            r3.append(r0)
            java.lang.String r0 = ", pos "
            r3.append(r0)
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            int r0 = r0.pos
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            goto L_0x02a7
        L_0x02a6:
            throw r2
        L_0x02a7:
            goto L_0x02a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseArray(java.util.Collection, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public void addResolveTask(ResolveTask resolveTask) {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        this.resolveTaskList.add(resolveTask);
    }

    /* access modifiers changed from: protected */
    public ResolveTask getLastResolveTask() {
        List<ResolveTask> list = this.resolveTaskList;
        return list.get(list.size() - 1);
    }

    public List<ExtraProcessor> getExtraProcessors() {
        if (this.extraProcessors == null) {
            this.extraProcessors = new ArrayList(2);
        }
        return this.extraProcessors;
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
        if (this.extraTypeProviders == null) {
            this.extraTypeProviders = new ArrayList(2);
        }
        return this.extraTypeProviders;
    }

    public void setContext(ParseContext parseContext) {
        if (!this.lexer.disableCircularReferenceDetect) {
            this.contex = parseContext;
        }
    }

    /* access modifiers changed from: protected */
    public void popContext() {
        this.contex = this.contex.parent;
        ParseContext[] parseContextArr = this.contextArray;
        int i = this.contextArrayIndex;
        parseContextArr[i - 1] = null;
        this.contextArrayIndex = i - 1;
    }

    /* access modifiers changed from: protected */
    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        if (this.lexer.disableCircularReferenceDetect) {
            return null;
        }
        this.contex = new ParseContext(parseContext, obj, obj2);
        int i = this.contextArrayIndex;
        this.contextArrayIndex = i + 1;
        ParseContext[] parseContextArr = this.contextArray;
        if (parseContextArr == null) {
            this.contextArray = new ParseContext[8];
        } else if (i >= parseContextArr.length) {
            ParseContext[] parseContextArr2 = new ParseContext[((parseContextArr.length * 3) / 2)];
            System.arraycopy(parseContextArr, 0, parseContextArr2, 0, parseContextArr.length);
            this.contextArray = parseContextArr2;
        }
        ParseContext[] parseContextArr3 = this.contextArray;
        ParseContext parseContext2 = this.contex;
        parseContextArr3[i] = parseContext2;
        return parseContext2;
    }

    public Object parse() {
        return parse((Object) null);
    }

    public Object parse(Object obj) {
        int i = this.lexer.token;
        if (i != 2) {
            boolean z = true;
            if (i == 3) {
                if ((this.lexer.features & Feature.UseBigDecimal.mask) == 0) {
                    z = false;
                }
                Number decimalValue = this.lexer.decimalValue(z);
                this.lexer.nextToken();
                return decimalValue;
            } else if (i == 4) {
                String stringVal = this.lexer.stringVal();
                this.lexer.nextToken(16);
                if ((this.lexer.features & Feature.AllowISO8601DateFormat.mask) != 0) {
                    JSONLexer jSONLexer = new JSONLexer(stringVal);
                    try {
                        if (jSONLexer.scanISO8601DateIfMatch(true)) {
                            return jSONLexer.calendar.getTime();
                        }
                        jSONLexer.close();
                    } finally {
                        jSONLexer.close();
                    }
                }
                return stringVal;
            } else if (i == 12) {
                return parseObject((Map) (this.lexer.features & Feature.OrderedField.mask) != 0 ? new JSONObject((Map<String, Object>) new LinkedHashMap()) : new JSONObject(), obj);
            } else if (i != 14) {
                switch (i) {
                    case 6:
                        this.lexer.nextToken(16);
                        return Boolean.TRUE;
                    case 7:
                        this.lexer.nextToken(16);
                        return Boolean.FALSE;
                    case 8:
                        break;
                    case 9:
                        this.lexer.nextToken(18);
                        if (this.lexer.token == 18) {
                            this.lexer.nextToken(10);
                            accept(10);
                            long longValue = this.lexer.integerValue().longValue();
                            accept(2);
                            accept(11);
                            return new Date(longValue);
                        }
                        StringBuilder sb = new StringBuilder("syntax error, ");
                        sb.append(this.lexer.info());
                        throw new JSONException(sb.toString());
                    default:
                        switch (i) {
                            case 20:
                                if (this.lexer.isBlankInput()) {
                                    return null;
                                }
                                StringBuilder sb2 = new StringBuilder("syntax error, ");
                                sb2.append(this.lexer.info());
                                throw new JSONException(sb2.toString());
                            case 21:
                                this.lexer.nextToken();
                                HashSet hashSet = new HashSet();
                                parseArray((Collection) hashSet, obj);
                                return hashSet;
                            case 22:
                                this.lexer.nextToken();
                                TreeSet treeSet = new TreeSet();
                                parseArray((Collection) treeSet, obj);
                                return treeSet;
                            case 23:
                                break;
                            default:
                                StringBuilder sb3 = new StringBuilder("syntax error, ");
                                sb3.append(this.lexer.info());
                                throw new JSONException(sb3.toString());
                        }
                }
                this.lexer.nextToken();
                return null;
            } else {
                JSONArray jSONArray = new JSONArray();
                parseArray((Collection) jSONArray, obj);
                return jSONArray;
            }
        } else {
            Number integerValue = this.lexer.integerValue();
            this.lexer.nextToken();
            return integerValue;
        }
    }

    public void config(Feature feature, boolean z) {
        this.lexer.config(feature, z);
    }

    public final void accept(int i) {
        if (this.lexer.token == i) {
            this.lexer.nextToken();
            return;
        }
        StringBuilder sb = new StringBuilder("syntax error, expect ");
        sb.append(JSONToken.name(i));
        sb.append(", actual ");
        sb.append(JSONToken.name(this.lexer.token));
        throw new JSONException(sb.toString());
    }

    public void close() {
        try {
            if (this.lexer.token != 20) {
                StringBuilder sb = new StringBuilder("not close json text, token : ");
                sb.append(JSONToken.name(this.lexer.token));
                throw new JSONException(sb.toString());
            }
        } finally {
            this.lexer.close();
        }
    }

    public void handleResovleTask(Object obj) {
        List<ResolveTask> list = this.resolveTaskList;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveTask resolveTask = this.resolveTaskList.get(i);
                FieldDeserializer fieldDeserializer = resolveTask.fieldDeserializer;
                if (fieldDeserializer != null) {
                    Object obj2 = null;
                    Object obj3 = resolveTask.ownerContext != null ? resolveTask.ownerContext.object : null;
                    String access$000 = resolveTask.referenceValue;
                    if (access$000.startsWith("$")) {
                        for (int i2 = 0; i2 < this.contextArrayIndex; i2++) {
                            if (access$000.equals(this.contextArray[i2].toString())) {
                                obj2 = this.contextArray[i2].object;
                            }
                        }
                    } else {
                        obj2 = resolveTask.context.object;
                    }
                    fieldDeserializer.setValue(obj3, obj2);
                }
            }
        }
    }

    public String parseString() {
        int i = this.lexer.token;
        if (i == 4) {
            String stringVal = this.lexer.stringVal();
            char c = this.lexer.ch;
            char c2 = JSONLexer.EOI;
            if (c == ',') {
                JSONLexer jSONLexer = this.lexer;
                int i2 = jSONLexer.bp + 1;
                jSONLexer.bp = i2;
                JSONLexer jSONLexer2 = this.lexer;
                if (i2 < jSONLexer2.len) {
                    c2 = this.lexer.text.charAt(i2);
                }
                jSONLexer2.ch = c2;
                this.lexer.token = 16;
            } else if (this.lexer.ch == ']') {
                JSONLexer jSONLexer3 = this.lexer;
                int i3 = jSONLexer3.bp + 1;
                jSONLexer3.bp = i3;
                JSONLexer jSONLexer4 = this.lexer;
                if (i3 < jSONLexer4.len) {
                    c2 = this.lexer.text.charAt(i3);
                }
                jSONLexer4.ch = c2;
                this.lexer.token = 15;
            } else if (this.lexer.ch == '}') {
                JSONLexer jSONLexer5 = this.lexer;
                int i4 = jSONLexer5.bp + 1;
                jSONLexer5.bp = i4;
                JSONLexer jSONLexer6 = this.lexer;
                if (i4 < jSONLexer6.len) {
                    c2 = this.lexer.text.charAt(i4);
                }
                jSONLexer6.ch = c2;
                this.lexer.token = 13;
            } else {
                this.lexer.nextToken();
            }
            return stringVal;
        } else if (i == 2) {
            String numberString = this.lexer.numberString();
            this.lexer.nextToken(16);
            return numberString;
        } else {
            Object parse = parse();
            if (parse == null) {
                return null;
            }
            return parse.toString();
        }
    }

    public static class ResolveTask {
        /* access modifiers changed from: private */
        public final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        /* access modifiers changed from: private */
        public final String referenceValue;

        public ResolveTask(ParseContext parseContext, String str) {
            this.context = parseContext;
            this.referenceValue = str;
        }
    }
}
