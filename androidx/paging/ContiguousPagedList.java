package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PageResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.concurrent.Executor;
import o.hasVisibleItems;
import o.removeGroup;
import o.removeItemAtInt;
import o.setExclusiveItemChecked;

public final class ContiguousPagedList<K, V> extends setExclusiveItemChecked<V> implements hasVisibleItems.setMax {
    boolean IsOverlapping = false;
    PageResult.setMin<V> equals = new PageResult.setMin<V>() {
        @AnyThread
        public final void setMin(int i, @NonNull PageResult<V> pageResult) {
            boolean z = true;
            if (pageResult.setMin()) {
                ContiguousPagedList.this.valueOf.set(true);
            } else if (!ContiguousPagedList.this.equals()) {
                List<T> list = pageResult.setMin;
                if (i == 0) {
                    hasVisibleItems hasvisibleitems = ContiguousPagedList.this.FastBitmap$CoordinateSystem;
                    int i2 = pageResult.getMax;
                    int i3 = pageResult.length;
                    int i4 = pageResult.getMin;
                    ContiguousPagedList contiguousPagedList = ContiguousPagedList.this;
                    hasvisibleitems.getMin(i2, list, i3, i4);
                    contiguousPagedList.setMin(hasvisibleitems.size());
                    if (ContiguousPagedList.this.values == -1) {
                        ContiguousPagedList.this.values = pageResult.getMax + pageResult.getMin + (list.size() / 2);
                    }
                } else {
                    int i5 = ContiguousPagedList.this.values;
                    hasVisibleItems hasvisibleitems2 = ContiguousPagedList.this.FastBitmap$CoordinateSystem;
                    boolean z2 = i5 > (hasvisibleitems2.length + hasvisibleitems2.setMin) + (hasvisibleitems2.toFloatRange / 2);
                    boolean z3 = ContiguousPagedList.this.isInside && ContiguousPagedList.this.FastBitmap$CoordinateSystem.getMin(ContiguousPagedList.this.toDoubleRange.setMin, ContiguousPagedList.this.invoke, list.size());
                    if (i == 1) {
                        if (!z3 || z2) {
                            hasVisibleItems hasvisibleitems3 = ContiguousPagedList.this.FastBitmap$CoordinateSystem;
                            ContiguousPagedList contiguousPagedList2 = ContiguousPagedList.this;
                            int size = list.size();
                            if (size == 0) {
                                contiguousPagedList2.length();
                            } else {
                                if (hasvisibleitems3.equals > 0 && (hasvisibleitems3.getMax.get(hasvisibleitems3.getMax.size() - 1).size() != hasvisibleitems3.equals || size > hasvisibleitems3.equals)) {
                                    hasvisibleitems3.equals = -1;
                                }
                                hasvisibleitems3.getMax.add(list);
                                hasvisibleitems3.isInside += size;
                                hasvisibleitems3.toFloatRange += size;
                                int min = Math.min(hasvisibleitems3.getMin, size);
                                int i6 = size - min;
                                if (min != 0) {
                                    hasvisibleitems3.getMin -= min;
                                }
                                hasvisibleitems3.IsOverlapping += size;
                                contiguousPagedList2.length((hasvisibleitems3.length + hasvisibleitems3.toFloatRange) - size, min, i6);
                            }
                        } else {
                            ContiguousPagedList.this.setMax = 0;
                            ContiguousPagedList.this.getMax = 0;
                        }
                    } else if (i != 2) {
                        throw new IllegalArgumentException("unexpected resultType ".concat(String.valueOf(i)));
                    } else if (!z3 || !z2) {
                        hasVisibleItems hasvisibleitems4 = ContiguousPagedList.this.FastBitmap$CoordinateSystem;
                        ContiguousPagedList contiguousPagedList3 = ContiguousPagedList.this;
                        int size2 = list.size();
                        if (size2 == 0) {
                            contiguousPagedList3.setMax();
                        } else {
                            if (hasvisibleitems4.equals > 0 && size2 != hasvisibleitems4.equals) {
                                if (hasvisibleitems4.getMax.size() != 1 || size2 <= hasvisibleitems4.equals) {
                                    hasvisibleitems4.equals = -1;
                                } else {
                                    hasvisibleitems4.equals = size2;
                                }
                            }
                            hasvisibleitems4.getMax.add(0, list);
                            hasvisibleitems4.isInside += size2;
                            hasvisibleitems4.toFloatRange += size2;
                            int min2 = Math.min(hasvisibleitems4.length, size2);
                            int i7 = size2 - min2;
                            if (min2 != 0) {
                                hasvisibleitems4.length -= min2;
                            }
                            hasvisibleitems4.setMin -= i7;
                            hasvisibleitems4.toIntRange += size2;
                            contiguousPagedList3.setMin(hasvisibleitems4.length, min2, i7);
                        }
                    } else {
                        ContiguousPagedList.this.getMin = 0;
                        ContiguousPagedList.this.setMin = 0;
                    }
                    if (ContiguousPagedList.this.isInside) {
                        if (z2) {
                            if (ContiguousPagedList.this.setMin != 1 && ContiguousPagedList.this.FastBitmap$CoordinateSystem.getMax(ContiguousPagedList.this.IsOverlapping, ContiguousPagedList.this.toDoubleRange.setMin, ContiguousPagedList.this.invoke, ContiguousPagedList.this)) {
                                ContiguousPagedList.this.setMin = 0;
                            }
                        } else if (ContiguousPagedList.this.getMax != 1 && ContiguousPagedList.this.FastBitmap$CoordinateSystem.getMin(ContiguousPagedList.this.IsOverlapping, ContiguousPagedList.this.toDoubleRange.setMin, ContiguousPagedList.this.invoke, (hasVisibleItems.setMax) ContiguousPagedList.this)) {
                            ContiguousPagedList.this.getMax = 0;
                        }
                    }
                }
                if (ContiguousPagedList.this.toString != null) {
                    boolean z4 = ContiguousPagedList.this.FastBitmap$CoordinateSystem.size() == 0;
                    boolean z5 = !z4 && i == 2 && pageResult.setMin.size() == 0;
                    if (!(!z4 && i == 1 && pageResult.setMin.size() == 0)) {
                        z = false;
                    }
                    ContiguousPagedList.this.getMax(z4, z5, z);
                }
            }
        }
    };
    int getMax = 0;
    int getMin = 0;
    final boolean isInside;
    final removeGroup<K, V> length;
    int setMax = 0;
    int setMin = 0;

    @Retention(RetentionPolicy.SOURCE)
    @interface FetchState {
    }

    public final boolean setMin() {
        return true;
    }

    public ContiguousPagedList(@NonNull removeGroup<K, V> removegroup, @NonNull Executor executor, @NonNull Executor executor2, @Nullable setExclusiveItemChecked.setMax<V> setmax, @NonNull setExclusiveItemChecked.getMin getmin, int i) {
        super(new hasVisibleItems(), executor, executor2, setmax, getmin);
        boolean z = false;
        this.length = removegroup;
        this.values = i;
        if (this.length.setMin()) {
            this.valueOf.set(true);
        } else {
            this.length.length(this.toDoubleRange.setMax, this.toDoubleRange.getMax, this.toDoubleRange.getMin, this.toIntRange, this.equals);
        }
        if (this.length.setMax() && this.toDoubleRange.setMin != Integer.MAX_VALUE) {
            z = true;
        }
        this.isInside = z;
    }

    @MainThread
    public final void setMin(@NonNull setExclusiveItemChecked<V> setexclusiveitemchecked, @NonNull setExclusiveItemChecked.length length2) {
        hasVisibleItems<T> hasvisibleitems = setexclusiveitemchecked.FastBitmap$CoordinateSystem;
        int i = this.FastBitmap$CoordinateSystem.IsOverlapping - hasvisibleitems.IsOverlapping;
        int i2 = this.FastBitmap$CoordinateSystem.toIntRange - hasvisibleitems.toIntRange;
        int i3 = hasvisibleitems.getMin;
        int i4 = hasvisibleitems.length;
        if (hasvisibleitems.isEmpty() || i < 0 || i2 < 0 || this.FastBitmap$CoordinateSystem.getMin != Math.max(i3 - i, 0) || this.FastBitmap$CoordinateSystem.length != Math.max(i4 - i2, 0) || this.FastBitmap$CoordinateSystem.toFloatRange != hasvisibleitems.toFloatRange + i + i2) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i != 0) {
            int min = Math.min(i3, i);
            int i5 = i - min;
            int i6 = hasvisibleitems.length + hasvisibleitems.toFloatRange;
            if (min != 0) {
                length2.setMin(i6, min);
            }
            if (i5 != 0) {
                length2.setMax(i6 + min, i5);
            }
        }
        if (i2 != 0) {
            int min2 = Math.min(i4, i2);
            int i7 = i2 - min2;
            if (min2 != 0) {
                length2.setMin(i4, min2);
            }
            if (i7 != 0) {
                length2.setMax(0, i7);
            }
        }
    }

    @MainThread
    public final void setMax(int i) {
        int i2 = this.toDoubleRange.length - (i - this.FastBitmap$CoordinateSystem.length);
        int i3 = ((i + this.toDoubleRange.length) + 1) - (this.FastBitmap$CoordinateSystem.length + this.FastBitmap$CoordinateSystem.toFloatRange);
        int max = Math.max(i2, this.getMin);
        this.getMin = max;
        if (max > 0) {
            isInside();
        }
        int max2 = Math.max(i3, this.setMax);
        this.setMax = max2;
        if (max2 > 0) {
            toFloatRange();
        }
    }

    @MainThread
    private void isInside() {
        if (this.setMin == 0) {
            this.setMin = 1;
            final int i = this.FastBitmap$CoordinateSystem.length + this.FastBitmap$CoordinateSystem.setMin;
            final Object obj = this.FastBitmap$CoordinateSystem.getMax.get(0).get(0);
            this.toFloatRange.execute(new Runnable() {
                public final void run() {
                    if (!ContiguousPagedList.this.equals()) {
                        if (ContiguousPagedList.this.length.setMin()) {
                            ContiguousPagedList.this.valueOf.set(true);
                        } else {
                            ContiguousPagedList.this.length.getMax(i, ContiguousPagedList.this.toDoubleRange.getMax, ContiguousPagedList.this.toIntRange, ContiguousPagedList.this.equals);
                        }
                    }
                }
            });
        }
    }

    @MainThread
    private void toFloatRange() {
        if (this.getMax == 0) {
            this.getMax = 1;
            final int i = ((this.FastBitmap$CoordinateSystem.length + this.FastBitmap$CoordinateSystem.toFloatRange) - 1) + this.FastBitmap$CoordinateSystem.setMin;
            final Object min = this.FastBitmap$CoordinateSystem.setMin();
            this.toFloatRange.execute(new Runnable() {
                public final void run() {
                    if (!ContiguousPagedList.this.equals()) {
                        if (ContiguousPagedList.this.length.setMin()) {
                            ContiguousPagedList.this.valueOf.set(true);
                        } else {
                            ContiguousPagedList.this.length.setMin(i, ContiguousPagedList.this.toDoubleRange.getMax, ContiguousPagedList.this.toIntRange, ContiguousPagedList.this.equals);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    public final removeItemAtInt<?, V> getMax() {
        return this.length;
    }

    @Nullable
    public final Object getMin() {
        return this.length.getMin(this.values);
    }

    @MainThread
    public final void setMin(int i) {
        boolean z = false;
        getMin(0, i);
        if (this.FastBitmap$CoordinateSystem.length > 0 || this.FastBitmap$CoordinateSystem.getMin > 0) {
            z = true;
        }
        this.IsOverlapping = z;
    }

    @MainThread
    public final void setMin(int i, int i2, int i3) {
        int i4 = (this.getMin - i2) - i3;
        this.getMin = i4;
        this.setMin = 0;
        if (i4 > 0) {
            isInside();
        }
        length(i, i2);
        getMin(0, i3);
        getMin(i3);
    }

    @MainThread
    public final void setMax() {
        this.setMin = 2;
    }

    @MainThread
    public final void length(int i, int i2, int i3) {
        int i4 = (this.setMax - i2) - i3;
        this.setMax = i4;
        this.getMax = 0;
        if (i4 > 0) {
            toFloatRange();
        }
        length(i, i2);
        getMin(i + i2, i3);
    }

    @MainThread
    public final void length() {
        this.getMax = 2;
    }

    @MainThread
    public final void length(int i) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    @MainThread
    public final void setMax(int i, int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    public final void setMin(int i, int i2) {
        IsOverlapping(i, i2);
    }

    public final void getMax(int i, int i2) {
        length(i, i2);
    }
}
