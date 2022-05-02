package o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import o.offsetPositionRecordsForInsert;

public class getChildViewHolderInt extends getChildPosition {
    float isInside;
    int toFloatRange;
    private viewRangeUpdate toIntRange = new viewRangeUpdate();

    @NonNull
    public final /* synthetic */ Animator getMax() {
        return getMax();
    }

    public getChildViewHolderInt(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    @NonNull
    public final ValueAnimator setMax() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                getChildViewHolderInt.length(getChildViewHolderInt.this, valueAnimator);
            }
        });
        return valueAnimator;
    }

    @NonNull
    public final getChildViewHolderInt getMin(int i, int i2, int i3, float f) {
        if (this.getMin != null && length(i, i2, i3, f)) {
            this.setMax = i;
            this.getMax = i2;
            this.toFloatRange = i3;
            this.isInside = f;
            ((ValueAnimator) this.getMin).setValues(new PropertyValuesHolder[]{length(false), length(true), getMin(false), getMin(true)});
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public PropertyValuesHolder getMin(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.toFloatRange;
            i2 = (int) (((float) i) * this.isInside);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.toFloatRange;
            i = (int) (((float) i2) * this.isInside);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean length(int i, int i2, int i3, float f) {
        if (this.setMax == i && this.getMax == i2 && this.toFloatRange == i3 && this.isInside == f) {
            return false;
        }
        return true;
    }

    static /* synthetic */ void length(getChildViewHolderInt getchildviewholderint, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        getchildviewholderint.toIntRange.setMin = intValue;
        getchildviewholderint.toIntRange.length = intValue2;
        getchildviewholderint.toIntRange.setMax = intValue3;
        getchildviewholderint.toIntRange.getMin = intValue4;
        if (getchildviewholderint.length != null) {
            getchildviewholderint.length.setMin(getchildviewholderint.toIntRange);
        }
    }
}
