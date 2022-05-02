package o;

import io.reactivex.annotations.Nullable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class setTitleBackgroundImage<T> implements getRefreshViewHeight<T> {
    static final int getMax = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object toFloatRange = new Object();
    AtomicReferenceArray<Object> IsOverlapping;
    public final AtomicLong equals = new AtomicLong();
    final int getMin;
    final int isInside;
    int length;
    long setMax;
    public final AtomicLong setMin = new AtomicLong();
    AtomicReferenceArray<Object> toIntRange;

    public setTitleBackgroundImage(int i) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.IsOverlapping = atomicReferenceArray;
        this.getMin = i2;
        this.length = Math.min(numberOfLeadingZeros / 4, getMax);
        this.toIntRange = atomicReferenceArray;
        this.isInside = i2;
        this.setMax = (long) (i2 - 1);
        this.setMin.lazySet(0);
    }

    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.IsOverlapping;
            long j = this.setMin.get();
            int i = this.getMin;
            int i2 = ((int) j) & i;
            if (j < this.setMax) {
                return getMax(atomicReferenceArray, t, j, i2);
            }
            long j2 = ((long) this.length) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.setMax = j2 - 1;
                return getMax(atomicReferenceArray, t, j, i2);
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                return getMax(atomicReferenceArray, t, j, i2);
            }
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.IsOverlapping = atomicReferenceArray2;
            this.setMax = (j + ((long) i)) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, toFloatRange);
            this.setMin.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Nullable
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.toIntRange;
        long j = this.equals.get();
        int i = this.isInside;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        boolean z = t == toFloatRange;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            this.equals.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            AtomicReferenceArray<Object> max = setMax(atomicReferenceArray, i + 1);
            this.toIntRange = max;
            T t2 = max.get(i2);
            if (t2 != null) {
                max.lazySet(i2, (Object) null);
                this.equals.lazySet(j + 1);
            }
            return t2;
        }
    }

    public final T getMax() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.toIntRange;
        long j = this.equals.get();
        int i = this.isInside;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        if (t != toFloatRange) {
            return t;
        }
        AtomicReferenceArray<Object> max = setMax(atomicReferenceArray, i + 1);
        this.toIntRange = max;
        return max.get(i2);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean setMax(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.IsOverlapping;
        long j = this.setMin.get();
        int i = this.getMin;
        long j2 = 2 + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = ((int) j) & i;
            atomicReferenceArray.lazySet(i2 + 1, t2);
            atomicReferenceArray.lazySet(i2, t);
            this.setMin.lazySet(j2);
        } else {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.IsOverlapping = atomicReferenceArray2;
            int i3 = ((int) j) & i;
            atomicReferenceArray2.lazySet(i3 + 1, t2);
            atomicReferenceArray2.lazySet(i3, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i3, toFloatRange);
            this.setMin.lazySet(j2);
        }
        return true;
    }

    private boolean getMax(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        atomicReferenceArray.lazySet(i, t);
        this.setMin.lazySet(j + 1);
        return true;
    }

    private static AtomicReferenceArray<Object> setMax(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(175537701, oncanceled);
            onCancelLoad.getMin(175537701, oncanceled);
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i);
        atomicReferenceArray.lazySet(i, (Object) null);
        return atomicReferenceArray2;
    }

    public final boolean isEmpty() {
        return this.setMin.get() == this.equals.get();
    }
}
