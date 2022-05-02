package com.alipay.b.a;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import o.isInside;

public final class a implements i, j {
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object b : (Object[]) obj) {
            arrayList.add(f.b(b));
        }
        return arrayList;
    }

    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(isInside.class)) {
            return null;
        }
        isInside isinside = (isInside) obj;
        if (!(type instanceof GenericArrayType)) {
            Class<?> componentType = ((Class) type).getComponentType();
            int size = isinside.setMin.size();
            Object newInstance = Array.newInstance(componentType, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, e.a(isinside.getMax(i), (Type) componentType));
            }
            return newInstance;
        }
        throw new IllegalArgumentException("Does not support generic array!");
    }

    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }
}
