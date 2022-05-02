package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.widget.TextViewCompat;
import o.IMediaControllerCallback;
import o.ITrustedWebActivityCallback;
import o.addQueueItem;
import o.getPackageName;
import o.getShuffleMode;
import o.onStart;
import o.onSupportNavigateUp;
import o.setBackgroundResource;

public class AppCompatButton extends Button implements onStart, onSupportNavigateUp, setBackgroundResource {
    private final IMediaControllerCallback.Stub.Proxy mBackgroundTintHelper;
    private final getPackageName mTextHelper;

    public AppCompatButton(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.invoke);
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(addQueueItem.getMax(context), attributeSet, i);
        getShuffleMode.getMax(getContext());
        IMediaControllerCallback.Stub.Proxy proxy = new IMediaControllerCallback.Stub.Proxy(this);
        this.mBackgroundTintHelper = proxy;
        proxy.setMin(attributeSet, i);
        getPackageName getpackagename = new getPackageName(this);
        this.mTextHelper = getpackagename;
        getpackagename.getMax(attributeSet, i);
        this.mTextHelper.setMax();
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax(i);
        }
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.getMax(drawable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            return proxy.getMax();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMin(mode);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            return proxy.length();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMax(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (getMax) {
            super.setTextSize(i, f);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMin(i, f);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !getMax && this.mTextHelper.getMin()) {
            this.mTextHelper.getMax();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (getMax) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (getMax) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMin(i, i2, i3, i4);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (getMax) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMax(iArr, i);
        }
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (!getMax) {
            getPackageName getpackagename = this.mTextHelper;
            if (getpackagename != null) {
                return getpackagename.setMin();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (getMax) {
            return super.getAutoSizeStepGranularity();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            return getpackagename.toIntRange();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (getMax) {
            return super.getAutoSizeMinTextSize();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            return getpackagename.equals();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (getMax) {
            return super.getAutoSizeMaxTextSize();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            return getpackagename.IsOverlapping();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (getMax) {
            return super.getAutoSizeTextAvailableSizes();
        }
        getPackageName getpackagename = this.mTextHelper;
        return getpackagename != null ? getpackagename.isInside() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMin(z);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.length((TextView) this, callback));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.setMin(colorStateList);
        this.mTextHelper.setMax();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.toFloatRange();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.getMax(mode);
        this.mTextHelper.setMax();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.FastBitmap$CoordinateSystem();
    }
}
