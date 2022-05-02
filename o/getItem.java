package o;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.paging.PageResult;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import o.removeItemAtInt;

public abstract class getItem<T> extends removeItemAtInt<Integer, T> {

    public static abstract class getMin<T> {
        public abstract void length(@NonNull List<T> list);
    }

    public static abstract class setMax<T> {
        public abstract void length(@NonNull List<T> list);
    }

    @WorkerThread
    public abstract void getMax(@NonNull getMin<T> getmin);

    /* access modifiers changed from: package-private */
    public final boolean getMin() {
        return false;
    }

    static class length<T> extends getMin<T> {
        final removeItemAtInt.setMax<T> getMin;
        private final boolean length;
        private final int setMax;

        length(@NonNull getItem getitem, boolean z, int i, PageResult.setMin<T> setmin) {
            this.getMin = new removeItemAtInt.setMax<>(getitem, 0, (Executor) null, setmin);
            this.length = z;
            this.setMax = i;
            if (i <= 0) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }

        public final void length(@NonNull List<T> list) {
            if (!this.getMin.getMax()) {
                list.isEmpty();
                if (!this.length) {
                    this.getMin.length(new PageResult(list));
                    return;
                }
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
        }
    }

    static class setMin<T> extends setMax<T> {
        private removeItemAtInt.setMax<T> getMax;
        private final int length;

        setMin(@NonNull getItem getitem, int i, int i2, Executor executor, PageResult.setMin<T> setmin) {
            this.getMax = new removeItemAtInt.setMax<>(getitem, i, executor, setmin);
            this.length = i2;
        }

        public final void length(@NonNull List<T> list) {
            if (!this.getMax.getMax()) {
                this.getMax.length(new PageResult(list, this.length));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void length(boolean z, int i, @NonNull Executor executor, @NonNull PageResult.setMin<T> setmin) {
        length length2 = new length(this, z, i, setmin);
        getMax(length2);
        removeItemAtInt.setMax<T> setmax = length2.getMin;
        synchronized (setmax.getMin) {
            setmax.setMin = executor;
        }
    }

    static class getMax<Value> extends removeGroup<Integer, Value> {
        @NonNull
        final getItem<Value> length;

        getMax(@NonNull getItem<Value> getitem) {
            this.length = getitem;
        }

        public final void getMax(@NonNull removeItemAtInt.getMin getmin) {
            this.length.getMax(getmin);
        }

        public final void getMin(@NonNull removeItemAtInt.getMin getmin) {
            this.length.getMin(getmin);
        }

        public final boolean setMin() {
            return this.length.setMin();
        }

        /* access modifiers changed from: package-private */
        public final void setMin(int i, int i2, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin) {
            setMin setmin2 = new setMin(this.length, 1, i + 1, executor, setmin);
            if (i2 == 0) {
                setmin2.length(Collections.emptyList());
            }
        }

        /* access modifiers changed from: package-private */
        public final void getMax(int i, int i2, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin) {
            int i3 = i - 1;
            if (i3 < 0) {
                new setMin(this.length, 2, i3, executor, setmin).length(Collections.emptyList());
                return;
            }
            int min = Math.min(i2, i3 + 1);
            setMin setmin2 = new setMin(this.length, 2, (i3 - min) + 1, executor, setmin);
            if (min == 0) {
                setmin2.length(Collections.emptyList());
            }
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object getMin(int i) {
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ void length(int i, int i2, boolean z, @NonNull Executor executor, @NonNull PageResult.setMin setmin) {
            this.length.length(false, i2, executor, setmin);
        }
    }
}
