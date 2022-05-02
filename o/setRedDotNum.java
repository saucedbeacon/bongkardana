package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setRedDotNum<T> extends onLoadMoreStateChanged<T, T> {
    final removeNode<T, T, T> getMax;

    public setRedDotNum(TitleBarRightButtonView.AnonymousClass4<T> r1, removeNode<T, T, T> removenode) {
        super(r1);
        this.getMax = removenode;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.getMax));
    }

    static final class getMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super T> getMax;
        GriverProgressBar.UpdateRunnable getMin;
        T length;
        boolean setMax;
        final removeNode<T, T, T> setMin;

        getMin(GriverProgressBar<? super T> griverProgressBar, removeNode<T, T, T> removenode) {
            this.getMax = griverProgressBar;
            this.setMin = removenode;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMin, updateRunnable)) {
                this.getMin = updateRunnable;
                this.getMax.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.getMin.dispose();
        }

        public final boolean isDisposed() {
            return this.getMin.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.setMax) {
                GriverProgressBar<? super T> griverProgressBar = this.getMax;
                T t2 = this.length;
                if (t2 == null) {
                    this.length = t;
                    griverProgressBar.onNext(t);
                    return;
                }
                try {
                    T max = setRefreshAnimation.getMax(this.setMin.setMax(t2, t), "The value returned by the accumulator is null");
                    this.length = max;
                    griverProgressBar.onNext(max);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.getMin.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.setMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMax = true;
            this.getMax.onError(th);
        }

        public final void onComplete() {
            if (!this.setMax) {
                this.setMax = true;
                this.getMax.onComplete();
            }
        }
    }
}
