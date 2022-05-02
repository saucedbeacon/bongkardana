package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class enableTargetOffset extends setFavoriteBtnVisibility {
    final TimeUnit getMax;
    final dismissBadgeView getMin;
    final hasCornerMarking length;
    final long setMax;
    final boolean setMin = false;

    public enableTargetOffset(dismissBadgeView dismissbadgeview, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        this.getMin = dismissbadgeview;
        this.setMax = j;
        this.getMax = timeUnit;
        this.length = hascornermarking;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        this.getMin.getMax(new setMax(switchfavoriteiconfont, this.setMax, this.getMax, this.length, this.setMin));
    }

    static final class setMax extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont, Runnable, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final switchFavoriteIconFont downstream;
        Throwable error;
        final hasCornerMarking scheduler;
        final TimeUnit unit;

        setMax(switchFavoriteIconFont switchfavoriteiconfont, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, boolean z) {
            this.downstream = switchfavoriteiconfont;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = hascornermarking;
            this.delayError = z;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onComplete() {
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delay, this.unit));
        }

        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delayError ? this.delay : 0, this.unit));
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
