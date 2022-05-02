package com.rd.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import java.util.Iterator;
import o.invalidateItemDecorations;
import o.offsetPositionRecordsForInsert;
import o.processDataSetCompletelyChanged;

public final class DropAnimation extends invalidateItemDecorations<AnimatorSet> {
    private int equals;
    private int getMax;
    private int isInside;
    private int setMax;
    private processDataSetCompletelyChanged toFloatRange = new processDataSetCompletelyChanged();
    private int toIntRange;

    enum AnimationType {
        Width,
        Height,
        Radius
    }

    public DropAnimation(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    public final DropAnimation setMax(long j) {
        super.length(j);
        return this;
    }

    public final DropAnimation length(int i, int i2, int i3, int i4, int i5) {
        int i6 = i5;
        if (getMax(i, i2, i3, i4, i5)) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.getMin = animatorSet;
            int i7 = i;
            this.getMax = i7;
            int i8 = i2;
            this.setMax = i8;
            this.equals = i3;
            this.toIntRange = i4;
            this.isInside = i6;
            double d = (double) i6;
            Double.isNaN(d);
            int i9 = (int) (d / 1.5d);
            long j = this.setMin / 2;
            ValueAnimator min = setMin(i7, i8, this.setMin, AnimationType.Width);
            long j2 = j;
            ValueAnimator min2 = setMin(i3, i4, j2, AnimationType.Height);
            ValueAnimator min3 = setMin(i5, i9, j2, AnimationType.Radius);
            ValueAnimator min4 = setMin(i4, i3, j2, AnimationType.Height);
            ((AnimatorSet) this.getMin).play(min2).with(min3).with(min).before(min4).before(setMin(i9, i5, j2, AnimationType.Radius));
        }
        return this;
    }

    private ValueAnimator setMin(int i, int i2, long j, final AnimationType animationType) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DropAnimation.setMax(DropAnimation.this, valueAnimator, animationType);
            }
        });
        return ofInt;
    }

    /* renamed from: com.rd.animation.type.DropAnimation$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.rd.animation.type.DropAnimation$AnimationType[] r0 = com.rd.animation.type.DropAnimation.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.rd.animation.type.DropAnimation.AnimationType.Width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.rd.animation.type.DropAnimation.AnimationType.Height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.rd.animation.type.DropAnimation.AnimationType.Radius     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rd.animation.type.DropAnimation.AnonymousClass1.<clinit>():void");
        }
    }

    private boolean getMax(int i, int i2, int i3, int i4, int i5) {
        if (this.getMax == i && this.setMax == i2 && this.equals == i3 && this.toIntRange == i4 && this.isInside == i5) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ invalidateItemDecorations length(long j) {
        super.length(j);
        return this;
    }

    public final /* synthetic */ invalidateItemDecorations getMax(float f) {
        if (this.getMin != null) {
            long j = (long) (f * ((float) this.setMin));
            boolean z = false;
            Iterator<Animator> it = ((AnimatorSet) this.getMin).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j2 = z ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (!z && duration >= this.setMin) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    @NonNull
    public final /* synthetic */ Animator getMax() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    static /* synthetic */ void setMax(DropAnimation dropAnimation, ValueAnimator valueAnimator, AnimationType animationType) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = AnonymousClass1.getMin[animationType.ordinal()];
        if (i == 1) {
            dropAnimation.toFloatRange.length = intValue;
        } else if (i == 2) {
            dropAnimation.toFloatRange.getMin = intValue;
        } else if (i == 3) {
            dropAnimation.toFloatRange.getMax = intValue;
        }
        if (dropAnimation.length != null) {
            dropAnimation.length.setMin(dropAnimation.toFloatRange);
        }
    }
}
