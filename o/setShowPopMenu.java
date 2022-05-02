package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setShowPopMenu<T> extends onLoadMoreStateChanged<T, T> {
    public setShowPopMenu(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        super(r1);
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new length(griverProgressBar));
    }

    static final class length<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        T getMin;
        final GriverProgressBar<? super T> length;
        GriverProgressBar.UpdateRunnable setMax;

        length(GriverProgressBar<? super T> griverProgressBar) {
            this.length = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                this.setMax = updateRunnable;
                this.length.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.getMin = t;
        }

        public final void onError(Throwable th) {
            this.getMin = null;
            this.length.onError(th);
        }

        public final void dispose() {
            this.getMin = null;
            this.setMax.dispose();
        }

        public final boolean isDisposed() {
            return this.setMax.isDisposed();
        }

        public final void onComplete() {
            T t = this.getMin;
            if (t != null) {
                this.getMin = null;
                this.length.onNext(t);
            }
            this.length.onComplete();
        }
    }
}
