package o;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class validateChildOrder {
    private final Class<?> getMax;
    private final Class<?> getMin;
    private final Method length;
    private final String setMax;
    final Object[] setMin;

    public validateChildOrder(Class<?> cls, String str, Object[] objArr, Class<?> cls2) throws NoSuchMethodException {
        this.setMax = str;
        this.setMin = objArr;
        this.getMin = cls2;
        Method min = getMin(cls);
        this.length = min;
        if (min != null) {
            this.getMax = min.getDeclaringClass();
            return;
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(cls.getName());
        sb.append(".");
        sb.append(this.setMax);
        sb.append(" doesn't exit");
        throw new NoSuchMethodException(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[Caller ");
        sb.append(this.setMax);
        sb.append("(");
        sb.append(this.setMin);
        sb.append(")]");
        return sb.toString();
    }

    public final Object getMax(View view, Object[] objArr) {
        if (!this.getMax.isAssignableFrom(view.getClass())) {
            return null;
        }
        try {
            return this.length.invoke(view, objArr);
        } catch (IllegalAccessException unused) {
            this.length.getName();
            findOnePartiallyOrCompletelyInvisibleChild.values();
            return null;
        } catch (IllegalArgumentException unused2) {
            this.length.getName();
            findOnePartiallyOrCompletelyInvisibleChild.values();
            return null;
        } catch (InvocationTargetException unused3) {
            this.length.getName();
            findOnePartiallyOrCompletelyInvisibleChild.values();
            return null;
        }
    }

    public final boolean setMin(Object[] objArr) {
        Class[] parameterTypes = this.length.getParameterTypes();
        if (objArr.length != parameterTypes.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            Class<?> min = setMin((Class<?>) parameterTypes[i]);
            if (objArr[i] == null) {
                if (min == Byte.TYPE || min == Short.TYPE || min == Integer.TYPE || min == Long.TYPE || min == Float.TYPE || min == Double.TYPE || min == Boolean.TYPE || min == Character.TYPE) {
                    return false;
                }
            } else if (!min.isAssignableFrom(setMin(objArr[i].getClass()))) {
                return false;
            }
        }
        return true;
    }

    private static Class<?> setMin(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return cls == Character.class ? Character.TYPE : cls;
    }

    private Method getMin(Class<?> cls) {
        Class[] clsArr = new Class[this.setMin.length];
        int i = 0;
        while (true) {
            Object[] objArr = this.setMin;
            if (i >= objArr.length) {
                break;
            }
            clsArr[i] = objArr[i].getClass();
            i++;
        }
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            Class[] parameterTypes = method.getParameterTypes();
            if (name.equals(this.setMax) && parameterTypes.length == this.setMin.length && setMin(this.getMin).isAssignableFrom(setMin(method.getReturnType()))) {
                boolean z = true;
                for (int i2 = 0; i2 < parameterTypes.length && z; i2++) {
                    z = setMin((Class<?>) parameterTypes[i2]).isAssignableFrom(setMin((Class<?>) clsArr[i2]));
                }
                if (z) {
                    return method;
                }
            }
        }
        return null;
    }
}
