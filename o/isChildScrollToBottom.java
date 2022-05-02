package o;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class isChildScrollToBottom extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable, RedDotManager<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final removeStateDidChangeHandler onComplete;
    final RedDotManager<? super Throwable> onError;

    public isChildScrollToBottom(removeStateDidChangeHandler removestatedidchangehandler) {
        this.onError = this;
        this.onComplete = removestatedidchangehandler;
    }

    public isChildScrollToBottom(RedDotManager<? super Throwable> redDotManager, removeStateDidChangeHandler removestatedidchangehandler) {
        this.onError = redDotManager;
        this.onComplete = removestatedidchangehandler;
    }

    public final void accept(Throwable th) {
        SecuritySignature.getMax((Throwable) new OnErrorNotImplementedException(th));
    }

    public final void onComplete() {
        try {
            this.onComplete.getMax();
        } catch (Throwable th) {
            registerNode.getMax(th);
            SecuritySignature.getMax(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public final void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            registerNode.getMax(th2);
            SecuritySignature.getMax(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.setOnce(this, updateRunnable);
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public final boolean hasCustomOnError() {
        return this.onError != this;
    }
}
