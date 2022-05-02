package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import o.MasExceptionLogPB;

public final class getSerializedSize implements LeadingMarginSpan {
    private final maybeForceBuilderInitialization getMax;
    private final Paint getMin = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMax();
    private final Rect length = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMin();

    public getSerializedSize(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization) {
        this.getMax = maybeforcebuilderinitialization;
    }

    public final int getLeadingMargin(boolean z) {
        return this.getMax.length();
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int max = this.getMax.getMax();
        this.getMin.set(paint);
        this.getMax.setMax(this.getMin);
        int i8 = i2 * max;
        int i9 = i + i8;
        int i10 = i8 + i9;
        this.length.set(Math.min(i9, i10), i3, Math.max(i9, i10), i5);
        canvas.drawRect(this.length, this.getMin);
    }
}
