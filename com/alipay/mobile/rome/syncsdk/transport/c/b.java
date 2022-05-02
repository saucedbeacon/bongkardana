package com.alipay.mobile.rome.syncsdk.transport.c;

import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9437a = b.class.getSimpleName();
    private static ExecutorService d;
    private final a b;
    private final Map<Object, a> c = new ConcurrentHashMap();

    public final boolean b(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        return aVar != null;
    }

    public b(a aVar) {
        this.b = aVar;
        e eVar = new e(this.b);
        f fVar = new f(this.b);
        g gVar = new g(this.b);
        h hVar = new h(this.b);
        i iVar = new i(this.b);
        j jVar = new j(this.b);
        this.c.put(eVar, eVar);
        this.c.put(fVar, fVar);
        this.c.put(gVar, gVar);
        this.c.put(hVar, hVar);
        this.c.put(iVar, iVar);
        this.c.put(jVar, jVar);
    }

    public final void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        for (a next : this.c.values()) {
            if (next.b(aVar)) {
                a((Runnable) new d(this, next, aVar));
            }
        }
    }

    private synchronized void a(Runnable runnable) {
        c.b(f9437a, "submit ");
        if (d == null || d.isTerminated() || d.isShutdown()) {
            c.c(f9437a, "submit:[ newSingleThreadExecutor restart]");
            d = Executors.newSingleThreadExecutor(new c(this));
        }
        d.submit(runnable);
    }
}
