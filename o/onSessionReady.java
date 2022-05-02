package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;

public abstract class onSessionReady extends ViewGroup {
    private boolean getMin;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final length mVisAnimListener;
    protected invalidateOptionsMenu mVisibilityAnim;
    private boolean setMax;

    protected static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    onSessionReady(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    onSessionReady(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public onSessionReady(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new length();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.getMax, typedValue, true) || typedValue.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, ITrustedWebActivityCallback.Stub.toIntRange.length, ITrustedWebActivityCallback.Stub.getMin.setMin, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(ITrustedWebActivityCallback.Stub.toIntRange.toFloatRange, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.getMin();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.setMax = false;
        }
        if (!this.setMax) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.setMax = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.setMax = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.getMin = false;
        }
        if (!this.getMin) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.getMin = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.getMin = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.setMax;
        }
        return getVisibility();
    }

    public invalidateOptionsMenu setupAnimatorToVisibility(int i, long j) {
        invalidateOptionsMenu invalidateoptionsmenu = this.mVisibilityAnim;
        if (invalidateoptionsmenu != null) {
            invalidateoptionsmenu.getMax();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            invalidateOptionsMenu min = ViewCompat.Grayscale$Algorithm(this).getMin(1.0f);
            min.getMin(j);
            min.length(this.mVisAnimListener.getMin(min, i));
            return min;
        }
        invalidateOptionsMenu min2 = ViewCompat.Grayscale$Algorithm(this).getMin(0.0f);
        min2.getMin(j);
        min2.length(this.mVisAnimListener.getMin(min2, i));
        return min2;
    }

    public void animateToVisibility(int i) {
        setupAnimatorToVisibility(i, 200).setMax();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            invalidateOptionsMenu invalidateoptionsmenu = this.mVisibilityAnim;
            if (invalidateoptionsmenu != null) {
                invalidateoptionsmenu.getMax();
            }
            super.setVisibility(i);
        }
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.setMin();
        }
        return false;
    }

    public void postShowOverflowMenu() {
        post(new Runnable() {
            public final void run() {
                onSessionReady.this.showOverflowMenu();
            }
        });
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.setMax();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.equals();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.IsOverlapping();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isInside();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.getMax();
        }
    }

    /* access modifiers changed from: protected */
    public int measureChildView(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    public int positionChild(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    protected class length implements supportInvalidateOptionsMenu {
        private boolean length = false;
        int setMax;

        protected length() {
        }

        public final length getMin(invalidateOptionsMenu invalidateoptionsmenu, int i) {
            onSessionReady.this.mVisibilityAnim = invalidateoptionsmenu;
            this.setMax = i;
            return this;
        }

        public void setMin(View view) {
            onSessionReady.super.setVisibility(0);
            this.length = false;
        }

        public void length(View view) {
            if (!this.length) {
                onSessionReady.this.mVisibilityAnim = null;
                onSessionReady.super.setVisibility(this.setMax);
            }
        }

        public void getMin(View view) {
            this.length = true;
        }
    }
}
