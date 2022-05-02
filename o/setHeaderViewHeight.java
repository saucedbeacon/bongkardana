package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setHeaderViewHeight extends setFavoriteBtnVisibility {
    final hasCornerMarking getMin;
    final dismissBadgeView setMin;

    public setHeaderViewHeight(dismissBadgeView dismissbadgeview, hasCornerMarking hascornermarking) {
        this.setMin = dismissbadgeview;
        this.getMin = hascornermarking;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        length length2 = new length(switchfavoriteiconfont, this.setMin);
        switchfavoriteiconfont.onSubscribe(length2);
        length2.task.replace(this.getMin.scheduleDirect(length2));
    }

    static final class length extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final switchFavoriteIconFont downstream;
        final dismissBadgeView source;
        final setLoadMoreTipColor task = new setLoadMoreTipColor();

        length(switchFavoriteIconFont switchfavoriteiconfont, dismissBadgeView dismissbadgeview) {
            this.downstream = switchfavoriteiconfont;
            this.source = dismissbadgeview;
        }

        public final void run() {
            this.source.getMax(this);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }
    }
}
