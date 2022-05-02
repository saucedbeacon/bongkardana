package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import o.findViewHolderForItemId;
import o.offsetPositionRecordsForInsert;

public final class findViewHolderForLayoutPosition extends findViewHolderForItemId {
    private setPreserveFocusAfterLayout toIntRange = new setPreserveFocusAfterLayout();

    public findViewHolderForLayoutPosition(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    public final findViewHolderForItemId getMin(int i, int i2, int i3, boolean z) {
        int i4 = i;
        int i5 = i3;
        boolean z2 = z;
        if (setMax(i, i2, i3, z)) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.getMin = animatorSet;
            this.setMax = i4;
            this.getMax = i2;
            this.isInside = i5;
            this.IsOverlapping = z2;
            int i6 = i5 * 2;
            this.equals = i4 - i5;
            this.toFloatRange = i4 + i5;
            this.toIntRange.getMin = this.equals;
            this.toIntRange.length = this.toFloatRange;
            this.toIntRange.setMin = i6;
            findViewHolderForItemId.setMax length = length(z2);
            double d = (double) this.setMin;
            Double.isNaN(d);
            long j = (long) (d * 0.8d);
            double d2 = (double) this.setMin;
            Double.isNaN(d2);
            long j2 = (long) (d2 * 0.2d);
            double d3 = (double) this.setMin;
            Double.isNaN(d3);
            long j3 = (long) (d3 * 0.5d);
            double d4 = (double) this.setMin;
            Double.isNaN(d4);
            long j4 = (long) (d4 * 0.5d);
            long j5 = j4;
            long j6 = j;
            ValueAnimator max = setMax(length.setMax, length.length, j6, false, this.toIntRange);
            ValueAnimator max2 = setMax(length.getMax, length.setMin, j6, true, this.toIntRange);
            max2.setStartDelay(j2);
            int i7 = i6;
            int i8 = i3;
            long j7 = j3;
            ValueAnimator min = getMin(i7, i8, j7);
            ValueAnimator min2 = getMin(i8, i7, j7);
            min2.setStartDelay(j5);
            ((AnimatorSet) this.getMin).playTogether(new Animator[]{max, max2, min, min2});
        }
        return this;
    }

    private ValueAnimator getMin(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                findViewHolderForLayoutPosition.setMin(findViewHolderForLayoutPosition.this, valueAnimator);
            }
        });
        return ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: getMin */
    public findViewHolderForLayoutPosition setMax(float f) {
        if (this.getMin != null) {
            long j = (long) (f * ((float) this.setMin));
            int size = ((AnimatorSet) this.getMin).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.getMin).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ findViewHolderForItemId getMin(long j) {
        super.length(j);
        return this;
    }

    public final /* synthetic */ invalidateItemDecorations length(long j) {
        super.length(j);
        return this;
    }

    static /* synthetic */ void setMin(findViewHolderForLayoutPosition findviewholderforlayoutposition, ValueAnimator valueAnimator) {
        findviewholderforlayoutposition.toIntRange.setMin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (findviewholderforlayoutposition.length != null) {
            findviewholderforlayoutposition.length.setMin(findviewholderforlayoutposition.toIntRange);
        }
    }
}
