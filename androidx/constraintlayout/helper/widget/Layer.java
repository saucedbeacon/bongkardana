package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.to;

public class Layer extends ConstraintHelper {
    private boolean IsOverlapping;
    private float equals = 0.0f;
    private float getMax = 1.0f;
    private float getMin = 1.0f;
    private float length = Float.NaN;
    protected float mComputedCenterX = Float.NaN;
    protected float mComputedCenterY = Float.NaN;
    protected float mComputedMaxX = Float.NaN;
    protected float mComputedMaxY = Float.NaN;
    protected float mComputedMinX = Float.NaN;
    protected float mComputedMinY = Float.NaN;
    ConstraintLayout mContainer;
    boolean mNeedBounds = true;
    View[] mViews = null;
    private float setMax = Float.NaN;
    private float setMin = Float.NaN;
    private float toFloatRange = 0.0f;
    private boolean toIntRange;

    public Layer(Context context) {
        super(context);
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.onSessionDestroyed);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.IMediaControllerCallback$Stub$Proxy) {
                    this.IsOverlapping = true;
                } else if (index == to.length.isTransportControlEnabled) {
                    this.toIntRange = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        if (this.IsOverlapping || this.toIntRange) {
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.mCount; i++) {
                View viewById = this.mContainer.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.IsOverlapping) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.toIntRange && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.mContainer = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f || !Float.isNaN(this.length)) {
            this.length = rotation;
        }
    }

    public void setRotation(float f) {
        this.length = f;
        length();
    }

    public void setScaleX(float f) {
        this.getMax = f;
        length();
    }

    public void setScaleY(float f) {
        this.getMin = f;
        length();
    }

    public void setPivotX(float f) {
        this.setMax = f;
        length();
    }

    public void setPivotY(float f) {
        this.setMin = f;
        length();
    }

    public void setTranslationX(float f) {
        this.toFloatRange = f;
        length();
    }

    public void setTranslationY(float f) {
        this.equals = f;
        length();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
        getMax();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).cancelNotification;
        constraintWidget.getMax(0);
        constraintWidget.toFloatRange(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), ((int) this.mComputedMaxX) + getPaddingRight(), ((int) this.mComputedMaxY) + getPaddingBottom());
        length();
    }

    private void getMax() {
        if (this.mContainer != null && this.mCount != 0) {
            View[] viewArr = this.mViews;
            if (viewArr == null || viewArr.length != this.mCount) {
                this.mViews = new View[this.mCount];
            }
            for (int i = 0; i < this.mCount; i++) {
                this.mViews[i] = this.mContainer.getViewById(this.mIds[i]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void calcCenters() {
        if (this.mContainer != null) {
            if (!this.mNeedBounds && !Float.isNaN(this.mComputedCenterX) && !Float.isNaN(this.mComputedCenterY)) {
                return;
            }
            if (Float.isNaN(this.setMax) || Float.isNaN(this.setMin)) {
                View[] views = getViews(this.mContainer);
                int left = views[0].getLeft();
                int top = views[0].getTop();
                int right = views[0].getRight();
                int bottom = views[0].getBottom();
                for (int i = 0; i < this.mCount; i++) {
                    View view = views[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.mComputedMaxX = (float) right;
                this.mComputedMaxY = (float) bottom;
                this.mComputedMinX = (float) left;
                this.mComputedMinY = (float) top;
                if (Float.isNaN(this.setMax)) {
                    this.mComputedCenterX = (float) ((left + right) / 2);
                } else {
                    this.mComputedCenterX = this.setMax;
                }
                if (Float.isNaN(this.setMin)) {
                    this.mComputedCenterY = (float) ((top + bottom) / 2);
                } else {
                    this.mComputedCenterY = this.setMin;
                }
            } else {
                this.mComputedCenterY = this.setMin;
                this.mComputedCenterX = this.setMax;
            }
        }
    }

    private void length() {
        if (this.mContainer != null) {
            if (this.mViews == null) {
                getMax();
            }
            calcCenters();
            double radians = Float.isNaN(this.length) ? 0.0d : Math.toRadians((double) this.length);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.getMax;
            float f2 = f * cos;
            float f3 = this.getMin;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.mCount; i++) {
                View view = this.mViews[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.mComputedCenterX;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.mComputedCenterY;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.toFloatRange);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.equals);
                view.setScaleY(this.getMin);
                view.setScaleX(this.getMax);
                if (!Float.isNaN(this.length)) {
                    view.setRotation(this.length);
                }
            }
        }
    }
}
