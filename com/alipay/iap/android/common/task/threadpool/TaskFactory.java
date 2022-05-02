package com.alipay.iap.android.common.task.threadpool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskFactory implements ThreadFactory {
    private AtomicInteger mNewThreadCount = new AtomicInteger(1);
    private String mThreadNamePrefix;
    private int mThreadPriority;

    public TaskFactory(String str, int i) {
        this.mThreadNamePrefix = str;
        this.mThreadPriority = i;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mThreadNamePrefix);
        sb.append(this.mNewThreadCount.getAndIncrement());
        Thread thread = new Thread(runnable, sb.toString());
        thread.setPriority(this.mThreadPriority);
        return thread;
    }
}
