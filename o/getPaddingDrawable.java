package o;

import o.SecureQwertyKeyboard;

public final class getPaddingDrawable extends setUiContext implements doCheck {
    private static final Object FTAG = "Continuation";
    private static final int Id_constructor = 1;
    private static final int MAX_PROTOTYPE_ID = 1;
    static final long serialVersionUID = 1794167133757605367L;
    private Object implementation;

    public final String getClassName() {
        return "Continuation";
    }

    public static void init(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, boolean z) {
        new getPaddingDrawable().exportAsJSClass(1, logUtils, z);
    }

    public final Object getImplementation() {
        return this.implementation;
    }

    public final void initImplementation(Object obj) {
        this.implementation = obj;
    }

    public final LogUtils construct(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, Object[] objArr) {
        throw SecureQwertyKeyboard.AnonymousClass1.getMax("Direct call is not supported");
    }

    public final Object call(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        return getDimenId.length(this, r1, logUtils, objArr);
    }

    public static boolean isContinuationConstructor(EditTextUtil editTextUtil) {
        return editTextUtil.hasTag(FTAG) && editTextUtil.methodId() == 1;
    }

    /* access modifiers changed from: protected */
    public final void initPrototypeId(int i) {
        if (i == 1) {
            initPrototypeMethod(FTAG, i, "constructor", 0);
            return;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(FTAG)) {
            return super.execIdCall(editTextUtil, r3, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        if (methodId != 1) {
            throw new IllegalArgumentException(String.valueOf(methodId));
        }
        throw SecureQwertyKeyboard.AnonymousClass1.getMax("Direct call is not supported");
    }

    /* access modifiers changed from: protected */
    public final int findPrototypeId(String str) {
        String str2;
        int i;
        if (str.length() == 11) {
            i = 1;
            str2 = "constructor";
        } else {
            str2 = null;
            i = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i;
        }
        return 0;
    }
}
