package com.ta.audid.g;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static j f9847a;

    /* renamed from: a  reason: collision with other field name */
    private static ScheduledExecutorService f8837a;
    private static final AtomicInteger b = new AtomicInteger();

    static class a implements ThreadFactory {
        private int priority;

        public a(int i) {
            this.priority = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "utdid:".concat(String.valueOf(j.a().getAndIncrement())));
            thread.setPriority(this.priority);
            return thread;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static synchronized ScheduledExecutorService m1320a() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (j.class) {
            if (f8837a == null) {
                f8837a = Executors.newScheduledThreadPool(3, new a(1));
            }
            scheduledExecutorService = f8837a;
        }
        return scheduledExecutorService;
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f9847a == null) {
                f9847a = new j();
            }
            jVar = f9847a;
        }
        return jVar;
    }

    public final ScheduledFuture schedule(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        return a().schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final ScheduledFuture a(ScheduledFuture scheduledFuture, Runnable runnable, long j, long j2) {
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(false);
        }
        return a().scheduleAtFixedRate(runnable, j, j2, TimeUnit.MILLISECONDS);
    }

    public void submit(Runnable runnable) {
        try {
            a().submit(runnable);
        } catch (Throwable unused) {
        }
    }
}
