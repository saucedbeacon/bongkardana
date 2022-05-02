package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class removeMenu<T> extends onLoadMoreStateChanged<T, T> {
    final getChildren<? super T> setMax;

    public removeMenu(TitleBarRightButtonView.AnonymousClass4<T> r1, getChildren<? super T> getchildren) {
        super(r1);
        this.setMax = getchildren;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new setMin(griverProgressBar, this.setMax));
    }

    static final class setMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable getMin;
        boolean length;
        final GriverProgressBar<? super T> setMax;
        final getChildren<? super T> setMin;

        setMin(GriverProgressBar<? super T> griverProgressBar, getChildren<? super T> getchildren) {
            this.setMax = griverProgressBar;
            this.setMin = getchildren;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMin, updateRunnable)) {
                this.getMin = updateRunnable;
                this.setMax.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.getMin.dispose();
        }

        public final boolean isDisposed() {
            return this.getMin.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.length) {
                try {
                    if (!this.setMin.test(t)) {
                        this.length = true;
                        this.getMin.dispose();
                        this.setMax.onComplete();
                        return;
                    }
                    this.setMax.onNext(t);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.getMin.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.length) {
                SecuritySignature.getMax(th);
                return;
            }
            this.length = true;
            this.setMax.onError(th);
        }

        public final void onComplete() {
            if (!this.length) {
                this.length = true;
                this.setMax.onComplete();
            }
        }
    }
}
