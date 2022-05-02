package com.alipay.android.phone.mobilesdk.socketcraft.integrated.threadpool;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MPaaSNetworkAsyncTaskExecutor implements SCNetworkAsyncTaskExecutor {
    public void executeIO(Runnable runnable) {
        NetworkAsyncTaskExecutor.executeIO(runnable);
    }

    public void executeLowPri(Runnable runnable) {
        NetworkAsyncTaskExecutor.executeLowPri(runnable);
    }

    public void executeLazy(Runnable runnable) {
        NetworkAsyncTaskExecutor.executeLazy(runnable);
    }

    public void execute(Runnable runnable) {
        NetworkAsyncTaskExecutor.execute(runnable);
    }

    public Future<?> submit(Runnable runnable) {
        return NetworkAsyncTaskExecutor.submit(runnable);
    }

    public Future<?> submitLazy(Runnable runnable) {
        return NetworkAsyncTaskExecutor.submitLazy(runnable);
    }

    public void executeSerial(Runnable runnable) {
        NetworkAsyncTaskExecutor.executeSerial(runnable);
    }

    public Future<?> submitSerial(Runnable runnable) {
        return NetworkAsyncTaskExecutor.submitSerial(runnable);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return NetworkAsyncTaskExecutor.submit(callable);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return NetworkAsyncTaskExecutor.schedule(runnable, j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return NetworkAsyncTaskExecutor.schedule(callable, j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return NetworkAsyncTaskExecutor.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return NetworkAsyncTaskExecutor.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }
}
