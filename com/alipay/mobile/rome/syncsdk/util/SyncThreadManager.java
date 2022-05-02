package com.alipay.mobile.rome.syncsdk.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class SyncThreadManager {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f9457a;
    private ScheduledExecutorService b;

    public enum ThreadType {
        SYNC_RECEIVE,
        SYNC_DISPATCH
    }

    /* synthetic */ SyncThreadManager(byte b2) {
        this();
    }

    private SyncThreadManager() {
        this.f9457a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i((byte) 0));
        this.b = new ScheduledThreadPoolExecutor(0, new h((byte) 0));
    }

    public final synchronized void a(ThreadType threadType, Runnable runnable) {
        ExecutorService a2 = a(threadType);
        if (a2 != null) {
            a2.submit(runnable);
        }
    }

    public final ExecutorService a(ThreadType threadType) {
        ExecutorService executorService;
        if (threadType == ThreadType.SYNC_RECEIVE) {
            ExecutorService executorService2 = this.f9457a;
            if (executorService2 == null || executorService2.isTerminated() || this.f9457a.isShutdown()) {
                this.f9457a = Executors.newSingleThreadExecutor(new i((byte) 0));
            }
            executorService = this.f9457a;
        } else if (threadType == ThreadType.SYNC_DISPATCH) {
            ScheduledExecutorService scheduledExecutorService = this.b;
            if (scheduledExecutorService == null || scheduledExecutorService.isTerminated() || this.b.isShutdown()) {
                this.b = Executors.newSingleThreadScheduledExecutor(new h((byte) 0));
            }
            executorService = this.b;
        } else {
            c.a("SyncThreadManager", "unknown thread type: ".concat(String.valueOf(threadType)));
            executorService = null;
        }
        return executorService == null ? Executors.newSingleThreadExecutor(new i((byte) 0)) : executorService;
    }
}
