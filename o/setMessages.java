package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import o.MasExceptionLogPB;

public final class setMessages implements LeadingMarginSpan {
    private final Paint getMax = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMax();
    private final maybeForceBuilderInitialization getMin;
    private final Rect length = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMin();

    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public setMessages(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization) {
        this.getMin = maybeforcebuilderinitialization;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = i3 + ((i5 - i3) / 2);
        this.getMax.set(paint);
        this.getMin.length(this.getMax);
        int strokeWidth = (int) ((((float) ((int) (this.getMax.getStrokeWidth() + 0.5f))) / 2.0f) + 0.5f);
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i8 = i;
            i -= canvas.getWidth();
        }
        this.length.set(i, i9 - strokeWidth, i8, i9 + strokeWidth);
        canvas.drawRect(this.length, this.getMax);
    }
}
