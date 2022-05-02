package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class sendMediaButton {
    private addQueueItemAt getMin;
    @NonNull
    private final ImageView length;
    private addQueueItemAt setMax;
    private addQueueItemAt setMin;

    public sendMediaButton(@NonNull ImageView imageView) {
        this.length = imageView;
    }

    public void getMin(AttributeSet attributeSet, int i) {
        int resourceId;
        prepareFromUri min = prepareFromUri.getMin(this.length.getContext(), attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.postMessage, i, 0);
        ImageView imageView = this.length;
        ViewCompat.getMax(imageView, imageView.getContext(), ITrustedWebActivityCallback.Stub.toIntRange.postMessage, attributeSet, min.setMin, i, 0);
        try {
            Drawable drawable = this.length.getDrawable();
            if (!(drawable != null || (resourceId = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.validateRelationship, -1)) == -1 || (drawable = cancelAll.getMin(this.length.getContext(), resourceId)) == null)) {
                this.length.setImageDrawable(drawable);
            }
            if (drawable != null) {
                adjustVolume.length(drawable);
            }
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.updateVisuals)) {
                onMenuOpened.getMin(this.length, min.length(ITrustedWebActivityCallback.Stub.toIntRange.updateVisuals));
            }
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.requestPostMessageChannelWithExtras)) {
                onMenuOpened.getMax(this.length, adjustVolume.setMin(min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.requestPostMessageChannelWithExtras, -1), (PorterDuff.Mode) null));
            }
        } finally {
            min.setMin.recycle();
        }
    }

    public void setMax(int i) {
        if (i != 0) {
            Drawable min = cancelAll.getMin(this.length.getContext(), i);
            if (min != null) {
                adjustVolume.length(min);
            }
            this.length.setImageDrawable(min);
        } else {
            this.length.setImageDrawable((Drawable) null);
        }
        getMin();
    }

    public boolean setMin() {
        return Build.VERSION.SDK_INT < 21 || !(this.length.getBackground() instanceof RippleDrawable);
    }

    public void getMax(ColorStateList colorStateList) {
        if (this.setMin == null) {
            this.setMin = new addQueueItemAt();
        }
        this.setMin.getMax = colorStateList;
        this.setMin.setMin = true;
        getMin();
    }

    public ColorStateList getMax() {
        addQueueItemAt addqueueitemat = this.setMin;
        if (addqueueitemat != null) {
            return addqueueitemat.getMax;
        }
        return null;
    }

    public void getMax(PorterDuff.Mode mode) {
        if (this.setMin == null) {
            this.setMin = new addQueueItemAt();
        }
        this.setMin.length = mode;
        this.setMin.getMin = true;
        getMin();
    }

    public PorterDuff.Mode length() {
        addQueueItemAt addqueueitemat = this.setMin;
        if (addqueueitemat != null) {
            return addqueueitemat.length;
        }
        return null;
    }

    public void getMin() {
        Drawable drawable = this.length.getDrawable();
        if (drawable != null) {
            adjustVolume.length(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!setMax() || !setMax(drawable)) {
            addQueueItemAt addqueueitemat = this.setMin;
            if (addqueueitemat != null) {
                unregisterCallbackListener.setMax(drawable, addqueueitemat, this.length.getDrawableState());
                return;
            }
            addQueueItemAt addqueueitemat2 = this.getMin;
            if (addqueueitemat2 != null) {
                unregisterCallbackListener.setMax(drawable, addqueueitemat2, this.length.getDrawableState());
            }
        }
    }

    private boolean setMax() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.getMin != null : i == 21;
    }

    private boolean setMax(@NonNull Drawable drawable) {
        if (this.setMax == null) {
            this.setMax = new addQueueItemAt();
        }
        addQueueItemAt addqueueitemat = this.setMax;
        addqueueitemat.getMax = null;
        addqueueitemat.setMin = false;
        addqueueitemat.length = null;
        addqueueitemat.getMin = false;
        ColorStateList min = onMenuOpened.setMin(this.length);
        if (min != null) {
            addqueueitemat.setMin = true;
            addqueueitemat.getMax = min;
        }
        PorterDuff.Mode length2 = onMenuOpened.length(this.length);
        if (length2 != null) {
            addqueueitemat.getMin = true;
            addqueueitemat.length = length2;
        }
        if (!addqueueitemat.setMin && !addqueueitemat.getMin) {
            return false;
        }
        unregisterCallbackListener.setMax(drawable, addqueueitemat, this.length.getDrawableState());
        return true;
    }
}
