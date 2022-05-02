package com.alibaba.ariver.kernel.common.utils;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.extension.Extension;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ReflectUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Method> f9148a = new ConcurrentHashMap();

    public static Object getDefaultValue(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Boolean.FALSE;
        }
        if (cls == Void.TYPE) {
            return null;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return 0;
        }
        return null;
    }

    public static Object invokeMethod(Object obj, String str) {
        return invokeMethod((Class) obj.getClass(), obj, str, (Class[]) null, (Object[]) null);
    }

    public static Object invokeMethod(String str, String str2) {
        return invokeMethod((Class) Class.forName(str), (Object) null, str2, (Class[]) null, (Object[]) null);
    }

    public static Object invokeMethod(Class cls, String str) {
        return invokeMethod(cls, (Object) null, str, (Class[]) null, (Object[]) null);
    }

    public static Object invokeMethod(Class cls, String str, Class[] clsArr, Object[] objArr) {
        return invokeMethod(cls, (Object) null, str, clsArr, objArr);
    }

    public static Object invokeMethod(String str, Object obj, String str2, Class[] clsArr, Object[] objArr) {
        return invokeMethod((Class) Class.forName(str), obj, str2, clsArr, objArr);
    }

    public static Object invokeStaticMethod(Class cls, String str, Class[] clsArr, Object[] objArr) {
        return invokeMethod(cls, (Object) null, str, clsArr, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Class[] clsArr, Object[] objArr) {
        return invokeMethod((Class) Class.forName(str), (Object) null, str2, clsArr, objArr);
    }

    public static Object invokeMethod(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        Method method = getMethod(cls, str, clsArr);
        if (objArr == null) {
            return method.invoke(obj, new Object[0]);
        }
        return method.invoke(obj, objArr);
    }

    public static Method getMethod(Class<?> cls, String str, Class[] clsArr) {
        Method method;
        String concat = cls.getName().concat(".").concat(str);
        if (clsArr != null && clsArr.length > 0) {
            String concat2 = concat.concat("(");
            for (Class name : clsArr) {
                concat2 = concat2.concat(name.getName()).concat(",");
            }
            concat = concat2.substring(0, concat2.length() - 1).concat(")");
        }
        Method method2 = null;
        try {
            if (f9148a.containsKey(concat)) {
                method2 = f9148a.get(concat);
            }
        } catch (Throwable unused) {
        }
        if (method2 != null) {
            return method2;
        }
        if (clsArr == null) {
            method = cls.getDeclaredMethod(str, new Class[0]);
        } else {
            method = cls.getDeclaredMethod(str, clsArr);
        }
        Method method3 = method;
        method3.setAccessible(true);
        f9148a.put(concat, method3);
        return method3;
    }

    public static Object getField(Object obj, String str, Object obj2) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = Class.forName(String.valueOf(obj));
        }
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj2);
    }

    public static Method findMethod(Class cls, String str, String[] strArr) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str)) {
                if (method.getParameterTypes().length == (strArr != null ? strArr.length : 0) && a(method.getParameterTypes(), strArr)) {
                    return method;
                }
            }
        }
        return null;
    }

    private static boolean a(Class<?>[] clsArr, String[] strArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (!TextUtils.equals(clsArr[i].getName(), strArr != null ? strArr[i] : null)) {
                return false;
            }
        }
        return true;
    }

    public static Set<Class<? extends Extension>> collectExtensionPoint(Class<? extends Extension> cls, Set<Class<? extends Extension>> set) {
        Class<? super Object> cls2;
        while (true) {
            if (set == null) {
                set = new LinkedHashSet<>();
            }
            for (Class cls3 : cls2.getInterfaces()) {
                if (Extension.class.isAssignableFrom(cls3)) {
                    set.add(cls3);
                }
            }
            if (!Extension.class.isAssignableFrom(cls2.getSuperclass())) {
                return set;
            }
            Class<? super Object> superclass = cls2.getSuperclass();
            cls2 = cls;
            cls2 = superclass;
        }
    }
}
