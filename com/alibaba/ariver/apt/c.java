package com.alibaba.ariver.apt;

import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class c {

    /* renamed from: com.alibaba.ariver.apt.c$1  reason: invalid class name */
    static class AnonymousClass1 implements ExtensionPoint.ProxyGenerator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f10038a;

        public final Object createProxyInstance(InvocationHandler invocationHandler) {
            return new com_alibaba_ariver_permission_ExtOpt$3$1(this, invocationHandler);
        }
    }

    /* renamed from: com.alibaba.ariver.apt.c$2  reason: invalid class name */
    static class AnonymousClass2 implements ExtensionPoint.ProxyGenerator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f10039a;

        public final Object createProxyInstance(InvocationHandler invocationHandler) {
            return new com_alibaba_ariver_permission_ExtOpt$4$1(this, invocationHandler);
        }
    }
}
