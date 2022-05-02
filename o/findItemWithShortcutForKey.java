package o;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class findItemWithShortcutForKey implements Runnable {
    public static final ThreadLocal<findItemWithShortcutForKey> length = new ThreadLocal<>();
    static Comparator<length> setMin = new Comparator<length>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            length length = (length) obj;
            length length2 = (length) obj2;
            if ((length.setMax == null) != (length2.setMax == null)) {
                return length.setMax == null ? 1 : -1;
            }
            if (length.getMin != length2.getMin) {
                return length.getMin ? -1 : 1;
            }
            int i = length2.setMin - length.setMin;
            if (i != 0) {
                return i;
            }
            int i2 = length.length - length2.length;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    };
    long getMax;
    public long getMin;
    public ArrayList<RecyclerView> setMax = new ArrayList<>();
    private ArrayList<length> toIntRange = new ArrayList<>();

    static class length {
        public int getMax;
        public boolean getMin;
        public int length;
        public RecyclerView setMax;
        public int setMin;

        length() {
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class setMin implements RecyclerView.IsOverlapping.getMax {
        public int[] getMin;
        public int length;
        int setMax;
        int setMin;

        /* access modifiers changed from: package-private */
        public final void setMax(RecyclerView recyclerView, boolean z) {
            this.length = 0;
            int[] iArr = this.getMin;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.IsOverlapping isOverlapping = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && isOverlapping != null && isOverlapping.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.getMin()) {
                        isOverlapping.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    isOverlapping.collectAdjacentPrefetchPositions(this.setMin, this.setMax, recyclerView.mState, this);
                }
                if (this.length > isOverlapping.mPrefetchMaxCountObserved) {
                    isOverlapping.mPrefetchMaxCountObserved = this.length;
                    isOverlapping.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.getMin();
                }
            }
        }

        public final void length(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.length * 2;
                int[] iArr = this.getMin;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.getMin = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.getMin = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.getMin;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.length++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final boolean setMin(int i) {
            if (this.getMin != null) {
                int i2 = this.length * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.getMin[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final void getMax(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.getMax == 0) {
            this.getMax = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        setMin setmin = recyclerView.mPrefetchRegistry;
        setmin.setMin = i;
        setmin.setMax = i2;
    }

    private static boolean length(RecyclerView recyclerView, int i) {
        int min = recyclerView.mChildHelper.getMin.setMin();
        for (int i2 = 0; i2 < min; i2++) {
            RecyclerView.valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getMin.getMax(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private static RecyclerView.valueOf length(RecyclerView recyclerView, int i, long j) {
        if (length(recyclerView, i)) {
            return null;
        }
        RecyclerView.toDoubleRange todoublerange = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.valueOf max = todoublerange.setMax(i, j);
            if (max != null) {
                if (!max.isBound() || max.isInvalid()) {
                    todoublerange.getMax(max, false);
                } else {
                    todoublerange.length(max.itemView);
                }
            }
            return max;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void run() {
        RecyclerView recyclerView;
        length length2;
        long j = 0;
        try {
            StyleableRes.setMax("RV Prefetch");
            if (!this.setMax.isEmpty()) {
                int size = this.setMax.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = this.setMax.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.getMin;
                    int size2 = this.setMax.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = this.setMax.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.mPrefetchRegistry.setMax(recyclerView3, false);
                            i2 += recyclerView3.mPrefetchRegistry.length;
                        }
                    }
                    this.toIntRange.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = this.setMax.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            setMin setmin = recyclerView4.mPrefetchRegistry;
                            int abs = Math.abs(setmin.setMin) + Math.abs(setmin.setMax);
                            int i6 = 0;
                            while (i6 < setmin.length * 2) {
                                if (i4 >= this.toIntRange.size()) {
                                    length2 = new length();
                                    this.toIntRange.add(length2);
                                } else {
                                    length2 = this.toIntRange.get(i4);
                                }
                                int i7 = setmin.getMin[i6 + 1];
                                try {
                                    length2.getMin = i7 <= abs;
                                    length2.setMin = abs;
                                    length2.length = i7;
                                    length2.setMax = recyclerView4;
                                    length2.getMax = setmin.getMin[i6];
                                    i4++;
                                    i6 += 2;
                                } catch (Throwable th) {
                                    th = th;
                                    j = 0;
                                    this.getMax = j;
                                    StyleableRes.getMin();
                                    throw th;
                                }
                            }
                        }
                    }
                    Collections.sort(this.toIntRange, setMin);
                    for (int i8 = 0; i8 < this.toIntRange.size(); i8++) {
                        length length3 = this.toIntRange.get(i8);
                        if (length3.setMax == null) {
                            break;
                        }
                        RecyclerView.valueOf length4 = length(length3.setMax, length3.getMax, length3.getMin ? Long.MAX_VALUE : nanos);
                        if (!(length4 == null || length4.mNestedRecyclerView == null || !length4.isBound() || length4.isInvalid() || (recyclerView = length4.mNestedRecyclerView.get()) == null)) {
                            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getMin.setMin() != 0) {
                                recyclerView.removeAndRecycleViews();
                            }
                            setMin setmin2 = recyclerView.mPrefetchRegistry;
                            setmin2.setMax(recyclerView, true);
                            if (setmin2.length != 0) {
                                StyleableRes.setMax("RV Nested Prefetch");
                                RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = recyclerView.mState;
                                RecyclerView.Adapter adapter = recyclerView.mAdapter;
                                recyclerView$Mean$Arithmetic.length = 1;
                                recyclerView$Mean$Arithmetic.setMin = adapter.getItemCount();
                                recyclerView$Mean$Arithmetic.equals = false;
                                recyclerView$Mean$Arithmetic.toIntRange = false;
                                recyclerView$Mean$Arithmetic.toFloatRange = false;
                                for (int i9 = 0; i9 < setmin2.length * 2; i9 += 2) {
                                    length(recyclerView, setmin2.getMin[i9], nanos);
                                }
                                StyleableRes.getMin();
                            }
                        }
                        length3.getMin = false;
                        length3.setMin = 0;
                        length3.length = 0;
                        length3.setMax = null;
                        length3.getMax = 0;
                    }
                    j = 0;
                }
            }
            this.getMax = j;
            StyleableRes.getMin();
        } catch (Throwable th2) {
            th = th2;
            this.getMax = j;
            StyleableRes.getMin();
            throw th;
        }
    }
}
