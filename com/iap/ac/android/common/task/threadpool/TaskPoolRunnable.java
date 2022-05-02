package com.iap.ac.android.common.task.threadpool;

import android.os.SystemClock;
import com.iap.ac.android.common.log.ACLog;
import java.util.concurrent.TimeUnit;

public class TaskPoolRunnable implements Runnable {
    private static final String CLASS_NAME = "TaskPoolRunnable";
    private static final long SPEND_TIME_TO_DIAGNOSE = TimeUnit.SECONDS.toMillis(30);
    private static final long SPEND_TIME_TO_PRINT = TimeUnit.SECONDS.toMillis(10);
    private static final long WAIT_TIME_TO_DIAGNOSE = TimeUnit.SECONDS.toMillis(60);
    private static final long WAIT_TIME_TO_PRINT = TimeUnit.SECONDS.toMillis(20);
    private long mEndElapsed;
    private long mEndUptime;
    private String mMethodName;
    private Runnable mRunnable;
    private long mSpendTime;
    private long mStartElapsed;
    private long mStartUptime;
    private long mSubmitElapsed;
    private long mSubmitUptime;
    private TaskType mTaskType;
    private int mThreadPriority;
    private long mWaitTime;

    public enum TaskType {
        UNKNOWN,
        URGENT_DISPLAY,
        URGENT,
        NORMAL,
        IO,
        RPC,
        MMS_HTTP,
        MMS_DJANGO,
        ORDERED,
        SCHEDULED
    }

    public TaskPoolRunnable(Runnable runnable, TaskType taskType, int i) {
        if (runnable != null) {
            this.mRunnable = runnable;
            this.mTaskType = taskType;
            this.mThreadPriority = i;
            this.mMethodName = runnable.getClass().getName();
            this.mSubmitElapsed = System.currentTimeMillis();
            this.mSubmitUptime = SystemClock.uptimeMillis();
            return;
        }
        throw new IllegalArgumentException("runnable is null");
    }

    public void run() {
        int i;
        int i2 = this.mThreadPriority;
        if (i2 > 0 && i2 <= 10) {
            Thread.currentThread().setPriority(this.mThreadPriority);
        }
        this.mStartUptime = SystemClock.uptimeMillis();
        this.mStartElapsed = System.currentTimeMillis();
        long j = this.mStartUptime - this.mSubmitUptime;
        this.mWaitTime = j;
        if (j > WAIT_TIME_TO_PRINT) {
            printOnWaitOrSpendLongTime(false);
            if (this.mWaitTime > WAIT_TIME_TO_DIAGNOSE) {
                diagnoseOnWaitOrSpendLongTime(false);
            }
        }
        try {
            this.mRunnable.run();
            if (i <= 0) {
                return;
            }
        } finally {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.mEndUptime = uptimeMillis;
            long j2 = uptimeMillis - this.mStartUptime;
            this.mSpendTime = j2;
            if (j2 > SPEND_TIME_TO_PRINT) {
                printOnWaitOrSpendLongTime(true);
                if (this.mSpendTime > SPEND_TIME_TO_DIAGNOSE) {
                    diagnoseOnWaitOrSpendLongTime(true);
                }
            }
        }
    }

    private void printOnWaitOrSpendLongTime(boolean z) {
        String str;
        if (z) {
            this.mEndElapsed = System.currentTimeMillis();
            str = "spendLongTime ";
        } else if (this.mTaskType != TaskType.SCHEDULED) {
            str = "waitLongTime ";
        } else {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.mMethodName);
        sb.append(", scheduleType: ");
        sb.append(this.mTaskType);
        sb.append(", spendTime: ");
        sb.append(this.mSpendTime);
        sb.append(", waitTime: ");
        sb.append(this.mWaitTime);
        sb.append(", submitTime: ");
        sb.append(this.mSubmitElapsed);
        sb.append(", startTime: ");
        sb.append(this.mStartElapsed);
        sb.append(", endTime: ");
        sb.append(this.mEndElapsed);
        ACLog.w("TaskScheduleService", sb.toString());
    }

    private void diagnoseOnWaitOrSpendLongTime(boolean z) {
        if (z || this.mTaskType != TaskType.SCHEDULED) {
            TaskPoolDiagnose.waitOrSpendLongTime(z, this.mTaskType, CLASS_NAME, this.mMethodName, this.mWaitTime, this.mSpendTime);
        }
    }
}
