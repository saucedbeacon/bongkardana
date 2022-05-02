package com.alipay.iap.android.common.task;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.task.pipeline.NamedRunnable;
import com.alipay.iap.android.common.task.transaction.Transaction;
import com.alipay.iap.android.common.task.transaction.TransactionExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AsyncTaskExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static AsyncTaskExecutor INSTANCE = new AsyncTaskExecutor();
    public static final String TAG = "AsyncTaskExecutor";
    private static final ThreadFactory THREADFACTORY = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("AsyncTaskExecutor_thread_");
            sb.append(this.mCount.incrementAndGet());
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder("ThreadFactory.newThread(");
            sb2.append(obj);
            sb2.append(")");
            LoggerWrapper.w("AsyncTaskExecutor", sb2.toString());
            Thread thread = new Thread(runnable, obj);
            thread.setPriority(1);
            return thread;
        }
    };
    final ThreadPoolExecutor PARALLEL_EXECUTOR;
    final ScheduledThreadPoolExecutor SCHEDULED_EXECUTOR;
    final SerialExecutor SERIAL_EXECUTOR;
    final TransactionExecutor TRANSACTION_EXECUTOR;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
    }

    private AsyncTaskExecutor() {
        this.TRANSACTION_EXECUTOR = new TransactionExecutor();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool(THREADFACTORY);
        this.PARALLEL_EXECUTOR = threadPoolExecutor;
        this.SERIAL_EXECUTOR = new SerialExecutor(threadPoolExecutor);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(CORE_POOL_SIZE, THREADFACTORY);
        this.SCHEDULED_EXECUTOR = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        this.SCHEDULED_EXECUTOR.allowCoreThreadTimeOut(true);
        this.SCHEDULED_EXECUTOR.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        this.PARALLEL_EXECUTOR.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static AsyncTaskExecutor getInstance() {
        return INSTANCE;
    }

    public final Executor getExecutor() {
        return this.PARALLEL_EXECUTOR;
    }

    @Deprecated
    public void executeSerially(Runnable runnable) {
        executeSerially(runnable, "");
    }

    public void executeSerially(Runnable runnable, String str) {
        StringBuilder sb = new StringBuilder("AsyncTaskExecutor.executeSerially(Runnable, threadName=");
        sb.append(str);
        sb.append(")");
        LoggerWrapper.v("AsyncTaskExecutor", sb.toString());
        this.SERIAL_EXECUTOR.execute(NamedRunnable.TASK_POOL.obtain(runnable, str));
    }

    @Deprecated
    public void execute(Runnable runnable) {
        execute(runnable, "");
    }

    public void execute(Runnable runnable, String str) {
        StringBuilder sb = new StringBuilder("AsyncTaskExecutor.execute(Runnable, threadName=");
        sb.append(str);
        sb.append(")");
        LoggerWrapper.v("AsyncTaskExecutor", sb.toString());
        this.PARALLEL_EXECUTOR.execute(NamedRunnable.TASK_POOL.obtain(runnable, str));
    }

    @Deprecated
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(runnable, "", j, timeUnit);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, String str, long j, TimeUnit timeUnit) {
        StringBuilder sb = new StringBuilder("AsyncTaskExecutor.schedule(Runnable, threadName=");
        sb.append(str);
        sb.append(")");
        LoggerWrapper.v("AsyncTaskExecutor", sb.toString());
        return this.SCHEDULED_EXECUTOR.schedule(NamedRunnable.TASK_POOL.obtain(runnable, str), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        LoggerWrapper.v("AsyncTaskExecutor", "AsyncTaskExecutor.scheduleAtFixedRate(Runnable)");
        return this.SCHEDULED_EXECUTOR.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.SCHEDULED_EXECUTOR.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public void shutdown() {
        this.TRANSACTION_EXECUTOR.shutdown();
        this.SERIAL_EXECUTOR.shutdown();
        this.PARALLEL_EXECUTOR.shutdown();
        this.SCHEDULED_EXECUTOR.shutdown();
    }

    public String addTransaction(Transaction transaction) {
        return this.TRANSACTION_EXECUTOR.addTransaction(transaction);
    }

    public void removeTransaction(String str) {
        this.TRANSACTION_EXECUTOR.removeTransaction(str);
    }

    public static class Factory {
        public AsyncTaskExecutor createExecutorInstance() {
            return new AsyncTaskExecutor();
        }
    }
}
