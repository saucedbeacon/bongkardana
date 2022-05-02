package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getChecked<T> extends onLoadMoreStateChanged<T, T> {
    final hasCornerMarking getMin;

    public getChecked(TitleBarRightButtonView.AnonymousClass4<T> r1, hasCornerMarking hascornermarking) {
        super(r1);
        this.getMin = hascornermarking;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        setMin setmin = new setMin(griverProgressBar);
        griverProgressBar.onSubscribe(setmin);
        setmin.setDisposable(this.getMin.scheduleDirect(new setMax(setmin)));
    }

    static final class setMin<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final GriverProgressBar<? super T> downstream;
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();

        setMin(GriverProgressBar<? super T> griverProgressBar) {
            this.downstream = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.upstream, updateRunnable);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        /* access modifiers changed from: package-private */
        public final void setDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }
    }

    final class setMax implements Runnable {
        private final setMin<T> setMin;

        setMax(setMin<T> setmin) {
            this.setMin = setmin;
        }

        public final void run() {
            getChecked.this.setMin.subscribe(this.setMin);
        }
    }
}
