package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setRefreshingWithNotify<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public setRefreshingWithNotify(Queue<Object> queue2) {
        this.queue = queue2;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.setOnce(this, updateRunnable);
    }

    public final void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    public final void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    public final void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    public final void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
