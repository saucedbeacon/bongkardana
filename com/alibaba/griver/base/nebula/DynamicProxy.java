package com.alibaba.griver.base.nebula;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static <T> T dynamicProxy(Class<T> cls, final Object obj) {
        AnonymousClass1 r0 = new InvocationHandler() {
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                try {
                    return obj.getClass().getMethod(method.getName(), method.getParameterTypes()).invoke(obj, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
        };
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, r0);
    }
}
