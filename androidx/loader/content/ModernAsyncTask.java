package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {
    private static final ThreadFactory getMax = new ThreadFactory() {
        private final AtomicInteger getMin = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("ModernAsyncTask #");
            sb.append(this.getMin.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };
    public static final Executor getMin;
    private static volatile Executor isInside;
    private static final BlockingQueue<Runnable> setMin = new LinkedBlockingQueue(10);
    private static setMax toIntRange;
    private final FutureTask<Result> IsOverlapping = new FutureTask<Result>(this.toFloatRange) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                ModernAsyncTask.this.length(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.length(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };
    private volatile Status equals = Status.PENDING;
    final AtomicBoolean length = new AtomicBoolean();
    final AtomicBoolean setMax = new AtomicBoolean();
    private final length<Params, Result> toFloatRange = new length<Params, Result>() {
        public final Result call() throws Exception {
            ModernAsyncTask.this.setMax.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = ModernAsyncTask.this.length();
                Binder.flushPendingCommands();
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                ModernAsyncTask.getMin().obtainMessage(1, new setMin(modernAsyncTask, result)).sendToTarget();
                return result;
            } catch (Throwable th) {
                ModernAsyncTask modernAsyncTask2 = ModernAsyncTask.this;
                ModernAsyncTask.getMin().obtainMessage(1, new setMin(modernAsyncTask2, result)).sendToTarget();
                throw th;
            }
        }
    };

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: protected */
    public void getMax(Result result) {
    }

    /* access modifiers changed from: protected */
    public abstract Result length();

    /* access modifiers changed from: protected */
    public void setMin(Result result) {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, setMin, getMax);
        getMin = threadPoolExecutor;
        isInside = threadPoolExecutor;
    }

    static Handler getMin() {
        setMax setmax;
        synchronized (ModernAsyncTask.class) {
            if (toIntRange == null) {
                toIntRange = new setMax();
            }
            setmax = toIntRange;
        }
        return setmax;
    }

    /* access modifiers changed from: package-private */
    public final void length(Result result) {
        if (!this.setMax.get()) {
            getMin().obtainMessage(1, new setMin(this, result)).sendToTarget();
        }
    }

    public final boolean setMin() {
        return this.length.get();
    }

    public final boolean setMax(boolean z) {
        this.length.set(true);
        return this.IsOverlapping.cancel(false);
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.AnonymousClass3.<clinit>():void");
        }
    }

    public final ModernAsyncTask<Params, Progress, Result> getMin(Executor executor, Params... paramsArr) {
        if (this.equals != Status.PENDING) {
            int i = AnonymousClass3.getMin[this.equals.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.equals = Status.RUNNING;
            this.toFloatRange.setMax = paramsArr;
            executor.execute(this.IsOverlapping);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax(Result result) {
        if (setMin()) {
            getMax(result);
        } else {
            setMin(result);
        }
        this.equals = Status.FINISHED;
    }

    static class setMax extends Handler {
        setMax() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            setMin setmin = (setMin) message.obj;
            if (message.what == 1) {
                setmin.setMin.setMax(setmin.getMin[0]);
            }
        }
    }

    static abstract class length<Params, Result> implements Callable<Result> {
        Params[] setMax;

        length() {
        }
    }

    static class setMin<Data> {
        final Data[] getMin;
        final ModernAsyncTask setMin;

        setMin(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.setMin = modernAsyncTask;
            this.getMin = dataArr;
        }
    }
}
