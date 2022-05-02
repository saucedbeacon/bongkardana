package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class setExpandedFormat {
    private static Map<Class<?>, List<Constructor<? extends onClick>>> getMin = new HashMap();
    private static Map<Class<?>, Integer> length = new HashMap();

    @NonNull
    static setPopupCallback setMin(Object obj) {
        boolean z = obj instanceof setPopupCallback;
        boolean z2 = obj instanceof setCheckable;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((setCheckable) obj, (setPopupCallback) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((setCheckable) obj, (setPopupCallback) null);
        }
        if (z) {
            return (setPopupCallback) obj;
        }
        Class<?> cls = obj.getClass();
        if (setMax(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = getMin.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(getMax((Constructor) list.get(0), obj));
        }
        onClick[] onclickArr = new onClick[list.size()];
        for (int i = 0; i < list.size(); i++) {
            onclickArr[i] = getMax((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(onclickArr);
    }

    private static onClick getMax(Constructor<? extends onClick> constructor, Object obj) {
        try {
            return (onClick) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Nullable
    private static Constructor<? extends onClick> getMax(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(".", "_"));
            sb.append("_LifecycleAdapter");
            String obj = sb.toString();
            if (!name.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                obj = sb2.toString();
            }
            Constructor<?> declaredConstructor = Class.forName(obj).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static int setMax(Class<?> cls) {
        Integer num = length.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int min = getMin(cls);
        length.put(cls, Integer.valueOf(min));
        return min;
    }

    private static int getMin(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends onClick> max = getMax(cls);
        if (max != null) {
            getMin.put(cls, Collections.singletonList(max));
            return 2;
        } else if (initialize.getMax.getMax(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (setMin((Class<?>) superclass)) {
                if (setMax(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(getMin.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (setMin((Class<?>) cls2)) {
                    if (setMax(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(getMin.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            getMin.put(cls, arrayList);
            return 2;
        }
    }

    private static boolean setMin(Class<?> cls) {
        return cls != null && showsIcon.class.isAssignableFrom(cls);
    }
}
