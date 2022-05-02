package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public abstract class decryptBinary implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable {
    final AtomicReference<GriverProgressBar.UpdateRunnable> getMin = new AtomicReference<>();

    public final void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        UserTrackMethodJniBridge.setMin(this.getMin, updateRunnable, getClass());
    }

    public final boolean isDisposed() {
        return this.getMin.get() == DisposableHelper.DISPOSED;
    }

    public final void dispose() {
        DisposableHelper.dispose(this.getMin);
    }
}
