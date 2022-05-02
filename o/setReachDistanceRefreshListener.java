package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setReachDistanceRefreshListener<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T>, GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -7012088219455310787L;
    final RedDotManager<? super Throwable> onError;
    final RedDotManager<? super T> onSuccess;

    public setReachDistanceRefreshListener(RedDotManager<? super T> redDotManager, RedDotManager<? super Throwable> redDotManager2) {
        this.onSuccess = redDotManager;
        this.onError = redDotManager2;
    }

    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            registerNode.getMax(th2);
            SecuritySignature.getMax((Throwable) new CompositeException(th, th2));
        }
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.setOnce(this, updateRunnable);
    }

    public final void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            registerNode.getMax(th);
            SecuritySignature.getMax(th);
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
