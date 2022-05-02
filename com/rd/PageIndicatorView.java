package com.rd;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.PositionSavedState;
import com.rd.draw.data.RtlMode;
import o.dispatchChildDetached;
import o.dispatchOnCancelled;
import o.findViewHolderForAdapterPosition;
import o.isAnimating;
import o.offsetChildrenVertical;
import o.offsetPositionRecordsForMove;
import o.onCancelLoad;
import o.onCanceled;
import o.onChildDetachedFromWindow;
import o.saveOldPositions;
import o.setExpandActivityOverflowButtonDrawable;
import o.setTitle;

public class PageIndicatorView extends View implements ViewPager.setMax, saveOldPositions.getMax, ViewPager.setMin, View.OnTouchListener {
    private static final Handler getMin = new Handler(Looper.getMainLooper());
    private ViewPager getMax;
    private boolean length;
    private DataSetObserver setMax;
    /* access modifiers changed from: private */
    public saveOldPositions setMin;
    private Runnable toIntRange = new Runnable() {
        public final void run() {
            findViewHolderForAdapterPosition findviewholderforadapterposition = PageIndicatorView.this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition.setMax.Mean$Arithmetic = true;
            PageIndicatorView.access$200(PageIndicatorView.this);
        }
    };

    public PageIndicatorView(Context context) {
        super(context);
        if (getId() == -1) {
            setId(dispatchChildDetached.getMax());
        }
        getMax((AttributeSet) null);
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        if (findviewholderforadapterposition.setMax.length()) {
            getMin.removeCallbacks(this.toIntRange);
            Handler handler = getMin;
            Runnable runnable = this.toIntRange;
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            handler.postDelayed(runnable, findviewholderforadapterposition2.setMax.valueOf);
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getId() == -1) {
            setId(dispatchChildDetached.getMax());
        }
        getMax(attributeSet);
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        if (findviewholderforadapterposition.setMax.length()) {
            getMin.removeCallbacks(this.toIntRange);
            Handler handler = getMin;
            Runnable runnable = this.toIntRange;
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            handler.postDelayed(runnable, findviewholderforadapterposition2.setMax.valueOf);
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getId() == -1) {
            setId(dispatchChildDetached.getMax());
        }
        getMax(attributeSet);
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        if (findviewholderforadapterposition.setMax.length()) {
            getMin.removeCallbacks(this.toIntRange);
            Handler handler = getMin;
            Runnable runnable = this.toIntRange;
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            handler.postDelayed(runnable, findviewholderforadapterposition2.setMax.valueOf);
        }
    }

    @TargetApi(21)
    public PageIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (getId() == -1) {
            setId(dispatchChildDetached.getMax());
        }
        getMax(attributeSet);
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        if (findviewholderforadapterposition.setMax.length()) {
            getMin.removeCallbacks(this.toIntRange);
            Handler handler = getMin;
            Runnable runnable = this.toIntRange;
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            handler.postDelayed(runnable, findviewholderforadapterposition2.setMax.valueOf);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        ViewPager viewPager;
        View findViewById;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent != null && (parent instanceof ViewGroup) && ((ViewGroup) parent).getChildCount() > 0) {
                findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
                if (findviewholderforadapterposition.setMax == null) {
                    findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
                }
                int i = findviewholderforadapterposition.setMax.create;
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getChildCount() <= 0 || (findViewById = viewGroup.findViewById(i)) == null || !(findViewById instanceof ViewPager)) {
                    viewPager = null;
                } else {
                    viewPager = (ViewPager) findViewById;
                }
                if (viewPager != null) {
                    setViewPager(viewPager);
                    return;
                }
                parent = parent.getParent();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        getMax();
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.getMin = onchilddetachedfromwindow.getCause;
        positionSavedState.setMax = onchilddetachedfromwindow.onNavigationEvent;
        positionSavedState.length = onchilddetachedfromwindow.b;
        return positionSavedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof PositionSavedState) {
            findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
            PositionSavedState positionSavedState = (PositionSavedState) parcelable;
            onchilddetachedfromwindow.getCause = positionSavedState.getMin;
            onchilddetachedfromwindow.onNavigationEvent = positionSavedState.setMax;
            onchilddetachedfromwindow.b = positionSavedState.length;
            super.onRestoreInstanceState(positionSavedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        int max = dispatchOnCancelled.setMax(i);
        if (i5 != max) {
            onCanceled oncanceled = new onCanceled(i5, max, 1);
            onCancelLoad.setMax(1949021757, oncanceled);
            onCancelLoad.getMin(1949021757, oncanceled);
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = onchilddetachedfromwindow.invoke;
        int i7 = onchilddetachedfromwindow.getMax;
        int i8 = onchilddetachedfromwindow.toIntRange;
        int i9 = onchilddetachedfromwindow.length;
        int i10 = onchilddetachedfromwindow.getMin;
        int i11 = onchilddetachedfromwindow.isInside;
        int i12 = onchilddetachedfromwindow.toFloatRange;
        int i13 = onchilddetachedfromwindow.IsOverlapping;
        int i14 = i7 * 2;
        if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
            onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
        }
        Orientation orientation = onchilddetachedfromwindow.ICustomTabsCallback;
        if (i6 != 0) {
            i3 = (i14 * i6) + (i8 * 2 * i6) + (i9 * (i6 - 1));
            i4 = i14 + i8;
            if (orientation != Orientation.HORIZONTAL) {
                int i15 = i3;
                i3 = i4;
                i4 = i15;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (onchilddetachedfromwindow.onPostMessage == null) {
            onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        }
        if (onchilddetachedfromwindow.onPostMessage == AnimationType.DROP) {
            if (orientation == Orientation.HORIZONTAL) {
                i4 *= 2;
            } else {
                i3 *= 2;
            }
        }
        Orientation orientation2 = Orientation.HORIZONTAL;
        int i16 = i3 + i10 + i12;
        int i17 = i4 + i11 + i13;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i16, size) : i16;
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i17, size2);
            } else {
                size2 = i17;
            }
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 < 0) {
            size2 = 0;
        }
        onchilddetachedfromwindow.setMin = size;
        onchilddetachedfromwindow.setMax = size2;
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(size2));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r7 = r18
            o.saveOldPositions r1 = r0.setMin
            o.findViewHolderForAdapterPosition r1 = r1.getMax
            o.offsetChildrenVertical r8 = r1.getMin
            o.onChildDetachedFromWindow r1 = r8.getMin
            int r9 = r1.invoke
            r11 = 0
        L_0x000f:
            if (r11 >= r9) goto L_0x0388
            o.onChildDetachedFromWindow r1 = r8.getMin
            int r1 = o.clearNestedRecyclerViewIfNotNested.getMax(r1, r11)
            o.onChildDetachedFromWindow r2 = r8.getMin
            int r2 = o.clearNestedRecyclerViewIfNotNested.setMin(r2, r11)
            o.onChildDetachedFromWindow r3 = r8.getMin
            boolean r3 = r3.getMin()
            o.onChildDetachedFromWindow r4 = r8.getMin
            int r4 = r4.getCause
            o.onChildDetachedFromWindow r5 = r8.getMin
            int r5 = r5.onNavigationEvent
            o.onChildDetachedFromWindow r6 = r8.getMin
            int r6 = r6.b
            r12 = 1
            if (r3 != 0) goto L_0x0038
            if (r11 == r4) goto L_0x0036
            if (r11 != r6) goto L_0x0038
        L_0x0036:
            r6 = 1
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0040
            if (r11 == r4) goto L_0x0041
            if (r11 != r5) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r12 = 0
        L_0x0041:
            r4 = r6 | r12
            o.findChildViewUnder r3 = r8.setMax
            r3.values = r11
            r3.FastBitmap$CoordinateSystem = r1
            r3.hashCode = r2
            o.canReuseUpdatedViewHolder r1 = r8.length
            if (r1 == 0) goto L_0x036f
            if (r4 == 0) goto L_0x036f
            o.onChildDetachedFromWindow r1 = r8.getMin
            com.rd.animation.type.AnimationType r2 = r1.onPostMessage
            if (r2 != 0) goto L_0x005b
            com.rd.animation.type.AnimationType r2 = com.rd.animation.type.AnimationType.NONE
            r1.onPostMessage = r2
        L_0x005b:
            com.rd.animation.type.AnimationType r1 = r1.onPostMessage
            int[] r2 = o.offsetChildrenVertical.AnonymousClass5.getMin
            int r1 = r1.ordinal()
            r1 = r2[r1]
            switch(r1) {
                case 1: goto L_0x035a;
                case 2: goto L_0x0307;
                case 3: goto L_0x02a7;
                case 4: goto L_0x0294;
                case 5: goto L_0x0240;
                case 6: goto L_0x01ba;
                case 7: goto L_0x01a7;
                case 8: goto L_0x0145;
                case 9: goto L_0x00ca;
                case 10: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0382
        L_0x006a:
            o.findChildViewUnder r1 = r8.setMax
            o.canReuseUpdatedViewHolder r2 = r8.length
            o.onScrolled r3 = r1.isInside
            if (r3 == 0) goto L_0x0382
            o.onScrolled r3 = r1.isInside
            int r4 = r1.values
            int r5 = r1.FastBitmap$CoordinateSystem
            int r1 = r1.hashCode
            boolean r6 = r2 instanceof o.viewRangeUpdate
            if (r6 == 0) goto L_0x0382
            o.viewRangeUpdate r2 = (o.viewRangeUpdate) r2
            o.onChildDetachedFromWindow r6 = r3.length
            int r6 = r6.getMax
            float r6 = (float) r6
            o.onChildDetachedFromWindow r12 = r3.length
            int r12 = r12.hashCode
            o.onChildDetachedFromWindow r13 = r3.length
            int r13 = r13.getCause
            o.onChildDetachedFromWindow r14 = r3.length
            int r14 = r14.onNavigationEvent
            o.onChildDetachedFromWindow r15 = r3.length
            int r15 = r15.b
            o.onChildDetachedFromWindow r10 = r3.length
            boolean r10 = r10.getMin()
            if (r10 == 0) goto L_0x00ad
            if (r4 != r14) goto L_0x00a5
            int r4 = r2.setMax
            float r6 = (float) r4
            int r12 = r2.setMin
            goto L_0x00bc
        L_0x00a5:
            if (r4 != r13) goto L_0x00bc
            int r4 = r2.getMin
            float r6 = (float) r4
            int r12 = r2.length
            goto L_0x00bc
        L_0x00ad:
            if (r4 != r13) goto L_0x00b5
            int r4 = r2.setMax
            float r6 = (float) r4
            int r12 = r2.setMin
            goto L_0x00bc
        L_0x00b5:
            if (r4 != r15) goto L_0x00bc
            int r4 = r2.getMin
            float r6 = (float) r4
            int r12 = r2.length
        L_0x00bc:
            android.graphics.Paint r2 = r3.setMax
            r2.setColor(r12)
            float r2 = (float) r5
            float r1 = (float) r1
            android.graphics.Paint r3 = r3.setMax
            r7.drawCircle(r2, r1, r6, r3)
            goto L_0x0382
        L_0x00ca:
            o.findChildViewUnder r1 = r8.setMax
            o.canReuseUpdatedViewHolder r2 = r8.length
            o.dispatchOnScrollStateChanged r3 = r1.toFloatRange
            if (r3 == 0) goto L_0x0382
            o.dispatchOnScrollStateChanged r3 = r1.toFloatRange
            int r4 = r1.values
            int r5 = r1.FastBitmap$CoordinateSystem
            int r1 = r1.hashCode
            boolean r6 = r2 instanceof o.getPreserveFocusAfterLayout
            if (r6 == 0) goto L_0x0382
            o.getPreserveFocusAfterLayout r2 = (o.getPreserveFocusAfterLayout) r2
            o.onChildDetachedFromWindow r6 = r3.length
            int r6 = r6.hashCode
            o.onChildDetachedFromWindow r10 = r3.length
            int r10 = r10.toString
            o.onChildDetachedFromWindow r12 = r3.length
            int r12 = r12.getMax
            o.onChildDetachedFromWindow r13 = r3.length
            int r13 = r13.getCause
            o.onChildDetachedFromWindow r14 = r3.length
            int r14 = r14.onNavigationEvent
            o.onChildDetachedFromWindow r15 = r3.length
            int r15 = r15.b
            int r0 = r2.setMin
            r16 = r0
            o.onChildDetachedFromWindow r0 = r3.length
            boolean r0 = r0.getMin()
            if (r0 == 0) goto L_0x010e
            if (r4 != r14) goto L_0x0109
            int r0 = r2.setMin
            goto L_0x011c
        L_0x0109:
            if (r4 != r13) goto L_0x0119
            int r0 = r2.getMin
            goto L_0x0117
        L_0x010e:
            if (r4 != r15) goto L_0x0113
            int r0 = r2.setMin
            goto L_0x011c
        L_0x0113:
            if (r4 != r13) goto L_0x0119
            int r0 = r2.getMin
        L_0x0117:
            r6 = r10
            goto L_0x011c
        L_0x0119:
            r6 = r10
            r0 = r16
        L_0x011c:
            android.graphics.Paint r2 = r3.setMax
            r2.setColor(r6)
            o.onChildDetachedFromWindow r2 = r3.length
            com.rd.draw.data.Orientation r4 = r2.ICustomTabsCallback
            if (r4 != 0) goto L_0x012b
            com.rd.draw.data.Orientation r4 = com.rd.draw.data.Orientation.HORIZONTAL
            r2.ICustomTabsCallback = r4
        L_0x012b:
            com.rd.draw.data.Orientation r2 = r2.ICustomTabsCallback
            com.rd.draw.data.Orientation r4 = com.rd.draw.data.Orientation.HORIZONTAL
            if (r2 != r4) goto L_0x013b
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = (float) r12
            android.graphics.Paint r3 = r3.setMax
            r7.drawCircle(r0, r1, r2, r3)
            goto L_0x0382
        L_0x013b:
            float r1 = (float) r5
            float r0 = (float) r0
            float r2 = (float) r12
            android.graphics.Paint r3 = r3.setMax
            r7.drawCircle(r1, r0, r2, r3)
            goto L_0x0382
        L_0x0145:
            o.findChildViewUnder r0 = r8.setMax
            o.canReuseUpdatedViewHolder r1 = r8.length
            o.getDecoratedBoundsWithMarginsInt r2 = r0.IsOverlapping
            if (r2 == 0) goto L_0x0382
            o.getDecoratedBoundsWithMarginsInt r2 = r0.IsOverlapping
            int r3 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.hashCode
            boolean r4 = r1 instanceof o.processDataSetCompletelyChanged
            if (r4 == 0) goto L_0x0382
            o.processDataSetCompletelyChanged r1 = (o.processDataSetCompletelyChanged) r1
            o.onChildDetachedFromWindow r4 = r2.length
            int r4 = r4.toString
            o.onChildDetachedFromWindow r5 = r2.length
            int r5 = r5.hashCode
            o.onChildDetachedFromWindow r6 = r2.length
            int r6 = r6.getMax
            float r6 = (float) r6
            android.graphics.Paint r10 = r2.setMax
            r10.setColor(r4)
            float r3 = (float) r3
            float r0 = (float) r0
            android.graphics.Paint r4 = r2.setMax
            r7.drawCircle(r3, r0, r6, r4)
            android.graphics.Paint r0 = r2.setMax
            r0.setColor(r5)
            o.onChildDetachedFromWindow r0 = r2.length
            com.rd.draw.data.Orientation r3 = r0.ICustomTabsCallback
            if (r3 != 0) goto L_0x0181
            com.rd.draw.data.Orientation r3 = com.rd.draw.data.Orientation.HORIZONTAL
            r0.ICustomTabsCallback = r3
        L_0x0181:
            com.rd.draw.data.Orientation r0 = r0.ICustomTabsCallback
            com.rd.draw.data.Orientation r3 = com.rd.draw.data.Orientation.HORIZONTAL
            if (r0 != r3) goto L_0x0197
            int r0 = r1.length
            float r0 = (float) r0
            int r3 = r1.getMin
            float r3 = (float) r3
            int r1 = r1.getMax
            float r1 = (float) r1
            android.graphics.Paint r2 = r2.setMax
            r7.drawCircle(r0, r3, r1, r2)
            goto L_0x0382
        L_0x0197:
            int r0 = r1.getMin
            float r0 = (float) r0
            int r3 = r1.length
            float r3 = (float) r3
            int r1 = r1.getMax
            float r1 = (float) r1
            android.graphics.Paint r2 = r2.setMax
            r7.drawCircle(r0, r3, r1, r2)
            goto L_0x0382
        L_0x01a7:
            o.findChildViewUnder r0 = r8.setMax
            o.canReuseUpdatedViewHolder r1 = r8.length
            o.repositionShadowingViews r2 = r0.equals
            if (r2 == 0) goto L_0x0382
            o.repositionShadowingViews r2 = r0.equals
            int r3 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.hashCode
            r2.setMax(r7, r1, r3, r0)
            goto L_0x0382
        L_0x01ba:
            o.findChildViewUnder r0 = r8.setMax
            o.canReuseUpdatedViewHolder r1 = r8.length
            o.dispatchOnScrolled r2 = r0.toIntRange
            if (r2 == 0) goto L_0x0382
            o.dispatchOnScrolled r2 = r0.toIntRange
            int r3 = r0.values
            int r4 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.hashCode
            boolean r5 = r1 instanceof o.offsetPositionRecordsForRemove
            if (r5 == 0) goto L_0x0382
            o.offsetPositionRecordsForRemove r1 = (o.offsetPositionRecordsForRemove) r1
            o.onChildDetachedFromWindow r5 = r2.length
            int r5 = r5.toString
            o.onChildDetachedFromWindow r6 = r2.length
            int r6 = r6.getMax
            float r6 = (float) r6
            o.onChildDetachedFromWindow r10 = r2.length
            int r10 = r10.toIntRange
            o.onChildDetachedFromWindow r12 = r2.length
            int r12 = r12.getCause
            o.onChildDetachedFromWindow r13 = r2.length
            int r13 = r13.onNavigationEvent
            o.onChildDetachedFromWindow r14 = r2.length
            int r14 = r14.b
            o.onChildDetachedFromWindow r15 = r2.length
            boolean r15 = r15.getMin()
            if (r15 == 0) goto L_0x0205
            if (r3 != r13) goto L_0x01fb
            int r5 = r1.setMin
            int r3 = r1.getMin
            float r6 = (float) r3
            int r10 = r1.getMax
            goto L_0x0218
        L_0x01fb:
            if (r3 != r12) goto L_0x0218
            int r5 = r1.length
            int r3 = r1.setMax
            float r6 = (float) r3
            int r10 = r1.isInside
            goto L_0x0218
        L_0x0205:
            if (r3 != r12) goto L_0x020f
            int r5 = r1.setMin
            int r3 = r1.getMin
            float r6 = (float) r3
            int r10 = r1.getMax
            goto L_0x0218
        L_0x020f:
            if (r3 != r14) goto L_0x0218
            int r5 = r1.length
            int r3 = r1.setMax
            float r6 = (float) r3
            int r10 = r1.isInside
        L_0x0218:
            android.graphics.Paint r1 = r2.getMin
            r1.setColor(r5)
            android.graphics.Paint r1 = r2.getMin
            o.onChildDetachedFromWindow r3 = r2.length
            int r3 = r3.toIntRange
            float r3 = (float) r3
            r1.setStrokeWidth(r3)
            float r1 = (float) r4
            float r0 = (float) r0
            o.onChildDetachedFromWindow r3 = r2.length
            int r3 = r3.getMax
            float r3 = (float) r3
            android.graphics.Paint r4 = r2.getMin
            r7.drawCircle(r1, r0, r3, r4)
            android.graphics.Paint r3 = r2.getMin
            float r4 = (float) r10
            r3.setStrokeWidth(r4)
            android.graphics.Paint r2 = r2.getMin
            r7.drawCircle(r1, r0, r6, r2)
            goto L_0x0382
        L_0x0240:
            o.findChildViewUnder r0 = r8.setMax
            o.canReuseUpdatedViewHolder r1 = r8.length
            o.hasPendingAdapterUpdates r2 = r0.getMax
            if (r2 == 0) goto L_0x0382
            o.hasPendingAdapterUpdates r2 = r0.getMax
            int r3 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.hashCode
            boolean r4 = r1 instanceof o.findContainingItemView
            if (r4 == 0) goto L_0x0382
            o.findContainingItemView r1 = (o.findContainingItemView) r1
            int r1 = r1.setMin
            o.onChildDetachedFromWindow r4 = r2.length
            int r4 = r4.toString
            o.onChildDetachedFromWindow r5 = r2.length
            int r5 = r5.hashCode
            o.onChildDetachedFromWindow r6 = r2.length
            int r6 = r6.getMax
            android.graphics.Paint r10 = r2.setMax
            r10.setColor(r4)
            float r3 = (float) r3
            float r0 = (float) r0
            float r4 = (float) r6
            android.graphics.Paint r6 = r2.setMax
            r7.drawCircle(r3, r0, r4, r6)
            android.graphics.Paint r6 = r2.setMax
            r6.setColor(r5)
            o.onChildDetachedFromWindow r5 = r2.length
            com.rd.draw.data.Orientation r6 = r5.ICustomTabsCallback
            if (r6 != 0) goto L_0x027e
            com.rd.draw.data.Orientation r6 = com.rd.draw.data.Orientation.HORIZONTAL
            r5.ICustomTabsCallback = r6
        L_0x027e:
            com.rd.draw.data.Orientation r5 = r5.ICustomTabsCallback
            com.rd.draw.data.Orientation r6 = com.rd.draw.data.Orientation.HORIZONTAL
            if (r5 != r6) goto L_0x028c
            float r1 = (float) r1
            android.graphics.Paint r2 = r2.setMax
            r7.drawCircle(r1, r0, r4, r2)
            goto L_0x0382
        L_0x028c:
            float r0 = (float) r1
            android.graphics.Paint r1 = r2.setMax
            r7.drawCircle(r3, r0, r4, r1)
            goto L_0x0382
        L_0x0294:
            o.findChildViewUnder r0 = r8.setMax
            o.canReuseUpdatedViewHolder r1 = r8.length
            o.onScrollStateChanged r2 = r0.setMin
            if (r2 == 0) goto L_0x0382
            o.onScrollStateChanged r2 = r0.setMin
            int r3 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.hashCode
            r2.setMax(r7, r1, r3, r0)
            goto L_0x0382
        L_0x02a7:
            o.findChildViewUnder r0 = r8.setMax
            o.canReuseUpdatedViewHolder r1 = r8.length
            o.findNestedRecyclerView r2 = r0.length
            if (r2 == 0) goto L_0x0382
            o.findNestedRecyclerView r2 = r0.length
            int r3 = r0.values
            int r4 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.hashCode
            boolean r5 = r1 instanceof o.viewRangeUpdate
            if (r5 == 0) goto L_0x0382
            o.viewRangeUpdate r1 = (o.viewRangeUpdate) r1
            o.onChildDetachedFromWindow r5 = r2.length
            int r5 = r5.getMax
            float r5 = (float) r5
            o.onChildDetachedFromWindow r6 = r2.length
            int r6 = r6.hashCode
            o.onChildDetachedFromWindow r10 = r2.length
            int r10 = r10.getCause
            o.onChildDetachedFromWindow r12 = r2.length
            int r12 = r12.onNavigationEvent
            o.onChildDetachedFromWindow r13 = r2.length
            int r13 = r13.b
            o.onChildDetachedFromWindow r14 = r2.length
            boolean r14 = r14.getMin()
            if (r14 == 0) goto L_0x02ea
            if (r3 != r12) goto L_0x02e2
            int r3 = r1.setMax
            float r5 = (float) r3
            int r6 = r1.setMin
            goto L_0x02f9
        L_0x02e2:
            if (r3 != r10) goto L_0x02f9
            int r3 = r1.getMin
            float r5 = (float) r3
            int r6 = r1.length
            goto L_0x02f9
        L_0x02ea:
            if (r3 != r10) goto L_0x02f2
            int r3 = r1.setMax
            float r5 = (float) r3
            int r6 = r1.setMin
            goto L_0x02f9
        L_0x02f2:
            if (r3 != r13) goto L_0x02f9
            int r3 = r1.getMin
            float r5 = (float) r3
            int r6 = r1.length
        L_0x02f9:
            android.graphics.Paint r1 = r2.setMax
            r1.setColor(r6)
            float r1 = (float) r4
            float r0 = (float) r0
            android.graphics.Paint r2 = r2.setMax
            r7.drawCircle(r1, r0, r5, r2)
            goto L_0x0382
        L_0x0307:
            o.findChildViewUnder r0 = r8.setMax
            o.canReuseUpdatedViewHolder r1 = r8.length
            o.getItemDecorInsetsForChild r2 = r0.getMin
            if (r2 == 0) goto L_0x0382
            o.getItemDecorInsetsForChild r2 = r0.getMin
            int r3 = r0.values
            int r4 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.hashCode
            boolean r5 = r1 instanceof o.markKnownViewsInvalid
            if (r5 == 0) goto L_0x0382
            o.markKnownViewsInvalid r1 = (o.markKnownViewsInvalid) r1
            o.onChildDetachedFromWindow r5 = r2.length
            int r5 = r5.getMax
            float r5 = (float) r5
            o.onChildDetachedFromWindow r6 = r2.length
            int r6 = r6.hashCode
            o.onChildDetachedFromWindow r10 = r2.length
            int r10 = r10.getCause
            o.onChildDetachedFromWindow r12 = r2.length
            int r12 = r12.onNavigationEvent
            o.onChildDetachedFromWindow r13 = r2.length
            int r13 = r13.b
            o.onChildDetachedFromWindow r14 = r2.length
            boolean r14 = r14.getMin()
            if (r14 == 0) goto L_0x0344
            if (r3 != r12) goto L_0x033f
            int r6 = r1.setMin
            goto L_0x034d
        L_0x033f:
            if (r3 != r10) goto L_0x034d
            int r6 = r1.length
            goto L_0x034d
        L_0x0344:
            if (r3 != r10) goto L_0x0349
            int r6 = r1.setMin
            goto L_0x034d
        L_0x0349:
            if (r3 != r13) goto L_0x034d
            int r6 = r1.length
        L_0x034d:
            android.graphics.Paint r1 = r2.setMax
            r1.setColor(r6)
            float r1 = (float) r4
            float r0 = (float) r0
            android.graphics.Paint r2 = r2.setMax
            r7.drawCircle(r1, r0, r5, r2)
            goto L_0x0382
        L_0x035a:
            o.findChildViewUnder r0 = r8.setMax
            o.getItemDecorInsetsForChild r1 = r0.getMin
            if (r1 == 0) goto L_0x0382
            o.getDecoratedBoundsWithMargins r1 = r0.setMax
            int r3 = r0.values
            r4 = 1
            int r5 = r0.FastBitmap$CoordinateSystem
            int r6 = r0.hashCode
            r2 = r18
            r1.setMax(r2, r3, r4, r5, r6)
            goto L_0x0382
        L_0x036f:
            o.findChildViewUnder r0 = r8.setMax
            o.getItemDecorInsetsForChild r1 = r0.getMin
            if (r1 == 0) goto L_0x0382
            o.getDecoratedBoundsWithMargins r1 = r0.setMax
            int r3 = r0.values
            int r5 = r0.FastBitmap$CoordinateSystem
            int r6 = r0.hashCode
            r2 = r18
            r1.setMax(r2, r3, r4, r5, r6)
        L_0x0382:
            int r11 = r11 + 1
            r0 = r17
            goto L_0x000f
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        onChildDetachedFromWindow onchilddetachedfromwindow;
        offsetChildrenVertical offsetchildrenvertical = this.setMin.getMax.getMin;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            motionEvent.getX();
            motionEvent.getY();
            if (!(offsetchildrenvertical.setMin == null || (onchilddetachedfromwindow = offsetchildrenvertical.getMin) == null)) {
                if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                    onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
                }
                Orientation orientation = Orientation.HORIZONTAL;
                if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                    onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
                }
                Orientation orientation2 = Orientation.HORIZONTAL;
            }
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        if (!findviewholderforadapterposition.setMax.length()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getMin.removeCallbacks(this.toIntRange);
            animate().cancel();
            animate().alpha(1.0f).setDuration(250);
        } else if (action == 1) {
            getMin.removeCallbacks(this.toIntRange);
            Handler handler = getMin;
            Runnable runnable = this.toIntRange;
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            handler.postDelayed(runnable, findviewholderforadapterposition2.setMax.valueOf);
        }
        return false;
    }

    public void onIndicatorUpdated() {
        invalidate();
    }

    public void onPageSelected(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1128006613, oncanceled);
            onCancelLoad.getMin(-1128006613, oncanceled);
        }
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        boolean IsOverlapping = IsOverlapping();
        int i2 = onchilddetachedfromwindow.invoke;
        if (IsOverlapping) {
            if (setMax()) {
                i = (i2 - 1) - i;
            }
            setSelection(i);
        }
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition.setMax.values = this.length;
        }
    }

    public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, @Nullable setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2) {
        DataSetObserver dataSetObserver;
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        if (findviewholderforadapterposition.setMax.setMin()) {
            if (!(setexpandactivityoverflowbuttondrawable == null || (dataSetObserver = this.setMax) == null)) {
                setexpandactivityoverflowbuttondrawable.unregisterDataSetObserver(dataSetObserver);
                this.setMax = null;
            }
            setMin();
        }
        getMin();
    }

    public void setCount(int i) {
        if (i >= 0) {
            findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            if (findviewholderforadapterposition.setMax.invoke != i) {
                findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
                if (findviewholderforadapterposition2.setMax == null) {
                    findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
                }
                findviewholderforadapterposition2.setMax.invoke = i;
                length();
                requestLayout();
            }
        }
    }

    public int getCount() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.invoke;
    }

    public void setDynamicCount(boolean z) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.FastBitmap$CoordinateSystem = z;
        if (z) {
            setMin();
        } else {
            getMax();
        }
    }

    public void setFadeOnIdle(boolean z) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.invokeSuspend = z;
        if (z) {
            getMin.removeCallbacks(this.toIntRange);
            Handler handler = getMin;
            Runnable runnable = this.toIntRange;
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            handler.postDelayed(runnable, findviewholderforadapterposition2.setMax.valueOf);
            return;
        }
        getMin.removeCallbacks(this.toIntRange);
        animate().cancel();
        animate().alpha(1.0f).setDuration(250);
    }

    public void setRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.getMax = (int) f;
        invalidate();
    }

    public int getRadius() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.getMax;
    }

    public void setPadding(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.length = (int) f;
        invalidate();
    }

    public int getPadding() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.length;
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.equals = f;
    }

    public float getScaleFactor() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.equals;
    }

    public void setStrokeWidth(float f) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        int i = findviewholderforadapterposition.setMax.getMax;
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = (float) i;
            if (f > f2) {
                f = f2;
            }
        }
        findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
        if (findviewholderforadapterposition2.setMax == null) {
            findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition2.setMax.toIntRange = (int) f;
        invalidate();
    }

    public int getStrokeWidth() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.toIntRange;
    }

    public void setSelectedColor(int i) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.hashCode = i;
        invalidate();
    }

    public int getSelectedColor() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.hashCode;
    }

    public void setUnselectedColor(int i) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.toString = i;
        invalidate();
    }

    public int getUnselectedColor() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.toString;
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.toDoubleRange = z;
        length();
    }

    public void setOrientation(@Nullable Orientation orientation) {
        if (orientation != null) {
            findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition.setMax.ICustomTabsCallback = orientation;
            requestLayout();
        }
    }

    public void setAnimationDuration(long j) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.Grayscale$Algorithm = j;
    }

    public void setIdleDuration(long j) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.valueOf = j;
        findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
        if (findviewholderforadapterposition2.setMax == null) {
            findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
        }
        if (findviewholderforadapterposition2.setMax.length()) {
            getMin.removeCallbacks(this.toIntRange);
            Handler handler = getMin;
            Runnable runnable = this.toIntRange;
            findViewHolderForAdapterPosition findviewholderforadapterposition3 = this.setMin.getMax;
            if (findviewholderforadapterposition3.setMax == null) {
                findviewholderforadapterposition3.setMax = new onChildDetachedFromWindow();
            }
            handler.postDelayed(runnable, findviewholderforadapterposition3.setMax.valueOf);
            return;
        }
        getMin.removeCallbacks(this.toIntRange);
        animate().cancel();
        animate().alpha(1.0f).setDuration(250);
    }

    public long getAnimationDuration() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.Grayscale$Algorithm;
    }

    public void setAnimationType(@Nullable AnimationType animationType) {
        saveOldPositions saveoldpositions = this.setMin;
        saveoldpositions.getMax.getMin.length = null;
        if (saveoldpositions.getMin != null) {
            saveoldpositions.getMin.onIndicatorUpdated();
        }
        if (animationType != null) {
            findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition.setMax.onPostMessage = animationType;
        } else {
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition2.setMax.onPostMessage = AnimationType.NONE;
        }
        invalidate();
    }

    public void setInteractiveAnimation(boolean z) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.values = z;
        this.length = z;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(@Nullable ViewPager viewPager) {
        releaseViewPager();
        if (viewPager != null) {
            this.getMax = viewPager;
            viewPager.addOnPageChangeListener(this);
            this.getMax.addOnAdapterChangeListener(this);
            this.getMax.setOnTouchListener(this);
            findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition.setMax.create = this.getMax.getId();
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            setDynamicCount(findviewholderforadapterposition2.setMax.setMin());
            getMin();
        }
    }

    public void releaseViewPager() {
        ViewPager viewPager = this.getMax;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
            this.getMax.removeOnAdapterChangeListener(this);
            this.getMax = null;
        }
    }

    public void setRtlMode(@Nullable RtlMode rtlMode) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        if (rtlMode == null) {
            onchilddetachedfromwindow.extraCallback = RtlMode.Off;
        } else {
            onchilddetachedfromwindow.extraCallback = rtlMode;
        }
        if (this.getMax != null) {
            int i = onchilddetachedfromwindow.getCause;
            if (setMax()) {
                i = (onchilddetachedfromwindow.invoke - 1) - i;
            } else {
                ViewPager viewPager = this.getMax;
                if (viewPager != null) {
                    i = viewPager.getCurrentItem();
                }
            }
            onchilddetachedfromwindow.b = i;
            onchilddetachedfromwindow.onNavigationEvent = i;
            onchilddetachedfromwindow.getCause = i;
            invalidate();
        }
    }

    public int getSelection() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        return findviewholderforadapterposition.setMax.getCause;
    }

    public void setSelection(int i) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
        if (findviewholderforadapterposition2.setMax == null) {
            findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
        }
        int i2 = findviewholderforadapterposition2.setMax.invoke - 1;
        if (i < 0) {
            i = 0;
        } else if (i > i2) {
            i = i2;
        }
        if (i != onchilddetachedfromwindow.getCause && i != onchilddetachedfromwindow.onNavigationEvent) {
            onchilddetachedfromwindow.values = false;
            onchilddetachedfromwindow.b = onchilddetachedfromwindow.getCause;
            onchilddetachedfromwindow.onNavigationEvent = i;
            onchilddetachedfromwindow.getCause = i;
            offsetPositionRecordsForMove offsetpositionrecordsformove = this.setMin.setMin;
            if (offsetpositionrecordsformove.getMax != null) {
                isAnimating isanimating = offsetpositionrecordsformove.getMax;
                if (isanimating.setMin != null) {
                    isanimating.setMin.getMin();
                }
                isAnimating isanimating2 = offsetpositionrecordsformove.getMax;
                isanimating2.getMax = false;
                isanimating2.setMax = 0.0f;
                isanimating2.setMin();
            }
        }
    }

    public void setSelected(int i) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        if (onchilddetachedfromwindow.onPostMessage == null) {
            onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        }
        AnimationType animationType = onchilddetachedfromwindow.onPostMessage;
        onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        setSelection(i);
        onchilddetachedfromwindow.onPostMessage = animationType;
    }

    public void clearSelection() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        onchilddetachedfromwindow.values = false;
        onchilddetachedfromwindow.b = -1;
        onchilddetachedfromwindow.onNavigationEvent = -1;
        onchilddetachedfromwindow.getCause = -1;
        offsetPositionRecordsForMove offsetpositionrecordsformove = this.setMin.setMin;
        if (offsetpositionrecordsformove.getMax != null) {
            isAnimating isanimating = offsetpositionrecordsformove.getMax;
            if (isanimating.setMin != null) {
                isanimating.setMin.getMin();
            }
            isAnimating isanimating2 = offsetpositionrecordsformove.getMax;
            isanimating2.getMax = false;
            isanimating2.setMax = 0.0f;
            isanimating2.setMin();
        }
    }

    public void setProgress(int i, float f) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        if (onchilddetachedfromwindow.getMin()) {
            int i2 = onchilddetachedfromwindow.invoke;
            if (i2 <= 0 || i < 0) {
                i = 0;
            } else {
                int i3 = i2 - 1;
                if (i > i3) {
                    i = i3;
                }
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f == 1.0f) {
                onchilddetachedfromwindow.b = onchilddetachedfromwindow.getCause;
                onchilddetachedfromwindow.getCause = i;
            }
            onchilddetachedfromwindow.onNavigationEvent = i;
            offsetPositionRecordsForMove offsetpositionrecordsformove = this.setMin.setMin;
            if (offsetpositionrecordsformove.getMax != null) {
                isAnimating isanimating = offsetpositionrecordsformove.getMax;
                isanimating.getMax = true;
                isanimating.setMax = f;
                isanimating.setMin();
            }
        }
    }

    public void setClickListener(@Nullable offsetChildrenVertical.setMin setmin) {
        this.setMin.getMax.getMin.setMin = setmin;
    }

    private void getMax(@Nullable AttributeSet attributeSet) {
        saveOldPositions saveoldpositions = new saveOldPositions(this);
        this.setMin = saveoldpositions;
        findViewHolderForAdapterPosition findviewholderforadapterposition = saveoldpositions.getMax;
        findviewholderforadapterposition.getMax.setMax(getContext(), attributeSet);
        findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
        if (findviewholderforadapterposition2.setMax == null) {
            findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition2.setMax;
        onchilddetachedfromwindow.setMax(getPaddingLeft());
        onchilddetachedfromwindow.isInside = getPaddingTop();
        onchilddetachedfromwindow.toFloatRange = getPaddingRight();
        onchilddetachedfromwindow.IsOverlapping = getPaddingBottom();
        this.length = onchilddetachedfromwindow.getMin();
    }

    private void setMin() {
        ViewPager viewPager;
        if (this.setMax == null && (viewPager = this.getMax) != null && viewPager.getAdapter() != null) {
            this.setMax = new DataSetObserver() {
                public final void onChanged() {
                    PageIndicatorView.this.getMin();
                }
            };
            try {
                this.getMax.getAdapter().registerDataSetObserver(this.setMax);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private void getMax() {
        ViewPager viewPager;
        if (this.setMax != null && (viewPager = this.getMax) != null && viewPager.getAdapter() != null) {
            try {
                this.getMax.getAdapter().unregisterDataSetObserver(this.setMax);
                this.setMax = null;
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void getMin() {
        ViewPager viewPager = this.getMax;
        if (viewPager != null && viewPager.getAdapter() != null) {
            int count = this.getMax.getAdapter().getCount();
            int currentItem = setMax() ? (count - 1) - this.getMax.getCurrentItem() : this.getMax.getCurrentItem();
            findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
            if (findviewholderforadapterposition.setMax == null) {
                findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition.setMax.getCause = currentItem;
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition2.setMax.onNavigationEvent = currentItem;
            findViewHolderForAdapterPosition findviewholderforadapterposition3 = this.setMin.getMax;
            if (findviewholderforadapterposition3.setMax == null) {
                findviewholderforadapterposition3.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition3.setMax.b = currentItem;
            findViewHolderForAdapterPosition findviewholderforadapterposition4 = this.setMin.getMax;
            if (findviewholderforadapterposition4.setMax == null) {
                findviewholderforadapterposition4.setMax = new onChildDetachedFromWindow();
            }
            findviewholderforadapterposition4.setMax.invoke = count;
            offsetPositionRecordsForMove offsetpositionrecordsformove = this.setMin.setMin;
            if (offsetpositionrecordsformove.getMax != null) {
                isAnimating isanimating = offsetpositionrecordsformove.getMax;
                if (isanimating.setMin != null) {
                    isanimating.setMin.getMin();
                }
            }
            length();
            requestLayout();
        }
    }

    private void length() {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        if (findviewholderforadapterposition.setMax.setMax()) {
            findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
            if (findviewholderforadapterposition2.setMax == null) {
                findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
            }
            int i = findviewholderforadapterposition2.setMax.invoke;
            int visibility = getVisibility();
            if (visibility != 0 && i > 1) {
                setVisibility(0);
            } else if (visibility != 4 && i <= 1) {
                setVisibility(4);
            }
        }
    }

    /* renamed from: com.rd.PageIndicatorView$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.rd.draw.data.RtlMode[] r0 = com.rd.draw.data.RtlMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                com.rd.draw.data.RtlMode r1 = com.rd.draw.data.RtlMode.On     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.draw.data.RtlMode r1 = com.rd.draw.data.RtlMode.Off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.draw.data.RtlMode r1 = com.rd.draw.data.RtlMode.Auto     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.AnonymousClass3.<clinit>():void");
        }
    }

    private boolean setMax() {
        int[] iArr = AnonymousClass3.length;
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        if (onchilddetachedfromwindow.extraCallback == null) {
            onchilddetachedfromwindow.extraCallback = RtlMode.Off;
        }
        int i = iArr[onchilddetachedfromwindow.extraCallback.ordinal()];
        if (i != 1) {
            return i == 3 && setTitle.setMax(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    private boolean IsOverlapping() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    public void onPageScrolled(int i, float f, int i2) {
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = findviewholderforadapterposition.setMax;
        if (onchilddetachedfromwindow.onPostMessage == null) {
            onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        }
        boolean z = false;
        if (IsOverlapping() && onchilddetachedfromwindow.getMin() && onchilddetachedfromwindow.onPostMessage != AnimationType.NONE) {
            boolean max = setMax();
            int i3 = onchilddetachedfromwindow.invoke;
            int i4 = onchilddetachedfromwindow.getCause;
            if (max) {
                i = (i3 - 1) - i;
            }
            if (i < 0) {
                i = 0;
            } else {
                int i5 = i3 - 1;
                if (i > i5) {
                    i = i5;
                }
            }
            boolean z2 = i > i4;
            boolean z3 = !max ? i + 1 < i4 : i + -1 < i4;
            if (z2 || z3) {
                onchilddetachedfromwindow.getCause = i;
                i4 = i;
            }
            float f2 = 0.0f;
            if (i4 == i && f != 0.0f) {
                z = true;
            }
            if (z) {
                i = max ? i - 1 : i + 1;
            } else {
                f = 1.0f - f;
            }
            if (f > 1.0f) {
                f2 = 1.0f;
            } else if (f >= 0.0f) {
                f2 = f;
            }
            Pair pair = new Pair(Integer.valueOf(i), Float.valueOf(f2));
            setProgress(((Integer) pair.first).intValue(), ((Float) pair.second).floatValue());
        }
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.getMax = applyDimension;
        invalidate();
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition.setMax.length = applyDimension;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int applyDimension = (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
        findViewHolderForAdapterPosition findviewholderforadapterposition = this.setMin.getMax;
        if (findviewholderforadapterposition.setMax == null) {
            findviewholderforadapterposition.setMax = new onChildDetachedFromWindow();
        }
        int i2 = findviewholderforadapterposition.setMax.getMax;
        if (applyDimension < 0) {
            applyDimension = 0;
        } else if (applyDimension > i2) {
            applyDimension = i2;
        }
        findViewHolderForAdapterPosition findviewholderforadapterposition2 = this.setMin.getMax;
        if (findviewholderforadapterposition2.setMax == null) {
            findviewholderforadapterposition2.setMax = new onChildDetachedFromWindow();
        }
        findviewholderforadapterposition2.setMax.toIntRange = applyDimension;
        invalidate();
    }

    static /* synthetic */ void access$200(PageIndicatorView pageIndicatorView) {
        pageIndicatorView.animate().cancel();
        pageIndicatorView.animate().alpha(0.0f).setDuration(250);
    }
}
