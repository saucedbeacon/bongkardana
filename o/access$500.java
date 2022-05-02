package o;

import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class access$500 implements ExecutorService {
    private static volatile int getMax;
    private static final long setMin = TimeUnit.SECONDS.toMillis(10);
    private final ExecutorService setMax;

    public interface setMax {
        public static final setMax getMax = setMax;
        public static final setMax getMin = new setMax() {
            public final void setMax(Throwable th) {
            }
        };
        public static final setMax length = new setMax() {
            public final void setMax(Throwable th) {
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        };
        public static final setMax setMax = new setMax() {
            public final void setMax(Throwable th) {
            }
        };

        void setMax(Throwable th);
    }

    public static access$500 setMax() {
        return new access$500(new ThreadPoolExecutor(0, Integer.MAX_VALUE, setMin, TimeUnit.MILLISECONDS, new SynchronousQueue(), new getMax("source-unlimited", setMax.getMax, false)));
    }

    @VisibleForTesting
    access$500(ExecutorService executorService) {
        this.setMax = executorService;
    }

    public final void execute(@NonNull Runnable runnable) {
        this.setMax.execute(runnable);
    }

    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.setMax.submit(runnable);
    }

    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.setMax.invokeAll(collection);
    }

    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.setMax.invokeAll(collection, j, timeUnit);
    }

    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.setMax.invokeAny(collection);
    }

    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.setMax.invokeAny(collection, j, timeUnit);
    }

    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.setMax.submit(runnable, t);
    }

    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.setMax.submit(callable);
    }

    public final void shutdown() {
        this.setMax.shutdown();
    }

    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.setMax.shutdownNow();
    }

    public final boolean isShutdown() {
        return this.setMax.isShutdown();
    }

    public final boolean isTerminated() {
        return this.setMax.isTerminated();
    }

    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.setMax.awaitTermination(j, timeUnit);
    }

    public final String toString() {
        return this.setMax.toString();
    }

    static final class getMax implements ThreadFactory {
        final setMax getMax;
        private int getMin;
        final boolean length;
        private final String setMin;

        getMax(String str, setMax setmax, boolean z) {
            this.setMin = str;
            this.getMax = setmax;
            this.length = z;
        }

        public final synchronized Thread newThread(@NonNull Runnable runnable) {
            AnonymousClass3 r0;
            StringBuilder sb = new StringBuilder("glide-");
            sb.append(this.setMin);
            sb.append("-thread-");
            sb.append(this.getMin);
            r0 = new Thread(runnable, sb.toString()) {
                public final void run() {
                    Process.setThreadPriority(9);
                    if (getMax.this.length) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        getMax.this.getMax.setMax(th);
                    }
                }
            };
            this.getMin++;
            return r0;
        }
    }

    public static final class length {
        @NonNull
        private setMax getMax = setMax.getMax;
        int getMin;
        private long isInside;
        private final boolean length;
        String setMax;
        int setMin;

        length(boolean z) {
            this.length = z;
        }

        public final access$500 setMax() {
            if (!TextUtils.isEmpty(this.setMax)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.getMin, this.setMin, this.isInside, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new getMax(this.setMax, this.getMax, this.length));
                if (this.isInside != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new access$500(threadPoolExecutor);
            }
            StringBuilder sb = new StringBuilder("Name must be non-null and non-empty, but given: ");
            sb.append(this.setMax);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static access$500 getMax() {
        length length2 = new length(true);
        length2.getMin = 1;
        length2.setMin = 1;
        length2.setMax = "disk-cache";
        return length2.setMax();
    }

    public static access$500 setMin() {
        length length2 = new length(false);
        if (getMax == 0) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            if (Build.VERSION.SDK_INT < 17) {
                availableProcessors = Math.max(access$600.getMax(), availableProcessors);
            }
            getMax = Math.min(4, availableProcessors);
        }
        int i = getMax;
        length2.getMin = i;
        length2.setMin = i;
        length2.setMax = "source";
        return length2.setMax();
    }

    public static access$500 getMin() {
        if (getMax == 0) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            if (Build.VERSION.SDK_INT < 17) {
                availableProcessors = Math.max(access$600.getMax(), availableProcessors);
            }
            getMax = Math.min(4, availableProcessors);
        }
        int i = getMax >= 4 ? 2 : 1;
        length length2 = new length(true);
        length2.getMin = i;
        length2.setMin = i;
        length2.setMax = "animation";
        return length2.setMax();
    }
}
