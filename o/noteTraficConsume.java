package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class noteTraficConsume<T> {
    private final String getMax;
    private final Class<?> length;
    private final Class[] setMax;

    noteTraficConsume(Class<?> cls, String str, Class... clsArr) {
        this.length = cls;
        this.getMax = str;
        this.setMax = clsArr;
    }

    public final boolean getMin(T t) {
        return setMax(t.getClass()) != null;
    }

    private Object getMin(T t, Object... objArr) throws InvocationTargetException {
        Method max = setMax(t.getClass());
        if (max == null) {
            return null;
        }
        try {
            return max.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public final Object setMin(T t, Object... objArr) {
        try {
            return getMin(t, objArr);
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

    private Object length(T t, Object... objArr) throws InvocationTargetException {
        Method max = setMax(t.getClass());
        if (max != null) {
            try {
                return max.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(max)));
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(this.getMax);
            sb.append(" not supported for object ");
            sb.append(t);
            throw new AssertionError(sb.toString());
        }
    }

    public final Object setMax(T t, Object... objArr) {
        try {
            return length(t, objArr);
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

    private Method setMax(Class<?> cls) {
        Class<?> cls2;
        String str = this.getMax;
        if (str == null) {
            return null;
        }
        Method length2 = length(cls, str, this.setMax);
        if (length2 == null || (cls2 = this.length) == null || cls2.isAssignableFrom(length2.getReturnType())) {
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
