package o;

import id.dana.sendmoney.summary.SummaryActivity;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

final class getRawId extends setUiContext {
    private static final Object BOOLEAN_TAG = "Boolean";
    private static final int Id_constructor = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 4;
    static final long serialVersionUID = -3716996899943880933L;
    private boolean booleanValue;

    public final String getClassName() {
        return "Boolean";
    }

    static void init(LogUtils logUtils, boolean z) {
        new getRawId(false).exportAsJSClass(4, logUtils, z);
    }

    getRawId(boolean z) {
        this.booleanValue = z;
    }

    public final Object getDefaultValue(Class<?> cls) {
        if (cls == LogItem.length) {
            return LogItem.getMin(this.booleanValue);
        }
        return super.getDefaultValue(cls);
    }

    /* access modifiers changed from: protected */
    public final void initPrototypeId(int i) {
        String str;
        int i2 = 0;
        if (i == 1) {
            str = "constructor";
            i2 = 1;
        } else if (i == 2) {
            str = "toString";
        } else if (i == 3) {
            str = "toSource";
        } else if (i == 4) {
            str = "valueOf";
        } else {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        initPrototypeMethod(BOOLEAN_TAG, i, str, i2);
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(BOOLEAN_TAG)) {
            return super.execIdCall(editTextUtil, r3, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        boolean z = true;
        if (methodId == 1) {
            if (objArr.length == 0) {
                z = false;
            } else if (!(objArr[0] instanceof ScriptableObject) || !objArr[0].avoidObjectDetection()) {
                z = LogItem.setMax(objArr[0]);
            }
            if (logUtils2 == null) {
                return new getRawId(z);
            }
            return LogItem.getMin(z);
        } else if (logUtils2 instanceof getRawId) {
            boolean z2 = ((getRawId) logUtils2).booleanValue;
            if (methodId == 2) {
                return z2 ? SummaryActivity.CHECKED : "false";
            }
            if (methodId == 3) {
                return z2 ? "(new Boolean(true))" : "(new Boolean(false))";
            }
            if (methodId == 4) {
                return LogItem.getMin(z2);
            }
            throw new IllegalArgumentException(String.valueOf(methodId));
        } else {
            throw incompatibleCallError(editTextUtil);
        }
    }

    /* access modifiers changed from: protected */
    public final int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i = 3;
        if (length == 7) {
            i = 4;
            str2 = "valueOf";
        } else {
            if (length == 8) {
                char charAt = str.charAt(3);
                if (charAt == 'o') {
                    str2 = "toSource";
                } else if (charAt == 't') {
                    i = 2;
                    str2 = "toString";
                }
            } else if (length == 11) {
                i = 1;
                str2 = "constructor";
            }
            str2 = null;
            i = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i;
        }
        return 0;
    }
}
