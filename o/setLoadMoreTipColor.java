package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setLoadMoreTipColor extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -754898800686245608L;

    public setLoadMoreTipColor() {
    }

    public setLoadMoreTipColor(GriverProgressBar.UpdateRunnable updateRunnable) {
        lazySet(updateRunnable);
    }

    public final boolean update(GriverProgressBar.UpdateRunnable updateRunnable) {
        return DisposableHelper.set(this, updateRunnable);
    }

    public final boolean replace(GriverProgressBar.UpdateRunnable updateRunnable) {
        return DisposableHelper.replace(this, updateRunnable);
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
    }
}
