package com.alipay.a.a.a.a;

import android.os.Looper;
import com.alipay.a.a.a.a.a.d;
import com.alipay.a.a.a.a.a.e;
import com.alipay.c.a.a.a.a;
import com.alipay.c.a.a.a.b;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Object> f9248a = new ThreadLocal<>();
    private static final ThreadLocal<Map<String, Object>> b = new ThreadLocal<>();
    private byte c = 0;
    private AtomicInteger d;
    private t e;

    public v(t tVar) {
        this.e = tVar;
        this.d = new AtomicInteger();
    }

    public final Object a(Method method, Object[] objArr) {
        if (!(Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())) {
            a aVar = (a) method.getAnnotation(a.class);
            boolean z = method.getAnnotation(b.class) != null;
            Type genericReturnType = method.getGenericReturnType();
            f9248a.set((Object) null);
            b.set((Object) null);
            if (aVar != null) {
                String a2 = aVar.a();
                int incrementAndGet = this.d.incrementAndGet();
                try {
                    if (this.c == 0) {
                        e eVar = new e(incrementAndGet, a2, objArr);
                        if (b.get() != null) {
                            eVar.a(b.get());
                        }
                        byte[] a3 = eVar.a();
                        b.set((Object) null);
                        Object a4 = new d(genericReturnType, (byte[]) new e(this.e.f9246a, method, incrementAndGet, a2, a3, z).a()).a();
                        if (genericReturnType != Void.TYPE) {
                            f9248a.set(a4);
                        }
                    }
                    return f9248a.get();
                } catch (s e2) {
                    e2.f9245a = a2;
                    throw e2;
                }
            } else {
                throw new IllegalStateException("OperationType must be set.");
            }
        } else {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
    }
}
