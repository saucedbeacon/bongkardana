package o;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

public final class clearAppID extends MetricAffectingSpan {
    private final maybeForceBuilderInitialization length;

    public clearAppID(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization) {
        this.length = maybeforcebuilderinitialization;
    }

    public final void updateDrawState(TextPaint textPaint) {
        this.length.setMin(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        this.length.setMin(textPaint);
    }
}
