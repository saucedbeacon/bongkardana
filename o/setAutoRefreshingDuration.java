package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.NebulaTitleView;

public final class setAutoRefreshingDuration<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final enableLoadMore<T> parent;
    final int prefetch;
    GriverPullRefreshService<T> queue;

    public setAutoRefreshingDuration(enableLoadMore<T> enableloadmore, int i) {
        this.parent = enableloadmore;
        this.prefetch = i;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        GriverPullRefreshService<T> griverPullRefreshService;
        if (DisposableHelper.setOnce(this, updateRunnable)) {
            if (updateRunnable instanceof setRefreshTips) {
                setRefreshTips setrefreshtips = (setRefreshTips) updateRunnable;
                int requestFusion = setrefreshtips.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = setrefreshtips;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = setrefreshtips;
                    return;
                }
            }
            int i = -this.prefetch;
            if (i < 0) {
                griverPullRefreshService = new setTitleBackgroundImage<>(-i);
            } else {
                griverPullRefreshService = new NebulaTitleView.Theme<>(i);
            }
            this.queue = griverPullRefreshService;
        }
    }

    public final void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    public final void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    public final void onComplete() {
        this.parent.innerComplete(this);
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
    }

    public final boolean isDone() {
        return this.done;
    }

    public final void setDone() {
        this.done = true;
    }

    public final GriverPullRefreshService<T> queue() {
        return this.queue;
    }

    public final int fusionMode() {
        return this.fusionMode;
    }
}
