package o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import o.offsetPositionRecordsForInsert;

public final class findViewHolderForPosition extends invalidateItemDecorations<ValueAnimator> {
    private getPreserveFocusAfterLayout IsOverlapping = new getPreserveFocusAfterLayout();
    private int getMax = -1;
    private int setMax = -1;

    public findViewHolderForPosition(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    @NonNull
    public final findViewHolderForPosition getMax(int i, int i2) {
        if (this.getMin != null && length(i, i2)) {
            this.setMax = i;
            this.getMax = i2;
            PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{i, i2});
            ofInt.setEvaluator(new IntEvaluator());
            PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE_REVERSE", new int[]{i2, i});
            ofInt2.setEvaluator(new IntEvaluator());
            ((ValueAnimator) this.getMin).setValues(new PropertyValuesHolder[]{ofInt, ofInt2});
        }
        return this;
    }

    private boolean length(int i, int i2) {
        if (this.setMax == i && this.getMax == i2) {
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
                findViewHolderForPosition.getMin(findViewHolderForPosition.this, valueAnimator);
            }
        });
        return valueAnimator;
    }

    static /* synthetic */ void getMin(findViewHolderForPosition findviewholderforposition, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        findviewholderforposition.IsOverlapping.setMin = intValue;
        findviewholderforposition.IsOverlapping.getMin = intValue2;
        if (findviewholderforposition.length != null) {
            findviewholderforposition.length.setMin(findviewholderforposition.IsOverlapping);
        }
    }
}
