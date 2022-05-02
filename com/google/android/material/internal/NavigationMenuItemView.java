package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import o.ITrustedWebActivityCallback;
import o.OptIn;
import o.RatingCompat;
import o.RequiresPermission;
import o.onSessionDestroyed;
import o.onSupportActionModeFinished;
import o.removeQueueItemAt;
import o.setOnCancelListener;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements onSessionDestroyed.setMax {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private final setOnCancelListener accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private RatingCompat itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.accessibilityDelegate = new setOnCancelListener() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull onSupportActionModeFinished onsupportactionmodefinished) {
                super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
                onsupportactionmodefinished.length(NavigationMenuItemView.this.checkable);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.getMin((View) this.textView, this.accessibilityDelegate);
    }

    public void initialize(@NonNull RatingCompat ratingCompat, int i) {
        this.itemData = ratingCompat;
        if (ratingCompat.getItemId() > 0) {
            setId(ratingCompat.getItemId());
        }
        setVisibility(ratingCompat.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.getMin((View) this, (Drawable) createDefaultBackground());
        }
        setCheckable(ratingCompat.isCheckable());
        setChecked(ratingCompat.isChecked());
        setEnabled(ratingCompat.isEnabled());
        setTitle(ratingCompat.getTitle());
        setIcon(ratingCompat.getIcon());
        setActionView(ratingCompat.getActionView());
        setContentDescription(ratingCompat.getContentDescription());
        removeQueueItemAt.setMax(this, ratingCompat.getTooltipText());
        adjustAppearance();
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.actionArea.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.actionArea.setLayoutParams(layoutParams2);
        }
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    @Nullable
    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.b, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public RatingCompat getItemData() {
        return this.itemData;
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.textView.setChecked(z);
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = RequiresPermission.Read.toIntRange(drawable).mutate();
                RequiresPermission.Read.setMin(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable max = OptIn.getMax(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = max;
                if (max != null) {
                    int i2 = this.iconSize;
                    max.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        TextViewCompat.setMin(this.textView, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconSize(@Dimension int i) {
        this.iconSize = i;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        RatingCompat ratingCompat = this.itemData;
        if (ratingCompat != null && ratingCompat.isCheckable() && this.itemData.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        RatingCompat ratingCompat = this.itemData;
        if (ratingCompat != null) {
            setIcon(ratingCompat.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        TextViewCompat.setMax((TextView) this.textView, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }
}
