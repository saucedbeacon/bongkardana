package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class onCustomTabsServiceConnected<T> {
    private final Class[] getMax;
    private final Class<?> getMin;
    private final String length;

    public onCustomTabsServiceConnected(Class<?> cls, String str, Class... clsArr) {
        this.getMin = cls;
        this.length = str;
        this.getMax = clsArr;
    }

    public final boolean getMax(T t) {
        return length(t.getClass()) != null;
    }

    private Object setMin(T t, Object... objArr) {
        Method length2 = length(t.getClass());
        if (length2 == null) {
            return null;
        }
        try {
            return length2.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public final Object length(T t, Object... objArr) {
        try {
            return setMin(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Object setMax(T t, Object... objArr) {
        Method length2 = length(t.getClass());
        if (length2 != null) {
            try {
                return length2.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(length2)));
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(this.length);
            sb.append(" not supported for object ");
            sb.append(t);
            throw new AssertionError(sb.toString());
        }
    }

    public final Object getMin(T t, Object... objArr) {
        try {
            return setMax(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Method length(Class<?> cls) {
        Class<?> cls2;
        String str = this.length;
        if (str == null) {
            return null;
        }
        Method length2 = length(cls, str, this.getMax);
        if (length2 == null || (cls2 = this.getMin) == null || cls2.isAssignableFrom(length2.getReturnType())) {
            return length2;
        }
        return null;
    }

    private static Method length(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }
}
