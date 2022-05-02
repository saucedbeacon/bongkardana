package com.alipay.b.a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import o.isInside;

public final class k implements i {
    public final Object a(Object obj, Type type) {
        Type type2;
        if (!obj.getClass().equals(isInside.class)) {
            return null;
        }
        isInside isinside = (isInside) obj;
        HashSet hashSet = new HashSet();
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        } else {
            type2 = Object.class;
        }
        for (int i = 0; i < isinside.setMin.size(); i++) {
            hashSet.add(e.a(isinside.getMax(i), type2));
        }
        return hashSet;
    }

    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
