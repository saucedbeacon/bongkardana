package com.iap.ac.android.common.task.pipeline;

import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class StandardPipeline implements PipeLine {
    static final String TAG = "StandardPipeline";
    volatile NamedRunnable mActive;
    private Executor mExecutor;
    protected volatile boolean mIsStart;
    protected ArrayList<NamedRunnable> mTasks;
    final IScheduleNext next;

    interface IScheduleNext {
        void scheduleNext();
    }

    public StandardPipeline() {
        this((Executor) null);
    }

    public StandardPipeline(Executor executor) {
        this.mTasks = new ArrayList<>();
        this.mIsStart = false;
        this.next = new IScheduleNext() {
            public void scheduleNext() {
                ACLog.v(StandardPipeline.TAG, "StandardPipeline.scheduleNext()");
                if (StandardPipeline.this.mIsStart) {
                    StandardPipeline.this.executeNext();
                }
            }
        };
        this.mExecutor = executor;
    }

    public void setExecutor(Executor executor) {
        this.mExecutor = executor;
    }

    public void addTask(Runnable runnable, String str) {
        addTask(runnable, str, 0);
    }

    public void addTask(Runnable runnable, String str, int i) {
        addTask(NamedRunnable.TASK_POOL.obtain(runnable, str, i));
    }

    public void addTask(NamedRunnable namedRunnable) {
        ACLog.v(TAG, "StandardPipeline.addTask()");
        if (this.mTasks == null) {
            this.mTasks = new ArrayList<>();
        }
        namedRunnable.setScheduleNext(this.next);
        synchronized (this.mTasks) {
            int i = 0;
            if (!this.mTasks.isEmpty()) {
                int size = this.mTasks.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (namedRunnable.mWeight <= this.mTasks.get(size).mWeight) {
                        size++;
                        break;
                    } else {
                        size--;
                    }
                }
                if (size >= 0) {
                    i = size;
                }
            }
            this.mTasks.add(i, namedRunnable);
        }
        if (this.mIsStart) {
            doStart();
        }
    }

    public void start() {
        ACLog.v(TAG, "StandardPipeline.start()");
        if (this.mExecutor == null) {
            ACLog.e(TAG, "executor is null, can not start pipeline, return directly");
            return;
        }
        this.mIsStart = true;
        doStart();
    }

    /* access modifiers changed from: protected */
    public void doStart() {
        if (this.mActive == null) {
            executeNext();
        } else {
            ACLog.v(TAG, "StandardPipeline.start(a task is running, so don't call scheduleNext())");
        }
    }

    /* access modifiers changed from: private */
    public void executeNext() {
        synchronized (this.mTasks) {
            if (!this.mTasks.isEmpty()) {
                this.mActive = this.mTasks.remove(0);
            } else {
                this.mActive = null;
                ACLog.v(TAG, "mTasks is empty.");
            }
        }
        if (this.mActive != null) {
            ACLog.d(TAG, "StandardPipeline.scheduleNext()");
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(this.mActive);
            } else {
                ACLog.e(TAG, "The StandardPipeline's Executor is null, can not execute task");
            }
        } else {
            ACLog.d(TAG, "StandardPipeline.scheduleNext(mTasks is empty)");
        }
    }

    public void stop() {
        this.mIsStart = false;
    }
}
