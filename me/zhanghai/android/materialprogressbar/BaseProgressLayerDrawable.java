package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;
import me.zhanghai.android.materialprogressbar.TintableDrawable;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;
import o.NavigationRes;

class BaseProgressLayerDrawable<ProgressDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable, BackgroundDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable> extends LayerDrawable implements IntrinsicPaddingDrawable, MaterialProgressDrawable, ShowBackgroundDrawable, TintableDrawable {
    @FloatRange(from = 0.0d, to = 1.0d)
    private float mBackgroundAlpha;
    @NonNull
    private final BackgroundDrawableType mBackgroundDrawable = ((IntrinsicPaddingDrawable) getDrawable(0));
    @NonNull
    private final ProgressDrawableType mProgressDrawable;
    @NonNull
    private final ProgressDrawableType mSecondaryProgressDrawable;

    public BaseProgressLayerDrawable(@NonNull Drawable[] drawableArr, @NonNull Context context) {
        super(drawableArr);
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, 0.0f, context);
        setId(0, 16908288);
        setId(1, 16908303);
        this.mSecondaryProgressDrawable = (IntrinsicPaddingDrawable) getDrawable(1);
        setId(2, 16908301);
        this.mProgressDrawable = (IntrinsicPaddingDrawable) getDrawable(2);
        setTint(ThemeUtils.getColorFromAttrRes(R.attr.colorControlActivated, -16777216, context));
    }

    public boolean getShowBackground() {
        return ((ShowBackgroundDrawable) this.mBackgroundDrawable).getShowBackground();
    }

    public void setShowBackground(boolean z) {
        if (((ShowBackgroundDrawable) this.mBackgroundDrawable).getShowBackground() != z) {
            ((ShowBackgroundDrawable) this.mBackgroundDrawable).setShowBackground(z);
            ((ShowBackgroundDrawable) this.mSecondaryProgressDrawable).setShowBackground(!z);
        }
    }

    public boolean getUseIntrinsicPadding() {
        return this.mBackgroundDrawable.getUseIntrinsicPadding();
    }

    public void setUseIntrinsicPadding(boolean z) {
        this.mBackgroundDrawable.setUseIntrinsicPadding(z);
        this.mSecondaryProgressDrawable.setUseIntrinsicPadding(z);
        this.mProgressDrawable.setUseIntrinsicPadding(z);
    }

    @SuppressLint({"NewApi"})
    public void setTint(@ColorInt int i) {
        int max = NavigationRes.getMax(i, Math.round(((float) Color.alpha(i)) * this.mBackgroundAlpha));
        ((TintableDrawable) this.mBackgroundDrawable).setTint(max);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTint(max);
        ((TintableDrawable) this.mProgressDrawable).setTint(i);
    }

    @SuppressLint({"NewApi"})
    public void setTintList(@Nullable ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (colorStateList != null) {
            colorStateList.isOpaque();
            colorStateList2 = colorStateList.withAlpha(Math.round(this.mBackgroundAlpha * 255.0f));
        } else {
            colorStateList2 = null;
        }
        ((TintableDrawable) this.mBackgroundDrawable).setTintList(colorStateList2);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTintList(colorStateList2);
        ((TintableDrawable) this.mProgressDrawable).setTintList(colorStateList);
    }

    @SuppressLint({"NewApi"})
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        ((TintableDrawable) this.mBackgroundDrawable).setTintMode(mode);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTintMode(mode);
        ((TintableDrawable) this.mProgressDrawable).setTintMode(mode);
    }
}
