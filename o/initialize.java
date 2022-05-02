package o;

import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class initialize {
    public static initialize getMax = new initialize();
    private final Map<Class<?>, Boolean> getMin = new HashMap();
    private final Map<Class<?>, setMin> length = new HashMap();

    initialize() {
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(Class<?> cls) {
        Boolean bool = this.getMin.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] max = setMax(cls);
        for (Method annotation : max) {
            if (((OnLifecycleEvent) annotation.getAnnotation(OnLifecycleEvent.class)) != null) {
                getMax(cls, max);
                return true;
            }
        }
        this.getMin.put(cls, Boolean.FALSE);
        return false;
    }

    private static Method[] setMax(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public final setMin getMin(Class<?> cls) {
        setMin setmin = this.length.get(cls);
        if (setmin != null) {
            return setmin;
        }
        return getMax(cls, (Method[]) null);
    }

    private static void setMax(Map<getMin, Lifecycle.Event> map, getMin getmin, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(getmin);
        if (event2 != null && event != event2) {
            Method method = getmin.length;
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(event2);
            sb.append(", new value ");
            sb.append(event);
            throw new IllegalArgumentException(sb.toString());
        } else if (event2 == null) {
            map.put(getmin, event);
        }
    }

    private setMin getMax(Class<?> cls, @Nullable Method[] methodArr) {
        int i;
        setMin min;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (min = getMin(superclass)) == null)) {
            hashMap.putAll(min.getMin);
        }
        for (Class min2 : cls.getInterfaces()) {
            for (Map.Entry next : getMin(min2).getMin.entrySet()) {
                setMax(hashMap, (getMin) next.getKey(), (Lifecycle.Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = setMax(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(setChecked.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    setMax(hashMap, new getMin(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        setMin setmin = new setMin(hashMap);
        this.length.put(cls, setmin);
        this.getMin.put(cls, Boolean.valueOf(z));
        return setmin;
    }

    public static class setMin {
        final Map<getMin, Lifecycle.Event> getMin;
        public final Map<Lifecycle.Event, List<getMin>> length = new HashMap();

        setMin(Map<getMin, Lifecycle.Event> map) {
            this.getMin = map;
            for (Map.Entry next : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) next.getValue();
                List list = this.length.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.length.put(event, list);
                }
                list.add(next.getKey());
            }
        }

        public static void length(List<getMin> list, setChecked setchecked, Lifecycle.Event event, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    getMin getmin = list.get(size);
                    try {
                        int i = getmin.getMin;
                        if (i == 0) {
                            getmin.length.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            getmin.length.invoke(obj, new Object[]{setchecked});
                        } else if (i == 2) {
                            getmin.length.invoke(obj, new Object[]{setchecked, event});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    static final class getMin {
        final int getMin;
        final Method length;

        getMin(int i, Method method) {
            this.getMin = i;
            this.length = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return this.getMin == getmin.getMin && this.length.getName().equals(getmin.length.getName());
        }

        public final int hashCode() {
            return (this.getMin * 31) + this.length.getName().hashCode();
        }
    }
}
