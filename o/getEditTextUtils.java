package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public final class getEditTextUtils implements getStackTraceMessage {
    private final LinkedHashMap<Object, ScriptableObject.getMax> setMin = new LinkedHashMap<>();

    public final int setMin() {
        return this.setMin.size();
    }

    public final boolean getMin() {
        return this.setMin.isEmpty();
    }

    public final ScriptableObject.getMax getMax(Object obj, int i) {
        if (obj == null) {
            obj = String.valueOf(i);
        }
        return this.setMin.get(obj);
    }

    public final ScriptableObject.getMax setMin(Object obj, int i, ScriptableObject.SlotAccess slotAccess) {
        ScriptableObject.getMax getmax;
        Object valueOf = obj == null ? String.valueOf(i) : obj;
        ScriptableObject.getMax getmax2 = this.setMin.get(valueOf);
        int i2 = AnonymousClass3.setMax[slotAccess.ordinal()];
        if (i2 == 1) {
            return getmax2;
        }
        if (i2 == 2 || i2 == 3) {
            if (getmax2 != null) {
                return getmax2;
            }
        } else if (i2 != 4) {
            if (i2 == 5 && !(getmax2 instanceof ScriptableObject.setMin)) {
                return getmax2;
            }
        } else if (getmax2 instanceof ScriptableObject.setMin) {
            return getmax2;
        }
        ScriptableObject.getMax getmax3 = this.setMin.get(valueOf);
        if (getmax3 != null) {
            if (slotAccess == ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER && !(getmax3 instanceof ScriptableObject.setMin)) {
                getmax = new ScriptableObject.setMin(valueOf, getmax3.indexOrHash, getmax3.getAttributes());
            } else if (slotAccess == ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA && (getmax3 instanceof ScriptableObject.setMin)) {
                getmax = new ScriptableObject.getMax(valueOf, getmax3.indexOrHash, getmax3.getAttributes());
            } else if (slotAccess == ScriptableObject.SlotAccess.MODIFY_CONST) {
                return null;
            } else {
                return getmax3;
            }
            getmax.value = getmax3.value;
            this.setMin.put(valueOf, getmax);
            return getmax;
        }
        ScriptableObject.getMax setmin = slotAccess == ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER ? new ScriptableObject.setMin(obj, i, 0) : new ScriptableObject.getMax(obj, i, 0);
        if (slotAccess == ScriptableObject.SlotAccess.MODIFY_CONST) {
            setmin.setAttributes(13);
        }
        getMin(setmin);
        return setmin;
    }

    /* renamed from: o.getEditTextUtils$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] setMax;

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
                setMax = r0
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.QUERY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_CONST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x003e }
                org.mozilla.javascript.ScriptableObject$SlotAccess r1 = org.mozilla.javascript.ScriptableObject.SlotAccess.CONVERT_ACCESSOR_TO_DATA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getEditTextUtils.AnonymousClass3.<clinit>():void");
        }
    }

    public final void getMin(ScriptableObject.getMax getmax) {
        this.setMin.put(getmax.name == null ? String.valueOf(getmax.indexOrHash) : getmax.name, getmax);
    }

    public final void setMin(Object obj, int i) {
        Object valueOf = obj == null ? String.valueOf(i) : obj;
        ScriptableObject.getMax getmax = this.setMin.get(valueOf);
        if (getmax == null) {
            return;
        }
        if ((getmax.getAttributes() & 4) == 0) {
            this.setMin.remove(valueOf);
        } else if (SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
            throw LogItem.length("msg.delete.property.with.configurable.false", obj);
        }
    }

    public final Iterator<ScriptableObject.getMax> iterator() {
        return this.setMin.values().iterator();
    }
}
