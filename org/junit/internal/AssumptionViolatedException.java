package org.junit.internal;

import o.CountValue;
import o.KeyboardManager;
import o.getKeyboard;
import o.unBindKeyboard;

public class AssumptionViolatedException extends RuntimeException implements KeyboardManager {
    private static final long serialVersionUID = 2;
    private final String fAssumption;
    private final unBindKeyboard<?> fMatcher;
    private final Object fValue;
    private final boolean fValueMatcher;

    @Deprecated
    public AssumptionViolatedException(String str, boolean z, Object obj, unBindKeyboard<?> unbindkeyboard) {
        this.fAssumption = str;
        this.fValue = obj;
        this.fMatcher = unbindkeyboard;
        this.fValueMatcher = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    @Deprecated
    public AssumptionViolatedException(Object obj, unBindKeyboard<?> unbindkeyboard) {
        this((String) null, true, obj, unbindkeyboard);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Object obj, unBindKeyboard<?> unbindkeyboard) {
        this(str, true, obj, unbindkeyboard);
    }

    @Deprecated
    public AssumptionViolatedException(String str) {
        this(str, false, (Object) null, (unBindKeyboard<?>) null);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Throwable th) {
        this(str, false, (Object) null, (unBindKeyboard<?>) null);
        initCause(th);
    }

    public String getMessage() {
        return getKeyboard.getMax((KeyboardManager) this);
    }

    public void describeTo(CountValue countValue) {
        String str = this.fAssumption;
        if (str != null) {
            countValue.getMin(str);
        }
        if (this.fValueMatcher) {
            if (this.fAssumption != null) {
                countValue.getMin(": ");
            }
            countValue.getMin("got: ");
            countValue.getMax(this.fValue);
            if (this.fMatcher != null) {
                countValue.getMin(", expected: ");
                countValue.getMin((KeyboardManager) this.fMatcher);
            }
        }
    }
}
