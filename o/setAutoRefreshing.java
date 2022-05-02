package o;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setAutoRefreshing extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -7545121636549663526L;

    public final boolean hasCustomOnError() {
        return false;
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        SecuritySignature.getMax((Throwable) new OnErrorNotImplementedException(th));
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.setOnce(this, updateRunnable);
    }
}
