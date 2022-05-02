package com.alipay.a.a.a.a;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class h implements x {
    private static h g;
    private static final ThreadFactory i = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f9238a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #");
            sb.append(this.f9238a.getAndIncrement());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setPriority(4);
            return thread;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    Context f9236a;
    b b = b.a("android");
    long c;
    long d;
    long e;
    int f;
    private ThreadPoolExecutor h;

    private h(Context context) {
        this.f9236a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3, TimeUnit.SECONDS, new ArrayBlockingQueue(20), i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.h = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f9236a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final h a(Context context) {
        h hVar = g;
        if (hVar != null) {
            return hVar;
        }
        return b(context);
    }

    private static final synchronized h b(Context context) {
        synchronized (h.class) {
            if (g != null) {
                h hVar = g;
                return hVar;
            }
            h hVar2 = new h(context);
            g = hVar2;
            return hVar2;
        }
    }

    public final Future<p> a(o oVar) {
        long j;
        if (n.a(this.f9236a)) {
            hashCode();
            Integer.valueOf(this.h.getActiveCount());
            Long.valueOf(this.h.getCompletedTaskCount());
            Long.valueOf(this.h.getTaskCount());
            long j2 = this.e;
            long j3 = 0;
            if (j2 == 0) {
                j = 0;
            } else {
                j = ((this.c * 1000) / j2) >> 10;
            }
            Long.valueOf(j);
            int i2 = this.f;
            if (i2 != 0) {
                j3 = this.d / ((long) i2);
            }
            Long.valueOf(j3);
            Long.valueOf(this.c);
            Long.valueOf(this.d);
            Long.valueOf(this.e);
            Integer.valueOf(this.f);
        }
        final l lVar = new l(this, (j) oVar);
        AnonymousClass1 r9 = new FutureTask<p>(lVar) {
            /* access modifiers changed from: protected */
            public final void done() {
                j a2 = lVar.a();
                if (a2.a() == null) {
                    super.done();
                    return;
                }
                try {
                    get();
                    if (isCancelled() || a2.f) {
                        a2.f = true;
                        if (!isCancelled() || !isDone()) {
                            cancel(false);
                        }
                    }
                } catch (InterruptedException unused) {
                } catch (ExecutionException e) {
                    if (e.getCause() != null && (e.getCause() instanceof g)) {
                        e.getCause();
                    }
                } catch (CancellationException unused2) {
                    a2.f = true;
                } catch (Throwable th) {
                    throw new RuntimeException("An error occured while executing http request", th);
                }
            }
        };
        this.h.execute(r9);
        return r9;
    }
}
