package com.synnapps.carouselview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import o.getScrollingChildHelper;
import o.onCreateViewHolder;
import o.onStop;
import o.setSingleChoiceItems;

public class CirclePageIndicator extends View implements getScrollingChildHelper {
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private boolean mIsDragging;
    private float mLastMotionX;
    private ViewPager.setMax mListener;
    private int mOrientation;
    private float mPageOffset;
    private final Paint mPaintFill;
    private final Paint mPaintPageFill;
    private final Paint mPaintStroke;
    private float mRadius;
    private int mScrollState;
    private boolean mSnap;
    private int mSnapPage;
    private int mTouchSlop;
    private ViewPager mViewPager;

    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, onCreateViewHolder.getMax.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaintPageFill = new Paint(1);
        this.mPaintStroke = new Paint(1);
        this.mPaintFill = new Paint(1);
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(onCreateViewHolder.length.default_circle_indicator_page_color);
            int color2 = resources.getColor(onCreateViewHolder.length.default_circle_indicator_fill_color);
            int integer = resources.getInteger(onCreateViewHolder.toFloatRange.default_circle_indicator_orientation);
            int color3 = resources.getColor(onCreateViewHolder.length.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(onCreateViewHolder.setMin.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(onCreateViewHolder.setMin.default_circle_indicator_radius);
            boolean z = resources.getBoolean(onCreateViewHolder.getMin.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(onCreateViewHolder.getMin.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onCreateViewHolder.toIntRange.CirclePageIndicator, i, 0);
            this.mCentered = obtainStyledAttributes.getBoolean(onCreateViewHolder.toIntRange.CirclePageIndicator_centered, z);
            this.mOrientation = obtainStyledAttributes.getInt(onCreateViewHolder.toIntRange.CirclePageIndicator_android_orientation, integer);
            this.mPaintPageFill.setStyle(Paint.Style.FILL);
            this.mPaintPageFill.setColor(obtainStyledAttributes.getColor(onCreateViewHolder.toIntRange.CirclePageIndicator_pageColor, color));
            this.mPaintStroke.setStyle(Paint.Style.STROKE);
            this.mPaintStroke.setColor(obtainStyledAttributes.getColor(onCreateViewHolder.toIntRange.CirclePageIndicator_strokeColor, color3));
            this.mPaintStroke.setStrokeWidth(obtainStyledAttributes.getDimension(onCreateViewHolder.toIntRange.CirclePageIndicator_strokeWidth, dimension));
            this.mPaintFill.setStyle(Paint.Style.FILL);
            this.mPaintFill.setColor(obtainStyledAttributes.getColor(onCreateViewHolder.toIntRange.CirclePageIndicator_fillColor, color2));
            this.mRadius = obtainStyledAttributes.getDimension(onCreateViewHolder.toIntRange.CirclePageIndicator_radius, dimension2);
            this.mSnap = obtainStyledAttributes.getBoolean(onCreateViewHolder.toIntRange.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(onCreateViewHolder.toIntRange.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.mTouchSlop = onStop.getMin(ViewConfiguration.get(context));
        }
    }

    public void setCentered(boolean z) {
        this.mCentered = z;
        invalidate();
    }

    public boolean isCentered() {
        return this.mCentered;
    }

    public void setPageColor(int i) {
        this.mPaintPageFill.setColor(i);
        invalidate();
    }

    public int getPageColor() {
        return this.mPaintPageFill.getColor();
    }

    public void setFillColor(int i) {
        this.mPaintFill.setColor(i);
        invalidate();
    }

    public int getFillColor() {
        return this.mPaintFill.getColor();
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.mOrientation = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setStrokeColor(int i) {
        this.mPaintStroke.setColor(i);
        invalidate();
    }

    public int getStrokeColor() {
        return this.mPaintStroke.getColor();
    }

    public void setStrokeWidth(float f) {
        this.mPaintStroke.setStrokeWidth(f);
        invalidate();
    }

    public float getStrokeWidth() {
        return this.mPaintStroke.getStrokeWidth();
    }

    public void setRadius(float f) {
        this.mRadius = f;
        invalidate();
    }

    public float getRadius() {
        return this.mRadius;
    }

    public void setSnap(boolean z) {
        this.mSnap = z;
        invalidate();
    }

    public boolean isSnap() {
        return this.mSnap;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int count;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        super.onDraw(canvas);
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null && (count = viewPager.getAdapter().getCount()) != 0) {
            if (this.mCurrentPage >= count) {
                setCurrentItem(count - 1);
                return;
            }
            if (this.mOrientation == 0) {
                i4 = getWidth();
                i3 = getPaddingLeft();
                i2 = getPaddingRight();
                i = getPaddingTop();
            } else {
                i4 = getHeight();
                i3 = getPaddingTop();
                i2 = getPaddingBottom();
                i = getPaddingLeft();
            }
            float f3 = this.mRadius;
            float f4 = 3.0f * f3;
            float f5 = ((float) i) + f3;
            float f6 = ((float) i3) + f3;
            if (this.mCentered) {
                f6 += (((float) ((i4 - i3) - i2)) / 2.0f) - ((((float) count) * f4) / 2.0f);
            }
            float f7 = this.mRadius;
            if (this.mPaintStroke.getStrokeWidth() > 0.0f) {
                f7 -= this.mPaintStroke.getStrokeWidth() / 2.0f;
            }
            for (int i5 = 0; i5 < count; i5++) {
                float f8 = (((float) i5) * f4) + f6;
                if (this.mOrientation == 0) {
                    f2 = f5;
                } else {
                    f2 = f8;
                    f8 = f5;
                }
                if (this.mPaintPageFill.getAlpha() > 0) {
                    canvas.drawCircle(f8, f2, f7, this.mPaintPageFill);
                }
                float f9 = this.mRadius;
                if (f7 != f9) {
                    canvas.drawCircle(f8, f2, f9, this.mPaintStroke);
                }
            }
            float f10 = ((float) (this.mSnap ? this.mSnapPage : this.mCurrentPage)) * f4;
            if (!this.mSnap) {
                f10 += this.mPageOffset * f4;
            }
            if (this.mOrientation == 0) {
                float f11 = f6 + f10;
                f = f5;
                f5 = f11;
            } else {
                f = f6 + f10;
            }
            canvas.drawCircle(f5, f, this.mRadius, this.mPaintFill);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.mViewPager;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float length = setSingleChoiceItems.length(motionEvent, setSingleChoiceItems.setMin(motionEvent, this.mActivePointerId));
                    float f = length - this.mLastMotionX;
                    if (!this.mIsDragging && Math.abs(f) > ((float) this.mTouchSlop)) {
                        this.mIsDragging = true;
                    }
                    if (this.mIsDragging) {
                        this.mLastMotionX = length;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int max = setSingleChoiceItems.getMax(motionEvent);
                        this.mLastMotionX = setSingleChoiceItems.length(motionEvent, max);
                        this.mActivePointerId = setSingleChoiceItems.getMin(motionEvent, max);
                    } else if (action == 6) {
                        int max2 = setSingleChoiceItems.getMax(motionEvent);
                        if (setSingleChoiceItems.getMin(motionEvent, max2) == this.mActivePointerId) {
                            if (max2 == 0) {
                                i = 1;
                            }
                            this.mActivePointerId = setSingleChoiceItems.getMin(motionEvent, i);
                        }
                        this.mLastMotionX = setSingleChoiceItems.length(motionEvent, setSingleChoiceItems.setMin(motionEvent, this.mActivePointerId));
                    }
                }
            }
            if (!this.mIsDragging) {
                int count = this.mViewPager.getAdapter().getCount();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.mCurrentPage > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage - 1);
                    }
                    return true;
                } else if (this.mCurrentPage < count - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage + 1);
                    }
                    return true;
                }
            }
            this.mIsDragging = false;
            this.mActivePointerId = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        } else {
            this.mActivePointerId = setSingleChoiceItems.getMin(motionEvent, 0);
            this.mLastMotionX = motionEvent.getX();
        }
        return true;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener((ViewPager.setMax) null);
            }
            if (viewPager.getAdapter() != null) {
                this.mViewPager = viewPager;
                viewPager.addOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.mCurrentPage = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    public void onPageScrollStateChanged(int i) {
        this.mScrollState = i;
        ViewPager.setMax setmax = this.mListener;
        if (setmax != null) {
            setmax.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.mCurrentPage = i;
        this.mPageOffset = f;
        invalidate();
        ViewPager.setMax setmax = this.mListener;
        if (setmax != null) {
            setmax.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        if (this.mSnap || this.mScrollState == 0) {
            this.mCurrentPage = i;
            this.mSnapPage = i;
            invalidate();
        }
        ViewPager.setMax setmax = this.mListener;
        if (setmax != null) {
            setmax.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.setMax setmax) {
        this.mListener = setmax;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 0) {
            setMeasuredDimension(measureLong(i), measureShort(i2));
        } else {
            setMeasuredDimension(measureShort(i), measureLong(i2));
        }
    }

    private int measureLong(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.mViewPager) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        float f = this.mRadius;
        int paddingLeft = (int) (((float) (getPaddingLeft() + getPaddingRight())) + (((float) (count * 2)) * f) + (((float) (count - 1)) * f) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private int measureShort(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.mRadius * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mCurrentPage = savedState.currentPage;
        this.mSnapPage = savedState.currentPage;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.mCurrentPage;
        return savedState;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int currentPage;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }
    }
}
