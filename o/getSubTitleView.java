package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class getSubTitleView<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -8612022020200669122L;
    final GriverProgressBar<? super T> downstream;
    final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();

    public getSubTitleView(GriverProgressBar<? super T> griverProgressBar) {
        this.downstream = griverProgressBar;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (DisposableHelper.setOnce(this.upstream, updateRunnable)) {
            this.downstream.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.downstream.onNext(t);
    }

    public final void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    public final void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    public final void setResource(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.set(this, updateRunnable);
    }
}
