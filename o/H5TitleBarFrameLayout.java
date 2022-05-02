package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class H5TitleBarFrameLayout<T> extends onLoadMoreStateChanged<T, T> {
    final long getMin;

    public H5TitleBarFrameLayout(TitleBarRightButtonView.AnonymousClass4<T> r1, long j) {
        super(r1);
        this.getMin = j;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.getMin));
    }

    static final class getMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        boolean getMin;
        final GriverProgressBar<? super T> length;
        GriverProgressBar.UpdateRunnable setMax;
        long setMin;

        getMin(GriverProgressBar<? super T> griverProgressBar, long j) {
            this.length = griverProgressBar;
            this.setMin = j;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                this.setMax = updateRunnable;
                if (this.setMin == 0) {
                    this.getMin = true;
                    updateRunnable.dispose();
                    EmptyDisposable.complete((GriverProgressBar<?>) this.length);
                    return;
                }
                this.length.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.getMin) {
                long j = this.setMin;
                long j2 = j - 1;
                this.setMin = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.length.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.getMin) {
                SecuritySignature.getMax(th);
                return;
            }
            this.getMin = true;
            this.setMax.dispose();
            this.length.onError(th);
        }

        public final void onComplete() {
            if (!this.getMin) {
                this.getMin = true;
                this.setMax.dispose();
                this.length.onComplete();
            }
        }

        public final void dispose() {
            this.setMax.dispose();
        }

        public final boolean isDisposed() {
            return this.setMax.isDisposed();
        }
    }
}
