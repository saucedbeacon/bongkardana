package com.alipay.iap.android.aplog.core.uploader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LogThreadPool {
    private static final int CORE_POOL_SIZE;
    public static final int CPU_COUNT;
    private static final int MAXIMUM_POOL_SIZE = ((CPU_COUNT * 2) + 1);
    private static final String TAG = "LogThreadPool";

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadFactory() {
            private final AtomicInteger mCount = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable) {
                StringBuilder sb = new StringBuilder("LogThreadPool background executor");
                sb.append(this.mCount.getAndIncrement());
                return new Thread(runnable, sb.toString());
            }
        }, new ThreadPoolExecutor.DiscardOldestPolicy());
    }
}
