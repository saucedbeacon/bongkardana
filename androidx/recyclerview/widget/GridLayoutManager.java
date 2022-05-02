package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o.onSupportActionModeFinished;

public class GridLayoutManager extends LinearLayoutManager {
    final Rect IsOverlapping = new Rect();
    boolean getMax = false;
    View[] getMin;
    final SparseIntArray isInside = new SparseIntArray();
    int[] length;
    final SparseIntArray setMax = new SparseIntArray();
    public int setMin = -1;
    private boolean toFloatRange;
    public length toIntRange = new getMin();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        length(getProperties(context, attributeSet, i, i2).getMax);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        length(i);
    }

    public GridLayoutManager(Context context, int i, byte b) {
        super(context, 1, false);
        length(i);
    }

    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public int getRowCountForAccessibility(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        if (this.mOrientation == 0) {
            return this.setMin;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i <= 0) {
            return 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i2 = recyclerView$Mean$Arithmetic.setMin;
        }
        return getMax(todoublerange, recyclerView$Mean$Arithmetic, i2 - 1) + 1;
    }

    public int getColumnCountForAccessibility(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        if (this.mOrientation == 1) {
            return this.setMin;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i <= 0) {
            return 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i2 = recyclerView$Mean$Arithmetic.setMin;
        }
        return getMax(todoublerange, recyclerView$Mean$Arithmetic, i2 - 1) + 1;
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, View view, onSupportActionModeFinished onsupportactionmodefinished) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, onsupportactionmodefinished);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int max = getMax(todoublerange, recyclerView$Mean$Arithmetic, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            onsupportactionmodefinished.length((Object) onSupportActionModeFinished.setMin.getMin(layoutParams2.setMax, layoutParams2.getMin, max, 1, false, false));
            return;
        }
        onsupportactionmodefinished.length((Object) onSupportActionModeFinished.setMin.getMin(max, 1, layoutParams2.setMax, layoutParams2.getMin, false, false));
    }

    public void onLayoutChildren(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (recyclerView$Mean$Arithmetic.setMax()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                this.setMax.put(viewLayoutPosition, layoutParams.getMin);
                this.isInside.put(viewLayoutPosition, layoutParams.setMax);
            }
        }
        super.onLayoutChildren(todoublerange, recyclerView$Mean$Arithmetic);
        this.setMax.clear();
        this.isInside.clear();
    }

    public void onLayoutCompleted(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        super.onLayoutCompleted(recyclerView$Mean$Arithmetic);
        this.getMax = false;
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.toIntRange.length.clear();
        this.toIntRange.setMax.clear();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.toIntRange.length.clear();
        this.toIntRange.setMax.clear();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.toIntRange.length.clear();
        this.toIntRange.setMax.clear();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.toIntRange.length.clear();
        this.toIntRange.setMax.clear();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.toIntRange.length.clear();
        this.toIntRange.setMax.clear();
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
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

    private void getMin() {
        int i;
        int i2;
        if (getOrientation() == 1) {
            i2 = getWidth() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = getHeight() - getPaddingBottom();
            i = getPaddingTop();
        }
        this.length = setMin(this.length, this.setMin, i2 - i);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.length == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.length;
            i3 = chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.length;
            i4 = chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    private void getMax(int i) {
        this.length = setMin(this.length, this.setMin, i);
    }

    private static int[] setMin(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private int length(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.length;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.length;
        int i3 = this.setMin;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, LinearLayoutManager.getMin getmin, int i) {
        int i2;
        int i3;
        super.onAnchorReady(todoublerange, recyclerView$Mean$Arithmetic, getmin, i);
        getMin();
        if (recyclerView$Mean$Arithmetic.equals) {
            i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i2 = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i2 > 0 && !recyclerView$Mean$Arithmetic.setMax()) {
            boolean z = i == 1;
            int length2 = length(todoublerange, recyclerView$Mean$Arithmetic, getmin.getMax);
            if (z) {
                while (length2 > 0 && getmin.getMax > 0) {
                    getmin.getMax--;
                    length2 = length(todoublerange, recyclerView$Mean$Arithmetic, getmin.getMax);
                }
            } else {
                if (recyclerView$Mean$Arithmetic.equals) {
                    i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                } else {
                    i3 = recyclerView$Mean$Arithmetic.setMin;
                }
                int i4 = i3 - 1;
                int i5 = getmin.getMax;
                while (i5 < i4) {
                    int i6 = i5 + 1;
                    int length3 = length(todoublerange, recyclerView$Mean$Arithmetic, i6);
                    if (length3 <= length2) {
                        break;
                    }
                    i5 = i6;
                    length2 = length3;
                }
                getmin.getMax = i5;
            }
        }
        View[] viewArr = this.getMin;
        if (viewArr == null || viewArr.length != this.setMin) {
            this.getMin = new View[this.setMin];
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        getMin();
        View[] viewArr = this.getMin;
        if (viewArr == null || viewArr.length != this.setMin) {
            this.getMin = new View[this.setMin];
        }
        return super.scrollHorizontallyBy(i, todoublerange, recyclerView$Mean$Arithmetic);
    }

    public int scrollVerticallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        getMin();
        View[] viewArr = this.getMin;
        if (viewArr == null || viewArr.length != this.setMin) {
            this.getMin = new View[this.setMin];
        }
        return super.scrollVerticallyBy(i, todoublerange, recyclerView$Mean$Arithmetic);
    }

    /* access modifiers changed from: package-private */
    public View findReferenceChild(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount = getChildCount();
        int i3 = -1;
        int i4 = 1;
        if (z2) {
            i = getChildCount() - 1;
            i4 = -1;
        } else {
            i3 = childCount;
            i = 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i2 = recyclerView$Mean$Arithmetic.setMin;
        }
        ensureLayoutState();
        int min = this.mOrientationHelper.getMin();
        int max = this.mOrientationHelper.setMax();
        View view = null;
        View view2 = null;
        while (i != i3) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i2 && length(todoublerange, recyclerView$Mean$Arithmetic, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.getMax(childAt) < max && this.mOrientationHelper.setMax(childAt) >= min) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private int getMax(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        if (!recyclerView$Mean$Arithmetic.setMax()) {
            return this.toIntRange.getMax(i, this.setMin);
        }
        int min = todoublerange.getMin(i);
        if (min == -1) {
            return 0;
        }
        return this.toIntRange.getMax(min, this.setMin);
    }

    private int length(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        if (!recyclerView$Mean$Arithmetic.setMax()) {
            return this.toIntRange.getMin(i, this.setMin);
        }
        int i2 = this.isInside.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int min = todoublerange.getMin(i);
        if (min == -1) {
            return 0;
        }
        return this.toIntRange.getMin(min, this.setMin);
    }

    private int setMax(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        if (!recyclerView$Mean$Arithmetic.setMax()) {
            return this.toIntRange.getMin(i);
        }
        int i2 = this.setMax.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int min = todoublerange.getMin(i);
        if (min == -1) {
            return 1;
        }
        return this.toIntRange.getMin(min);
    }

    /* access modifiers changed from: package-private */
    public void collectPrefetchPositionsForLayoutState(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, LinearLayoutManager.setMin setmin, RecyclerView.IsOverlapping.getMax getmax) {
        int i = this.setMin;
        for (int i2 = 0; i2 < this.setMin && setmin.setMax(recyclerView$Mean$Arithmetic) && i > 0; i2++) {
            int i3 = setmin.setMin;
            getmax.length(i3, Math.max(0, setmin.toIntRange));
            i -= this.toIntRange.getMin(i3);
            setmin.setMin += setmin.getMax;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0223 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.toDoubleRange r18, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r19, androidx.recyclerview.widget.LinearLayoutManager.setMin r20, androidx.recyclerview.widget.LinearLayoutManager.length r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            o.close r3 = r6.mOrientationHelper
            int r3 = r3.isInside()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r17.getChildCount()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.length
            int r11 = r6.setMin
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.getMin()
        L_0x002c:
            int r11 = r2.getMax
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.setMin
            if (r11 != 0) goto L_0x0044
            int r12 = r2.setMin
            int r12 = r6.length(r0, r1, r12)
            int r13 = r2.setMin
            int r13 = r6.setMax(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.setMin
            if (r13 >= r14) goto L_0x0098
            boolean r14 = r2.setMax(r1)
            if (r14 == 0) goto L_0x0098
            if (r12 <= 0) goto L_0x0098
            int r14 = r2.setMin
            int r15 = r6.setMax(r0, r1, r14)
            int r4 = r6.setMin
            if (r15 > r4) goto L_0x006d
            int r12 = r12 - r15
            if (r12 < 0) goto L_0x0098
            android.view.View r4 = r2.getMin((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r0)
            if (r4 == 0) goto L_0x0098
            android.view.View[] r14 = r6.getMin
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Item at position "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.setMin
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0098:
            if (r13 != 0) goto L_0x009d
            r7.setMax = r8
            return
        L_0x009d:
            r4 = 0
            r6.getMax(r0, r1, r13, r11)
            r0 = 0
            r1 = 0
        L_0x00a3:
            if (r0 >= r13) goto L_0x00ef
            android.view.View[] r12 = r6.getMin
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$valueOf> r14 = r2.hashCode
            if (r14 != 0) goto L_0x00b7
            if (r11 == 0) goto L_0x00b3
            r6.addView(r12)
            goto L_0x00c0
        L_0x00b3:
            r6.addView(r12, r5)
            goto L_0x00c0
        L_0x00b7:
            if (r11 == 0) goto L_0x00bd
            r6.addDisappearingView(r12)
            goto L_0x00c0
        L_0x00bd:
            r6.addDisappearingView(r12, r5)
        L_0x00c0:
            android.graphics.Rect r14 = r6.IsOverlapping
            r6.calculateItemDecorationsForChild(r12, r14)
            r6.setMin((android.view.View) r12, (int) r3, (boolean) r5)
            o.close r14 = r6.mOrientationHelper
            int r14 = r14.setMin(r12)
            if (r14 <= r1) goto L_0x00d1
            r1 = r14
        L_0x00d1:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r14 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            o.close r5 = r6.mOrientationHelper
            int r5 = r5.toFloatRange(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.getMin
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00eb
            r4 = r5
        L_0x00eb:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a3
        L_0x00ef:
            if (r9 == 0) goto L_0x011a
            int r0 = r6.setMin
            float r0 = (float) r0
            float r4 = r4 * r0
            int r0 = java.lang.Math.round(r4)
            int r0 = java.lang.Math.max(r0, r10)
            r6.getMax(r0)
            r0 = 0
            r1 = 0
        L_0x0103:
            if (r0 >= r13) goto L_0x011a
            android.view.View[] r3 = r6.getMin
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.setMin((android.view.View) r3, (int) r4, (boolean) r8)
            o.close r4 = r6.mOrientationHelper
            int r3 = r4.setMin(r3)
            if (r3 <= r1) goto L_0x0117
            r1 = r3
        L_0x0117:
            int r0 = r0 + 1
            goto L_0x0103
        L_0x011a:
            r0 = 0
        L_0x011b:
            if (r0 >= r13) goto L_0x017d
            android.view.View[] r3 = r6.getMin
            r3 = r3[r0]
            o.close r4 = r6.mOrientationHelper
            int r4 = r4.setMin(r3)
            if (r4 == r1) goto L_0x0177
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4
            android.graphics.Rect r5 = r4.mDecorInsets
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.setMax
            int r11 = r4.getMin
            int r5 = r6.length(r5, r11)
            int r11 = r6.mOrientation
            if (r11 != r8) goto L_0x0163
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = getChildMeasureSpec(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x0173
        L_0x0163:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = getChildMeasureSpec(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x0173:
            r6.length(r3, r4, r5, r8)
            goto L_0x017a
        L_0x0177:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x017a:
            int r0 = r0 + 1
            goto L_0x011b
        L_0x017d:
            r12 = 0
            r7.length = r1
            int r0 = r6.mOrientation
            r3 = -1
            if (r0 != r8) goto L_0x0199
            int r0 = r2.IsOverlapping
            if (r0 != r3) goto L_0x0192
            int r0 = r2.setMax
            int r1 = r0 - r1
            r2 = r1
            r3 = 0
            r1 = r0
            r0 = 0
            goto L_0x01aa
        L_0x0192:
            int r0 = r2.setMax
            int r1 = r1 + r0
            r2 = r0
            r0 = 0
            r3 = 0
            goto L_0x01aa
        L_0x0199:
            int r0 = r2.IsOverlapping
            if (r0 != r3) goto L_0x01a3
            int r0 = r2.setMax
            int r1 = r0 - r1
            r3 = r1
            goto L_0x01a8
        L_0x01a3:
            int r0 = r2.setMax
            int r1 = r1 + r0
            r3 = r0
            r0 = r1
        L_0x01a8:
            r1 = 0
            r2 = 0
        L_0x01aa:
            if (r12 >= r13) goto L_0x0235
            android.view.View[] r4 = r6.getMin
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r10 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r10
            int r4 = r6.mOrientation
            if (r4 != r8) goto L_0x01f3
            boolean r0 = r17.isLayoutRTL()
            if (r0 == 0) goto L_0x01db
            int r0 = r17.getPaddingLeft()
            int[] r3 = r6.length
            int r4 = r6.setMin
            int r5 = r10.setMax
            int r4 = r4 - r5
            r3 = r3[r4]
            int r0 = r0 + r3
            o.close r3 = r6.mOrientationHelper
            int r3 = r3.toFloatRange(r9)
            int r3 = r0 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x0208
        L_0x01db:
            int r0 = r17.getPaddingLeft()
            int[] r3 = r6.length
            int r4 = r10.setMax
            r3 = r3[r4]
            int r0 = r0 + r3
            o.close r3 = r6.mOrientationHelper
            int r3 = r3.toFloatRange(r9)
            int r3 = r3 + r0
            r16 = r0
            r14 = r1
            r15 = r2
            r11 = r3
            goto L_0x020a
        L_0x01f3:
            int r1 = r17.getPaddingTop()
            int[] r2 = r6.length
            int r4 = r10.setMax
            r2 = r2[r4]
            int r1 = r1 + r2
            o.close r2 = r6.mOrientationHelper
            int r2 = r2.toFloatRange(r9)
            int r2 = r2 + r1
            r11 = r0
            r15 = r1
            r14 = r2
        L_0x0208:
            r16 = r3
        L_0x020a:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r11
            r5 = r14
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r0 = r10.isItemRemoved()
            if (r0 != 0) goto L_0x0221
            boolean r0 = r10.isItemChanged()
            if (r0 == 0) goto L_0x0223
        L_0x0221:
            r7.getMax = r8
        L_0x0223:
            boolean r0 = r7.getMin
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.getMin = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01aa
        L_0x0235:
            android.view.View[] r0 = r6.getMin
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$toDoubleRange, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic, androidx.recyclerview.widget.LinearLayoutManager$setMin, androidx.recyclerview.widget.LinearLayoutManager$length):void");
    }

    private void setMin(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int length2 = length(layoutParams.setMax, layoutParams.getMin);
        if (this.mOrientation == 1) {
            i2 = getChildMeasureSpec(length2, i, i5, layoutParams.width, false);
            i3 = getChildMeasureSpec(this.mOrientationHelper.setMin(), getHeightMode(), i4, layoutParams.height, true);
        } else {
            int childMeasureSpec = getChildMeasureSpec(length2, i, i4, layoutParams.height, false);
            int childMeasureSpec2 = getChildMeasureSpec(this.mOrientationHelper.setMin(), getWidthMode(), i5, layoutParams.width, true);
            i3 = childMeasureSpec;
            i2 = childMeasureSpec2;
        }
        length(view, i2, i3, z);
    }

    private void length(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = shouldReMeasureChild(view, i, i2, layoutParams);
        } else {
            z2 = shouldMeasureChild(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void getMax(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i, boolean z) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        if (z) {
            i4 = 1;
            i2 = 0;
        } else {
            i2 = i - 1;
            i = -1;
        }
        while (i2 != i) {
            View view = this.getMin[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.getMin = setMax(todoublerange, recyclerView$Mean$Arithmetic, getPosition(view));
            layoutParams.setMax = i3;
            i3 += layoutParams.getMin;
            i2 += i4;
        }
    }

    public final void length(int i) {
        if (i != this.setMin) {
            this.getMax = true;
            if (i > 0) {
                this.setMin = i;
                this.toIntRange.length.clear();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(i)));
        }
    }

    public static abstract class length {
        private boolean getMax = false;
        final SparseIntArray length = new SparseIntArray();
        final SparseIntArray setMax = new SparseIntArray();
        private boolean setMin = false;

        public abstract int getMin(int i);

        /* access modifiers changed from: package-private */
        public final int getMin(int i, int i2) {
            if (!this.setMin) {
                return setMin(i, i2);
            }
            int i3 = this.length.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int min = setMin(i, i2);
            this.length.put(i, min);
            return min;
        }

        /* access modifiers changed from: package-private */
        public final int getMax(int i, int i2) {
            if (!this.getMax) {
                return setMax(i, i2);
            }
            int i3 = this.setMax.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int max = setMax(i, i2);
            this.setMax.put(i, max);
            return max;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int setMin(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getMin(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.setMin
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.length
                int r2 = length(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.length
                int r3 = r3.get(r2)
                int r4 = r5.getMin(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r3 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.getMin(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = 0
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.length.setMin(int, int):int");
        }

        private static int length(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int setMax(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.getMax
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.setMax
                int r0 = length(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.setMax
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getMin(r0, r8)
                int r0 = r6.getMin(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.getMin(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.getMin(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.length.setMax(int, int):int");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f6, code lost:
        if (r13 == r14) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.toDoubleRange r25, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.findContainingItemView(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.setMax
            int r7 = r5.setMax
            int r5 = r5.getMin
            int r7 = r7 + r5
            android.view.View r5 = super.onFocusSearchFailed(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r24
            int r5 = r0.convertFocusDirectionToLayoutDirection(r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.mShouldReverseLayout
            if (r5 == r10) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0040
            int r5 = r22.getChildCount()
            int r5 = r5 - r9
            r11 = -1
            r12 = -1
            goto L_0x0047
        L_0x0040:
            int r5 = r22.getChildCount()
            r11 = r5
            r5 = 0
            r12 = 1
        L_0x0047:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L_0x0053
            boolean r13 = r22.isLayoutRTL()
            if (r13 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            int r14 = r0.getMax(r1, r2, r5)
            r10 = r5
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r5 = r4
        L_0x0060:
            if (r10 == r11) goto L_0x0147
            int r9 = r0.getMax(r1, r2, r10)
            android.view.View r1 = r0.getChildAt(r10)
            if (r1 == r3) goto L_0x0147
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0147
        L_0x0078:
            r18 = r3
            r20 = r8
            r19 = r11
            r23 = r14
            r11 = r16
            r8 = r17
            goto L_0x0133
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.setMax
            r18 = r3
            int r3 = r9.setMax
            r19 = r11
            int r11 = r9.getMin
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a2
            if (r2 != r6) goto L_0x00a2
            if (r3 != r7) goto L_0x00a2
            return r1
        L_0x00a2:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00aa
            if (r4 == 0) goto L_0x00b2
        L_0x00aa:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto L_0x00bc
            if (r5 != 0) goto L_0x00bc
        L_0x00b2:
            r20 = r8
            r23 = r14
            r11 = r16
            r8 = r17
        L_0x00ba:
            r14 = 1
            goto L_0x0105
        L_0x00bc:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00d9
            if (r11 <= r8) goto L_0x00cf
            goto L_0x00b2
        L_0x00cf:
            if (r11 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r11 = 1
            goto L_0x00d6
        L_0x00d5:
            r11 = 0
        L_0x00d6:
            if (r13 != r11) goto L_0x00fc
            goto L_0x00b2
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r20 = r8
            r23 = r14
            r8 = 0
            r14 = 1
            boolean r21 = r0.isViewPartiallyVisible(r1, r8, r14)
            if (r21 == 0) goto L_0x0100
            r8 = r17
            if (r11 <= r8) goto L_0x00ee
            r11 = r16
            goto L_0x0105
        L_0x00ee:
            if (r11 != r8) goto L_0x00f9
            r11 = r16
            if (r2 <= r11) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r14 = 0
        L_0x00f6:
            if (r13 != r14) goto L_0x0104
            goto L_0x00ba
        L_0x00f9:
            r11 = r16
            goto L_0x0104
        L_0x00fc:
            r20 = r8
            r23 = r14
        L_0x0100:
            r11 = r16
            r8 = r17
        L_0x0104:
            r14 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x0133
            boolean r14 = r1.hasFocusable()
            if (r14 == 0) goto L_0x0121
            int r4 = r9.setMax
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r17 = r8
            r16 = r11
            r4 = r1
            r8 = r2
            goto L_0x0139
        L_0x0121:
            int r5 = r9.setMax
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r5
            r8 = r20
            r5 = r1
            goto L_0x0139
        L_0x0133:
            r17 = r8
            r16 = r11
            r8 = r20
        L_0x0139:
            int r10 = r10 + r12
            r14 = r23
            r1 = r25
            r2 = r26
            r3 = r18
            r11 = r19
            r9 = 1
            goto L_0x0060
        L_0x0147:
            if (r4 == 0) goto L_0x014a
            return r4
        L_0x014a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$toDoubleRange, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):android.view.View");
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.getMax;
    }

    public int computeHorizontalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.toFloatRange) {
            return getMin(recyclerView$Mean$Arithmetic);
        }
        return super.computeHorizontalScrollRange(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.toFloatRange) {
            return getMin(recyclerView$Mean$Arithmetic);
        }
        return super.computeVerticalScrollRange(recyclerView$Mean$Arithmetic);
    }

    public int computeHorizontalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.toFloatRange) {
            return setMax(recyclerView$Mean$Arithmetic);
        }
        return super.computeHorizontalScrollOffset(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.toFloatRange) {
            return setMax(recyclerView$Mean$Arithmetic);
        }
        return super.computeVerticalScrollOffset(recyclerView$Mean$Arithmetic);
    }

    private int getMin(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int i3;
        if (getChildCount() != 0) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            if (i != 0) {
                ensureLayoutState();
                View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
                View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
                if (!(findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null)) {
                    if (!isSmoothScrollbarEnabled()) {
                        length length2 = this.toIntRange;
                        if (recyclerView$Mean$Arithmetic.equals) {
                            i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                        } else {
                            i3 = recyclerView$Mean$Arithmetic.setMin;
                        }
                        return length2.getMax(i3 - 1, this.setMin) + 1;
                    }
                    int max = this.mOrientationHelper.setMax(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getMax(findFirstVisibleChildClosestToStart);
                    int max2 = this.toIntRange.getMax(getPosition(findFirstVisibleChildClosestToStart), this.setMin);
                    int max3 = this.toIntRange.getMax(getPosition(findFirstVisibleChildClosestToEnd), this.setMin);
                    length length3 = this.toIntRange;
                    if (recyclerView$Mean$Arithmetic.equals) {
                        i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                    } else {
                        i2 = recyclerView$Mean$Arithmetic.setMin;
                    }
                    return (int) ((((float) max) / ((float) ((max3 - max2) + 1))) * ((float) (length3.getMax(i2 - 1, this.setMin) + 1)));
                }
            }
        }
        return 0;
    }

    private int setMax(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int i3;
        if (getChildCount() != 0) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            if (i != 0) {
                ensureLayoutState();
                boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
                View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
                View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
                if (!(findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null)) {
                    int max = this.toIntRange.getMax(getPosition(findFirstVisibleChildClosestToStart), this.setMin);
                    int max2 = this.toIntRange.getMax(getPosition(findFirstVisibleChildClosestToEnd), this.setMin);
                    int min = Math.min(max, max2);
                    int max3 = Math.max(max, max2);
                    length length2 = this.toIntRange;
                    if (recyclerView$Mean$Arithmetic.equals) {
                        i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                    } else {
                        i2 = recyclerView$Mean$Arithmetic.setMin;
                    }
                    int max4 = length2.getMax(i2 - 1, this.setMin) + 1;
                    if (this.mShouldReverseLayout) {
                        i3 = Math.max(0, (max4 - max3) - 1);
                    } else {
                        i3 = Math.max(0, min);
                    }
                    if (!isSmoothScrollbarEnabled) {
                        return i3;
                    }
                    return Math.round((((float) i3) * (((float) Math.abs(this.mOrientationHelper.setMax(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getMax(findFirstVisibleChildClosestToStart))) / ((float) ((this.toIntRange.getMax(getPosition(findFirstVisibleChildClosestToEnd), this.setMin) - this.toIntRange.getMax(getPosition(findFirstVisibleChildClosestToStart), this.setMin)) + 1)))) + ((float) (this.mOrientationHelper.getMin() - this.mOrientationHelper.getMax(findFirstVisibleChildClosestToStart))));
                }
            }
        }
        return 0;
    }

    public static final class getMin extends length {
        public final int getMin(int i) {
            return 1;
        }

        public final int setMin(int i, int i2) {
            return i % i2;
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        int getMin = 0;
        int setMax = -1;

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
    }
}
