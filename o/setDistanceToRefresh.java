package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setDistanceToRefresh extends setFavoriteBtnVisibility {
    final isShowTitleBarFavorite setMax;

    public setDistanceToRefresh(isShowTitleBarFavorite isshowtitlebarfavorite) {
        this.setMax = isshowtitlebarfavorite;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        setMax setmax = new setMax(switchfavoriteiconfont);
        switchfavoriteiconfont.onSubscribe(setmax);
        try {
            this.setMax.length(setmax);
        } catch (Throwable th) {
            registerNode.getMax(th);
            setmax.onError(th);
        }
    }

    static final class setMax extends AtomicReference<GriverProgressBar.UpdateRunnable> implements isBadgeViewShow, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -2467358622224974244L;
        final switchFavoriteIconFont downstream;

        setMax(switchFavoriteIconFont switchfavoriteiconfont) {
            this.downstream = switchfavoriteiconfont;
        }

        public final void onComplete() {
            GriverProgressBar.UpdateRunnable updateRunnable;
            if (get() != DisposableHelper.DISPOSED && (updateRunnable = (GriverProgressBar.UpdateRunnable) getAndSet(DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED) {
                try {
                    this.downstream.onComplete();
                } finally {
                    if (updateRunnable != null) {
                        updateRunnable.dispose();
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                SecuritySignature.getMax(th);
            }
        }

        public final boolean tryOnError(Throwable th) {
            GriverProgressBar.UpdateRunnable updateRunnable;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == DisposableHelper.DISPOSED || (updateRunnable = (GriverProgressBar.UpdateRunnable) getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
            }
        }

        public final void setDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.set(this, updateRunnable);
        }

        public final void setCancellable(setShowRedPoint setshowredpoint) {
            setDisposable(new changeToState(setshowredpoint));
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }
}
