package com.alipay.a.a.a.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class u implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    protected c f9247a;
    protected Class<?> b;
    protected v c;

    public u(c cVar, Class<?> cls, v vVar) {
        this.f9247a = cVar;
        this.b = cls;
        this.c = vVar;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.c.a(method, objArr);
    }
}
