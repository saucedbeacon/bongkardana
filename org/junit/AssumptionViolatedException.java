package org.junit;

import o.unBindKeyboard;

public class AssumptionViolatedException extends org.junit.internal.AssumptionViolatedException {
    private static final long serialVersionUID = 1;

    public <T> AssumptionViolatedException(T t, unBindKeyboard<T> unbindkeyboard) {
        super((Object) t, (unBindKeyboard<?>) unbindkeyboard);
    }

    public <T> AssumptionViolatedException(String str, T t, unBindKeyboard<T> unbindkeyboard) {
        super(str, t, unbindkeyboard);
    }

    public AssumptionViolatedException(String str) {
        super(str);
    }

    public AssumptionViolatedException(String str, Throwable th) {
        super(str, th);
    }
}
