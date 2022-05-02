package o;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.paging.PageResult;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class removeItemAtInt<Key, Value> {
    private CopyOnWriteArrayList<getMin> getMax = new CopyOnWriteArrayList<>();
    private AtomicBoolean getMin = new AtomicBoolean(false);

    public interface getMin {
    }

    public static abstract class length<Key, Value> {
        @NonNull
        public abstract removeItemAtInt<Key, Value> setMin();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean getMin();

    removeItemAtInt() {
    }

    static class setMax<T> {
        final int getMax;
        final Object getMin = new Object();
        private boolean isInside = false;
        final PageResult.setMin<T> length;
        private final removeItemAtInt setMax;
        Executor setMin = null;

        setMax(@NonNull removeItemAtInt removeitematint, int i, @Nullable Executor executor, @NonNull PageResult.setMin<T> setmin) {
            this.setMax = removeitematint;
            this.getMax = i;
            this.setMin = executor;
            this.length = setmin;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax() {
            if (!this.setMax.setMin()) {
                return false;
            }
            length(PageResult.getMax());
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void length(@NonNull final PageResult<T> pageResult) {
            Executor executor;
            synchronized (this.getMin) {
                if (!this.isInside) {
                    this.isInside = true;
                    executor = this.setMin;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new Runnable() {
                    public final void run() {
                        setMax.this.length.setMin(setMax.this.getMax, pageResult);
                    }
                });
            } else {
                this.length.setMin(this.getMax, pageResult);
            }
        }
    }

    @AnyThread
    public void getMax(@NonNull getMin getmin) {
        this.getMax.add(getmin);
    }

    @AnyThread
    public void getMin(@NonNull getMin getmin) {
        this.getMax.remove(getmin);
    }

    @WorkerThread
    public boolean setMin() {
        return this.getMin.get();
    }
}
