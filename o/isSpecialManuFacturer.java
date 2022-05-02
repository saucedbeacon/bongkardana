package o;

import java.util.Iterator;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public final class isSpecialManuFacturer implements getStackTraceMessage {
    private int getMax;
    private ScriptableObject.getMax[] getMin;
    private ScriptableObject.getMax setMax;
    private ScriptableObject.getMax setMin;

    static final class getMin implements Iterator<ScriptableObject.getMax> {
        private ScriptableObject.getMax setMax;

        getMin(ScriptableObject.getMax getmax) {
            this.setMax = getmax;
        }

        public final boolean hasNext() {
            return this.setMax != null;
        }

        public final /* bridge */ /* synthetic */ Object next() {
            ScriptableObject.getMax getmax = this.setMax;
            this.setMax = getmax.orderedNext;
            return getmax;
        }
    }

    public final int setMin() {
        return this.getMax;
    }

    public final boolean getMin() {
        return this.getMax == 0;
    }

    public final Iterator<ScriptableObject.getMax> iterator() {
        return new getMin(this.setMax);
    }

    public final ScriptableObject.getMax getMax(Object obj, int i) {
        if (this.getMin == null) {
            return null;
        }
        if (obj != null) {
            i = obj.hashCode();
        }
        ScriptableObject.getMax[] getmaxArr = this.getMin;
        for (ScriptableObject.getMax getmax = getmaxArr[(getmaxArr.length - 1) & i]; getmax != null; getmax = getmax.next) {
            Object obj2 = getmax.name;
            if (i == getmax.indexOrHash && (obj2 == obj || (obj != null && obj.equals(obj2)))) {
                return getmax;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r5 != null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.mozilla.javascript.ScriptableObject.getMax setMin(java.lang.Object r18, int r19, org.mozilla.javascript.ScriptableObject.SlotAccess r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            org.mozilla.javascript.ScriptableObject$getMax[] r3 = r0.getMin
            r4 = 0
            if (r3 != 0) goto L_0x0010
            org.mozilla.javascript.ScriptableObject$SlotAccess r3 = org.mozilla.javascript.ScriptableObject.SlotAccess.QUERY
            if (r2 != r3) goto L_0x0010
            return r4
        L_0x0010:
            if (r1 == 0) goto L_0x0017
            int r3 = r18.hashCode()
            goto L_0x0019
        L_0x0017:
            r3 = r19
        L_0x0019:
            org.mozilla.javascript.ScriptableObject$getMax[] r5 = r0.getMin
            r6 = 2
            r7 = 3
            r8 = 4
            r9 = 1
            if (r5 == 0) goto L_0x005c
            int r10 = r5.length
            int r10 = r10 - r9
            r10 = r10 & r3
            r5 = r5[r10]
        L_0x0026:
            if (r5 == 0) goto L_0x003b
            java.lang.Object r10 = r5.name
            int r11 = r5.indexOrHash
            if (r3 != r11) goto L_0x0038
            if (r10 == r1) goto L_0x003b
            if (r1 == 0) goto L_0x0038
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L_0x003b
        L_0x0038:
            org.mozilla.javascript.ScriptableObject$getMax r5 = r5.next
            goto L_0x0026
        L_0x003b:
            int[] r10 = o.isSpecialManuFacturer.AnonymousClass3.length
            int r11 = r20.ordinal()
            r10 = r10[r11]
            if (r10 == r9) goto L_0x005b
            if (r10 == r6) goto L_0x0059
            if (r10 == r7) goto L_0x0059
            if (r10 == r8) goto L_0x0054
            r11 = 5
            if (r10 == r11) goto L_0x004f
            goto L_0x005d
        L_0x004f:
            boolean r10 = r5 instanceof org.mozilla.javascript.ScriptableObject.setMin
            if (r10 != 0) goto L_0x005d
            return r5
        L_0x0054:
            boolean r10 = r5 instanceof org.mozilla.javascript.ScriptableObject.setMin
            if (r10 == 0) goto L_0x005d
            return r5
        L_0x0059:
            if (r5 == 0) goto L_0x005d
        L_0x005b:
            return r5
        L_0x005c:
            r5 = r4
        L_0x005d:
            int r10 = r0.getMax
            if (r10 != 0) goto L_0x0067
            org.mozilla.javascript.ScriptableObject$getMax[] r5 = new org.mozilla.javascript.ScriptableObject.getMax[r8]
            r0.getMin = r5
            goto L_0x00e8
        L_0x0067:
            if (r5 == 0) goto L_0x00e8
            org.mozilla.javascript.ScriptableObject$getMax[] r5 = r0.getMin
            int r10 = r5.length
            int r10 = r10 - r9
            r10 = r10 & r3
            r5 = r5[r10]
            r11 = r5
        L_0x0071:
            if (r5 == 0) goto L_0x008d
            int r12 = r5.indexOrHash
            if (r12 != r3) goto L_0x0085
            java.lang.Object r12 = r5.name
            if (r12 == r1) goto L_0x008d
            if (r1 == 0) goto L_0x0085
            java.lang.Object r12 = r5.name
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x008d
        L_0x0085:
            org.mozilla.javascript.ScriptableObject$getMax r11 = r5.next
            r16 = r11
            r11 = r5
            r5 = r16
            goto L_0x0071
        L_0x008d:
            if (r5 == 0) goto L_0x00e8
            org.mozilla.javascript.ScriptableObject$SlotAccess r6 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER
            if (r2 != r6) goto L_0x00a1
            boolean r6 = r5 instanceof org.mozilla.javascript.ScriptableObject.setMin
            if (r6 != 0) goto L_0x00a1
            org.mozilla.javascript.ScriptableObject$setMin r2 = new org.mozilla.javascript.ScriptableObject$setMin
            int r4 = r5.getAttributes()
            r2.<init>(r1, r3, r4)
            goto L_0x00b2
        L_0x00a1:
            org.mozilla.javascript.ScriptableObject$SlotAccess r6 = org.mozilla.javascript.ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA
            if (r2 != r6) goto L_0x00e2
            boolean r6 = r5 instanceof org.mozilla.javascript.ScriptableObject.setMin
            if (r6 == 0) goto L_0x00e2
            org.mozilla.javascript.ScriptableObject$getMax r2 = new org.mozilla.javascript.ScriptableObject$getMax
            int r4 = r5.getAttributes()
            r2.<init>(r1, r3, r4)
        L_0x00b2:
            java.lang.Object r1 = r5.value
            r2.value = r1
            org.mozilla.javascript.ScriptableObject$getMax r1 = r5.next
            r2.next = r1
            org.mozilla.javascript.ScriptableObject$getMax r1 = r0.setMax
            if (r5 != r1) goto L_0x00c1
            r0.setMax = r2
            goto L_0x00ce
        L_0x00c1:
            if (r1 == 0) goto L_0x00ca
            org.mozilla.javascript.ScriptableObject$getMax r3 = r1.orderedNext
            if (r3 == r5) goto L_0x00ca
            org.mozilla.javascript.ScriptableObject$getMax r1 = r1.orderedNext
            goto L_0x00c1
        L_0x00ca:
            if (r1 == 0) goto L_0x00ce
            r1.orderedNext = r2
        L_0x00ce:
            org.mozilla.javascript.ScriptableObject$getMax r1 = r5.orderedNext
            r2.orderedNext = r1
            org.mozilla.javascript.ScriptableObject$getMax r1 = r0.setMin
            if (r5 != r1) goto L_0x00d8
            r0.setMin = r2
        L_0x00d8:
            if (r11 != r5) goto L_0x00df
            org.mozilla.javascript.ScriptableObject$getMax[] r1 = r0.getMin
            r1[r10] = r2
            goto L_0x00e1
        L_0x00df:
            r11.next = r2
        L_0x00e1:
            return r2
        L_0x00e2:
            org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_CONST
            if (r2 != r1) goto L_0x00e7
            return r4
        L_0x00e7:
            return r5
        L_0x00e8:
            int r5 = r0.getMax
            int r5 = r5 + r9
            int r5 = r5 * 4
            org.mozilla.javascript.ScriptableObject$getMax[] r8 = r0.getMin
            int r10 = r8.length
            int r10 = r10 * 3
            r7 = 0
            if (r5 <= r10) goto L_0x0118
            int r5 = r8.length
            int r5 = r5 * 2
            org.mozilla.javascript.ScriptableObject$getMax[] r6 = new org.mozilla.javascript.ScriptableObject.getMax[r5]
            int r10 = r8.length
            r11 = 0
        L_0x00fc:
            if (r11 >= r10) goto L_0x0116
            r12 = r8[r11]
        L_0x0100:
            if (r12 == 0) goto L_0x0113
            org.mozilla.javascript.ScriptableObject$getMax r13 = r12.next
            r12.next = r4
            int r14 = r12.indexOrHash
            int r15 = r5 + -1
            r14 = r14 & r15
            r15 = r6[r14]
            r6[r14] = r12
            r12.next = r15
            r12 = r13
            goto L_0x0100
        L_0x0113:
            int r11 = r11 + 1
            goto L_0x00fc
        L_0x0116:
            r0.getMin = r6
        L_0x0118:
            org.mozilla.javascript.ScriptableObject$SlotAccess r4 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER
            if (r2 != r4) goto L_0x0122
            org.mozilla.javascript.ScriptableObject$setMin r4 = new org.mozilla.javascript.ScriptableObject$setMin
            r4.<init>(r1, r3, r7)
            goto L_0x0127
        L_0x0122:
            org.mozilla.javascript.ScriptableObject$getMax r4 = new org.mozilla.javascript.ScriptableObject$getMax
            r4.<init>(r1, r3, r7)
        L_0x0127:
            org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_CONST
            if (r2 != r1) goto L_0x0130
            r1 = 13
            r4.setAttributes(r1)
        L_0x0130:
            r0.getMax(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSpecialManuFacturer.setMin(java.lang.Object, int, org.mozilla.javascript.ScriptableObject$SlotAccess):org.mozilla.javascript.ScriptableObject$getMax");
    }

    /* renamed from: o.isSpecialManuFacturer$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.mozilla.javascript.ScriptableObject$SlotAccess[] r0 = org.mozilla.javascript.ScriptableObject.SlotAccess.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.QUERY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_CONST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x003e }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isSpecialManuFacturer.AnonymousClass3.<clinit>():void");
        }
    }

    public final void getMin(ScriptableObject.getMax getmax) {
        if (this.getMin == null) {
            this.getMin = new ScriptableObject.getMax[4];
        }
        getMax(getmax);
    }

    private void getMax(ScriptableObject.getMax getmax) {
        this.getMax++;
        ScriptableObject.getMax getmax2 = this.setMin;
        if (getmax2 != null) {
            getmax2.orderedNext = getmax;
        }
        if (this.setMax == null) {
            this.setMax = getmax;
        }
        this.setMin = getmax;
        ScriptableObject.getMax[] getmaxArr = this.getMin;
        int length = (getmaxArr.length - 1) & getmax.indexOrHash;
        ScriptableObject.getMax getmax3 = getmaxArr[length];
        getmaxArr[length] = getmax;
        getmax.next = getmax3;
    }

    public final void setMin(Object obj, int i) {
        if (obj != null) {
            i = obj.hashCode();
        }
        if (this.getMax != 0) {
            ScriptableObject.getMax[] getmaxArr = this.getMin;
            int length = (getmaxArr.length - 1) & i;
            ScriptableObject.getMax getmax = getmaxArr[length];
            ScriptableObject.getMax getmax2 = getmax;
            while (getmax != null && (getmax.indexOrHash != i || (getmax.name != obj && (obj == null || !obj.equals(getmax.name))))) {
                getmax2 = getmax;
                getmax = getmax.next;
            }
            if (getmax == null) {
                return;
            }
            if ((getmax.getAttributes() & 4) == 0) {
                this.getMax--;
                if (getmax2 == getmax) {
                    this.getMin[length] = getmax.next;
                } else {
                    getmax2.next = getmax.next;
                }
                ScriptableObject.getMax getmax3 = this.setMax;
                if (getmax == getmax3) {
                    getmax3 = null;
                    this.setMax = getmax.orderedNext;
                } else {
                    while (getmax3.orderedNext != getmax) {
                        getmax3 = getmax3.orderedNext;
                    }
                    getmax3.orderedNext = getmax.orderedNext;
                }
                if (getmax == this.setMin) {
                    this.setMin = getmax3;
                }
            } else if (SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
                throw LogItem.length("msg.delete.property.with.configurable.false", obj);
            }
        }
    }
}
