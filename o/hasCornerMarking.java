package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import o.GriverProgressBar;

public abstract class hasCornerMarking {
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    @NonNull
    public abstract getMin createWorker();

    public void shutdown() {
    }

    public void start() {
    }

    public static long clockDriftTolerance() {
        return CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
    }

    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @NonNull
    public GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable) {
        return scheduleDirect(runnable, 0, TimeUnit.NANOSECONDS);
    }

    @NonNull
    public GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        getMin createWorker = createWorker();
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        setMax setmax = new setMax(runnable, createWorker);
        createWorker.setMin(setmax, j, timeUnit);
        return setmax;
    }

    @NonNull
    public GriverProgressBar.UpdateRunnable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
        getMin createWorker = createWorker();
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        getMax getmax = new getMax(runnable, createWorker);
        GriverProgressBar.UpdateRunnable length = createWorker.length(getmax, j, j2, timeUnit);
        return length == EmptyDisposable.INSTANCE ? length : getmax;
    }

    @NonNull
    public <S extends hasCornerMarking & GriverProgressBar.UpdateRunnable> S when(@NonNull RedDotDrawable<setBadgeData<setBadgeData<setFavoriteBtnVisibility>>, setFavoriteBtnVisibility> redDotDrawable) {
        return new getPluginName(redDotDrawable, this);
    }

    public static abstract class getMin implements GriverProgressBar.UpdateRunnable {
        @NonNull
        public abstract GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit);

        @NonNull
        public GriverProgressBar.UpdateRunnable getMin(@NonNull Runnable runnable) {
            return setMin(runnable, 0, TimeUnit.NANOSECONDS);
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable length(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
            Runnable runnable2 = runnable;
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            setLoadMoreTipColor setloadmoretipcolor = new setLoadMoreTipColor();
            setLoadMoreTipColor setloadmoretipcolor2 = new setLoadMoreTipColor(setloadmoretipcolor);
            setRefreshAnimation.getMax(runnable2, "run is null");
            RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
            if (redDotDrawable != null) {
                runnable2 = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable2);
            }
            long nanos = timeUnit2.toNanos(j2);
            long convert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            GriverProgressBar.UpdateRunnable min = setMin(new getMax(convert + timeUnit2.toNanos(j3), runnable2, convert, setloadmoretipcolor2, nanos), j3, timeUnit2);
            if (min == EmptyDisposable.INSTANCE) {
                return min;
            }
            setloadmoretipcolor.replace(min);
            return setloadmoretipcolor2;
        }

        public static long getMax(@NonNull TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        final class getMax implements Runnable {
            long getMax;
            @NonNull
            final setLoadMoreTipColor getMin;
            final long length;
            long setMax;
            @NonNull
            final Runnable setMin;
            long toFloatRange;

            getMax(long j, @NonNull Runnable runnable, long j2, @NonNull setLoadMoreTipColor setloadmoretipcolor, long j3) {
                this.setMin = runnable;
                this.getMin = setloadmoretipcolor;
                this.length = j3;
                this.setMax = j2;
                this.toFloatRange = j;
            }

            public final void run() {
                long j;
                this.setMin.run();
                if (!this.getMin.isDisposed()) {
                    long max = getMin.getMax(TimeUnit.NANOSECONDS);
                    long j2 = this.setMax;
                    if (hasCornerMarking.CLOCK_DRIFT_TOLERANCE_NANOSECONDS + max < j2 || max >= j2 + this.length + hasCornerMarking.CLOCK_DRIFT_TOLERANCE_NANOSECONDS) {
                        long j3 = this.length;
                        long j4 = max + j3;
                        long j5 = this.getMax + 1;
                        this.getMax = j5;
                        this.toFloatRange = j4 - (j3 * j5);
                        j = j4;
                    } else {
                        long j6 = this.toFloatRange;
                        long j7 = this.getMax + 1;
                        this.getMax = j7;
                        j = j6 + (j7 * this.length);
                    }
                    this.setMax = max;
                    this.getMin.replace(getMin.this.setMin(this, j - max, TimeUnit.NANOSECONDS));
                }
            }
        }
    }

    static final class getMax implements GriverProgressBar.UpdateRunnable, Runnable {
        @NonNull
        final getMin getMax;
        volatile boolean length;
        @NonNull
        final Runnable setMin;

        getMax(@NonNull Runnable runnable, @NonNull getMin getmin) {
            this.setMin = runnable;
            this.getMax = getmin;
        }

        public final void run() {
            if (!this.length) {
                try {
                    this.setMin.run();
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.getMax.dispose();
                    throw utAvaiable.getMin(th);
                }
            }
        }

        public final void dispose() {
            this.length = true;
            this.getMax.dispose();
        }

        public final boolean isDisposed() {
            return this.length;
        }
    }

    static final class setMax implements GriverProgressBar.UpdateRunnable, Runnable {
        @NonNull
        final Runnable length;
        @Nullable
        Thread setMax;
        @NonNull
        final getMin setMin;

        setMax(@NonNull Runnable runnable, @NonNull getMin getmin) {
            this.length = runnable;
            this.setMin = getmin;
        }

        public final void run() {
            this.setMax = Thread.currentThread();
            try {
                this.length.run();
            } finally {
                dispose();
                this.setMax = null;
            }
        }

        public final void dispose() {
            if (this.setMax == Thread.currentThread()) {
                getMin getmin = this.setMin;
                if (getmin instanceof neverAddHashQuery) {
                    neverAddHashQuery neveraddhashquery = (neverAddHashQuery) getmin;
                    if (!neveraddhashquery.getMin) {
                        neveraddhashquery.getMin = true;
                        neveraddhashquery.length.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.setMin.dispose();
        }

        public final boolean isDisposed() {
            return this.setMin.isDisposed();
        }
    }
}
