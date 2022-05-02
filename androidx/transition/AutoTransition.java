package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        setMax();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMax();
    }

    private void setMax() {
        setMin(1);
        setMax(new Fade(2)).setMax(new ChangeBounds()).setMax(new Fade(1));
    }
}
