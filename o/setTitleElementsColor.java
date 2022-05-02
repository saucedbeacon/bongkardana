package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setTitleElementsColor<T> extends onLoadMoreStateChanged<T, getFavorite<T>> {
    public setTitleElementsColor(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        super(r1);
    }

    public final void subscribeActual(GriverProgressBar<? super getFavorite<T>> griverProgressBar) {
        this.setMin.subscribe(new setMax(griverProgressBar));
    }

    static final class setMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable length;
        final GriverProgressBar<? super getFavorite<T>> setMax;

        setMax(GriverProgressBar<? super getFavorite<T>> griverProgressBar) {
            this.setMax = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.length, updateRunnable)) {
                this.length = updateRunnable;
                this.setMax.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.length.dispose();
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }

        public final void onNext(T t) {
            this.setMax.onNext(getFavorite.getMax(t));
        }

        public final void onError(Throwable th) {
            this.setMax.onNext(getFavorite.length(th));
            this.setMax.onComplete();
        }

        public final void onComplete() {
            this.setMax.onNext(getFavorite.setMax());
            this.setMax.onComplete();
        }
    }
}
