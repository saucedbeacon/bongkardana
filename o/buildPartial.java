package o;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class buildPartial extends MetricAffectingSpan {
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}
