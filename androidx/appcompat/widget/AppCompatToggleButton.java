package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import o.IMediaControllerCallback;
import o.getPackageName;
import o.getShuffleMode;
import o.onStart;

public class AppCompatToggleButton extends ToggleButton implements onStart {
    private final IMediaControllerCallback.Stub.Proxy getMin;
    private final getPackageName setMin;

    public AppCompatToggleButton(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getShuffleMode.getMax(getContext());
        IMediaControllerCallback.Stub.Proxy proxy = new IMediaControllerCallback.Stub.Proxy(this);
        this.getMin = proxy;
        proxy.setMin(attributeSet, i);
        getPackageName getpackagename = new getPackageName(this);
        this.setMin = getpackagename;
        getpackagename.getMax(attributeSet, i);
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        IMediaControllerCallback.Stub.Proxy proxy = this.getMin;
        if (proxy != null) {
            proxy.setMax(i);
        }
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        IMediaControllerCallback.Stub.Proxy proxy = this.getMin;
        if (proxy != null) {
            proxy.getMax(drawable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        IMediaControllerCallback.Stub.Proxy proxy = this.getMin;
        if (proxy != null) {
            proxy.setMax(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        IMediaControllerCallback.Stub.Proxy proxy = this.getMin;
        if (proxy != null) {
            return proxy.getMax();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        IMediaControllerCallback.Stub.Proxy proxy = this.getMin;
        if (proxy != null) {
            proxy.setMin(mode);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        IMediaControllerCallback.Stub.Proxy proxy = this.getMin;
        if (proxy != null) {
            return proxy.length();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        IMediaControllerCallback.Stub.Proxy proxy = this.getMin;
        if (proxy != null) {
            proxy.setMax();
        }
        getPackageName getpackagename = this.setMin;
        if (getpackagename != null) {
            getpackagename.setMax();
        }
    }
}
