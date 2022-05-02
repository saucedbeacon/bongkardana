package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;

public final class setOnPullRefreshListener extends setFavoriteBtnVisibility {
    final getChildren<? super Throwable> getMin;
    final dismissBadgeView setMax;

    public setOnPullRefreshListener(dismissBadgeView dismissbadgeview, getChildren<? super Throwable> getchildren) {
        this.setMax = dismissbadgeview;
        this.getMin = getchildren;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        this.setMax.getMax(new setMax(switchfavoriteiconfont));
    }

    final class setMax implements switchFavoriteIconFont {
        private final switchFavoriteIconFont length;

        setMax(switchFavoriteIconFont switchfavoriteiconfont) {
            this.length = switchfavoriteiconfont;
        }

        public final void onComplete() {
            this.length.onComplete();
        }

        public final void onError(Throwable th) {
            try {
                if (setOnPullRefreshListener.this.getMin.test(th)) {
                    this.length.onComplete();
                } else {
                    this.length.onError(th);
                }
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                this.length.onError(new CompositeException(th, th2));
            }
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.length.onSubscribe(updateRunnable);
        }
    }
}
