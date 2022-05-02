package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

abstract class BaseDrawable extends Drawable implements TintableDrawable {
    @IntRange(from = 0, to = 255)
    protected int mAlpha = 255;
    @Nullable
    protected ColorFilter mColorFilter;
    @NonNull
    private final DummyConstantState mConstantState = new DummyConstantState();
    @Nullable
    protected PorterDuffColorFilter mTintFilter;
    @Nullable
    protected ColorStateList mTintList;
    @NonNull
    protected PorterDuff.Mode mTintMode = PorterDuff.Mode.SRC_IN;

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public abstract void onDraw(@NonNull Canvas canvas, int i, int i2);

    BaseDrawable() {
    }

    @IntRange(from = 0, to = 255)
    public int getAlpha() {
        return this.mAlpha;
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        if (this.mAlpha != i) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    @Nullable
    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mColorFilter = colorFilter;
        invalidateSelf();
    }

    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }

    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.mTintMode = mode;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.mTintList;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(@NonNull int[] iArr) {
        return updateTintFilter();
    }

    private boolean updateTintFilter() {
        ColorStateList colorStateList = this.mTintList;
        boolean z = true;
        if (colorStateList == null || this.mTintMode == null) {
            if (this.mTintFilter == null) {
                z = false;
            }
            this.mTintFilter = null;
            return z;
        }
        this.mTintFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.mTintMode);
        return true;
    }

    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() != 0 && bounds.height() != 0) {
            int save = canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            onDraw(canvas, bounds.width(), bounds.height());
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public ColorFilter getColorFilterForDrawing() {
        ColorFilter colorFilter = this.mColorFilter;
        return colorFilter != null ? colorFilter : this.mTintFilter;
    }

    @NonNull
    public Drawable.ConstantState getConstantState() {
        return this.mConstantState;
    }

    class DummyConstantState extends Drawable.ConstantState {
        public int getChangingConfigurations() {
            return 0;
        }

        private DummyConstantState() {
        }

        @NonNull
        public Drawable newDrawable() {
            return BaseDrawable.this;
        }
    }
}
