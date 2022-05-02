package o;

import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;
import com.rd.animation.type.DropAnimation;
import com.rd.draw.data.Orientation;
import o.offsetPositionRecordsForInsert;

public final class isAnimating {
    public boolean getMax;
    private offsetPositionRecordsForInsert.setMax getMin;
    private offsetPositionRecordsForInsert length;
    public float setMax;
    public invalidateItemDecorations setMin;
    private onChildDetachedFromWindow toFloatRange;

    public isAnimating(@NonNull onChildDetachedFromWindow onchilddetachedfromwindow, @NonNull offsetPositionRecordsForInsert.setMax setmax) {
        this.length = new offsetPositionRecordsForInsert(setmax);
        this.getMin = setmax;
        this.toFloatRange = onchilddetachedfromwindow;
    }

    /* renamed from: o.isAnimating$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rd.animation.type.AnimationType[] r0 = com.rd.animation.type.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.SCALE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.WORM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.FILL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.SLIDE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.DROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x006c }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.SWAP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.rd.animation.type.AnimationType r1 = com.rd.animation.type.AnimationType.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isAnimating.AnonymousClass3.<clinit>():void");
        }
    }

    public final void setMin() {
        onChildDetachedFromWindow onchilddetachedfromwindow = this.toFloatRange;
        if (onchilddetachedfromwindow.onPostMessage == null) {
            onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        }
        switch (AnonymousClass3.setMax[onchilddetachedfromwindow.onPostMessage.ordinal()]) {
            case 1:
                this.getMin.setMin((canReuseUpdatedViewHolder) null);
                return;
            case 2:
                getMin();
                return;
            case 3:
                length();
                return;
            case 4:
                getMax();
                return;
            case 5:
                isInside();
                return;
            case 6:
                setMax();
                return;
            case 7:
                equals();
                return;
            case 8:
                IsOverlapping();
                return;
            case 9:
                toIntRange();
                return;
            case 10:
                toFloatRange();
                return;
            default:
                return;
        }
    }

    private void getMin() {
        int i = this.toFloatRange.hashCode;
        int i2 = this.toFloatRange.toString;
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.length == null) {
            offsetpositionrecordsforinsert.length = new getChildPosition(offsetpositionrecordsforinsert.toFloatRange);
        }
        invalidateItemDecorations length2 = offsetpositionrecordsforinsert.length.setMin(i2, i).length(j);
        if (this.getMax) {
            length2.getMax(this.setMax);
        } else {
            length2.length();
        }
        this.setMin = length2;
    }

    private void length() {
        int i = this.toFloatRange.hashCode;
        int i2 = this.toFloatRange.toString;
        int i3 = this.toFloatRange.getMax;
        float f = this.toFloatRange.equals;
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.setMin == null) {
            offsetpositionrecordsforinsert.setMin = new getChildViewHolderInt(offsetpositionrecordsforinsert.toFloatRange);
        }
        invalidateItemDecorations length2 = offsetpositionrecordsforinsert.setMin.getMin(i2, i, i3, f).length(j);
        if (this.getMax) {
            length2.getMax(this.setMax);
        } else {
            length2.length();
        }
        this.setMin = length2;
    }

    private void getMax() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.toFloatRange.getMin()) {
            i = this.toFloatRange.getCause;
        } else {
            i = this.toFloatRange.b;
        }
        if (this.toFloatRange.getMin()) {
            i2 = this.toFloatRange.onNavigationEvent;
        } else {
            i2 = this.toFloatRange.getCause;
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = this.toFloatRange;
        boolean z = false;
        if (onchilddetachedfromwindow == null) {
            i3 = 0;
        } else {
            if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i3 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow, i);
            } else {
                i3 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow, i);
            }
        }
        onChildDetachedFromWindow onchilddetachedfromwindow2 = this.toFloatRange;
        if (onchilddetachedfromwindow2 == null) {
            i4 = 0;
        } else {
            if (onchilddetachedfromwindow2.ICustomTabsCallback == null) {
                onchilddetachedfromwindow2.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow2.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i4 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow2, i2);
            } else {
                i4 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow2, i2);
            }
        }
        if (i2 > i) {
            z = true;
        }
        int i5 = this.toFloatRange.getMax;
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.getMin == null) {
            offsetpositionrecordsforinsert.getMin = new findViewHolderForItemId(offsetpositionrecordsforinsert.toFloatRange);
        }
        findViewHolderForItemId min = offsetpositionrecordsforinsert.getMin.getMin(i3, i4, i5, z).length(j);
        if (this.getMax) {
            min.getMax(this.setMax);
        } else {
            min.length();
        }
        this.setMin = min;
    }

    private void setMax() {
        int i;
        int i2;
        int i3;
        if (this.toFloatRange.getMin()) {
            i = this.toFloatRange.getCause;
        } else {
            i = this.toFloatRange.b;
        }
        if (this.toFloatRange.getMin()) {
            i2 = this.toFloatRange.onNavigationEvent;
        } else {
            i2 = this.toFloatRange.getCause;
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = this.toFloatRange;
        int i4 = 0;
        if (onchilddetachedfromwindow == null) {
            i3 = 0;
        } else {
            if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i3 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow, i);
            } else {
                i3 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow, i);
            }
        }
        onChildDetachedFromWindow onchilddetachedfromwindow2 = this.toFloatRange;
        if (onchilddetachedfromwindow2 != null) {
            if (onchilddetachedfromwindow2.ICustomTabsCallback == null) {
                onchilddetachedfromwindow2.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow2.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i4 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow2, i2);
            } else {
                i4 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow2, i2);
            }
        }
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.setMax == null) {
            offsetpositionrecordsforinsert.setMax = new getChildLayoutPosition(offsetpositionrecordsforinsert.toFloatRange);
        }
        invalidateItemDecorations length2 = offsetpositionrecordsforinsert.setMax.getMax(i3, i4).length(j);
        if (this.getMax) {
            length2.getMax(this.setMax);
        } else {
            length2.length();
        }
        this.setMin = length2;
    }

    private void isInside() {
        int i = this.toFloatRange.hashCode;
        int i2 = this.toFloatRange.toString;
        int i3 = this.toFloatRange.getMax;
        int i4 = this.toFloatRange.toIntRange;
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.getMax == null) {
            offsetpositionrecordsforinsert.getMax = new findContainingViewHolder(offsetpositionrecordsforinsert.toFloatRange);
        }
        invalidateItemDecorations length2 = offsetpositionrecordsforinsert.getMax.setMax(i2, i, i3, i4).length(j);
        if (this.getMax) {
            length2.getMax(this.setMax);
        } else {
            length2.length();
        }
        this.setMin = length2;
    }

    private void equals() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.toFloatRange.getMin()) {
            i = this.toFloatRange.getCause;
        } else {
            i = this.toFloatRange.b;
        }
        if (this.toFloatRange.getMin()) {
            i2 = this.toFloatRange.onNavigationEvent;
        } else {
            i2 = this.toFloatRange.getCause;
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = this.toFloatRange;
        boolean z = false;
        if (onchilddetachedfromwindow == null) {
            i3 = 0;
        } else {
            if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i3 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow, i);
            } else {
                i3 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow, i);
            }
        }
        onChildDetachedFromWindow onchilddetachedfromwindow2 = this.toFloatRange;
        if (onchilddetachedfromwindow2 == null) {
            i4 = 0;
        } else {
            if (onchilddetachedfromwindow2.ICustomTabsCallback == null) {
                onchilddetachedfromwindow2.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow2.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i4 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow2, i2);
            } else {
                i4 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow2, i2);
            }
        }
        if (i2 > i) {
            z = true;
        }
        int i5 = this.toFloatRange.getMax;
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.equals == null) {
            offsetpositionrecordsforinsert.equals = new findViewHolderForLayoutPosition(offsetpositionrecordsforinsert.toFloatRange);
        }
        findViewHolderForItemId min = offsetpositionrecordsforinsert.equals.getMin(i3, i4, i5, z).length(j);
        if (this.getMax) {
            min.getMax(this.setMax);
        } else {
            min.length();
        }
        this.setMin = min;
    }

    private void IsOverlapping() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.toFloatRange.getMin()) {
            i = this.toFloatRange.getCause;
        } else {
            i = this.toFloatRange.b;
        }
        if (this.toFloatRange.getMin()) {
            i2 = this.toFloatRange.onNavigationEvent;
        } else {
            i2 = this.toFloatRange.getCause;
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = this.toFloatRange;
        if (onchilddetachedfromwindow == null) {
            i3 = 0;
        } else {
            if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i6 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow, i);
            } else {
                i6 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow, i);
            }
            i3 = i6;
        }
        onChildDetachedFromWindow onchilddetachedfromwindow2 = this.toFloatRange;
        if (onchilddetachedfromwindow2 == null) {
            i4 = 0;
        } else {
            if (onchilddetachedfromwindow2.ICustomTabsCallback == null) {
                onchilddetachedfromwindow2.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow2.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i5 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow2, i2);
            } else {
                i5 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow2, i2);
            }
            i4 = i5;
        }
        int i7 = this.toFloatRange.isInside;
        int i8 = this.toFloatRange.getMin;
        onChildDetachedFromWindow onchilddetachedfromwindow3 = this.toFloatRange;
        if (onchilddetachedfromwindow3.ICustomTabsCallback == null) {
            onchilddetachedfromwindow3.ICustomTabsCallback = Orientation.HORIZONTAL;
        }
        if (onchilddetachedfromwindow3.ICustomTabsCallback != Orientation.HORIZONTAL) {
            i7 = i8;
        }
        int i9 = this.toFloatRange.getMax;
        int i10 = (i9 * 3) + i7;
        int i11 = i9 + i7;
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.IsOverlapping == null) {
            offsetpositionrecordsforinsert.IsOverlapping = new DropAnimation(offsetpositionrecordsforinsert.toFloatRange);
        }
        DropAnimation length2 = offsetpositionrecordsforinsert.IsOverlapping.setMax(j).length(i3, i4, i10, i11, i9);
        if (this.getMax) {
            length2.getMax(this.setMax);
        } else {
            length2.length();
        }
        this.setMin = length2;
    }

    private void toIntRange() {
        int i;
        int i2;
        int i3;
        if (this.toFloatRange.getMin()) {
            i = this.toFloatRange.getCause;
        } else {
            i = this.toFloatRange.b;
        }
        if (this.toFloatRange.getMin()) {
            i2 = this.toFloatRange.onNavigationEvent;
        } else {
            i2 = this.toFloatRange.getCause;
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = this.toFloatRange;
        int i4 = 0;
        if (onchilddetachedfromwindow == null) {
            i3 = 0;
        } else {
            if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i3 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow, i);
            } else {
                i3 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow, i);
            }
        }
        onChildDetachedFromWindow onchilddetachedfromwindow2 = this.toFloatRange;
        if (onchilddetachedfromwindow2 != null) {
            if (onchilddetachedfromwindow2.ICustomTabsCallback == null) {
                onchilddetachedfromwindow2.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow2.ICustomTabsCallback == Orientation.HORIZONTAL) {
                i4 = clearNestedRecyclerViewIfNotNested.getMax(onchilddetachedfromwindow2, i2);
            } else {
                i4 = clearNestedRecyclerViewIfNotNested.setMin(onchilddetachedfromwindow2, i2);
            }
        }
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.isInside == null) {
            offsetpositionrecordsforinsert.isInside = new findViewHolderForPosition(offsetpositionrecordsforinsert.toFloatRange);
        }
        invalidateItemDecorations length2 = offsetpositionrecordsforinsert.isInside.getMax(i3, i4).length(j);
        if (this.getMax) {
            length2.getMax(this.setMax);
        } else {
            length2.length();
        }
        this.setMin = length2;
    }

    private void toFloatRange() {
        int i = this.toFloatRange.hashCode;
        int i2 = this.toFloatRange.toString;
        int i3 = this.toFloatRange.getMax;
        float f = this.toFloatRange.equals;
        long j = this.toFloatRange.Grayscale$Algorithm;
        offsetPositionRecordsForInsert offsetpositionrecordsforinsert = this.length;
        if (offsetpositionrecordsforinsert.toIntRange == null) {
            offsetpositionrecordsforinsert.toIntRange = new getChildAdapterPosition(offsetpositionrecordsforinsert.toFloatRange);
        }
        invalidateItemDecorations length2 = offsetpositionrecordsforinsert.toIntRange.getMin(i2, i, i3, f).length(j);
        if (this.getMax) {
            length2.getMax(this.setMax);
        } else {
            length2.length();
        }
        this.setMin = length2;
    }
}
