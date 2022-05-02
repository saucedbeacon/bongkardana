package o;

import android.animation.ValueAnimator;
import id.dana.richview.PinEntryEditText;

public final class onInfo implements ValueAnimator.AnimatorUpdateListener {
    private final PinEntryEditText getMin;

    public onInfo(PinEntryEditText pinEntryEditText) {
        this.getMin = pinEntryEditText;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PinEntryEditText.getMax(this.getMin, valueAnimator);
    }
}
