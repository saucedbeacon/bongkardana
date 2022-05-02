package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import o.MasExceptionLogPB;

public final class getDescriptorForType extends MetricAffectingSpan implements LeadingMarginSpan {
    private final int getMax;
    private final maybeForceBuilderInitialization getMin;
    private final Paint length = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMax();
    private final Rect setMin = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMin();

    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public getDescriptorForType(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @IntRange(from = 1, to = 6) int i) {
        this.getMin = maybeforcebuilderinitialization;
        this.getMax = i;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.getMax;
        if ((i9 == 1 || i9 == 2) && parsePartialFrom.getMin(i7, charSequence, this)) {
            this.length.set(paint);
            this.getMin.setMin(this.length);
            float strokeWidth = this.length.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((((float) i5) - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                this.setMin.set(i, i10, i8, i5);
                canvas.drawRect(this.setMin, this.length);
            }
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        this.getMin.getMin(textPaint, this.getMax);
    }

    public final void updateDrawState(TextPaint textPaint) {
        this.getMin.getMin(textPaint, this.getMax);
    }
}
