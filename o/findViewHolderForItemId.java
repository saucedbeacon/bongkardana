package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import java.util.Iterator;
import o.offsetPositionRecordsForInsert;

public class findViewHolderForItemId extends invalidateItemDecorations<AnimatorSet> {
    boolean IsOverlapping;
    int equals;
    int getMax;
    int isInside;
    int setMax;
    int toFloatRange;
    private getChildViewHolder toIntRange = new getChildViewHolder();

    public findViewHolderForItemId(@NonNull offsetPositionRecordsForInsert.setMax setmax) {
        super(setmax);
    }

    /* renamed from: getMin */
    public findViewHolderForItemId length(long j) {
        super.length(j);
        return this;
    }

    public findViewHolderForItemId getMin(int i, int i2, int i3, boolean z) {
        if (setMax(i, i2, i3, z)) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.getMin = animatorSet;
            this.setMax = i;
            this.getMax = i2;
            this.isInside = i3;
            this.IsOverlapping = z;
            int i4 = i - i3;
            this.equals = i4;
            this.toFloatRange = i + i3;
            this.toIntRange.getMin = i4;
            this.toIntRange.length = this.toFloatRange;
            setMax length = length(z);
            long j = this.setMin / 2;
            ((AnimatorSet) this.getMin).playSequentially(new Animator[]{setMax(length.setMax, length.length, j, false, this.toIntRange), setMax(length.getMax, length.setMin, j, true, this.toIntRange)});
        }
        return this;
    }

    /* renamed from: setMax */
    public findViewHolderForItemId getMax(float f) {
        if (this.getMin == null) {
            return this;
        }
        long j = (long) (f * ((float) this.setMin));
        Iterator<Animator> it = ((AnimatorSet) this.getMin).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ValueAnimator setMax(int i, int i2, long j, final boolean z, final getChildViewHolder getchildviewholder) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                findViewHolderForItemId.getMin(findViewHolderForItemId.this, getchildviewholder, valueAnimator, z);
            }
        });
        return ofInt;
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax(int i, int i2, int i3, boolean z) {
        if (this.setMax == i && this.getMax == i2 && this.isInside == i3 && this.IsOverlapping == z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final setMax length(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.setMax;
            int i6 = this.isInside;
            i4 = i5 + i6;
            int i7 = this.getMax;
            i2 = i7 + i6;
            i = i5 - i6;
            i3 = i7 - i6;
        } else {
            int i8 = this.setMax;
            int i9 = this.isInside;
            i4 = i8 - i9;
            int i10 = this.getMax;
            i2 = i10 - i9;
            i = i8 + i9;
            i3 = i10 + i9;
        }
        return new setMax(i4, i2, i, i3);
    }

    class setMax {
        final int getMax;
        final int length;
        final int setMax;
        final int setMin;

        setMax(int i, int i2, int i3, int i4) {
            this.setMax = i;
            this.length = i2;
            this.getMax = i3;
            this.setMin = i4;
        }
    }

    @NonNull
    public final /* synthetic */ Animator getMax() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void getMin(o.findViewHolderForItemId r1, o.getChildViewHolder r2, android.animation.ValueAnimator r3, boolean r4) {
        /*
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r0 = r1.IsOverlapping
            if (r0 == 0) goto L_0x0013
            if (r4 == 0) goto L_0x0018
            r2.getMin = r3
            goto L_0x001a
        L_0x0013:
            if (r4 != 0) goto L_0x0018
            r2.getMin = r3
            goto L_0x001a
        L_0x0018:
            r2.length = r3
        L_0x001a:
            o.offsetPositionRecordsForInsert$setMax r3 = r1.length
            if (r3 == 0) goto L_0x0023
            o.offsetPositionRecordsForInsert$setMax r1 = r1.length
            r1.setMin(r2)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findViewHolderForItemId.getMin(o.findViewHolderForItemId, o.getChildViewHolder, android.animation.ValueAnimator, boolean):void");
    }
}
