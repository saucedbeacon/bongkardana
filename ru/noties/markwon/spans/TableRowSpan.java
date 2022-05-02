package ru.noties.markwon.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.MasExceptionLogPB;
import o.maybeForceBuilderInitialization;

public final class TableRowSpan extends ReplacementSpan {
    private final boolean IsOverlapping;
    private int equals;
    private final List<StaticLayout> getMax;
    private final List<getMin> getMin;
    private final Paint isInside = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMax();
    private final maybeForceBuilderInitialization length;
    private final TextPaint setMax;
    private final boolean setMin;
    private final Rect toFloatRange = MasExceptionLogPB.MasExceptionLog.AnonymousClass1.setMin();
    private int toIntRange;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Alignment {
    }

    public static class getMin {
        final int getMin;
        final CharSequence setMin;

        public getMin(int i, CharSequence charSequence) {
            this.getMin = i;
            this.setMin = charSequence;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Cell{alignment=");
            sb.append(this.getMin);
            sb.append(", text=");
            sb.append(this.setMin);
            sb.append('}');
            return sb.toString();
        }
    }

    public TableRowSpan(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @NonNull List<getMin> list, boolean z, boolean z2) {
        this.length = maybeforcebuilderinitialization;
        this.getMin = list;
        this.getMax = new ArrayList(list.size());
        this.setMax = new TextPaint();
        this.setMin = z;
        this.IsOverlapping = z2;
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        if (this.getMax.size() > 0 && fontMetricsInt != null) {
            int i3 = 0;
            for (StaticLayout height : this.getMax) {
                int height2 = height.getHeight();
                if (height2 > i3) {
                    i3 = height2;
                }
            }
            this.equals = i3;
            fontMetricsInt.ascent = -(i3 + (this.length.getMin() * 2));
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.toIntRange;
    }

    /* JADX INFO: finally extract failed */
    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Layout.Alignment alignment;
        Canvas canvas2 = canvas;
        float f2 = f;
        Paint paint2 = paint;
        int i6 = 1;
        int i7 = 0;
        if (setMax(canvas.getWidth())) {
            this.toIntRange = canvas.getWidth();
            this.setMax.set(paint2);
            this.setMax.setFakeBoldText(this.setMin);
            int size = (this.toIntRange / this.getMin.size()) - (this.length.getMin() * 2);
            this.getMax.clear();
            int size2 = this.getMin.size();
            int i8 = 0;
            while (i8 < size2) {
                getMin getmin = this.getMin.get(i8);
                CharSequence charSequence2 = getmin.setMin;
                TextPaint textPaint = this.setMax;
                int i9 = getmin.getMin;
                if (i9 == i6) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (i9 != 2) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout staticLayout = r10;
                StaticLayout staticLayout2 = new StaticLayout(charSequence2, textPaint, size, alignment, 1.0f, 0.0f, false);
                this.getMax.add(staticLayout);
                i8++;
                i6 = 1;
            }
        }
        int min = this.length.getMin();
        int size3 = this.getMax.size();
        int i10 = this.toIntRange / size3;
        int i11 = i5 - i3;
        int i12 = (i11 - this.equals) / 4;
        if (this.setMin) {
            this.length.isInside(this.isInside);
        } else if (this.IsOverlapping) {
            this.length.equals(this.isInside);
        } else {
            this.length.toFloatRange(this.isInside);
        }
        if (this.isInside.getColor() != 0) {
            int save = canvas.save();
            try {
                this.toFloatRange.set(0, 0, this.toIntRange, i11);
                canvas2.translate(f2, (float) (i3 - i12));
                canvas2.drawRect(this.toFloatRange, this.isInside);
            } finally {
                canvas2.restoreToCount(save);
            }
        }
        this.isInside.set(paint2);
        this.length.IsOverlapping(this.isInside);
        boolean z = this.length.toIntRange(paint2) > 0;
        if (z) {
            this.toFloatRange.set(0, 0, i10, i11);
        }
        int i13 = 0;
        while (i7 < size3) {
            StaticLayout staticLayout3 = this.getMax.get(i7);
            int save2 = canvas.save();
            try {
                canvas2.translate(((float) (i7 * i10)) + f2, (float) (i3 - i12));
                if (z) {
                    canvas2.drawRect(this.toFloatRange, this.isInside);
                }
                canvas2.translate((float) min, (float) (min + i12));
                staticLayout3.draw(canvas2);
                if (staticLayout3.getHeight() > i13) {
                    i13 = staticLayout3.getHeight();
                }
                canvas2.restoreToCount(save2);
                i7++;
            } catch (Throwable th) {
                canvas2.restoreToCount(save2);
                throw th;
            }
        }
    }

    private boolean setMax(int i) {
        return this.toIntRange != i;
    }
}
