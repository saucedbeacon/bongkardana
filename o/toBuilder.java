package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import o.MasExceptionLogPB;

public final class toBuilder extends MetricAffectingSpan implements LeadingMarginSpan {
    private final Paint getMin = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMax();
    private final Rect length = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMin();
    private final maybeForceBuilderInitialization setMax;
    private final boolean setMin;

    public toBuilder(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, boolean z) {
        this.setMax = maybeforcebuilderinitialization;
        this.setMin = z;
    }

    public final int getLeadingMargin(boolean z) {
        if (this.setMin) {
            return this.setMax.setMax();
        }
        return 0;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (this.setMin) {
            this.getMin.setStyle(Paint.Style.FILL);
            this.getMin.setColor(this.setMax.setMax(paint, true));
            if (i2 > 0) {
                i8 = canvas.getWidth();
            } else {
                int i9 = i;
                i -= canvas.getWidth();
                i8 = i9;
            }
            this.length.set(i, i3, i8, i5);
            canvas.drawRect(this.length, this.getMin);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        this.setMax.length(textPaint, this.setMin);
    }

    public final void updateDrawState(TextPaint textPaint) {
        this.setMax.length(textPaint, this.setMin);
        if (!this.setMin) {
            textPaint.bgColor = this.setMax.setMax((Paint) textPaint, false);
        }
    }
}
