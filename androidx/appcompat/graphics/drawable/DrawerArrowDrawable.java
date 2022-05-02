package androidx.appcompat.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.RequiresPermission;

public final class DrawerArrowDrawable extends Drawable {
    private static final float length = ((float) Math.toRadians(45.0d));
    private int FastBitmap$CoordinateSystem;
    private float IsOverlapping;
    private final Path equals;
    public float getMax;
    private float getMin;
    private float hashCode;
    private float isInside;
    private final Paint setMax;
    public boolean setMin;
    private final int toDoubleRange;
    private boolean toFloatRange;
    private float toIntRange;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.FastBitmap$CoordinateSystem;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? RequiresPermission.Read.isInside(this) == 0 : RequiresPermission.Read.isInside(this) == 1))) {
            z = true;
        }
        float f = this.getMin;
        float sqrt = (float) Math.sqrt((double) (f * f * 2.0f));
        float f2 = this.IsOverlapping;
        float f3 = this.getMax;
        float f4 = ((sqrt - f2) * f3) + f2;
        float f5 = f2 + ((this.isInside - f2) * f3);
        float round = (float) Math.round(((this.hashCode - 0.0f) * f3) + 0.0f);
        float f6 = ((length - 0.0f) * this.getMax) + 0.0f;
        float f7 = z ? 0.0f : -180.0f;
        double d = (double) f4;
        float f8 = f7 + (((z ? 180.0f : 0.0f) - f7) * this.getMax);
        double d2 = (double) f6;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        boolean z2 = z;
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.equals.rewind();
        float strokeWidth = this.toIntRange + this.setMax.getStrokeWidth();
        float f9 = strokeWidth + (((-this.hashCode) - strokeWidth) * this.getMax);
        float f10 = (-f5) / 2.0f;
        this.equals.moveTo(f10 + round, 0.0f);
        this.equals.rLineTo(f5 - (round * 2.0f), 0.0f);
        this.equals.moveTo(f10, f9);
        this.equals.rLineTo(round2, round3);
        this.equals.moveTo(f10, -f9);
        this.equals.rLineTo(round2, -round3);
        this.equals.close();
        canvas.save();
        float strokeWidth2 = this.setMax.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth2);
        float f11 = this.toIntRange;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f11))) / 4) * 2)) + (strokeWidth2 * 1.5f) + f11);
        if (this.toFloatRange) {
            canvas2.rotate(f8 * ((float) (this.setMin ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.equals, this.setMax);
        canvas.restore();
    }

    public final void setAlpha(int i) {
        if (i != this.setMax.getAlpha()) {
            this.setMax.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.setMax.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.toDoubleRange;
    }

    public final int getIntrinsicWidth() {
        return this.toDoubleRange;
    }
}
