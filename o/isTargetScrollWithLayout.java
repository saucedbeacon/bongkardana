package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class isTargetScrollWithLayout<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final removeStateDidChangeHandler onComplete;
    final RedDotManager<? super Throwable> onError;
    final getChildren<? super T> onNext;

    public isTargetScrollWithLayout(getChildren<? super T> getchildren, RedDotManager<? super Throwable> redDotManager, removeStateDidChangeHandler removestatedidchangehandler) {
        this.onNext = getchildren;
        this.onError = redDotManager;
        this.onComplete = removestatedidchangehandler;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.setOnce(this, updateRunnable);
    }

    public final void onNext(T t) {
        if (!this.done) {
            try {
                if (!this.onNext.test(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.done) {
            SecuritySignature.getMax(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            registerNode.getMax(th2);
            SecuritySignature.getMax((Throwable) new CompositeException(th, th2));
        }
    }

    public final void onComplete() {
        if (!this.done) {
            this.done = true;
            try {
                this.onComplete.getMax();
            } catch (Throwable th) {
                registerNode.getMax(th);
                SecuritySignature.getMax(th);
            }
        }
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
    }
}
