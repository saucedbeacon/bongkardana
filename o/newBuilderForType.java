package o;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class newBuilderForType extends MetricAffectingSpan {
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }
}
