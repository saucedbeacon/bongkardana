package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import androidx.annotation.NonNull;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

abstract class BaseIndeterminateProgressDrawable extends BaseProgressDrawable implements Animatable {
    @NonNull
    protected Animator[] mAnimators;

    @SuppressLint({"NewApi"})
    public BaseIndeterminateProgressDrawable(@NonNull Context context) {
        setTint(ThemeUtils.getColorFromAttrRes(R.attr.colorControlActivated, -16777216, context));
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (isStarted()) {
            invalidateSelf();
        }
    }

    public void start() {
        if (!isStarted()) {
            for (Animator start : this.mAnimators) {
                start.start();
            }
            invalidateSelf();
        }
    }

    private boolean isStarted() {
        for (Animator isStarted : this.mAnimators) {
            if (isStarted.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void stop() {
        for (Animator end : this.mAnimators) {
            end.end();
        }
    }

    public boolean isRunning() {
        for (Animator isRunning : this.mAnimators) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }
}
