package o;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import id.dana.domain.foundation.logger.PerformanceConstant;

@SuppressLint({"NewApi"})
public abstract class ExifInterface$IfdType extends ExtractButtonCompat implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    protected float getMax = 0.0f;
    protected ObjectAnimator getMin;
    protected float length = 0.0f;
    protected float setMax;

    public abstract void getMin();

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    public ExifInterface$IfdType() {
        super((setTargetFragment) null, 0.0f, 0.0f, (getActivity) null, (View) null);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, PerformanceConstant.PERFORMANCE_PHASE, new float[]{0.0f, 1.0f});
        this.getMin = ofFloat;
        ofFloat.setDuration(0);
        this.getMin.addUpdateListener(this);
        this.getMin.addListener(this);
    }

    @SuppressLint({"NewApi"})
    public void run() {
        this.getMin.start();
    }

    /* access modifiers changed from: protected */
    public final void length() {
        this.getMin.removeAllListeners();
        this.getMin.removeAllUpdateListeners();
        this.getMin.reverse();
        this.getMin.addUpdateListener(this);
        this.getMin.addListener(this);
    }

    public void onAnimationEnd(Animator animator) {
        try {
            getMin();
        } catch (IllegalArgumentException unused) {
        }
    }

    public void onAnimationCancel(Animator animator) {
        try {
            getMin();
        } catch (IllegalArgumentException unused) {
        }
    }
}
