package o;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

final class TitleView implements Callable<Void>, GriverProgressBar.UpdateRunnable {
    static final FutureTask<Void> isInside = new FutureTask<>(Functions.getMin, (Object) null);
    final ExecutorService getMax;
    final AtomicReference<Future<?>> getMin = new AtomicReference<>();
    final AtomicReference<Future<?>> length = new AtomicReference<>();
    final Runnable setMax;
    Thread setMin;

    final class OptionType implements Future<Object> {
        final GriverProgressBar.UpdateRunnable setMin;

        public final Object get() throws InterruptedException, ExecutionException {
            return null;
        }

        public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }

        public final boolean isCancelled() {
            return false;
        }

        public final boolean isDone() {
            return false;
        }

        OptionType(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMin = updateRunnable;
        }

        public final boolean cancel(boolean z) {
            this.setMin.dispose();
            return false;
        }
    }

    TitleView(Runnable runnable, ExecutorService executorService) {
        this.setMax = runnable;
        this.getMax = executorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: length */
    public Void call() throws Exception {
        this.setMin = Thread.currentThread();
        try {
            this.setMax.run();
            Future submit = this.getMax.submit(this);
            while (true) {
                Future future = this.getMin.get();
                if (future != isInside) {
                    if (this.getMin.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    submit.cancel(this.setMin != Thread.currentThread());
                }
            }
            this.setMin = null;
        } catch (Throwable th) {
            this.setMin = null;
            SecuritySignature.getMax(th);
        }
        return null;
    }

    public final void dispose() {
        Future andSet = this.length.getAndSet(isInside);
        boolean z = true;
        if (!(andSet == null || andSet == isInside)) {
            andSet.cancel(this.setMin != Thread.currentThread());
        }
        Future andSet2 = this.getMin.getAndSet(isInside);
        if (andSet2 != null && andSet2 != isInside) {
            if (this.setMin == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }

    public final boolean isDisposed() {
        return this.length.get() == isInside;
    }

    /* access modifiers changed from: package-private */
    public final void setMax(Future<?> future) {
        Future future2;
        do {
            future2 = this.length.get();
            if (future2 == isInside) {
                future.cancel(this.setMin != Thread.currentThread());
                return;
            }
        } while (!this.length.compareAndSet(future2, future));
    }
}
