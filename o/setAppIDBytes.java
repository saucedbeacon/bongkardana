package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class setAppIDBytes extends Drawable {
    private static final getMax getMax = new getMax(0.15277778f, 0.45833334f);
    private static final getMax length = new getMax(0.3888889f, 0.6944444f);
    private static final getMax setMin = new getMax(0.8472222f, 0.2638889f);
    private final Paint IsOverlapping = new Paint(1);
    private final RectF equals = new RectF();
    private final int getMin;
    private boolean isInside;
    private final int setMax;
    private final Path toFloatRange = new Path();
    private final Paint toIntRange = new Paint(1);

    public final int getOpacity() {
        return -1;
    }

    public final boolean isStateful() {
        return true;
    }

    public setAppIDBytes(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        this.setMax = i;
        this.getMin = i2;
        this.toIntRange.setColor(i3);
        this.toIntRange.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float min = (float) Math.min(rect.width(), rect.height());
        float f = min / 8.0f;
        float f2 = min - f;
        this.equals.set(0.0f, 0.0f, f2, f2);
        this.IsOverlapping.setStrokeWidth(f);
        this.toIntRange.setStrokeWidth(f);
        this.toFloatRange.reset();
        getMax getmax = getMax;
        this.toFloatRange.moveTo(getmax.setMin * f2, getmax.getMax * f2);
        getMax getmax2 = length;
        this.toFloatRange.lineTo(getmax2.setMin * f2, getmax2.getMax * f2);
        getMax getmax3 = setMin;
        this.toFloatRange.lineTo(getmax3.setMin * f2, f2 * getmax3.getMax);
    }

    public final void draw(@NonNull Canvas canvas) {
        int i;
        Paint.Style style;
        if (this.isInside) {
            style = Paint.Style.FILL_AND_STROKE;
            i = this.setMax;
        } else {
            style = Paint.Style.STROKE;
            i = this.getMin;
        }
        this.IsOverlapping.setStyle(style);
        this.IsOverlapping.setColor(i);
        Rect bounds = getBounds();
        float width = (((float) bounds.width()) - this.equals.width()) / 2.0f;
        float height = (((float) bounds.height()) - this.equals.height()) / 2.0f;
        float width2 = this.equals.width() / 8.0f;
        int save = canvas.save();
        try {
            canvas.translate(width, height);
            canvas.drawRoundRect(this.equals, width2, width2, this.IsOverlapping);
            if (this.isInside) {
                canvas.drawPath(this.toFloatRange, this.toIntRange);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.IsOverlapping.setAlpha(i);
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.IsOverlapping.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        boolean z2 = false;
        int length2 = iArr != null ? iArr.length : 0;
        if (length2 > 0) {
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                } else if (16842912 == iArr[i]) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        if (z != this.isInside) {
            z2 = true;
        }
        if (z2) {
            invalidateSelf();
            this.isInside = z;
        }
        return z2;
    }

    static class getMax {
        final float getMax;
        final float setMin;

        getMax(float f, float f2) {
            this.setMin = f;
            this.getMax = f2;
        }
    }
}
