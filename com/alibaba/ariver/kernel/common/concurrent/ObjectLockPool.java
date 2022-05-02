package com.alibaba.ariver.kernel.common.concurrent;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectLockPool {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Object, Object> f10092a = new ConcurrentHashMap();

    public static Object acquire(@NonNull Object obj) {
        Object obj2;
        Object obj3 = f10092a.get(obj);
        if (obj3 != null) {
            return obj3;
        }
        synchronized (f10092a) {
            if (f10092a.containsKey(obj)) {
                obj2 = f10092a.get(obj);
            } else {
                Integer valueOf = Integer.valueOf(obj.hashCode());
                f10092a.put(obj, valueOf);
                obj2 = valueOf;
            }
        }
        return obj2;
    }

    public static void release(@NonNull Object obj) {
        synchronized (f10092a) {
            f10092a.remove(obj);
        }
    }
}
