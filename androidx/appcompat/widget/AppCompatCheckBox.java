package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import o.IMediaControllerCallback;
import o.ITrustedWebActivityCallback;
import o.addQueueItem;
import o.cancelAll;
import o.getPackageName;
import o.getResources;
import o.getShuffleMode;
import o.onStart;

public class AppCompatCheckBox extends CheckBox implements getResources, onStart {
    private final IMediaControllerCallback.Stub.Proxy mBackgroundTintHelper;
    private final IMediaControllerCallback.Stub mCompoundButtonHelper;
    private final getPackageName mTextHelper;

    public AppCompatCheckBox(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatCheckBox(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.valueOf);
    }

    public AppCompatCheckBox(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(addQueueItem.getMax(context), attributeSet, i);
        getShuffleMode.getMax(getContext());
        IMediaControllerCallback.Stub stub = new IMediaControllerCallback.Stub(this);
        this.mCompoundButtonHelper = stub;
        stub.setMin(attributeSet, i);
        IMediaControllerCallback.Stub.Proxy proxy = new IMediaControllerCallback.Stub.Proxy(this);
        this.mBackgroundTintHelper = proxy;
        proxy.setMin(attributeSet, i);
        getPackageName getpackagename = new getPackageName(this);
        this.mTextHelper = getpackagename;
        getpackagename.getMax(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        IMediaControllerCallback.Stub stub = this.mCompoundButtonHelper;
        if (stub != null) {
            stub.getMin();
        }
    }

    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(cancelAll.getMin(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        IMediaControllerCallback.Stub stub = this.mCompoundButtonHelper;
        return stub != null ? stub.setMax(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        IMediaControllerCallback.Stub stub = this.mCompoundButtonHelper;
        if (stub != null) {
            stub.getMax(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        IMediaControllerCallback.Stub stub = this.mCompoundButtonHelper;
        if (stub != null) {
            return stub.setMax();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        IMediaControllerCallback.Stub stub = this.mCompoundButtonHelper;
        if (stub != null) {
            stub.length(mode);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        IMediaControllerCallback.Stub stub = this.mCompoundButtonHelper;
        if (stub != null) {
            return stub.length();
        }
        return null;
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

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.getMax(drawable);
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax(i);
        }
    }

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
}
