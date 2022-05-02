package com.alipay.alipaysecuritysdk.common.e;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f9275a;
    private ExecutorService b;
    private ExecutorService c;

    private f() {
        this.b = null;
        this.c = null;
        this.b = Executors.newSingleThreadExecutor();
        this.c = Executors.newFixedThreadPool(20);
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (f9275a == null) {
                f9275a = new f();
            }
            fVar = f9275a;
        }
        return fVar;
    }

    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public final void b(Runnable runnable) {
        this.c.execute(runnable);
    }
}
