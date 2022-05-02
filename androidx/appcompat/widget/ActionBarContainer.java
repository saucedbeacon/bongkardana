package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import o.IMediaSession;
import o.ITrustedWebActivityCallback;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {
    private boolean getMax;
    private View getMin;
    private View length;
    public Drawable mBackground;
    public boolean mIsSplit;
    public boolean mIsStacked;
    public Drawable mSplitBackground;
    public Drawable mStackedBackground;
    private int setMax;
    private View setMin;

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.getMin((View) this, (Drawable) new IMediaSession(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.length);
        this.mBackground = obtainStyledAttributes.getDrawable(ITrustedWebActivityCallback.Stub.toIntRange.getMin);
        this.mStackedBackground = obtainStyledAttributes.getDrawable(ITrustedWebActivityCallback.Stub.toIntRange.setMax);
        this.setMax = obtainStyledAttributes.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.toFloatRange, -1);
        boolean z = true;
        if (getId() == ITrustedWebActivityCallback.Stub.toFloatRange.ICustomTabsCallback$Stub$Proxy) {
            this.mIsSplit = true;
            this.mSplitBackground = obtainStyledAttributes.getDrawable(ITrustedWebActivityCallback.Stub.toIntRange.getMax);
        }
        obtainStyledAttributes.recycle();
        if (!this.mIsSplit ? !(this.mBackground == null && this.mStackedBackground == null) : this.mSplitBackground != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.length = findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.length);
        this.getMin = findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.toIntRange);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.mBackground;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.mBackground);
        }
        this.mBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.length;
            if (view != null) {
                this.mBackground.setBounds(view.getLeft(), this.length.getTop(), this.length.getRight(), this.length.getBottom());
            }
        }
        boolean z = true;
        if (!this.mIsSplit ? !(this.mBackground == null && this.mStackedBackground == null) : this.mSplitBackground != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.mStackedBackground;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.mStackedBackground);
        }
        this.mStackedBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mIsStacked && (drawable2 = this.mStackedBackground) != null) {
                drawable2.setBounds(this.setMin.getLeft(), this.setMin.getTop(), this.setMin.getRight(), this.setMin.getBottom());
            }
        }
        boolean z = true;
        if (!this.mIsSplit ? !(this.mBackground == null && this.mStackedBackground == null) : this.mSplitBackground != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.mSplitBackground);
        }
        this.mSplitBackground = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mIsSplit && (drawable2 = this.mSplitBackground) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.mIsSplit ? this.mBackground == null && this.mStackedBackground == null : this.mSplitBackground == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.mBackground && !this.mIsSplit) {
            return true;
        }
        if (drawable != this.mStackedBackground || !this.mIsStacked) {
            return (drawable == this.mSplitBackground && this.mIsSplit) || super.verifyDrawable(drawable);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mBackground;
        if (drawable != null && drawable.isStateful()) {
            this.mBackground.setState(getDrawableState());
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null && drawable2.isStateful()) {
            this.mStackedBackground.setState(getDrawableState());
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null && drawable3.isStateful()) {
            this.mSplitBackground.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.getMax = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.getMax || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.setMin;
        if (view != null) {
            removeView(view);
        }
        this.setMin = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.setMin;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    private static boolean getMax(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            android.view.View r0 = r4.length
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != r1) goto L_0x001c
            int r0 = r4.setMax
            if (r0 < 0) goto L_0x001c
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
        L_0x001c:
            super.onMeasure(r5, r6)
            android.view.View r5 = r4.length
            if (r5 != 0) goto L_0x0024
            return
        L_0x0024:
            int r5 = android.view.View.MeasureSpec.getMode(r6)
            android.view.View r0 = r4.setMin
            if (r0 == 0) goto L_0x0096
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0096
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == r0) goto L_0x0096
            android.view.View r0 = r4.length
            boolean r0 = getMax(r0)
            if (r0 != 0) goto L_0x0053
            android.view.View r0 = r4.length
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
        L_0x0051:
            int r0 = r0 + r2
            goto L_0x006e
        L_0x0053:
            android.view.View r0 = r4.getMin
            boolean r0 = getMax(r0)
            if (r0 != 0) goto L_0x006d
            android.view.View r0 = r4.getMin
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            goto L_0x0051
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r5 != r1) goto L_0x0075
            int r5 = android.view.View.MeasureSpec.getSize(r6)
            goto L_0x0078
        L_0x0075:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0078:
            int r6 = r4.getMeasuredWidth()
            android.view.View r1 = r4.setMin
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r1 = r1.getMeasuredHeight()
            int r3 = r2.topMargin
            int r1 = r1 + r3
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r5 = java.lang.Math.min(r0, r5)
            r4.setMeasuredDimension(r6, r5)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.setMin;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.mIsSplit) {
            Drawable drawable2 = this.mSplitBackground;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.mBackground != null) {
                if (this.length.getVisibility() == 0) {
                    this.mBackground.setBounds(this.length.getLeft(), this.length.getTop(), this.length.getRight(), this.length.getBottom());
                } else {
                    View view2 = this.getMin;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.mBackground.setBounds(0, 0, 0, 0);
                    } else {
                        this.mBackground.setBounds(this.getMin.getLeft(), this.getMin.getTop(), this.getMin.getRight(), this.getMin.getBottom());
                    }
                }
                z3 = true;
            }
            this.mIsStacked = z4;
            if (!z4 || (drawable = this.mStackedBackground) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }
}
