package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class startLoadingAnimation<T> extends onLoadMoreStateChanged<T, T> {
    public startLoadingAnimation(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        super(r1);
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar));
    }

    static final class getMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar<? super T> getMax;
        GriverProgressBar.UpdateRunnable length;

        getMin(GriverProgressBar<? super T> griverProgressBar) {
            this.getMax = griverProgressBar;
        }

        public final void dispose() {
            GriverProgressBar.UpdateRunnable updateRunnable = this.length;
            this.length = EmptyComponent.INSTANCE;
            this.getMax = EmptyComponent.asObserver();
            updateRunnable.dispose();
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.length, updateRunnable)) {
                this.length = updateRunnable;
                this.getMax.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.getMax.onNext(t);
        }

        public final void onError(Throwable th) {
            GriverProgressBar<? super T> griverProgressBar = this.getMax;
            this.length = EmptyComponent.INSTANCE;
            this.getMax = EmptyComponent.asObserver();
            griverProgressBar.onError(th);
        }

        public final void onComplete() {
            GriverProgressBar<? super T> griverProgressBar = this.getMax;
            this.length = EmptyComponent.INSTANCE;
            this.getMax = EmptyComponent.asObserver();
            griverProgressBar.onComplete();
        }
    }
}
