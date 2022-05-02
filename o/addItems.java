package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class addItems<T, R> extends onLoadMoreStateChanged<T, R> {
    final removeNode<R, ? super T, R> getMax;
    final Callable<R> setMax;

    public addItems(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<R> callable, removeNode<R, ? super T, R> removenode) {
        super(r1);
        this.getMax = removenode;
        this.setMax = callable;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        try {
            this.setMin.subscribe(new length(griverProgressBar, this.getMax, setRefreshAnimation.getMax(this.setMax.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            registerNode.getMax(th);
            EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
        }
    }

    static final class length<T, R> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super R> getMax;
        R getMin;
        GriverProgressBar.UpdateRunnable length;
        boolean setMax;
        final removeNode<R, ? super T, R> setMin;

        length(GriverProgressBar<? super R> griverProgressBar, removeNode<R, ? super T, R> removenode, R r) {
            this.getMax = griverProgressBar;
            this.setMin = removenode;
            this.getMin = r;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.length, updateRunnable)) {
                this.length = updateRunnable;
                this.getMax.onSubscribe(this);
                this.getMax.onNext(this.getMin);
            }
        }

        public final void dispose() {
            this.length.dispose();
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.setMax) {
                try {
                    R max = setRefreshAnimation.getMax(this.setMin.setMax(this.getMin, t), "The accumulator returned a null value");
                    this.getMin = max;
                    this.getMax.onNext(max);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.length.dispose();
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
