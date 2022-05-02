package com.iap.ac.android.common.task.threadpool;

import android.os.SystemClock;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.threadpool.TaskPoolRunnable;
import com.iap.ac.android.common.utils.LoggerUtil;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TaskPoolExecutor extends ThreadPoolExecutor {
    private static final String CLASS_NAME = "TaskPoolExecutor";
    private boolean isPaused;
    private long lastPauseTime = -1;
    private TaskPoolRunnable.TaskType mTaskType;
    private int mThreadPriority;
    private ReentrantLock pauseLock;
    private Condition unPaused;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskPoolExecutor(TaskPoolRunnable.TaskType taskType, int i, int i2, long j, TimeUnit timeUnit, boolean z, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.pauseLock = reentrantLock;
        this.unPaused = reentrantLock.newCondition();
        super.allowCoreThreadTimeOut(z);
        this.mTaskType = taskType;
        this.mThreadPriority = -1;
    }

    public void setThreadPriority(int i) {
        this.mThreadPriority = i;
    }

    public void shutdownValidly() {
        super.shutdown();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|(3:7|8|(1:10))|13|14|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        r10.pauseLock.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeExecute(java.lang.Thread r11, java.lang.Runnable r12) {
        /*
            r10 = this;
            java.lang.String r0 = " but thread pool request pause."
            java.lang.String r1 = "try run :"
            super.beforeExecute(r11, r12)
            java.util.concurrent.locks.ReentrantLock r2 = r10.pauseLock
            r2.lock()
            boolean r2 = r10.isPaused     // Catch:{ InterruptedException -> 0x0069 }
            if (r2 == 0) goto L_0x0035
            long r2 = r10.lastPauseTime     // Catch:{ InterruptedException -> 0x0069 }
            r4 = 0
            r6 = 4
            java.lang.String r8 = "TaskPoolExecutor"
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x003b
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x0069 }
            long r4 = r10.lastPauseTime     // Catch:{ InterruptedException -> 0x0069 }
            long r2 = r2 - r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0069 }
            long r4 = r4.toMillis(r6)     // Catch:{ InterruptedException -> 0x0069 }
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x003b
            java.lang.String r12 = "wanna  pause thread pool, but exceed max wait time."
            com.iap.ac.android.common.log.ACLog.i(r8, r12)     // Catch:{ InterruptedException -> 0x0069 }
            r10.resume()     // Catch:{ InterruptedException -> 0x0069 }
        L_0x0035:
            java.util.concurrent.locks.ReentrantLock r11 = r10.pauseLock
            r11.unlock()
            return
        L_0x003b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ InterruptedException -> 0x0069 }
            r2.append(r12)     // Catch:{ InterruptedException -> 0x0069 }
            r2.append(r0)     // Catch:{ InterruptedException -> 0x0069 }
            java.lang.String r2 = r2.toString()     // Catch:{ InterruptedException -> 0x0069 }
            com.iap.ac.android.common.log.ACLog.i(r8, r2)     // Catch:{ InterruptedException -> 0x0069 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ InterruptedException -> 0x0069 }
            r2.append(r12)     // Catch:{ InterruptedException -> 0x0069 }
            r2.append(r0)     // Catch:{ InterruptedException -> 0x0069 }
            java.lang.String r12 = r2.toString()     // Catch:{ InterruptedException -> 0x0069 }
            com.iap.ac.android.common.log.ACLog.i(r8, r12)     // Catch:{ InterruptedException -> 0x0069 }
            java.util.concurrent.locks.Condition r12 = r10.unPaused     // Catch:{ InterruptedException -> 0x0069 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0069 }
            r12.await(r6, r0)     // Catch:{ InterruptedException -> 0x0069 }
            goto L_0x0035
        L_0x0067:
            r11 = move-exception
            goto L_0x006d
        L_0x0069:
            r11.interrupt()     // Catch:{ all -> 0x0067 }
            goto L_0x0035
        L_0x006d:
            java.util.concurrent.locks.ReentrantLock r12 = r10.pauseLock
            r12.unlock()
            goto L_0x0074
        L_0x0073:
            throw r11
        L_0x0074:
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.common.task.threadpool.TaskPoolExecutor.beforeExecute(java.lang.Thread, java.lang.Runnable):void");
    }

    public void pause() {
        StringBuilder sb = new StringBuilder("pause execute : ");
        sb.append(this.mTaskType);
        ACLog.i(CLASS_NAME, sb.toString());
        StringBuilder sb2 = new StringBuilder("pause execute:");
        sb2.append(this.mTaskType);
        ACLog.i(CLASS_NAME, sb2.toString());
        this.pauseLock.lock();
        try {
            this.isPaused = true;
            this.lastPauseTime = SystemClock.elapsedRealtime();
        } finally {
            this.pauseLock.unlock();
        }
    }

    public void resume() {
        StringBuilder sb = new StringBuilder("resume execute:");
        sb.append(this.mTaskType);
        ACLog.i(CLASS_NAME, sb.toString());
        StringBuilder sb2 = new StringBuilder("resume execute:");
        sb2.append(this.mTaskType);
        ACLog.i(CLASS_NAME, sb2.toString());
        this.pauseLock.lock();
        try {
            this.isPaused = false;
            this.lastPauseTime = -1;
            this.unPaused.signalAll();
        } finally {
            this.pauseLock.unlock();
        }
    }

    public void execute(Runnable runnable) {
        super.execute(new TaskPoolRunnable(runnable, this.mTaskType, this.mThreadPriority));
    }

    public void shutdown() {
        if (TaskPoolDiagnose.isShutdownCheckInvoker(LoggerUtil.backTrackInvoker())) {
            TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "shutdown");
        }
        super.shutdown();
    }

    public List<Runnable> shutdownNow() {
        if (TaskPoolDiagnose.isShutdownCheckInvoker(LoggerUtil.backTrackInvoker())) {
            TaskPoolDiagnose.shouldNotBeInvoked(this.mTaskType, CLASS_NAME, "shutdownNow");
        }
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
