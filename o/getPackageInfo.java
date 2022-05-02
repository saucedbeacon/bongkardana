package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.hasCornerMarking;

public final class getPackageInfo extends hasCornerMarking {
    static final IRouterComponent getMax = new IRouterComponent("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    static final ScheduledExecutorService setMax;
    final ThreadFactory length;
    final AtomicReference<ScheduledExecutorService> setMin;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        setMax = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public getPackageInfo() {
        this(getMax);
    }

    private getPackageInfo(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.setMin = atomicReference;
        this.length = threadFactory;
        atomicReference.lazySet(getSGPluginEntry.setMax(threadFactory));
    }

    public final void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.setMin.get();
            if (scheduledExecutorService != setMax) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = getSGPluginEntry.setMax(this.length);
            }
        } while (!this.setMin.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    public final void shutdown() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.setMin.get();
        ScheduledExecutorService scheduledExecutorService2 = setMax;
        if (scheduledExecutorService != scheduledExecutorService2 && (andSet = this.setMin.getAndSet(scheduledExecutorService2)) != setMax) {
            andSet.shutdownNow();
        }
    }

    @NonNull
    public final hasCornerMarking.getMin createWorker() {
        return new length(this.setMin.get());
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        SecExceptionCode secExceptionCode = new SecExceptionCode(runnable);
        if (j <= 0) {
            try {
                future = this.setMin.get().submit(secExceptionCode);
            } catch (RejectedExecutionException e) {
                SecuritySignature.getMax((Throwable) e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.setMin.get().schedule(secExceptionCode, j, timeUnit);
        }
        secExceptionCode.setFuture(future);
        return secExceptionCode;
    }

    static final class length extends hasCornerMarking.getMin {
        volatile boolean getMin;
        final ScheduledExecutorService length;
        final IRedDotManager setMax = new IRedDotManager();

        length(ScheduledExecutorService scheduledExecutorService) {
            this.length = scheduledExecutorService;
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            Future future;
            if (this.getMin) {
                return EmptyDisposable.INSTANCE;
            }
            setRefreshAnimation.getMax(runnable, "run is null");
            RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
            if (redDotDrawable != null) {
                runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
            }
            getPluginPath getpluginpath = new getPluginPath(runnable, this.setMax);
            this.setMax.getMin(getpluginpath);
            if (j <= 0) {
                try {
                    future = this.length.submit(getpluginpath);
                } catch (RejectedExecutionException e) {
                    dispose();
                    SecuritySignature.getMax((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.length.schedule(getpluginpath, j, timeUnit);
            }
            getpluginpath.setFuture(future);
            return getpluginpath;
        }

        public final void dispose() {
            if (!this.getMin) {
                this.getMin = true;
                this.setMax.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.getMin;
        }
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.setMin.get();
            TitleView titleView = new TitleView(runnable, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(titleView);
                } catch (RejectedExecutionException e) {
                    SecuritySignature.getMax((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(titleView, j, timeUnit);
            }
            titleView.setMax(future);
            return titleView;
        }
        doCommand docommand = new doCommand(runnable);
        try {
            docommand.setFuture(this.setMin.get().scheduleAtFixedRate(docommand, j, j2, timeUnit));
            return docommand;
        } catch (RejectedExecutionException e2) {
            SecuritySignature.getMax((Throwable) e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
