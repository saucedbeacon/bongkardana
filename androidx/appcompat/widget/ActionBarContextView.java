package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;
import o.IconCompatParcelizer;
import o.invalidateOptionsMenu;
import o.onEvent;
import o.onSessionReady;
import o.playFromSearch;
import o.prepareFromUri;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends onSessionReady {
    private LinearLayout IsOverlapping;
    private TextView equals;
    private View getMax;
    private View getMin;
    private int hashCode;
    private TextView isInside;
    private View length;
    private CharSequence setMax;
    private CharSequence setMin;
    private int toFloatRange;
    private int toIntRange;
    private boolean values;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* bridge */ /* synthetic */ void animateToVisibility(int i) {
        super.animateToVisibility(i);
    }

    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public /* bridge */ /* synthetic */ invalidateOptionsMenu setupAnimatorToVisibility(int i, long j) {
        return super.setupAnimatorToVisibility(i, j);
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.hashCode);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        prepareFromUri min = prepareFromUri.getMin(context, attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.onNavigationEvent, i, 0);
        ViewCompat.getMin((View) this, min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.extraCallback));
        this.toFloatRange = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.onRelationshipValidationResult, 0);
        this.toIntRange = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.extraCallbackWithResult, 0);
        this.mContentHeight = min.setMin.getLayoutDimension(ITrustedWebActivityCallback.Stub.toIntRange.onPostMessage, 0);
        this.hashCode = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.onMessageChannelReady, ITrustedWebActivityCallback.Stub.equals.getMax);
        min.setMin.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.setMax();
            this.mActionMenuPresenter.length();
        }
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.getMax;
        if (view2 != null) {
            removeView(view2);
        }
        this.getMax = view;
        if (!(view == null || (linearLayout = this.IsOverlapping) == null)) {
            removeView(linearLayout);
            this.IsOverlapping = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.setMin = charSequence;
        length();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.setMax = charSequence;
        length();
    }

    public CharSequence getTitle() {
        return this.setMin;
    }

    public CharSequence getSubtitle() {
        return this.setMax;
    }

    private void length() {
        if (this.IsOverlapping == null) {
            LayoutInflater.from(getContext()).inflate(ITrustedWebActivityCallback.Stub.equals.setMin, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.IsOverlapping = linearLayout;
            this.equals = (TextView) linearLayout.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.getMax);
            this.isInside = (TextView) this.IsOverlapping.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.setMin);
            if (this.toFloatRange != 0) {
                this.equals.setTextAppearance(getContext(), this.toFloatRange);
            }
            if (this.toIntRange != 0) {
                this.isInside.setTextAppearance(getContext(), this.toIntRange);
            }
        }
        this.equals.setText(this.setMin);
        this.isInside.setText(this.setMax);
        boolean z = !TextUtils.isEmpty(this.setMin);
        boolean z2 = !TextUtils.isEmpty(this.setMax);
        int i = 0;
        this.isInside.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.IsOverlapping;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.IsOverlapping.getParent() == null) {
            addView(this.IsOverlapping);
        }
    }

    public void initForMode(final IconCompatParcelizer iconCompatParcelizer) {
        View view = this.getMin;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.hashCode, this, false);
            this.getMin = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.getMin);
        }
        View findViewById = this.getMin.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.toFloatRange);
        this.length = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                iconCompatParcelizer.getMin();
            }
        });
        onEvent onevent = (onEvent) iconCompatParcelizer.getMax();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.getMax();
        }
        this.mActionMenuPresenter = new ActionMenuPresenter(getContext());
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        actionMenuPresenter.FastBitmap$CoordinateSystem = true;
        actionMenuPresenter.values = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        onevent.addMenuPresenter(this.mActionMenuPresenter, this.mPopupContext);
        this.mMenuView = (ActionMenuView) this.mActionMenuPresenter.length(this);
        ViewCompat.getMin((View) this.mMenuView, (Drawable) null);
        addView(this.mMenuView, layoutParams);
    }

    public void closeMode() {
        if (this.getMin == null) {
            killMode();
        }
    }

    public void killMode() {
        removeAllViews();
        this.getMax = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        View view = this.length;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean showOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.setMin();
        }
        return false;
    }

    public boolean hideOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.setMax();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.equals();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.mContentHeight > 0 ? this.mContentHeight : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.getMin;
            if (view != null) {
                int measureChildView = measureChildView(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.getMin.getLayoutParams();
                paddingLeft = measureChildView - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.mMenuView != null && this.mMenuView.getParent() == this) {
                paddingLeft = measureChildView(this.mMenuView, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.IsOverlapping;
            if (linearLayout != null && this.getMax == null) {
                if (this.values) {
                    this.IsOverlapping.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.IsOverlapping.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.IsOverlapping.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = measureChildView(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.getMax;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i4);
                }
                this.getMax.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i3));
            }
            if (this.mContentHeight <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i6) {
                        i6 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i6);
                return;
            }
            setMeasuredDimension(size, size2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean max = playFromSearch.getMax(this);
        int paddingRight = max ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.getMin;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.getMin.getLayoutParams();
            int i5 = max ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = max ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int next = next(paddingRight, i5, max);
            paddingRight = next(next + positionChild(this.getMin, next, paddingTop, paddingTop2, max), i6, max);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.IsOverlapping;
        if (!(linearLayout == null || this.getMax != null || linearLayout.getVisibility() == 8)) {
            i7 += positionChild(this.IsOverlapping, i7, paddingTop, paddingTop2, max);
        }
        int i8 = i7;
        View view2 = this.getMax;
        if (view2 != null) {
            positionChild(view2, i8, paddingTop, paddingTop2, max);
        }
        int paddingLeft = max ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.mMenuView != null) {
            positionChild(this.mMenuView, paddingLeft, paddingTop, paddingTop2, !max);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.setMin);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.values) {
            requestLayout();
        }
        this.values = z;
    }

    public boolean isTitleOptional() {
        return this.values;
    }
}
