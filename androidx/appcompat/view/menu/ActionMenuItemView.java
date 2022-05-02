package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import o.ITrustedWebActivityCallback;
import o.RatingCompat;
import o.getQueue;
import o.onEvent;
import o.onRepeatModeChanged;
import o.onSessionDestroyed;
import o.removeQueueItemAt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements onSessionDestroyed.setMax, View.OnClickListener, ActionMenuView.getMin {
    private int IsOverlapping;
    private int equals;
    private CharSequence getMin;
    private Drawable length;
    RatingCompat mItemData;
    onEvent.setMin mItemInvoker;
    getMax mPopupCallback;
    private getQueue setMax;
    private boolean setMin;
    private boolean toFloatRange;
    private int toIntRange;

    public static abstract class getMax {
        public abstract onRepeatModeChanged setMax();
    }

    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.setMin = getMax();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.getCause, i, 0);
        this.toIntRange = obtainStyledAttributes.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsCallback, 0);
        obtainStyledAttributes.recycle();
        this.IsOverlapping = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.equals = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.setMin = getMax();
        getMin();
    }

    private boolean getMax() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.equals = i;
        super.setPadding(i, i2, i3, i4);
    }

    public RatingCompat getItemData() {
        return this.mItemData;
    }

    public void initialize(RatingCompat ratingCompat, int i) {
        CharSequence charSequence;
        this.mItemData = ratingCompat;
        setIcon(ratingCompat.getIcon());
        if (prefersCondensedTitle()) {
            charSequence = ratingCompat.getTitleCondensed();
        } else {
            charSequence = ratingCompat.getTitle();
        }
        setTitle(charSequence);
        setId(ratingCompat.getItemId());
        setVisibility(ratingCompat.isVisible() ? 0 : 8);
        setEnabled(ratingCompat.isEnabled());
        if (ratingCompat.hasSubMenu() && this.setMax == null) {
            this.setMax = new setMin();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        getQueue getqueue;
        if (!this.mItemData.hasSubMenu() || (getqueue = this.setMax) == null || !getqueue.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        onEvent.setMin setmin = this.mItemInvoker;
        if (setmin != null) {
            setmin.invokeItem(this.mItemData);
        }
    }

    public void setItemInvoker(onEvent.setMin setmin) {
        this.mItemInvoker = setmin;
    }

    public void setPopupCallback(getMax getmax) {
        this.mPopupCallback = getmax;
    }

    public void setExpandedFormat(boolean z) {
        if (this.toFloatRange != z) {
            this.toFloatRange = z;
            RatingCompat ratingCompat = this.mItemData;
            if (ratingCompat != null) {
                ratingCompat.getMax.onItemActionRequestChanged(ratingCompat);
            }
        }
    }

    private void getMin() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.getMin);
        if (this.length != null && (!this.mItemData.IsOverlapping() || (!this.setMin && !this.toFloatRange))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.getMin : null);
        CharSequence contentDescription = this.mItemData.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.mItemData.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.mItemData.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.mItemData.getTitle();
            }
            removeQueueItemAt.setMax(this, charSequence2);
            return;
        }
        removeQueueItemAt.setMax(this, tooltipText);
    }

    public void setIcon(Drawable drawable) {
        this.length = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.IsOverlapping;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.IsOverlapping;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        getMin();
    }

    public boolean hasText() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.getMin = charSequence;
        getMin();
    }

    public boolean needsDividerBefore() {
        return hasText() && this.mItemData.getIcon() == null;
    }

    public boolean needsDividerAfter() {
        return hasText();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean hasText = hasText();
        if (hasText && (i4 = this.equals) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.toIntRange);
        } else {
            i3 = this.toIntRange;
        }
        if (mode != 1073741824 && this.toIntRange > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!hasText && this.length != null) {
            super.setPadding((getMeasuredWidth() - this.length.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    class setMin extends getQueue {
        public setMin() {
            super(ActionMenuItemView.this);
        }

        public final onRepeatModeChanged length() {
            if (ActionMenuItemView.this.mPopupCallback != null) {
                return ActionMenuItemView.this.mPopupCallback.setMax();
            }
            return null;
        }

        public final boolean getMax() {
            onRepeatModeChanged length;
            if (ActionMenuItemView.this.mItemInvoker == null || !ActionMenuItemView.this.mItemInvoker.invokeItem(ActionMenuItemView.this.mItemData) || (length = length()) == null || !length.getMin()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }
}
