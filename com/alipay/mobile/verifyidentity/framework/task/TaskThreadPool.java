package com.alipay.mobile.verifyidentity.framework.task;

import com.alipay.mobile.verifyidentity.base.log.VILog;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TaskThreadPool extends ThreadPoolExecutor {
    public static String TAG = TaskThreadPool.class.getSimpleName();

    public TaskThreadPool() {
        super(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "verifyidentity_task");
            }
        });
    }

    /* access modifiers changed from: protected */
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        String str = TAG;
        StringBuilder sb = new StringBuilder("thread begin to run ");
        sb.append(thread.getId());
        VILog.i(str, sb.toString());
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        VILog.i(TAG, "thread end to run ", th);
    }
}
