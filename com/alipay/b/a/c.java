package com.alipay.b.a;

import java.lang.reflect.Type;
import java.util.Date;

public final class c implements i, j {
    public final Object a(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    public final Object a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    public final boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
