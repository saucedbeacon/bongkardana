package com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DefaultSCNetworkAsyncTaskExecutor implements SCNetworkAsyncTaskExecutor {
    private final ScheduledThreadPoolExecutor schedulePoolExecutor = new ScheduledThreadPoolExecutor(1);
    private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, Integer.MAX_VALUE, 2, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());

    public DefaultSCNetworkAsyncTaskExecutor() {
        this.threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.schedulePoolExecutor.setKeepAliveTime(6, TimeUnit.SECONDS);
        this.schedulePoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void executeIO(Runnable runnable) {
        this.threadPoolExecutor.execute(runnable);
    }

    public void executeLowPri(Runnable runnable) {
        this.threadPoolExecutor.execute(runnable);
    }

    public void executeLazy(Runnable runnable) {
        this.threadPoolExecutor.execute(runnable);
    }

    public void execute(Runnable runnable) {
        this.threadPoolExecutor.execute(runnable);
    }

    public Future<?> submit(Runnable runnable) {
        return this.threadPoolExecutor.submit(runnable);
    }

    public Future<?> submitLazy(Runnable runnable) {
        return this.threadPoolExecutor.submit(runnable);
    }

    public void executeSerial(Runnable runnable) {
        this.threadPoolExecutor.execute(runnable);
    }

    public Future<?> submitSerial(Runnable runnable) {
        return this.threadPoolExecutor.submit(runnable);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.threadPoolExecutor.submit(callable);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.schedulePoolExecutor.schedule(runnable, j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.schedulePoolExecutor.schedule(callable, j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.schedulePoolExecutor.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.schedulePoolExecutor.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }
}
