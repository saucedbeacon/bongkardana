package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;
import o.hasCornerMarking;

public final class getAssetManager extends hasCornerMarking {
    private static final getAssetManager length = new getAssetManager();

    public static getAssetManager setMin() {
        return length;
    }

    @NonNull
    public final hasCornerMarking.getMin createWorker() {
        return new getMin();
    }

    getAssetManager() {
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            setRefreshAnimation.getMax(runnable, "run is null");
            RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
            if (redDotDrawable != null) {
                runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
            }
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            SecuritySignature.getMax((Throwable) e);
        }
        return EmptyDisposable.INSTANCE;
    }

    static final class getMin extends hasCornerMarking.getMin {
        final PriorityBlockingQueue<setMin> getMax = new PriorityBlockingQueue<>();
        volatile boolean getMin;
        final AtomicInteger setMax = new AtomicInteger();
        private final AtomicInteger setMin = new AtomicInteger();

        getMin() {
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable getMin(@NonNull Runnable runnable) {
            return setMin(runnable, TimeUnit.MILLISECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            long convert = TimeUnit.MILLISECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return setMin(new length(runnable, this, convert), convert);
        }

        private GriverProgressBar.UpdateRunnable setMin(Runnable runnable, long j) {
            if (this.getMin) {
                return EmptyDisposable.INSTANCE;
            }
            setMin setmin = new setMin(runnable, Long.valueOf(j), this.setMax.incrementAndGet());
            this.getMax.add(setmin);
            if (this.setMin.getAndIncrement() == 0) {
                int i = 1;
                while (!this.getMin) {
                    setMin poll = this.getMax.poll();
                    if (poll == null) {
                        i = this.setMin.addAndGet(-i);
                        if (i == 0) {
                            return EmptyDisposable.INSTANCE;
                        }
                    } else if (!poll.length) {
                        poll.getMin.run();
                    }
                }
                this.getMax.clear();
                return EmptyDisposable.INSTANCE;
            }
            setMin setmin2 = new setMin(setmin);
            setRefreshAnimation.getMax(setmin2, "run is null");
            return new OnStateChangeListener(setmin2);
        }

        public final void dispose() {
            this.getMin = true;
        }

        public final boolean isDisposed() {
            return this.getMin;
        }

        final class setMin implements Runnable {
            final setMin setMin;

            setMin(setMin setmin) {
                this.setMin = setmin;
            }

            public final void run() {
                this.setMin.length = true;
                getMin.this.getMax.remove(this.setMin);
            }
        }
    }

    static final class setMin implements Comparable<setMin> {
        final Runnable getMin;
        volatile boolean length;
        final long setMax;
        final int setMin;

        public final /* synthetic */ int compareTo(Object obj) {
            setMin setmin = (setMin) obj;
            int min = setRefreshAnimation.setMin(this.setMax, setmin.setMax);
            return min == 0 ? setRefreshAnimation.getMax(this.setMin, setmin.setMin) : min;
        }

        setMin(Runnable runnable, Long l, int i) {
            this.getMin = runnable;
            this.setMax = l.longValue();
            this.setMin = i;
        }
    }

    static final class length implements Runnable {
        private final Runnable getMin;
        private final getMin length;
        private final long setMax;

        length(Runnable runnable, getMin getmin, long j) {
            this.getMin = runnable;
            this.length = getmin;
            this.setMax = j;
        }

        public final void run() {
            if (!this.length.getMin) {
                long max = getMin.getMax(TimeUnit.MILLISECONDS);
                long j = this.setMax;
                if (j > max) {
                    try {
                        Thread.sleep(j - max);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        SecuritySignature.getMax((Throwable) e);
                        return;
                    }
                }
                if (!this.length.getMin) {
                    this.getMin.run();
                }
            }
        }
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable) {
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }
}
