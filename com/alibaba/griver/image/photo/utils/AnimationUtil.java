package com.alibaba.griver.image.photo.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class AnimationUtil implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    private Animation f10502a;
    private OnAnimationEndListener b;
    private OnAnimationStartListener c;
    private OnAnimationRepeatListener d;

    public interface OnAnimationEndListener {
        void onAnimationEnd(Animation animation);
    }

    public interface OnAnimationRepeatListener {
        void onAnimationRepeat(Animation animation);
    }

    public interface OnAnimationStartListener {
        void onAnimationStart(Animation animation);
    }

    public AnimationUtil(Context context, int i) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
        this.f10502a = loadAnimation;
        loadAnimation.setAnimationListener(this);
    }

    public AnimationUtil setInterpolator(Interpolator interpolator) {
        this.f10502a.setInterpolator(interpolator);
        return this;
    }

    public void startAnimation(View view) {
        if (view.getAnimation() != null) {
            view.getAnimation().cancel();
        }
        view.startAnimation(this.f10502a);
    }

    public AnimationUtil setDuration(long j) {
        this.f10502a.setDuration(j);
        return this;
    }

    public AnimationUtil setFillAfter(boolean z) {
        this.f10502a.setFillAfter(z);
        return this;
    }

    public void onAnimationStart(Animation animation) {
        OnAnimationStartListener onAnimationStartListener = this.c;
        if (onAnimationStartListener != null) {
            onAnimationStartListener.onAnimationStart(animation);
        }
    }

    public void onAnimationEnd(Animation animation) {
        OnAnimationEndListener onAnimationEndListener = this.b;
        if (onAnimationEndListener != null) {
            onAnimationEndListener.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        OnAnimationRepeatListener onAnimationRepeatListener = this.d;
        if (onAnimationRepeatListener != null) {
            onAnimationRepeatListener.onAnimationRepeat(animation);
        }
    }

    public static void fadeInFadeOut(Activity activity) {
        if (activity != null) {
            activity.overridePendingTransition(17432576, 17432577);
        }
    }
}
