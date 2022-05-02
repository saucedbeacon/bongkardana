package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import o.MasExceptionLogPB;

public final class isInitialized implements LeadingMarginSpan {
    private final int getMax;
    private maybeForceBuilderInitialization getMin;
    private final RectF length = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.getMin();
    private final Rect setMax = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMin();
    private final Paint setMin = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMax();

    public isInitialized(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @IntRange(from = 0) int i) {
        this.getMin = maybeforcebuilderinitialization;
        this.getMax = i;
    }

    public final int getLeadingMargin(boolean z) {
        return this.getMin.length();
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && parsePartialFrom.setMax(i6, charSequence, this)) {
            this.setMin.set(paint);
            this.getMin.getMax(this.setMin);
            int save = canvas.save();
            try {
                int length2 = this.getMin.length();
                int max = this.getMin.getMax((int) ((this.setMin.descent() - this.setMin.ascent()) + 0.5f));
                int i8 = i + (((length2 - max) / 2) * i2);
                int i9 = (i2 * max) + i8;
                int min = Math.min(i8, i9);
                int max2 = Math.max(i8, i9);
                int descent = (i4 + ((int) (((this.setMin.descent() + this.setMin.ascent()) / 2.0f) + 0.5f))) - (max / 2);
                int i10 = max + descent;
                if (this.getMax != 0) {
                    if (this.getMax != 1) {
                        this.setMax.set(min, descent, max2, i10);
                        this.setMin.setStyle(Paint.Style.FILL);
                        canvas.drawRect(this.setMax, this.setMin);
                    }
                }
                this.length.set((float) min, (float) descent, (float) max2, (float) i10);
                this.setMin.setStyle(this.getMax == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                canvas.drawOval(this.length, this.setMin);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }
}
