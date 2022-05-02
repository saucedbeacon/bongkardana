package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.GriverProgressBar;

public final class GriverLoadMoreFooter extends AtomicReferenceArray<GriverProgressBar.UpdateRunnable> implements GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = 2746389416410565408L;

    public GriverLoadMoreFooter(int i) {
        super(i);
    }

    public final boolean setResource(int i, GriverProgressBar.UpdateRunnable updateRunnable) {
        GriverProgressBar.UpdateRunnable updateRunnable2;
        do {
            updateRunnable2 = (GriverProgressBar.UpdateRunnable) get(i);
            if (updateRunnable2 == DisposableHelper.DISPOSED) {
                updateRunnable.dispose();
                return false;
            }
        } while (!compareAndSet(i, updateRunnable2, updateRunnable));
        if (updateRunnable2 == null) {
            return true;
        }
        updateRunnable2.dispose();
        return true;
    }

    public final GriverProgressBar.UpdateRunnable replaceResource(int i, GriverProgressBar.UpdateRunnable updateRunnable) {
        GriverProgressBar.UpdateRunnable updateRunnable2;
        do {
            updateRunnable2 = (GriverProgressBar.UpdateRunnable) get(i);
            if (updateRunnable2 == DisposableHelper.DISPOSED) {
                updateRunnable.dispose();
                return null;
            }
        } while (!compareAndSet(i, updateRunnable2, updateRunnable));
        return updateRunnable2;
    }

    public final void dispose() {
        GriverProgressBar.UpdateRunnable updateRunnable;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (!(((GriverProgressBar.UpdateRunnable) get(i)) == DisposableHelper.DISPOSED || (updateRunnable = (GriverProgressBar.UpdateRunnable) getAndSet(i, DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED || updateRunnable == null)) {
                    updateRunnable.dispose();
                }
            }
        }
    }

    public final boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }
}
