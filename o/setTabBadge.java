package o;

import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setTabBadge<T> extends onLoadMoreStateChanged<T, T> {
    public setTabBadge(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        super(r1);
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar));
    }

    static final class getMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable length;
        final GriverProgressBar<? super T> setMin;

        public final void onNext(T t) {
        }

        getMin(GriverProgressBar<? super T> griverProgressBar) {
            this.setMin = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.length = updateRunnable;
            this.setMin.onSubscribe(this);
        }

        public final void onError(Throwable th) {
            this.setMin.onError(th);
        }

        public final void onComplete() {
            this.setMin.onComplete();
        }

        public final void dispose() {
            this.length.dispose();
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }
    }
}
