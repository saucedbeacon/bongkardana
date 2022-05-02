package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.LinearLayoutCompat;
import o.RatingCompat;
import o.onEvent;
import o.onQueueTitleChanged;
import o.onSessionDestroyed;
import o.playFromSearch;

public class ActionMenuView extends LinearLayoutCompat implements onEvent.setMin, onSessionDestroyed {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private boolean IsOverlapping;
    private int equals;
    private ActionMenuPresenter getMax;
    private onEvent getMin;
    private int isInside;
    private Context length;
    onEvent.length mMenuBuilderCallback;
    length mOnMenuItemClickListener;
    private boolean setMax;
    private int setMin;
    private onQueueTitleChanged.setMax toFloatRange;
    private int toIntRange;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface getMin {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public interface length {
        boolean getMin(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.equals = (int) (56.0f * f);
        this.isInside = (int) (f * 4.0f);
        this.length = context;
        this.setMin = 0;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.setMin != i) {
            this.setMin = i;
            if (i == 0) {
                this.length = getContext();
            } else {
                this.length = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.setMin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.getMax = actionMenuPresenter;
        actionMenuPresenter.toIntRange = this;
        initialize(actionMenuPresenter.getMax);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.getMax.equals()) {
                this.getMax.setMax();
                this.getMax.setMin();
            }
        }
    }

    public void setOnMenuItemClickListener(length length2) {
        this.mOnMenuItemClickListener = length2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        onEvent onevent;
        boolean z4 = this.IsOverlapping;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.IsOverlapping = z5;
        if (z4 != z5) {
            this.toIntRange = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.IsOverlapping || (onevent = this.getMin) == null || size == this.toIntRange)) {
            this.toIntRange = size;
            onevent.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.IsOverlapping || childCount <= 0) {
            int i7 = i2;
            for (int i8 = 0; i8 < childCount; i8++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i8).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i9 = size2 - paddingLeft;
        int i10 = this.equals;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z6 = false;
        long j = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z7) {
                    int i22 = this.isInside;
                    i6 = i21;
                    z3 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i6 = i21;
                    z3 = false;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.equals = z3;
                layoutParams2.getMax = z3 ? 1 : 0;
                layoutParams2.setMax = z3;
                layoutParams2.length = z3;
                layoutParams2.leftMargin = z3;
                layoutParams2.rightMargin = z3;
                layoutParams2.getMin = z7 && ((ActionMenuItemView) childAt).hasText();
                int measureChildForCells = measureChildForCells(childAt, i13, layoutParams2.setMin ? 1 : i11, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, measureChildForCells);
                if (layoutParams2.length) {
                    i17++;
                }
                if (layoutParams2.setMin) {
                    z6 = true;
                }
                i11 -= measureChildForCells;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    j |= (long) (1 << i18);
                }
                i14 = i6;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 > 0 && i11 > 0) {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount2) {
                    int i28 = i15;
                    LayoutParams layoutParams3 = (LayoutParams) getChildAt(i26).getLayoutParams();
                    boolean z10 = z9;
                    if (layoutParams3.length) {
                        if (layoutParams3.setMax < i25) {
                            j2 = 1 << i26;
                            i25 = layoutParams3.setMax;
                            i27 = 1;
                        } else if (layoutParams3.setMax == i25) {
                            i27++;
                            j2 |= 1 << i26;
                        }
                    }
                    i26++;
                    z9 = z10;
                    i15 = i28;
                }
                i3 = i15;
                z = z9;
                j |= j2;
                if (i27 > i11) {
                    break;
                }
                int i29 = i25 + 1;
                int i30 = 0;
                while (i30 < childCount2) {
                    View childAt2 = getChildAt(i30);
                    LayoutParams layoutParams4 = (LayoutParams) childAt2.getLayoutParams();
                    int i31 = i17;
                    long j3 = (long) (1 << i30);
                    if ((j2 & j3) == 0) {
                        if (layoutParams4.setMax == i29) {
                            j |= j3;
                        }
                        z2 = z8;
                    } else {
                        if (!z8 || !layoutParams4.getMin || i11 != 1) {
                            z2 = z8;
                        } else {
                            int i32 = this.isInside;
                            z2 = z8;
                            childAt2.setPadding(i32 + i13, 0, i32, 0);
                        }
                        layoutParams4.setMax++;
                        layoutParams4.equals = true;
                        i11--;
                    }
                    i30++;
                    i17 = i31;
                    z8 = z2;
                }
                i15 = i3;
                z9 = true;
            } else {
                i3 = i15;
                z = z9;
            }
        }
        boolean z11 = !z6 && i14 == 1;
        if (i11 > 0 && j != 0 && (i11 < i14 - 1 || z11 || i16 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).getMin) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & ((long) (1 << i33))) != 0 && !((LayoutParams) getChildAt(i33).getLayoutParams()).getMin) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : 0;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    LayoutParams layoutParams5 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams5.getMax = i34;
                        layoutParams5.equals = true;
                        if (i35 == 0 && !layoutParams5.getMin) {
                            layoutParams5.leftMargin = (-i34) / 2;
                        }
                    } else if (layoutParams5.setMin) {
                        layoutParams5.getMax = i34;
                        layoutParams5.equals = true;
                        layoutParams5.rightMargin = (-i34) / 2;
                    } else {
                        if (i35 != 0) {
                            layoutParams5.leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            layoutParams5.rightMargin = i34 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                LayoutParams layoutParams6 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams6.equals) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams6.setMax * i13) + layoutParams6.getMax, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i23;
            i4 = i3;
        } else {
            i4 = i24;
            i5 = i23;
        }
        setMeasuredDimension(i5, i4);
    }

    static int measureChildForCells(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.hasText();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.setMin || !z2) {
            z = false;
        }
        layoutParams.length = z;
        layoutParams.setMax = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.IsOverlapping) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean max = playFromSearch.getMax(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.setMin) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (max) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    hasSupportDividerBeforeChildAt(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max2 = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (max) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.setMin) {
                    int i17 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + layoutParams2.leftMargin) + max2);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.setMin) {
                int i20 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + layoutParams3.rightMargin + max2;
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        if (actionMenuPresenter.toFloatRange != null) {
            actionMenuPresenter.toFloatRange.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.toString = true;
        actionMenuPresenter.IsOverlapping = drawable;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        if (actionMenuPresenter.toFloatRange != null) {
            return actionMenuPresenter.toFloatRange.getDrawable();
        }
        if (actionMenuPresenter.toString) {
            return actionMenuPresenter.IsOverlapping;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.setMax;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.setMax = z;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.gravity <= 0) {
            layoutParams2.gravity = 16;
        }
        return layoutParams2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.setMin = true;
        return generateDefaultLayoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(RatingCompat ratingCompat) {
        return this.getMin.performItemAction(ratingCompat, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(onEvent onevent) {
        this.getMin = onevent;
    }

    public Menu getMenu() {
        if (this.getMin == null) {
            Context context = getContext();
            onEvent onevent = new onEvent(context);
            this.getMin = onevent;
            onevent.setCallback(new setMin());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.getMax = actionMenuPresenter;
            actionMenuPresenter.FastBitmap$CoordinateSystem = true;
            actionMenuPresenter.values = true;
            ActionMenuPresenter actionMenuPresenter2 = this.getMax;
            onQueueTitleChanged.setMax setmax = this.toFloatRange;
            if (setmax == null) {
                setmax = new getMax();
            }
            actionMenuPresenter2.setCallback(setmax);
            this.getMin.addMenuPresenter(this.getMax, this.length);
            ActionMenuPresenter actionMenuPresenter3 = this.getMax;
            actionMenuPresenter3.toIntRange = this;
            initialize(actionMenuPresenter3.getMax);
        }
        return this.getMin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(onQueueTitleChanged.setMax setmax, onEvent.length length2) {
        this.toFloatRange = setmax;
        this.mMenuBuilderCallback = length2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public onEvent peekMenu() {
        return this.getMin;
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        return actionMenuPresenter != null && actionMenuPresenter.setMin();
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        return actionMenuPresenter != null && actionMenuPresenter.setMax();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        return actionMenuPresenter != null && actionMenuPresenter.equals();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        return actionMenuPresenter != null && actionMenuPresenter.IsOverlapping();
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.getMax;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.getMax();
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof getMin)) {
            z = false | ((getMin) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof getMin)) ? z : z | ((getMin) childAt2).needsDividerBefore();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.getMax.toDoubleRange = z;
    }

    class setMin implements onEvent.length {
        setMin() {
        }

        public final boolean onMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
            return ActionMenuView.this.mOnMenuItemClickListener != null && ActionMenuView.this.mOnMenuItemClickListener.getMin(menuItem);
        }

        public final void onMenuModeChange(@NonNull onEvent onevent) {
            if (ActionMenuView.this.mMenuBuilderCallback != null) {
                ActionMenuView.this.mMenuBuilderCallback.onMenuModeChange(onevent);
            }
        }
    }

    static class getMax implements onQueueTitleChanged.setMax {
        public final void getMax(@NonNull onEvent onevent, boolean z) {
        }

        public final boolean setMax(@NonNull onEvent onevent) {
            return false;
        }

        getMax() {
        }
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        boolean equals;
        @ViewDebug.ExportedProperty
        public int getMax;
        @ViewDebug.ExportedProperty
        public boolean getMin;
        @ViewDebug.ExportedProperty
        public boolean length;
        @ViewDebug.ExportedProperty
        public int setMax;
        @ViewDebug.ExportedProperty
        public boolean setMin;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.setMin = layoutParams.setMin;
        }

        public LayoutParams() {
            super(-2, -2);
            this.setMin = false;
        }
    }
}
