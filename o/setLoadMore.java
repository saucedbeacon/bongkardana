package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setLoadMore<T> extends CountDownLatch implements GriverProgressBar<T>, Future<T>, GriverProgressBar.UpdateRunnable {
    final AtomicReference<GriverProgressBar.UpdateRunnable> getMin = new AtomicReference<>();
    T length;
    Throwable setMin;

    public final void dispose() {
    }

    public setLoadMore() {
        super(1);
    }

    public final boolean cancel(boolean z) {
        GriverProgressBar.UpdateRunnable updateRunnable;
        do {
            updateRunnable = this.getMin.get();
            if (updateRunnable == this || updateRunnable == DisposableHelper.DISPOSED) {
                return false;
            }
        } while (!this.getMin.compareAndSet(updateRunnable, DisposableHelper.DISPOSED));
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        countDown();
        return true;
    }

    public final boolean isCancelled() {
        return DisposableHelper.isDisposed(this.getMin.get());
    }

    public final boolean isDone() {
        return getCount() == 0;
    }

    public final T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            SGPluginExtras.getMax();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.setMin;
            if (th == null) {
                return this.length;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public final T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            SGPluginExtras.getMax();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(utAvaiable.getMax(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.setMin;
            if (th == null) {
                return this.length;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.setOnce(this.getMin, updateRunnable);
    }

    public final void onNext(T t) {
        if (this.length != null) {
            this.getMin.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.length = t;
    }

    public final void onError(Throwable th) {
        GriverProgressBar.UpdateRunnable updateRunnable;
        if (this.setMin == null) {
            this.setMin = th;
            do {
                updateRunnable = this.getMin.get();
                if (updateRunnable == this || updateRunnable == DisposableHelper.DISPOSED) {
                    SecuritySignature.getMax(th);
                    return;
                }
            } while (!this.getMin.compareAndSet(updateRunnable, this));
            countDown();
            return;
        }
        SecuritySignature.getMax(th);
    }

    public final void onComplete() {
        GriverProgressBar.UpdateRunnable updateRunnable;
        if (this.length == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            updateRunnable = this.getMin.get();
            if (updateRunnable == this || updateRunnable == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!this.getMin.compareAndSet(updateRunnable, this));
        countDown();
    }

    public final boolean isDisposed() {
        return isDone();
    }
}
