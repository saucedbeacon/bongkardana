package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setItemChangeListener<T> extends onLoadMoreStateChanged<T, T> {
    final long getMin;

    public setItemChangeListener(TitleBarRightButtonView.AnonymousClass4<T> r1, long j) {
        super(r1);
        this.getMin = j;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMax(griverProgressBar, this.getMin));
    }

    static final class getMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super T> getMin;
        long length;
        GriverProgressBar.UpdateRunnable setMax;

        getMax(GriverProgressBar<? super T> griverProgressBar, long j) {
            this.getMin = griverProgressBar;
            this.length = j;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                this.setMax = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            long j = this.length;
            if (j != 0) {
                this.length = j - 1;
            } else {
                this.getMin.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            this.getMin.onError(th);
        }

        public final void onComplete() {
            this.getMin.onComplete();
        }

        public final void dispose() {
            this.setMax.dispose();
        }

        public final boolean isDisposed() {
            return this.setMax.isDisposed();
        }
    }
}
