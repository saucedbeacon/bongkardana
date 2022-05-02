package o;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.paging.PageResult;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import o.getItem;
import o.hasVisibleItems;
import o.setExclusiveItemChecked;

final class findItem<T> extends setExclusiveItemChecked<T> implements hasVisibleItems.setMax {
    final getItem<T> setMax;
    PageResult.setMin<T> setMin = new PageResult.setMin<T>() {
        @AnyThread
        public final void setMin(int i, @NonNull PageResult<T> pageResult) {
            boolean z = true;
            if (pageResult.setMin()) {
                findItem.this.valueOf.set(true);
            } else if (!findItem.this.equals()) {
                if (i == 0 || i == 3) {
                    List<T> list = pageResult.setMin;
                    if (findItem.this.FastBitmap$CoordinateSystem.getMax.size() == 0) {
                        findItem.this.FastBitmap$CoordinateSystem.length(pageResult.getMax, list, pageResult.length, pageResult.getMin, findItem.this.toDoubleRange.getMax, findItem.this);
                    } else {
                        hasVisibleItems hasvisibleitems = findItem.this.FastBitmap$CoordinateSystem;
                        int i2 = pageResult.getMin;
                        int i3 = findItem.this.values;
                        int i4 = findItem.this.toDoubleRange.setMin;
                        int i5 = findItem.this.invoke;
                        findItem finditem = findItem.this;
                        boolean z2 = i4 != Integer.MAX_VALUE;
                        boolean z3 = i3 > (hasvisibleitems.length + hasvisibleitems.setMin) + (hasvisibleitems.toFloatRange / 2);
                        if (!z2 || !hasvisibleitems.getMin(i4, i5, list.size()) || !hasvisibleitems.length(i2, z3)) {
                            hasvisibleitems.getMin(i2, list, (hasVisibleItems.setMax) finditem);
                        } else {
                            hasvisibleitems.getMax.set((i2 - hasvisibleitems.length) / hasvisibleitems.equals, (Object) null);
                            hasvisibleitems.toFloatRange -= list.size();
                            if (z3) {
                                hasvisibleitems.getMax.remove(0);
                                hasvisibleitems.length += list.size();
                            } else {
                                hasvisibleitems.getMax.remove(hasvisibleitems.getMax.size() - 1);
                                hasvisibleitems.getMin += list.size();
                            }
                        }
                        if (z2) {
                            if (z3) {
                                hasvisibleitems.getMax(true, i4, i5, finditem);
                            } else {
                                hasvisibleitems.getMin(true, i4, i5, (hasVisibleItems.setMax) finditem);
                            }
                        }
                    }
                    if (findItem.this.toString != null) {
                        boolean z4 = findItem.this.FastBitmap$CoordinateSystem.size() == 0;
                        boolean z5 = !z4 && pageResult.getMax == 0 && pageResult.getMin == 0;
                        int size = findItem.this.size();
                        if (z4 || (!(i == 0 && pageResult.length == 0) && (i != 3 || pageResult.getMin + findItem.this.toDoubleRange.getMax < size))) {
                            z = false;
                        }
                        findItem.this.getMax(z4, z5, z);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("unexpected resultType".concat(String.valueOf(i)));
            }
        }
    };

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        return false;
    }

    @WorkerThread
    findItem(@NonNull getItem<T> getitem, @NonNull Executor executor, @NonNull Executor executor2, @Nullable setExclusiveItemChecked.setMax<T> setmax, @NonNull setExclusiveItemChecked.getMin getmin, int i) {
        super(new hasVisibleItems(), executor, executor2, setmax, getmin);
        this.setMax = getitem;
        int i2 = this.toDoubleRange.getMax;
        this.values = i;
        if (this.setMax.setMin()) {
            this.valueOf.set(true);
        } else {
            this.setMax.length(true, i2, this.toIntRange, this.setMin);
        }
    }

    @NonNull
    public final removeItemAtInt<?, T> getMax() {
        return this.setMax;
    }

    @Nullable
    public final Object getMin() {
        return Integer.valueOf(this.values);
    }

    /* access modifiers changed from: protected */
    public final void setMin(@NonNull setExclusiveItemChecked<T> setexclusiveitemchecked, @NonNull setExclusiveItemChecked.length length) {
        hasVisibleItems<T> hasvisibleitems = setexclusiveitemchecked.FastBitmap$CoordinateSystem;
        if (hasvisibleitems.isEmpty() || this.FastBitmap$CoordinateSystem.size() != hasvisibleitems.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i = this.toDoubleRange.getMax;
        int i2 = this.FastBitmap$CoordinateSystem.length / i;
        int size = this.FastBitmap$CoordinateSystem.getMax.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + i2;
            int i5 = 0;
            while (i5 < this.FastBitmap$CoordinateSystem.getMax.size()) {
                int i6 = i4 + i5;
                if (!this.FastBitmap$CoordinateSystem.setMin(i, i6) || hasvisibleitems.setMin(i, i6)) {
                    break;
                }
                i5++;
            }
            if (i5 > 0) {
                length.setMin(i4 * i, i * i5);
                i3 += i5 - 1;
            }
            i3++;
        }
    }

    /* access modifiers changed from: protected */
    public final void setMax(int i) {
        hasVisibleItems hasvisibleitems = this.FastBitmap$CoordinateSystem;
        int i2 = this.toDoubleRange.length;
        int i3 = this.toDoubleRange.getMax;
        if (i3 != hasvisibleitems.equals) {
            if (i3 < hasvisibleitems.equals) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (hasvisibleitems.getMax.size() == 1 && hasvisibleitems.getMin == 0) {
                hasvisibleitems.equals = i3;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        int size = ((hasvisibleitems.size() + hasvisibleitems.equals) - 1) / hasvisibleitems.equals;
        int max = Math.max((i - i2) / hasvisibleitems.equals, 0);
        int min = Math.min((i + i2) / hasvisibleitems.equals, size - 1);
        hasvisibleitems.getMax(max, min);
        int i4 = hasvisibleitems.length / hasvisibleitems.equals;
        while (max <= min) {
            int i5 = max - i4;
            if (hasvisibleitems.getMax.get(i5) == null) {
                hasvisibleitems.getMax.set(i5, hasVisibleItems.setMax);
                length(max);
            }
            max++;
        }
    }

    public final void setMin(int i) {
        getMin(0, i);
    }

    public final void setMin(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public final void length(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public final void setMax() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public final void length() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public final void length(final int i) {
        this.toFloatRange.execute(new Runnable() {
            public final void run() {
                if (!findItem.this.equals()) {
                    int i = findItem.this.toDoubleRange.getMax;
                    if (findItem.this.setMax.setMin()) {
                        findItem.this.valueOf.set(true);
                        return;
                    }
                    int i2 = i * i;
                    int min = Math.min(i, findItem.this.FastBitmap$CoordinateSystem.size() - i2);
                    getItem.setMin setmin = new getItem.setMin(findItem.this.setMax, 3, i2, findItem.this.toIntRange, findItem.this.setMin);
                    if (min == 0) {
                        setmin.length(Collections.emptyList());
                    }
                }
            }
        });
    }

    public final void setMax(int i, int i2) {
        length(i, i2);
    }

    public final void setMin(int i, int i2) {
        IsOverlapping(i, i2);
    }

    public final void getMax(int i, int i2) {
        length(i, i2);
    }
}
