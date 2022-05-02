package o;

import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setOnPushLoadMoreListener<T> extends setFavoriteBtnVisibility {
    final TitleBarRightButtonView.AnonymousClass4<T> setMax;

    public setOnPushLoadMoreListener(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        this.setMax = r1;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        this.setMax.subscribe(new setMax(switchfavoriteiconfont));
    }

    static final class setMax<T> implements GriverProgressBar<T> {
        final switchFavoriteIconFont getMax;

        public final void onNext(T t) {
        }

        setMax(switchFavoriteIconFont switchfavoriteiconfont) {
            this.getMax = switchfavoriteiconfont;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.getMax.onSubscribe(updateRunnable);
        }

        public final void onError(Throwable th) {
            this.getMax.onError(th);
        }

        public final void onComplete() {
            this.getMax.onComplete();
        }
    }
}
