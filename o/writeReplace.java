package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class writeReplace extends ReplacementSpan {
    private final initFields getMin;
    private final boolean length;
    private final int setMax = 0;
    private final maybeForceBuilderInitialization setMin;

    public writeReplace(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @NonNull initFields initfields, boolean z) {
        this.setMin = maybeforcebuilderinitialization;
        this.getMin = initfields;
        this.length = z;
        if (initfields.getBounds().isEmpty()) {
            initfields.setBounds(0, 0, initfields.getIntrinsicWidth(), initfields.getIntrinsicHeight());
        }
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        if (this.getMin.getMax()) {
            Rect bounds = this.getMin.getBounds();
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = -bounds.bottom;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = fontMetricsInt.ascent;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.length) {
            this.setMin.getMin(paint);
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Canvas canvas2 = canvas;
        initFields initfields = this.getMin;
        int width = canvas.getWidth();
        float textSize = paint.getTextSize();
        initfields.setMin = width;
        initfields.getMin = textSize;
        initFields initfields2 = this.getMin;
        if (initfields2.getMax()) {
            int i6 = i5 - initfields2.getBounds().bottom;
            int save = canvas.save();
            try {
                if (2 == this.setMax) {
                    i6 -= ((i5 - i3) - initfields2.getBounds().height()) / 2;
                } else if (1 == this.setMax) {
                    i6 -= paint.getFontMetricsInt().descent;
                }
                float f2 = f;
                canvas.translate(f, (float) i6);
                initfields2.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            float f3 = f;
            float descent = (float) ((int) (((float) (((i5 - i3) / 2) + i3)) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f)));
            if (this.length) {
                this.setMin.getMin(paint);
            } else {
                Paint paint2 = paint;
            }
            canvas.drawText(charSequence, i, i2, f, descent, paint);
        }
    }
}
