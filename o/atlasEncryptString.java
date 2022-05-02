package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;

public abstract class atlasEncryptString<T> implements GriverProgressBar<T> {
    private GriverProgressBar.UpdateRunnable upstream;

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        if (UserTrackMethodJniBridge.setMax(this.upstream, updateRunnable, getClass())) {
            this.upstream = updateRunnable;
            onStart();
        }
    }

    /* access modifiers changed from: protected */
    public final void cancel() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.upstream;
        this.upstream = DisposableHelper.DISPOSED;
        updateRunnable.dispose();
    }
}
