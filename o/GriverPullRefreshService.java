package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;

public interface GriverPullRefreshService<T> {
    void clear();

    boolean isEmpty();

    boolean offer(@NonNull T t);

    @Nullable
    T poll() throws Exception;

    public abstract class IGRiverRefreshStyle<T> extends CountDownLatch implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        Throwable getMax;
        volatile boolean length;
        T setMax;
        GriverProgressBar.UpdateRunnable setMin;

        public IGRiverRefreshStyle() {
            super(1);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMin = updateRunnable;
            if (this.length) {
                updateRunnable.dispose();
            }
        }

        public final void onComplete() {
            countDown();
        }

        public final void dispose() {
            this.length = true;
            GriverProgressBar.UpdateRunnable updateRunnable = this.setMin;
            if (updateRunnable != null) {
                updateRunnable.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.length;
        }

        public final T setMin() {
            if (getCount() != 0) {
                try {
                    SGPluginExtras.getMax();
                    await();
                } catch (InterruptedException e) {
                    dispose();
                    throw utAvaiable.getMin(e);
                }
            }
            Throwable th = this.getMax;
            if (th == null) {
                return this.setMax;
            }
            throw utAvaiable.getMin(th);
        }
    }

    public abstract class IGriverRefreshState<T> extends AtomicInteger implements setRefreshTips<T> {
        private static final long serialVersionUID = -1001730202384742097L;

        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called");
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called");
        }
    }
}
