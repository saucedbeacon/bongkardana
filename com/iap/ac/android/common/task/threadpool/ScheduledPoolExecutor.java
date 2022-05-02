package com.iap.ac.android.common.task.threadpool;

import com.iap.ac.android.common.task.threadpool.TaskPoolRunnable;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ScheduledPoolExecutor extends ScheduledThreadPoolExecutor {
    private static final String CLASS_NAME = "ScheduledPoolExecutor";
    private TaskPoolRunnable.TaskType mTaskType;
    private int mThreadPriority = -1;

    public ScheduledPoolExecutor(TaskPoolRunnable.TaskType taskType, int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, threadFactory, rejectedExecutionHandler);
        setKeepAliveTime(10, TimeUnit.MILLISECONDS);
        super.allowCoreThreadTimeOut(true);
        this.mTaskType = taskType;
    }

    public void setThreadPriority(int i) {
        this.mThreadPriority = i;
    }

    public void shutdownValidly() {
        super.shutdown();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(new TaskPoolRunnable(runnable, this.mTaskType, this.mThreadPriority), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(new TaskPoolRunnable(runnable, this.mTaskType, this.mThreadPriority), j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(new TaskPoolRunnable(runnable, this.mTaskType, this.mThreadPriority), j, j2, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return super.submit(new TaskPoolRunnable(runnable, this.mTaskType, this.mThreadPriority), t);
    }

    public void shutdown() {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "shutdown");
        super.shutdown();
    }

    public List<Runnable> shutdownNow() {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "shutdownNow");
        return super.shutdownNow();
    }

    public void purge() {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "purge");
        super.purge();
    }

    public void setCorePoolSize(int i) {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "setCorePoolSize");
        super.setCorePoolSize(i);
    }

    public void setKeepAliveTime(long j, TimeUnit timeUnit) {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "setKeepAliveTime");
        super.setKeepAliveTime(j, timeUnit);
    }

    public void setThreadFactory(ThreadFactory threadFactory) {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "setThreadFactory");
        super.setThreadFactory(threadFactory);
    }

    public void setMaximumPoolSize(int i) {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "setMaximumPoolSize");
        super.setMaximumPoolSize(i);
    }

    public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "setRejectedExecutionHandler");
        super.setRejectedExecutionHandler(rejectedExecutionHandler);
    }

    public void allowCoreThreadTimeOut(boolean z) {
        TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "allowCoreThreadTimeOut");
        super.allowCoreThreadTimeOut(z);
    }
}
