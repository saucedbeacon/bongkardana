package com.alipay.iap.android.common.task;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alipay.iap.android.common.log.LoggerWrapper;

public class TimerTaskManager {
    private static TimerTaskManager INSTANCE = null;
    private static final String TAG = "TimerTaskManager";
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private TaskHandlerThread mTaskHandlerThread;

    public static TimerTaskManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TimerTaskManager();
        }
        return INSTANCE;
    }

    private TimerTaskManager() {
    }

    public void postToMain(Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    public void postToMain(Runnable runnable, int i) {
        this.mMainHandler.postDelayed(runnable, (long) i);
    }

    public void start() {
        if (this.mTaskHandlerThread == null) {
            TaskHandlerThread taskHandlerThread = new TaskHandlerThread();
            this.mTaskHandlerThread = taskHandlerThread;
            taskHandlerThread.start();
        }
    }

    public void shutdown() {
        TaskHandlerThread taskHandlerThread = this.mTaskHandlerThread;
        if (taskHandlerThread != null) {
            taskHandlerThread.quit();
            this.mTaskHandlerThread = null;
        }
    }

    public void scheduleTask(BaseTask baseTask, long j) {
        if (this.mTaskHandlerThread == null) {
            start();
        }
        this.mTaskHandlerThread.waitUntilReady();
        LoggerWrapper.i(TAG, "schedule task:".concat(String.valueOf(baseTask)));
        baseTask.bindTimer(this);
        if (j > 0) {
            this.mTaskHandlerThread.mHandler.postDelayed(baseTask, j);
        } else {
            this.mTaskHandlerThread.mHandler.post(baseTask);
        }
    }

    public void scheduleTask(BaseTask baseTask) {
        scheduleTask(baseTask, 0);
    }

    public void scheduleTaskDelay(BaseTask baseTask) {
        scheduleTask(baseTask, (long) baseTask.nextDelayMillSeconds());
        baseTask.onScheduleFinish();
    }

    public void cancelTask(BaseTask baseTask) {
        TaskHandlerThread taskHandlerThread = this.mTaskHandlerThread;
        if (taskHandlerThread != null) {
            taskHandlerThread.waitUntilReady();
            this.mTaskHandlerThread.mHandler.removeCallbacks(baseTask);
            baseTask.reset();
            LoggerWrapper.i(TAG, "cancel task:".concat(String.valueOf(baseTask)));
        }
    }

    public static abstract class BaseTask implements Runnable {
        private TimerTaskManager mTaskManager;

        public abstract void call();

        public abstract int nextDelayMillSeconds();

        public void onScheduleFinish() {
        }

        public void reset() {
        }

        public void bindTimer(TimerTaskManager timerTaskManager) {
            this.mTaskManager = timerTaskManager;
        }

        public void run() {
            scheduleNext();
            call();
        }

        private void scheduleNext() {
            TimerTaskManager timerTaskManager = this.mTaskManager;
            if (timerTaskManager != null) {
                timerTaskManager.scheduleTaskDelay(this);
                onScheduleFinish();
            }
        }
    }

    static class TaskHandlerThread extends HandlerThread {
        /* access modifiers changed from: private */
        public Handler mHandler;

        private TaskHandlerThread() {
            super("TaskHandlerThread");
        }

        /* access modifiers changed from: private */
        public synchronized void waitUntilReady() {
            if (this.mHandler == null) {
                this.mHandler = new Handler(getLooper());
            }
        }
    }
}
