package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o.GriverProgressBar;
import o.hasCornerMarking;

public class neverAddHashQuery extends hasCornerMarking.getMin {
    public volatile boolean getMin;
    public final ScheduledExecutorService length;

    public neverAddHashQuery(ThreadFactory threadFactory) {
        this.length = getSGPluginEntry.setMax(threadFactory);
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable getMin(@NonNull Runnable runnable) {
        return setMin(runnable, 0, (TimeUnit) null);
    }

    @NonNull
    public final GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        if (this.getMin) {
            return EmptyDisposable.INSTANCE;
        }
        return getMax(runnable, j, timeUnit, (setLoadMoreTips) null);
    }

    public final GriverProgressBar.UpdateRunnable getMin(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        SecExceptionCode secExceptionCode = new SecExceptionCode(runnable);
        if (j <= 0) {
            try {
                future = this.length.submit(secExceptionCode);
            } catch (RejectedExecutionException e) {
                SecuritySignature.getMax((Throwable) e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.length.schedule(secExceptionCode, j, timeUnit);
        }
        secExceptionCode.setFuture(future);
        return secExceptionCode;
    }

    public void dispose() {
        if (!this.getMin) {
            this.getMin = true;
            this.length.shutdownNow();
        }
    }

    public boolean isDisposed() {
        return this.getMin;
    }

    public final GriverProgressBar.UpdateRunnable setMin(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        if (j2 <= 0) {
            TitleView titleView = new TitleView(runnable, this.length);
            if (j <= 0) {
                try {
                    future = this.length.submit(titleView);
                } catch (RejectedExecutionException e) {
                    SecuritySignature.getMax((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.length.schedule(titleView, j, timeUnit);
            }
            titleView.setMax(future);
            return titleView;
        }
        doCommand docommand = new doCommand(runnable);
        try {
            docommand.setFuture(this.length.scheduleAtFixedRate(docommand, j, j2, timeUnit));
            return docommand;
        } catch (RejectedExecutionException e2) {
            SecuritySignature.getMax((Throwable) e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @NonNull
    public final getPluginPath getMax(Runnable runnable, long j, @NonNull TimeUnit timeUnit, @Nullable setLoadMoreTips setloadmoretips) {
        Future future;
        setRefreshAnimation.getMax(runnable, "run is null");
        RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
        if (redDotDrawable != null) {
            runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
        }
        getPluginPath getpluginpath = new getPluginPath(runnable, setloadmoretips);
        if (setloadmoretips != null && !setloadmoretips.getMin(getpluginpath)) {
            return getpluginpath;
        }
        if (j <= 0) {
            try {
                future = this.length.submit(getpluginpath);
            } catch (RejectedExecutionException e) {
                if (setloadmoretips != null) {
                    setloadmoretips.setMin(getpluginpath);
                }
                SecuritySignature.getMax((Throwable) e);
            }
        } else {
            future = this.length.schedule(getpluginpath, j, timeUnit);
        }
        getpluginpath.setFuture(future);
        return getpluginpath;
    }
}
