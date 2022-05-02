package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setRefreshOffset extends setFavoriteBtnVisibility {
    final dismissBadgeView getMin;
    final hasCornerMarking setMin;

    public setRefreshOffset(dismissBadgeView dismissbadgeview, hasCornerMarking hascornermarking) {
        this.getMin = dismissbadgeview;
        this.setMin = hascornermarking;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        this.getMin.getMax(new setMin(switchfavoriteiconfont, this.setMin));
    }

    static final class setMin extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final switchFavoriteIconFont downstream;
        Throwable error;
        final hasCornerMarking scheduler;

        setMin(switchFavoriteIconFont switchfavoriteiconfont, hasCornerMarking hascornermarking) {
            this.downstream = switchfavoriteiconfont;
            this.scheduler = hascornermarking;
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        public final void onComplete() {
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            this.downstream.onComplete();
        }
    }
}
