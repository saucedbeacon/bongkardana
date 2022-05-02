package com.iap.ac.android.loglite.storage;

import android.app.Application;
import android.text.TextUtils;
import com.iap.ac.android.loglite.log.LogEvent;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class AsyncFileStorage extends AnalyticsFileStorage {
    public ThreadPoolExecutor h;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LogEvent f9739a;

        public a(LogEvent logEvent) {
            this.f9739a = logEvent;
        }

        public void run() {
            AsyncFileStorage asyncFileStorage = AsyncFileStorage.this;
            if (asyncFileStorage instanceof com.iap.ac.android.loglite.b.a) {
                ((com.iap.ac.android.loglite.b.a) asyncFileStorage).f = this.f9739a.e();
            }
            AsyncFileStorage.this.a(this.f9739a.f(), this.f9739a.c());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            AsyncFileStorage.this.d();
        }
    }

    public AsyncFileStorage(Application application, String str) {
        super(application, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, e(), f());
        this.h = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void a(LogEvent logEvent) {
        String valueOf = String.valueOf(this.h.getQueue().size());
        if (!TextUtils.isEmpty("writeQueueSize")) {
            logEvent.d.put("writeQueueSize", valueOf);
        }
        this.h.execute(new a(logEvent));
    }

    public abstract BlockingQueue<Runnable> e();

    public abstract RejectedExecutionHandler f();

    public void a() {
        this.h.execute(new b());
    }
}
