package com.alibaba.ariver.kernel.api.invoke;

import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerWrapper implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private ExtensionInvoker f9019a;
    private Object b = new Object();
    private String c;

    public InvocationHandlerWrapper(Class cls, ExtensionInvoker extensionInvoker) {
        this.f9019a = extensionInvoker;
        StringBuilder sb = new StringBuilder("Proxy@");
        sb.append(cls);
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(this.b.hashCode());
        this.c = sb.toString();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getDeclaringClass() != Object.class) {
            return this.f9019a.invoke(obj, method, objArr);
        }
        if ("toString".equals(method.getName())) {
            return this.c;
        }
        return method.invoke(this.b, objArr);
    }
}
