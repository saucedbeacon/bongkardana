package o;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.offsetPositionRecordsForInsert;

public class getChildPosition extends invalidateItemDecorations<ValueAnimator> {
    int getMax;
    int setMax;
    private markKnownViewsInvalid toFloatRange = new markKnownViewsInvalid();

    public getChildPosition(@Nullable offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    @NonNull
    /* renamed from: setMax */
    public ValueAnimator getMax() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                getChildPosition.getMax(getChildPosition.this, valueAnimator);
            }
        });
        return valueAnimator;
    }

    @NonNull
    public final getChildPosition setMin(int i, int i2) {
        if (this.getMin != null && setMax(i, i2)) {
            this.setMax = i;
            this.getMax = i2;
            ((ValueAnimator) this.getMin).setValues(new PropertyValuesHolder[]{length(false), length(true)});
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final PropertyValuesHolder length(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.getMax;
            i2 = this.setMax;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.setMax;
            i2 = this.getMax;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    private boolean setMax(int i, int i2) {
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

    static /* synthetic */ void getMax(getChildPosition getchildposition, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        getchildposition.toFloatRange.setMin = intValue;
        getchildposition.toFloatRange.length = intValue2;
        if (getchildposition.length != null) {
            getchildposition.length.setMin(getchildposition.toFloatRange);
        }
    }
}
