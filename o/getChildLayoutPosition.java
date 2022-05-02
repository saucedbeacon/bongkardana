package o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import o.offsetPositionRecordsForInsert;

public final class getChildLayoutPosition extends invalidateItemDecorations<ValueAnimator> {
    private findContainingItemView getMax = new findContainingItemView();
    private int setMax = -1;
    private int toFloatRange = -1;

    public getChildLayoutPosition(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    @NonNull
    public final getChildLayoutPosition getMax(int i, int i2) {
        if (this.getMin != null && setMin(i, i2)) {
            this.setMax = i;
            this.toFloatRange = i2;
            PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{i, i2});
            ofInt.setEvaluator(new IntEvaluator());
            ((ValueAnimator) this.getMin).setValues(new PropertyValuesHolder[]{ofInt});
        }
        return this;
    }

    private boolean setMin(int i, int i2) {
        if (this.setMax == i && this.toFloatRange == i2) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ invalidateItemDecorations getMax(float f) {
        if (this.getMin != null) {
            long j = (long) (f * ((float) this.setMin));
            if (((ValueAnimator) this.getMin).getValues() != null && ((ValueAnimator) this.getMin).getValues().length > 0) {
                ((ValueAnimator) this.getMin).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    @NonNull
    public final /* synthetic */ Animator getMax() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                getChildLayoutPosition.length(getChildLayoutPosition.this, valueAnimator);
            }
        });
        return valueAnimator;
    }

    static /* synthetic */ void length(getChildLayoutPosition getchildlayoutposition, ValueAnimator valueAnimator) {
        getchildlayoutposition.getMax.setMin = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        if (getchildlayoutposition.length != null) {
            getchildlayoutposition.length.setMin(getchildlayoutposition.getMax);
        }
    }
}
