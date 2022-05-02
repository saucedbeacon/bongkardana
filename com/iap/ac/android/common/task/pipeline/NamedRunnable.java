package com.iap.ac.android.common.task.pipeline;

import android.text.TextUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.pipeline.Pool;
import com.iap.ac.android.common.task.pipeline.StandardPipeline;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedRunnable implements Runnable, Pool.Poolable {
    static final String TAG = "AsyncTaskExecutor";
    public static final NamedRunnablePool TASK_POOL = new NamedRunnablePool(8, 16);
    StandardPipeline.IScheduleNext mScheduleNext;
    Runnable mTask;
    String mThreadName;
    int mWeight = 0;

    NamedRunnable(Runnable runnable, String str, int i) {
        this.mTask = runnable;
        this.mThreadName = str;
        this.mWeight = i;
    }

    /* access modifiers changed from: package-private */
    public void setThreadName(String str) {
        this.mThreadName = str;
    }

    /* access modifiers changed from: package-private */
    public void setTask(Runnable runnable) {
        this.mTask = runnable;
    }

    /* access modifiers changed from: package-private */
    public NamedRunnable setScheduleNext(StandardPipeline.IScheduleNext iScheduleNext) {
        this.mScheduleNext = iScheduleNext;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void setWeight(int i) {
        this.mWeight = i;
    }

    public void run() {
        String str;
        StandardPipeline.IScheduleNext iScheduleNext;
        if (!TextUtils.isEmpty(this.mThreadName)) {
            str = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder("NamedRunable.run(set ThreadName to:");
            sb.append(this.mThreadName);
            sb.append(")");
            ACLog.i("AsyncTaskExecutor", sb.toString());
            Thread currentThread = Thread.currentThread();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_");
            sb2.append(this.mThreadName);
            currentThread.setName(sb2.toString());
        } else {
            str = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ACLog.v("AsyncTaskExecutor", "start at ".concat(String.valueOf(currentTimeMillis)));
        try {
            this.mTask.run();
            if (iScheduleNext == null) {
                ACLog.v("AsyncTaskExecutor", "NamedRunnable.run()->finish(finally:null == mScheduleNext)");
            }
        } finally {
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb3 = new StringBuilder("cost ");
            sb3.append(currentTimeMillis2 - currentTimeMillis);
            sb3.append(" ms");
            ACLog.i("AsyncTaskExecutor", sb3.toString());
            if (!TextUtils.isEmpty(this.mThreadName)) {
                StringBuilder sb4 = new StringBuilder("NamedRunable.run(set ThreadName back to:");
                sb4.append(str);
                sb4.append(")");
                ACLog.i("AsyncTaskExecutor", sb4.toString());
                if (str != null) {
                    Thread.currentThread().setName(str);
                }
            }
            if (this.mScheduleNext != null) {
                ACLog.v("AsyncTaskExecutor", "NamedRunnable.run()->finish(finally:mScheduleNext.scheduleNext())");
                this.mScheduleNext.scheduleNext();
            } else {
                ACLog.v("AsyncTaskExecutor", "NamedRunnable.run()->finish(finally:null == mScheduleNext)");
            }
            TASK_POOL.free(this);
            StringBuilder sb5 = new StringBuilder("NamedRunnable.run()->finish(TASK_POOL.free(this)): pool.size=");
            sb5.append(TASK_POOL.freeObjects.size());
            ACLog.d("AsyncTaskExecutor", sb5.toString());
        }
    }

    public void reset() {
        this.mTask = null;
        this.mThreadName = null;
        this.mScheduleNext = null;
        this.mWeight = 0;
    }

    public static final class NamedRunnablePool extends Pool<NamedRunnable> {
        private final AtomicInteger mIndex = new AtomicInteger(1);

        public NamedRunnablePool(int i, int i2) {
            super(i, i2);
        }

        @Deprecated
        public final NamedRunnable obtain() {
            ACLog.w("AsyncTaskExecutor", "method is deprecated, call obtain(Runnable, String) method instead.");
            return null;
        }

        public final synchronized NamedRunnable obtain(Runnable runnable, String str) {
            return obtain(runnable, str, 0);
        }

        public final synchronized NamedRunnable obtain(Runnable runnable, String str, int i) {
            NamedRunnable namedRunnable;
            if (this.freeObjects.size() == 0) {
                ACLog.i("AsyncTaskExecutor", "NamedRunnablePool.obtain(): create a new NamedRunnable obj.");
                namedRunnable = newObject(runnable, str, i);
            } else {
                ACLog.i("AsyncTaskExecutor", "NamedRunnablePool.obtain(): hit a cache NamedRunnable obj.");
                NamedRunnable namedRunnable2 = (NamedRunnable) this.freeObjects.pop();
                namedRunnable2.setTask(runnable);
                namedRunnable2.setThreadName(str);
                namedRunnable2.setWeight(i);
                namedRunnable = namedRunnable2;
            }
            return namedRunnable;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public final NamedRunnable newObject() {
            ACLog.w("AsyncTaskExecutor", "method is deprecated, call newObject(Runnable, String) method instead.");
            return null;
        }

        /* access modifiers changed from: package-private */
        public final NamedRunnable newObject(Runnable runnable, String str, int i) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder("NamedRunable_");
                sb.append(this.mIndex.getAndIncrement());
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("NamedRunable_");
                sb2.append(this.mIndex.getAndIncrement());
                sb2.append("_");
                sb2.append(str);
                str2 = sb2.toString();
            }
            return new NamedRunnable(runnable, str2, i);
        }

        public final synchronized void free(NamedRunnable namedRunnable) {
            super.free(namedRunnable);
        }

        public final synchronized void freeAll(List<NamedRunnable> list) {
            super.freeAll(list);
        }

        public final synchronized void clear() {
            super.clear();
        }
    }
}
