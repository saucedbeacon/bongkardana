package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.data.Source;
import kotlin.text.Typography;
import o.SecureQwertyKeyboard;

final class setInputCharCount extends setUiContext {
    private static final int ConstructorId_charAt = -5;
    private static final int ConstructorId_charCodeAt = -6;
    private static final int ConstructorId_concat = -14;
    private static final int ConstructorId_equalsIgnoreCase = -30;
    private static final int ConstructorId_fromCharCode = -1;
    private static final int ConstructorId_indexOf = -7;
    private static final int ConstructorId_lastIndexOf = -8;
    private static final int ConstructorId_localeCompare = -34;
    private static final int ConstructorId_match = -31;
    private static final int ConstructorId_replace = -33;
    private static final int ConstructorId_search = -32;
    private static final int ConstructorId_slice = -15;
    private static final int ConstructorId_split = -9;
    private static final int ConstructorId_substr = -13;
    private static final int ConstructorId_substring = -10;
    private static final int ConstructorId_toLocaleLowerCase = -35;
    private static final int ConstructorId_toLowerCase = -11;
    private static final int ConstructorId_toUpperCase = -12;
    private static final int Id_anchor = 28;
    private static final int Id_big = 21;
    private static final int Id_blink = 22;
    private static final int Id_bold = 16;
    private static final int Id_charAt = 5;
    private static final int Id_charCodeAt = 6;
    private static final int Id_codePointAt = 45;
    private static final int Id_concat = 14;
    private static final int Id_constructor = 1;
    private static final int Id_endsWith = 42;
    private static final int Id_equals = 29;
    private static final int Id_equalsIgnoreCase = 30;
    private static final int Id_fixed = 18;
    private static final int Id_fontcolor = 26;
    private static final int Id_fontsize = 25;
    private static final int Id_includes = 40;
    private static final int Id_indexOf = 7;
    private static final int Id_italics = 17;
    private static final int Id_lastIndexOf = 8;
    private static final int Id_length = 1;
    private static final int Id_link = 27;
    private static final int Id_localeCompare = 34;
    private static final int Id_match = 31;
    private static final int Id_normalize = 43;
    private static final int Id_repeat = 44;
    private static final int Id_replace = 33;
    private static final int Id_search = 32;
    private static final int Id_slice = 15;
    private static final int Id_small = 20;
    private static final int Id_split = 9;
    private static final int Id_startsWith = 41;
    private static final int Id_strike = 19;
    private static final int Id_sub = 24;
    private static final int Id_substr = 13;
    private static final int Id_substring = 10;
    private static final int Id_sup = 23;
    private static final int Id_toLocaleLowerCase = 35;
    private static final int Id_toLocaleUpperCase = 36;
    private static final int Id_toLowerCase = 11;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_toUpperCase = 12;
    private static final int Id_trim = 37;
    private static final int Id_trimLeft = 38;
    private static final int Id_trimRight = 39;
    private static final int Id_valueOf = 4;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PROTOTYPE_ID = 46;
    private static final Object STRING_TAG = "String";
    private static final int SymbolId_iterator = 46;
    static final long serialVersionUID = 920268368584188687L;
    private CharSequence string;

    public final String getClassName() {
        return "String";
    }

    /* access modifiers changed from: protected */
    public final int getMaxInstanceId() {
        return 1;
    }

    static void init(LogUtils logUtils, boolean z) {
        new setInputCharCount("").exportAsJSClass(46, logUtils, z);
    }

    setInputCharCount(CharSequence charSequence) {
        this.string = charSequence;
    }

    /* access modifiers changed from: protected */
    public final int findInstanceIdInfo(String str) {
        if (str.equals("length")) {
            return instanceIdInfo(7, 1);
        }
        return super.findInstanceIdInfo(str);
    }

    /* access modifiers changed from: protected */
    public final String getInstanceIdName(int i) {
        return i == 1 ? "length" : super.getInstanceIdName(i);
    }

    /* access modifiers changed from: protected */
    public final Object getInstanceIdValue(int i) {
        if (i == 1) {
            return LogItem.getMin(this.string.length());
        }
        return super.getInstanceIdValue(i);
    }

    /* access modifiers changed from: protected */
    public final void fillConstructorProperties(EditTextUtil editTextUtil) {
        EditTextUtil editTextUtil2 = editTextUtil;
        addIdFunctionProperty(editTextUtil2, STRING_TAG, -1, "fromCharCode", 1);
        EditTextUtil editTextUtil3 = editTextUtil;
        addIdFunctionProperty(editTextUtil3, STRING_TAG, -5, "charAt", 2);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, -6, "charCodeAt", 2);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, -7, "indexOf", 2);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, -8, "lastIndexOf", 2);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, -9, Source.SPLIT, 3);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, -10, "substring", 3);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, -11, "toLowerCase", 1);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, -12, "toUpperCase", 1);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, -13, "substr", 3);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, -14, "concat", 2);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, -15, "slice", 3);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, ConstructorId_equalsIgnoreCase, "equalsIgnoreCase", 2);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, ConstructorId_match, "match", 2);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, ConstructorId_search, FirebaseAnalytics.Event.SEARCH, 2);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, ConstructorId_replace, "replace", 2);
        addIdFunctionProperty(editTextUtil2, STRING_TAG, ConstructorId_localeCompare, "localeCompare", 2);
        addIdFunctionProperty(editTextUtil3, STRING_TAG, ConstructorId_toLocaleLowerCase, "toLocaleLowerCase", 1);
        super.fillConstructorProperties(editTextUtil);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        r5 = r1;
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        r5 = r0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bd, code lost:
        r5 = r0;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        initPrototypeMethod(STRING_TAG, r9, r5, (java.lang.String) null, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initPrototypeId(int r9) {
        /*
            r8 = this;
            r0 = 46
            if (r9 != r0) goto L_0x0011
            java.lang.Object r2 = STRING_TAG
            o.F2fpaySwitchFacade r4 = o.F2fpaySwitchFacade.ITERATOR
            r6 = 0
            java.lang.String r5 = "[Symbol.iterator]"
            r1 = r8
            r3 = r9
            r1.initPrototypeMethod((java.lang.Object) r2, (int) r3, (o.record) r4, (java.lang.String) r5, (int) r6)
            return
        L_0x0011:
            r0 = 2
            r1 = 1
            r2 = 0
            switch(r9) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00aa;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00a4;
                case 9: goto L_0x009f;
                case 10: goto L_0x009c;
                case 11: goto L_0x0099;
                case 12: goto L_0x0096;
                case 13: goto L_0x0093;
                case 14: goto L_0x0090;
                case 15: goto L_0x008d;
                case 16: goto L_0x008a;
                case 17: goto L_0x0087;
                case 18: goto L_0x0084;
                case 19: goto L_0x0081;
                case 20: goto L_0x007e;
                case 21: goto L_0x007b;
                case 22: goto L_0x0078;
                case 23: goto L_0x0075;
                case 24: goto L_0x0072;
                case 25: goto L_0x006f;
                case 26: goto L_0x006c;
                case 27: goto L_0x0068;
                case 28: goto L_0x0064;
                case 29: goto L_0x0060;
                case 30: goto L_0x005c;
                case 31: goto L_0x0058;
                case 32: goto L_0x0054;
                case 33: goto L_0x0051;
                case 34: goto L_0x004d;
                case 35: goto L_0x0049;
                case 36: goto L_0x0045;
                case 37: goto L_0x0041;
                case 38: goto L_0x003d;
                case 39: goto L_0x0039;
                case 40: goto L_0x0035;
                case 41: goto L_0x0031;
                case 42: goto L_0x002d;
                case 43: goto L_0x0029;
                case 44: goto L_0x0025;
                case 45: goto L_0x0021;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.<init>(r9)
            throw r0
        L_0x0021:
            java.lang.String r0 = "codePointAt"
            goto L_0x00bd
        L_0x0025:
            java.lang.String r0 = "repeat"
            goto L_0x00bd
        L_0x0029:
            java.lang.String r0 = "normalize"
            goto L_0x00b8
        L_0x002d:
            java.lang.String r0 = "endsWith"
            goto L_0x00bd
        L_0x0031:
            java.lang.String r0 = "startsWith"
            goto L_0x00bd
        L_0x0035:
            java.lang.String r0 = "includes"
            goto L_0x00bd
        L_0x0039:
            java.lang.String r0 = "trimRight"
            goto L_0x00b8
        L_0x003d:
            java.lang.String r0 = "trimLeft"
            goto L_0x00b8
        L_0x0041:
            java.lang.String r0 = "trim"
            goto L_0x00b8
        L_0x0045:
            java.lang.String r0 = "toLocaleUpperCase"
            goto L_0x00b8
        L_0x0049:
            java.lang.String r0 = "toLocaleLowerCase"
            goto L_0x00b8
        L_0x004d:
            java.lang.String r0 = "localeCompare"
            goto L_0x00bd
        L_0x0051:
            java.lang.String r1 = "replace"
            goto L_0x00a1
        L_0x0054:
            java.lang.String r0 = "search"
            goto L_0x00bd
        L_0x0058:
            java.lang.String r0 = "match"
            goto L_0x00bd
        L_0x005c:
            java.lang.String r0 = "equalsIgnoreCase"
            goto L_0x00bd
        L_0x0060:
            java.lang.String r0 = "equals"
            goto L_0x00bd
        L_0x0064:
            java.lang.String r0 = "anchor"
            goto L_0x00b8
        L_0x0068:
            java.lang.String r0 = "link"
            goto L_0x00b8
        L_0x006c:
            java.lang.String r0 = "fontcolor"
            goto L_0x00b8
        L_0x006f:
            java.lang.String r0 = "fontsize"
            goto L_0x00b8
        L_0x0072:
            java.lang.String r0 = "sub"
            goto L_0x00b8
        L_0x0075:
            java.lang.String r0 = "sup"
            goto L_0x00b8
        L_0x0078:
            java.lang.String r0 = "blink"
            goto L_0x00b8
        L_0x007b:
            java.lang.String r0 = "big"
            goto L_0x00b8
        L_0x007e:
            java.lang.String r0 = "small"
            goto L_0x00b8
        L_0x0081:
            java.lang.String r0 = "strike"
            goto L_0x00b8
        L_0x0084:
            java.lang.String r0 = "fixed"
            goto L_0x00b8
        L_0x0087:
            java.lang.String r0 = "italics"
            goto L_0x00b8
        L_0x008a:
            java.lang.String r0 = "bold"
            goto L_0x00b8
        L_0x008d:
            java.lang.String r1 = "slice"
            goto L_0x00a1
        L_0x0090:
            java.lang.String r0 = "concat"
            goto L_0x00bd
        L_0x0093:
            java.lang.String r1 = "substr"
            goto L_0x00a1
        L_0x0096:
            java.lang.String r0 = "toUpperCase"
            goto L_0x00b8
        L_0x0099:
            java.lang.String r0 = "toLowerCase"
            goto L_0x00b8
        L_0x009c:
            java.lang.String r1 = "substring"
            goto L_0x00a1
        L_0x009f:
            java.lang.String r1 = "split"
        L_0x00a1:
            r5 = r1
            r7 = 2
            goto L_0x00bf
        L_0x00a4:
            java.lang.String r0 = "lastIndexOf"
            goto L_0x00bd
        L_0x00a7:
            java.lang.String r0 = "indexOf"
            goto L_0x00bd
        L_0x00aa:
            java.lang.String r0 = "charCodeAt"
            goto L_0x00bd
        L_0x00ad:
            java.lang.String r0 = "charAt"
            goto L_0x00bd
        L_0x00b0:
            java.lang.String r0 = "valueOf"
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r0 = "toSource"
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r0 = "toString"
        L_0x00b8:
            r5 = r0
            r7 = 0
            goto L_0x00bf
        L_0x00bb:
            java.lang.String r0 = "constructor"
        L_0x00bd:
            r5 = r0
            r7 = 1
        L_0x00bf:
            java.lang.Object r3 = STRING_TAG
            r6 = 0
            r2 = r8
            r4 = r9
            r2.initPrototypeMethod((java.lang.Object) r3, (int) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputCharCount.initPrototypeId(int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r8v3, types: [int] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5, types: [int] */
    /* JADX WARNING: type inference failed for: r8v7, types: [int] */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object execIdCall(o.EditTextUtil r17, o.SecureQwertyKeyboard.AnonymousClass1 r18, o.LogUtils r19, o.LogUtils r20, java.lang.Object[] r21) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = STRING_TAG
            boolean r3 = r0.hasTag(r3)
            if (r3 != 0) goto L_0x0013
            java.lang.Object r0 = super.execIdCall(r17, r18, r19, r20, r21)
            return r0
        L_0x0013:
            int r3 = r17.methodId()
            r4 = r20
            r5 = r21
        L_0x001b:
            java.lang.String r6 = ""
            r7 = -1
            r8 = 0
            if (r3 == r7) goto L_0x03c9
            switch(r3) {
                case -35: goto L_0x03a0;
                case -34: goto L_0x03a0;
                case -33: goto L_0x03a0;
                case -32: goto L_0x03a0;
                case -31: goto L_0x03a0;
                case -30: goto L_0x03a0;
                default: goto L_0x0024;
            }
        L_0x0024:
            switch(r3) {
                case -15: goto L_0x03a0;
                case -14: goto L_0x03a0;
                case -13: goto L_0x03a0;
                case -12: goto L_0x03a0;
                case -11: goto L_0x03a0;
                case -10: goto L_0x03a0;
                case -9: goto L_0x03a0;
                case -8: goto L_0x03a0;
                case -7: goto L_0x03a0;
                case -6: goto L_0x03a0;
                case -5: goto L_0x03a0;
                default: goto L_0x0027;
            }
        L_0x0027:
            r10 = 3
            java.lang.String r11 = "a"
            java.lang.String r12 = "font"
            r13 = 0
            java.lang.String r15 = "msg.called.null.or.undefined"
            r9 = 0
            switch(r3) {
                case 1: goto L_0x0373;
                case 2: goto L_0x0363;
                case 3: goto L_0x0341;
                case 4: goto L_0x0363;
                case 5: goto L_0x0313;
                case 6: goto L_0x0313;
                case 7: goto L_0x0305;
                case 8: goto L_0x02f8;
                case 9: goto L_0x02eb;
                case 10: goto L_0x02e2;
                case 11: goto L_0x02d7;
                case 12: goto L_0x02cc;
                case 13: goto L_0x02c3;
                case 14: goto L_0x02ba;
                case 15: goto L_0x02b1;
                case 16: goto L_0x02aa;
                case 17: goto L_0x02a3;
                case 18: goto L_0x029c;
                case 19: goto L_0x0295;
                case 20: goto L_0x028e;
                case 21: goto L_0x0287;
                case 22: goto L_0x0280;
                case 23: goto L_0x0279;
                case 24: goto L_0x0272;
                case 25: goto L_0x026b;
                case 26: goto L_0x0264;
                case 27: goto L_0x025d;
                case 28: goto L_0x0256;
                case 29: goto L_0x023c;
                case 30: goto L_0x023c;
                case 31: goto L_0x021f;
                case 32: goto L_0x021f;
                case 33: goto L_0x021f;
                case 34: goto L_0x01f6;
                case 35: goto L_0x01e1;
                case 36: goto L_0x01cc;
                case 37: goto L_0x018c;
                case 38: goto L_0x0170;
                case 39: goto L_0x0153;
                case 40: goto L_0x00f7;
                case 41: goto L_0x00f7;
                case 42: goto L_0x00f7;
                case 43: goto L_0x008f;
                case 44: goto L_0x008a;
                case 45: goto L_0x0052;
                case 46: goto L_0x004c;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "String.prototype has no method: "
            r2.<init>(r3)
            java.lang.String r0 = r17.getFunctionName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x004c:
            o.setPointView r0 = new o.setPointView
            r0.<init>(r2, r4)
            return r0
        L_0x0052:
            if (r4 == 0) goto L_0x007d
            boolean r1 = o.checkOpen.isUndefined(r4)
            if (r1 != 0) goto L_0x007d
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            double r1 = o.LogItem.length((java.lang.Object[]) r5, (int) r8)
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x007a
            int r3 = r0.length()
            double r3 = (double) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            int r1 = (int) r1
            int r0 = r0.codePointAt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x007a:
            java.lang.Object r0 = o.checkOpen.instance
            return r0
        L_0x007d:
            java.lang.Object r1 = r17.getTag()
            java.lang.String r0 = r17.getFunctionName()
            org.mozilla.javascript.EcmaError r0 = o.LogItem.setMin((java.lang.String) r15, (java.lang.Object) r1, (java.lang.Object) r0)
            throw r0
        L_0x008a:
            java.lang.String r0 = js_repeat(r1, r4, r0, r5)
            return r0
        L_0x008f:
            java.lang.String r1 = o.LogItem.getMin((java.lang.Object[]) r5)
            java.text.Normalizer$Form r2 = java.text.Normalizer.Form.NFD
            java.lang.String r2 = r2.name()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00a2
            java.text.Normalizer$Form r1 = java.text.Normalizer.Form.NFD
            goto L_0x00d9
        L_0x00a2:
            java.text.Normalizer$Form r2 = java.text.Normalizer.Form.NFKC
            java.lang.String r2 = r2.name()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00b1
            java.text.Normalizer$Form r1 = java.text.Normalizer.Form.NFKC
            goto L_0x00d9
        L_0x00b1:
            java.text.Normalizer$Form r2 = java.text.Normalizer.Form.NFKD
            java.lang.String r2 = r2.name()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00c0
            java.text.Normalizer$Form r1 = java.text.Normalizer.Form.NFKD
            goto L_0x00d9
        L_0x00c0:
            java.text.Normalizer$Form r2 = java.text.Normalizer.Form.NFC
            java.lang.String r2 = r2.name()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00d7
            int r1 = r5.length
            if (r1 != 0) goto L_0x00d0
            goto L_0x00d7
        L_0x00d0:
            java.lang.String r0 = "The normalization form should be one of NFC, NFD, NFKC, NFKD"
            org.mozilla.javascript.EcmaError r0 = o.LogItem.toIntRange((java.lang.String) r0)
            throw r0
        L_0x00d7:
            java.text.Normalizer$Form r1 = java.text.Normalizer.Form.NFC
        L_0x00d9:
            if (r4 == 0) goto L_0x00ea
            boolean r2 = o.checkOpen.isUndefined(r4)
            if (r2 != 0) goto L_0x00ea
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            java.lang.String r0 = java.text.Normalizer.normalize(r0, r1)
            return r0
        L_0x00ea:
            java.lang.Object r1 = r17.getTag()
            java.lang.String r0 = r17.getFunctionName()
            org.mozilla.javascript.EcmaError r0 = o.LogItem.setMin((java.lang.String) r15, (java.lang.Object) r1, (java.lang.Object) r0)
            throw r0
        L_0x00f7:
            if (r4 == 0) goto L_0x0146
            boolean r1 = o.checkOpen.isUndefined(r4)
            if (r1 != 0) goto L_0x0146
            java.lang.String r1 = o.LogItem.getMin((java.lang.Object) r4)
            int r2 = r5.length
            if (r2 <= 0) goto L_0x011e
            r2 = r5[r8]
            boolean r2 = r2 instanceof o.BisFaceUploadContent
            if (r2 != 0) goto L_0x010d
            goto L_0x011e
        L_0x010d:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r0 = r17.getFunctionName()
            java.lang.String r2 = "msg.first.arg.not.regexp"
            org.mozilla.javascript.EcmaError r0 = o.LogItem.setMin((java.lang.String) r2, (java.lang.Object) r1, (java.lang.Object) r0)
            throw r0
        L_0x011e:
            int r0 = js_indexOf(r3, r1, r5)
            r1 = 40
            if (r3 != r1) goto L_0x012e
            if (r0 == r7) goto L_0x0129
            r8 = 1
        L_0x0129:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L_0x012e:
            r1 = 41
            if (r3 != r1) goto L_0x013a
            if (r0 != 0) goto L_0x0135
            r8 = 1
        L_0x0135:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L_0x013a:
            r1 = 42
            if (r3 != r1) goto L_0x02f8
            if (r0 == r7) goto L_0x0141
            r8 = 1
        L_0x0141:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L_0x0146:
            java.lang.Object r1 = r17.getTag()
            java.lang.String r0 = r17.getFunctionName()
            org.mozilla.javascript.EcmaError r0 = o.LogItem.setMin((java.lang.String) r15, (java.lang.Object) r1, (java.lang.Object) r0)
            throw r0
        L_0x0153:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            char[] r1 = r0.toCharArray()
            int r2 = r1.length
        L_0x015c:
            if (r2 <= 0) goto L_0x016b
            int r3 = r2 + -1
            char r3 = r1[r3]
            boolean r3 = o.LogItem.length((int) r3)
            if (r3 == 0) goto L_0x016b
            int r2 = r2 + -1
            goto L_0x015c
        L_0x016b:
            java.lang.String r0 = r0.substring(r8, r2)
            return r0
        L_0x0170:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            char[] r1 = r0.toCharArray()
        L_0x0178:
            int r2 = r1.length
            if (r8 >= r2) goto L_0x0186
            char r2 = r1[r8]
            boolean r2 = o.LogItem.length((int) r2)
            if (r2 == 0) goto L_0x0186
            int r8 = r8 + 1
            goto L_0x0178
        L_0x0186:
            int r1 = r1.length
            java.lang.String r0 = r0.substring(r8, r1)
            return r0
        L_0x018c:
            if (r4 == 0) goto L_0x01bf
            boolean r1 = o.checkOpen.isUndefined(r4)
            if (r1 != 0) goto L_0x01bf
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            char[] r1 = r0.toCharArray()
        L_0x019c:
            int r2 = r1.length
            if (r8 >= r2) goto L_0x01aa
            char r2 = r1[r8]
            boolean r2 = o.LogItem.length((int) r2)
            if (r2 == 0) goto L_0x01aa
            int r8 = r8 + 1
            goto L_0x019c
        L_0x01aa:
            int r2 = r1.length
        L_0x01ab:
            if (r2 <= r8) goto L_0x01ba
            int r3 = r2 + -1
            char r3 = r1[r3]
            boolean r3 = o.LogItem.length((int) r3)
            if (r3 == 0) goto L_0x01ba
            int r2 = r2 + -1
            goto L_0x01ab
        L_0x01ba:
            java.lang.String r0 = r0.substring(r8, r2)
            return r0
        L_0x01bf:
            java.lang.Object r1 = r17.getTag()
            java.lang.String r0 = r17.getFunctionName()
            org.mozilla.javascript.EcmaError r0 = o.LogItem.setMin((java.lang.String) r15, (java.lang.Object) r1, (java.lang.Object) r0)
            throw r0
        L_0x01cc:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            java.util.Locale r2 = r1.toDoubleRange
            if (r2 != 0) goto L_0x01da
            java.util.Locale r2 = java.util.Locale.getDefault()
            r1.toDoubleRange = r2
        L_0x01da:
            java.util.Locale r1 = r1.toDoubleRange
            java.lang.String r0 = r0.toUpperCase(r1)
            return r0
        L_0x01e1:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            java.util.Locale r2 = r1.toDoubleRange
            if (r2 != 0) goto L_0x01ef
            java.util.Locale r2 = java.util.Locale.getDefault()
            r1.toDoubleRange = r2
        L_0x01ef:
            java.util.Locale r1 = r1.toDoubleRange
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
        L_0x01f6:
            java.util.Locale r0 = r1.toDoubleRange
            if (r0 != 0) goto L_0x0200
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1.toDoubleRange = r0
        L_0x0200:
            java.util.Locale r0 = r1.toDoubleRange
            java.text.Collator r0 = java.text.Collator.getInstance(r0)
            r0.setStrength(r10)
            r1 = 1
            r0.setDecomposition(r1)
            java.lang.String r1 = o.LogItem.getMin((java.lang.Object) r4)
            java.lang.String r2 = o.LogItem.getMin((java.lang.Object[]) r5)
            int r0 = r0.compare(r1, r2)
            double r0 = (double) r0
            java.lang.Number r0 = o.LogItem.getMax((double) r0)
            return r0
        L_0x021f:
            r0 = 31
            if (r3 != r0) goto L_0x0225
            r10 = 1
            goto L_0x022c
        L_0x0225:
            r0 = 32
            if (r3 != r0) goto L_0x022a
            goto L_0x022c
        L_0x022a:
            r0 = 2
            r10 = 2
        L_0x022c:
            o.addTraceInfo r0 = o.LogItem.equals((o.SecureQwertyKeyboard.AnonymousClass1) r18)
            r1 = r18
            r2 = r19
            r3 = r4
            r4 = r5
            r5 = r10
            java.lang.Object r0 = r0.getMin(r1, r2, r3, r4, r5)
            return r0
        L_0x023c:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            java.lang.String r1 = o.LogItem.getMin((java.lang.Object[]) r5)
            r2 = 29
            if (r3 != r2) goto L_0x024d
            boolean r0 = r0.equals(r1)
            goto L_0x0251
        L_0x024d:
            boolean r0 = r0.equalsIgnoreCase(r1)
        L_0x0251:
            java.lang.Boolean r0 = o.LogItem.getMin((boolean) r0)
            return r0
        L_0x0256:
            java.lang.String r0 = "name"
            java.lang.String r0 = tagify(r4, r11, r0, r5)
            return r0
        L_0x025d:
            java.lang.String r0 = "href"
            java.lang.String r0 = tagify(r4, r11, r0, r5)
            return r0
        L_0x0264:
            java.lang.String r0 = "color"
            java.lang.String r0 = tagify(r4, r12, r0, r5)
            return r0
        L_0x026b:
            java.lang.String r0 = "size"
            java.lang.String r0 = tagify(r4, r12, r0, r5)
            return r0
        L_0x0272:
            java.lang.String r0 = "sub"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x0279:
            java.lang.String r0 = "sup"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x0280:
            java.lang.String r0 = "blink"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x0287:
            java.lang.String r0 = "big"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x028e:
            java.lang.String r0 = "small"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x0295:
            java.lang.String r0 = "strike"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x029c:
            java.lang.String r0 = "tt"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x02a3:
            java.lang.String r0 = "i"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x02aa:
            java.lang.String r0 = "b"
            java.lang.String r0 = tagify(r4, r0, r9, r9)
            return r0
        L_0x02b1:
            java.lang.CharSequence r0 = o.LogItem.setMin((java.lang.Object) r4)
            java.lang.CharSequence r0 = js_slice(r0, r5)
            return r0
        L_0x02ba:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            java.lang.String r0 = js_concat(r0, r5)
            return r0
        L_0x02c3:
            java.lang.CharSequence r0 = o.LogItem.setMin((java.lang.Object) r4)
            java.lang.CharSequence r0 = js_substr(r0, r5)
            return r0
        L_0x02cc:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            java.util.Locale r1 = o.LogItem.Mean$Arithmetic
            java.lang.String r0 = r0.toUpperCase(r1)
            return r0
        L_0x02d7:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            java.util.Locale r1 = o.LogItem.Mean$Arithmetic
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
        L_0x02e2:
            java.lang.CharSequence r0 = o.LogItem.setMin((java.lang.Object) r4)
            java.lang.CharSequence r0 = js_substring(r1, r0, r5)
            return r0
        L_0x02eb:
            o.addTraceInfo r0 = o.LogItem.equals((o.SecureQwertyKeyboard.AnonymousClass1) r18)
            java.lang.String r3 = o.LogItem.getMin((java.lang.Object) r4)
            java.lang.Object r0 = r0.getMax(r1, r2, r3, r5)
            return r0
        L_0x02f8:
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r4)
            int r0 = js_lastIndexOf(r0, r5)
            java.lang.Integer r0 = o.LogItem.getMin((int) r0)
            return r0
        L_0x0305:
            r0 = 7
            java.lang.String r1 = o.LogItem.getMin((java.lang.Object) r4)
            int r0 = js_indexOf(r0, r1, r5)
            java.lang.Integer r0 = o.LogItem.getMin((int) r0)
            return r0
        L_0x0313:
            java.lang.CharSequence r0 = o.LogItem.setMin((java.lang.Object) r4)
            double r1 = o.LogItem.length((java.lang.Object[]) r5, (int) r8)
            r4 = 5
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x033b
            int r5 = r0.length()
            double r7 = (double) r5
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x032a
            goto L_0x033b
        L_0x032a:
            int r1 = (int) r1
            char r0 = r0.charAt(r1)
            if (r3 != r4) goto L_0x0336
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0336:
            java.lang.Integer r0 = o.LogItem.getMin((int) r0)
            return r0
        L_0x033b:
            if (r3 != r4) goto L_0x033e
            return r6
        L_0x033e:
            java.lang.Double r0 = o.LogItem.b
            return r0
        L_0x0341:
            o.setInputCharCount r0 = realThis(r4, r0)
            java.lang.CharSequence r0 = r0.string
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "(new String(\""
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = o.LogItem.setMax((java.lang.String) r0)
            r1.append(r0)
            java.lang.String r0 = "\"))"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0363:
            o.setInputCharCount r0 = realThis(r4, r0)
            java.lang.CharSequence r0 = r0.string
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x036e
            return r0
        L_0x036e:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0373:
            int r0 = r5.length
            if (r0 != 0) goto L_0x0377
            goto L_0x038e
        L_0x0377:
            r0 = r5[r8]
            boolean r0 = o.LogItem.Mean$Arithmetic(r0)
            if (r0 == 0) goto L_0x0388
            if (r4 == 0) goto L_0x0388
            r0 = r5[r8]
            java.lang.String r6 = r0.toString()
            goto L_0x038e
        L_0x0388:
            r0 = r5[r8]
            java.lang.CharSequence r6 = o.LogItem.setMin((java.lang.Object) r0)
        L_0x038e:
            if (r4 != 0) goto L_0x0396
            o.setInputCharCount r0 = new o.setInputCharCount
            r0.<init>(r6)
            return r0
        L_0x0396:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x039b
            return r6
        L_0x039b:
            java.lang.String r0 = r6.toString()
            return r0
        L_0x03a0:
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03be
            r4 = r5[r8]
            java.lang.CharSequence r4 = o.LogItem.setMin((java.lang.Object) r4)
            o.LogUtils r4 = o.LogItem.setMin((o.SecureQwertyKeyboard.AnonymousClass1) r1, (o.LogUtils) r2, (java.lang.Object) r4)
            int r6 = r5.length
            r7 = 1
            int r6 = r6 - r7
            java.lang.Object[] r7 = new java.lang.Object[r6]
        L_0x03b2:
            if (r8 >= r6) goto L_0x03bc
            int r9 = r8 + 1
            r10 = r5[r9]
            r7[r8] = r10
            r8 = r9
            goto L_0x03b2
        L_0x03bc:
            r5 = r7
            goto L_0x03c6
        L_0x03be:
            java.lang.CharSequence r4 = o.LogItem.setMin((java.lang.Object) r4)
            o.LogUtils r4 = o.LogItem.setMin((o.SecureQwertyKeyboard.AnonymousClass1) r1, (o.LogUtils) r2, (java.lang.Object) r4)
        L_0x03c6:
            int r3 = -r3
            goto L_0x001b
        L_0x03c9:
            int r0 = r5.length
            if (r0 > 0) goto L_0x03cd
            return r6
        L_0x03cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
        L_0x03d2:
            if (r8 == r0) goto L_0x03e0
            r2 = r5[r8]
            char r2 = o.LogItem.IsOverlapping((java.lang.Object) r2)
            r1.append(r2)
            int r8 = r8 + 1
            goto L_0x03d2
        L_0x03e0:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputCharCount.execIdCall(o.EditTextUtil, o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, java.lang.Object[]):java.lang.Object");
    }

    private static setInputCharCount realThis(LogUtils logUtils, EditTextUtil editTextUtil) {
        if (logUtils instanceof setInputCharCount) {
            return (setInputCharCount) logUtils;
        }
        throw incompatibleCallError(editTextUtil);
    }

    private static String tagify(Object obj, String str, String str2, Object[] objArr) {
        String min = LogItem.getMin(obj);
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.less);
        sb.append(str);
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
            sb.append("=\"");
            sb.append(LogItem.getMin(objArr));
            sb.append(Typography.quote);
        }
        sb.append(Typography.greater);
        sb.append(min);
        sb.append("</");
        sb.append(str);
        sb.append(Typography.greater);
        return sb.toString();
    }

    public final CharSequence toCharSequence() {
        return this.string;
    }

    public final String toString() {
        CharSequence charSequence = this.string;
        return charSequence instanceof String ? (String) charSequence : charSequence.toString();
    }

    public final Object get(int i, LogUtils logUtils) {
        if (i < 0 || i >= this.string.length()) {
            return super.get(i, logUtils);
        }
        return String.valueOf(this.string.charAt(i));
    }

    public final void put(int i, LogUtils logUtils, Object obj) {
        if (i < 0 || i >= this.string.length()) {
            super.put(i, logUtils, obj);
        }
    }

    public final boolean has(int i, LogUtils logUtils) {
        if (i < 0 || i >= this.string.length()) {
            return super.has(i, logUtils);
        }
        return true;
    }

    public final Object[] getIds(boolean z, boolean z2) {
        SecureQwertyKeyboard.AnonymousClass1 min = SecureQwertyKeyboard.AnonymousClass1.setMin();
        if (min == null || min.IsOverlapping < 200) {
            return super.getIds(z, z2);
        }
        Object[] ids = super.getIds(z, z2);
        Object[] objArr = new Object[(ids.length + this.string.length())];
        int i = 0;
        while (i < this.string.length()) {
            objArr[i] = Integer.valueOf(i);
            i++;
        }
        System.arraycopy(ids, 0, objArr, i, ids.length);
        return objArr;
    }

    private static int js_indexOf(int i, String str, Object[] objArr) {
        String min = LogItem.getMin(objArr);
        double length = LogItem.length(objArr, 1);
        if (length > ((double) str.length()) && i != 41 && i != 42) {
            return -1;
        }
        if (length < 0.0d) {
            length = 0.0d;
        } else if (length > ((double) str.length()) || (i == 42 && (length != length || length > ((double) str.length())))) {
            length = (double) str.length();
        }
        if (42 == i) {
            if (objArr.length == 0 || objArr.length == 1 || (objArr.length == 2 && objArr[1] == checkOpen.instance)) {
                length = (double) str.length();
            }
            if (str.substring(0, (int) length).endsWith(min)) {
                return 0;
            }
            return -1;
        } else if (i != 41) {
            return str.indexOf(min, (int) length);
        } else {
            if (str.startsWith(min, (int) length)) {
                return 0;
            }
            return -1;
        }
    }

    private static int js_lastIndexOf(String str, Object[] objArr) {
        String min = LogItem.getMin(objArr);
        double min2 = LogItem.getMin(objArr, 1);
        if (min2 != min2 || min2 > ((double) str.length())) {
            min2 = (double) str.length();
        } else if (min2 < 0.0d) {
            min2 = 0.0d;
        }
        return str.lastIndexOf(min, (int) min2);
    }

    private static CharSequence js_substring(SecureQwertyKeyboard.AnonymousClass1 r10, CharSequence charSequence, Object[] objArr) {
        int length = charSequence.length();
        double length2 = LogItem.length(objArr, 0);
        double d = 0.0d;
        if (length2 < 0.0d) {
            length2 = 0.0d;
        } else {
            double d2 = (double) length;
            if (length2 > d2) {
                length2 = d2;
            }
        }
        if (objArr.length <= 1 || objArr[1] == checkOpen.instance) {
            d = (double) length;
        } else {
            double length3 = LogItem.length(objArr[1]);
            if (length3 >= 0.0d) {
                d = (double) length;
                if (length3 <= d) {
                    d = length3;
                }
            }
            if (d < length2) {
                if (r10.IsOverlapping != 120) {
                    double d3 = length2;
                    length2 = d;
                    d = d3;
                } else {
                    d = length2;
                }
            }
        }
        return charSequence.subSequence((int) length2, (int) d);
    }

    /* access modifiers changed from: package-private */
    public final int getLength() {
        return this.string.length();
    }

    private static CharSequence js_substr(CharSequence charSequence, Object[] objArr) {
        double d;
        if (objArr.length <= 0) {
            return charSequence;
        }
        double length = LogItem.length(objArr[0]);
        int length2 = charSequence.length();
        double d2 = 0.0d;
        if (length < 0.0d) {
            double d3 = (double) length2;
            Double.isNaN(d3);
            length += d3;
            if (length < 0.0d) {
                length = 0.0d;
            }
        } else {
            double d4 = (double) length2;
            if (length > d4) {
                length = d4;
            }
        }
        if (objArr.length == 1) {
            d = (double) length2;
        } else {
            double length3 = LogItem.length(objArr[1]);
            if (length3 >= 0.0d) {
                d2 = length3;
            }
            double d5 = d2 + length;
            double d6 = (double) length2;
            d = d5 > d6 ? d6 : d5;
        }
        return charSequence.subSequence((int) length, (int) d);
    }

    private static String js_concat(String str, Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return str;
        }
        if (length == 1) {
            return str.concat(LogItem.getMin(objArr[0]));
        }
        int length2 = str.length();
        String[] strArr = new String[length];
        for (int i = 0; i != length; i++) {
            String min = LogItem.getMin(objArr[i]);
            strArr[i] = min;
            length2 += min.length();
        }
        StringBuilder sb = new StringBuilder(length2);
        sb.append(str);
        for (int i2 = 0; i2 != length; i2++) {
            sb.append(strArr[i2]);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r5 < 0.0d) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r5 > r1) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.CharSequence js_slice(java.lang.CharSequence r9, java.lang.Object[] r10) {
        /*
            int r0 = r10.length
            r1 = 0
            if (r0 > 0) goto L_0x0007
            r3 = r1
            goto L_0x000e
        L_0x0007:
            r0 = 0
            r0 = r10[r0]
            double r3 = o.LogItem.length((java.lang.Object) r0)
        L_0x000e:
            int r0 = r9.length()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0021
            double r5 = (double) r0
            java.lang.Double.isNaN(r5)
            double r3 = r3 + r5
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0027
            r3 = r1
            goto L_0x0027
        L_0x0021:
            double r5 = (double) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0027
            r3 = r5
        L_0x0027:
            int r5 = r10.length
            r6 = 2
            if (r5 < r6) goto L_0x0054
            r5 = 1
            r6 = r10[r5]
            java.lang.Object r7 = o.checkOpen.instance
            if (r6 != r7) goto L_0x0033
            goto L_0x0054
        L_0x0033:
            r10 = r10[r5]
            double r5 = o.LogItem.length((java.lang.Object) r10)
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0047
            double r7 = (double) r0
            java.lang.Double.isNaN(r7)
            double r5 = r5 + r7
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x004d
            goto L_0x004e
        L_0x0047:
            double r1 = (double) r0
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r5
        L_0x004e:
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x0055
            r1 = r3
            goto L_0x0055
        L_0x0054:
            double r1 = (double) r0
        L_0x0055:
            int r10 = (int) r3
            int r0 = (int) r1
            java.lang.CharSequence r9 = r9.subSequence(r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputCharCount.js_slice(java.lang.CharSequence, java.lang.Object[]):java.lang.CharSequence");
    }

    /* access modifiers changed from: protected */
    public final int findPrototypeId(record record) {
        return F2fpaySwitchFacade.ITERATOR.equals(record) ? 46 : 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findPrototypeId(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r17.length()
            r2 = 8
            r3 = 85
            r4 = 76
            r5 = 102(0x66, float:1.43E-43)
            r6 = 99
            r7 = 6
            r10 = 100
            r14 = 2
            r15 = 101(0x65, float:1.42E-43)
            r13 = 110(0x6e, float:1.54E-43)
            r8 = 115(0x73, float:1.61E-43)
            r11 = 1
            r12 = 116(0x74, float:1.63E-43)
            r9 = 0
            switch(r1) {
                case 3: goto L_0x01b1;
                case 4: goto L_0x0194;
                case 5: goto L_0x0158;
                case 6: goto L_0x0103;
                case 7: goto L_0x00dd;
                case 8: goto L_0x00a7;
                case 9: goto L_0x0081;
                case 10: goto L_0x006e;
                case 11: goto L_0x0043;
                case 12: goto L_0x0021;
                case 13: goto L_0x003d;
                case 14: goto L_0x0021;
                case 15: goto L_0x0021;
                case 16: goto L_0x0037;
                case 17: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x01f6
        L_0x0023:
            char r1 = r0.charAt(r2)
            if (r1 != r4) goto L_0x002f
            r2 = 35
            java.lang.String r1 = "toLocaleLowerCase"
            goto L_0x01f8
        L_0x002f:
            if (r1 != r3) goto L_0x01f6
            r2 = 36
            java.lang.String r1 = "toLocaleUpperCase"
            goto L_0x01f8
        L_0x0037:
            r2 = 30
            java.lang.String r1 = "equalsIgnoreCase"
            goto L_0x01f8
        L_0x003d:
            r2 = 34
            java.lang.String r1 = "localeCompare"
            goto L_0x01f8
        L_0x0043:
            char r1 = r0.charAt(r14)
            if (r1 == r4) goto L_0x0068
            if (r1 == r3) goto L_0x0062
            if (r1 == r10) goto L_0x005c
            if (r1 == r13) goto L_0x0057
            if (r1 == r8) goto L_0x0053
            goto L_0x01f6
        L_0x0053:
            java.lang.String r1 = "lastIndexOf"
            goto L_0x01f8
        L_0x0057:
            java.lang.String r1 = "constructor"
            r2 = 1
            goto L_0x01f8
        L_0x005c:
            r2 = 45
            java.lang.String r1 = "codePointAt"
            goto L_0x01f8
        L_0x0062:
            r2 = 12
            java.lang.String r1 = "toUpperCase"
            goto L_0x01f8
        L_0x0068:
            r2 = 11
            java.lang.String r1 = "toLowerCase"
            goto L_0x01f8
        L_0x006e:
            char r1 = r0.charAt(r9)
            if (r1 != r6) goto L_0x0079
            java.lang.String r1 = "charCodeAt"
            r2 = 6
            goto L_0x01f8
        L_0x0079:
            if (r1 != r8) goto L_0x01f6
            r2 = 41
            java.lang.String r1 = "startsWith"
            goto L_0x01f8
        L_0x0081:
            char r1 = r0.charAt(r9)
            if (r1 == r5) goto L_0x00a1
            if (r1 == r13) goto L_0x009b
            if (r1 == r8) goto L_0x0095
            if (r1 == r12) goto L_0x008f
            goto L_0x01f6
        L_0x008f:
            r2 = 39
            java.lang.String r1 = "trimRight"
            goto L_0x01f8
        L_0x0095:
            r2 = 10
            java.lang.String r1 = "substring"
            goto L_0x01f8
        L_0x009b:
            r2 = 43
            java.lang.String r1 = "normalize"
            goto L_0x01f8
        L_0x00a1:
            r2 = 26
            java.lang.String r1 = "fontcolor"
            goto L_0x01f8
        L_0x00a7:
            char r1 = r0.charAt(r7)
            if (r1 == r6) goto L_0x00d8
            if (r1 == r13) goto L_0x00d3
            if (r1 == r12) goto L_0x00cd
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x00c7
            if (r1 == r15) goto L_0x00c1
            if (r1 == r5) goto L_0x00bb
            goto L_0x01f6
        L_0x00bb:
            r2 = 38
            java.lang.String r1 = "trimLeft"
            goto L_0x01f8
        L_0x00c1:
            r2 = 40
            java.lang.String r1 = "includes"
            goto L_0x01f8
        L_0x00c7:
            r2 = 25
            java.lang.String r1 = "fontsize"
            goto L_0x01f8
        L_0x00cd:
            r2 = 42
            java.lang.String r1 = "endsWith"
            goto L_0x01f8
        L_0x00d3:
            java.lang.String r1 = "toString"
            r2 = 2
            goto L_0x01f8
        L_0x00d8:
            r2 = 3
            java.lang.String r1 = "toSource"
            goto L_0x01f8
        L_0x00dd:
            char r1 = r0.charAt(r11)
            r2 = 97
            if (r1 == r2) goto L_0x00fe
            if (r1 == r15) goto L_0x00f8
            if (r1 == r13) goto L_0x00f3
            if (r1 == r12) goto L_0x00ed
            goto L_0x01f6
        L_0x00ed:
            r2 = 17
            java.lang.String r1 = "italics"
            goto L_0x01f8
        L_0x00f3:
            r2 = 7
            java.lang.String r1 = "indexOf"
            goto L_0x01f8
        L_0x00f8:
            r2 = 33
            java.lang.String r1 = "replace"
            goto L_0x01f8
        L_0x00fe:
            java.lang.String r1 = "valueOf"
            r2 = 4
            goto L_0x01f8
        L_0x0103:
            char r1 = r0.charAt(r11)
            if (r1 == r15) goto L_0x0142
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L_0x013d
            r2 = 113(0x71, float:1.58E-43)
            if (r1 == r2) goto L_0x0137
            if (r1 == r13) goto L_0x0131
            r2 = 111(0x6f, float:1.56E-43)
            if (r1 == r2) goto L_0x012b
            if (r1 == r12) goto L_0x0125
            r2 = 117(0x75, float:1.64E-43)
            if (r1 == r2) goto L_0x011f
            goto L_0x01f6
        L_0x011f:
            r2 = 13
            java.lang.String r1 = "substr"
            goto L_0x01f8
        L_0x0125:
            r2 = 19
            java.lang.String r1 = "strike"
            goto L_0x01f8
        L_0x012b:
            r2 = 14
            java.lang.String r1 = "concat"
            goto L_0x01f8
        L_0x0131:
            r2 = 28
            java.lang.String r1 = "anchor"
            goto L_0x01f8
        L_0x0137:
            r2 = 29
            java.lang.String r1 = "equals"
            goto L_0x01f8
        L_0x013d:
            r2 = 5
            java.lang.String r1 = "charAt"
            goto L_0x01f8
        L_0x0142:
            char r1 = r0.charAt(r9)
            r2 = 114(0x72, float:1.6E-43)
            if (r1 != r2) goto L_0x0150
            r2 = 44
            java.lang.String r1 = "repeat"
            goto L_0x01f8
        L_0x0150:
            if (r1 != r8) goto L_0x01f6
            r2 = 32
            java.lang.String r1 = "search"
            goto L_0x01f8
        L_0x0158:
            r1 = 4
            char r1 = r0.charAt(r1)
            if (r1 == r10) goto L_0x018f
            if (r1 == r15) goto L_0x0189
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L_0x0183
            if (r1 == r12) goto L_0x017d
            r2 = 107(0x6b, float:1.5E-43)
            if (r1 == r2) goto L_0x0177
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 == r2) goto L_0x0171
            goto L_0x01f6
        L_0x0171:
            r2 = 20
            java.lang.String r1 = "small"
            goto L_0x01f8
        L_0x0177:
            r2 = 22
            java.lang.String r1 = "blink"
            goto L_0x01f8
        L_0x017d:
            r2 = 9
            java.lang.String r1 = "split"
            goto L_0x01f8
        L_0x0183:
            r2 = 31
            java.lang.String r1 = "match"
            goto L_0x01f8
        L_0x0189:
            r2 = 15
            java.lang.String r1 = "slice"
            goto L_0x01f8
        L_0x018f:
            r2 = 18
            java.lang.String r1 = "fixed"
            goto L_0x01f8
        L_0x0194:
            char r1 = r0.charAt(r9)
            r2 = 98
            if (r1 != r2) goto L_0x01a1
            r2 = 16
            java.lang.String r1 = "bold"
            goto L_0x01f8
        L_0x01a1:
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L_0x01aa
            r2 = 27
            java.lang.String r1 = "link"
            goto L_0x01f8
        L_0x01aa:
            if (r1 != r12) goto L_0x01f6
            r2 = 37
            java.lang.String r1 = "trim"
            goto L_0x01f8
        L_0x01b1:
            char r1 = r0.charAt(r14)
            r2 = 98
            if (r1 != r2) goto L_0x01ca
            char r1 = r0.charAt(r9)
            if (r1 != r8) goto L_0x01f6
            char r1 = r0.charAt(r11)
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L_0x01f6
            r9 = 24
            goto L_0x0204
        L_0x01ca:
            r2 = 103(0x67, float:1.44E-43)
            if (r1 != r2) goto L_0x01e1
            char r1 = r0.charAt(r9)
            r2 = 98
            if (r1 != r2) goto L_0x01f6
            char r1 = r0.charAt(r11)
            r2 = 105(0x69, float:1.47E-43)
            if (r1 != r2) goto L_0x01f6
            r9 = 21
            goto L_0x0204
        L_0x01e1:
            r2 = 112(0x70, float:1.57E-43)
            if (r1 != r2) goto L_0x01f6
            char r1 = r0.charAt(r9)
            if (r1 != r8) goto L_0x01f6
            char r1 = r0.charAt(r11)
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L_0x01f6
            r9 = 23
            goto L_0x0204
        L_0x01f6:
            r1 = 0
            r2 = 0
        L_0x01f8:
            if (r1 == 0) goto L_0x0203
            if (r1 == r0) goto L_0x0203
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r9 = r2
        L_0x0204:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputCharCount.findPrototypeId(java.lang.String):int");
    }

    private static String js_repeat(SecureQwertyKeyboard.AnonymousClass1 r5, LogUtils logUtils, EditTextUtil editTextUtil, Object[] objArr) {
        if (logUtils == null || checkOpen.isUndefined(logUtils)) {
            throw LogItem.setMin("msg.called.null.or.undefined", editTextUtil.getTag(), (Object) editTextUtil.getFunctionName());
        }
        String min = LogItem.getMin((Object) logUtils);
        double length = LogItem.length(objArr, 0);
        if (length < 0.0d || length == Double.POSITIVE_INFINITY) {
            throw LogItem.toIntRange("Invalid count value");
        } else if (length == 0.0d || min.length() == 0) {
            return "";
        } else {
            long length2 = ((long) min.length()) * ((long) length);
            if (length > 2.147483647E9d || length2 > 2147483647L) {
                throw LogItem.toIntRange("Invalid size or count value");
            }
            StringBuilder sb = new StringBuilder((int) length2);
            sb.append(min);
            int i = 1;
            int i2 = (int) length;
            while (i <= i2 / 2) {
                sb.append(sb);
                i *= 2;
            }
            if (i < i2) {
                sb.append(sb.substring(0, min.length() * (i2 - i)));
            }
            return sb.toString();
        }
    }
}
