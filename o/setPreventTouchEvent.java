package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setPreventTouchEvent<T> extends onLoadMoreStateChanged<T, T> {
    final getChildren<? super T> getMax;

    public setPreventTouchEvent(TitleBarRightButtonView.AnonymousClass4<T> r1, getChildren<? super T> getchildren) {
        super(r1);
        this.getMax = getchildren;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMax(griverProgressBar, this.getMax));
    }

    static final class getMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super T> getMax;
        boolean length;
        final getChildren<? super T> setMax;
        GriverProgressBar.UpdateRunnable setMin;

        getMax(GriverProgressBar<? super T> griverProgressBar, getChildren<? super T> getchildren) {
            this.getMax = griverProgressBar;
            this.setMax = getchildren;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMin, updateRunnable)) {
                this.setMin = updateRunnable;
                this.getMax.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.setMin.dispose();
        }

        public final boolean isDisposed() {
            return this.setMin.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.length) {
                this.getMax.onNext(t);
                try {
                    if (this.setMax.test(t)) {
                        this.length = true;
                        this.setMin.dispose();
                        this.getMax.onComplete();
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.setMin.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (!this.length) {
                this.length = true;
                this.getMax.onError(th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            if (!this.length) {
                this.length = true;
                this.getMax.onComplete();
            }
        }
    }
}
