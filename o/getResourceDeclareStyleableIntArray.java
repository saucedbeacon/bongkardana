package o;

import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.mobile.rome.longlinkservice.LongLinkMsgConstants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;

public class getResourceDeclareStyleableIntArray extends setUiContext implements List {
    private static final Object ARRAY_TAG = "Array";
    private static final int ConstructorId_concat = -13;
    private static final int ConstructorId_every = -17;
    private static final int ConstructorId_filter = -18;
    private static final int ConstructorId_find = -22;
    private static final int ConstructorId_findIndex = -23;
    private static final int ConstructorId_forEach = -19;
    private static final int ConstructorId_indexOf = -15;
    private static final int ConstructorId_isArray = -26;
    private static final int ConstructorId_join = -5;
    private static final int ConstructorId_lastIndexOf = -16;
    private static final int ConstructorId_map = -20;
    private static final int ConstructorId_pop = -9;
    private static final int ConstructorId_push = -8;
    private static final int ConstructorId_reduce = -24;
    private static final int ConstructorId_reduceRight = -25;
    private static final int ConstructorId_reverse = -6;
    private static final int ConstructorId_shift = -10;
    private static final int ConstructorId_slice = -14;
    private static final int ConstructorId_some = -21;
    private static final int ConstructorId_sort = -7;
    private static final int ConstructorId_splice = -12;
    private static final int ConstructorId_unshift = -11;
    private static final Comparator<Object> DEFAULT_COMPARATOR = new length();
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private static final double GROW_FACTOR = 1.5d;
    private static final int Id_concat = 13;
    private static final int Id_constructor = 1;
    private static final int Id_every = 17;
    private static final int Id_filter = 18;
    private static final int Id_find = 22;
    private static final int Id_findIndex = 23;
    private static final int Id_forEach = 19;
    private static final int Id_indexOf = 15;
    private static final int Id_join = 5;
    private static final int Id_lastIndexOf = 16;
    private static final int Id_length = 1;
    private static final int Id_map = 20;
    private static final int Id_pop = 9;
    private static final int Id_push = 8;
    private static final int Id_reduce = 24;
    private static final int Id_reduceRight = 25;
    private static final int Id_reverse = 6;
    private static final int Id_shift = 10;
    private static final int Id_slice = 14;
    private static final int Id_some = 21;
    private static final int Id_sort = 7;
    private static final int Id_splice = 12;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_unshift = 11;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PRE_GROW_SIZE = 1431655764;
    private static final int MAX_PROTOTYPE_ID = 26;
    private static final Integer NEGATIVE_ONE = -1;
    /* access modifiers changed from: private */
    public static final Comparator<Object> STRING_COMPARATOR = new getMin();
    private static final int SymbolId_iterator = 26;
    private static int maximumInitialCapacity = 10000;
    static final long serialVersionUID = 7331366857676127338L;
    private Object[] dense;
    private boolean denseOnly;
    private long length;
    private int lengthAttr;

    public String getClassName() {
        return "Array";
    }

    /* access modifiers changed from: protected */
    public int getMaxInstanceId() {
        return 1;
    }

    static void init(LogUtils logUtils, boolean z) {
        new getResourceDeclareStyleableIntArray(0).exportAsJSClass(26, logUtils, z);
    }

    static int getMaximumInitialCapacity() {
        return maximumInitialCapacity;
    }

    static void setMaximumInitialCapacity(int i) {
        maximumInitialCapacity = i;
    }

    public getResourceDeclareStyleableIntArray(long j) {
        this.lengthAttr = 6;
        boolean z = j <= ((long) maximumInitialCapacity);
        this.denseOnly = z;
        if (z) {
            int i = (int) j;
            Object[] objArr = new Object[(i < 10 ? 10 : i)];
            this.dense = objArr;
            Arrays.fill(objArr, LogUtils.getMax);
        }
        this.length = j;
    }

    public getResourceDeclareStyleableIntArray(Object[] objArr) {
        this.lengthAttr = 6;
        this.denseOnly = true;
        this.dense = objArr;
        this.length = (long) objArr.length;
    }

    /* access modifiers changed from: protected */
    public void setInstanceIdAttributes(int i, int i2) {
        if (i == 1) {
            this.lengthAttr = i2;
        }
    }

    /* access modifiers changed from: protected */
    public int findInstanceIdInfo(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-785679538, oncanceled);
            onCancelLoad.getMin(-785679538, oncanceled);
        }
        if (str.equals("length")) {
            return instanceIdInfo(this.lengthAttr, 1);
        }
        return super.findInstanceIdInfo(str);
    }

    /* access modifiers changed from: protected */
    public String getInstanceIdName(int i) {
        return i == 1 ? "length" : super.getInstanceIdName(i);
    }

    /* access modifiers changed from: protected */
    public Object getInstanceIdValue(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(77603422, oncanceled);
            onCancelLoad.getMin(77603422, oncanceled);
        }
        if (i == 1) {
            return LogItem.getMax((double) this.length);
        }
        return super.getInstanceIdValue(i);
    }

    /* access modifiers changed from: protected */
    public void setInstanceIdValue(int i, Object obj) {
        if (i == 1) {
            setLength(obj);
        } else {
            super.setInstanceIdValue(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    public void fillConstructorProperties(EditTextUtil editTextUtil) {
        EditTextUtil editTextUtil2 = editTextUtil;
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, -5, "join", 1);
        EditTextUtil editTextUtil3 = editTextUtil;
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, -6, "reverse", 0);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, -7, "sort", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, -8, LongLinkMsgConstants.MSG_PACKET_CHANNEL_PUSH, 1);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, -9, RVStartParams.BACK_BEHAVIOR_POP, 0);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, -10, "shift", 0);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, -11, "unshift", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, -12, "splice", 2);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, -13, "concat", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, -14, "slice", 2);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, -15, "indexOf", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, ConstructorId_lastIndexOf, "lastIndexOf", 1);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, ConstructorId_every, "every", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, ConstructorId_filter, "filter", 1);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, ConstructorId_forEach, "forEach", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, ConstructorId_map, "map", 1);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, ConstructorId_some, "some", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, ConstructorId_find, "find", 1);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, ConstructorId_findIndex, "findIndex", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, ConstructorId_reduce, "reduce", 1);
        addIdFunctionProperty(editTextUtil2, ARRAY_TAG, ConstructorId_reduceRight, "reduceRight", 1);
        addIdFunctionProperty(editTextUtil3, ARRAY_TAG, ConstructorId_isArray, "isArray", 1);
        super.fillConstructorProperties(editTextUtil);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        r6 = r1;
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        r6 = r0;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        r6 = r0;
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        initPrototypeMethod(ARRAY_TAG, r10, r6, (java.lang.String) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initPrototypeId(int r10) {
        /*
            r9 = this;
            r0 = 26
            if (r10 != r0) goto L_0x0011
            java.lang.Object r2 = ARRAY_TAG
            o.F2fpaySwitchFacade r4 = o.F2fpaySwitchFacade.ITERATOR
            r6 = 0
            java.lang.String r5 = "[Symbol.iterator]"
            r1 = r9
            r3 = r10
            r1.initPrototypeMethod((java.lang.Object) r2, (int) r3, (o.record) r4, (java.lang.String) r5, (int) r6)
            return
        L_0x0011:
            r0 = 2
            r1 = 0
            r2 = 1
            switch(r10) {
                case 1: goto L_0x006e;
                case 2: goto L_0x0069;
                case 3: goto L_0x0066;
                case 4: goto L_0x0063;
                case 5: goto L_0x0060;
                case 6: goto L_0x005d;
                case 7: goto L_0x005a;
                case 8: goto L_0x0057;
                case 9: goto L_0x0054;
                case 10: goto L_0x0051;
                case 11: goto L_0x004e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0046;
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                case 17: goto L_0x003a;
                case 18: goto L_0x0037;
                case 19: goto L_0x0034;
                case 20: goto L_0x0031;
                case 21: goto L_0x002e;
                case 22: goto L_0x002b;
                case 23: goto L_0x0028;
                case 24: goto L_0x0025;
                case 25: goto L_0x0021;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            throw r0
        L_0x0021:
            java.lang.String r0 = "reduceRight"
            goto L_0x0070
        L_0x0025:
            java.lang.String r0 = "reduce"
            goto L_0x0070
        L_0x0028:
            java.lang.String r0 = "findIndex"
            goto L_0x0070
        L_0x002b:
            java.lang.String r0 = "find"
            goto L_0x0070
        L_0x002e:
            java.lang.String r0 = "some"
            goto L_0x0070
        L_0x0031:
            java.lang.String r0 = "map"
            goto L_0x0070
        L_0x0034:
            java.lang.String r0 = "forEach"
            goto L_0x0070
        L_0x0037:
            java.lang.String r0 = "filter"
            goto L_0x0070
        L_0x003a:
            java.lang.String r0 = "every"
            goto L_0x0070
        L_0x003d:
            java.lang.String r0 = "lastIndexOf"
            goto L_0x0070
        L_0x0040:
            java.lang.String r0 = "indexOf"
            goto L_0x0070
        L_0x0043:
            java.lang.String r1 = "slice"
            goto L_0x004b
        L_0x0046:
            java.lang.String r0 = "concat"
            goto L_0x0070
        L_0x0049:
            java.lang.String r1 = "splice"
        L_0x004b:
            r6 = r1
            r8 = 2
            goto L_0x0072
        L_0x004e:
            java.lang.String r0 = "unshift"
            goto L_0x0070
        L_0x0051:
            java.lang.String r0 = "shift"
            goto L_0x006b
        L_0x0054:
            java.lang.String r0 = "pop"
            goto L_0x006b
        L_0x0057:
            java.lang.String r0 = "push"
            goto L_0x0070
        L_0x005a:
            java.lang.String r0 = "sort"
            goto L_0x0070
        L_0x005d:
            java.lang.String r0 = "reverse"
            goto L_0x006b
        L_0x0060:
            java.lang.String r0 = "join"
            goto L_0x0070
        L_0x0063:
            java.lang.String r0 = "toSource"
            goto L_0x006b
        L_0x0066:
            java.lang.String r0 = "toLocaleString"
            goto L_0x006b
        L_0x0069:
            java.lang.String r0 = "toString"
        L_0x006b:
            r6 = r0
            r8 = 0
            goto L_0x0072
        L_0x006e:
            java.lang.String r0 = "constructor"
        L_0x0070:
            r6 = r0
            r8 = 1
        L_0x0072:
            java.lang.Object r4 = ARRAY_TAG
            r7 = 0
            r3 = r9
            r5 = r10
            r3.initPrototypeMethod((java.lang.Object) r4, (int) r5, (java.lang.String) r6, (java.lang.String) r7, (int) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResourceDeclareStyleableIntArray.initPrototypeId(int):void");
    }

    public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r8, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(ARRAY_TAG)) {
            return super.execIdCall(editTextUtil, r8, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        while (true) {
            boolean z = true;
            int i = 0;
            switch (methodId) {
                case ConstructorId_isArray /*-26*/:
                    if (objArr.length <= 0 || !js_isArray(objArr[0])) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case ConstructorId_reduceRight /*-25*/:
                case ConstructorId_reduce /*-24*/:
                case ConstructorId_findIndex /*-23*/:
                case ConstructorId_find /*-22*/:
                case ConstructorId_some /*-21*/:
                case ConstructorId_map /*-20*/:
                case ConstructorId_forEach /*-19*/:
                case ConstructorId_filter /*-18*/:
                case ConstructorId_every /*-17*/:
                case ConstructorId_lastIndexOf /*-16*/:
                case -15:
                case -14:
                case -13:
                case -12:
                case -11:
                case -10:
                case -9:
                case -8:
                case -7:
                case -6:
                case -5:
                    if (objArr.length > 0) {
                        logUtils2 = LogItem.setMin(r8, logUtils, objArr[0]);
                        int length2 = objArr.length - 1;
                        Object[] objArr2 = new Object[length2];
                        while (i < length2) {
                            int i2 = i + 1;
                            objArr2[i] = objArr[i2];
                            i = i2;
                        }
                        objArr = objArr2;
                    }
                    methodId = -methodId;
                default:
                    switch (methodId) {
                        case 1:
                            if (logUtils2 != null) {
                                z = false;
                            }
                            if (!z) {
                                return editTextUtil.construct(r8, logUtils, objArr);
                            }
                            return jsConstructor(r8, logUtils, objArr);
                        case 2:
                            return toStringHelper(r8, logUtils, logUtils2, r8.getMax(4), false);
                        case 3:
                            return toStringHelper(r8, logUtils, logUtils2, false, true);
                        case 4:
                            return toStringHelper(r8, logUtils, logUtils2, true, false);
                        case 5:
                            return js_join(r8, logUtils2, objArr);
                        case 6:
                            return js_reverse(r8, logUtils2, objArr);
                        case 7:
                            return js_sort(r8, logUtils, logUtils2, objArr);
                        case 8:
                            return js_push(r8, logUtils2, objArr);
                        case 9:
                            return js_pop(r8, logUtils2, objArr);
                        case 10:
                            return js_shift(r8, logUtils2, objArr);
                        case 11:
                            return js_unshift(r8, logUtils2, objArr);
                        case 12:
                            return js_splice(r8, logUtils, logUtils2, objArr);
                        case 13:
                            return js_concat(r8, logUtils, logUtils2, objArr);
                        case 14:
                            return js_slice(r8, logUtils2, objArr);
                        case 15:
                            return js_indexOf(r8, logUtils2, objArr);
                        case 16:
                            return js_lastIndexOf(r8, logUtils2, objArr);
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            return iterativeMethod(r8, editTextUtil, logUtils, logUtils2, objArr);
                        case 24:
                        case 25:
                            return reduceMethod(r8, methodId, logUtils, logUtils2, objArr);
                        case 26:
                            return new getXmlId(logUtils, logUtils2);
                        default:
                            StringBuilder sb = new StringBuilder("Array.prototype has no method: ");
                            sb.append(editTextUtil.getFunctionName());
                            throw new IllegalArgumentException(sb.toString());
                    }
            }
        }
    }

    public Object get(int i, LogUtils logUtils) {
        if (!this.denseOnly && isGetterOrSetter((String) null, i, false)) {
            return super.get(i, logUtils);
        }
        Object[] objArr = this.dense;
        if (objArr == null || i < 0 || i >= objArr.length) {
            return super.get(i, logUtils);
        }
        return objArr[i];
    }

    public boolean has(int i, LogUtils logUtils) {
        if (!this.denseOnly && isGetterOrSetter((String) null, i, false)) {
            return super.has(i, logUtils);
        }
        Object[] objArr = this.dense;
        if (objArr == null || i < 0 || i >= objArr.length) {
            return super.has(i, logUtils);
        }
        if (objArr[i] != getMax) {
            return true;
        }
        return false;
    }

    private static long toArrayIndex(Object obj) {
        if (obj instanceof String) {
            return toArrayIndex((String) obj);
        }
        if (obj instanceof Number) {
            return toArrayIndex(((Number) obj).doubleValue());
        }
        return -1;
    }

    private static long toArrayIndex(String str) {
        long arrayIndex = toArrayIndex(LogItem.setMin(str));
        if (Long.toString(arrayIndex).equals(str)) {
            return arrayIndex;
        }
        return -1;
    }

    private static long toArrayIndex(double d) {
        if (d != d) {
            return -1;
        }
        long length2 = LogItem.length(d);
        if (((double) length2) != d || length2 == 4294967295L) {
            return -1;
        }
        return length2;
    }

    private static int toDenseIndex(Object obj) {
        long arrayIndex = toArrayIndex(obj);
        if (0 > arrayIndex || arrayIndex >= 2147483647L) {
            return -1;
        }
        return (int) arrayIndex;
    }

    public void put(String str, LogUtils logUtils, Object obj) {
        super.put(str, logUtils, obj);
        if (logUtils == this) {
            long arrayIndex = toArrayIndex(str);
            if (arrayIndex >= this.length) {
                this.length = arrayIndex + 1;
                this.denseOnly = false;
            }
        }
    }

    private boolean ensureCapacity(int i) {
        Object[] objArr = this.dense;
        if (i <= objArr.length) {
            return true;
        }
        if (i > MAX_PRE_GROW_SIZE) {
            this.denseOnly = false;
            return false;
        }
        double length2 = (double) objArr.length;
        Double.isNaN(length2);
        int max = Math.max(i, (int) (length2 * GROW_FACTOR));
        Object[] objArr2 = new Object[max];
        Object[] objArr3 = this.dense;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        Arrays.fill(objArr2, this.dense.length, max, LogUtils.getMax);
        this.dense = objArr2;
        return true;
    }

    public void put(int i, LogUtils logUtils, Object obj) {
        if (logUtils == this && !isSealed() && this.dense != null && i >= 0 && (this.denseOnly || !isGetterOrSetter((String) null, i, true))) {
            if (isExtensible() || this.length > ((long) i)) {
                Object[] objArr = this.dense;
                if (i < objArr.length) {
                    objArr[i] = obj;
                    long j = (long) i;
                    if (this.length <= j) {
                        this.length = j + 1;
                        return;
                    }
                    return;
                }
                if (this.denseOnly) {
                    double length2 = (double) objArr.length;
                    Double.isNaN(length2);
                    if (((double) i) < length2 * GROW_FACTOR && ensureCapacity(i + 1)) {
                        this.dense[i] = obj;
                        this.length = ((long) i) + 1;
                        return;
                    }
                }
                this.denseOnly = false;
            } else {
                return;
            }
        }
        super.put(i, logUtils, obj);
        if (logUtils == this && (this.lengthAttr & 1) == 0) {
            long j2 = (long) i;
            if (this.length <= j2) {
                this.length = j2 + 1;
            }
        }
    }

    public void delete(int i) {
        Object[] objArr = this.dense;
        if (objArr == null || i < 0 || i >= objArr.length || isSealed() || (!this.denseOnly && isGetterOrSetter((String) null, i, true))) {
            super.delete(i);
        } else {
            this.dense[i] = getMax;
        }
    }

    public Object[] getIds(boolean z, boolean z2) {
        Object[] ids = super.getIds(z, z2);
        Object[] objArr = this.dense;
        if (objArr == null) {
            return ids;
        }
        int length2 = objArr.length;
        long j = this.length;
        if (((long) length2) > j) {
            length2 = (int) j;
        }
        if (length2 == 0) {
            return ids;
        }
        int length3 = ids.length;
        Object[] objArr2 = new Object[(length2 + length3)];
        int i = 0;
        for (int i2 = 0; i2 != length2; i2++) {
            if (this.dense[i2] != getMax) {
                objArr2[i] = Integer.valueOf(i2);
                i++;
            }
        }
        if (i != length2) {
            Object[] objArr3 = new Object[(i + length3)];
            System.arraycopy(objArr2, 0, objArr3, 0, i);
            objArr2 = objArr3;
        }
        System.arraycopy(ids, 0, objArr2, i, length3);
        return objArr2;
    }

    public Integer[] getIndexIds() {
        Object[] ids = getIds();
        ArrayList arrayList = new ArrayList(ids.length);
        for (Object obj : ids) {
            int floatRange = LogItem.toFloatRange(obj);
            if (floatRange >= 0 && LogItem.setMin((double) floatRange).equals(LogItem.getMin(obj))) {
                arrayList.add(Integer.valueOf(floatRange));
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    public Object getDefaultValue(Class<?> cls) {
        if (cls == LogItem.toIntRange && SecureQwertyKeyboard.AnonymousClass1.toFloatRange().IsOverlapping == 120) {
            return Long.valueOf(this.length);
        }
        return super.getDefaultValue(cls);
    }

    private ScriptableObject defaultIndexPropertyDescriptor(Object obj) {
        LogUtils parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        setmSubmitInterface setmsubmitinterface = new setmSubmitInterface();
        LogItem.getMin((ScriptableObject) setmsubmitinterface, parentScope, TopLevel.Builtins.Object);
        setmsubmitinterface.defineProperty("value", obj, 0);
        setmsubmitinterface.defineProperty("writable", (Object) Boolean.TRUE, 0);
        setmsubmitinterface.defineProperty("enumerable", (Object) Boolean.TRUE, 0);
        setmsubmitinterface.defineProperty("configurable", (Object) Boolean.TRUE, 0);
        return setmsubmitinterface;
    }

    public int getAttributes(int i) {
        Object[] objArr = this.dense;
        if (objArr == null || i < 0 || i >= objArr.length || objArr[i] == getMax) {
            return super.getAttributes(i);
        }
        return 0;
    }

    public ScriptableObject getOwnPropertyDescriptor(SecureQwertyKeyboard.AnonymousClass1 r4, Object obj) {
        int denseIndex;
        if (this.dense != null && (denseIndex = toDenseIndex(obj)) >= 0) {
            Object[] objArr = this.dense;
            if (denseIndex < objArr.length && objArr[denseIndex] != getMax) {
                return defaultIndexPropertyDescriptor(this.dense[denseIndex]);
            }
        }
        return super.getOwnPropertyDescriptor(r4, obj);
    }

    public void defineOwnProperty(SecureQwertyKeyboard.AnonymousClass1 r6, Object obj, ScriptableObject scriptableObject, boolean z) {
        Object[] objArr = this.dense;
        if (objArr != null) {
            this.dense = null;
            this.denseOnly = false;
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] != getMax) {
                    put(i, (LogUtils) this, objArr[i]);
                }
            }
        }
        long arrayIndex = toArrayIndex(obj);
        if (arrayIndex >= this.length) {
            this.length = arrayIndex + 1;
        }
        super.defineOwnProperty(r6, obj, scriptableObject, z);
    }

    private static Object jsConstructor(SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, Object[] objArr) {
        if (objArr.length == 0) {
            return new getResourceDeclareStyleableIntArray(0);
        }
        if (r4.IsOverlapping == 120) {
            return new getResourceDeclareStyleableIntArray(objArr);
        }
        Number number = objArr[0];
        if (objArr.length > 1 || !(number instanceof Number)) {
            return new getResourceDeclareStyleableIntArray(objArr);
        }
        long intRange = LogItem.toIntRange((Object) number);
        if (((double) intRange) == number.doubleValue()) {
            return new getResourceDeclareStyleableIntArray(intRange);
        }
        throw LogItem.setMin("RangeError", LogItem.getMax("msg.arraylength.bad"));
    }

    public long getLength() {
        return this.length;
    }

    @Deprecated
    public long jsGet_length() {
        return getLength();
    }

    /* access modifiers changed from: package-private */
    public void setDenseOnly(boolean z) {
        if (!z || this.denseOnly) {
            this.denseOnly = z;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void setLength(Object obj) {
        if ((this.lengthAttr & 1) == 0) {
            double max = LogItem.getMax(obj);
            long length2 = LogItem.length(max);
            double d = (double) length2;
            if (d == max) {
                if (this.denseOnly) {
                    long j = this.length;
                    if (length2 < j) {
                        Object[] objArr = this.dense;
                        Arrays.fill(objArr, (int) length2, objArr.length, getMax);
                        this.length = length2;
                        return;
                    }
                    if (length2 < 1431655764) {
                        double d2 = (double) j;
                        Double.isNaN(d2);
                        if (d < d2 * GROW_FACTOR && ensureCapacity((int) length2)) {
                            this.length = length2;
                            return;
                        }
                    }
                    this.denseOnly = false;
                }
                long j2 = this.length;
                if (length2 < j2) {
                    if (j2 - length2 > 4096) {
                        Object[] ids = getIds();
                        for (Object obj2 : ids) {
                            if (obj2 instanceof String) {
                                String str = (String) obj2;
                                if (toArrayIndex(str) >= length2) {
                                    delete(str);
                                }
                            } else {
                                int intValue = ((Integer) obj2).intValue();
                                if (((long) intValue) >= length2) {
                                    delete(intValue);
                                }
                            }
                        }
                    } else {
                        for (long j3 = length2; j3 < this.length; j3++) {
                            deleteElem(this, j3);
                        }
                    }
                }
                this.length = length2;
                return;
            }
            throw LogItem.setMin("RangeError", LogItem.getMax("msg.arraylength.bad"));
        }
    }

    static long getLengthProperty(SecureQwertyKeyboard.AnonymousClass1 r0, LogUtils logUtils) {
        if (logUtils instanceof setInputCharCount) {
            return (long) ((setInputCharCount) logUtils).getLength();
        }
        if (logUtils instanceof getResourceDeclareStyleableIntArray) {
            return ((getResourceDeclareStyleableIntArray) logUtils).getLength();
        }
        Object property = ScriptableObject.getProperty(logUtils, "length");
        if (property == LogUtils.getMax) {
            return 0;
        }
        return LogItem.toIntRange(property);
    }

    private static Object setLengthProperty(SecureQwertyKeyboard.AnonymousClass1 r0, LogUtils logUtils, long j) {
        Number max = LogItem.getMax((double) j);
        ScriptableObject.putProperty(logUtils, "length", (Object) max);
        return max;
    }

    private static void deleteElem(LogUtils logUtils, long j) {
        int i = (int) j;
        if (((long) i) == j) {
            logUtils.delete(i);
        } else {
            logUtils.delete(Long.toString(j));
        }
    }

    private static Object getElem(SecureQwertyKeyboard.AnonymousClass1 r0, LogUtils logUtils, long j) {
        Object rawElem = getRawElem(logUtils, j);
        return rawElem != LogUtils.getMax ? rawElem : checkOpen.instance;
    }

    private static Object getRawElem(LogUtils logUtils, long j) {
        if (j > 2147483647L) {
            return ScriptableObject.getProperty(logUtils, Long.toString(j));
        }
        return ScriptableObject.getProperty(logUtils, (int) j);
    }

    private static void defineElem(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, long j, Object obj) {
        if (j > 2147483647L) {
            logUtils.put(Long.toString(j), logUtils, obj);
        } else {
            logUtils.put((int) j, logUtils, obj);
        }
    }

    private static void setElem(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, long j, Object obj) {
        if (j > 2147483647L) {
            ScriptableObject.putProperty(logUtils, Long.toString(j), obj);
        } else {
            ScriptableObject.putProperty(logUtils, (int) j, obj);
        }
    }

    private static void setRawElem(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, long j, Object obj) {
        if (obj == getMax) {
            deleteElem(logUtils, j);
        } else {
            setElem(r1, logUtils, j, obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[Catch:{ all -> 0x00b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String toStringHelper(o.SecureQwertyKeyboard.AnonymousClass1 r18, o.LogUtils r19, o.LogUtils r20, boolean r21, boolean r22) {
        /*
            r1 = r18
            r0 = r19
            r2 = r20
            long r3 = getLengthProperty(r1, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 256(0x100, float:3.59E-43)
            r5.<init>(r6)
            if (r21 == 0) goto L_0x001b
            r6 = 91
            r5.append(r6)
            java.lang.String r6 = ", "
            goto L_0x001d
        L_0x001b:
            java.lang.String r6 = ","
        L_0x001d:
            o.SimplePassword$TextWatcherImpl r7 = r1.equals
            r9 = 0
            if (r7 != 0) goto L_0x002e
            o.SimplePassword$TextWatcherImpl r7 = new o.SimplePassword$TextWatcherImpl
            r10 = 31
            r7.<init>(r10)
            r1.equals = r7
            r7 = 0
            r10 = 1
            goto L_0x0035
        L_0x002e:
            o.SimplePassword$TextWatcherImpl r7 = r1.equals
            boolean r7 = r7.has(r2)
            r10 = 0
        L_0x0035:
            r11 = 0
            r12 = 0
            if (r7 != 0) goto L_0x00be
            o.SimplePassword$TextWatcherImpl r7 = r1.equals     // Catch:{ all -> 0x00b8 }
            r7.put(r2, r9)     // Catch:{ all -> 0x00b8 }
            if (r21 == 0) goto L_0x004a
            int r7 = r1.IsOverlapping     // Catch:{ all -> 0x00b8 }
            r14 = 150(0x96, float:2.1E-43)
            if (r7 >= r14) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r7 = 0
            goto L_0x004b
        L_0x004a:
            r7 = 1
        L_0x004b:
            r14 = r12
            r16 = 0
        L_0x004e:
            int r17 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b5
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0059
            r5.append(r6)     // Catch:{ all -> 0x00b8 }
        L_0x0059:
            java.lang.Object r8 = getRawElem(r2, r14)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r9 = getMax     // Catch:{ all -> 0x00b8 }
            if (r8 == r9) goto L_0x00ac
            if (r7 == 0) goto L_0x006a
            if (r8 == 0) goto L_0x00ac
            java.lang.Object r9 = o.checkOpen.instance     // Catch:{ all -> 0x00b8 }
            if (r8 != r9) goto L_0x006a
            goto L_0x00ac
        L_0x006a:
            if (r21 == 0) goto L_0x0074
            java.lang.String r8 = o.LogItem.length((o.SecureQwertyKeyboard.AnonymousClass1) r1, (o.LogUtils) r0, (java.lang.Object) r8)     // Catch:{ all -> 0x00b8 }
            r5.append(r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00a9
        L_0x0074:
            boolean r9 = r8 instanceof java.lang.String     // Catch:{ all -> 0x00b8 }
            if (r9 == 0) goto L_0x0090
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00b8 }
            if (r21 == 0) goto L_0x008c
            r9 = 34
            r5.append(r9)     // Catch:{ all -> 0x00b8 }
            java.lang.String r8 = o.LogItem.setMax((java.lang.String) r8)     // Catch:{ all -> 0x00b8 }
            r5.append(r8)     // Catch:{ all -> 0x00b8 }
            r5.append(r9)     // Catch:{ all -> 0x00b8 }
            goto L_0x00a9
        L_0x008c:
            r5.append(r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00a9
        L_0x0090:
            if (r22 == 0) goto L_0x00a2
            java.lang.String r9 = "toLocaleString"
            o.announceSwitchKeyboard r8 = o.LogItem.length((java.lang.Object) r8, (java.lang.String) r9, (o.SecureQwertyKeyboard.AnonymousClass1) r1, (o.LogUtils) r0)     // Catch:{ all -> 0x00b8 }
            o.LogUtils r9 = o.LogItem.toFloatRange((o.SecureQwertyKeyboard.AnonymousClass1) r18)     // Catch:{ all -> 0x00b8 }
            java.lang.Object[] r12 = o.LogItem.create     // Catch:{ all -> 0x00b8 }
            java.lang.Object r8 = r8.call(r1, r0, r9, r12)     // Catch:{ all -> 0x00b8 }
        L_0x00a2:
            java.lang.String r8 = o.LogItem.getMin((java.lang.Object) r8)     // Catch:{ all -> 0x00b8 }
            r5.append(r8)     // Catch:{ all -> 0x00b8 }
        L_0x00a9:
            r16 = 1
            goto L_0x00ae
        L_0x00ac:
            r16 = 0
        L_0x00ae:
            r8 = 1
            long r14 = r14 + r8
            r9 = 0
            r12 = 0
            goto L_0x004e
        L_0x00b5:
            r9 = r16
            goto L_0x00c1
        L_0x00b8:
            r0 = move-exception
            if (r10 == 0) goto L_0x00bd
            r1.equals = r11
        L_0x00bd:
            throw r0
        L_0x00be:
            r9 = 0
            r14 = 0
        L_0x00c1:
            if (r10 == 0) goto L_0x00c5
            r1.equals = r11
        L_0x00c5:
            if (r21 == 0) goto L_0x00da
            if (r9 != 0) goto L_0x00d5
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d5
            java.lang.String r0 = ", ]"
            r5.append(r0)
            goto L_0x00da
        L_0x00d5:
            r0 = 93
            r5.append(r0)
        L_0x00da:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResourceDeclareStyleableIntArray.toStringHelper(o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, boolean, boolean):java.lang.String");
    }

    private static String js_join(SecureQwertyKeyboard.AnonymousClass1 r7, LogUtils logUtils, Object[] objArr) {
        Object obj;
        long lengthProperty = getLengthProperty(r7, logUtils);
        int i = (int) lengthProperty;
        if (lengthProperty == ((long) i)) {
            int i2 = 0;
            String min = (objArr.length <= 0 || objArr[0] == checkOpen.instance) ? "," : LogItem.getMin(objArr[0]);
            if (logUtils instanceof getResourceDeclareStyleableIntArray) {
                getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils;
                if (getresourcedeclarestyleableintarray.denseOnly) {
                    StringBuilder sb = new StringBuilder();
                    while (i2 < i) {
                        if (i2 != 0) {
                            sb.append(min);
                        }
                        Object[] objArr2 = getresourcedeclarestyleableintarray.dense;
                        if (!(i2 >= objArr2.length || (obj = objArr2[i2]) == null || obj == checkOpen.instance || obj == LogUtils.getMax)) {
                            sb.append(LogItem.getMin(obj));
                        }
                        i2++;
                    }
                    return sb.toString();
                }
            }
            if (i == 0) {
                return "";
            }
            String[] strArr = new String[i];
            int i3 = 0;
            for (int i4 = 0; i4 != i; i4++) {
                Object elem = getElem(r7, logUtils, (long) i4);
                if (!(elem == null || elem == checkOpen.instance)) {
                    String min2 = LogItem.getMin(elem);
                    i3 += min2.length();
                    strArr[i4] = min2;
                }
            }
            StringBuilder sb2 = new StringBuilder(i3 + ((i - 1) * min.length()));
            while (i2 != i) {
                if (i2 != 0) {
                    sb2.append(min);
                }
                String str = strArr[i2];
                if (str != null) {
                    sb2.append(str);
                }
                i2++;
            }
            return sb2.toString();
        }
        throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.arraylength.too.big", (Object) String.valueOf(lengthProperty));
    }

    private static LogUtils js_reverse(SecureQwertyKeyboard.AnonymousClass1 r11, LogUtils logUtils, Object[] objArr) {
        if (logUtils instanceof getResourceDeclareStyleableIntArray) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils;
            if (getresourcedeclarestyleableintarray.denseOnly) {
                int i = 0;
                for (int i2 = ((int) getresourcedeclarestyleableintarray.length) - 1; i < i2; i2--) {
                    Object[] objArr2 = getresourcedeclarestyleableintarray.dense;
                    Object obj = objArr2[i];
                    objArr2[i] = objArr2[i2];
                    objArr2[i2] = obj;
                    i++;
                }
                return logUtils;
            }
        }
        long lengthProperty = getLengthProperty(r11, logUtils);
        long j = lengthProperty / 2;
        for (long j2 = 0; j2 < j; j2++) {
            long j3 = (lengthProperty - j2) - 1;
            Object rawElem = getRawElem(logUtils, j2);
            setRawElem(r11, logUtils, j2, getRawElem(logUtils, j3));
            setRawElem(r11, logUtils, j3, rawElem);
        }
        return logUtils;
    }

    private static LogUtils js_sort(SecureQwertyKeyboard.AnonymousClass1 r9, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        Comparator comparator;
        if (objArr.length <= 0 || checkOpen.instance == objArr[0]) {
            comparator = DEFAULT_COMPARATOR;
        } else {
            final announceSwitchKeyboard max = LogItem.getMax(objArr[0], r9);
            final LogUtils floatRange = LogItem.toFloatRange(r9);
            final Object[] objArr2 = new Object[2];
            final SecureQwertyKeyboard.AnonymousClass1 r6 = r9;
            final LogUtils logUtils3 = logUtils;
            comparator = new length(new Comparator<Object>() {
                public final int compare(Object obj, Object obj2) {
                    Object[] objArr = objArr2;
                    objArr[0] = obj;
                    objArr[1] = obj2;
                    double max = LogItem.getMax(max.call(r6, logUtils3, floatRange, objArr));
                    if (max < 0.0d) {
                        return -1;
                    }
                    return max > 0.0d ? 1 : 0;
                }
            });
        }
        long lengthProperty = getLengthProperty(r9, logUtils2);
        int i = (int) lengthProperty;
        if (lengthProperty == ((long) i)) {
            Object[] objArr3 = new Object[i];
            for (int i2 = 0; i2 != i; i2++) {
                objArr3[i2] = getRawElem(logUtils2, (long) i2);
            }
            F2fPayInitFacade.getMax(objArr3, 0, i - 1, comparator, ((int) (Math.log10((double) i) / Math.log10(2.0d))) * 2);
            for (int i3 = 0; i3 < i; i3++) {
                setRawElem(r9, logUtils2, (long) i3, objArr3[i3]);
            }
            return logUtils2;
        }
        throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.arraylength.too.big", (Object) String.valueOf(lengthProperty));
    }

    private static Object js_push(SecureQwertyKeyboard.AnonymousClass1 r6, LogUtils logUtils, Object[] objArr) {
        int i = 0;
        if (logUtils instanceof getResourceDeclareStyleableIntArray) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils;
            if (getresourcedeclarestyleableintarray.denseOnly && getresourcedeclarestyleableintarray.ensureCapacity(((int) getresourcedeclarestyleableintarray.length) + objArr.length)) {
                while (i < objArr.length) {
                    Object[] objArr2 = getresourcedeclarestyleableintarray.dense;
                    long j = getresourcedeclarestyleableintarray.length;
                    getresourcedeclarestyleableintarray.length = 1 + j;
                    objArr2[(int) j] = objArr[i];
                    i++;
                }
                return LogItem.getMax((double) getresourcedeclarestyleableintarray.length);
            }
        }
        long lengthProperty = getLengthProperty(r6, logUtils);
        while (i < objArr.length) {
            setElem(r6, logUtils, ((long) i) + lengthProperty, objArr[i]);
            i++;
        }
        Object lengthProperty2 = setLengthProperty(r6, logUtils, lengthProperty + ((long) objArr.length));
        if (r6.IsOverlapping == 120) {
            return objArr.length == 0 ? checkOpen.instance : objArr[objArr.length - 1];
        }
        return lengthProperty2;
    }

    private static Object js_pop(SecureQwertyKeyboard.AnonymousClass1 r7, LogUtils logUtils, Object[] objArr) {
        Object obj;
        if (logUtils instanceof getResourceDeclareStyleableIntArray) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils;
            if (getresourcedeclarestyleableintarray.denseOnly) {
                long j = getresourcedeclarestyleableintarray.length;
                if (j > 0) {
                    long j2 = j - 1;
                    getresourcedeclarestyleableintarray.length = j2;
                    Object[] objArr2 = getresourcedeclarestyleableintarray.dense;
                    Object obj2 = objArr2[(int) j2];
                    objArr2[(int) j2] = getMax;
                    return obj2;
                }
            }
        }
        long lengthProperty = getLengthProperty(r7, logUtils);
        if (lengthProperty > 0) {
            lengthProperty--;
            obj = getElem(r7, logUtils, lengthProperty);
            deleteElem(logUtils, lengthProperty);
        } else {
            obj = checkOpen.instance;
        }
        setLengthProperty(r7, logUtils, lengthProperty);
        return obj;
    }

    private static Object js_shift(SecureQwertyKeyboard.AnonymousClass1 r9, LogUtils logUtils, Object[] objArr) {
        Object obj;
        if (logUtils instanceof getResourceDeclareStyleableIntArray) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils;
            if (getresourcedeclarestyleableintarray.denseOnly) {
                long j = getresourcedeclarestyleableintarray.length;
                if (j > 0) {
                    long j2 = j - 1;
                    getresourcedeclarestyleableintarray.length = j2;
                    Object[] objArr2 = getresourcedeclarestyleableintarray.dense;
                    Object obj2 = objArr2[0];
                    System.arraycopy(objArr2, 1, objArr2, 0, (int) j2);
                    getresourcedeclarestyleableintarray.dense[(int) getresourcedeclarestyleableintarray.length] = getMax;
                    return obj2 == getMax ? checkOpen.instance : obj2;
                }
            }
        }
        long lengthProperty = getLengthProperty(r9, logUtils);
        if (lengthProperty > 0) {
            lengthProperty--;
            obj = getElem(r9, logUtils, 0);
            if (lengthProperty > 0) {
                for (long j3 = 1; j3 <= lengthProperty; j3++) {
                    setRawElem(r9, logUtils, j3 - 1, getRawElem(logUtils, j3));
                }
            }
            deleteElem(logUtils, lengthProperty);
        } else {
            obj = checkOpen.instance;
        }
        setLengthProperty(r9, logUtils, lengthProperty);
        return obj;
    }

    private static Object js_unshift(SecureQwertyKeyboard.AnonymousClass1 r13, LogUtils logUtils, Object[] objArr) {
        int i = 0;
        if (logUtils instanceof getResourceDeclareStyleableIntArray) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils;
            if (getresourcedeclarestyleableintarray.denseOnly && getresourcedeclarestyleableintarray.ensureCapacity(((int) getresourcedeclarestyleableintarray.length) + objArr.length)) {
                Object[] objArr2 = getresourcedeclarestyleableintarray.dense;
                System.arraycopy(objArr2, 0, objArr2, objArr.length, (int) getresourcedeclarestyleableintarray.length);
                while (i < objArr.length) {
                    getresourcedeclarestyleableintarray.dense[i] = objArr[i];
                    i++;
                }
                long length2 = getresourcedeclarestyleableintarray.length + ((long) objArr.length);
                getresourcedeclarestyleableintarray.length = length2;
                return LogItem.getMax((double) length2);
            }
        }
        long lengthProperty = getLengthProperty(r13, logUtils);
        int length3 = objArr.length;
        if (objArr.length > 0) {
            if (lengthProperty > 0) {
                for (long j = lengthProperty - 1; j >= 0; j--) {
                    setRawElem(r13, logUtils, ((long) length3) + j, getRawElem(logUtils, j));
                }
            }
            while (i < objArr.length) {
                setElem(r13, logUtils, (long) i, objArr[i]);
                i++;
            }
        }
        return setLengthProperty(r13, logUtils, lengthProperty + ((long) objArr.length));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b A[LOOP:4: B:72:0x0149->B:73:0x014b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object js_splice(o.SecureQwertyKeyboard.AnonymousClass1 r25, o.LogUtils r26, o.LogUtils r27, java.lang.Object[] r28) {
        /*
            r0 = r25
            r1 = r27
            r2 = r28
            boolean r3 = r1 instanceof o.getResourceDeclareStyleableIntArray
            r4 = 0
            if (r3 == 0) goto L_0x0011
            r3 = r1
            o.getResourceDeclareStyleableIntArray r3 = (o.getResourceDeclareStyleableIntArray) r3
            boolean r5 = r3.denseOnly
            goto L_0x0013
        L_0x0011:
            r3 = 0
            r5 = 0
        L_0x0013:
            o.LogUtils r6 = getTopLevelScope(r26)
            int r7 = r2.length
            if (r7 != 0) goto L_0x001f
            o.LogUtils r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r6, (int) r4)
            return r0
        L_0x001f:
            long r8 = getLengthProperty(r0, r1)
            r10 = r2[r4]
            double r10 = o.LogItem.length((java.lang.Object) r10)
            long r10 = toSliceIndex(r10, r8)
            int r7 = r7 + -1
            int r12 = r2.length
            r13 = 1
            if (r12 != r13) goto L_0x0038
            long r12 = r8 - r10
            r17 = r5
            goto L_0x0057
        L_0x0038:
            r12 = r2[r13]
            double r12 = o.LogItem.length((java.lang.Object) r12)
            r16 = 0
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x0049
            r17 = r5
            r12 = 0
            goto L_0x0055
        L_0x0049:
            r17 = r5
            long r4 = r8 - r10
            double r14 = (double) r4
            int r20 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r20 <= 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            long r4 = (long) r12
        L_0x0054:
            r12 = r4
        L_0x0055:
            int r7 = r7 + -1
        L_0x0057:
            long r4 = r10 + r12
            r14 = 120(0x78, float:1.68E-43)
            r20 = 1
            r18 = 0
            int r15 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r15 == 0) goto L_0x00af
            int r15 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r15 != 0) goto L_0x0074
            int r15 = r0.IsOverlapping
            if (r15 != r14) goto L_0x0074
            java.lang.Object r6 = getElem(r0, r1, r10)
            r22 = r3
            r23 = r8
            goto L_0x00b9
        L_0x0074:
            if (r17 == 0) goto L_0x008b
            long r14 = r4 - r10
            int r15 = (int) r14
            java.lang.Object[] r14 = new java.lang.Object[r15]
            java.lang.Object[] r2 = r3.dense
            r22 = r3
            int r3 = (int) r10
            r23 = r8
            r8 = 0
            java.lang.System.arraycopy(r2, r3, r14, r8, r15)
            o.LogUtils r6 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r6, (java.lang.Object[]) r14)
            goto L_0x00b9
        L_0x008b:
            r22 = r3
            r23 = r8
            r8 = 0
            o.LogUtils r6 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r6, (int) r8)
            r2 = r10
        L_0x0095:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00a9
            java.lang.Object r8 = getRawElem(r1, r2)
            java.lang.Object r9 = getMax
            if (r8 == r9) goto L_0x00a6
            long r14 = r2 - r10
            setElem(r0, r6, r14, r8)
        L_0x00a6:
            long r2 = r2 + r20
            goto L_0x0095
        L_0x00a9:
            long r2 = r4 - r10
            setLengthProperty(r0, r6, r2)
            goto L_0x00b9
        L_0x00af:
            r22 = r3
            r23 = r8
            int r2 = r0.IsOverlapping
            if (r2 != r14) goto L_0x00bb
            java.lang.Object r6 = o.checkOpen.instance
        L_0x00b9:
            r2 = 0
            goto L_0x00c0
        L_0x00bb:
            r2 = 0
            o.LogUtils r6 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r6, (int) r2)
        L_0x00c0:
            long r8 = (long) r7
            long r12 = r8 - r12
            if (r17 == 0) goto L_0x0100
            long r14 = r23 + r12
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0100
            int r3 = (int) r14
            r2 = r22
            boolean r17 = r2.ensureCapacity(r3)
            if (r17 == 0) goto L_0x0100
            java.lang.Object[] r0 = r2.dense
            int r1 = (int) r4
            long r8 = r8 + r10
            int r9 = (int) r8
            long r4 = r23 - r4
            int r5 = (int) r4
            java.lang.System.arraycopy(r0, r1, r0, r9, r5)
            if (r7 <= 0) goto L_0x00ed
            r0 = 2
            java.lang.Object[] r1 = r2.dense
            int r4 = (int) r10
            r8 = r28
            java.lang.System.arraycopy(r8, r0, r1, r4, r7)
        L_0x00ed:
            r0 = 0
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fd
            java.lang.Object[] r0 = r2.dense
            r4 = r23
            int r1 = (int) r4
            java.lang.Object r4 = getMax
            java.util.Arrays.fill(r0, r3, r1, r4)
        L_0x00fd:
            r2.length = r14
            return r6
        L_0x0100:
            r8 = r28
            r2 = r23
            r14 = 0
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0120
            long r14 = r2 - r20
        L_0x010c:
            int r9 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0146
            java.lang.Object r9 = getRawElem(r1, r14)
            r17 = r4
            long r4 = r14 + r12
            setRawElem(r0, r1, r4, r9)
            long r14 = r14 - r20
            r4 = r17
            goto L_0x010c
        L_0x0120:
            r17 = r4
            r4 = 0
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0146
            r4 = r17
        L_0x012a:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x013a
            java.lang.Object r9 = getRawElem(r1, r4)
            long r14 = r4 + r12
            setRawElem(r0, r1, r14, r9)
            long r4 = r4 + r20
            goto L_0x012a
        L_0x013a:
            long r4 = r2 + r12
        L_0x013c:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x0146
            deleteElem(r1, r4)
            long r4 = r4 + r20
            goto L_0x013c
        L_0x0146:
            int r4 = r8.length
            int r4 = r4 - r7
            r5 = 0
        L_0x0149:
            if (r5 >= r7) goto L_0x0157
            long r14 = (long) r5
            long r14 = r14 + r10
            int r9 = r5 + r4
            r9 = r8[r9]
            setElem(r0, r1, r14, r9)
            int r5 = r5 + 1
            goto L_0x0149
        L_0x0157:
            long r8 = r2 + r12
            setLengthProperty(r0, r1, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResourceDeclareStyleableIntArray.js_splice(o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, java.lang.Object[]):java.lang.Object");
    }

    private static LogUtils js_concat(SecureQwertyKeyboard.AnonymousClass1 r16, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        long j;
        SecureQwertyKeyboard.AnonymousClass1 r0 = r16;
        LogUtils logUtils3 = logUtils2;
        Object[] objArr2 = objArr;
        int i = 0;
        LogUtils max = SecureQwertyKeyboard.AnonymousClass1.getMax(getTopLevelScope(logUtils), 0);
        if (logUtils3 instanceof getResourceDeclareStyleableIntArray) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils3;
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray2 = (getResourceDeclareStyleableIntArray) max;
            if (getresourcedeclarestyleableintarray.denseOnly && getresourcedeclarestyleableintarray2.denseOnly) {
                int i2 = (int) getresourcedeclarestyleableintarray.length;
                boolean z = true;
                for (int i3 = 0; i3 < objArr2.length && z; i3++) {
                    if (objArr2[i3] instanceof getResourceDeclareStyleableIntArray) {
                        getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray3 = (getResourceDeclareStyleableIntArray) objArr2[i3];
                        boolean z2 = getresourcedeclarestyleableintarray3.denseOnly;
                        i2 = (int) (((long) i2) + getresourcedeclarestyleableintarray3.length);
                        z = z2;
                    } else {
                        i2++;
                    }
                }
                if (z && getresourcedeclarestyleableintarray2.ensureCapacity(i2)) {
                    System.arraycopy(getresourcedeclarestyleableintarray.dense, 0, getresourcedeclarestyleableintarray2.dense, 0, (int) getresourcedeclarestyleableintarray.length);
                    int i4 = (int) getresourcedeclarestyleableintarray.length;
                    for (int i5 = 0; i5 < objArr2.length && z; i5++) {
                        if (objArr2[i5] instanceof getResourceDeclareStyleableIntArray) {
                            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray4 = (getResourceDeclareStyleableIntArray) objArr2[i5];
                            System.arraycopy(getresourcedeclarestyleableintarray4.dense, 0, getresourcedeclarestyleableintarray2.dense, i4, (int) getresourcedeclarestyleableintarray4.length);
                            i4 += (int) getresourcedeclarestyleableintarray4.length;
                        } else {
                            getresourcedeclarestyleableintarray2.dense[i4] = objArr2[i5];
                            i4++;
                        }
                    }
                    getresourcedeclarestyleableintarray2.length = (long) i2;
                    return max;
                }
            }
        }
        long j2 = 0;
        if (js_isArray(logUtils2)) {
            long lengthProperty = getLengthProperty(r0, logUtils3);
            j = 0;
            while (j < lengthProperty) {
                Object rawElem = getRawElem(logUtils3, j);
                if (rawElem != getMax) {
                    defineElem(r0, max, j, rawElem);
                }
                j++;
            }
        } else {
            defineElem(r0, max, 0, logUtils3);
            j = 1;
        }
        while (i < objArr2.length) {
            if (js_isArray(objArr2[i])) {
                LogUtils logUtils4 = (LogUtils) objArr2[i];
                long lengthProperty2 = getLengthProperty(r0, logUtils4);
                long j3 = j2;
                while (j3 < lengthProperty2) {
                    Object rawElem2 = getRawElem(logUtils4, j3);
                    if (rawElem2 != getMax) {
                        defineElem(r0, max, j, rawElem2);
                    }
                    j3++;
                    j++;
                }
            } else {
                defineElem(r0, max, j, objArr2[i]);
                j++;
            }
            i++;
            j2 = 0;
        }
        setLengthProperty(r0, max, j);
        return max;
    }

    private LogUtils js_slice(SecureQwertyKeyboard.AnonymousClass1 r16, LogUtils logUtils, Object[] objArr) {
        long j;
        SecureQwertyKeyboard.AnonymousClass1 r0 = r16;
        Object[] objArr2 = objArr;
        LogUtils max = SecureQwertyKeyboard.AnonymousClass1.getMax(getTopLevelScope(this), 0);
        long lengthProperty = getLengthProperty(r16, logUtils);
        if (objArr2.length == 0) {
            j = 0;
        } else {
            j = toSliceIndex(LogItem.length(objArr2[0]), lengthProperty);
            if (!(objArr2.length == 1 || objArr2[1] == checkOpen.instance)) {
                lengthProperty = toSliceIndex(LogItem.length(objArr2[1]), lengthProperty);
            }
        }
        for (long j2 = j; j2 < lengthProperty; j2++) {
            Object rawElem = getRawElem(logUtils, j2);
            if (rawElem != getMax) {
                defineElem(r0, max, j2 - j, rawElem);
            }
        }
        setLengthProperty(r0, max, Math.max(0, lengthProperty - j));
        return max;
    }

    private static long toSliceIndex(double d, long j) {
        if (d < 0.0d) {
            double d2 = (double) j;
            Double.isNaN(d2);
            d += d2;
            if (d < 0.0d) {
                return 0;
            }
        } else if (d > ((double) j)) {
            return j;
        }
        return (long) d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r8 < 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object js_indexOf(o.SecureQwertyKeyboard.AnonymousClass1 r10, o.LogUtils r11, java.lang.Object[] r12) {
        /*
            int r0 = r12.length
            if (r0 <= 0) goto L_0x0007
            r0 = 0
            r0 = r12[r0]
            goto L_0x0009
        L_0x0007:
            java.lang.Object r0 = o.checkOpen.instance
        L_0x0009:
            long r1 = getLengthProperty(r10, r11)
            int r10 = r12.length
            r3 = 2
            r4 = 1
            r6 = 0
            if (r10 >= r3) goto L_0x0016
            goto L_0x0032
        L_0x0016:
            r10 = 1
            r10 = r12[r10]
            double r8 = o.LogItem.length((java.lang.Object) r10)
            long r8 = (long) r8
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0028
            long r8 = r8 + r1
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r6 = r8
        L_0x0029:
            long r8 = r1 - r4
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0032
            java.lang.Integer r10 = NEGATIVE_ONE
            return r10
        L_0x0032:
            boolean r10 = r11 instanceof o.getResourceDeclareStyleableIntArray
            if (r10 == 0) goto L_0x006a
            r10 = r11
            o.getResourceDeclareStyleableIntArray r10 = (o.getResourceDeclareStyleableIntArray) r10
            boolean r12 = r10.denseOnly
            if (r12 == 0) goto L_0x006a
            o.LogUtils r11 = r10.getPrototype()
            int r12 = (int) r6
        L_0x0042:
            long r3 = (long) r12
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0067
            java.lang.Object[] r5 = r10.dense
            r5 = r5[r12]
            java.lang.Object r6 = getMax
            if (r5 != r6) goto L_0x0055
            if (r11 == 0) goto L_0x0055
            java.lang.Object r5 = org.mozilla.javascript.ScriptableObject.getProperty((o.LogUtils) r11, (int) r12)
        L_0x0055:
            java.lang.Object r6 = getMax
            if (r5 == r6) goto L_0x0064
            boolean r5 = o.LogItem.length((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 == 0) goto L_0x0064
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            return r10
        L_0x0064:
            int r12 = r12 + 1
            goto L_0x0042
        L_0x0067:
            java.lang.Integer r10 = NEGATIVE_ONE
            return r10
        L_0x006a:
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0083
            java.lang.Object r10 = getRawElem(r11, r6)
            java.lang.Object r12 = getMax
            if (r10 == r12) goto L_0x0081
            boolean r10 = o.LogItem.length((java.lang.Object) r10, (java.lang.Object) r0)
            if (r10 == 0) goto L_0x0081
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            return r10
        L_0x0081:
            long r6 = r6 + r4
            goto L_0x006a
        L_0x0083:
            java.lang.Integer r10 = NEGATIVE_ONE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResourceDeclareStyleableIntArray.js_indexOf(o.SecureQwertyKeyboard$1, o.LogUtils, java.lang.Object[]):java.lang.Object");
    }

    private static Object js_lastIndexOf(SecureQwertyKeyboard.AnonymousClass1 r10, LogUtils logUtils, Object[] objArr) {
        long j;
        Object obj = objArr.length > 0 ? objArr[0] : checkOpen.instance;
        long lengthProperty = getLengthProperty(r10, logUtils);
        if (objArr.length < 2) {
            j = lengthProperty - 1;
        } else {
            long length2 = (long) LogItem.length(objArr[1]);
            if (length2 >= lengthProperty) {
                j = lengthProperty - 1;
            } else {
                if (length2 < 0) {
                    length2 += lengthProperty;
                }
                j = length2;
            }
            if (j < 0) {
                return NEGATIVE_ONE;
            }
        }
        if (logUtils instanceof getResourceDeclareStyleableIntArray) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) logUtils;
            if (getresourcedeclarestyleableintarray.denseOnly) {
                LogUtils prototype = getresourcedeclarestyleableintarray.getPrototype();
                for (int i = (int) j; i >= 0; i--) {
                    Object obj2 = getresourcedeclarestyleableintarray.dense[i];
                    if (obj2 == getMax && prototype != null) {
                        obj2 = ScriptableObject.getProperty(prototype, i);
                    }
                    if (obj2 != getMax && LogItem.length(obj2, obj)) {
                        return Long.valueOf((long) i);
                    }
                }
                return NEGATIVE_ONE;
            }
        }
        while (j >= 0) {
            Object rawElem = getRawElem(logUtils, j);
            if (rawElem != getMax && LogItem.length(rawElem, obj)) {
                return Long.valueOf(j);
            }
            j--;
        }
        return NEGATIVE_ONE;
    }

    private static Object iterativeMethod(SecureQwertyKeyboard.AnonymousClass1 r24, EditTextUtil editTextUtil, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        LogUtils logUtils3;
        long j;
        long j2;
        SecureQwertyKeyboard.AnonymousClass1 r0 = r24;
        LogUtils logUtils4 = logUtils;
        LogUtils logUtils5 = logUtils2;
        Object[] objArr2 = objArr;
        int abs = Math.abs(editTextUtil.methodId());
        int i = 23;
        int i2 = 22;
        if ((22 == abs || 23 == abs) && (logUtils5 == null || checkOpen.isUndefined(logUtils2))) {
            throw LogItem.setMin("msg.called.null.or.undefined", editTextUtil.getTag(), (Object) editTextUtil.getFunctionName());
        }
        long lengthProperty = getLengthProperty(r0, logUtils5);
        Object obj = objArr2.length > 0 ? objArr2[0] : checkOpen.instance;
        if (obj == null || !(obj instanceof doCheck)) {
            throw LogItem.toString(obj);
        } else if (r0.IsOverlapping < 200 || !(obj instanceof BisFaceUploadContent)) {
            doCheck docheck = (doCheck) obj;
            LogUtils topLevelScope = ScriptableObject.getTopLevelScope(docheck);
            LogUtils min = (objArr2.length < 2 || objArr2[1] == null || objArr2[1] == checkOpen.instance) ? topLevelScope : LogItem.setMin(r0, logUtils4, objArr2[1]);
            if (abs == 18 || abs == 20) {
                logUtils3 = SecureQwertyKeyboard.AnonymousClass1.getMax(logUtils4, abs == 20 ? (int) lengthProperty : 0);
            } else {
                logUtils3 = null;
            }
            long j3 = 0;
            long j4 = 0;
            while (j3 < lengthProperty) {
                Object[] objArr3 = new Object[3];
                Object rawElem = getRawElem(logUtils5, j3);
                if (rawElem == LogUtils.getMax) {
                    if (abs == i2 || abs == i) {
                        rawElem = checkOpen.instance;
                    } else {
                        j = lengthProperty;
                        j2 = j4;
                        j4 = j2;
                        j3++;
                        lengthProperty = j;
                        i = 23;
                        i2 = 22;
                    }
                }
                objArr3[0] = rawElem;
                objArr3[1] = Long.valueOf(j3);
                objArr3[2] = logUtils5;
                Object call = docheck.call(r0, topLevelScope, min, objArr3);
                switch (abs) {
                    case 17:
                        j = lengthProperty;
                        j2 = j4;
                        if (!LogItem.setMax(call)) {
                            return Boolean.FALSE;
                        }
                        break;
                    case 18:
                        if (LogItem.setMax(call)) {
                            j = lengthProperty;
                            long j5 = j4;
                            j4 = j5 + 1;
                            defineElem(r0, logUtils3, j5, objArr3[0]);
                            continue;
                        }
                        break;
                    case 20:
                        defineElem(r0, logUtils3, j3, call);
                        break;
                    case 21:
                        if (LogItem.setMax(call)) {
                            return Boolean.TRUE;
                        }
                        break;
                    case 22:
                        if (LogItem.setMax(call)) {
                            return rawElem;
                        }
                        break;
                    case 23:
                        if (LogItem.setMax(call)) {
                            return LogItem.getMax((double) j3);
                        }
                        break;
                }
                j = lengthProperty;
                j2 = j4;
                j4 = j2;
                j3++;
                lengthProperty = j;
                i = 23;
                i2 = 22;
            }
            switch (abs) {
                case 17:
                    return Boolean.TRUE;
                case 18:
                case 20:
                    return logUtils3;
                case 21:
                    return Boolean.FALSE;
                case 23:
                    return LogItem.getMax(-1.0d);
                default:
                    return checkOpen.instance;
            }
        } else {
            throw LogItem.toString(obj);
        }
    }

    private static Object reduceMethod(SecureQwertyKeyboard.AnonymousClass1 r16, int i, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        SecureQwertyKeyboard.AnonymousClass1 r0 = r16;
        LogUtils logUtils3 = logUtils2;
        Object[] objArr2 = objArr;
        long lengthProperty = getLengthProperty(r0, logUtils3);
        Object obj = objArr2.length > 0 ? objArr2[0] : checkOpen.instance;
        if (obj == null || !(obj instanceof doCheck)) {
            throw LogItem.toString(obj);
        }
        doCheck docheck = (doCheck) obj;
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(docheck);
        boolean z = i == 24;
        Object obj2 = objArr2.length > 1 ? objArr2[1] : LogUtils.getMax;
        for (long j = 0; j < lengthProperty; j++) {
            long j2 = z ? j : (lengthProperty - 1) - j;
            Object rawElem = getRawElem(logUtils3, j2);
            if (rawElem != LogUtils.getMax) {
                if (obj2 == LogUtils.getMax) {
                    obj2 = rawElem;
                } else {
                    obj2 = docheck.call(r0, topLevelScope, topLevelScope, new Object[]{obj2, rawElem, Long.valueOf(j2), logUtils3});
                }
            }
        }
        if (obj2 != LogUtils.getMax) {
            return obj2;
        }
        throw LogItem.toFloatRange("msg.empty.array.reduce");
    }

    private static boolean js_isArray(Object obj) {
        if (!(obj instanceof LogUtils)) {
            return false;
        }
        return "Array".equals(((LogUtils) obj).getClassName());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public Object[] toArray() {
        return toArray(LogItem.create);
    }

    public Object[] toArray(Object[] objArr) {
        long j = this.length;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = get(i2);
            }
            return objArr;
        }
        throw new IllegalStateException();
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        long j = this.length;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Object get(long j) {
        if (j < 0 || j >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        Object rawElem = getRawElem(this, j);
        if (rawElem == LogUtils.getMax || rawElem == checkOpen.instance) {
            return null;
        }
        return rawElem instanceof UniResultF2fpayOrderInfo ? ((UniResultF2fpayOrderInfo) rawElem).unwrap() : rawElem;
    }

    public Object get(int i) {
        return get((long) i);
    }

    public int indexOf(Object obj) {
        long j = this.length;
        if (j <= 2147483647L) {
            int i = (int) j;
            int i2 = 0;
            if (obj == null) {
                while (i2 < i) {
                    if (get(i2) == null) {
                        return i2;
                    }
                    i2++;
                }
                return -1;
            }
            while (i2 < i) {
                if (obj.equals(get(i2))) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        throw new IllegalStateException();
    }

    public int lastIndexOf(Object obj) {
        long j = this.length;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (obj == null) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (get(i2) == null) {
                        return i2;
                    }
                }
                return -1;
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (obj.equals(get(i3))) {
                    return i3;
                }
            }
            return -1;
        }
        throw new IllegalStateException();
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public ListIterator listIterator(final int i) {
        long j = this.length;
        if (j <= 2147483647L) {
            final int i2 = (int) j;
            if (i >= 0 && i <= i2) {
                return new ListIterator() {
                    int getMax = i;

                    public final boolean hasNext() {
                        return this.getMax < i2;
                    }

                    public final Object next() {
                        int i = this.getMax;
                        if (i != i2) {
                            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = getResourceDeclareStyleableIntArray.this;
                            this.getMax = i + 1;
                            return getresourcedeclarestyleableintarray.get(i);
                        }
                        throw new NoSuchElementException();
                    }

                    public final boolean hasPrevious() {
                        return this.getMax > 0;
                    }

                    public final Object previous() {
                        int i = this.getMax;
                        if (i != 0) {
                            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = getResourceDeclareStyleableIntArray.this;
                            int i2 = i - 1;
                            this.getMax = i2;
                            return getresourcedeclarestyleableintarray.get(i2);
                        }
                        throw new NoSuchElementException();
                    }

                    public final int nextIndex() {
                        return this.getMax;
                    }

                    public final int previousIndex() {
                        return this.getMax - 1;
                    }

                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }

                    public final void add(Object obj) {
                        throw new UnsupportedOperationException();
                    }

                    public final void set(Object obj) {
                        throw new UnsupportedOperationException();
                    }
                };
            }
            throw new IndexOutOfBoundsException("Index: ".concat(String.valueOf(i)));
        }
        throw new IllegalStateException();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public List subList(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public int findPrototypeId(record record) {
        return F2fpaySwitchFacade.ITERATOR.equals(record) ? 26 : 0;
    }

    public static final class getMin implements Comparator<Object> {
        public final int compare(Object obj, Object obj2) {
            return LogItem.getMin(obj).compareTo(LogItem.getMin(obj2));
        }
    }

    public static final class length implements Comparator<Object> {
        private final Comparator<Object> setMin;

        public length() {
            this.setMin = getResourceDeclareStyleableIntArray.STRING_COMPARATOR;
        }

        public length(Comparator<Object> comparator) {
            this.setMin = comparator;
        }

        public final int compare(Object obj, Object obj2) {
            if (obj == checkOpen.instance) {
                if (obj2 == checkOpen.instance) {
                    return 0;
                }
                return obj2 == LogUtils.getMax ? -1 : 1;
            } else if (obj == LogUtils.getMax) {
                return obj2 == LogUtils.getMax ? 0 : 1;
            } else {
                if (obj2 == LogUtils.getMax || obj2 == checkOpen.instance) {
                    return -1;
                }
                return this.setMin.compare(obj, obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int findPrototypeId(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r17.length()
            r2 = 108(0x6c, float:1.51E-43)
            r3 = 3
            r4 = 99
            r5 = 14
            r6 = 11
            r7 = 1
            r8 = 114(0x72, float:1.6E-43)
            r9 = 2
            r10 = 0
            if (r1 == r6) goto L_0x0103
            if (r1 == r5) goto L_0x0100
            r11 = 111(0x6f, float:1.56E-43)
            r12 = 102(0x66, float:1.43E-43)
            r13 = 115(0x73, float:1.61E-43)
            r14 = 105(0x69, float:1.47E-43)
            r15 = 109(0x6d, float:1.53E-43)
            switch(r1) {
                case 3: goto L_0x00d6;
                case 4: goto L_0x00ae;
                case 5: goto L_0x008e;
                case 6: goto L_0x0068;
                case 7: goto L_0x0041;
                case 8: goto L_0x002d;
                case 9: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x011b
        L_0x0027:
            r3 = 23
            java.lang.String r1 = "findIndex"
            goto L_0x011d
        L_0x002d:
            char r1 = r0.charAt(r3)
            if (r1 != r11) goto L_0x0038
            r3 = 4
            java.lang.String r1 = "toSource"
            goto L_0x011d
        L_0x0038:
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L_0x011b
            java.lang.String r1 = "toString"
            r3 = 2
            goto L_0x011d
        L_0x0041:
            char r1 = r0.charAt(r10)
            if (r1 == r12) goto L_0x0062
            if (r1 == r14) goto L_0x005c
            if (r1 == r8) goto L_0x0057
            r2 = 117(0x75, float:1.64E-43)
            if (r1 == r2) goto L_0x0051
            goto L_0x011b
        L_0x0051:
            java.lang.String r1 = "unshift"
            r3 = 11
            goto L_0x011d
        L_0x0057:
            r3 = 6
            java.lang.String r1 = "reverse"
            goto L_0x011d
        L_0x005c:
            r3 = 15
            java.lang.String r1 = "indexOf"
            goto L_0x011d
        L_0x0062:
            r3 = 19
            java.lang.String r1 = "forEach"
            goto L_0x011d
        L_0x0068:
            char r1 = r0.charAt(r10)
            if (r1 == r4) goto L_0x0088
            if (r1 == r12) goto L_0x0082
            if (r1 == r8) goto L_0x007c
            if (r1 == r13) goto L_0x0076
            goto L_0x011b
        L_0x0076:
            r3 = 12
            java.lang.String r1 = "splice"
            goto L_0x011d
        L_0x007c:
            r3 = 24
            java.lang.String r1 = "reduce"
            goto L_0x011d
        L_0x0082:
            r3 = 18
            java.lang.String r1 = "filter"
            goto L_0x011d
        L_0x0088:
            r3 = 13
            java.lang.String r1 = "concat"
            goto L_0x011d
        L_0x008e:
            char r1 = r0.charAt(r7)
            r3 = 104(0x68, float:1.46E-43)
            if (r1 != r3) goto L_0x009c
            r3 = 10
            java.lang.String r1 = "shift"
            goto L_0x011d
        L_0x009c:
            if (r1 != r2) goto L_0x00a4
            java.lang.String r1 = "slice"
            r3 = 14
            goto L_0x011d
        L_0x00a4:
            r2 = 118(0x76, float:1.65E-43)
            if (r1 != r2) goto L_0x011b
            r3 = 17
            java.lang.String r1 = "every"
            goto L_0x011d
        L_0x00ae:
            char r1 = r0.charAt(r9)
            if (r1 == r14) goto L_0x00d2
            if (r1 == r15) goto L_0x00cd
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x00c8
            if (r1 == r8) goto L_0x00c4
            if (r1 == r13) goto L_0x00bf
            goto L_0x011b
        L_0x00bf:
            r3 = 8
            java.lang.String r1 = "push"
            goto L_0x011d
        L_0x00c4:
            r3 = 7
            java.lang.String r1 = "sort"
            goto L_0x011d
        L_0x00c8:
            r3 = 22
            java.lang.String r1 = "find"
            goto L_0x011d
        L_0x00cd:
            r3 = 21
            java.lang.String r1 = "some"
            goto L_0x011d
        L_0x00d2:
            r3 = 5
            java.lang.String r1 = "join"
            goto L_0x011d
        L_0x00d6:
            char r1 = r0.charAt(r10)
            r2 = 112(0x70, float:1.57E-43)
            if (r1 != r15) goto L_0x00ef
            char r1 = r0.charAt(r9)
            if (r1 != r2) goto L_0x011b
            char r1 = r0.charAt(r7)
            r2 = 97
            if (r1 != r2) goto L_0x011b
            r10 = 20
            goto L_0x0129
        L_0x00ef:
            if (r1 != r2) goto L_0x011b
            char r1 = r0.charAt(r9)
            if (r1 != r2) goto L_0x011b
            char r1 = r0.charAt(r7)
            if (r1 != r11) goto L_0x011b
            r10 = 9
            goto L_0x0129
        L_0x0100:
            java.lang.String r1 = "toLocaleString"
            goto L_0x011d
        L_0x0103:
            char r1 = r0.charAt(r10)
            if (r1 != r4) goto L_0x010d
            java.lang.String r1 = "constructor"
            r3 = 1
            goto L_0x011d
        L_0x010d:
            if (r1 != r2) goto L_0x0114
            r3 = 16
            java.lang.String r1 = "lastIndexOf"
            goto L_0x011d
        L_0x0114:
            if (r1 != r8) goto L_0x011b
            r3 = 25
            java.lang.String r1 = "reduceRight"
            goto L_0x011d
        L_0x011b:
            r1 = 0
            r3 = 0
        L_0x011d:
            if (r1 == 0) goto L_0x0128
            if (r1 == r0) goto L_0x0128
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r10 = r3
        L_0x0129:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResourceDeclareStyleableIntArray.findPrototypeId(java.lang.String):int");
    }
}
