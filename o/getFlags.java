package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;
import o.RequiresPermission;

public class getFlags extends registerCallbackListener {
    private PorterDuff.Mode getMax = null;
    private boolean getMin = false;
    private ColorStateList length = null;
    private final SeekBar setMax;
    private Drawable setMin;
    private boolean toIntRange = false;

    public getFlags(SeekBar seekBar) {
        super(seekBar);
        this.setMax = seekBar;
    }

    public void getMax(AttributeSet attributeSet, int i) {
        super.getMax(attributeSet, i);
        prepareFromUri min = prepareFromUri.getMin(this.setMax.getContext(), attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.requestPostMessageChannel, i, 0);
        SeekBar seekBar = this.setMax;
        ViewCompat.getMax(seekBar, seekBar.getContext(), ITrustedWebActivityCallback.Stub.toIntRange.requestPostMessageChannel, attributeSet, min.setMin, i, 0);
        Drawable max = min.getMax(ITrustedWebActivityCallback.Stub.toIntRange.IPostMessageService);
        if (max != null) {
            this.setMax.setThumb(max);
        }
        getMax(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsService$Stub));
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.receiveFile)) {
            this.getMax = adjustVolume.setMin(min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.receiveFile, -1), this.getMax);
            this.toIntRange = true;
        }
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsService$Default)) {
            this.length = min.length(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsService$Default);
            this.getMin = true;
        }
        min.setMin.recycle();
        setMin();
    }

    /* access modifiers changed from: package-private */
    public void getMax(@Nullable Drawable drawable) {
        Drawable drawable2 = this.setMin;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.setMin = drawable;
        if (drawable != null) {
            drawable.setCallback(this.setMax);
            RequiresPermission.Read.setMax(drawable, ViewCompat.IsOverlapping(this.setMax));
            if (drawable.isStateful()) {
                drawable.setState(this.setMax.getDrawableState());
            }
            setMin();
        }
        this.setMax.invalidate();
    }

    private void setMin() {
        if (this.setMin == null) {
            return;
        }
        if (this.getMin || this.toIntRange) {
            Drawable intRange = RequiresPermission.Read.toIntRange(this.setMin.mutate());
            this.setMin = intRange;
            if (this.getMin) {
                RequiresPermission.Read.setMin(intRange, this.length);
            }
            if (this.toIntRange) {
                RequiresPermission.Read.setMin(this.setMin, this.getMax);
            }
            if (this.setMin.isStateful()) {
                this.setMin.setState(this.setMax.getDrawableState());
            }
        }
    }

    public void length() {
        Drawable drawable = this.setMin;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void setMax() {
        Drawable drawable = this.setMin;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.setMax.getDrawableState())) {
            this.setMax.invalidateDrawable(drawable);
        }
    }

    public void setMax(Canvas canvas) {
        if (this.setMin != null) {
            int max = this.setMax.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.setMin.getIntrinsicWidth();
                int intrinsicHeight = this.setMin.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.setMin.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.setMax.getWidth() - this.setMax.getPaddingLeft()) - this.setMax.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.setMax.getPaddingLeft(), (float) (this.setMax.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.setMin.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
