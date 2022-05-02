package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import o.close;
import o.getNonActionItems;
import o.performIdentifierAction;
import o.performShortcut;

public class StaggeredGridLayoutManager extends RecyclerView.IsOverlapping implements RecyclerView.values.length {
    @NonNull
    private final performIdentifierAction FastBitmap$CoordinateSystem;
    private int Grayscale$Algorithm;
    private int[] ICustomTabsCallback;
    int IsOverlapping = Integer.MIN_VALUE;
    private final setMin Mean$Arithmetic = new setMin();
    private boolean b = true;
    private final Runnable create = new Runnable() {
        public final void run() {
            StaggeredGridLayoutManager.this.setMax();
        }
    };
    boolean equals = false;
    public boolean getMax = false;
    @NonNull
    close getMin;
    private int hashCode;
    private SavedState invoke;
    private final Rect invokeSuspend = new Rect();
    int isInside = -1;
    @NonNull
    close length;
    private boolean onNavigationEvent = false;
    public int setMax = -1;
    public getMax[] setMin;
    private BitSet toDoubleRange;
    private int toFloatRange;
    LazySpanLookup toIntRange = new LazySpanLookup();
    private int toString = 2;
    private boolean valueOf;
    private boolean values;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.IsOverlapping.setMax properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.setMax;
        if (i3 == 0 || i3 == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i3 != this.toFloatRange) {
                this.toFloatRange = i3;
                close close = this.getMin;
                this.getMin = this.length;
                this.length = close;
                requestLayout();
            }
            length(properties.getMax);
            setMax(properties.setMin);
            this.FastBitmap$CoordinateSystem = new performIdentifierAction();
            this.getMin = close.setMin(this, this.toFloatRange);
            this.length = close.setMin(this, 1 - this.toFloatRange);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public boolean isAutoMeasureEnabled() {
        return this.toString != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMax() {
        /*
            r7 = this;
            int r0 = r7.getChildCount()
            r1 = 0
            if (r0 == 0) goto L_0x00b8
            int r0 = r7.toString
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto L_0x0013
            goto L_0x00b8
        L_0x0013:
            boolean r0 = r7.equals
            r2 = 1
            if (r0 == 0) goto L_0x003a
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L_0x0020
            r0 = 0
            goto L_0x0029
        L_0x0020:
            int r0 = r0 - r2
            android.view.View r0 = r7.getChildAt(r0)
            int r0 = r7.getPosition(r0)
        L_0x0029:
            int r3 = r7.getChildCount()
            if (r3 != 0) goto L_0x0031
        L_0x002f:
            r3 = 0
            goto L_0x005a
        L_0x0031:
            android.view.View r3 = r7.getChildAt(r1)
            int r3 = r7.getPosition(r3)
            goto L_0x005a
        L_0x003a:
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L_0x0042
            r0 = 0
            goto L_0x004a
        L_0x0042:
            android.view.View r0 = r7.getChildAt(r1)
            int r0 = r7.getPosition(r0)
        L_0x004a:
            int r3 = r7.getChildCount()
            if (r3 != 0) goto L_0x0051
            goto L_0x002f
        L_0x0051:
            int r3 = r3 - r2
            android.view.View r3 = r7.getChildAt(r3)
            int r3 = r7.getPosition(r3)
        L_0x005a:
            r4 = -1
            if (r0 != 0) goto L_0x0078
            android.view.View r5 = r7.getMin()
            if (r5 == 0) goto L_0x0078
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.toIntRange
            int[] r1 = r0.setMax
            if (r1 == 0) goto L_0x006e
            int[] r1 = r0.setMax
            java.util.Arrays.fill(r1, r4)
        L_0x006e:
            r1 = 0
            r0.getMin = r1
            r7.requestSimpleAnimationsInNextLayout()
            r7.requestLayout()
            return r2
        L_0x0078:
            boolean r5 = r7.onNavigationEvent
            if (r5 != 0) goto L_0x007d
            return r1
        L_0x007d:
            boolean r5 = r7.equals
            if (r5 == 0) goto L_0x0083
            r5 = -1
            goto L_0x0084
        L_0x0083:
            r5 = 1
        L_0x0084:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r7.toIntRange
            int r3 = r3 + r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r6 = r6.length(r0, r3, r5)
            if (r6 != 0) goto L_0x0095
            r7.onNavigationEvent = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.toIntRange
            r0.setMax(r3)
            return r1
        L_0x0095:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r7.toIntRange
            int r3 = r6.setMin
            int r5 = r5 * -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.length(r0, r3, r5)
            if (r0 != 0) goto L_0x00a9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.toIntRange
            int r1 = r6.setMin
            r0.setMax(r1)
            goto L_0x00b1
        L_0x00a9:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r7.toIntRange
            int r0 = r0.setMin
            int r0 = r0 + r2
            r1.setMax(r0)
        L_0x00b1:
            r7.requestSimpleAnimationsInNextLayout()
            r7.requestLayout()
            return r2
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setMax():boolean");
    }

    public void onScrollStateChanged(int i) {
        if (i == 0) {
            setMax();
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.toDoubleRange todoublerange) {
        super.onDetachedFromWindow(recyclerView, todoublerange);
        removeCallbacks(this.create);
        for (int i = 0; i < this.setMax; i++) {
            getMax getmax = this.setMin[i];
            getmax.length.clear();
            getmax.setMin = Integer.MIN_VALUE;
            getmax.getMax = Integer.MIN_VALUE;
            getmax.setMax = 0;
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View getMin() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.setMax
            r2.<init>(r3)
            int r3 = r12.setMax
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.toFloatRange
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.getMax()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.equals
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00aa
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r9 = r8.setMin
            int r9 = r9.getMin
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r9 = r8.setMin
            boolean r9 = r12.setMax((androidx.recyclerview.widget.StaggeredGridLayoutManager.getMax) r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r9 = r8.setMin
            int r9 = r9.getMin
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.setMax
            if (r9 != 0) goto L_0x00a8
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a8
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.equals
            if (r10 == 0) goto L_0x0076
            o.close r10 = r12.getMin
            int r10 = r10.setMax((android.view.View) r7)
            o.close r11 = r12.getMin
            int r11 = r11.setMax((android.view.View) r9)
            if (r10 >= r11) goto L_0x0073
            return r7
        L_0x0073:
            if (r10 != r11) goto L_0x0089
            goto L_0x0087
        L_0x0076:
            o.close r10 = r12.getMin
            int r10 = r10.getMax((android.view.View) r7)
            o.close r11 = r12.getMin
            int r11 = r11.getMax((android.view.View) r9)
            if (r10 <= r11) goto L_0x0085
            return r7
        L_0x0085:
            if (r10 != r11) goto L_0x0089
        L_0x0087:
            r10 = 1
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            if (r10 == 0) goto L_0x00a8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r8 = r8.setMin
            int r8 = r8.getMin
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r9 = r9.setMin
            int r9 = r9.getMin
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x009f
            r8 = 1
            goto L_0x00a0
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r3 >= 0) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r8 == r9) goto L_0x00a8
            return r7
        L_0x00a8:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00aa:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.getMin():android.view.View");
    }

    private boolean setMax(getMax getmax) {
        int i;
        int i2;
        if (this.equals) {
            if (getmax.getMax != Integer.MIN_VALUE) {
                i2 = getmax.getMax;
            } else {
                getmax.getMin();
                i2 = getmax.getMax;
            }
            return i2 < this.getMin.setMax() && !((LayoutParams) getmax.length.get(getmax.length.size() - 1).getLayoutParams()).setMax;
        }
        if (getmax.setMin != Integer.MIN_VALUE) {
            i = getmax.setMin;
        } else {
            getmax.setMax();
            i = getmax.setMin;
        }
        return i > this.getMin.getMin() && !((LayoutParams) getmax.length.get(0).getLayoutParams()).setMax;
    }

    private void length(int i) {
        assertNotInLayoutOrScroll((String) null);
        if (i != this.setMax) {
            LazySpanLookup lazySpanLookup = this.toIntRange;
            if (lazySpanLookup.setMax != null) {
                Arrays.fill(lazySpanLookup.setMax, -1);
            }
            lazySpanLookup.getMin = null;
            requestLayout();
            this.setMax = i;
            this.toDoubleRange = new BitSet(this.setMax);
            this.setMin = new getMax[this.setMax];
            for (int i2 = 0; i2 < this.setMax; i2++) {
                this.setMin[i2] = new getMax(i2);
            }
            requestLayout();
        }
    }

    private void setMax(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        SavedState savedState = this.invoke;
        if (!(savedState == null || savedState.toIntRange == z)) {
            this.invoke.toIntRange = z;
        }
        this.getMax = z;
        requestLayout();
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.invoke == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    private void length() {
        boolean z = true;
        if (this.toFloatRange == 1 || !getMax()) {
            z = this.getMax;
        } else if (this.getMax) {
            z = false;
        }
        this.equals = z;
    }

    private boolean getMax() {
        return getLayoutDirection() == 1;
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.toFloatRange == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = chooseSize(i, (this.hashCode * this.setMax) + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = chooseSize(i2, (this.hashCode * this.setMax) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        LazySpanLookup lazySpanLookup = this.toIntRange;
        if (lazySpanLookup.setMax != null) {
            Arrays.fill(lazySpanLookup.setMax, -1);
        }
        lazySpanLookup.getMin = null;
        for (int i = 0; i < this.setMax; i++) {
            getMax getmax = this.setMin[i];
            getmax.length.clear();
            getmax.setMin = Integer.MIN_VALUE;
            getmax.getMax = Integer.MIN_VALUE;
            getmax.setMax = 0;
        }
    }

    public void onLayoutCompleted(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        super.onLayoutCompleted(recyclerView$Mean$Arithmetic);
        this.isInside = -1;
        this.IsOverlapping = Integer.MIN_VALUE;
        this.invoke = null;
        this.Mean$Arithmetic.setMin();
    }

    private boolean setMin(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, setMin setmin) {
        int i;
        int i2;
        int i3 = 0;
        if (!this.values) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount) {
                    int position = getPosition(getChildAt(i4));
                    if (position >= 0 && position < i) {
                        i3 = position;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        } else {
            if (recyclerView$Mean$Arithmetic.equals) {
                i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i2 = recyclerView$Mean$Arithmetic.setMin;
            }
            int childCount2 = getChildCount() - 1;
            while (true) {
                if (childCount2 >= 0) {
                    int position2 = getPosition(getChildAt(childCount2));
                    if (position2 >= 0 && position2 < i2) {
                        i3 = position2;
                        break;
                    }
                    childCount2--;
                } else {
                    break;
                }
            }
        }
        setmin.getMin = i3;
        setmin.setMin = Integer.MIN_VALUE;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean length(androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r6, androidx.recyclerview.widget.StaggeredGridLayoutManager.setMin r7) {
        /*
            r5 = this;
            boolean r0 = r6.setMax()
            r1 = 0
            if (r0 != 0) goto L_0x012d
            int r0 = r5.isInside
            r2 = -1
            if (r0 != r2) goto L_0x000e
            goto L_0x012d
        L_0x000e:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 < 0) goto L_0x0129
            boolean r4 = r6.equals
            if (r4 == 0) goto L_0x001c
            int r4 = r6.setMax
            int r6 = r6.getMax
            int r4 = r4 - r6
            goto L_0x001e
        L_0x001c:
            int r4 = r6.setMin
        L_0x001e:
            if (r0 < r4) goto L_0x0022
            goto L_0x0129
        L_0x0022:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r5.invoke
            r0 = 1
            if (r6 == 0) goto L_0x003a
            int r6 = r6.getMin
            if (r6 == r2) goto L_0x003a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r5.invoke
            int r6 = r6.setMin
            if (r6 > 0) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            r7.setMin = r3
            int r6 = r5.isInside
            r7.getMin = r6
            goto L_0x0128
        L_0x003a:
            int r6 = r5.isInside
            android.view.View r6 = r5.findViewByPosition(r6)
            if (r6 == 0) goto L_0x00e0
            boolean r2 = r5.equals
            if (r2 == 0) goto L_0x0057
            int r2 = r5.getChildCount()
            if (r2 != 0) goto L_0x004d
            goto L_0x0066
        L_0x004d:
            int r2 = r2 - r0
            android.view.View r1 = r5.getChildAt(r2)
            int r1 = r5.getPosition(r1)
            goto L_0x0066
        L_0x0057:
            int r2 = r5.getChildCount()
            if (r2 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            android.view.View r1 = r5.getChildAt(r1)
            int r1 = r5.getPosition(r1)
        L_0x0066:
            r7.getMin = r1
            int r1 = r5.IsOverlapping
            if (r1 == r3) goto L_0x0096
            boolean r1 = r7.getMax
            if (r1 == 0) goto L_0x0083
            o.close r1 = r5.getMin
            int r1 = r1.setMax()
            int r2 = r5.IsOverlapping
            int r1 = r1 - r2
            o.close r2 = r5.getMin
            int r6 = r2.setMax((android.view.View) r6)
            int r1 = r1 - r6
            r7.setMin = r1
            goto L_0x0095
        L_0x0083:
            o.close r1 = r5.getMin
            int r1 = r1.getMin()
            int r2 = r5.IsOverlapping
            int r1 = r1 + r2
            o.close r2 = r5.getMin
            int r6 = r2.getMax((android.view.View) r6)
            int r1 = r1 - r6
            r7.setMin = r1
        L_0x0095:
            return r0
        L_0x0096:
            o.close r1 = r5.getMin
            int r1 = r1.setMin(r6)
            o.close r2 = r5.getMin
            int r2 = r2.setMin()
            if (r1 <= r2) goto L_0x00b8
            boolean r6 = r7.getMax
            if (r6 == 0) goto L_0x00af
            o.close r6 = r5.getMin
            int r6 = r6.setMax()
            goto L_0x00b5
        L_0x00af:
            o.close r6 = r5.getMin
            int r6 = r6.getMin()
        L_0x00b5:
            r7.setMin = r6
            return r0
        L_0x00b8:
            o.close r1 = r5.getMin
            int r1 = r1.getMax((android.view.View) r6)
            o.close r2 = r5.getMin
            int r2 = r2.getMin()
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x00cb
            int r6 = -r1
            r7.setMin = r6
            return r0
        L_0x00cb:
            o.close r1 = r5.getMin
            int r1 = r1.setMax()
            o.close r2 = r5.getMin
            int r6 = r2.setMax((android.view.View) r6)
            int r1 = r1 - r6
            if (r1 >= 0) goto L_0x00dd
            r7.setMin = r1
            return r0
        L_0x00dd:
            r7.setMin = r3
            goto L_0x0128
        L_0x00e0:
            int r6 = r5.isInside
            r7.getMin = r6
            int r6 = r5.IsOverlapping
            if (r6 != r3) goto L_0x010b
            int r6 = r7.getMin
            int r6 = r5.isInside(r6)
            if (r6 != r0) goto L_0x00f1
            r1 = 1
        L_0x00f1:
            r7.getMax = r1
            boolean r6 = r7.getMax
            if (r6 == 0) goto L_0x0100
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.close r6 = r6.getMin
            int r6 = r6.setMax()
            goto L_0x0108
        L_0x0100:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.close r6 = r6.getMin
            int r6 = r6.getMin()
        L_0x0108:
            r7.setMin = r6
            goto L_0x0126
        L_0x010b:
            boolean r1 = r7.getMax
            if (r1 == 0) goto L_0x011b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.close r1 = r1.getMin
            int r1 = r1.setMax()
            int r1 = r1 - r6
            r7.setMin = r1
            goto L_0x0126
        L_0x011b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.close r1 = r1.getMin
            int r1 = r1.getMin()
            int r1 = r1 + r6
            r7.setMin = r1
        L_0x0126:
            r7.length = r0
        L_0x0128:
            return r0
        L_0x0129:
            r5.isInside = r2
            r5.IsOverlapping = r3
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.length(androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic, androidx.recyclerview.widget.StaggeredGridLayoutManager$setMin):boolean");
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.invoke == null;
    }

    public int computeHorizontalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return setMin(recyclerView$Mean$Arithmetic);
    }

    private int setMin(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getNonActionItems.setMax(recyclerView$Mean$Arithmetic, this.getMin, getMin(!this.b), length(!this.b), this, this.b, this.equals);
    }

    public int computeVerticalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return setMin(recyclerView$Mean$Arithmetic);
    }

    public int computeHorizontalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return length(recyclerView$Mean$Arithmetic);
    }

    private int length(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getNonActionItems.getMax(recyclerView$Mean$Arithmetic, this.getMin, getMin(!this.b), length(!this.b), this, this.b);
    }

    public int computeVerticalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return length(recyclerView$Mean$Arithmetic);
    }

    public int computeHorizontalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return setMax(recyclerView$Mean$Arithmetic);
    }

    private int setMax(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getNonActionItems.length(recyclerView$Mean$Arithmetic, this.getMin, getMin(!this.b), length(!this.b), this, this.b);
    }

    public int computeVerticalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return setMax(recyclerView$Mean$Arithmetic);
    }

    private void length(View view, LayoutParams layoutParams) {
        if (layoutParams.setMax) {
            if (this.toFloatRange == 1) {
                getMax(view, this.Grayscale$Algorithm, getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true));
            } else {
                getMax(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.Grayscale$Algorithm);
            }
        } else if (this.toFloatRange == 1) {
            getMax(view, getChildMeasureSpec(this.hashCode, getWidthMode(), 0, layoutParams.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true));
        } else {
            getMax(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), getChildMeasureSpec(this.hashCode, getHeightMode(), 0, layoutParams.height, false));
        }
    }

    private void getMax(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.invokeSuspend);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int max = getMax(i, layoutParams.leftMargin + this.invokeSuspend.left, layoutParams.rightMargin + this.invokeSuspend.right);
        int max2 = getMax(i2, layoutParams.topMargin + this.invokeSuspend.top, layoutParams.bottomMargin + this.invokeSuspend.bottom);
        if (shouldMeasureChild(view, max, max2, layoutParams)) {
            view.measure(max, max2);
        }
    }

    private static int getMax(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.invoke = savedState;
            if (this.isInside != -1) {
                savedState.getMax = null;
                savedState.setMin = 0;
                savedState.getMin = -1;
                savedState.length = -1;
                SavedState savedState2 = this.invoke;
                savedState2.getMax = null;
                savedState2.setMin = 0;
                savedState2.setMax = 0;
                savedState2.equals = null;
                savedState2.isInside = null;
            }
            requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r5 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r5.invoke
            if (r0 == 0) goto L_0x000c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r5.invoke
            r0.<init>((androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState) r1)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r0.<init>()
            boolean r1 = r5.getMax
            r0.toIntRange = r1
            boolean r1 = r5.values
            r0.IsOverlapping = r1
            boolean r1 = r5.valueOf
            r0.toFloatRange = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r5.toIntRange
            r2 = 0
            if (r1 == 0) goto L_0x0038
            int[] r1 = r1.setMax
            if (r1 == 0) goto L_0x0038
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r5.toIntRange
            int[] r1 = r1.setMax
            r0.equals = r1
            int[] r1 = r0.equals
            int r1 = r1.length
            r0.setMax = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r5.toIntRange
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r1.getMin
            r0.isInside = r1
            goto L_0x003a
        L_0x0038:
            r0.setMax = r2
        L_0x003a:
            int r1 = r5.getChildCount()
            r3 = -1
            if (r1 <= 0) goto L_0x00bc
            boolean r1 = r5.values
            r4 = 1
            if (r1 == 0) goto L_0x0057
            int r1 = r5.getChildCount()
            if (r1 != 0) goto L_0x004d
            goto L_0x005d
        L_0x004d:
            int r1 = r1 - r4
            android.view.View r1 = r5.getChildAt(r1)
            int r1 = r5.getPosition(r1)
            goto L_0x0067
        L_0x0057:
            int r1 = r5.getChildCount()
            if (r1 != 0) goto L_0x005f
        L_0x005d:
            r1 = 0
            goto L_0x0067
        L_0x005f:
            android.view.View r1 = r5.getChildAt(r2)
            int r1 = r5.getPosition(r1)
        L_0x0067:
            r0.getMin = r1
            boolean r1 = r5.equals
            if (r1 == 0) goto L_0x0072
            android.view.View r1 = r5.length((boolean) r4)
            goto L_0x0076
        L_0x0072:
            android.view.View r1 = r5.getMin((boolean) r4)
        L_0x0076:
            if (r1 != 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            int r3 = r5.getPosition(r1)
        L_0x007d:
            r0.length = r3
            int r1 = r5.setMax
            r0.setMin = r1
            int r1 = r5.setMax
            int[] r1 = new int[r1]
            r0.getMax = r1
        L_0x0089:
            int r1 = r5.setMax
            if (r2 >= r1) goto L_0x00c2
            boolean r1 = r5.values
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x00a4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r1 = r5.setMin
            r1 = r1[r2]
            int r1 = r1.setMax(r3)
            if (r1 == r3) goto L_0x00b5
            o.close r3 = r5.getMin
            int r3 = r3.setMax()
            goto L_0x00b4
        L_0x00a4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r1 = r5.setMin
            r1 = r1[r2]
            int r1 = r1.getMin((int) r3)
            if (r1 == r3) goto L_0x00b5
            o.close r3 = r5.getMin
            int r3 = r3.getMin()
        L_0x00b4:
            int r1 = r1 - r3
        L_0x00b5:
            int[] r3 = r0.getMax
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0089
        L_0x00bc:
            r0.getMin = r3
            r0.length = r3
            r0.setMin = r2
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onSaveInstanceState():android.os.Parcelable");
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View min = getMin(false);
            View length2 = length(false);
            if (min != null && length2 != null) {
                int position = getPosition(min);
                int position2 = getPosition(length2);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    private View getMin(boolean z) {
        int min = this.getMin.getMin();
        int max = this.getMin.setMax();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int max2 = this.getMin.getMax(childAt);
            if (this.getMin.setMax(childAt) > min && max2 < max) {
                if (max2 >= min || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View length(boolean z) {
        int min = this.getMin.getMin();
        int max = this.getMin.setMax();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int max2 = this.getMin.getMax(childAt);
            int max3 = this.getMin.setMax(childAt);
            if (max3 > min && max2 < max) {
                if (max3 <= max || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private void setMax(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z) {
        int max;
        int floatRange = toFloatRange(Integer.MIN_VALUE);
        if (floatRange != Integer.MIN_VALUE && (max = this.getMin.setMax() - floatRange) > 0) {
            int i = max - (-setMax(-max, todoublerange, recyclerView$Mean$Arithmetic));
            if (z && i > 0) {
                this.getMin.getMin(i);
            }
        }
    }

    private void length(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z) {
        int min;
        int intRange = toIntRange(Integer.MAX_VALUE);
        if (intRange != Integer.MAX_VALUE && (min = intRange - this.getMin.getMin()) > 0) {
            int max = min - setMax(min, todoublerange, recyclerView$Mean$Arithmetic);
            if (z && max > 0) {
                this.getMin.getMin(-max);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(int r5, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r6) {
        /*
            r4 = this;
            o.performIdentifierAction r0 = r4.FastBitmap$CoordinateSystem
            r1 = 0
            r0.getMin = r1
            o.performIdentifierAction r0 = r4.FastBitmap$CoordinateSystem
            r0.setMax = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.getMin
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.equals
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            o.close r5 = r4.getMin
            int r5 = r5.setMin()
            goto L_0x002f
        L_0x0025:
            o.close r5 = r4.getMin
            int r5 = r5.setMin()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L_0x004d
            o.performIdentifierAction r0 = r4.FastBitmap$CoordinateSystem
            o.close r3 = r4.getMin
            int r3 = r3.getMin()
            int r3 = r3 - r6
            r0.IsOverlapping = r3
            o.performIdentifierAction r6 = r4.FastBitmap$CoordinateSystem
            o.close r0 = r4.getMin
            int r0 = r0.setMax()
            int r0 = r0 + r5
            r6.equals = r0
            goto L_0x005d
        L_0x004d:
            o.performIdentifierAction r0 = r4.FastBitmap$CoordinateSystem
            o.close r3 = r4.getMin
            int r3 = r3.getMax()
            int r3 = r3 + r5
            r0.equals = r3
            o.performIdentifierAction r5 = r4.FastBitmap$CoordinateSystem
            int r6 = -r6
            r5.IsOverlapping = r6
        L_0x005d:
            o.performIdentifierAction r5 = r4.FastBitmap$CoordinateSystem
            r5.toIntRange = r1
            o.performIdentifierAction r5 = r4.FastBitmap$CoordinateSystem
            r5.length = r2
            o.performIdentifierAction r5 = r4.FastBitmap$CoordinateSystem
            o.close r6 = r4.getMin
            int r6 = r6.toFloatRange()
            if (r6 != 0) goto L_0x0078
            o.close r6 = r4.getMin
            int r6 = r6.getMax()
            if (r6 != 0) goto L_0x0078
            r1 = 1
        L_0x0078:
            r5.isInside = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setMax(int, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):void");
    }

    private void getMin(int i) {
        this.FastBitmap$CoordinateSystem.getMax = i;
        performIdentifierAction performidentifieraction = this.FastBitmap$CoordinateSystem;
        int i2 = 1;
        if (this.equals != (i == -1)) {
            i2 = -1;
        }
        performidentifieraction.setMin = i2;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.setMax; i2++) {
            this.setMin[i2].setMin(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.setMax; i2++) {
            this.setMin[i2].setMin(i);
        }
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        length(i, i2, 2);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        length(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        LazySpanLookup lazySpanLookup = this.toIntRange;
        if (lazySpanLookup.setMax != null) {
            Arrays.fill(lazySpanLookup.setMax, -1);
        }
        lazySpanLookup.getMin = null;
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        length(i, i2, 8);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        length(i, i2, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void length(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.equals
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L_0x000d
            goto L_0x001d
        L_0x000d:
            int r0 = r0 - r2
            android.view.View r0 = r7.getChildAt(r0)
            int r0 = r7.getPosition(r0)
            goto L_0x0027
        L_0x0017:
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0027
        L_0x001f:
            android.view.View r0 = r7.getChildAt(r1)
            int r0 = r7.getPosition(r0)
        L_0x0027:
            r3 = 8
            if (r10 != r3) goto L_0x0034
            if (r8 >= r9) goto L_0x0030
            int r4 = r9 + 1
            goto L_0x0036
        L_0x0030:
            int r4 = r8 + 1
            r5 = r9
            goto L_0x0037
        L_0x0034:
            int r4 = r8 + r9
        L_0x0036:
            r5 = r8
        L_0x0037:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r7.toIntRange
            r6.setMin(r5)
            if (r10 == r2) goto L_0x0055
            r6 = 2
            if (r10 == r6) goto L_0x004f
            if (r10 == r3) goto L_0x0044
            goto L_0x005a
        L_0x0044:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r10 = r7.toIntRange
            r10.length(r8, r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r7.toIntRange
            r8.setMax(r9, r2)
            goto L_0x005a
        L_0x004f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r10 = r7.toIntRange
            r10.length(r8, r9)
            goto L_0x005a
        L_0x0055:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r10 = r7.toIntRange
            r10.setMax(r8, r9)
        L_0x005a:
            if (r4 > r0) goto L_0x005d
            return
        L_0x005d:
            boolean r8 = r7.equals
            if (r8 == 0) goto L_0x0071
            int r8 = r7.getChildCount()
            if (r8 != 0) goto L_0x0068
            goto L_0x0081
        L_0x0068:
            android.view.View r8 = r7.getChildAt(r1)
            int r1 = r7.getPosition(r8)
            goto L_0x0081
        L_0x0071:
            int r8 = r7.getChildCount()
            if (r8 != 0) goto L_0x0078
            goto L_0x0081
        L_0x0078:
            int r8 = r8 - r2
            android.view.View r8 = r7.getChildAt(r8)
            int r1 = r7.getPosition(r8)
        L_0x0081:
            if (r5 > r1) goto L_0x0086
            r7.requestLayout()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.length(int, int, int):void");
    }

    private int getMax(RecyclerView.toDoubleRange todoublerange, performIdentifierAction performidentifieraction, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int i3;
        getMax getmax;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        RecyclerView.toDoubleRange todoublerange2 = todoublerange;
        performIdentifierAction performidentifieraction2 = performidentifieraction;
        int i13 = 0;
        this.toDoubleRange.set(0, this.setMax, true);
        if (this.FastBitmap$CoordinateSystem.isInside) {
            i = performidentifieraction2.getMax == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (performidentifieraction2.getMax == 1) {
                i12 = performidentifieraction2.equals + performidentifieraction2.getMin;
            } else {
                i12 = performidentifieraction2.IsOverlapping - performidentifieraction2.getMin;
            }
            i = i12;
        }
        getMin(performidentifieraction2.getMax, i);
        if (this.equals) {
            i2 = this.getMin.setMax();
        } else {
            i2 = this.getMin.getMin();
        }
        int i14 = i2;
        boolean z2 = false;
        while (performidentifieraction.length(recyclerView$Mean$Arithmetic) && (this.FastBitmap$CoordinateSystem.isInside || !this.toDoubleRange.isEmpty())) {
            View max = todoublerange2.getMax(performidentifieraction2.setMax);
            performidentifieraction2.setMax += performidentifieraction2.setMin;
            LayoutParams layoutParams = (LayoutParams) max.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            LazySpanLookup lazySpanLookup = this.toIntRange;
            int i15 = (lazySpanLookup.setMax == null || viewLayoutPosition >= lazySpanLookup.setMax.length) ? -1 : lazySpanLookup.setMax[viewLayoutPosition];
            boolean z3 = i15 == -1;
            if (z3) {
                getmax = layoutParams.setMax ? this.setMin[i13] : setMin(performidentifieraction2);
                LazySpanLookup lazySpanLookup2 = this.toIntRange;
                lazySpanLookup2.length(viewLayoutPosition);
                lazySpanLookup2.setMax[viewLayoutPosition] = getmax.getMin;
            } else {
                getmax = this.setMin[i15];
            }
            getMax getmax2 = getmax;
            layoutParams.setMin = getmax2;
            if (performidentifieraction2.getMax == 1) {
                addView(max);
            } else {
                addView(max, i13);
            }
            length(max, layoutParams);
            if (performidentifieraction2.getMax == 1) {
                if (layoutParams.setMax) {
                    i11 = toFloatRange(i14);
                } else {
                    i11 = getmax2.setMax(i14);
                }
                int min = this.getMin.setMin(max) + i11;
                if (z3 && layoutParams.setMax) {
                    LazySpanLookup.FullSpanItem max2 = getMax(i11);
                    max2.setMax = -1;
                    max2.setMin = viewLayoutPosition;
                    this.toIntRange.length(max2);
                }
                i4 = min;
                i5 = i11;
            } else {
                if (layoutParams.setMax) {
                    i10 = toIntRange(i14);
                } else {
                    i10 = getmax2.getMin(i14);
                }
                i5 = i10 - this.getMin.setMin(max);
                if (z3 && layoutParams.setMax) {
                    LazySpanLookup.FullSpanItem min2 = setMin(i10);
                    min2.setMax = 1;
                    min2.setMin = viewLayoutPosition;
                    this.toIntRange.length(min2);
                }
                i4 = i10;
            }
            if (layoutParams.setMax && performidentifieraction2.setMin == -1) {
                if (!z3) {
                    if (performidentifieraction2.getMax == 1) {
                        z = setMin();
                    } else {
                        z = IsOverlapping();
                    }
                    if (!z) {
                        LazySpanLookup.FullSpanItem max3 = this.toIntRange.getMax(viewLayoutPosition);
                        if (max3 != null) {
                            max3.getMax = true;
                        }
                    }
                }
                this.onNavigationEvent = true;
            }
            getMax(max, layoutParams, performidentifieraction2);
            if (!getMax() || this.toFloatRange != 1) {
                if (layoutParams.setMax) {
                    i8 = this.length.getMin();
                } else {
                    i8 = (getmax2.getMin * this.hashCode) + this.length.getMin();
                }
                i7 = i8;
                i6 = this.length.setMin(max) + i8;
            } else {
                if (layoutParams.setMax) {
                    i9 = this.length.setMax();
                } else {
                    i9 = this.length.setMax() - (((this.setMax - 1) - getmax2.getMin) * this.hashCode);
                }
                i6 = i9;
                i7 = i9 - this.length.setMin(max);
            }
            if (this.toFloatRange == 1) {
                layoutDecoratedWithMargins(max, i7, i5, i6, i4);
            } else {
                layoutDecoratedWithMargins(max, i5, i7, i4, i6);
            }
            if (layoutParams.setMax) {
                getMin(this.FastBitmap$CoordinateSystem.getMax, i);
            } else {
                setMax(getmax2, this.FastBitmap$CoordinateSystem.getMax, i);
            }
            length(todoublerange2, this.FastBitmap$CoordinateSystem);
            if (this.FastBitmap$CoordinateSystem.toIntRange && max.hasFocusable()) {
                if (layoutParams.setMax) {
                    this.toDoubleRange.clear();
                } else {
                    this.toDoubleRange.set(getmax2.getMin, false);
                }
            }
            z2 = true;
            i13 = 0;
        }
        if (!z2) {
            length(todoublerange2, this.FastBitmap$CoordinateSystem);
        }
        if (this.FastBitmap$CoordinateSystem.getMax == -1) {
            i3 = this.getMin.getMin() - toIntRange(this.getMin.getMin());
        } else {
            i3 = toFloatRange(this.getMin.setMax()) - this.getMin.setMax();
        }
        if (i3 > 0) {
            return Math.min(performidentifieraction2.getMin, i3);
        }
        return 0;
    }

    private LazySpanLookup.FullSpanItem getMax(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.getMin = new int[this.setMax];
        for (int i2 = 0; i2 < this.setMax; i2++) {
            fullSpanItem.getMin[i2] = i - this.setMin[i2].setMax(i);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem setMin(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.getMin = new int[this.setMax];
        for (int i2 = 0; i2 < this.setMax; i2++) {
            fullSpanItem.getMin[i2] = this.setMin[i2].getMin(i) - i;
        }
        return fullSpanItem;
    }

    private void getMax(View view, LayoutParams layoutParams, performIdentifierAction performidentifieraction) {
        if (performidentifieraction.getMax == 1) {
            if (layoutParams.setMax) {
                for (int i = this.setMax - 1; i >= 0; i--) {
                    this.setMin[i].getMin(view);
                }
                return;
            }
            layoutParams.setMin.getMin(view);
        } else if (layoutParams.setMax) {
            for (int i2 = this.setMax - 1; i2 >= 0; i2--) {
                this.setMin[i2].getMax(view);
            }
        } else {
            layoutParams.setMin.getMax(view);
        }
    }

    private void length(RecyclerView.toDoubleRange todoublerange, performIdentifierAction performidentifieraction) {
        int i;
        int i2;
        if (performidentifieraction.length && !performidentifieraction.isInside) {
            if (performidentifieraction.getMin == 0) {
                if (performidentifieraction.getMax == -1) {
                    setMin(todoublerange, performidentifieraction.equals);
                } else {
                    getMin(todoublerange, performidentifieraction.IsOverlapping);
                }
            } else if (performidentifieraction.getMax == -1) {
                int max = performidentifieraction.IsOverlapping - setMax(performidentifieraction.IsOverlapping);
                if (max < 0) {
                    i2 = performidentifieraction.equals;
                } else {
                    i2 = performidentifieraction.equals - Math.min(max, performidentifieraction.getMin);
                }
                setMin(todoublerange, i2);
            } else {
                int equals2 = equals(performidentifieraction.equals) - performidentifieraction.equals;
                if (equals2 < 0) {
                    i = performidentifieraction.IsOverlapping;
                } else {
                    i = Math.min(equals2, performidentifieraction.getMin) + performidentifieraction.IsOverlapping;
                }
                getMin(todoublerange, i);
            }
        }
    }

    private void getMin(int i, int i2) {
        for (int i3 = 0; i3 < this.setMax; i3++) {
            if (!this.setMin[i3].length.isEmpty()) {
                setMax(this.setMin[i3], i, i2);
            }
        }
    }

    private int setMax(int i) {
        int min = this.setMin[0].getMin(i);
        for (int i2 = 1; i2 < this.setMax; i2++) {
            int min2 = this.setMin[i2].getMin(i);
            if (min2 > min) {
                min = min2;
            }
        }
        return min;
    }

    private int toIntRange(int i) {
        int min = this.setMin[0].getMin(i);
        for (int i2 = 1; i2 < this.setMax; i2++) {
            int min2 = this.setMin[i2].getMin(i);
            if (min2 < min) {
                min = min2;
            }
        }
        return min;
    }

    private boolean setMin() {
        int max = this.setMin[0].setMax(Integer.MIN_VALUE);
        for (int i = 1; i < this.setMax; i++) {
            if (this.setMin[i].setMax(Integer.MIN_VALUE) != max) {
                return false;
            }
        }
        return true;
    }

    private boolean IsOverlapping() {
        int min = this.setMin[0].getMin(Integer.MIN_VALUE);
        for (int i = 1; i < this.setMax; i++) {
            if (this.setMin[i].getMin(Integer.MIN_VALUE) != min) {
                return false;
            }
        }
        return true;
    }

    private int toFloatRange(int i) {
        int max = this.setMin[0].setMax(i);
        for (int i2 = 1; i2 < this.setMax; i2++) {
            int max2 = this.setMin[i2].setMax(i);
            if (max2 > max) {
                max = max2;
            }
        }
        return max;
    }

    private int equals(int i) {
        int max = this.setMin[0].setMax(i);
        for (int i2 = 1; i2 < this.setMax; i2++) {
            int max2 = this.setMin[i2].setMax(i);
            if (max2 < max) {
                max = max2;
            }
        }
        return max;
    }

    private void getMin(RecyclerView.toDoubleRange todoublerange, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.getMin.setMax(childAt) <= i && this.getMin.getMin(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.setMax) {
                    int i2 = 0;
                    while (i2 < this.setMax) {
                        if (this.setMin[i2].length.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.setMax; i3++) {
                        this.setMin[i3].getMax();
                    }
                } else if (layoutParams.setMin.length.size() != 1) {
                    layoutParams.setMin.getMax();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, todoublerange);
            } else {
                return;
            }
        }
    }

    private void setMin(RecyclerView.toDoubleRange todoublerange, int i) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (this.getMin.getMax(childAt) >= i && this.getMin.length(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.setMax) {
                    int i2 = 0;
                    while (i2 < this.setMax) {
                        if (this.setMin[i2].length.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.setMax; i3++) {
                        this.setMin[i3].setMin();
                    }
                } else if (layoutParams.setMin.length.size() != 1) {
                    layoutParams.setMin.setMin();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, todoublerange);
                childCount--;
            } else {
                return;
            }
        }
    }

    private boolean IsOverlapping(int i) {
        if (this.toFloatRange == 0) {
            return (i == -1) != this.equals;
        }
        return ((i == -1) == this.equals) == getMax();
    }

    private getMax setMin(performIdentifierAction performidentifieraction) {
        int i;
        int i2;
        int i3 = -1;
        if (IsOverlapping(performidentifieraction.getMax)) {
            i2 = this.setMax - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.setMax;
            i = 1;
        }
        getMax getmax = null;
        if (performidentifieraction.getMax == 1) {
            int i4 = Integer.MAX_VALUE;
            int min = this.getMin.getMin();
            while (i2 != i3) {
                getMax getmax2 = this.setMin[i2];
                int max = getmax2.setMax(min);
                if (max < i4) {
                    getmax = getmax2;
                    i4 = max;
                }
                i2 += i;
            }
            return getmax;
        }
        int i5 = Integer.MIN_VALUE;
        int max2 = this.getMin.setMax();
        while (i2 != i3) {
            getMax getmax3 = this.setMin[i2];
            int min2 = getmax3.getMin(max2);
            if (min2 > i5) {
                getmax = getmax3;
                i5 = min2;
            }
            i2 += i;
        }
        return getmax;
    }

    public boolean canScrollVertically() {
        return this.toFloatRange == 1;
    }

    public boolean canScrollHorizontally() {
        return this.toFloatRange == 0;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return setMax(i, todoublerange, recyclerView$Mean$Arithmetic);
    }

    public int scrollVerticallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return setMax(i, todoublerange, recyclerView$Mean$Arithmetic);
    }

    private int isInside(int i) {
        int i2;
        if (getChildCount() == 0) {
            return this.equals ? 1 : -1;
        }
        boolean z = false;
        if (getChildCount() == 0) {
            i2 = 0;
        } else {
            i2 = getPosition(getChildAt(0));
        }
        if (i < i2) {
            z = true;
        }
        return z != this.equals ? -1 : 1;
    }

    public PointF computeScrollVectorForPosition(int i) {
        int isInside2 = isInside(i);
        PointF pointF = new PointF();
        if (isInside2 == 0) {
            return null;
        }
        if (this.toFloatRange == 0) {
            pointF.x = (float) isInside2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) isInside2;
        }
        return pointF;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        performShortcut performshortcut = new performShortcut(recyclerView.getContext());
        performshortcut.setTargetPosition(i);
        startSmoothScroll(performshortcut);
    }

    public void scrollToPosition(int i) {
        SavedState savedState = this.invoke;
        if (!(savedState == null || savedState.getMin == i)) {
            SavedState savedState2 = this.invoke;
            savedState2.getMax = null;
            savedState2.setMin = 0;
            savedState2.getMin = -1;
            savedState2.length = -1;
        }
        this.isInside = i;
        this.IsOverlapping = Integer.MIN_VALUE;
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, RecyclerView.IsOverlapping.getMax getmax) {
        int i3;
        int i4;
        if (this.toFloatRange != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            length(i, recyclerView$Mean$Arithmetic);
            int[] iArr = this.ICustomTabsCallback;
            if (iArr == null || iArr.length < this.setMax) {
                this.ICustomTabsCallback = new int[this.setMax];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.setMax; i6++) {
                if (this.FastBitmap$CoordinateSystem.setMin == -1) {
                    i4 = this.FastBitmap$CoordinateSystem.IsOverlapping;
                    i3 = this.setMin[i6].getMin(this.FastBitmap$CoordinateSystem.IsOverlapping);
                } else {
                    i4 = this.setMin[i6].setMax(this.FastBitmap$CoordinateSystem.equals);
                    i3 = this.FastBitmap$CoordinateSystem.equals;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.ICustomTabsCallback[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.ICustomTabsCallback, 0, i5);
            for (int i8 = 0; i8 < i5 && this.FastBitmap$CoordinateSystem.length(recyclerView$Mean$Arithmetic); i8++) {
                getmax.length(this.FastBitmap$CoordinateSystem.setMax, this.ICustomTabsCallback[i8]);
                this.FastBitmap$CoordinateSystem.setMax += this.FastBitmap$CoordinateSystem.setMin;
            }
        }
    }

    private int setMax(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        length(i, recyclerView$Mean$Arithmetic);
        int max = getMax(todoublerange, this.FastBitmap$CoordinateSystem, recyclerView$Mean$Arithmetic);
        if (this.FastBitmap$CoordinateSystem.getMin >= max) {
            i = i < 0 ? -max : max;
        }
        this.getMin.getMin(-i);
        this.values = this.equals;
        this.FastBitmap$CoordinateSystem.getMin = 0;
        length(todoublerange, this.FastBitmap$CoordinateSystem);
        return i;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.toFloatRange == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r10.toFloatRange == 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r10.toFloatRange == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (getMax() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (getMax() == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0148 A[LOOP:3: B:100:0x0148->B:109:0x0168, LOOP_START, PHI: r5 
      PHI: (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:87:0x011e, B:109:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0120  */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r11, int r12, androidx.recyclerview.widget.RecyclerView.toDoubleRange r13, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r14) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r11 = r10.findContainingItemView(r11)
            if (r11 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r10.length()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r12 == r3) goto L_0x004f
            r4 = 2
            if (r12 == r4) goto L_0x0042
            r4 = 17
            if (r12 == r4) goto L_0x003d
            r4 = 33
            if (r12 == r4) goto L_0x0038
            r4 = 66
            if (r12 == r4) goto L_0x0033
            r4 = 130(0x82, float:1.82E-43)
            if (r12 == r4) goto L_0x002e
        L_0x002b:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005c
        L_0x002e:
            int r12 = r10.toFloatRange
            if (r12 != r3) goto L_0x002b
            goto L_0x0046
        L_0x0033:
            int r12 = r10.toFloatRange
            if (r12 != 0) goto L_0x002b
            goto L_0x0046
        L_0x0038:
            int r12 = r10.toFloatRange
            if (r12 != r3) goto L_0x002b
            goto L_0x0053
        L_0x003d:
            int r12 = r10.toFloatRange
            if (r12 != 0) goto L_0x002b
            goto L_0x0053
        L_0x0042:
            int r12 = r10.toFloatRange
            if (r12 != r3) goto L_0x0048
        L_0x0046:
            r12 = 1
            goto L_0x005c
        L_0x0048:
            boolean r12 = r10.getMax()
            if (r12 == 0) goto L_0x0046
            goto L_0x0053
        L_0x004f:
            int r12 = r10.toFloatRange
            if (r12 != r3) goto L_0x0055
        L_0x0053:
            r12 = -1
            goto L_0x005c
        L_0x0055:
            boolean r12 = r10.getMax()
            if (r12 == 0) goto L_0x0053
            goto L_0x0046
        L_0x005c:
            if (r12 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            boolean r4 = r0.setMax
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r0 = r0.setMin
            r5 = 0
            if (r12 != r3) goto L_0x007e
            int r6 = r10.getChildCount()
            if (r6 != 0) goto L_0x0074
        L_0x0072:
            r6 = 0
            goto L_0x008d
        L_0x0074:
            int r6 = r6 - r3
            android.view.View r6 = r10.getChildAt(r6)
            int r6 = r10.getPosition(r6)
            goto L_0x008d
        L_0x007e:
            int r6 = r10.getChildCount()
            if (r6 != 0) goto L_0x0085
            goto L_0x0072
        L_0x0085:
            android.view.View r6 = r10.getChildAt(r5)
            int r6 = r10.getPosition(r6)
        L_0x008d:
            r10.setMax(r6, r14)
            r10.getMin((int) r12)
            o.performIdentifierAction r7 = r10.FastBitmap$CoordinateSystem
            int r8 = r7.setMin
            int r8 = r8 + r6
            r7.setMax = r8
            o.performIdentifierAction r7 = r10.FastBitmap$CoordinateSystem
            r8 = 1051372203(0x3eaaaaab, float:0.33333334)
            o.close r9 = r10.getMin
            int r9 = r9.setMin()
            float r9 = (float) r9
            float r9 = r9 * r8
            int r8 = (int) r9
            r7.getMin = r8
            o.performIdentifierAction r7 = r10.FastBitmap$CoordinateSystem
            r7.toIntRange = r3
            o.performIdentifierAction r7 = r10.FastBitmap$CoordinateSystem
            r7.length = r5
            o.performIdentifierAction r7 = r10.FastBitmap$CoordinateSystem
            r10.getMax((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (o.performIdentifierAction) r7, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14)
            boolean r13 = r10.equals
            r10.values = r13
            if (r4 != 0) goto L_0x00c7
            android.view.View r13 = r0.setMin(r6, r12)
            if (r13 == 0) goto L_0x00c7
            if (r13 == r11) goto L_0x00c7
            return r13
        L_0x00c7:
            boolean r13 = r10.IsOverlapping(r12)
            if (r13 == 0) goto L_0x00e2
            int r13 = r10.setMax
            int r13 = r13 - r3
        L_0x00d0:
            if (r13 < 0) goto L_0x00f7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r14 = r10.setMin
            r14 = r14[r13]
            android.view.View r14 = r14.setMin(r6, r12)
            if (r14 == 0) goto L_0x00df
            if (r14 == r11) goto L_0x00df
            return r14
        L_0x00df:
            int r13 = r13 + -1
            goto L_0x00d0
        L_0x00e2:
            r13 = 0
        L_0x00e3:
            int r14 = r10.setMax
            if (r13 >= r14) goto L_0x00f7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r14 = r10.setMin
            r14 = r14[r13]
            android.view.View r14 = r14.setMin(r6, r12)
            if (r14 == 0) goto L_0x00f4
            if (r14 == r11) goto L_0x00f4
            return r14
        L_0x00f4:
            int r13 = r13 + 1
            goto L_0x00e3
        L_0x00f7:
            boolean r13 = r10.getMax
            r13 = r13 ^ r3
            if (r12 != r2) goto L_0x00fe
            r14 = 1
            goto L_0x00ff
        L_0x00fe:
            r14 = 0
        L_0x00ff:
            if (r13 != r14) goto L_0x0103
            r13 = 1
            goto L_0x0104
        L_0x0103:
            r13 = 0
        L_0x0104:
            if (r4 != 0) goto L_0x011a
            if (r13 == 0) goto L_0x010d
            int r14 = r0.length()
            goto L_0x0111
        L_0x010d:
            int r14 = r0.toIntRange()
        L_0x0111:
            android.view.View r14 = r10.findViewByPosition(r14)
            if (r14 == 0) goto L_0x011a
            if (r14 == r11) goto L_0x011a
            return r14
        L_0x011a:
            boolean r12 = r10.IsOverlapping(r12)
            if (r12 == 0) goto L_0x0148
            int r12 = r10.setMax
            int r12 = r12 - r3
        L_0x0123:
            if (r12 < 0) goto L_0x016b
            int r14 = r0.getMin
            if (r12 == r14) goto L_0x0145
            if (r13 == 0) goto L_0x0134
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r14 = r10.setMin
            r14 = r14[r12]
            int r14 = r14.length()
            goto L_0x013c
        L_0x0134:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r14 = r10.setMin
            r14 = r14[r12]
            int r14 = r14.toIntRange()
        L_0x013c:
            android.view.View r14 = r10.findViewByPosition(r14)
            if (r14 == 0) goto L_0x0145
            if (r14 == r11) goto L_0x0145
            return r14
        L_0x0145:
            int r12 = r12 + -1
            goto L_0x0123
        L_0x0148:
            int r12 = r10.setMax
            if (r5 >= r12) goto L_0x016b
            if (r13 == 0) goto L_0x0157
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r12 = r10.setMin
            r12 = r12[r5]
            int r12 = r12.length()
            goto L_0x015f
        L_0x0157:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r12 = r10.setMin
            r12 = r12[r5]
            int r12 = r12.toIntRange()
        L_0x015f:
            android.view.View r12 = r10.findViewByPosition(r12)
            if (r12 == 0) goto L_0x0168
            if (r12 == r11) goto L_0x0168
            return r12
        L_0x0168:
            int r5 = r5 + 1
            goto L_0x0148
        L_0x016b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$toDoubleRange, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):android.view.View");
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        boolean setMax;
        getMax setMin;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final boolean getMax() {
            return this.setMax;
        }
    }

    public class getMax {
        int getMax = Integer.MIN_VALUE;
        final int getMin;
        public ArrayList<View> length = new ArrayList<>();
        int setMax = 0;
        int setMin = Integer.MIN_VALUE;

        getMax(int i) {
            this.getMin = i;
        }

        /* access modifiers changed from: package-private */
        public final int getMin(int i) {
            int i2 = this.setMin;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.length.size() == 0) {
                return i;
            }
            setMax();
            return this.setMin;
        }

        /* access modifiers changed from: package-private */
        public final void setMax() {
            LazySpanLookup.FullSpanItem max;
            int i = 0;
            View view = this.length.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.setMin = StaggeredGridLayoutManager.this.getMin.getMax(view);
            if (layoutParams.setMax && (max = StaggeredGridLayoutManager.this.toIntRange.getMax(layoutParams.getViewLayoutPosition())) != null && max.setMax == -1) {
                int i2 = this.setMin;
                int i3 = this.getMin;
                if (max.getMin != null) {
                    i = max.getMin[i3];
                }
                this.setMin = i2 - i;
            }
        }

        /* access modifiers changed from: package-private */
        public final int setMax(int i) {
            int i2 = this.getMax;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.length.size() == 0) {
                return i;
            }
            getMin();
            return this.getMax;
        }

        /* access modifiers changed from: package-private */
        public final void getMin() {
            LazySpanLookup.FullSpanItem max;
            ArrayList<View> arrayList = this.length;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.getMax = StaggeredGridLayoutManager.this.getMin.setMax(view);
            if (layoutParams.setMax && (max = StaggeredGridLayoutManager.this.toIntRange.getMax(layoutParams.getViewLayoutPosition())) != null && max.setMax == 1) {
                this.getMax += max.getMin == null ? 0 : max.getMin[this.getMin];
            }
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            int size = this.length.size();
            View remove = this.length.remove(size - 1);
            LayoutParams layoutParams = (LayoutParams) remove.getLayoutParams();
            layoutParams.setMin = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.setMax -= StaggeredGridLayoutManager.this.getMin.setMin(remove);
            }
            if (size == 1) {
                this.setMin = Integer.MIN_VALUE;
            }
            this.getMax = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final void getMax() {
            View remove = this.length.remove(0);
            LayoutParams layoutParams = (LayoutParams) remove.getLayoutParams();
            layoutParams.setMin = null;
            if (this.length.size() == 0) {
                this.getMax = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.setMax -= StaggeredGridLayoutManager.this.getMin.setMin(remove);
            }
            this.setMin = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final void setMin(int i) {
            int i2 = this.setMin;
            if (i2 != Integer.MIN_VALUE) {
                this.setMin = i2 + i;
            }
            int i3 = this.getMax;
            if (i3 != Integer.MIN_VALUE) {
                this.getMax = i3 + i;
            }
        }

        public final int length() {
            if (StaggeredGridLayoutManager.this.getMax) {
                return getMax(this.length.size() - 1, -1, false, false, true);
            }
            return getMax(0, this.length.size(), false, false, true);
        }

        public final int toIntRange() {
            if (StaggeredGridLayoutManager.this.getMax) {
                return getMax(0, this.length.size(), false, false, true);
            }
            return getMax(this.length.size() - 1, -1, false, false, true);
        }

        private int getMax(int i, int i2, boolean z, boolean z2, boolean z3) {
            int min = StaggeredGridLayoutManager.this.getMin.getMin();
            int max = StaggeredGridLayoutManager.this.getMin.setMax();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.length.get(i);
                int max2 = StaggeredGridLayoutManager.this.getMin.getMax(view);
                int max3 = StaggeredGridLayoutManager.this.getMin.setMax(view);
                boolean z4 = false;
                boolean z5 = !z3 ? max2 < max : max2 <= max;
                if (!z3 ? max3 > min : max3 >= min) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (max2 < min || max3 > max) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (max2 >= min && max3 <= max) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        public final int length(int i, int i2) {
            return getMax(i, i2, true, true, false);
        }

        public final View setMin(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.length.size() - 1;
                while (size >= 0) {
                    View view2 = this.length.get(size);
                    if ((StaggeredGridLayoutManager.this.getMax && StaggeredGridLayoutManager.this.getPosition(view2) >= i) || ((!StaggeredGridLayoutManager.this.getMax && StaggeredGridLayoutManager.this.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.length.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.length.get(i3);
                    if ((StaggeredGridLayoutManager.this.getMax && StaggeredGridLayoutManager.this.getPosition(view3) <= i) || ((!StaggeredGridLayoutManager.this.getMax && StaggeredGridLayoutManager.this.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.setMin = this;
            this.length.add(0, view);
            this.setMin = Integer.MIN_VALUE;
            if (this.length.size() == 1) {
                this.getMax = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.setMax += StaggeredGridLayoutManager.this.getMin.setMin(view);
            }
        }

        /* access modifiers changed from: package-private */
        public final void getMin(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.setMin = this;
            this.length.add(view);
            this.getMax = Integer.MIN_VALUE;
            if (this.length.size() == 1) {
                this.setMin = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.setMax += StaggeredGridLayoutManager.this.getMin.setMin(view);
            }
        }
    }

    static class LazySpanLookup {
        List<FullSpanItem> getMin;
        int[] setMax;

        LazySpanLookup() {
        }

        /* access modifiers changed from: package-private */
        public final int setMax(int i) {
            List<FullSpanItem> list = this.getMin;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.getMin.get(size).setMin >= i) {
                        this.getMin.remove(size);
                    }
                }
            }
            return setMin(i);
        }

        /* access modifiers changed from: package-private */
        public final int setMin(int i) {
            int[] iArr = this.setMax;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int min = getMin(i);
            if (min == -1) {
                int[] iArr2 = this.setMax;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.setMax.length;
            }
            int min2 = Math.min(min + 1, this.setMax.length);
            Arrays.fill(this.setMax, i, min2, -1);
            return min2;
        }

        /* access modifiers changed from: package-private */
        public final void length(int i) {
            int[] iArr = this.setMax;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.setMax = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.setMax = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.setMax;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public final void length(int i, int i2) {
            int[] iArr = this.setMax;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                length(i3);
                int[] iArr2 = this.setMax;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.setMax;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                setMin(i, i2);
            }
        }

        private void setMin(int i, int i2) {
            List<FullSpanItem> list = this.getMin;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.getMin.get(size);
                    if (fullSpanItem.setMin >= i) {
                        if (fullSpanItem.setMin < i3) {
                            this.getMin.remove(size);
                        } else {
                            fullSpanItem.setMin -= i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void setMax(int i, int i2) {
            int[] iArr = this.setMax;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                length(i3);
                int[] iArr2 = this.setMax;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.setMax, i, i3, -1);
                getMin(i, i2);
            }
        }

        private void getMin(int i, int i2) {
            List<FullSpanItem> list = this.getMin;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.getMin.get(size);
                    if (fullSpanItem.setMin >= i) {
                        fullSpanItem.setMin += i2;
                    }
                }
            }
        }

        private int getMin(int i) {
            if (this.getMin == null) {
                return -1;
            }
            FullSpanItem max = getMax(i);
            if (max != null) {
                this.getMin.remove(max);
            }
            int size = this.getMin.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.getMin.get(i2).setMin >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.getMin.remove(i2);
            return this.getMin.get(i2).setMin;
        }

        public final void length(FullSpanItem fullSpanItem) {
            if (this.getMin == null) {
                this.getMin = new ArrayList();
            }
            int size = this.getMin.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.getMin.get(i);
                if (fullSpanItem2.setMin == fullSpanItem.setMin) {
                    this.getMin.remove(i);
                }
                if (fullSpanItem2.setMin >= fullSpanItem.setMin) {
                    this.getMin.add(i, fullSpanItem);
                    return;
                }
            }
            this.getMin.add(fullSpanItem);
        }

        public final FullSpanItem getMax(int i) {
            List<FullSpanItem> list = this.getMin;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.getMin.get(size);
                if (fullSpanItem.setMin == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final FullSpanItem length(int i, int i2, int i3) {
            List<FullSpanItem> list = this.getMin;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.getMin.get(i4);
                if (fullSpanItem.setMin >= i2) {
                    return null;
                }
                if (fullSpanItem.setMin >= i && (i3 == 0 || fullSpanItem.setMax == i3 || fullSpanItem.getMax)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new FullSpanItem[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }
            };
            boolean getMax;
            int[] getMin;
            int setMax;
            int setMin;

            public int describeContents() {
                return 0;
            }

            FullSpanItem(Parcel parcel) {
                this.setMin = parcel.readInt();
                this.setMax = parcel.readInt();
                this.getMax = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.getMin = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            FullSpanItem() {
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.setMin);
                parcel.writeInt(this.setMax);
                parcel.writeInt(this.getMax ? 1 : 0);
                int[] iArr = this.getMin;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.getMin);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.setMin);
                sb.append(", mGapDir=");
                sb.append(this.setMax);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.getMax);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.getMin));
                sb.append('}');
                return sb.toString();
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        boolean IsOverlapping;
        int[] equals;
        int[] getMax;
        int getMin;
        List<LazySpanLookup.FullSpanItem> isInside;
        int length;
        int setMax;
        int setMin;
        boolean toFloatRange;
        boolean toIntRange;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.getMin = parcel.readInt();
            this.length = parcel.readInt();
            int readInt = parcel.readInt();
            this.setMin = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.getMax = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.setMax = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.equals = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.toIntRange = parcel.readInt() == 1;
            this.IsOverlapping = parcel.readInt() == 1;
            this.toFloatRange = parcel.readInt() == 1 ? true : z;
            this.isInside = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.setMin = savedState.setMin;
            this.getMin = savedState.getMin;
            this.length = savedState.length;
            this.getMax = savedState.getMax;
            this.setMax = savedState.setMax;
            this.equals = savedState.equals;
            this.toIntRange = savedState.toIntRange;
            this.IsOverlapping = savedState.IsOverlapping;
            this.toFloatRange = savedState.toFloatRange;
            this.isInside = savedState.isInside;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.getMin);
            parcel.writeInt(this.length);
            parcel.writeInt(this.setMin);
            if (this.setMin > 0) {
                parcel.writeIntArray(this.getMax);
            }
            parcel.writeInt(this.setMax);
            if (this.setMax > 0) {
                parcel.writeIntArray(this.equals);
            }
            parcel.writeInt(this.toIntRange ? 1 : 0);
            parcel.writeInt(this.IsOverlapping ? 1 : 0);
            parcel.writeInt(this.toFloatRange ? 1 : 0);
            parcel.writeList(this.isInside);
        }
    }

    class setMin {
        int[] equals;
        boolean getMax;
        int getMin;
        boolean length;
        boolean setMax;
        int setMin;

        setMin() {
            setMin();
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            this.getMin = -1;
            this.setMin = Integer.MIN_VALUE;
            this.getMax = false;
            this.length = false;
            this.setMax = false;
            int[] iArr = this.equals;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:173:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0360 A[LOOP:0: B:1:0x0003->B:176:0x0360, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0368 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.toDoubleRange r13, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r14) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            r2 = 1
        L_0x0003:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setMin r3 = r12.Mean$Arithmetic
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r4 = r12.invoke
            r5 = -1
            if (r4 != 0) goto L_0x000e
            int r4 = r12.isInside
            if (r4 == r5) goto L_0x0023
        L_0x000e:
            boolean r4 = r14.equals
            if (r4 == 0) goto L_0x0018
            int r4 = r14.setMax
            int r6 = r14.getMax
            int r4 = r4 - r6
            goto L_0x001a
        L_0x0018:
            int r4 = r14.setMin
        L_0x001a:
            if (r4 != 0) goto L_0x0023
            r12.removeAndRecycleAllViews(r13)
            r3.setMin()
            return
        L_0x0023:
            boolean r4 = r3.setMax
            if (r4 == 0) goto L_0x0032
            int r4 = r12.isInside
            if (r4 != r5) goto L_0x0032
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r4 = r12.invoke
            if (r4 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = 0
            goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L_0x00e8
            r3.setMin()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            if (r8 == 0) goto L_0x00d6
            int r8 = r8.setMin
            if (r8 <= 0) goto L_0x0098
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            int r8 = r8.setMin
            int r9 = r12.setMax
            if (r8 != r9) goto L_0x0086
            r8 = 0
        L_0x004c:
            int r9 = r12.setMax
            if (r8 >= r9) goto L_0x0098
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r9 = r12.setMin
            r9 = r9[r8]
            java.util.ArrayList<android.view.View> r10 = r9.length
            r10.clear()
            r9.setMin = r7
            r9.getMax = r7
            r9.setMax = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r9 = r12.invoke
            int[] r9 = r9.getMax
            r9 = r9[r8]
            if (r9 == r7) goto L_0x007b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r10 = r12.invoke
            boolean r10 = r10.IsOverlapping
            if (r10 == 0) goto L_0x0074
            o.close r10 = r12.getMin
            int r10 = r10.setMax()
            goto L_0x007a
        L_0x0074:
            o.close r10 = r12.getMin
            int r10 = r10.getMin()
        L_0x007a:
            int r9 = r9 + r10
        L_0x007b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r10 = r12.setMin
            r10 = r10[r8]
            r10.setMin = r9
            r10.getMax = r9
            int r8 = r8 + 1
            goto L_0x004c
        L_0x0086:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            r8.getMax = r6
            r8.setMin = r0
            r8.setMax = r0
            r8.equals = r6
            r8.isInside = r6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            int r9 = r8.length
            r8.getMin = r9
        L_0x0098:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            boolean r8 = r8.toFloatRange
            r12.valueOf = r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            boolean r8 = r8.toIntRange
            r12.setMax((boolean) r8)
            r12.length()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            int r8 = r8.getMin
            if (r8 == r5) goto L_0x00bb
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            int r8 = r8.getMin
            r12.isInside = r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            boolean r8 = r8.IsOverlapping
            r3.getMax = r8
            goto L_0x00bf
        L_0x00bb:
            boolean r8 = r12.equals
            r3.getMax = r8
        L_0x00bf:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            int r8 = r8.setMax
            if (r8 <= r1) goto L_0x00dd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r12.toIntRange
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r9 = r12.invoke
            int[] r9 = r9.equals
            r8.setMax = r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r12.toIntRange
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r9 = r12.invoke
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r9 = r9.isInside
            r8.getMin = r9
            goto L_0x00dd
        L_0x00d6:
            r12.length()
            boolean r8 = r12.equals
            r3.getMax = r8
        L_0x00dd:
            boolean r8 = r12.length((androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14, (androidx.recyclerview.widget.StaggeredGridLayoutManager.setMin) r3)
            if (r8 != 0) goto L_0x00e6
            r12.setMin((androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14, (androidx.recyclerview.widget.StaggeredGridLayoutManager.setMin) r3)
        L_0x00e6:
            r3.setMax = r1
        L_0x00e8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r12.invoke
            if (r8 != 0) goto L_0x010d
            int r8 = r12.isInside
            if (r8 != r5) goto L_0x010d
            boolean r8 = r3.getMax
            boolean r9 = r12.values
            if (r8 != r9) goto L_0x00fe
            boolean r8 = r12.getMax()
            boolean r9 = r12.valueOf
            if (r8 == r9) goto L_0x010d
        L_0x00fe:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r12.toIntRange
            int[] r9 = r8.setMax
            if (r9 == 0) goto L_0x0109
            int[] r9 = r8.setMax
            java.util.Arrays.fill(r9, r5)
        L_0x0109:
            r8.getMin = r6
            r3.length = r1
        L_0x010d:
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x01dd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r12.invoke
            if (r6 == 0) goto L_0x011b
            int r6 = r6.setMin
            if (r6 > 0) goto L_0x01dd
        L_0x011b:
            boolean r6 = r3.length
            if (r6 == 0) goto L_0x0144
            r4 = 0
        L_0x0120:
            int r6 = r12.setMax
            if (r4 >= r6) goto L_0x01dd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r6 = r12.setMin
            r6 = r6[r4]
            java.util.ArrayList<android.view.View> r8 = r6.length
            r8.clear()
            r6.setMin = r7
            r6.getMax = r7
            r6.setMax = r0
            int r6 = r3.setMin
            if (r6 == r7) goto L_0x0141
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r6 = r12.setMin
            r6 = r6[r4]
            int r8 = r3.setMin
            r6.setMin = r8
            r6.getMax = r8
        L_0x0141:
            int r4 = r4 + 1
            goto L_0x0120
        L_0x0144:
            if (r4 != 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setMin r4 = r12.Mean$Arithmetic
            int[] r4 = r4.equals
            if (r4 != 0) goto L_0x014d
            goto L_0x016e
        L_0x014d:
            r4 = 0
        L_0x014e:
            int r6 = r12.setMax
            if (r4 >= r6) goto L_0x01dd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r6 = r12.setMin
            r6 = r6[r4]
            java.util.ArrayList<android.view.View> r8 = r6.length
            r8.clear()
            r6.setMin = r7
            r6.getMax = r7
            r6.setMax = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setMin r8 = r12.Mean$Arithmetic
            int[] r8 = r8.equals
            r8 = r8[r4]
            r6.setMin = r8
            r6.getMax = r8
            int r4 = r4 + 1
            goto L_0x014e
        L_0x016e:
            r4 = 0
        L_0x016f:
            int r6 = r12.setMax
            if (r4 >= r6) goto L_0x01b6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r6 = r12.setMin
            r6 = r6[r4]
            boolean r8 = r12.equals
            int r9 = r3.setMin
            if (r8 == 0) goto L_0x0182
            int r10 = r6.setMax(r7)
            goto L_0x0186
        L_0x0182:
            int r10 = r6.getMin((int) r7)
        L_0x0186:
            java.util.ArrayList<android.view.View> r11 = r6.length
            r11.clear()
            r6.setMin = r7
            r6.getMax = r7
            r6.setMax = r0
            if (r10 == r7) goto L_0x01b3
            if (r8 == 0) goto L_0x019f
            androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.close r11 = r11.getMin
            int r11 = r11.setMax()
            if (r10 < r11) goto L_0x01b3
        L_0x019f:
            if (r8 != 0) goto L_0x01ac
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.close r8 = r8.getMin
            int r8 = r8.getMin()
            if (r10 <= r8) goto L_0x01ac
            goto L_0x01b3
        L_0x01ac:
            if (r9 == r7) goto L_0x01af
            int r10 = r10 + r9
        L_0x01af:
            r6.getMax = r10
            r6.setMin = r10
        L_0x01b3:
            int r4 = r4 + 1
            goto L_0x016f
        L_0x01b6:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setMin r4 = r12.Mean$Arithmetic
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r6 = r12.setMin
            int r8 = r6.length
            int[] r9 = r4.equals
            if (r9 == 0) goto L_0x01c4
            int[] r9 = r4.equals
            int r9 = r9.length
            if (r9 >= r8) goto L_0x01cd
        L_0x01c4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r9 = r9.setMin
            int r9 = r9.length
            int[] r9 = new int[r9]
            r4.equals = r9
        L_0x01cd:
            r9 = 0
        L_0x01ce:
            if (r9 >= r8) goto L_0x01dd
            int[] r10 = r4.equals
            r11 = r6[r9]
            int r11 = r11.getMin((int) r7)
            r10[r9] = r11
            int r9 = r9 + 1
            goto L_0x01ce
        L_0x01dd:
            r12.detachAndScrapAttachedViews(r13)
            o.performIdentifierAction r4 = r12.FastBitmap$CoordinateSystem
            r4.length = r0
            r12.onNavigationEvent = r0
            o.close r4 = r12.length
            int r4 = r4.setMin()
            int r6 = r12.setMax
            int r6 = r4 / r6
            r12.hashCode = r6
            o.close r6 = r12.length
            int r6 = r6.toFloatRange()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r12.Grayscale$Algorithm = r4
            int r4 = r3.getMin
            r12.setMax(r4, r14)
            boolean r4 = r3.getMax
            if (r4 == 0) goto L_0x0223
            r12.getMin((int) r5)
            o.performIdentifierAction r4 = r12.FastBitmap$CoordinateSystem
            r12.getMax((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (o.performIdentifierAction) r4, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14)
            r12.getMin((int) r1)
            o.performIdentifierAction r4 = r12.FastBitmap$CoordinateSystem
            int r5 = r3.getMin
            o.performIdentifierAction r6 = r12.FastBitmap$CoordinateSystem
            int r6 = r6.setMin
            int r5 = r5 + r6
            r4.setMax = r5
            o.performIdentifierAction r4 = r12.FastBitmap$CoordinateSystem
            r12.getMax((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (o.performIdentifierAction) r4, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14)
            goto L_0x023e
        L_0x0223:
            r12.getMin((int) r1)
            o.performIdentifierAction r4 = r12.FastBitmap$CoordinateSystem
            r12.getMax((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (o.performIdentifierAction) r4, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14)
            r12.getMin((int) r5)
            o.performIdentifierAction r4 = r12.FastBitmap$CoordinateSystem
            int r5 = r3.getMin
            o.performIdentifierAction r6 = r12.FastBitmap$CoordinateSystem
            int r6 = r6.setMin
            int r5 = r5 + r6
            r4.setMax = r5
            o.performIdentifierAction r4 = r12.FastBitmap$CoordinateSystem
            r12.getMax((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (o.performIdentifierAction) r4, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14)
        L_0x023e:
            o.close r4 = r12.length
            int r4 = r4.toFloatRange()
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 == r5) goto L_0x0303
            r4 = 0
            int r5 = r12.getChildCount()
            r6 = 0
        L_0x024e:
            if (r6 >= r5) goto L_0x027a
            android.view.View r8 = r12.getChildAt(r6)
            o.close r9 = r12.length
            int r9 = r9.setMin(r8)
            float r9 = (float) r9
            int r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0277
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            boolean r8 = r8.getMax()
            if (r8 == 0) goto L_0x0273
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r8
            int r8 = r12.setMax
            float r8 = (float) r8
            float r9 = r9 / r8
        L_0x0273:
            float r4 = java.lang.Math.max(r4, r9)
        L_0x0277:
            int r6 = r6 + 1
            goto L_0x024e
        L_0x027a:
            int r6 = r12.hashCode
            int r8 = r12.setMax
            float r8 = (float) r8
            float r4 = r4 * r8
            int r4 = java.lang.Math.round(r4)
            o.close r8 = r12.length
            int r8 = r8.toFloatRange()
            if (r8 != r7) goto L_0x0297
            o.close r7 = r12.length
            int r7 = r7.setMin()
            int r4 = java.lang.Math.min(r4, r7)
        L_0x0297:
            int r7 = r12.setMax
            int r7 = r4 / r7
            r12.hashCode = r7
            o.close r7 = r12.length
            int r7 = r7.toFloatRange()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7)
            r12.Grayscale$Algorithm = r4
            int r4 = r12.hashCode
            if (r4 == r6) goto L_0x0303
            r4 = 0
        L_0x02ae:
            if (r4 >= r5) goto L_0x0303
            android.view.View r7 = r12.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            boolean r9 = r8.setMax
            if (r9 != 0) goto L_0x0300
            boolean r9 = r12.getMax()
            if (r9 == 0) goto L_0x02e5
            int r9 = r12.toFloatRange
            if (r9 != r1) goto L_0x02e5
            int r9 = r12.setMax
            int r9 = r9 - r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r10 = r8.setMin
            int r10 = r10.getMin
            int r9 = r9 - r10
            int r9 = -r9
            int r10 = r12.hashCode
            int r9 = r9 * r10
            int r10 = r12.setMax
            int r10 = r10 - r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r8 = r8.setMin
            int r8 = r8.getMin
            int r10 = r10 - r8
            int r8 = -r10
            int r8 = r8 * r6
            int r9 = r9 - r8
            r7.offsetLeftAndRight(r9)
            goto L_0x0300
        L_0x02e5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r9 = r8.setMin
            int r9 = r9.getMin
            int r10 = r12.hashCode
            int r9 = r9 * r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax r8 = r8.setMin
            int r8 = r8.getMin
            int r8 = r8 * r6
            int r10 = r12.toFloatRange
            if (r10 != r1) goto L_0x02fc
            int r9 = r9 - r8
            r7.offsetLeftAndRight(r9)
            goto L_0x0300
        L_0x02fc:
            int r9 = r9 - r8
            r7.offsetTopAndBottom(r9)
        L_0x0300:
            int r4 = r4 + 1
            goto L_0x02ae
        L_0x0303:
            int r4 = r12.getChildCount()
            if (r4 <= 0) goto L_0x031a
            boolean r4 = r12.equals
            if (r4 == 0) goto L_0x0314
            r12.setMax((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14, (boolean) r1)
            r12.length((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14, (boolean) r0)
            goto L_0x031a
        L_0x0314:
            r12.length((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14, (boolean) r1)
            r12.setMax((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r13, (androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic) r14, (boolean) r0)
        L_0x031a:
            if (r2 == 0) goto L_0x0348
            boolean r2 = r14.setMax()
            if (r2 != 0) goto L_0x0348
            int r2 = r12.toString
            if (r2 == 0) goto L_0x0338
            int r2 = r12.getChildCount()
            if (r2 <= 0) goto L_0x0338
            boolean r2 = r12.onNavigationEvent
            if (r2 != 0) goto L_0x0336
            android.view.View r2 = r12.getMin()
            if (r2 == 0) goto L_0x0338
        L_0x0336:
            r2 = 1
            goto L_0x0339
        L_0x0338:
            r2 = 0
        L_0x0339:
            if (r2 == 0) goto L_0x0348
            java.lang.Runnable r2 = r12.create
            r12.removeCallbacks(r2)
            boolean r2 = r12.setMax()
            if (r2 == 0) goto L_0x0348
            r2 = 1
            goto L_0x0349
        L_0x0348:
            r2 = 0
        L_0x0349:
            boolean r4 = r14.setMax()
            if (r4 == 0) goto L_0x0354
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setMin r4 = r12.Mean$Arithmetic
            r4.setMin()
        L_0x0354:
            boolean r3 = r3.getMax
            r12.values = r3
            boolean r3 = r12.getMax()
            r12.valueOf = r3
            if (r2 == 0) goto L_0x0368
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setMin r2 = r12.Mean$Arithmetic
            r2.setMin()
            r2 = 0
            goto L_0x0003
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$toDoubleRange, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):void");
    }

    private void setMax(getMax getmax, int i, int i2) {
        int i3;
        int i4;
        int i5 = getmax.setMax;
        if (i == -1) {
            if (getmax.setMin != Integer.MIN_VALUE) {
                i4 = getmax.setMin;
            } else {
                getmax.setMax();
                i4 = getmax.setMin;
            }
            if (i4 + i5 <= i2) {
                this.toDoubleRange.set(getmax.getMin, false);
                return;
            }
            return;
        }
        if (getmax.getMax != Integer.MIN_VALUE) {
            i3 = getmax.getMax;
        } else {
            getmax.getMin();
            i3 = getmax.getMax;
        }
        if (i3 - i5 >= i2) {
            this.toDoubleRange.set(getmax.getMin, false);
        }
    }

    private void length(int i, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int childCount = getChildCount();
            if (childCount != 0) {
                i3 = getPosition(getChildAt(childCount - 1));
            }
            i2 = 1;
        } else {
            i2 = -1;
            if (getChildCount() != 0) {
                i3 = getPosition(getChildAt(0));
            }
        }
        this.FastBitmap$CoordinateSystem.length = true;
        setMax(i3, recyclerView$Mean$Arithmetic);
        getMin(i2);
        performIdentifierAction performidentifieraction = this.FastBitmap$CoordinateSystem;
        performidentifieraction.setMax = i3 + performidentifieraction.setMin;
        this.FastBitmap$CoordinateSystem.getMin = Math.abs(i);
    }
}
