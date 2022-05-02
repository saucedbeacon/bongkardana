package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.internal.DrawableCompat;
import o.prepareFromUri;

public class MaterialProgressBar extends ProgressBar {
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_DYNAMIC = 1;
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_NORMAL = 0;
    public static final int PROGRESS_STYLE_CIRCULAR = 0;
    public static final int PROGRESS_STYLE_HORIZONTAL = 1;
    private static final String TAG = MaterialProgressBar.class.getSimpleName();
    private int mProgressStyle;
    @NonNull
    private final TintInfo mProgressTintInfo = new TintInfo();
    private boolean mSuperInitialized = true;

    private void logDrawableTintWarning() {
    }

    private void logProgressBarTintWarning() {
    }

    public MaterialProgressBar(@NonNull Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    public MaterialProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public MaterialProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public MaterialProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    private void init(@Nullable AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        prepareFromUri min = prepareFromUri.getMin(context, attributeSet, R.styleable.MaterialProgressBar, i, i2);
        this.mProgressStyle = min.setMin.getInt(R.styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean max = min.setMax(R.styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean max2 = min.setMax(R.styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean max3 = min.setMax(R.styleable.MaterialProgressBar_mpb_showProgressBackground, this.mProgressStyle == 1);
        int i3 = min.setMin.getInt(R.styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_progressTint)) {
            this.mProgressTintInfo.mProgressTint = min.length(R.styleable.MaterialProgressBar_mpb_progressTint);
            this.mProgressTintInfo.mHasProgressTint = true;
        }
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_progressTintMode)) {
            this.mProgressTintInfo.mProgressTintMode = DrawableCompat.parseTintMode(min.setMin.getInt(R.styleable.MaterialProgressBar_mpb_progressTintMode, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasProgressTintMode = true;
        }
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
            this.mProgressTintInfo.mSecondaryProgressTint = min.length(R.styleable.MaterialProgressBar_mpb_secondaryProgressTint);
            this.mProgressTintInfo.mHasSecondaryProgressTint = true;
        }
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
            this.mProgressTintInfo.mSecondaryProgressTintMode = DrawableCompat.parseTintMode(min.setMin.getInt(R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasSecondaryProgressTintMode = true;
        }
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
            this.mProgressTintInfo.mProgressBackgroundTint = min.length(R.styleable.MaterialProgressBar_mpb_progressBackgroundTint);
            this.mProgressTintInfo.mHasProgressBackgroundTint = true;
        }
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
            this.mProgressTintInfo.mProgressBackgroundTintMode = DrawableCompat.parseTintMode(min.setMin.getInt(R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasProgressBackgroundTintMode = true;
        }
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_indeterminateTint)) {
            this.mProgressTintInfo.mIndeterminateTint = min.length(R.styleable.MaterialProgressBar_mpb_indeterminateTint);
            this.mProgressTintInfo.mHasIndeterminateTint = true;
        }
        if (min.setMin(R.styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
            this.mProgressTintInfo.mIndeterminateTintMode = DrawableCompat.parseTintMode(min.setMin.getInt(R.styleable.MaterialProgressBar_mpb_indeterminateTintMode, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasIndeterminateTintMode = true;
        }
        min.setMin.recycle();
        int i4 = this.mProgressStyle;
        if (i4 == 0) {
            if ((isIndeterminate() || max) && !isInEditMode()) {
                setIndeterminateDrawable(new AnimationScaleIndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || max) {
                setProgressDrawable(new CircularProgressDrawable(i3, context));
            }
        } else if (i4 == 1) {
            if ((isIndeterminate() || max) && !isInEditMode()) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || max) {
                setProgressDrawable(new HorizontalProgressDrawable(context));
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown progress style: ");
            sb.append(this.mProgressStyle);
            throw new IllegalArgumentException(sb.toString());
        }
        setUseIntrinsicPadding(max2);
        setShowProgressBackground(max3);
    }

    public synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        if (this.mSuperInitialized) {
            getCurrentDrawable();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fixCanvasScalingAndColorFilterWhenHardwareAccelerated();
    }

    private void fixCanvasScalingAndColorFilterWhenHardwareAccelerated() {
        if (Build.VERSION.SDK_INT < 21 && isHardwareAccelerated() && getLayerType() != 1) {
            setLayerType(1, (Paint) null);
        }
    }

    public int getProgressStyle() {
        return this.mProgressStyle;
    }

    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public boolean getUseIntrinsicPadding() {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            return ((IntrinsicPaddingDrawable) currentDrawable).getUseIntrinsicPadding();
        }
        return false;
    }

    public void setUseIntrinsicPadding(boolean z) {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) currentDrawable).setUseIntrinsicPadding(z);
        }
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) indeterminateDrawable).setUseIntrinsicPadding(z);
        }
    }

    public boolean getShowProgressBackground() {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            return ((ShowBackgroundDrawable) currentDrawable).getShowBackground();
        }
        return false;
    }

    public void setShowProgressBackground(boolean z) {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) currentDrawable).setShowBackground(z);
        }
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) indeterminateDrawable).setShowBackground(z);
        }
    }

    public void setProgressDrawable(@Nullable Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyProgressTints();
        }
    }

    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyIndeterminateTint();
        }
    }

    @Nullable
    public ColorStateList getProgressTintList() {
        logProgressBarTintWarning();
        return getSupportProgressTintList();
    }

    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        logProgressBarTintWarning();
        setSupportProgressTintList(colorStateList);
    }

    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        logProgressBarTintWarning();
        return getSupportProgressTintMode();
    }

    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        logProgressBarTintWarning();
        setSupportProgressTintMode(mode);
    }

    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        logProgressBarTintWarning();
        return getSupportSecondaryProgressTintList();
    }

    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        logProgressBarTintWarning();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        logProgressBarTintWarning();
        return getSupportSecondaryProgressTintMode();
    }

    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        logProgressBarTintWarning();
        setSupportSecondaryProgressTintMode(mode);
    }

    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        logProgressBarTintWarning();
        return getSupportProgressBackgroundTintList();
    }

    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        logProgressBarTintWarning();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        logProgressBarTintWarning();
        return getSupportProgressBackgroundTintMode();
    }

    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        logProgressBarTintWarning();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Nullable
    public ColorStateList getIndeterminateTintList() {
        logProgressBarTintWarning();
        return getSupportIndeterminateTintList();
    }

    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        logProgressBarTintWarning();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        logProgressBarTintWarning();
        return getSupportIndeterminateTintMode();
    }

    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        logProgressBarTintWarning();
        setSupportIndeterminateTintMode(mode);
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.mProgressTintInfo.mProgressTint;
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        this.mProgressTintInfo.mProgressTint = colorStateList;
        this.mProgressTintInfo.mHasProgressTint = true;
        applyPrimaryProgressTint();
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.mProgressTintInfo.mProgressTintMode;
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        this.mProgressTintInfo.mProgressTintMode = mode;
        this.mProgressTintInfo.mHasProgressTintMode = true;
        applyPrimaryProgressTint();
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.mProgressTintInfo.mSecondaryProgressTint;
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        this.mProgressTintInfo.mSecondaryProgressTint = colorStateList;
        this.mProgressTintInfo.mHasSecondaryProgressTint = true;
        applySecondaryProgressTint();
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.mProgressTintInfo.mSecondaryProgressTintMode;
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        this.mProgressTintInfo.mSecondaryProgressTintMode = mode;
        this.mProgressTintInfo.mHasSecondaryProgressTintMode = true;
        applySecondaryProgressTint();
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.mProgressTintInfo.mProgressBackgroundTint;
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.mProgressTintInfo.mProgressBackgroundTint = colorStateList;
        this.mProgressTintInfo.mHasProgressBackgroundTint = true;
        applyProgressBackgroundTint();
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.mProgressTintInfo.mProgressBackgroundTintMode;
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.mProgressTintInfo.mProgressBackgroundTintMode = mode;
        this.mProgressTintInfo.mHasProgressBackgroundTintMode = true;
        applyProgressBackgroundTint();
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.mProgressTintInfo.mIndeterminateTint;
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        this.mProgressTintInfo.mIndeterminateTint = colorStateList;
        this.mProgressTintInfo.mHasIndeterminateTint = true;
        applyIndeterminateTint();
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.mProgressTintInfo.mIndeterminateTintMode;
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        this.mProgressTintInfo.mIndeterminateTintMode = mode;
        this.mProgressTintInfo.mHasIndeterminateTintMode = true;
        applyIndeterminateTint();
    }

    private void applyProgressTints() {
        if (getProgressDrawable() != null) {
            applyPrimaryProgressTint();
            applyProgressBackgroundTint();
            applySecondaryProgressTint();
        }
    }

    private void applyPrimaryProgressTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() != null) {
            if ((this.mProgressTintInfo.mHasProgressTint || this.mProgressTintInfo.mHasProgressTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908301, true)) != null) {
                applyTintForDrawable(tintTargetFromProgressDrawable, this.mProgressTintInfo.mProgressTint, this.mProgressTintInfo.mHasProgressTint, this.mProgressTintInfo.mProgressTintMode, this.mProgressTintInfo.mHasProgressTintMode);
            }
        }
    }

    private void applySecondaryProgressTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() != null) {
            if ((this.mProgressTintInfo.mHasSecondaryProgressTint || this.mProgressTintInfo.mHasSecondaryProgressTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908303, false)) != null) {
                applyTintForDrawable(tintTargetFromProgressDrawable, this.mProgressTintInfo.mSecondaryProgressTint, this.mProgressTintInfo.mHasSecondaryProgressTint, this.mProgressTintInfo.mSecondaryProgressTintMode, this.mProgressTintInfo.mHasSecondaryProgressTintMode);
            }
        }
    }

    private void applyProgressBackgroundTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() != null) {
            if ((this.mProgressTintInfo.mHasProgressBackgroundTint || this.mProgressTintInfo.mHasProgressBackgroundTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908288, false)) != null) {
                applyTintForDrawable(tintTargetFromProgressDrawable, this.mProgressTintInfo.mProgressBackgroundTint, this.mProgressTintInfo.mHasProgressBackgroundTint, this.mProgressTintInfo.mProgressBackgroundTintMode, this.mProgressTintInfo.mHasProgressBackgroundTintMode);
            }
        }
    }

    @Nullable
    private Drawable getTintTargetFromProgressDrawable(int i, boolean z) {
        Drawable progressDrawable = getProgressDrawable();
        Drawable drawable = null;
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        if (progressDrawable instanceof LayerDrawable) {
            drawable = ((LayerDrawable) progressDrawable).findDrawableByLayerId(i);
        }
        return (drawable != null || !z) ? drawable : progressDrawable;
    }

    private void applyIndeterminateTint() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            if (this.mProgressTintInfo.mHasIndeterminateTint || this.mProgressTintInfo.mHasIndeterminateTintMode) {
                indeterminateDrawable.mutate();
                applyTintForDrawable(indeterminateDrawable, this.mProgressTintInfo.mIndeterminateTint, this.mProgressTintInfo.mHasIndeterminateTint, this.mProgressTintInfo.mIndeterminateTintMode, this.mProgressTintInfo.mHasIndeterminateTintMode);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void applyTintForDrawable(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, boolean z, @Nullable PorterDuff.Mode mode, boolean z2) {
        if (z || z2) {
            if (z) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintList(colorStateList);
                } else {
                    logDrawableTintWarning();
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.setTintList(colorStateList);
                    }
                }
            }
            if (z2) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintMode(mode);
                } else {
                    logDrawableTintWarning();
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.setTintMode(mode);
                    }
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    static class TintInfo {
        public boolean mHasIndeterminateTint;
        public boolean mHasIndeterminateTintMode;
        public boolean mHasProgressBackgroundTint;
        public boolean mHasProgressBackgroundTintMode;
        public boolean mHasProgressTint;
        public boolean mHasProgressTintMode;
        public boolean mHasSecondaryProgressTint;
        public boolean mHasSecondaryProgressTintMode;
        @Nullable
        public ColorStateList mIndeterminateTint;
        @Nullable
        public PorterDuff.Mode mIndeterminateTintMode;
        @Nullable
        public ColorStateList mProgressBackgroundTint;
        @Nullable
        public PorterDuff.Mode mProgressBackgroundTintMode;
        @Nullable
        public ColorStateList mProgressTint;
        @Nullable
        public PorterDuff.Mode mProgressTintMode;
        @Nullable
        public ColorStateList mSecondaryProgressTint;
        @Nullable
        public PorterDuff.Mode mSecondaryProgressTintMode;

        private TintInfo() {
        }
    }
}
