package o;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

public final class mergeFrom extends MetricAffectingSpan {
    private final maybeForceBuilderInitialization setMax;

    public mergeFrom(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization) {
        this.setMax = maybeforcebuilderinitialization;
    }

    public final void updateDrawState(TextPaint textPaint) {
        this.setMax.length(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        this.setMax.length(textPaint);
    }
}
