package com.alipay.b.a;

import com.alipay.b.b.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.getInterfaceDescriptor;

public final class h implements i, j {
    public final Object a(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() instanceof String) {
                treeMap.put((String) entry.getKey(), f.b(entry.getValue()));
            } else {
                throw new IllegalArgumentException("Map key must be String!");
            }
        }
        return treeMap;
    }

    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(getInterfaceDescriptor.class)) {
            return null;
        }
        getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) obj;
        Map<Object, Object> a2 = a(type);
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (String.class == type2) {
                for (String str : getinterfacedescriptor.setMax.keySet()) {
                    if (a.a((Class<?>) (Class) type3)) {
                        a2.put(str, getinterfacedescriptor.length(str));
                    } else {
                        a2.put(str, e.a(getinterfacedescriptor.length(str), type3));
                    }
                }
                return a2;
            }
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        throw new IllegalArgumentException("Deserialize Map must be Generics!");
    }

    private static Map<Object, Object> a(Type type) {
        while (type != Properties.class) {
            if (type == Hashtable.class) {
                return new Hashtable();
            }
            if (type == IdentityHashMap.class) {
                return new IdentityHashMap();
            }
            if (type == SortedMap.class || type == TreeMap.class) {
                return new TreeMap();
            }
            if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
                return new ConcurrentHashMap();
            }
            if (type == Map.class || type == HashMap.class) {
                return new HashMap();
            }
            if (type == LinkedHashMap.class) {
                return new LinkedHashMap();
            }
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
            } else {
                Class cls = (Class) type;
                if (!cls.isInterface()) {
                    try {
                        return (Map) cls.newInstance();
                    } catch (Exception e) {
                        throw new IllegalArgumentException("unsupport type ".concat(String.valueOf(type)), e);
                    }
                } else {
                    throw new IllegalArgumentException("unsupport type ".concat(String.valueOf(type)));
                }
            }
        }
        return new Properties();
    }

    public final boolean a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }
}
