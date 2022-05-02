package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.IntRange;
import o.onCreateDialog;
import o.onSupportActionModeFinished;
import o.setOnCancelListener;

public class SlidingPaneLayout extends ViewGroup {
    private setMax FastBitmap$CoordinateSystem;
    private float IsOverlapping;
    private int equals;
    private Drawable getMax;
    private final int getMin;
    private boolean hashCode;
    private boolean invokeSuspend;
    private boolean isInside;
    private Drawable length;
    final onCreateDialog mDragHelper;
    boolean mIsUnableToDrag;
    final ArrayList<getMin> mPostedRunnables;
    boolean mPreservedOpenState;
    float mSlideOffset;
    int mSlideRange;
    View mSlideableView;
    private int setMax;
    private int setMin;
    private Field toDoubleRange;
    private float toFloatRange;
    private float toIntRange;
    private final Rect toString;
    private Method values;

    public interface setMax {
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnPanelSlide(View view) {
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMin = -858993460;
        this.hashCode = true;
        this.toString = new Rect();
        this.mPostedRunnables = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.getMin = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.getMin((View) this, (setOnCancelListener) new length());
        ViewCompat.setMin((View) this, 1);
        onCreateDialog min = onCreateDialog.getMin((ViewGroup) this, 0.5f, (onCreateDialog.setMin) new setMin());
        this.mDragHelper = min;
        min.setMax = f * 400.0f;
    }

    public void setParallaxDistance(@Px int i) {
        this.equals = i;
        requestLayout();
    }

    @Px
    public int getParallaxDistance() {
        return this.equals;
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.setMin = i;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.setMin;
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.setMax = i;
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.setMax;
    }

    public void setPanelSlideListener(@Nullable setMax setmax) {
        this.FastBitmap$CoordinateSystem = setmax;
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnPanelOpened(View view) {
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnPanelClosed(View view) {
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    public void updateObscuredViewsVisibility(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int width = isLayoutRtlSupport ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = isLayoutRtlSupport ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !setMax(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
                if (childAt.getVisibility() != 8) {
                    z = isLayoutRtlSupport;
                    childAt.setVisibility((Math.max(isLayoutRtlSupport ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(isLayoutRtlSupport ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                } else {
                    z = isLayoutRtlSupport;
                }
                i5++;
                view2 = view;
                isLayoutRtlSupport = z;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    private static boolean setMax(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.hashCode = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hashCode = true;
        int size = this.mPostedRunnables.size();
        for (int i = 0; i < size; i++) {
            this.mPostedRunnables.get(i).run();
        }
        this.mPostedRunnables.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.mSlideableView = null;
        int i13 = paddingLeft;
        int i14 = 0;
        boolean z2 = false;
        float f = 0.0f;
        while (true) {
            i5 = 8;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.setMin = z;
            } else {
                if (layoutParams.getMin > 0.0f) {
                    f += layoutParams.getMin;
                    if (layoutParams.width == 0) {
                    }
                }
                int i15 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i15, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i15, 1073741824);
                } else {
                    i11 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                } else {
                    i12 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(i11, i12);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i13 -= measuredWidth;
                boolean z3 = i13 < 0;
                layoutParams.length = z3;
                z2 |= z3;
                if (layoutParams.length) {
                    this.mSlideableView = childAt;
                }
            }
            i14++;
            z = false;
        }
        if (z2 || f > 0.0f) {
            int i16 = paddingLeft - this.getMin;
            int i17 = 0;
            while (i17 < childCount) {
                View childAt2 = getChildAt(i17);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z4 = layoutParams2.width == 0 && layoutParams2.getMin > 0.0f;
                        if (z4) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.mSlideableView) {
                            if (layoutParams2.getMin > 0.0f) {
                                if (layoutParams2.width != 0) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                } else if (layoutParams2.height == -1) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                if (z2) {
                                    int i18 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i6 = i16;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                                    if (i7 != i18) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i17++;
                                    i16 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i16;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((layoutParams2.getMin * ((float) Math.max(0, i13))) / f)), 1073741824), i8);
                                    i17++;
                                    i16 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i7 > i16 || layoutParams2.getMin > 0.0f)) {
                            if (!z4) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                i9 = 1073741824;
                            } else if (layoutParams2.height == -1) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i16, i9), i10);
                        }
                    }
                }
                i6 = i16;
                i17++;
                i16 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i4 + getPaddingTop() + getPaddingBottom());
        this.isInside = z2;
        if (this.mDragHelper.setMin != 0 && !z2) {
            this.mDragHelper.setMax();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        if (isLayoutRtlSupport) {
            this.mDragHelper.getMax = 2;
        } else {
            this.mDragHelper.getMax = 1;
        }
        int i9 = i3 - i;
        int paddingRight = isLayoutRtlSupport ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = isLayoutRtlSupport ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.hashCode) {
            this.mSlideOffset = (!this.isInside || !this.mPreservedOpenState) ? 0.0f : 1.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.length) {
                    int i12 = i9 - paddingLeft;
                    int min = (Math.min(paddingRight, i12 - this.getMin) - i10) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.mSlideRange = min;
                    int i13 = isLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.setMin = ((i10 + i13) + min) + (measuredWidth / 2) > i12;
                    int i14 = (int) (((float) min) * this.mSlideOffset);
                    i10 += i13 + i14;
                    this.mSlideOffset = ((float) i14) / ((float) this.mSlideRange);
                    i5 = 0;
                } else {
                    i5 = (!this.isInside || (i8 = this.equals) == 0) ? 0 : (int) ((1.0f - this.mSlideOffset) * ((float) i8));
                    i10 = paddingRight;
                }
                if (isLayoutRtlSupport) {
                    i6 = (i9 - i10) + i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i7 = i10 - i5;
                    i6 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.hashCode) {
            if (this.isInside) {
                if (this.equals != 0) {
                    setMax(this.mSlideOffset);
                }
                if (((LayoutParams) this.mSlideableView.getLayoutParams()).setMin) {
                    setMax(this.mSlideableView, this.mSlideOffset, this.setMin);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    setMax(getChildAt(i15), 0.0f, this.setMin);
                }
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.hashCode = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.hashCode = true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.isInside) {
            this.mPreservedOpenState = view == this.mSlideableView;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.isInside && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.mPreservedOpenState = !onCreateDialog.getMin(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.isInside || (this.mIsUnableToDrag && actionMasked != 0)) {
            this.mDragHelper.setMin();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.mDragHelper.setMin();
            return false;
        } else {
            if (actionMasked == 0) {
                this.mIsUnableToDrag = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.toIntRange = x;
                this.toFloatRange = y;
                if (onCreateDialog.getMin(this.mSlideableView, (int) x, (int) y) && isDimmed(this.mSlideableView)) {
                    z = true;
                    if (!this.mDragHelper.setMax(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.toIntRange);
                float abs2 = Math.abs(y2 - this.toFloatRange);
                if (abs > ((float) this.mDragHelper.length) && abs2 > abs) {
                    this.mDragHelper.setMin();
                    this.mIsUnableToDrag = true;
                    return false;
                }
            }
            z = false;
            if (!this.mDragHelper.setMax(motionEvent)) {
            }
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.isInside) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.getMin(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.toIntRange = x;
            this.toFloatRange = y;
        } else if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.toIntRange;
            float f2 = y2 - this.toFloatRange;
            int i = this.mDragHelper.length;
            if ((f * f) + (f2 * f2) < ((float) (i * i)) && onCreateDialog.getMin(this.mSlideableView, (int) x2, (int) y2)) {
                setMax();
            }
        }
        return true;
    }

    private boolean setMax() {
        if (!this.hashCode && !smoothSlideTo(0.0f, 0)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private boolean getMin() {
        if (!this.hashCode && !smoothSlideTo(1.0f, 0)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    public boolean openPane() {
        return getMin();
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    public boolean closePane() {
        return setMax();
    }

    public boolean isOpen() {
        return !this.isInside || this.mSlideOffset == 1.0f;
    }

    @Deprecated
    public boolean canSlide() {
        return this.isInside;
    }

    public boolean isSlideable() {
        return this.isInside;
    }

    /* access modifiers changed from: package-private */
    public void onPanelDragged(int i) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (isLayoutRtlSupport) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = ((float) (i - ((isLayoutRtlSupport ? getPaddingRight() : getPaddingLeft()) + (isLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.mSlideRange);
        this.mSlideOffset = paddingRight;
        if (this.equals != 0) {
            setMax(paddingRight);
        }
        if (layoutParams.setMin) {
            setMax(this.mSlideableView, this.mSlideOffset, this.setMin);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    private void setMax(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & FlexItem.MAX_SIZE);
            if (layoutParams.setMax == null) {
                layoutParams.setMax = new Paint();
            }
            layoutParams.setMax.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.setMax);
            }
            invalidateChildRegion(view);
        } else if (view.getLayerType() != 0) {
            if (layoutParams.setMax != null) {
                layoutParams.setMax.setColorFilter((ColorFilter) null);
            }
            getMin getmin = new getMin(view);
            this.mPostedRunnables.add(getmin);
            ViewCompat.getMax((View) this, (Runnable) getmin);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.isInside && !layoutParams.length && this.mSlideableView != null) {
            canvas.getClipBounds(this.toString);
            if (isLayoutRtlSupport()) {
                Rect rect = this.toString;
                rect.left = Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                Rect rect2 = this.toString;
                rect2.right = Math.min(rect2.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.toString);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public void invalidateChildRegion(View view) {
        Field field;
        if (Build.VERSION.SDK_INT >= 17) {
            ViewCompat.getMin(view, ((LayoutParams) view.getLayoutParams()).setMax);
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (!this.invokeSuspend) {
                try {
                    this.values = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.toDoubleRange = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.invokeSuspend = true;
            }
            if (this.values == null || (field = this.toDoubleRange) == null) {
                view.invalidate();
                return;
            } else {
                try {
                    field.setBoolean(view, true);
                    this.values.invoke(view, (Object[]) null);
                } catch (Exception unused3) {
                }
            }
        }
        ViewCompat.getMin(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: package-private */
    public boolean smoothSlideTo(float f, int i) {
        int i2;
        if (!this.isInside) {
            return false;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        if (isLayoutRtlSupport) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.mSlideRange))) + ((float) this.mSlideableView.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.mSlideRange)));
        }
        onCreateDialog oncreatedialog = this.mDragHelper;
        View view = this.mSlideableView;
        if (!oncreatedialog.setMax(view, i2, view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        ViewCompat.equals(this);
        return true;
    }

    public void computeScroll() {
        if (!this.mDragHelper.getMin()) {
            return;
        }
        if (!this.isInside) {
            this.mDragHelper.setMax();
        } else {
            ViewCompat.equals(this);
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.length = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.getMax = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(IntRange.length(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(IntRange.length(getContext(), i));
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (isLayoutRtlSupport()) {
            drawable = this.getMax;
        } else {
            drawable = this.length;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isLayoutRtlSupport()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.isLayoutRtlSupport()
            android.view.View r1 = r9.mSlideableView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.setMin
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0058
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.mSlideableView
            if (r4 == r5) goto L_0x0055
            float r5 = r9.IsOverlapping
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.equals
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.IsOverlapping = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0043
            int r5 = -r5
        L_0x0043:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0055
            float r5 = r9.IsOverlapping
            if (r0 == 0) goto L_0x004e
            float r5 = r5 - r6
            goto L_0x0050
        L_0x004e:
            float r5 = r6 - r5
        L_0x0050:
            int r6 = r9.setMax
            r9.setMax(r4, r5, r6)
        L_0x0055:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.setMax(float):void");
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z) {
            return false;
        }
        if (view.canScrollHorizontally(isLayoutRtlSupport() ? i : -i)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.isInside || !layoutParams.setMin || this.mSlideOffset <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setMax = isSlideable() ? isOpen() : this.mPreservedOpenState;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.setMax) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.setMax;
    }

    class setMin extends onCreateDialog.setMin {
        setMin() {
        }

        public final boolean tryCaptureView(View view, int i) {
            if (SlidingPaneLayout.this.mIsUnableToDrag) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).length;
        }

        public final void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.this.mDragHelper.setMin != 0) {
                return;
            }
            if (SlidingPaneLayout.this.mSlideOffset == 0.0f) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.updateObscuredViewsVisibility(slidingPaneLayout.mSlideableView);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                slidingPaneLayout2.dispatchOnPanelClosed(slidingPaneLayout2.mSlideableView);
                SlidingPaneLayout.this.mPreservedOpenState = false;
                return;
            }
            SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
            slidingPaneLayout3.dispatchOnPanelOpened(slidingPaneLayout3.mSlideableView);
            SlidingPaneLayout.this.mPreservedOpenState = true;
        }

        public final void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.setAllChildrenVisible();
        }

        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.onPanelDragged(i);
            SlidingPaneLayout.this.invalidate();
        }

        public final void onViewReleased(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.mSlideRange;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    i += SlidingPaneLayout.this.mSlideRange;
                }
            }
            SlidingPaneLayout.this.mDragHelper.getMax(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public final int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.mSlideRange;
        }

        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.mSlideableView.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.mSlideRange);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.mSlideRange + paddingLeft);
        }

        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public final void onEdgeDragStarted(int i, int i2) {
            SlidingPaneLayout.this.mDragHelper.getMin(SlidingPaneLayout.this.mSlideableView, i2);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] getMax = {16843137};
        public float getMin = 0.0f;
        boolean length;
        Paint setMax;
        boolean setMin;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getMax);
            this.getMin = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        boolean setMax;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel, (ClassLoader) null);
            this.setMax = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.setMax ? 1 : 0);
        }
    }

    class length extends setOnCancelListener {
        private final Rect getMin = new Rect();

        length() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            onSupportActionModeFinished min = onSupportActionModeFinished.setMin(onsupportactionmodefinished);
            super.onInitializeAccessibilityNodeInfo(view, min);
            Rect rect = this.getMin;
            min.getMax(rect);
            onsupportactionmodefinished.setMin(rect);
            min.getMin(rect);
            onsupportactionmodefinished.setMax(rect);
            onsupportactionmodefinished.getMax(min.equals());
            onsupportactionmodefinished.setMin(min.Grayscale$Algorithm());
            onsupportactionmodefinished.getMax(min.onNavigationEvent());
            onsupportactionmodefinished.length(min.create());
            onsupportactionmodefinished.isInside(min.valueOf());
            onsupportactionmodefinished.equals(min.values());
            onsupportactionmodefinished.getMin(min.isInside());
            onsupportactionmodefinished.setMin(min.toFloatRange());
            onsupportactionmodefinished.toIntRange(min.FastBitmap$CoordinateSystem());
            onsupportactionmodefinished.IsOverlapping(min.toDoubleRange());
            onsupportactionmodefinished.toFloatRange(min.invoke());
            onsupportactionmodefinished.setMin(min.setMax());
            onsupportactionmodefinished.getMin(min.setMin());
            min.ICustomTabsCallback();
            onsupportactionmodefinished.getMax((CharSequence) SlidingPaneLayout.class.getName());
            onsupportactionmodefinished.setMax(view);
            ViewParent intRange = ViewCompat.toIntRange(view);
            if (intRange instanceof View) {
                onsupportactionmodefinished.setMin((View) intRange);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!setMax(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setMin(childAt, 1);
                    onsupportactionmodefinished.length(childAt);
                }
            }
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!setMax(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private boolean setMax(View view) {
            return SlidingPaneLayout.this.isDimmed(view);
        }
    }

    class getMin implements Runnable {
        final View setMax;

        getMin(View view) {
            this.setMax = view;
        }

        public final void run() {
            if (this.setMax.getParent() == SlidingPaneLayout.this) {
                this.setMax.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.invalidateChildRegion(this.setMax);
            }
            SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isLayoutRtlSupport() {
        return ViewCompat.IsOverlapping(this) == 1;
    }
}
