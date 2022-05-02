package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getMenuItemList<T> extends onLoadMoreStateChanged<T, SecException<T>> {
    final TimeUnit getMax;
    final hasCornerMarking length;

    public getMenuItemList(TitleBarRightButtonView.AnonymousClass4<T> r1, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        super(r1);
        this.length = hascornermarking;
        this.getMax = timeUnit;
    }

    public final void subscribeActual(GriverProgressBar<? super SecException<T>> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.getMax, this.length));
    }

    static final class getMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable getMax;
        final GriverProgressBar<? super SecException<T>> getMin;
        long length;
        final hasCornerMarking setMax;
        final TimeUnit setMin;

        getMin(GriverProgressBar<? super SecException<T>> griverProgressBar, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
            this.getMin = griverProgressBar;
            this.setMax = hascornermarking;
            this.setMin = timeUnit;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMax, updateRunnable)) {
                this.getMax = updateRunnable;
                this.length = this.setMax.now(this.setMin);
                this.getMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.getMax.dispose();
        }

        public final boolean isDisposed() {
            return this.getMax.isDisposed();
        }

        public final void onNext(T t) {
            long now = this.setMax.now(this.setMin);
            long j = this.length;
            this.length = now;
            this.getMin.onNext(new SecException(t, now - j, this.setMin));
        }

        public final void onError(Throwable th) {
            this.getMin.onError(th);
        }

        public final void onComplete() {
            this.getMin.onComplete();
        }
    }
}
