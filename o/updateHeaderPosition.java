package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import o.GriverProgressBar;

public final class updateHeaderPosition<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    GriverProgressBar.UpdateRunnable getMin;
    final removeStateDidChangeHandler length;
    final RedDotManager<? super GriverProgressBar.UpdateRunnable> setMax;
    final GriverProgressBar<? super T> setMin;

    public updateHeaderPosition(GriverProgressBar<? super T> griverProgressBar, RedDotManager<? super GriverProgressBar.UpdateRunnable> redDotManager, removeStateDidChangeHandler removestatedidchangehandler) {
        this.setMin = griverProgressBar;
        this.setMax = redDotManager;
        this.length = removestatedidchangehandler;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        try {
            this.setMax.accept(updateRunnable);
            if (DisposableHelper.validate(this.getMin, updateRunnable)) {
                this.getMin = updateRunnable;
                this.setMin.onSubscribe(this);
            }
        } catch (Throwable th) {
            registerNode.getMax(th);
            updateRunnable.dispose();
            this.getMin = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, (GriverProgressBar<?>) this.setMin);
        }
    }

    public final void onNext(T t) {
        this.setMin.onNext(t);
    }

    public final void onError(Throwable th) {
        if (this.getMin != DisposableHelper.DISPOSED) {
            this.getMin = DisposableHelper.DISPOSED;
            this.setMin.onError(th);
            return;
        }
        SecuritySignature.getMax(th);
    }

    public final void onComplete() {
        if (this.getMin != DisposableHelper.DISPOSED) {
            this.getMin = DisposableHelper.DISPOSED;
            this.setMin.onComplete();
        }
    }

    public final void dispose() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.getMin;
        if (updateRunnable != DisposableHelper.DISPOSED) {
            this.getMin = DisposableHelper.DISPOSED;
            try {
                this.length.getMax();
            } catch (Throwable th) {
                registerNode.getMax(th);
                SecuritySignature.getMax(th);
            }
            updateRunnable.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.getMin.isDisposed();
    }
}
