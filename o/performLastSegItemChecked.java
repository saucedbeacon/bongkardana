package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.hasCornerMarking;

public final class performLastSegItemChecked extends hasCornerMarking {
    static final getMin getMax;
    static final length length;
    static final IRouterComponent setMax;
    static final int setMin;
    final ThreadFactory getMin;
    final AtomicReference<getMin> toIntRange;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        setMin = availableProcessors;
        length length2 = new length(new IRouterComponent("RxComputationShutdown"));
        length = length2;
        length2.dispose();
        IRouterComponent iRouterComponent = new IRouterComponent("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        setMax = iRouterComponent;
        getMin getmin = new getMin(0, iRouterComponent);
        getMax = getmin;
        for (length dispose : getmin.getMin) {
            dispose.dispose();
        }
    }

    static final class getMin {
        long getMax;
        final length[] getMin;
        final int length;

        getMin(int i, ThreadFactory threadFactory) {
            this.length = i;
            this.getMin = new length[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.getMin[i2] = new length(threadFactory);
            }
        }

        public final length setMin() {
            int i = this.length;
            if (i == 0) {
                return performLastSegItemChecked.length;
            }
            length[] lengthArr = this.getMin;
            long j = this.getMax;
            this.getMax = 1 + j;
            return lengthArr[(int) (j % ((long) i))];
        }
    }

    public performLastSegItemChecked() {
        this(setMax);
    }

    private performLastSegItemChecked(ThreadFactory threadFactory) {
        this.getMin = threadFactory;
        this.toIntRange = new AtomicReference<>(getMax);
        start();
    }

    @NonNull
    public final hasCornerMarking.getMin createWorker() {
        return new setMin(this.toIntRange.get().setMin());
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        return this.toIntRange.get().setMin().getMin(runnable, j, timeUnit);
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.toIntRange.get().setMin().setMin(runnable, j, j2, timeUnit);
    }

    public final void start() {
        getMin getmin = new getMin(setMin, this.getMin);
        if (!this.toIntRange.compareAndSet(getMax, getmin)) {
            for (length dispose : getmin.getMin) {
                dispose.dispose();
            }
        }
    }

    public final void shutdown() {
        getMin getmin;
        getMin getmin2;
        do {
            getmin = this.toIntRange.get();
            getmin2 = getMax;
            if (getmin == getmin2) {
                return;
            }
        } while (!this.toIntRange.compareAndSet(getmin, getmin2));
        for (length dispose : getmin.getMin) {
            dispose.dispose();
        }
    }

    static final class setMin extends hasCornerMarking.getMin {
        private final GriverPullDownHeader getMax = new GriverPullDownHeader();
        private final IRedDotManager getMin = new IRedDotManager();
        private final GriverPullDownHeader length;
        private final length setMax;
        volatile boolean setMin;

        setMin(length length2) {
            this.setMax = length2;
            GriverPullDownHeader griverPullDownHeader = new GriverPullDownHeader();
            this.length = griverPullDownHeader;
            griverPullDownHeader.getMin(this.getMax);
            this.length.getMin(this.getMin);
        }

        public final void dispose() {
            if (!this.setMin) {
                this.setMin = true;
                this.length.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.setMin;
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable getMin(@NonNull Runnable runnable) {
            if (this.setMin) {
                return EmptyDisposable.INSTANCE;
            }
            return this.setMax.getMax(runnable, 0, TimeUnit.MILLISECONDS, this.getMax);
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.setMin) {
                return EmptyDisposable.INSTANCE;
            }
            return this.setMax.getMax(runnable, j, timeUnit, this.getMin);
        }
    }

    static final class length extends neverAddHashQuery {
        length(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
