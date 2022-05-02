package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;
import o.onNestedPreFling;

public final class setUiOptions {
    @Nullable
    public static Animator getMin(@NonNull View view, @NonNull hasIcon hasicon, int i, int i2, float f, float f2, float f3, float f4, @Nullable TimeInterpolator timeInterpolator, @NonNull Transition transition) {
        float f5;
        float f6;
        View view2 = view;
        hasIcon hasicon2 = hasicon;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) hasicon2.setMin.getTag(onNestedPreFling.setMin.setMax);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        setMin setmin = new setMin(view, hasicon2.setMin, round, round2, translationX, translationY);
        transition.addListener(setmin);
        ofPropertyValuesHolder.addListener(setmin);
        if (Build.VERSION.SDK_INT >= 19) {
            ofPropertyValuesHolder.addPauseListener(setmin);
        }
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    static class setMin extends AnimatorListenerAdapter implements Transition.getMax {
        private float equals;
        private final View getMax;
        private final View getMin;
        private final float isInside;
        private int[] length;
        private final int setMax;
        private final int setMin;
        private float toFloatRange;
        private final float toIntRange;

        public final void onTransitionCancel(@NonNull Transition transition) {
        }

        public final void onTransitionPause(@NonNull Transition transition) {
        }

        public final void onTransitionResume(@NonNull Transition transition) {
        }

        public final void onTransitionStart(@NonNull Transition transition) {
        }

        setMin(View view, View view2, int i, int i2, float f, float f2) {
            this.getMin = view;
            this.getMax = view2;
            this.setMin = i - Math.round(view.getTranslationX());
            this.setMax = i2 - Math.round(this.getMin.getTranslationY());
            this.isInside = f;
            this.toIntRange = f2;
            int[] iArr = (int[]) this.getMax.getTag(onNestedPreFling.setMin.setMax);
            this.length = iArr;
            if (iArr != null) {
                this.getMax.setTag(onNestedPreFling.setMin.setMax, (Object) null);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.length == null) {
                this.length = new int[2];
            }
            this.length[0] = Math.round(((float) this.setMin) + this.getMin.getTranslationX());
            this.length[1] = Math.round(((float) this.setMax) + this.getMin.getTranslationY());
            this.getMax.setTag(onNestedPreFling.setMin.setMax, this.length);
        }

        public final void onAnimationPause(Animator animator) {
            this.equals = this.getMin.getTranslationX();
            this.toFloatRange = this.getMin.getTranslationY();
            this.getMin.setTranslationX(this.isInside);
            this.getMin.setTranslationY(this.toIntRange);
        }

        public final void onAnimationResume(Animator animator) {
            this.getMin.setTranslationX(this.equals);
            this.getMin.setTranslationY(this.toFloatRange);
        }

        public final void onTransitionEnd(@NonNull Transition transition) {
            this.getMin.setTranslationX(this.isInside);
            this.getMin.setTranslationY(this.toIntRange);
            transition.removeListener(this);
        }
    }
}
