package o;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.paging.ContiguousPagedList;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.getItem;

public abstract class setExclusiveItemChecked<T> extends AbstractList<T> {
    @NonNull
    public final hasVisibleItems<T> FastBitmap$CoordinateSystem;
    boolean Mean$Arithmetic = false;
    private int getMax = Integer.MIN_VALUE;
    private final ArrayList<WeakReference<length>> getMin = new ArrayList<>();
    T hashCode = null;
    public final int invoke;
    boolean invokeSuspend = false;
    private int setMin = Integer.MAX_VALUE;
    @NonNull
    public final getMin toDoubleRange;
    @NonNull
    protected final Executor toFloatRange;
    @NonNull
    public final Executor toIntRange;
    @Nullable
    public final setMax<T> toString;
    public final AtomicBoolean valueOf = new AtomicBoolean(false);
    public int values = 0;

    public static abstract class length {
        public abstract void getMax(int i, int i2);

        public abstract void setMax(int i, int i2);

        public abstract void setMin(int i, int i2);
    }

    @MainThread
    public static abstract class setMax<T> {
    }

    @NonNull
    public abstract removeItemAtInt<?, T> getMax();

    @Nullable
    public abstract Object getMin();

    /* access modifiers changed from: protected */
    public abstract void setMax(int i);

    /* access modifiers changed from: protected */
    public abstract void setMin(@NonNull setExclusiveItemChecked<T> setexclusiveitemchecked, @NonNull length length2);

    /* access modifiers changed from: protected */
    public abstract boolean setMin();

    public setExclusiveItemChecked(@NonNull hasVisibleItems<T> hasvisibleitems, @NonNull Executor executor, @NonNull Executor executor2, @Nullable setMax<T> setmax, @NonNull getMin getmin) {
        this.FastBitmap$CoordinateSystem = hasvisibleitems;
        this.toIntRange = executor;
        this.toFloatRange = executor2;
        this.toString = setmax;
        this.toDoubleRange = getmin;
        this.invoke = (getmin.length * 2) + this.toDoubleRange.getMax;
    }

    public static final class setMin<Key, Value> {
        private final getMin equals;
        Executor getMax;
        Executor getMin;
        private final removeItemAtInt<Key, Value> length;
        setMax setMax;
        Key setMin;

        public setMin(@NonNull removeItemAtInt<Key, Value> removeitematint, @NonNull getMin getmin) {
            if (removeitematint == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (getmin != null) {
                this.length = removeitematint;
                this.equals = getmin;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }

        @WorkerThread
        @NonNull
        public final setExclusiveItemChecked<Value> getMin() {
            int i;
            Executor executor = this.getMin;
            if (executor != null) {
                Executor executor2 = this.getMax;
                if (executor2 != null) {
                    removeItemAtInt<Key, Value> removeitematint = this.length;
                    setMax setmax = this.setMax;
                    getMin getmin = this.equals;
                    Key key = this.setMin;
                    if (removeitematint.getMin() || !getmin.getMin) {
                        int i2 = -1;
                        if (!removeitematint.getMin()) {
                            getItem.getMax getmax = new getItem.getMax((getItem) removeitematint);
                            if (key != null) {
                                i2 = ((Integer) key).intValue();
                            }
                            removeitematint = getmax;
                        }
                        return new ContiguousPagedList((removeGroup) removeitematint, executor, executor2, setmax, getmin, i2);
                    }
                    getItem getitem = (getItem) removeitematint;
                    if (key != null) {
                        i = ((Integer) key).intValue();
                    } else {
                        i = 0;
                    }
                    return new findItem(getitem, executor, executor2, setmax, getmin, i);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }
    }

    @Nullable
    public T get(int i) {
        T t = this.FastBitmap$CoordinateSystem.get(i);
        if (t != null) {
            this.hashCode = t;
        }
        return t;
    }

    public final void getMax(int i) {
        if (i < 0 || i >= size()) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        this.values = this.FastBitmap$CoordinateSystem.setMin + i;
        setMax(i);
        this.setMin = Math.min(this.setMin, i);
        this.getMax = Math.max(this.getMax, i);
        getMax(true);
    }

    @AnyThread
    public final void getMax(final boolean z, final boolean z2, final boolean z3) {
        if (this.toString != null) {
            if (this.setMin == Integer.MAX_VALUE) {
                this.setMin = this.FastBitmap$CoordinateSystem.size();
            }
            if (this.getMax == Integer.MIN_VALUE) {
                this.getMax = 0;
            }
            if (z || z2 || z3) {
                this.toIntRange.execute(new Runnable() {
                    public final void run() {
                        if (z2) {
                            setExclusiveItemChecked.this.invokeSuspend = true;
                        }
                        if (z3) {
                            setExclusiveItemChecked.this.Mean$Arithmetic = true;
                        }
                        setExclusiveItemChecked.this.getMax(false);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    /* access modifiers changed from: package-private */
    public final void getMax(boolean z) {
        final boolean z2 = true;
        final boolean z3 = this.invokeSuspend && this.setMin <= this.toDoubleRange.length;
        if (!this.Mean$Arithmetic || this.getMax < (size() - 1) - this.toDoubleRange.length) {
            z2 = false;
        }
        if (z3 || z2) {
            if (z3) {
                this.invokeSuspend = false;
            }
            if (z2) {
                this.Mean$Arithmetic = false;
            }
            if (z) {
                this.toIntRange.execute(new Runnable() {
                    public final void run() {
                        setExclusiveItemChecked setexclusiveitemchecked = setExclusiveItemChecked.this;
                        boolean z = z3;
                        boolean z2 = z2;
                        if (z) {
                            setexclusiveitemchecked.FastBitmap$CoordinateSystem.getMax.get(0).get(0);
                        }
                        if (z2) {
                            setexclusiveitemchecked.FastBitmap$CoordinateSystem.setMin();
                        }
                    }
                });
                return;
            }
            if (z3) {
                this.FastBitmap$CoordinateSystem.getMax.get(0).get(0);
            }
            if (z2) {
                this.FastBitmap$CoordinateSystem.setMin();
            }
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void getMin(int i) {
        this.values += i;
        this.setMin += i;
        this.getMax += i;
    }

    public int size() {
        return this.FastBitmap$CoordinateSystem.size();
    }

    public boolean toIntRange() {
        return equals();
    }

    public boolean equals() {
        return this.valueOf.get();
    }

    public final void setMax(@Nullable List<T> list, @NonNull length length2) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                setMin((setExclusiveItemChecked) list, length2);
            } else if (!this.FastBitmap$CoordinateSystem.isEmpty()) {
                length2.setMax(0, this.FastBitmap$CoordinateSystem.size());
            }
        }
        for (int size = this.getMin.size() - 1; size >= 0; size--) {
            if (((length) this.getMin.get(size).get()) == null) {
                this.getMin.remove(size);
            }
        }
        this.getMin.add(new WeakReference(length2));
    }

    public final void getMax(@NonNull length length2) {
        for (int size = this.getMin.size() - 1; size >= 0; size--) {
            length length3 = (length) this.getMin.get(size).get();
            if (length3 == null || length3 == length2) {
                this.getMin.remove(size);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void getMin(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.getMin.size() - 1; size >= 0; size--) {
                length length2 = (length) this.getMin.get(size).get();
                if (length2 != null) {
                    length2.setMax(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void length(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.getMin.size() - 1; size >= 0; size--) {
                length length2 = (length) this.getMin.get(size).get();
                if (length2 != null) {
                    length2.setMin(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void IsOverlapping(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.getMin.size() - 1; size >= 0; size--) {
                length length2 = (length) this.getMin.get(size).get();
                if (length2 != null) {
                    length2.getMax(i, i2);
                }
            }
        }
    }

    public static class getMin {
        public final int getMax;
        public final boolean getMin;
        public final int length;
        public final int setMax;
        public final int setMin;

        getMin(int i, int i2, boolean z, int i3, int i4) {
            this.getMax = i;
            this.length = i2;
            this.getMin = z;
            this.setMax = i3;
            this.setMin = i4;
        }

        public static final class length {
            public int getMax = -1;
            private int getMin = -1;
            private int length = Integer.MAX_VALUE;
            public boolean setMax = true;
            public int setMin = -1;

            @NonNull
            public final getMin setMax() {
                if (this.setMin < 0) {
                    this.setMin = this.getMax;
                }
                if (this.getMin < 0) {
                    this.getMin = this.getMax * 3;
                }
                if (this.setMax || this.setMin != 0) {
                    int i = this.length;
                    if (i == Integer.MAX_VALUE || i >= this.getMax + (this.setMin * 2)) {
                        return new getMin(this.getMax, this.setMin, this.setMax, this.getMin, this.length);
                    }
                    StringBuilder sb = new StringBuilder("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=");
                    sb.append(this.getMax);
                    sb.append(", prefetchDist=");
                    sb.append(this.setMin);
                    sb.append(", maxSize=");
                    sb.append(this.length);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }
        }
    }
}
