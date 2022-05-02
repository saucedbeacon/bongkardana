package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.Direction;
import java.util.Locale;

public class onItemsAdded extends RecyclerView.IsOverlapping {
    protected int FastBitmap$CoordinateSystem = -1;
    public int Grayscale$Algorithm = 2100;
    private int ICustomTabsCallback;
    protected int IsOverlapping;
    public int Mean$Arithmetic = 300;
    private int b;
    private Context create;
    protected int equals;
    @NonNull
    private final getMin extraCallback;
    private boolean getCause;
    protected Point getMax = new Point();
    protected Point getMin = new Point();
    protected SparseArray<View> hashCode = new SparseArray<>();
    public onItemsMoved invoke;
    public boolean invokeSuspend = false;
    protected int isInside;
    protected int length;
    private int onMessageChannelReady;
    private int onNavigationEvent;
    protected Point setMax = new Point();
    protected int setMin;
    protected int toDoubleRange = -1;
    protected int toFloatRange;
    protected int toIntRange;
    protected boolean toString;
    public stopSmoothScroller valueOf;
    public DSVOrientation.length values;

    public interface getMin {
        void getMax();

        void getMin();

        void getMin(float f);

        void length(boolean z);

        void setMax();

        void setMin();
    }

    public interface setMin {
        int getMin();
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public onItemsAdded(@NonNull Context context, @NonNull getMin getmin, @NonNull DSVOrientation dSVOrientation) {
        this.create = context;
        this.extraCallback = getmin;
        this.values = dSVOrientation.createHelper();
        this.invoke = new onItemsMoved(this);
        this.b = 1;
    }

    public void onLayoutCompleted(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.toString) {
            this.extraCallback.setMax();
            this.toString = false;
        } else if (this.getCause) {
            this.extraCallback.getMin();
            this.getCause = false;
        }
    }

    private void setMin(RecyclerView.toDoubleRange todoublerange) {
        setMax();
        this.values.setMax(this.getMax, this.isInside, this.getMin);
        int length2 = this.values.length(this.invoke.length.getWidth(), this.invoke.length.getHeight());
        if (getMax(this.getMin, length2)) {
            setMin(todoublerange, this.FastBitmap$CoordinateSystem, this.getMin);
        }
        getMax(todoublerange, Direction.START, length2);
        getMax(todoublerange, Direction.END, length2);
        length(todoublerange);
    }

    private void getMax(RecyclerView.toDoubleRange todoublerange, Direction direction, int i) {
        int applyTo = direction.applyTo(1);
        int i2 = this.toDoubleRange;
        boolean z = i2 == -1 || !direction.sameAs(i2 - this.FastBitmap$CoordinateSystem);
        this.setMax.set(this.getMin.x, this.getMin.y);
        int i3 = this.FastBitmap$CoordinateSystem;
        while (true) {
            i3 += applyTo;
            if (getMax(i3)) {
                if (i3 == this.toDoubleRange) {
                    z = true;
                }
                this.values.getMax(direction, this.toIntRange, this.setMax);
                if (getMax(this.setMax, i)) {
                    setMin(todoublerange, i3, this.setMax);
                } else if (z) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void setMin(RecyclerView.toDoubleRange todoublerange, int i, Point point) {
        if (i >= 0) {
            View view = this.hashCode.get(i);
            if (view == null) {
                onItemsMoved onitemsmoved = this.invoke;
                View max = todoublerange.setMax(i);
                onitemsmoved.length.addView(max);
                onitemsmoved.length.measureChildWithMargins(max, 0, 0);
                this.invoke.length.layoutDecoratedWithMargins(max, point.x - this.setMin, point.y - this.length, point.x + this.setMin, point.y + this.length);
                return;
            }
            this.invoke.length.attachView(view);
            this.hashCode.remove(i);
        }
    }

    private void setMax() {
        this.hashCode.clear();
        for (int i = 0; i < this.invoke.length.getChildCount(); i++) {
            View childAt = this.invoke.length.getChildAt(i);
            this.hashCode.put(this.invoke.length.getPosition(childAt), childAt);
        }
        for (int i2 = 0; i2 < this.hashCode.size(); i2++) {
            this.invoke.length.detachView(this.hashCode.valueAt(i2));
        }
    }

    private void length(RecyclerView.toDoubleRange todoublerange) {
        for (int i = 0; i < this.hashCode.size(); i++) {
            todoublerange.length(this.hashCode.valueAt(i));
        }
        this.hashCode.clear();
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.FastBitmap$CoordinateSystem;
        if (i3 == -1) {
            i3 = 0;
        } else if (i3 >= i) {
            i3 = Math.min(i3 + i2, this.invoke.length.getItemCount() - 1);
        }
        if (this.FastBitmap$CoordinateSystem != i3) {
            this.FastBitmap$CoordinateSystem = i3;
            this.getCause = true;
        }
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.FastBitmap$CoordinateSystem;
        if (this.invoke.length.getItemCount() == 0) {
            i3 = -1;
        } else {
            int i4 = this.FastBitmap$CoordinateSystem;
            if (i4 >= i) {
                if (i4 < i + i2) {
                    this.FastBitmap$CoordinateSystem = -1;
                }
                i3 = Math.max(0, this.FastBitmap$CoordinateSystem - i2);
            }
        }
        if (this.FastBitmap$CoordinateSystem != i3) {
            this.FastBitmap$CoordinateSystem = i3;
            this.getCause = true;
        }
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.FastBitmap$CoordinateSystem = Math.min(Math.max(0, this.FastBitmap$CoordinateSystem), this.invoke.length.getItemCount() - 1);
        this.getCause = true;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return length(i, todoublerange);
    }

    public int scrollVerticallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return length(i, todoublerange);
    }

    private int length(int i, RecyclerView.toDoubleRange todoublerange) {
        Direction fromDelta;
        int max;
        if (this.invoke.length.getChildCount() == 0 || (max = getMax(fromDelta)) <= 0) {
            return 0;
        }
        int applyTo = (fromDelta = Direction.fromDelta(i)).applyTo(Math.min(max, Math.abs(i)));
        this.isInside += applyTo;
        int i2 = this.IsOverlapping;
        if (i2 != 0) {
            this.IsOverlapping = i2 - applyTo;
        }
        this.values.getMin(-applyTo, this.invoke);
        if (this.values.getMax(this)) {
            setMin(todoublerange);
        }
        toFloatRange();
        IsOverlapping();
        return applyTo;
    }

    private void IsOverlapping() {
        if (this.valueOf != null) {
            int i = this.toIntRange * this.b;
            for (int i2 = 0; i2 < this.invoke.length.getChildCount(); i2++) {
                getMin(this.invoke.length.getChildAt(i2), i);
            }
        }
    }

    public void scrollToPosition(int i) {
        if (this.FastBitmap$CoordinateSystem != i) {
            this.FastBitmap$CoordinateSystem = i;
            this.invoke.length.requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        int i2;
        int i3;
        if (this.FastBitmap$CoordinateSystem != i && this.toDoubleRange == -1) {
            if (i >= 0) {
                if (recyclerView$Mean$Arithmetic.equals) {
                    i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                } else {
                    i3 = recyclerView$Mean$Arithmetic.setMin;
                }
                if (i < i3) {
                    if (this.FastBitmap$CoordinateSystem == -1) {
                        this.FastBitmap$CoordinateSystem = i;
                        return;
                    } else {
                        setMax(i);
                        return;
                    }
                }
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            if (recyclerView$Mean$Arithmetic.equals) {
                i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i2 = recyclerView$Mean$Arithmetic.setMin;
            }
            objArr[1] = Integer.valueOf(i2);
            throw new IllegalArgumentException(String.format(locale, "target position out of bounds: position=%d, itemCount=%d", objArr));
        }
    }

    public boolean canScrollHorizontally() {
        return this.values.setMax();
    }

    public boolean canScrollVertically() {
        return this.values.setMin();
    }

    public void onScrollStateChanged(int i) {
        int i2 = this.toFloatRange;
        if (i2 == 0 && i2 != i) {
            this.extraCallback.getMax();
        }
        if (i == 0) {
            if (equals()) {
                this.extraCallback.setMin();
            } else {
                return;
            }
        } else if (i == 1) {
            if (Math.abs(this.isInside) > this.toIntRange) {
                int i3 = this.isInside;
                int i4 = this.toIntRange;
                int i5 = i3 / i4;
                this.FastBitmap$CoordinateSystem += i5;
                this.isInside = i3 - (i5 * i4);
            }
            if (isInside()) {
                this.FastBitmap$CoordinateSystem += Direction.fromDelta(this.isInside).applyTo(1);
                this.isInside = -Direction.fromDelta(this.isInside).applyTo(this.toIntRange - Math.abs(this.isInside));
            }
            this.toDoubleRange = -1;
            this.IsOverlapping = 0;
        }
        this.toFloatRange = i;
    }

    private boolean equals() {
        int i = this.toDoubleRange;
        if (i != -1) {
            this.FastBitmap$CoordinateSystem = i;
            this.toDoubleRange = -1;
            this.isInside = 0;
        }
        Direction fromDelta = Direction.fromDelta(this.isInside);
        if (Math.abs(this.isInside) == this.toIntRange) {
            this.FastBitmap$CoordinateSystem += fromDelta.applyTo(1);
            this.isInside = 0;
        }
        if (isInside()) {
            this.IsOverlapping = Direction.fromDelta(this.isInside).applyTo(this.toIntRange - Math.abs(this.isInside));
        } else {
            this.IsOverlapping = -this.isInside;
        }
        if (this.IsOverlapping == 0) {
            return true;
        }
        setMax setmax = new setMax(this.create);
        setmax.setTargetPosition(this.FastBitmap$CoordinateSystem);
        this.invoke.length.startSmoothScroll(setmax);
        return false;
    }

    public final void getMax(int i, int i2) {
        int min = this.values.setMin(i, i2);
        boolean z = true;
        int applyTo = this.FastBitmap$CoordinateSystem + Direction.fromDelta(min).applyTo(this.invokeSuspend ? Math.abs(min / this.Grayscale$Algorithm) : 1);
        int itemCount = this.invoke.length.getItemCount();
        if (this.FastBitmap$CoordinateSystem == 0 || applyTo >= 0) {
            int i3 = itemCount - 1;
            if (this.FastBitmap$CoordinateSystem != i3 && applyTo >= itemCount) {
                applyTo = i3;
            }
        } else {
            applyTo = 0;
        }
        if (!(min * this.isInside >= 0) || !getMax(applyTo)) {
            z = false;
        }
        if (z) {
            setMax(applyTo);
            return;
        }
        int i4 = -this.isInside;
        this.IsOverlapping = i4;
        if (i4 != 0) {
            setMax setmax = new setMax(this.create);
            setmax.setTargetPosition(this.FastBitmap$CoordinateSystem);
            this.invoke.length.startSmoothScroll(setmax);
        }
    }

    public final void setMin() {
        int i = -this.isInside;
        this.IsOverlapping = i;
        if (i != 0) {
            setMax setmax = new setMax(this.create);
            setmax.setTargetPosition(this.FastBitmap$CoordinateSystem);
            this.invoke.length.startSmoothScroll(setmax);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getMax(com.yarolegovich.discretescrollview.Direction r5) {
        /*
            r4 = this;
            int r0 = r4.IsOverlapping
            if (r0 == 0) goto L_0x0009
            int r5 = java.lang.Math.abs(r0)
            return r5
        L_0x0009:
            int r0 = r4.isInside
            int r0 = r5.applyTo(r0)
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.yarolegovich.discretescrollview.Direction r3 = com.yarolegovich.discretescrollview.Direction.START
            if (r5 != r3) goto L_0x0030
            int r3 = r4.FastBitmap$CoordinateSystem
            if (r3 != 0) goto L_0x0030
            int r5 = r4.isInside
            if (r5 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            int r5 = r4.isInside
            int r2 = java.lang.Math.abs(r5)
        L_0x002d:
            r5 = r2
            r2 = r1
            goto L_0x0066
        L_0x0030:
            com.yarolegovich.discretescrollview.Direction r3 = com.yarolegovich.discretescrollview.Direction.END
            if (r5 != r3) goto L_0x0051
            int r5 = r4.FastBitmap$CoordinateSystem
            o.onItemsMoved r3 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r3 = r3.length
            int r3 = r3.getItemCount()
            int r3 = r3 - r1
            if (r5 != r3) goto L_0x0051
            int r5 = r4.isInside
            if (r5 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x004a
            goto L_0x002d
        L_0x004a:
            int r5 = r4.isInside
            int r2 = java.lang.Math.abs(r5)
            goto L_0x002d
        L_0x0051:
            if (r0 == 0) goto L_0x005d
            int r5 = r4.toIntRange
            int r0 = r4.isInside
            int r0 = java.lang.Math.abs(r0)
            int r5 = r5 - r0
            goto L_0x0066
        L_0x005d:
            int r5 = r4.toIntRange
            int r0 = r4.isInside
            int r0 = java.lang.Math.abs(r0)
            int r5 = r5 + r0
        L_0x0066:
            o.onItemsAdded$getMin r0 = r4.extraCallback
            r0.length(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onItemsAdded.getMax(com.yarolegovich.discretescrollview.Direction):int");
    }

    private void toIntRange() {
        setMax setmax = new setMax(this.create);
        setmax.setTargetPosition(this.FastBitmap$CoordinateSystem);
        this.invoke.length.startSmoothScroll(setmax);
    }

    private void setMax(int i) {
        int i2 = this.FastBitmap$CoordinateSystem;
        if (i2 != i) {
            this.IsOverlapping = -this.isInside;
            this.IsOverlapping += Direction.fromDelta(i - i2).applyTo(Math.abs(i - this.FastBitmap$CoordinateSystem) * this.toIntRange);
            this.toDoubleRange = i;
            toIntRange();
        }
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.toDoubleRange = -1;
        this.IsOverlapping = 0;
        this.isInside = 0;
        if (adapter2 instanceof setMin) {
            this.FastBitmap$CoordinateSystem = ((setMin) adapter2).getMin();
        } else {
            this.FastBitmap$CoordinateSystem = 0;
        }
        this.invoke.length.removeAllViews();
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        int i = this.toDoubleRange;
        if (i != -1) {
            this.FastBitmap$CoordinateSystem = i;
        }
        bundle.putInt("extra_position", this.FastBitmap$CoordinateSystem);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        this.FastBitmap$CoordinateSystem = ((Bundle) parcelable).getInt("extra_position");
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final int getMin() {
        int i = this.isInside;
        if (i == 0) {
            return this.FastBitmap$CoordinateSystem;
        }
        int i2 = this.toDoubleRange;
        if (i2 != -1) {
            return i2;
        }
        return this.FastBitmap$CoordinateSystem + Direction.fromDelta(i).applyTo(1);
    }

    public final void setMin(int i) {
        this.ICustomTabsCallback = i;
        this.equals = this.toIntRange * i;
        this.invoke.length.requestLayout();
    }

    public final void getMin(int i) {
        this.b = i;
        IsOverlapping();
    }

    public final int getMax() {
        return this.FastBitmap$CoordinateSystem;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.invoke.length.getChildCount() > 0) {
            startSupportActionMode max = AccessibilityEventCompat.setMax(accessibilityEvent);
            max.setMin(getPosition(this.invoke.length.getChildAt(0)));
            onItemsMoved onitemsmoved = this.invoke;
            max.length(getPosition(onitemsmoved.length.getChildAt(onitemsmoved.length.getChildCount() - 1)));
        }
    }

    private float getMin(View view, int i) {
        return Math.min(Math.max(-1.0f, this.values.setMax(this.getMax, getDecoratedLeft(view) + this.setMin, getDecoratedTop(view) + this.length) / ((float) i)), 1.0f);
    }

    private boolean isInside() {
        return ((float) Math.abs(this.isInside)) >= ((float) this.toIntRange) * 0.6f;
    }

    public final int length() {
        return this.equals;
    }

    private void toFloatRange() {
        int abs = this.toDoubleRange != -1 ? Math.abs(this.isInside + this.IsOverlapping) : this.toIntRange;
        this.extraCallback.getMin(-Math.min(Math.max(-1.0f, ((float) this.isInside) / ((float) abs)), 1.0f));
    }

    private boolean getMax(int i) {
        return i >= 0 && i < this.invoke.length.getItemCount();
    }

    private boolean getMax(Point point, int i) {
        return this.values.getMax(point, this.setMin, this.length, i, this.equals);
    }

    class setMax extends performShortcut {
        public setMax(Context context) {
            super(context);
        }

        public final int calculateDxToMakeVisible(View view, int i) {
            return onItemsAdded.this.values.length(-onItemsAdded.this.IsOverlapping);
        }

        public final int calculateDyToMakeVisible(View view, int i) {
            return onItemsAdded.this.values.setMin(-onItemsAdded.this.IsOverlapping);
        }

        public final int calculateTimeForScrolling(int i) {
            return (int) (Math.max(0.01f, ((float) Math.min(Math.abs(i), onItemsAdded.this.toIntRange)) / ((float) onItemsAdded.this.toIntRange)) * ((float) onItemsAdded.this.Mean$Arithmetic));
        }

        @Nullable
        public final PointF computeScrollVectorForPosition(int i) {
            return new PointF((float) onItemsAdded.this.values.length(onItemsAdded.this.IsOverlapping), (float) onItemsAdded.this.values.setMin(onItemsAdded.this.IsOverlapping));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0 >= r1) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.toDoubleRange r5, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r6) {
        /*
            r4 = this;
            boolean r0 = r6.equals
            if (r0 == 0) goto L_0x000a
            int r0 = r6.setMax
            int r1 = r6.getMax
            int r0 = r0 - r1
            goto L_0x000c
        L_0x000a:
            int r0 = r6.setMin
        L_0x000c:
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L_0x0020
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            r6.removeAndRecycleAllViews(r5)
            r4.toDoubleRange = r1
            r4.FastBitmap$CoordinateSystem = r1
            r4.IsOverlapping = r2
            r4.isInside = r2
            return
        L_0x0020:
            int r0 = r4.FastBitmap$CoordinateSystem
            if (r0 == r1) goto L_0x0032
            boolean r1 = r6.equals
            if (r1 == 0) goto L_0x002e
            int r1 = r6.setMax
            int r3 = r6.getMax
            int r1 = r1 - r3
            goto L_0x0030
        L_0x002e:
            int r1 = r6.setMin
        L_0x0030:
            if (r0 < r1) goto L_0x0034
        L_0x0032:
            r4.FastBitmap$CoordinateSystem = r2
        L_0x0034:
            boolean r6 = r6.length()
            r0 = 1
            if (r6 != 0) goto L_0x0055
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            int r6 = r6.getWidth()
            int r1 = r4.onNavigationEvent
            if (r6 != r1) goto L_0x0053
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            int r6 = r6.getHeight()
            int r1 = r4.onMessageChannelReady
            if (r6 == r1) goto L_0x0055
        L_0x0053:
            r6 = 1
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            if (r6 == 0) goto L_0x0073
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            int r6 = r6.getWidth()
            r4.onNavigationEvent = r6
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            int r6 = r6.getHeight()
            r4.onMessageChannelReady = r6
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            r6.removeAllViews()
        L_0x0073:
            android.graphics.Point r6 = r4.getMax
            o.onItemsMoved r1 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r1 = r1.length
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            o.onItemsMoved r3 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r3 = r3.length
            int r3 = r3.getHeight()
            int r3 = r3 / 2
            r6.set(r1, r3)
            boolean r6 = r4.toString
            if (r6 != 0) goto L_0x00f5
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            int r6 = r6.getChildCount()
            if (r6 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r4.toString = r0
            if (r0 == 0) goto L_0x00f5
            o.onItemsMoved r6 = r4.invoke
            android.view.View r0 = r5.setMax((int) r2)
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r1 = r6.length
            r1.addView(r0)
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            r6.measureChildWithMargins(r0, r2, r2)
            o.onItemsMoved r6 = r4.invoke
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            int r6 = r6.getDecoratedMeasuredWidth(r0)
            int r2 = r1.leftMargin
            int r6 = r6 + r2
            int r1 = r1.rightMargin
            int r6 = r6 + r1
            o.onItemsMoved r1 = r4.invoke
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r1 = r1.length
            int r1 = r1.getDecoratedMeasuredHeight(r0)
            int r3 = r2.topMargin
            int r1 = r1 + r3
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r2 = r6 / 2
            r4.setMin = r2
            int r2 = r1 / 2
            r4.length = r2
            com.yarolegovich.discretescrollview.DSVOrientation$length r2 = r4.values
            int r6 = r2.getMin((int) r6, (int) r1)
            r4.toIntRange = r6
            int r1 = r4.ICustomTabsCallback
            int r6 = r6 * r1
            r4.equals = r6
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            r6.detachAndScrapView(r0, r5)
        L_0x00f5:
            o.onItemsMoved r6 = r4.invoke
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r6 = r6.length
            r6.detachAndScrapAttachedViews(r5)
            r4.setMin((androidx.recyclerview.widget.RecyclerView.toDoubleRange) r5)
            r4.IsOverlapping()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onItemsAdded.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$toDoubleRange, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic):void");
    }

    public int computeVerticalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getItemCount() == 0) {
            return 0;
        }
        return this.toIntRange * (getItemCount() - 1);
    }

    public int computeVerticalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i = 0;
        if (getItemCount() != 0) {
            if (getItemCount() != 0) {
                i = (getItemCount() - 1) * this.toIntRange;
            }
            i = (int) (((float) i) / ((float) getItemCount()));
        }
        return (this.FastBitmap$CoordinateSystem * i) + ((int) ((((float) this.isInside) / ((float) this.toIntRange)) * ((float) i)));
    }

    public int computeVerticalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i = 0;
        if (getItemCount() == 0) {
            return 0;
        }
        if (getItemCount() != 0) {
            i = (getItemCount() - 1) * this.toIntRange;
        }
        return (int) (((float) i) / ((float) getItemCount()));
    }

    public int computeHorizontalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getItemCount() == 0) {
            return 0;
        }
        return this.toIntRange * (getItemCount() - 1);
    }

    public int computeHorizontalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i = 0;
        if (getItemCount() != 0) {
            if (getItemCount() != 0) {
                i = (getItemCount() - 1) * this.toIntRange;
            }
            i = (int) (((float) i) / ((float) getItemCount()));
        }
        return (this.FastBitmap$CoordinateSystem * i) + ((int) ((((float) this.isInside) / ((float) this.toIntRange)) * ((float) i)));
    }

    public int computeHorizontalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i = 0;
        if (getItemCount() == 0) {
            return 0;
        }
        if (getItemCount() != 0) {
            i = (getItemCount() - 1) * this.toIntRange;
        }
        return (int) (((float) i) / ((float) getItemCount()));
    }
}
