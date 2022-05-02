package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import o.IMediaControllerCallback;
import o.ITrustedWebActivityCallback;
import o.addQueueItem;
import o.closeOptionsMenu;
import o.getShuffleMode;
import o.onStart;
import o.sendMediaButton;

public class AppCompatImageButton extends ImageButton implements onStart, closeOptionsMenu {
    private final IMediaControllerCallback.Stub.Proxy mBackgroundTintHelper;
    private final sendMediaButton mImageHelper;

    public AppCompatImageButton(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.onMessageChannelReady);
    }

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(addQueueItem.getMax(context), attributeSet, i);
        getShuffleMode.getMax(getContext());
        IMediaControllerCallback.Stub.Proxy proxy = new IMediaControllerCallback.Stub.Proxy(this);
        this.mBackgroundTintHelper = proxy;
        proxy.setMin(attributeSet, i);
        sendMediaButton sendmediabutton = new sendMediaButton(this);
        this.mImageHelper = sendmediabutton;
        sendmediabutton.getMin(attributeSet, i);
    }

    public void setImageResource(@DrawableRes int i) {
        this.mImageHelper.setMax(i);
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            sendmediabutton.getMin();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            sendmediabutton.getMin();
        }
    }

    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            sendmediabutton.getMin();
        }
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

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            sendmediabutton.getMax(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            return sendmediabutton.getMax();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            sendmediabutton.getMax(mode);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            return sendmediabutton.length();
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
        sendMediaButton sendmediabutton = this.mImageHelper;
        if (sendmediabutton != null) {
            sendmediabutton.getMin();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.mImageHelper.setMin() && super.hasOverlappingRendering();
    }
}
