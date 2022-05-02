package o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import o.offsetPositionRecordsForInsert;

public final class findContainingViewHolder extends getChildPosition {
    private offsetPositionRecordsForRemove IsOverlapping = new offsetPositionRecordsForRemove();
    private int equals;
    private int toFloatRange;

    @NonNull
    public final /* synthetic */ Animator getMax() {
        return getMax();
    }

    public findContainingViewHolder(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    @NonNull
    public final ValueAnimator setMax() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                findContainingViewHolder.length(findContainingViewHolder.this, valueAnimator);
            }
        });
        return valueAnimator;
    }

    @NonNull
    public final findContainingViewHolder setMax(int i, int i2, int i3, int i4) {
        if (this.getMin != null && setMin(i, i2, i3, i4)) {
            this.setMax = i;
            this.getMax = i2;
            this.toFloatRange = i3;
            this.equals = i4;
            ((ValueAnimator) this.getMin).setValues(new PropertyValuesHolder[]{length(false), length(true), setMin(false), setMin(true), getMax(false), getMax(true)});
        }
        return this;
    }

    @NonNull
    private PropertyValuesHolder setMin(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.toFloatRange;
            i2 = i / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i2 = this.toFloatRange;
            i = i2 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    @NonNull
    private PropertyValuesHolder getMax(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.toFloatRange;
            str = "ANIMATION_STROKE_REVERSE";
            i2 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i2 = this.toFloatRange;
            i = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean setMin(int i, int i2, int i3, int i4) {
        if (this.setMax == i && this.getMax == i2 && this.toFloatRange == i3 && this.equals == i4) {
            return false;
        }
        return true;
    }

    static /* synthetic */ void length(findContainingViewHolder findcontainingviewholder, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        findcontainingviewholder.IsOverlapping.setMin = intValue;
        findcontainingviewholder.IsOverlapping.length = intValue2;
        findcontainingviewholder.IsOverlapping.getMin = intValue3;
        findcontainingviewholder.IsOverlapping.setMax = intValue4;
        findcontainingviewholder.IsOverlapping.getMax = intValue5;
        findcontainingviewholder.IsOverlapping.isInside = intValue6;
        if (findcontainingviewholder.length != null) {
            findcontainingviewholder.length.setMin(findcontainingviewholder.IsOverlapping);
        }
    }
}
