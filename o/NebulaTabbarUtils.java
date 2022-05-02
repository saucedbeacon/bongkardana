package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.hasCornerMarking;

public final class NebulaTabbarUtils extends hasCornerMarking {
    static final getMin getMax;
    static final IRouterComponent getMin;
    static final setMax isInside;
    static final IRouterComponent length;
    private static final long toFloatRange = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit toIntRange = TimeUnit.SECONDS;
    final AtomicReference<setMax> setMax;
    final ThreadFactory setMin;

    static {
        getMin getmin = new getMin(new IRouterComponent("RxCachedThreadSchedulerShutdown"));
        getMax = getmin;
        getmin.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        length = new IRouterComponent("RxCachedThreadScheduler", max);
        getMin = new IRouterComponent("RxCachedWorkerPoolEvictor", max);
        setMax setmax = new setMax(0, (TimeUnit) null, length);
        isInside = setmax;
        setmax.getMin();
    }

    static final class setMax implements Runnable {
        private final ThreadFactory equals;
        final long getMax;
        final IRedDotManager getMin;
        final ConcurrentLinkedQueue<getMin> length;
        private final ScheduledExecutorService setMax;
        private final Future<?> setMin;

        setMax(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.getMax = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.length = new ConcurrentLinkedQueue<>();
            this.getMin = new IRedDotManager();
            this.equals = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, NebulaTabbarUtils.getMin);
                long j2 = this.getMax;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.setMax = scheduledExecutorService;
            this.setMin = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        public final getMin getMax() {
            if (this.getMin.isDisposed()) {
                return NebulaTabbarUtils.getMax;
            }
            while (!this.length.isEmpty()) {
                getMin poll = this.length.poll();
                if (poll != null) {
                    return poll;
                }
            }
            getMin getmin = new getMin(this.equals);
            this.getMin.getMin(getmin);
            return getmin;
        }

        /* access modifiers changed from: package-private */
        public final void getMin() {
            this.getMin.dispose();
            Future<?> future = this.setMin;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.setMax;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public final void run() {
            if (!this.length.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<getMin> it = this.length.iterator();
                while (it.hasNext()) {
                    getMin next = it.next();
                    if (next.setMax > nanoTime) {
                        return;
                    }
                    if (this.length.remove(next)) {
                        this.getMin.setMin((GriverProgressBar.UpdateRunnable) next);
                    }
                }
            }
        }
    }

    public NebulaTabbarUtils() {
        this(length);
    }

    private NebulaTabbarUtils(ThreadFactory threadFactory) {
        this.setMin = threadFactory;
        this.setMax = new AtomicReference<>(isInside);
        start();
    }

    public final void start() {
        setMax setmax = new setMax(toFloatRange, toIntRange, this.setMin);
        if (!this.setMax.compareAndSet(isInside, setmax)) {
            setmax.getMin();
        }
    }

    public final void shutdown() {
        setMax setmax;
        setMax setmax2;
        do {
            setmax = this.setMax.get();
            setmax2 = isInside;
            if (setmax == setmax2) {
                return;
            }
        } while (!this.setMax.compareAndSet(setmax, setmax2));
        setmax.getMin();
    }

    @NonNull
    public final hasCornerMarking.getMin createWorker() {
        return new setMin(this.setMax.get());
    }

    static final class setMin extends hasCornerMarking.getMin {
        final AtomicBoolean getMax = new AtomicBoolean();
        private final IRedDotManager getMin;
        private final getMin length;
        private final setMax setMin;

        setMin(setMax setmax) {
            this.setMin = setmax;
            this.getMin = new IRedDotManager();
            this.length = setmax.getMax();
        }

        public final void dispose() {
            if (this.getMax.compareAndSet(false, true)) {
                this.getMin.dispose();
                setMax setmax = this.setMin;
                getMin getmin = this.length;
                getmin.setMax = System.nanoTime() + setmax.getMax;
                setmax.length.offer(getmin);
            }
        }

        public final boolean isDisposed() {
            return this.getMax.get();
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.getMin.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.length.getMax(runnable, j, timeUnit, this.getMin);
        }
    }

    static final class getMin extends neverAddHashQuery {
        long setMax = 0;

        getMin(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
