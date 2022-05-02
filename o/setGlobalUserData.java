package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public abstract class setGlobalUserData<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        if (UserTrackMethodJniBridge.setMin(this.upstream, updateRunnable, getClass())) {
            onStart();
        }
    }

    public final boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
    }
}
