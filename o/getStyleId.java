package o;

import java.lang.reflect.Method;
import java.util.Map;

public final class getStyleId {
    private static Method getMin;

    public static int setMax(int i, int i2) {
        int i3;
        if (i <= 57) {
            i3 = i - 48;
            if (i3 < 0) {
                return -1;
            }
        } else if (i <= 70) {
            if (65 > i) {
                return -1;
            }
            i3 = i - 55;
        } else if (i > 102 || 97 > i) {
            return -1;
        } else {
            i3 = i - 87;
        }
        return i3 | (i2 << 4);
    }

    static {
        try {
            Class<?> max = getMax("java.lang.Throwable");
            getMin = max.getMethod("initCause", new Class[]{max});
        } catch (Exception unused) {
        }
    }

    public static Class<?> getMax(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | IllegalArgumentException | LinkageError | SecurityException unused) {
            return null;
        }
    }

    public static Class<?> setMax(ClassLoader classLoader, String str) {
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | IllegalArgumentException | LinkageError | SecurityException unused) {
            return null;
        }
    }

    static Object getMin(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException | LinkageError | SecurityException unused) {
            return null;
        }
    }

    static boolean setMin(ClassLoader classLoader) {
        Class<?> cls = LogItem.toDoubleRange;
        return setMax(classLoader, cls.getName()) == cls;
    }

    public static RuntimeException setMax(RuntimeException runtimeException, Throwable th) {
        Method method = getMin;
        if (method != null) {
            try {
                method.invoke(runtimeException, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        return runtimeException;
    }

    public static Object getMin(Object obj, int i) {
        if (i == 0) {
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof Object[])) {
                return obj;
            }
            Object[] objArr = (Object[]) obj;
            if (objArr.length >= 2) {
                return objArr[0];
            }
            throw new IllegalArgumentException();
        } else if (i != 1) {
            Object[] objArr2 = (Object[]) obj;
            int length = objArr2.length;
            if (length < 2) {
                throw new IllegalArgumentException();
            } else if (i == length) {
                return null;
            } else {
                return objArr2[i];
            }
        } else if (obj instanceof Object[]) {
            return ((Object[]) obj)[1];
        } else {
            if (obj != null) {
                return null;
            }
            throw new IllegalArgumentException();
        }
    }

    public static Object getMax(Map<Object, Object> map, Object obj, Object obj2) {
        synchronized (map) {
            Object obj3 = map.get(obj);
            if (obj3 == null) {
                map.put(obj, obj2);
            } else {
                obj2 = obj3;
            }
        }
        return obj2;
    }

    static final class getMin {
        private Object getMax;
        private int getMin;
        private Object setMin;

        getMin(Object obj, Object obj2) {
            this.getMax = obj;
            this.setMin = obj2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            if (!this.getMax.equals(getmin.getMax) || !this.setMin.equals(getmin.setMin)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            if (this.getMin == 0) {
                this.getMin = this.getMax.hashCode() ^ this.setMin.hashCode();
            }
            return this.getMin;
        }
    }

    public static Object setMin(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (obj2 != null) {
            return new getMin(obj, obj2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static RuntimeException setMin() throws RuntimeException {
        IllegalStateException illegalStateException = new IllegalStateException("FAILED ASSERTION");
        illegalStateException.printStackTrace(System.err);
        throw illegalStateException;
    }

    public static RuntimeException setMax(String str) throws RuntimeException {
        IllegalStateException illegalStateException = new IllegalStateException("FAILED ASSERTION: ".concat(String.valueOf(str)));
        illegalStateException.printStackTrace(System.err);
        throw illegalStateException;
    }
}
