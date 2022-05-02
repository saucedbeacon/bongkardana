package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setPushLoadMoreListener<T> extends onLoadMoreStateChanged<T, Boolean> {
    final getChildren<? super T> getMin;

    public setPushLoadMoreListener(TitleBarRightButtonView.AnonymousClass4<T> r1, getChildren<? super T> getchildren) {
        super(r1);
        this.getMin = getchildren;
    }

    public final void subscribeActual(GriverProgressBar<? super Boolean> griverProgressBar) {
        this.setMin.subscribe(new setMin(griverProgressBar, this.getMin));
    }

    static final class setMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super Boolean> getMax;
        final getChildren<? super T> getMin;
        GriverProgressBar.UpdateRunnable setMax;
        boolean setMin;

        setMin(GriverProgressBar<? super Boolean> griverProgressBar, getChildren<? super T> getchildren) {
            this.getMax = griverProgressBar;
            this.getMin = getchildren;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                this.setMax = updateRunnable;
                this.getMax.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.setMin) {
                try {
                    if (!this.getMin.test(t)) {
                        this.setMin = true;
                        this.setMax.dispose();
                        this.getMax.onNext(Boolean.FALSE);
                        this.getMax.onComplete();
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.setMax.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.setMin) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMin = true;
            this.getMax.onError(th);
        }

        public final void onComplete() {
            if (!this.setMin) {
                this.setMin = true;
                this.getMax.onNext(Boolean.TRUE);
                this.getMax.onComplete();
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
