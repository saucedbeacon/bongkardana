package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleView;
import o.hasCornerMarking;

public final class H5ViewStubUtil extends hasCornerMarking {
    static final hasCornerMarking setMax = getSecureSignatureComp.setMax();
    @NonNull
    final Executor getMin;
    final boolean setMin = false;

    public H5ViewStubUtil(@NonNull Executor executor) {
        this.getMin = executor;
    }

    @NonNull
    public final hasCornerMarking.getMin createWorker() {
        return new length(this.getMin, this.setMin);
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.getMin instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
        }
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        try {
            doCommand docommand = new doCommand(runnable);
            docommand.setFuture(((ScheduledExecutorService) this.getMin).scheduleAtFixedRate(docommand, j, j2, timeUnit));
            return docommand;
        } catch (RejectedExecutionException e) {
            SecuritySignature.getMax((Throwable) e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public static final class length extends hasCornerMarking.getMin implements Runnable {
        final IRedDotManager equals = new IRedDotManager();
        final boolean getMax;
        final Executor getMin;
        volatile boolean length;
        final initTitleSegControl<Runnable> setMax;
        final AtomicInteger setMin = new AtomicInteger();

        public length(Executor executor, boolean z) {
            this.getMin = executor;
            this.setMax = new initTitleSegControl<>();
            this.getMax = z;
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable getMin(@NonNull Runnable runnable) {
            GriverProgressBar.UpdateRunnable updateRunnable;
            if (this.length) {
                return EmptyDisposable.INSTANCE;
            }
            setRefreshAnimation.getMax(runnable, "run is null");
            RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
            if (redDotDrawable != null) {
                runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
            }
            if (this.getMax) {
                updateRunnable = new getMin(runnable, this.equals);
                this.equals.getMin(updateRunnable);
            } else {
                updateRunnable = new getMax(runnable);
            }
            this.setMax.offer(updateRunnable);
            if (this.setMin.getAndIncrement() == 0) {
                try {
                    this.getMin.execute(this);
                } catch (RejectedExecutionException e) {
                    this.length = true;
                    this.setMax.clear();
                    SecuritySignature.getMax((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return updateRunnable;
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (j <= 0) {
                return getMin(runnable);
            }
            if (this.length) {
                return EmptyDisposable.INSTANCE;
            }
            setLoadMoreTipColor setloadmoretipcolor = new setLoadMoreTipColor();
            setLoadMoreTipColor setloadmoretipcolor2 = new setLoadMoreTipColor(setloadmoretipcolor);
            setRefreshAnimation.getMax(runnable, "run is null");
            RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
            if (redDotDrawable != null) {
                runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
            }
            getPluginPath getpluginpath = new getPluginPath(new setMin(setloadmoretipcolor2, runnable), this.equals);
            this.equals.getMin(getpluginpath);
            Executor executor = this.getMin;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    getpluginpath.setFuture(((ScheduledExecutorService) executor).schedule(getpluginpath, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.length = true;
                    SecuritySignature.getMax((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                getpluginpath.setFuture(new TitleView.OptionType(H5ViewStubUtil.setMax.scheduleDirect(getpluginpath, j, timeUnit)));
            }
            setloadmoretipcolor.replace(getpluginpath);
            return setloadmoretipcolor2;
        }

        public final void dispose() {
            if (!this.length) {
                this.length = true;
                this.equals.dispose();
                if (this.setMin.getAndIncrement() == 0) {
                    this.setMax.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.length;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            if (r3.length == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r0.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r1 = r3.setMin.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                o.initTitleSegControl<java.lang.Runnable> r0 = r3.setMax
                r1 = 1
            L_0x0003:
                boolean r2 = r3.length
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 == 0) goto L_0x001e
                r2.run()
                boolean r2 = r3.length
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x001e:
                boolean r2 = r3.length
                if (r2 == 0) goto L_0x0026
                r0.clear()
                return
            L_0x0026:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.setMin
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.H5ViewStubUtil.length.run():void");
        }

        static final class getMax extends AtomicBoolean implements Runnable, GriverProgressBar.UpdateRunnable {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            getMax(Runnable runnable) {
                this.actual = runnable;
            }

            public final void run() {
                if (!get()) {
                    try {
                        this.actual.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            public final void dispose() {
                lazySet(true);
            }

            public final boolean isDisposed() {
                return get();
            }
        }

        final class setMin implements Runnable {
            private final Runnable getMin;
            private final setLoadMoreTipColor setMin;

            setMin(setLoadMoreTipColor setloadmoretipcolor, Runnable runnable) {
                this.setMin = setloadmoretipcolor;
                this.getMin = runnable;
            }

            public final void run() {
                this.setMin.replace(length.this.getMin(this.getMin));
            }
        }

        static final class getMin extends AtomicInteger implements Runnable, GriverProgressBar.UpdateRunnable {
            static final int FINISHED = 2;
            static final int INTERRUPTED = 4;
            static final int INTERRUPTING = 3;
            static final int READY = 0;
            static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final setLoadMoreTips tasks;
            volatile Thread thread;

            getMin(Runnable runnable, setLoadMoreTips setloadmoretips) {
                this.run = runnable;
                this.tasks = setloadmoretips;
            }

            public final void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                cleanup();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.thread = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                cleanup();
                            }
                            throw th;
                        }
                    } else {
                        this.thread = null;
                    }
                }
            }

            public final void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            cleanup();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread2 = this.thread;
                        if (thread2 != null) {
                            thread2.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        cleanup();
                        return;
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public final void cleanup() {
                setLoadMoreTips setloadmoretips = this.tasks;
                if (setloadmoretips != null) {
                    setloadmoretips.setMax(this);
                }
            }

            public final boolean isDisposed() {
                return get() >= 2;
            }
        }
    }

    static final class setMin extends AtomicReference<Runnable> implements Runnable, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -4101336210206799084L;
        final setLoadMoreTipColor direct = new setLoadMoreTipColor();
        final setLoadMoreTipColor timed = new setLoadMoreTipColor();

        setMin(Runnable runnable) {
            super(runnable);
        }

        public final void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet((Object) null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        public final boolean isDisposed() {
            return get() == null;
        }

        public final void dispose() {
            if (getAndSet((Object) null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        public final Runnable getWrappedRunnable() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                return runnable;
            }
            return Functions.getMin;
        }
    }

    final class setMax implements Runnable {
        private final setMin getMax;

        setMax(setMin setmin) {
            this.getMax = setmin;
        }

        public final void run() {
            this.getMax.direct.replace(H5ViewStubUtil.this.scheduleDirect(this.getMax));
        }
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable) {
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        try {
            if (this.getMin instanceof ExecutorService) {
                SecExceptionCode secExceptionCode = new SecExceptionCode(runnable);
                secExceptionCode.setFuture(((ExecutorService) this.getMin).submit(secExceptionCode));
                return secExceptionCode;
            } else if (this.setMin) {
                length.getMin getmin = new length.getMin(runnable, (setLoadMoreTips) null);
                this.getMin.execute(getmin);
                return getmin;
            } else {
                length.getMax getmax = new length.getMax(runnable);
                this.getMin.execute(getmax);
                return getmax;
            }
        } catch (RejectedExecutionException e) {
            SecuritySignature.getMax((Throwable) e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        if (this.getMin instanceof ScheduledExecutorService) {
            try {
                SecExceptionCode secExceptionCode = new SecExceptionCode(runnable);
                secExceptionCode.setFuture(((ScheduledExecutorService) this.getMin).schedule(secExceptionCode, j, timeUnit));
                return secExceptionCode;
            } catch (RejectedExecutionException e) {
                SecuritySignature.getMax((Throwable) e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            setMin setmin = new setMin(runnable);
            setmin.timed.replace(setMax.scheduleDirect(new setMax(setmin), j, timeUnit));
            return setmin;
        }
    }
}
