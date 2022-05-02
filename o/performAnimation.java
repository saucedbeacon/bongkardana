package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class performAnimation<T> extends onLoadMoreStateChanged<T, T> {
    final setMinDuration<? extends T> getMax;

    public performAnimation(TitleBarRightButtonView.AnonymousClass1<T> r1, setMinDuration<? extends T> setminduration) {
        super(r1);
        this.getMax = setminduration;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new setMin(griverProgressBar, this.getMax));
    }

    static final class setMin<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, TitleBarRightButtonView.CornerMarkingUIController<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -1953724749712440952L;
        final GriverProgressBar<? super T> downstream;
        boolean inSingle;
        setMinDuration<? extends T> other;

        setMin(GriverProgressBar<? super T> griverProgressBar, setMinDuration<? extends T> setminduration) {
            this.downstream = griverProgressBar;
            this.other = setminduration;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable) && !this.inSingle) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onSuccess(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.inSingle = true;
            DisposableHelper.replace(this, (GriverProgressBar.UpdateRunnable) null);
            setMinDuration<? extends T> setminduration = this.other;
            this.other = null;
            setminduration.getMin(this);
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }
    }
}
