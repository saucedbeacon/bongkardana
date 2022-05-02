package me.zhanghai.android.materialprogressbar.internal;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import me.zhanghai.android.materialprogressbar.internal.DrawableContainerCompat;

public class AnimationScaleListDrawableCompat extends DrawableContainerCompat implements Animatable {
    private static final String TAG = "AnimationScaleListDrawableCompat";
    private AnimationScaleListState mAnimationScaleListState;
    private boolean mMutated;

    public AnimationScaleListDrawableCompat(@NonNull Drawable[] drawableArr) {
        setConstantState(new AnimationScaleListState((AnimationScaleListState) null, this, (Resources) null));
        for (Drawable addDrawable : drawableArr) {
            this.mAnimationScaleListState.addDrawable(addDrawable);
        }
        onStateChange(getState());
    }

    private AnimationScaleListDrawableCompat(@Nullable AnimationScaleListState animationScaleListState, @Nullable Resources resources) {
        setConstantState(new AnimationScaleListState(animationScaleListState, this, resources));
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return selectDrawable(this.mAnimationScaleListState.getCurrentDrawableIndexBasedOnScale()) || super.onStateChange(iArr);
    }

    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mAnimationScaleListState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    public void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    public void start() {
        Drawable current = getCurrent();
        if (current != null && (current instanceof Animatable)) {
            ((Animatable) current).start();
        }
    }

    public void stop() {
        Drawable current = getCurrent();
        if (current != null && (current instanceof Animatable)) {
            ((Animatable) current).stop();
        }
    }

    public boolean isRunning() {
        Drawable current = getCurrent();
        if (current == null || !(current instanceof Animatable)) {
            return false;
        }
        return ((Animatable) current).isRunning();
    }

    static class AnimationScaleListState extends DrawableContainerCompat.DrawableContainerState {
        int mAnimatableDrawableIndex = -1;
        int mStaticDrawableIndex = -1;
        int[] mThemeAttrs = null;

        AnimationScaleListState(AnimationScaleListState animationScaleListState, AnimationScaleListDrawableCompat animationScaleListDrawableCompat, Resources resources) {
            super(animationScaleListState, animationScaleListDrawableCompat, resources);
            if (animationScaleListState != null) {
                this.mThemeAttrs = animationScaleListState.mThemeAttrs;
                this.mStaticDrawableIndex = animationScaleListState.mStaticDrawableIndex;
                this.mAnimatableDrawableIndex = animationScaleListState.mAnimatableDrawableIndex;
            }
        }

        /* access modifiers changed from: package-private */
        public void mutate() {
            int[] iArr = this.mThemeAttrs;
            this.mThemeAttrs = iArr != null ? (int[]) iArr.clone() : null;
        }

        /* access modifiers changed from: package-private */
        public int addDrawable(Drawable drawable) {
            int addChild = addChild(drawable);
            if (drawable instanceof Animatable) {
                this.mAnimatableDrawableIndex = addChild;
            } else {
                this.mStaticDrawableIndex = addChild;
            }
            return addChild;
        }

        public Drawable newDrawable() {
            return new AnimationScaleListDrawableCompat(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new AnimationScaleListDrawableCompat(this, resources);
        }

        @RequiresApi(21)
        public boolean canApplyTheme() {
            return this.mThemeAttrs != null || super.canApplyTheme();
        }

        public int getCurrentDrawableIndexBasedOnScale() {
            if (!ValueAnimatorCompat.areAnimatorsEnabled()) {
                return this.mStaticDrawableIndex;
            }
            return this.mAnimatableDrawableIndex;
        }
    }

    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    public void setConstantState(@NonNull DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof AnimationScaleListState) {
            this.mAnimationScaleListState = (AnimationScaleListState) drawableContainerState;
        }
    }
}
