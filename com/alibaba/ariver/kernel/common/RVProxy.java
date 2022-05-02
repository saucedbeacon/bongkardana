package com.alibaba.ariver.kernel.common;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RVProxy {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Object> f9021a = new ConcurrentHashMap();
    private static volatile Printer b;
    private static Initializer c = null;
    public static boolean sHasSetupProxy = false;

    public static class EmptyPrinter implements Printer {
        public void print(String str) {
        }
    }

    public interface Initializer {
        void doInitialize();
    }

    public interface LazyGetter<T> {
        @Nullable
        T get();
    }

    public interface Printer {
        void print(String str);
    }

    public static void setLazyInitializer(Initializer initializer) {
        c = initializer;
    }

    public static void setPrinter(Printer printer) {
        b = printer;
    }

    public static synchronized Printer getPrinter() {
        Printer printer;
        synchronized (RVProxy.class) {
            if (b == null) {
                b = new EmptyPrinter();
            }
            printer = b;
        }
        return printer;
    }

    public static <T> void setLazy(Class<T> cls, LazyGetter<T> lazyGetter) {
        a(cls, lazyGetter);
    }

    public static <T> void set(Class<? super T> cls, T t) {
        a(cls, t);
    }

    private static <T> void a(Class cls, Object obj) {
        if (cls != null) {
            if (obj == null) {
                f9021a.remove(cls);
            } else if (!cls.isInterface()) {
                throw new IllegalArgumentException("set proxy class must a Interface: ".concat(String.valueOf(cls)));
            } else if (!Proxiable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("set proxy class must a Proxiable: ".concat(String.valueOf(cls)));
            } else if (cls.isInstance(obj) || (obj instanceof LazyGetter)) {
                Printer printer = getPrinter();
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getSimpleName());
                sb.append(" >>> ");
                sb.append(obj.getClass());
                printer.print(sb.toString());
                synchronized (f9021a) {
                    f9021a.put(cls, obj);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.getClass().getSimpleName());
                sb2.append(" is not instance of ");
                sb2.append(cls.getSimpleName());
                sb2.append(" and not instance of LazyGetter");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    public static <T> T get(Class<T> cls) {
        return get(cls, false);
    }

    public static <T> T get(final Class<T> cls, boolean z) {
        if (!cls.isInterface()) {
            Printer printer = getPrinter();
            StringBuilder sb = new StringBuilder("got proxy clazz must a Interface:");
            sb.append(cls.getSimpleName());
            printer.print(sb.toString());
        }
        T t = f9021a.get(cls);
        if (t != null && !(t instanceof LazyGetter)) {
            return t;
        }
        T a2 = a(cls);
        if (a2 != null) {
            return a2;
        }
        if (!sHasSetupProxy) {
            Printer printer2 = getPrinter();
            StringBuilder sb2 = new StringBuilder("get proxy but not initialized! sLazyInitializer: ");
            sb2.append(c);
            printer2.print(sb2.toString());
            Initializer initializer = c;
            if (initializer == null) {
                return null;
            }
            initializer.doInitialize();
            T a3 = a(cls);
            if (a3 != null) {
                return a3;
            }
        }
        if (z) {
            return null;
        }
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Class<?> returnType = method.getReturnType();
                Printer printer = RVProxy.getPrinter();
                StringBuilder sb = new StringBuilder("unimplemented proxy:");
                sb.append(cls.getSimpleName());
                sb.append(".");
                sb.append(method.getName());
                printer.print(sb.toString());
                if (!returnType.isPrimitive()) {
                    return null;
                }
                if (returnType == Boolean.TYPE || returnType == Boolean.TYPE) {
                    return Boolean.FALSE;
                }
                return 0;
            }
        });
        set(cls, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return r1;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T a(java.lang.Class<T> r6) {
        /*
            java.util.Map<java.lang.Class, java.lang.Object> r0 = f9021a
            monitor-enter(r0)
            java.util.Map<java.lang.Class, java.lang.Object> r1 = f9021a     // Catch:{ all -> 0x00bb }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x003f
            r2 = 0
            boolean r3 = r1 instanceof com.alibaba.ariver.kernel.common.RVProxy.LazyGetter     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x0034
            com.alibaba.ariver.kernel.common.RVProxy$LazyGetter r1 = (com.alibaba.ariver.kernel.common.RVProxy.LazyGetter) r1     // Catch:{ all -> 0x00bb }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00bb }
            r2 = 1
            com.alibaba.ariver.kernel.common.RVProxy$Printer r3 = getPrinter()     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "Lazy initialize of "
            r4.<init>(r5)     // Catch:{ all -> 0x00bb }
            r4.append(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x00bb }
            r4.append(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00bb }
            r3.print(r4)     // Catch:{ all -> 0x00bb }
        L_0x0034:
            if (r1 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x003d
            java.util.Map<java.lang.Class, java.lang.Object> r2 = f9021a     // Catch:{ all -> 0x00bb }
            r2.put(r6, r1)     // Catch:{ all -> 0x00bb }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return r1
        L_0x003f:
            java.lang.Class<com.alibaba.ariver.kernel.api.annotation.DefaultImpl> r2 = com.alibaba.ariver.kernel.api.annotation.DefaultImpl.class
            java.lang.annotation.Annotation r2 = r6.getAnnotation(r2)     // Catch:{ all -> 0x00bb }
            com.alibaba.ariver.kernel.api.annotation.DefaultImpl r2 = (com.alibaba.ariver.kernel.api.annotation.DefaultImpl) r2     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00b9
            java.lang.String r3 = r2.value()     // Catch:{ all -> 0x009f }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x009f }
            boolean r4 = r6.isAssignableFrom(r3)     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x007d
            java.lang.Object r1 = r3.newInstance()     // Catch:{ all -> 0x009f }
            com.alibaba.ariver.kernel.common.RVProxy$Printer r2 = getPrinter()     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "Default initialize of "
            r3.<init>(r4)     // Catch:{ all -> 0x009f }
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = " to "
            r3.append(r4)     // Catch:{ all -> 0x009f }
            r3.append(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009f }
            r2.print(r3)     // Catch:{ all -> 0x009f }
            set(r6, r1)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return r1
        L_0x007d:
            com.alibaba.ariver.kernel.common.RVProxy$Printer r3 = getPrinter()     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            java.lang.String r5 = "Default impl "
            r4.<init>(r5)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.value()     // Catch:{ all -> 0x009f }
            r4.append(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = " is not instance of "
            r4.append(r2)     // Catch:{ all -> 0x009f }
            r4.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x009f }
            r3.print(r6)     // Catch:{ all -> 0x009f }
            goto L_0x00b9
        L_0x009f:
            r6 = move-exception
            com.alibaba.ariver.kernel.common.RVProxy$Printer r2 = getPrinter()     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = "DefaultImpl instantiate exception!"
            r3.<init>(r4)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x00bb }
            r3.append(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00bb }
            r2.print(r6)     // Catch:{ all -> 0x00bb }
        L_0x00b9:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return r1
        L_0x00bb:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.RVProxy.a(java.lang.Class):java.lang.Object");
    }
}
