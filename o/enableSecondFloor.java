package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class enableSecondFloor<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -7251123623727029452L;
    final removeStateDidChangeHandler onComplete;
    final RedDotManager<? super Throwable> onError;
    final RedDotManager<? super T> onNext;
    final RedDotManager<? super GriverProgressBar.UpdateRunnable> onSubscribe;

    public enableSecondFloor(RedDotManager<? super T> redDotManager, RedDotManager<? super Throwable> redDotManager2, removeStateDidChangeHandler removestatedidchangehandler, RedDotManager<? super GriverProgressBar.UpdateRunnable> redDotManager3) {
        this.onNext = redDotManager;
        this.onError = redDotManager2;
        this.onComplete = removestatedidchangehandler;
        this.onSubscribe = redDotManager3;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (DisposableHelper.setOnce(this, updateRunnable)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                registerNode.getMax(th);
                updateRunnable.dispose();
                onError(th);
            }
        }
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                registerNode.getMax(th);
                ((GriverProgressBar.UpdateRunnable) get()).dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                SecuritySignature.getMax((Throwable) new CompositeException(th, th2));
            }
        } else {
            SecuritySignature.getMax(th);
        }
    }

    public final void onComplete() {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
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
        return get() == DisposableHelper.DISPOSED;
    }

    public final boolean hasCustomOnError() {
        return this.onError != Functions.IsOverlapping;
    }
}
