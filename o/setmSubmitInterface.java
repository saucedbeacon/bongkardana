package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.SecureQwertyKeyboard;

public class setmSubmitInterface extends setUiContext implements Map {
    private static final int ConstructorId_assign = -15;
    private static final int ConstructorId_create = -9;
    private static final int ConstructorId_defineProperties = -8;
    private static final int ConstructorId_defineProperty = -5;
    private static final int ConstructorId_freeze = -13;
    private static final int ConstructorId_getOwnPropertyDescriptor = -4;
    private static final int ConstructorId_getOwnPropertyNames = -3;
    private static final int ConstructorId_getOwnPropertySymbols = -14;
    private static final int ConstructorId_getPrototypeOf = -1;
    private static final int ConstructorId_is = -16;
    private static final int ConstructorId_isExtensible = -6;
    private static final int ConstructorId_isFrozen = -11;
    private static final int ConstructorId_isSealed = -10;
    private static final int ConstructorId_keys = -2;
    private static final int ConstructorId_preventExtensions = -7;
    private static final int ConstructorId_seal = -12;
    private static final int Id___defineGetter__ = 9;
    private static final int Id___defineSetter__ = 10;
    private static final int Id___lookupGetter__ = 11;
    private static final int Id___lookupSetter__ = 12;
    private static final int Id_constructor = 1;
    private static final int Id_hasOwnProperty = 5;
    private static final int Id_isPrototypeOf = 7;
    private static final int Id_propertyIsEnumerable = 6;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 8;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 12;
    private static final Object OBJECT_TAG = "Object";
    static final long serialVersionUID = -6345305608474346996L;

    public String getClassName() {
        return "Object";
    }

    static void init(LogUtils logUtils, boolean z) {
        new setmSubmitInterface().exportAsJSClass(12, logUtils, z);
    }

    public String toString() {
        return LogItem.getMin((LogUtils) this);
    }

    /* access modifiers changed from: protected */
    public void fillConstructorProperties(EditTextUtil editTextUtil) {
        EditTextUtil editTextUtil2 = editTextUtil;
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -1, "getPrototypeOf", 1);
        EditTextUtil editTextUtil3 = editTextUtil;
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, -2, "keys", 1);
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -3, "getOwnPropertyNames", 1);
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, -14, "getOwnPropertySymbols", 1);
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -4, "getOwnPropertyDescriptor", 2);
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, -5, "defineProperty", 3);
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -6, "isExtensible", 1);
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, -7, "preventExtensions", 1);
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -8, "defineProperties", 2);
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, -9, "create", 2);
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -10, "isSealed", 1);
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, -11, "isFrozen", 1);
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -12, "seal", 1);
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, -13, "freeze", 1);
        addIdFunctionProperty(editTextUtil2, OBJECT_TAG, -15, "assign", 2);
        addIdFunctionProperty(editTextUtil3, OBJECT_TAG, ConstructorId_is, "is", 2);
        super.fillConstructorProperties(editTextUtil);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        initPrototypeMethod(OBJECT_TAG, r4, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r1;
        r2 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initPrototypeId(int r4) {
        /*
            r3 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            switch(r4) {
                case 1: goto L_0x0034;
                case 2: goto L_0x0030;
                case 3: goto L_0x002d;
                case 4: goto L_0x002a;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                case 7: goto L_0x0021;
                case 8: goto L_0x001e;
                case 9: goto L_0x0019;
                case 10: goto L_0x0016;
                case 11: goto L_0x0013;
                case 12: goto L_0x0010;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.<init>(r4)
            throw r0
        L_0x0010:
            java.lang.String r0 = "__lookupSetter__"
            goto L_0x0036
        L_0x0013:
            java.lang.String r0 = "__lookupGetter__"
            goto L_0x0036
        L_0x0016:
            java.lang.String r1 = "__defineSetter__"
            goto L_0x001b
        L_0x0019:
            java.lang.String r1 = "__defineGetter__"
        L_0x001b:
            r0 = r1
            r2 = 2
            goto L_0x0036
        L_0x001e:
            java.lang.String r0 = "toSource"
            goto L_0x0032
        L_0x0021:
            java.lang.String r0 = "isPrototypeOf"
            goto L_0x0036
        L_0x0024:
            java.lang.String r0 = "propertyIsEnumerable"
            goto L_0x0036
        L_0x0027:
            java.lang.String r0 = "hasOwnProperty"
            goto L_0x0036
        L_0x002a:
            java.lang.String r0 = "valueOf"
            goto L_0x0032
        L_0x002d:
            java.lang.String r0 = "toLocaleString"
            goto L_0x0032
        L_0x0030:
            java.lang.String r0 = "toString"
        L_0x0032:
            r2 = 0
            goto L_0x0036
        L_0x0034:
            java.lang.String r0 = "constructor"
        L_0x0036:
            java.lang.Object r1 = OBJECT_TAG
            r3.initPrototypeMethod(r1, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setmSubmitInterface.initPrototypeId(int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [int] */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r5v5, types: [int] */
    /* JADX WARNING: type inference failed for: r5v7, types: [int] */
    /* JADX WARNING: type inference failed for: r5v9, types: [int] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0138, code lost:
        if ((((org.mozilla.javascript.ScriptableObject) r12).getAttributes(r9) & 2) == 0) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00fb, code lost:
        if ((((org.mozilla.javascript.ScriptableObject) r12).getAttributes(r9) & 2) == 0) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object execIdCall(o.EditTextUtil r9, o.SecureQwertyKeyboard.AnonymousClass1 r10, o.LogUtils r11, o.LogUtils r12, java.lang.Object[] r13) {
        /*
            r8 = this;
            java.lang.Object r0 = OBJECT_TAG
            boolean r0 = r9.hasTag(r0)
            if (r0 != 0) goto L_0x000d
            java.lang.Object r9 = super.execIdCall(r9, r10, r11, r12, r13)
            return r9
        L_0x000d:
            int r0 = r9.methodId()
            java.lang.String r1 = "writable"
            java.lang.String r2 = "configurable"
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r0) {
                case -16: goto L_0x04aa;
                case -15: goto L_0x0443;
                case -14: goto L_0x0410;
                case -13: goto L_0x03c4;
                case -12: goto L_0x038f;
                case -11: goto L_0x0343;
                case -10: goto L_0x030c;
                case -9: goto L_0x02d2;
                case -8: goto L_0x02ae;
                case -7: goto L_0x029e;
                case -6: goto L_0x0289;
                case -5: goto L_0x0264;
                case -4: goto L_0x0243;
                case -3: goto L_0x021c;
                case -2: goto L_0x01f9;
                case -1: goto L_0x01e8;
                case 0: goto L_0x001b;
                case 1: goto L_0x01c6;
                case 2: goto L_0x019a;
                case 3: goto L_0x0182;
                case 4: goto L_0x0181;
                case 5: goto L_0x0152;
                case 6: goto L_0x00d9;
                case 7: goto L_0x00bd;
                case 8: goto L_0x00b8;
                case 9: goto L_0x005f;
                case 10: goto L_0x005f;
                case 11: goto L_0x0025;
                case 12: goto L_0x0025;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r0)
            r9.<init>(r10)
            throw r9
        L_0x0025:
            int r9 = r13.length
            if (r9 <= 0) goto L_0x005c
            boolean r9 = r12 instanceof org.mozilla.javascript.ScriptableObject
            if (r9 != 0) goto L_0x002d
            goto L_0x005c
        L_0x002d:
            org.mozilla.javascript.ScriptableObject r12 = (org.mozilla.javascript.ScriptableObject) r12
            r9 = r13[r5]
            java.lang.String r9 = o.LogItem.setMax((o.SecureQwertyKeyboard.AnonymousClass1) r10, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0039
            r10 = 0
            goto L_0x003d
        L_0x0039:
            int r10 = o.LogItem.toIntRange((o.SecureQwertyKeyboard.AnonymousClass1) r10)
        L_0x003d:
            r11 = 12
            if (r0 != r11) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            java.lang.Object r11 = r12.getGetterOrSetter(r9, r10, r4)
            if (r11 != 0) goto L_0x0056
            o.LogUtils r12 = r12.getPrototype()
            if (r12 == 0) goto L_0x0056
            boolean r13 = r12 instanceof org.mozilla.javascript.ScriptableObject
            if (r13 == 0) goto L_0x0056
            org.mozilla.javascript.ScriptableObject r12 = (org.mozilla.javascript.ScriptableObject) r12
            goto L_0x0043
        L_0x0056:
            if (r11 == 0) goto L_0x0059
            return r11
        L_0x0059:
            java.lang.Object r9 = o.checkOpen.instance
            return r9
        L_0x005c:
            java.lang.Object r9 = o.checkOpen.instance
            return r9
        L_0x005f:
            int r9 = r13.length
            if (r9 < r3) goto L_0x00ab
            r9 = r13[r4]
            boolean r9 = r9 instanceof o.announceSwitchKeyboard
            if (r9 != 0) goto L_0x0069
            goto L_0x00ab
        L_0x0069:
            boolean r9 = r12 instanceof org.mozilla.javascript.ScriptableObject
            if (r9 == 0) goto L_0x0096
            org.mozilla.javascript.ScriptableObject r12 = (org.mozilla.javascript.ScriptableObject) r12
            r9 = r13[r5]
            java.lang.String r9 = o.LogItem.setMax((o.SecureQwertyKeyboard.AnonymousClass1) r10, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0079
            r10 = 0
            goto L_0x007d
        L_0x0079:
            int r10 = o.LogItem.toIntRange((o.SecureQwertyKeyboard.AnonymousClass1) r10)
        L_0x007d:
            r11 = r13[r4]
            o.announceSwitchKeyboard r11 = (o.announceSwitchKeyboard) r11
            r13 = 10
            if (r0 != r13) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            r12.setGetterOrSetter(r9, r10, r11, r4)
            boolean r9 = r12 instanceof o.getResourceDeclareStyleableIntArray
            if (r9 == 0) goto L_0x0093
            o.getResourceDeclareStyleableIntArray r12 = (o.getResourceDeclareStyleableIntArray) r12
            r12.setDenseOnly(r5)
        L_0x0093:
            java.lang.Object r9 = o.checkOpen.instance
            return r9
        L_0x0096:
            java.lang.Class r9 = r12.getClass()
            java.lang.String r9 = r9.getName()
            r10 = r13[r5]
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "msg.extend.scriptable"
            org.mozilla.javascript.EvaluatorException r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r11, (java.lang.Object) r9, (java.lang.Object) r10)
            throw r9
        L_0x00ab:
            int r9 = r13.length
            if (r9 < r3) goto L_0x00b1
            r9 = r13[r4]
            goto L_0x00b3
        L_0x00b1:
            java.lang.Object r9 = o.checkOpen.instance
        L_0x00b3:
            java.lang.RuntimeException r9 = o.LogItem.toString(r9)
            throw r9
        L_0x00b8:
            java.lang.String r9 = o.LogItem.getMin((o.SecureQwertyKeyboard.AnonymousClass1) r10, (o.LogUtils) r11, (o.LogUtils) r12)
            return r9
        L_0x00bd:
            int r9 = r13.length
            if (r9 == 0) goto L_0x00d3
            r9 = r13[r5]
            boolean r9 = r9 instanceof o.LogUtils
            if (r9 == 0) goto L_0x00d3
            r9 = r13[r5]
            o.LogUtils r9 = (o.LogUtils) r9
        L_0x00ca:
            o.LogUtils r9 = r9.getPrototype()
            if (r9 != r12) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            if (r9 != 0) goto L_0x00ca
        L_0x00d3:
            r4 = 0
        L_0x00d4:
            java.lang.Boolean r9 = o.LogItem.getMin((boolean) r4)
            return r9
        L_0x00d9:
            int r9 = r13.length
            if (r9 > 0) goto L_0x00df
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x00e1
        L_0x00df:
            r9 = r13[r5]
        L_0x00e1:
            boolean r11 = r9 instanceof o.record
            if (r11 == 0) goto L_0x0103
            r10 = r12
            o.tick r10 = (o.tick) r10
            o.record r9 = (o.record) r9
            boolean r10 = r10.has(r9, r12)
            if (r10 == 0) goto L_0x0101
            boolean r11 = r12 instanceof org.mozilla.javascript.ScriptableObject
            if (r11 == 0) goto L_0x0101
            org.mozilla.javascript.ScriptableObject r12 = (org.mozilla.javascript.ScriptableObject) r12
            int r9 = r12.getAttributes((o.record) r9)
            r9 = r9 & r3
            if (r9 != 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r4 = 0
        L_0x00ff:
            r5 = r4
            goto L_0x014c
        L_0x0101:
            r5 = r10
            goto L_0x014c
        L_0x0103:
            java.lang.String r9 = o.LogItem.setMax((o.SecureQwertyKeyboard.AnonymousClass1) r10, (java.lang.Object) r9)
            if (r9 != 0) goto L_0x0127
            int r10 = o.LogItem.toIntRange((o.SecureQwertyKeyboard.AnonymousClass1) r10)     // Catch:{ EvaluatorException -> 0x013b }
            boolean r11 = r12.has((int) r10, (o.LogUtils) r12)     // Catch:{ EvaluatorException -> 0x013b }
            java.lang.String r9 = java.lang.Integer.toString(r10)     // Catch:{ EvaluatorException -> 0x013b }
            if (r11 == 0) goto L_0x0125
            boolean r13 = r12 instanceof org.mozilla.javascript.ScriptableObject     // Catch:{ EvaluatorException -> 0x013b }
            if (r13 == 0) goto L_0x0125
            org.mozilla.javascript.ScriptableObject r12 = (org.mozilla.javascript.ScriptableObject) r12     // Catch:{ EvaluatorException -> 0x013b }
            int r9 = r12.getAttributes((int) r10)     // Catch:{ EvaluatorException -> 0x013b }
            r9 = r9 & r3
            if (r9 != 0) goto L_0x00fe
            goto L_0x00ff
        L_0x0125:
            r5 = r11
            goto L_0x014c
        L_0x0127:
            boolean r10 = r12.has((java.lang.String) r9, (o.LogUtils) r12)     // Catch:{ EvaluatorException -> 0x013b }
            if (r10 == 0) goto L_0x0101
            boolean r11 = r12 instanceof org.mozilla.javascript.ScriptableObject     // Catch:{ EvaluatorException -> 0x013b }
            if (r11 == 0) goto L_0x0101
            org.mozilla.javascript.ScriptableObject r12 = (org.mozilla.javascript.ScriptableObject) r12     // Catch:{ EvaluatorException -> 0x013b }
            int r9 = r12.getAttributes((java.lang.String) r9)     // Catch:{ EvaluatorException -> 0x013b }
            r9 = r9 & r3
            if (r9 != 0) goto L_0x00fe
            goto L_0x00ff
        L_0x013b:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            java.lang.String r12 = "msg.prop.not.found"
            java.lang.String r9 = o.LogItem.getMin((java.lang.String) r12, (java.lang.Object) r9)
            boolean r9 = r11.startsWith(r9)
            if (r9 == 0) goto L_0x0151
        L_0x014c:
            java.lang.Boolean r9 = o.LogItem.getMin((boolean) r5)
            return r9
        L_0x0151:
            throw r10
        L_0x0152:
            int r9 = r13.length
            if (r9 > 0) goto L_0x0158
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x015a
        L_0x0158:
            r9 = r13[r5]
        L_0x015a:
            boolean r11 = r9 instanceof o.record
            if (r11 == 0) goto L_0x0169
            o.tick r10 = ensureSymbolScriptable(r12)
            o.record r9 = (o.record) r9
            boolean r9 = r10.has(r9, r12)
            goto L_0x017c
        L_0x0169:
            java.lang.String r9 = o.LogItem.setMax((o.SecureQwertyKeyboard.AnonymousClass1) r10, (java.lang.Object) r9)
            if (r9 != 0) goto L_0x0178
            int r9 = o.LogItem.toIntRange((o.SecureQwertyKeyboard.AnonymousClass1) r10)
            boolean r9 = r12.has((int) r9, (o.LogUtils) r12)
            goto L_0x017c
        L_0x0178:
            boolean r9 = r12.has((java.lang.String) r9, (o.LogUtils) r12)
        L_0x017c:
            java.lang.Boolean r9 = o.LogItem.getMin((boolean) r9)
            return r9
        L_0x0181:
            return r12
        L_0x0182:
            java.lang.String r9 = "toString"
            java.lang.Object r9 = org.mozilla.javascript.ScriptableObject.getProperty((o.LogUtils) r12, (java.lang.String) r9)
            boolean r13 = r9 instanceof o.announceSwitchKeyboard
            if (r13 == 0) goto L_0x0195
            o.announceSwitchKeyboard r9 = (o.announceSwitchKeyboard) r9
            java.lang.Object[] r13 = o.LogItem.create
            java.lang.Object r9 = r9.call(r10, r11, r12, r13)
            return r9
        L_0x0195:
            java.lang.RuntimeException r9 = o.LogItem.toString(r9)
            throw r9
        L_0x019a:
            r9 = 4
            boolean r9 = r10.getMax((int) r9)
            if (r9 == 0) goto L_0x01c1
            java.lang.String r9 = o.LogItem.getMin((o.SecureQwertyKeyboard.AnonymousClass1) r10, (o.LogUtils) r11, (o.LogUtils) r12)
            int r10 = r9.length()
            if (r10 == 0) goto L_0x01c0
            char r11 = r9.charAt(r5)
            r12 = 40
            if (r11 != r12) goto L_0x01c0
            int r10 = r10 - r4
            char r11 = r9.charAt(r10)
            r12 = 41
            if (r11 != r12) goto L_0x01c0
            java.lang.String r9 = r9.substring(r4, r10)
        L_0x01c0:
            return r9
        L_0x01c1:
            java.lang.String r9 = o.LogItem.getMin((o.LogUtils) r12)
            return r9
        L_0x01c6:
            if (r12 == 0) goto L_0x01cd
            o.LogUtils r9 = r9.construct(r10, r11, r13)
            return r9
        L_0x01cd:
            int r9 = r13.length
            if (r9 == 0) goto L_0x01e2
            r9 = r13[r5]
            if (r9 == 0) goto L_0x01e2
            r9 = r13[r5]
            java.lang.Object r12 = o.checkOpen.instance
            if (r9 != r12) goto L_0x01db
            goto L_0x01e2
        L_0x01db:
            r9 = r13[r5]
            o.LogUtils r9 = o.LogItem.setMin((o.SecureQwertyKeyboard.AnonymousClass1) r10, (o.LogUtils) r11, (java.lang.Object) r9)
            return r9
        L_0x01e2:
            o.setmSubmitInterface r9 = new o.setmSubmitInterface
            r9.<init>()
            return r9
        L_0x01e8:
            int r9 = r13.length
            if (r9 > 0) goto L_0x01ee
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x01f0
        L_0x01ee:
            r9 = r13[r5]
        L_0x01f0:
            o.LogUtils r9 = r8.getCompatibleObject(r10, r11, r9)
            o.LogUtils r9 = r9.getPrototype()
            return r9
        L_0x01f9:
            int r9 = r13.length
            if (r9 > 0) goto L_0x01ff
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x0201
        L_0x01ff:
            r9 = r13[r5]
        L_0x0201:
            o.LogUtils r9 = r8.getCompatibleObject(r10, r11, r9)
            java.lang.Object[] r9 = r9.getIds()
        L_0x0209:
            int r10 = r9.length
            if (r5 >= r10) goto L_0x0217
            r10 = r9[r5]
            java.lang.String r10 = o.LogItem.getMin((java.lang.Object) r10)
            r9[r5] = r10
            int r5 = r5 + 1
            goto L_0x0209
        L_0x0217:
            o.LogUtils r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r11, (java.lang.Object[]) r9)
            return r9
        L_0x021c:
            int r9 = r13.length
            if (r9 > 0) goto L_0x0222
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x0224
        L_0x0222:
            r9 = r13[r5]
        L_0x0224:
            o.LogUtils r9 = r8.getCompatibleObject(r10, r11, r9)
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            java.lang.Object[] r9 = r9.getIds(r4, r5)
        L_0x0230:
            int r10 = r9.length
            if (r5 >= r10) goto L_0x023e
            r10 = r9[r5]
            java.lang.String r10 = o.LogItem.getMin((java.lang.Object) r10)
            r9[r5] = r10
            int r5 = r5 + 1
            goto L_0x0230
        L_0x023e:
            o.LogUtils r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r11, (java.lang.Object[]) r9)
            return r9
        L_0x0243:
            int r9 = r13.length
            if (r9 > 0) goto L_0x0249
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x024b
        L_0x0249:
            r9 = r13[r5]
        L_0x024b:
            o.LogUtils r9 = r8.getCompatibleObject(r10, r11, r9)
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            int r11 = r13.length
            if (r11 >= r3) goto L_0x0259
            java.lang.Object r11 = o.checkOpen.instance
            goto L_0x025b
        L_0x0259:
            r11 = r13[r4]
        L_0x025b:
            org.mozilla.javascript.ScriptableObject r9 = r9.getOwnPropertyDescriptor(r10, r11)
            if (r9 != 0) goto L_0x0263
            java.lang.Object r9 = o.checkOpen.instance
        L_0x0263:
            return r9
        L_0x0264:
            int r9 = r13.length
            if (r9 > 0) goto L_0x026a
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x026c
        L_0x026a:
            r9 = r13[r5]
        L_0x026c:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            int r11 = r13.length
            if (r11 >= r3) goto L_0x0276
            java.lang.Object r11 = o.checkOpen.instance
            goto L_0x0278
        L_0x0276:
            r11 = r13[r4]
        L_0x0278:
            int r12 = r13.length
            r0 = 3
            if (r12 >= r0) goto L_0x027f
            java.lang.Object r12 = o.checkOpen.instance
            goto L_0x0281
        L_0x027f:
            r12 = r13[r3]
        L_0x0281:
            org.mozilla.javascript.ScriptableObject r12 = ensureScriptableObject(r12)
            r9.defineOwnProperty(r10, r11, r12)
            return r9
        L_0x0289:
            int r9 = r13.length
            if (r9 > 0) goto L_0x028f
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x0291
        L_0x028f:
            r9 = r13[r5]
        L_0x0291:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            boolean r9 = r9.isExtensible()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L_0x029e:
            int r9 = r13.length
            if (r9 > 0) goto L_0x02a4
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x02a6
        L_0x02a4:
            r9 = r13[r5]
        L_0x02a6:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            r9.preventExtensions()
            return r9
        L_0x02ae:
            int r9 = r13.length
            if (r9 > 0) goto L_0x02b4
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x02b6
        L_0x02b4:
            r9 = r13[r5]
        L_0x02b6:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            int r11 = r13.length
            if (r11 >= r3) goto L_0x02c0
            java.lang.Object r11 = o.checkOpen.instance
            goto L_0x02c2
        L_0x02c0:
            r11 = r13[r4]
        L_0x02c2:
            o.LogUtils r12 = r8.getParentScope()
            o.LogUtils r11 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.Object) r11, (o.LogUtils) r12)
            org.mozilla.javascript.ScriptableObject r11 = ensureScriptableObject(r11)
            r9.defineOwnProperties(r10, r11)
            return r9
        L_0x02d2:
            int r9 = r13.length
            if (r9 > 0) goto L_0x02d8
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x02da
        L_0x02d8:
            r9 = r13[r5]
        L_0x02da:
            if (r9 != 0) goto L_0x02de
            r9 = 0
            goto L_0x02e2
        L_0x02de:
            o.LogUtils r9 = ensureScriptable(r9)
        L_0x02e2:
            o.setmSubmitInterface r11 = new o.setmSubmitInterface
            r11.<init>()
            o.LogUtils r12 = r8.getParentScope()
            r11.setParentScope(r12)
            r11.setPrototype(r9)
            int r9 = r13.length
            if (r9 <= r4) goto L_0x030b
            r9 = r13[r4]
            java.lang.Object r12 = o.checkOpen.instance
            if (r9 == r12) goto L_0x030b
            r9 = r13[r4]
            o.LogUtils r12 = r8.getParentScope()
            o.LogUtils r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.Object) r9, (o.LogUtils) r12)
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            r11.defineOwnProperties(r10, r9)
        L_0x030b:
            return r11
        L_0x030c:
            int r9 = r13.length
            if (r9 > 0) goto L_0x0312
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x0314
        L_0x0312:
            r9 = r13[r5]
        L_0x0314:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            boolean r11 = r9.isExtensible()
            if (r11 == 0) goto L_0x0321
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L_0x0321:
            java.lang.Object[] r11 = r9.getAllIds()
            int r12 = r11.length
        L_0x0326:
            if (r5 >= r12) goto L_0x0340
            r13 = r11[r5]
            org.mozilla.javascript.ScriptableObject r13 = r9.getOwnPropertyDescriptor(r10, r13)
            java.lang.Object r13 = r13.get(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x033d
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L_0x033d:
            int r5 = r5 + 1
            goto L_0x0326
        L_0x0340:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L_0x0343:
            int r9 = r13.length
            if (r9 > 0) goto L_0x0349
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x034b
        L_0x0349:
            r9 = r13[r5]
        L_0x034b:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            boolean r11 = r9.isExtensible()
            if (r11 == 0) goto L_0x0358
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L_0x0358:
            java.lang.Object[] r11 = r9.getAllIds()
            int r12 = r11.length
        L_0x035d:
            if (r5 >= r12) goto L_0x038c
            r13 = r11[r5]
            org.mozilla.javascript.ScriptableObject r13 = r9.getOwnPropertyDescriptor(r10, r13)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r13.get(r2)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0374
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L_0x0374:
            boolean r0 = r8.isDataDescriptor(r13)
            if (r0 == 0) goto L_0x0389
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r13 = r13.get(r1)
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x0389
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L_0x0389:
            int r5 = r5 + 1
            goto L_0x035d
        L_0x038c:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L_0x038f:
            int r9 = r13.length
            if (r9 > 0) goto L_0x0395
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x0397
        L_0x0395:
            r9 = r13[r5]
        L_0x0397:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            java.lang.Object[] r11 = r9.getAllIds()
            int r12 = r11.length
            r13 = 0
        L_0x03a1:
            if (r13 >= r12) goto L_0x03c0
            r0 = r11[r13]
            org.mozilla.javascript.ScriptableObject r1 = r9.getOwnPropertyDescriptor(r10, r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r4 = r1.get(r2)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x03bd
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put((java.lang.String) r2, (o.LogUtils) r1, (java.lang.Object) r3)
            r9.defineOwnProperty(r10, r0, r1, r5)
        L_0x03bd:
            int r13 = r13 + 1
            goto L_0x03a1
        L_0x03c0:
            r9.preventExtensions()
            return r9
        L_0x03c4:
            int r9 = r13.length
            if (r9 > 0) goto L_0x03ca
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x03cc
        L_0x03ca:
            r9 = r13[r5]
        L_0x03cc:
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            java.lang.Object[] r11 = r9.getAllIds()
            int r12 = r11.length
            r13 = 0
        L_0x03d6:
            if (r13 >= r12) goto L_0x040c
            r0 = r11[r13]
            org.mozilla.javascript.ScriptableObject r3 = r9.getOwnPropertyDescriptor(r10, r0)
            boolean r4 = r8.isDataDescriptor(r3)
            if (r4 == 0) goto L_0x03f5
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r6 = r3.get(r1)
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x03f5
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put((java.lang.String) r1, (o.LogUtils) r3, (java.lang.Object) r4)
        L_0x03f5:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r6 = r3.get(r2)
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0406
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put((java.lang.String) r2, (o.LogUtils) r3, (java.lang.Object) r4)
        L_0x0406:
            r9.defineOwnProperty(r10, r0, r3, r5)
            int r13 = r13 + 1
            goto L_0x03d6
        L_0x040c:
            r9.preventExtensions()
            return r9
        L_0x0410:
            int r9 = r13.length
            if (r9 > 0) goto L_0x0416
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x0418
        L_0x0416:
            r9 = r13[r5]
        L_0x0418:
            o.LogUtils r9 = r8.getCompatibleObject(r10, r11, r9)
            org.mozilla.javascript.ScriptableObject r9 = ensureScriptableObject(r9)
            java.lang.Object[] r9 = r9.getIds(r4, r4)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0429:
            int r12 = r9.length
            if (r5 >= r12) goto L_0x043a
            r12 = r9[r5]
            boolean r12 = r12 instanceof o.record
            if (r12 == 0) goto L_0x0437
            r12 = r9[r5]
            r10.add(r12)
        L_0x0437:
            int r5 = r5 + 1
            goto L_0x0429
        L_0x043a:
            java.lang.Object[] r9 = r10.toArray()
            o.LogUtils r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r11, (java.lang.Object[]) r9)
            return r9
        L_0x0443:
            int r9 = r13.length
            if (r9 <= 0) goto L_0x04a1
            r9 = r13[r5]
            o.LogUtils r9 = o.LogItem.setMin((o.SecureQwertyKeyboard.AnonymousClass1) r10, (o.LogUtils) r12, (java.lang.Object) r9)
        L_0x044c:
            int r11 = r13.length
            if (r4 >= r11) goto L_0x04a0
            r11 = r13[r4]
            if (r11 == 0) goto L_0x049d
            java.lang.Object r11 = o.checkOpen.instance
            r0 = r13[r4]
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x049d
            r11 = r13[r4]
            o.LogUtils r11 = o.LogItem.setMin((o.SecureQwertyKeyboard.AnonymousClass1) r10, (o.LogUtils) r12, (java.lang.Object) r11)
            java.lang.Object[] r0 = r11.getIds()
            int r1 = r0.length
            r2 = 0
        L_0x0469:
            if (r2 >= r1) goto L_0x049d
            r3 = r0[r2]
            boolean r6 = r3 instanceof java.lang.String
            if (r6 == 0) goto L_0x0483
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r6 = r11.get((java.lang.String) r3, (o.LogUtils) r9)
            java.lang.Object r7 = o.LogUtils.getMax
            if (r6 == r7) goto L_0x049a
            java.lang.Object r7 = o.checkOpen.instance
            if (r6 == r7) goto L_0x049a
            r9.put((java.lang.String) r3, (o.LogUtils) r9, (java.lang.Object) r6)
            goto L_0x049a
        L_0x0483:
            boolean r6 = r3 instanceof java.lang.Number
            if (r6 == 0) goto L_0x049a
            int r3 = o.LogItem.toFloatRange((java.lang.Object) r3)
            java.lang.Object r6 = r11.get((int) r3, (o.LogUtils) r9)
            java.lang.Object r7 = o.LogUtils.getMax
            if (r6 == r7) goto L_0x049a
            java.lang.Object r7 = o.checkOpen.instance
            if (r6 == r7) goto L_0x049a
            r9.put((int) r3, (o.LogUtils) r9, (java.lang.Object) r6)
        L_0x049a:
            int r2 = r2 + 1
            goto L_0x0469
        L_0x049d:
            int r4 = r4 + 1
            goto L_0x044c
        L_0x04a0:
            return r9
        L_0x04a1:
            java.lang.String r9 = "msg.incompat.call"
            java.lang.String r10 = "assign"
            org.mozilla.javascript.EcmaError r9 = o.LogItem.length((java.lang.String) r9, (java.lang.Object) r10)
            throw r9
        L_0x04aa:
            int r9 = r13.length
            if (r9 > 0) goto L_0x04b0
            java.lang.Object r9 = o.checkOpen.instance
            goto L_0x04b2
        L_0x04b0:
            r9 = r13[r5]
        L_0x04b2:
            int r10 = r13.length
            if (r10 >= r3) goto L_0x04b8
            java.lang.Object r10 = o.checkOpen.instance
            goto L_0x04ba
        L_0x04b8:
            r10 = r13[r4]
        L_0x04ba:
            boolean r9 = o.LogItem.setMax((java.lang.Object) r9, (java.lang.Object) r10)
            java.lang.Boolean r9 = o.LogItem.getMin((boolean) r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setmSubmitInterface.execIdCall(o.EditTextUtil, o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, java.lang.Object[]):java.lang.Object");
    }

    public boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return has((String) obj, (LogUtils) this);
        }
        if (obj instanceof Number) {
            return has(((Number) obj).intValue(), (LogUtils) this);
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        for (Object next : values()) {
            if (obj == next) {
                return true;
            }
            if (obj != null && obj.equals(next)) {
                return true;
            }
        }
        return false;
    }

    public Object remove(Object obj) {
        Object obj2 = get(obj);
        if (obj instanceof String) {
            delete((String) obj);
        } else if (obj instanceof Number) {
            delete(((Number) obj).intValue());
        }
        return obj2;
    }

    public Set<Object> keySet() {
        return new getMax();
    }

    public Collection<Object> values() {
        return new getMin();
    }

    public Set<Map.Entry<Object, Object>> entrySet() {
        return new setMax();
    }

    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    class setMax extends AbstractSet<Map.Entry<Object, Object>> {
        setMax() {
        }

        public final Iterator<Map.Entry<Object, Object>> iterator() {
            return new Iterator<Map.Entry<Object, Object>>() {
                Object getMax = null;
                int getMin = 0;
                Object[] setMax = setmSubmitInterface.this.getIds();

                public final boolean hasNext() {
                    return this.getMin < this.setMax.length;
                }

                public final void remove() {
                    if (this.getMax != null) {
                        setmSubmitInterface.this.remove(this.getMax);
                        this.getMax = null;
                        return;
                    }
                    throw new IllegalStateException();
                }

                public final /* synthetic */ Object next() {
                    Object[] objArr = this.setMax;
                    int i = this.getMin;
                    this.getMin = i + 1;
                    final Object obj = objArr[i];
                    this.getMax = obj;
                    final Object obj2 = setmSubmitInterface.this.get(this.getMax);
                    return new Map.Entry<Object, Object>() {
                        public final Object getKey() {
                            return obj;
                        }

                        public final Object getValue() {
                            return obj2;
                        }

                        public final Object setValue(Object obj) {
                            throw new UnsupportedOperationException();
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Map.Entry)) {
                                return false;
                            }
                            Map.Entry entry = (Map.Entry) obj;
                            Object obj2 = obj;
                            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                                Object obj3 = obj2;
                                if (obj3 == null) {
                                    if (entry.getValue() == null) {
                                        return true;
                                    }
                                } else if (obj3.equals(entry.getValue())) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        public final int hashCode() {
                            Object obj = obj;
                            int i = 0;
                            int hashCode = obj == null ? 0 : obj.hashCode();
                            Object obj2 = obj2;
                            if (obj2 != null) {
                                i = obj2.hashCode();
                            }
                            return hashCode ^ i;
                        }

                        public final String toString() {
                            StringBuilder sb = new StringBuilder();
                            sb.append(obj);
                            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                            sb.append(obj2);
                            return sb.toString();
                        }
                    };
                }
            };
        }

        public final int size() {
            return setmSubmitInterface.this.size();
        }
    }

    class getMax extends AbstractSet<Object> {
        getMax() {
        }

        public final boolean contains(Object obj) {
            return setmSubmitInterface.this.containsKey(obj);
        }

        public final Iterator<Object> iterator() {
            return new Iterator<Object>() {
                Object[] getMax = setmSubmitInterface.this.getIds();
                Object getMin;
                int length = 0;

                public final boolean hasNext() {
                    return this.length < this.getMax.length;
                }

                public final Object next() {
                    try {
                        Object[] objArr = this.getMax;
                        int i = this.length;
                        this.length = i + 1;
                        Object obj = objArr[i];
                        this.getMin = obj;
                        return obj;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        this.getMin = null;
                        throw new NoSuchElementException();
                    }
                }

                public final void remove() {
                    if (this.getMin != null) {
                        setmSubmitInterface.this.remove(this.getMin);
                        this.getMin = null;
                        return;
                    }
                    throw new IllegalStateException();
                }
            };
        }

        public final int size() {
            return setmSubmitInterface.this.size();
        }
    }

    class getMin extends AbstractCollection<Object> {
        getMin() {
        }

        public final Iterator<Object> iterator() {
            return new Iterator<Object>() {
                Object getMin;
                int length = 0;
                Object[] setMax = setmSubmitInterface.this.getIds();

                public final boolean hasNext() {
                    return this.length < this.setMax.length;
                }

                public final Object next() {
                    setmSubmitInterface setmsubmitinterface = setmSubmitInterface.this;
                    Object[] objArr = this.setMax;
                    int i = this.length;
                    this.length = i + 1;
                    Object obj = objArr[i];
                    this.getMin = obj;
                    return setmsubmitinterface.get(obj);
                }

                public final void remove() {
                    if (this.getMin != null) {
                        setmSubmitInterface.this.remove(this.getMin);
                        this.getMin = null;
                        return;
                    }
                    throw new IllegalStateException();
                }
            };
        }

        public final int size() {
            return setmSubmitInterface.this.size();
        }
    }

    /* access modifiers changed from: protected */
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i = 2;
        if (length != 7) {
            if (length == 8) {
                char charAt = str.charAt(3);
                if (charAt == 'o') {
                    str2 = "toSource";
                    i = 8;
                } else if (charAt == 't') {
                    str2 = "toString";
                }
            } else if (length == 11) {
                i = 1;
                str2 = "constructor";
            } else if (length == 16) {
                char charAt2 = str.charAt(2);
                if (charAt2 == 'd') {
                    char charAt3 = str.charAt(8);
                    if (charAt3 == 'G') {
                        i = 9;
                        str2 = "__defineGetter__";
                    } else if (charAt3 == 'S') {
                        i = 10;
                        str2 = "__defineSetter__";
                    }
                } else if (charAt2 == 'l') {
                    char charAt4 = str.charAt(8);
                    if (charAt4 == 'G') {
                        str2 = "__lookupGetter__";
                        i = 11;
                    } else if (charAt4 == 'S') {
                        i = 12;
                        str2 = "__lookupSetter__";
                    }
                }
            } else if (length == 20) {
                i = 6;
                str2 = "propertyIsEnumerable";
            } else if (length == 13) {
                str2 = "isPrototypeOf";
                i = 7;
            } else if (length == 14) {
                char charAt5 = str.charAt(0);
                if (charAt5 == 'h') {
                    i = 5;
                    str2 = "hasOwnProperty";
                } else if (charAt5 == 't') {
                    str2 = "toLocaleString";
                    i = 3;
                }
            }
            str2 = null;
            i = 0;
        } else {
            i = 4;
            str2 = "valueOf";
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i;
        }
        return 0;
    }

    private LogUtils getCompatibleObject(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, Object obj) {
        if (r3.IsOverlapping >= 200) {
            return ensureScriptable(LogItem.setMin(r3, logUtils, obj));
        }
        return ensureScriptable(obj);
    }
}
