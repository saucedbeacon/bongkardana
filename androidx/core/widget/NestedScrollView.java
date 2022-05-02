package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import o.fromInclusive;
import o.getDrawerToggleDelegate;
import o.onDestroy;
import o.onSupportActionModeFinished;
import o.setInverseBackgroundForced;
import o.setOnCancelListener;
import o.setTheme;
import o.setView;
import o.show;
import o.startSupportActionMode;

public class NestedScrollView extends FrameLayout implements setTheme, setInverseBackgroundForced {
    static final int ANIMATED_SCROLL_GAP = 250;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final int[] b = {16843130};
    private static final getMax getCause = new getMax();
    private int FastBitmap$CoordinateSystem;
    private final int[] Grayscale$Algorithm;
    private int ICustomTabsCallback;
    private boolean IsOverlapping;
    private int Mean$Arithmetic;
    private final show create;
    private boolean equals;
    private final setView extraCallback;
    private long getMax;
    private final Rect getMin;
    private VelocityTracker hashCode;
    private int invoke;
    private final int[] invokeSuspend;
    private boolean isInside;
    private EdgeEffect length;
    private setMax onMessageChannelReady;
    private SavedState onNavigationEvent;
    private float onRelationshipValidationResult;
    private EdgeEffect setMax;
    private OverScroller setMin;
    private int toDoubleRange;
    private View toFloatRange;
    private int toIntRange;
    private boolean toString;
    private int valueOf;
    private boolean values;

    public interface setMax {
        void setMax(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, fromInclusive.length.setMax);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getMin = new Rect();
        this.IsOverlapping = true;
        this.isInside = false;
        this.toFloatRange = null;
        this.equals = false;
        this.toString = true;
        this.valueOf = -1;
        this.invokeSuspend = new int[2];
        this.Grayscale$Algorithm = new int[2];
        this.setMin = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.toDoubleRange = viewConfiguration.getScaledTouchSlop();
        this.FastBitmap$CoordinateSystem = viewConfiguration.getScaledMinimumFlingVelocity();
        this.Mean$Arithmetic = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.create = new show();
        this.extraCallback = new setView(this);
        setNestedScrollingEnabled(true);
        ViewCompat.getMin((View) this, (setOnCancelListener) getCause);
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @NonNull int[] iArr2) {
        this.extraCallback.length(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean startNestedScroll(int i, int i2) {
        return this.extraCallback.setMin(i, i2);
    }

    public void stopNestedScroll(int i) {
        setView setview = this.extraCallback;
        ViewParent min = setview.setMin(i);
        if (min != null) {
            onDestroy.setMin(min, setview.setMax, i);
            setview.setMin(i, (ViewParent) null);
        }
    }

    public boolean hasNestedScrollingParent(int i) {
        return this.extraCallback.getMax(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.extraCallback.getMax(i, i2, i3, i4, iArr, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.extraCallback.length(i, i2, iArr, iArr2, i3);
    }

    public void setNestedScrollingEnabled(boolean z) {
        setView setview = this.extraCallback;
        if (setview.setMin) {
            ViewCompat.asBinder(setview.setMax);
        }
        setview.setMin = z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.extraCallback.getMin();
    }

    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.extraCallback.setMax(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.extraCallback.getMin(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.extraCallback.length(f, f2);
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        getMax(i4, i5, iArr);
    }

    private void getMax(int i, int i2, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.extraCallback.length(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        show show = this.create;
        if (i2 == 1) {
            show.length = i;
        } else {
            show.getMax = i;
        }
        startNestedScroll(2, i2);
    }

    public void onStopNestedScroll(@NonNull View view, int i) {
        show show = this.create;
        if (i == 1) {
            show.length = 0;
        } else {
            show.getMax = 0;
        }
        stopNestedScroll(i);
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        getMax(i4, i5, (int[]) null);
    }

    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, (int[]) null, i3);
    }

    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        getMax(i4, 0, (int[]) null);
    }

    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        fling((int) f2);
        return true;
    }

    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        show show = this.create;
        return show.length | show.getMax;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * MAX_SCROLL_FACTOR);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(@Nullable setMax setmax) {
        this.onMessageChannelReady = setmax;
    }

    private boolean getMax() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public boolean isFillViewport() {
        return this.values;
    }

    public void setFillViewport(boolean z) {
        if (z != this.values) {
            this.values = z;
            requestLayout();
        }
    }

    public boolean isSmoothScrollingEnabled() {
        return this.toString;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.toString = z;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        setMax setmax = this.onMessageChannelReady;
        if (setmax != null) {
            setmax.setMax(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.values && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        this.getMin.setEmpty();
        boolean max = getMax();
        int i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (!max) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    pageScroll(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return arrowScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                } else {
                    return fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                }
            } else if (!keyEvent.isAltPressed()) {
                return arrowScroll(33);
            } else {
                return fullScroll(33);
            }
        }
    }

    private boolean setMax(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        if (action == 2 && this.equals) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.valueOf;
                    if (!(i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1)) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.toIntRange) > this.toDoubleRange && (2 & getNestedScrollAxes()) == 0) {
                            this.equals = true;
                            this.toIntRange = y;
                            if (this.hashCode == null) {
                                this.hashCode = VelocityTracker.obtain();
                            }
                            this.hashCode.addMovement(motionEvent);
                            this.invoke = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        setMin(motionEvent);
                    }
                }
            }
            this.equals = false;
            this.valueOf = -1;
            VelocityTracker velocityTracker = this.hashCode;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.hashCode = null;
            }
            if (this.setMin.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.equals(this);
            }
            stopNestedScroll(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!setMax((int) motionEvent.getX(), y2)) {
                this.equals = false;
                VelocityTracker velocityTracker2 = this.hashCode;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.hashCode = null;
                }
            } else {
                this.toIntRange = y2;
                this.valueOf = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker3 = this.hashCode;
                if (velocityTracker3 == null) {
                    this.hashCode = VelocityTracker.obtain();
                } else {
                    velocityTracker3.clear();
                }
                this.hashCode.addMovement(motionEvent);
                this.setMin.computeScrollOffset();
                this.equals = !this.setMin.isFinished();
                startNestedScroll(2, 0);
            }
        }
        return this.equals;
    }

    private void setMin(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.valueOf) {
            int i = actionIndex == 0 ? 1 : 0;
            this.toIntRange = (int) motionEvent.getY(i);
            this.valueOf = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.hashCode;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.equals) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                if (this.onRelationshipValidationResult == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.onRelationshipValidationResult = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * this.onRelationshipValidationResult));
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean overScrollByCompat(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.hasNestedScrollingParent(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.setMin
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0087
            if (r1 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            return r4
        L_0x0087:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.overScrollByCompat(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public boolean pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.getMin.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.getMin.top + height > bottom) {
                    this.getMin.top = bottom - height;
                }
            }
        } else {
            this.getMin.top = getScrollY() - height;
            if (this.getMin.top < 0) {
                this.getMin.top = 0;
            }
        }
        Rect rect = this.getMin;
        rect.bottom = rect.top + height;
        return length(i, this.getMin.top, this.getMin.bottom);
    }

    public boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.getMin.top = 0;
        this.getMin.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.getMin.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.getMin;
            rect.top = rect.bottom - height;
        }
        return length(i, this.getMin.top, this.getMin.bottom);
    }

    private boolean length(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z2 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        View view = null;
        int size = focusables.size();
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z4 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            int i9 = z2 ? i5 - scrollY : i6 - i7;
            if (i9 != 0) {
                if (this.toString) {
                    smoothScrollBy(0, i9);
                } else {
                    scrollBy(0, i9);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }

    public boolean arrowScroll(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !length(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            if (maxScrollAmount != 0) {
                if (this.toString) {
                    smoothScrollBy(0, maxScrollAmount);
                } else {
                    scrollBy(0, maxScrollAmount);
                }
            }
        } else {
            findNextFocus.getDrawingRect(this.getMin);
            offsetDescendantRectToMyCoords(findNextFocus, this.getMin);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.getMin);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                if (this.toString) {
                    smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                } else {
                    scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                }
            }
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !setMax(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    private boolean setMax(View view) {
        return !length(view, 0, getHeight());
    }

    private boolean length(View view, int i, int i2) {
        view.getDrawingRect(this.getMin);
        offsetDescendantRectToMyCoords(view, this.getMin);
        return this.getMin.bottom + i >= getScrollY() && this.getMin.top - i <= getScrollY() + i2;
    }

    public final void smoothScrollBy(int i, int i2) {
        setMax(i, i2, 250, false);
    }

    public final void smoothScrollBy(int i, int i2, int i3) {
        setMax(i, i2, i3, false);
    }

    private void setMax(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.getMax > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.setMin;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                if (z) {
                    startNestedScroll(2, 1);
                } else {
                    stopNestedScroll(1);
                }
                this.ICustomTabsCallback = getScrollY();
                ViewCompat.equals(this);
            } else {
                if (!this.setMin.isFinished()) {
                    this.setMin.abortAnimation();
                    stopNestedScroll(1);
                }
                scrollBy(i, i2);
            }
            this.getMax = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 250, false);
    }

    public final void smoothScrollTo(int i, int i2, int i3) {
        smoothScrollTo(i, i2, i3, false);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2, boolean z) {
        smoothScrollTo(i, i2, 250, z);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2, int i3, boolean z) {
        setMax(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void computeScroll() {
        if (!this.setMin.isFinished()) {
            this.setMin.computeScrollOffset();
            int currY = this.setMin.getCurrY();
            int i = currY - this.ICustomTabsCallback;
            this.ICustomTabsCallback = currY;
            int[] iArr = this.Grayscale$Algorithm;
            boolean z = false;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.Grayscale$Algorithm[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                overScrollByCompat(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.Grayscale$Algorithm;
                iArr2[1] = 0;
                dispatchNestedScroll(0, scrollY2, 0, i3, this.invokeSuspend, 1, iArr2);
                i2 = i3 - this.Grayscale$Algorithm[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    length();
                    if (i2 < 0) {
                        if (this.length.isFinished()) {
                            this.length.onAbsorb((int) this.setMin.getCurrVelocity());
                        }
                    } else if (this.setMax.isFinished()) {
                        this.setMax.onAbsorb((int) this.setMin.getCurrVelocity());
                    }
                }
                this.setMin.abortAnimation();
                stopNestedScroll(1);
            }
            if (!this.setMin.isFinished()) {
                ViewCompat.equals(this);
            } else {
                stopNestedScroll(1);
            }
        }
    }

    private void setMin(View view) {
        view.getDrawingRect(this.getMin);
        offsetDescendantRectToMyCoords(view, this.getMin);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.getMin);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private boolean getMin(Rect rect, boolean z) {
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = computeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            } else {
                smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.IsOverlapping) {
            setMin(view2);
        } else {
            this.toFloatRange = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !setMax(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return getMin(rect, z);
    }

    public void requestLayout() {
        this.IsOverlapping = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.IsOverlapping = false;
        View view = this.toFloatRange;
        if (view != null && setMax(view, (View) this)) {
            setMin(this.toFloatRange);
        }
        this.toFloatRange = null;
        if (!this.isInside) {
            if (this.onNavigationEvent != null) {
                scrollTo(getScrollX(), this.onNavigationEvent.getMax);
                this.onNavigationEvent = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.isInside = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isInside = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && length(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.getMin);
            offsetDescendantRectToMyCoords(findFocus, this.getMin);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.getMin);
            if (computeScrollDeltaToGetChildRectOnScreen == 0) {
                return;
            }
            if (this.toString) {
                smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            } else {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
    }

    private static boolean setMax(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !setMax((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public void fling(int i) {
        if (getChildCount() > 0) {
            this.setMin.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            startNestedScroll(2, 1);
            this.ICustomTabsCallback = getScrollY();
            ViewCompat.equals(this);
        }
    }

    private void getMin() {
        this.equals = false;
        VelocityTracker velocityTracker = this.hashCode;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.hashCode = null;
        }
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.length;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.setMax.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    private void length() {
        if (getOverScrollMode() == 2) {
            this.length = null;
            this.setMax = null;
        } else if (this.length == null) {
            Context context = getContext();
            this.length = new EdgeEffect(context);
            this.setMax = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.length != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.length.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.length.setSize(width, height);
                if (this.length.draw(canvas)) {
                    ViewCompat.equals(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.setMax.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.setMax.setSize(width2, height2);
                if (this.setMax.draw(canvas)) {
                    ViewCompat.equals(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.onNavigationEvent = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.getMax = getScrollY();
        return savedState;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int getMax;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.getMax = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getMax);
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.getMax);
            sb.append("}");
            return sb.toString();
        }
    }

    static class getMax extends setOnCancelListener {
        getMax() {
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.smoothScrollTo(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.smoothScrollTo(0, min, true);
            return true;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            onsupportactionmodefinished.getMax((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                onsupportactionmodefinished.values(true);
                if (nestedScrollView.getScrollY() > 0) {
                    onsupportactionmodefinished.setMin(onSupportActionModeFinished.setMax.toDoubleRange);
                    onsupportactionmodefinished.setMin(onSupportActionModeFinished.setMax.onNavigationEvent);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    onsupportactionmodefinished.setMin(onSupportActionModeFinished.setMax.values);
                    onsupportactionmodefinished.setMin(onSupportActionModeFinished.setMax.extraCallbackWithResult);
                }
            }
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            startSupportActionMode.getMin(accessibilityEvent, nestedScrollView.getScrollX());
            startSupportActionMode.length(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.hashCode) != null) {
            velocityTracker.recycle();
            this.hashCode = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.hashCode == null) {
            this.hashCode = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.invoke = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.invoke);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.hashCode;
                velocityTracker.computeCurrentVelocity(1000, (float) this.Mean$Arithmetic);
                int yVelocity = (int) velocityTracker.getYVelocity(this.valueOf);
                if (Math.abs(yVelocity) >= this.FastBitmap$CoordinateSystem) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        fling(i);
                    }
                } else if (this.setMin.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.equals(this);
                }
                this.valueOf = -1;
                getMin();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.valueOf);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.toIntRange - y;
                    if (!this.equals && Math.abs(i2) > this.toDoubleRange) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.equals = true;
                        i2 = i2 > 0 ? i2 - this.toDoubleRange : i2 + this.toDoubleRange;
                    }
                    int i3 = i2;
                    if (this.equals) {
                        if (dispatchNestedPreScroll(0, i3, this.Grayscale$Algorithm, this.invokeSuspend, 0)) {
                            i3 -= this.Grayscale$Algorithm[1];
                            this.invoke += this.invokeSuspend[1];
                        }
                        int i4 = i3;
                        this.toIntRange = y - this.invokeSuspend[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i5 = scrollRange;
                        if (overScrollByCompat(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0)) {
                            this.hashCode.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.Grayscale$Algorithm;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, this.invokeSuspend, 0, iArr);
                        int i6 = this.toIntRange;
                        int[] iArr2 = this.invokeSuspend;
                        this.toIntRange = i6 - iArr2[1];
                        this.invoke += iArr2[1];
                        if (z) {
                            int i7 = i4 - this.Grayscale$Algorithm[1];
                            length();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                getDrawerToggleDelegate.length(this.length, ((float) i7) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.setMax.isFinished()) {
                                    this.setMax.onRelease();
                                }
                            } else if (i8 > i5) {
                                getDrawerToggleDelegate.length(this.setMax, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.length.isFinished()) {
                                    this.length.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.length;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.setMax.isFinished())) {
                                ViewCompat.equals(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.equals && getChildCount() > 0 && this.setMin.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.equals(this);
                }
                this.valueOf = -1;
                getMin();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.toIntRange = (int) motionEvent2.getY(actionIndex);
                this.valueOf = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                setMin(motionEvent);
                this.toIntRange = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.valueOf));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.setMin.isFinished();
            this.equals = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.setMin.isFinished()) {
                this.setMin.abortAnimation();
                stopNestedScroll(1);
            }
            this.toIntRange = (int) motionEvent.getY();
            this.valueOf = motionEvent2.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.hashCode;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
}
