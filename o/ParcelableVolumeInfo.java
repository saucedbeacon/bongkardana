package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import o.postToHandler;

final class ParcelableVolumeInfo extends Drawable {
    private static final double equals = Math.cos(Math.toRadians(45.0d));
    static setMax setMin;
    private Paint FastBitmap$CoordinateSystem;
    private Paint IsOverlapping;
    private final int Mean$Arithmetic;
    float getMax;
    float getMin;
    private float hashCode;
    private final int invoke;
    boolean isInside = true;
    float length;
    final int setMax;
    private final RectF toDoubleRange;
    boolean toFloatRange = true;
    ColorStateList toIntRange;
    private Paint toString;
    private boolean valueOf = false;
    private Path values;

    interface setMax {
        void setMax(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public final int getOpacity() {
        return -3;
    }

    ParcelableVolumeInfo(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.Mean$Arithmetic = resources.getColor(postToHandler.length.setMax);
        this.invoke = resources.getColor(postToHandler.length.length);
        this.setMax = resources.getDimensionPixelSize(postToHandler.getMax.setMin);
        this.IsOverlapping = new Paint(5);
        getMax(colorStateList);
        Paint paint = new Paint(5);
        this.FastBitmap$CoordinateSystem = paint;
        paint.setStyle(Paint.Style.FILL);
        this.getMin = (float) ((int) (f + 0.5f));
        this.toDoubleRange = new RectF();
        Paint paint2 = new Paint(this.FastBitmap$CoordinateSystem);
        this.toString = paint2;
        paint2.setAntiAlias(false);
        getMin(f2, f3);
    }

    /* access modifiers changed from: package-private */
    public final void getMax(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.toIntRange = colorStateList;
        this.IsOverlapping.setColor(colorStateList.getColorForState(getState(), this.toIntRange.getDefaultColor()));
    }

    public final void setAlpha(int i) {
        this.IsOverlapping.setAlpha(i);
        this.FastBitmap$CoordinateSystem.setAlpha(i);
        this.toString.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.isInside = true;
    }

    public final boolean getPadding(Rect rect) {
        float f;
        float f2 = this.getMax;
        float f3 = this.getMin;
        if (this.toFloatRange) {
            double d = (double) (f2 * 1.5f);
            double d2 = (double) f3;
            Double.isNaN(d2);
            Double.isNaN(d);
            f = (float) (d + ((1.0d - equals) * d2));
        } else {
            f = f2 * 1.5f;
        }
        int ceil = (int) Math.ceil((double) f);
        float f4 = this.getMax;
        float f5 = this.getMin;
        if (this.toFloatRange) {
            double d3 = (double) f4;
            double d4 = (double) f5;
            Double.isNaN(d4);
            Double.isNaN(d3);
            f4 = (float) (d3 + ((1.0d - equals) * d4));
        }
        int ceil2 = (int) Math.ceil((double) f4);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    static float getMax(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - equals) * d2));
    }

    static float getMin(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - equals) * d2));
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.toIntRange;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.IsOverlapping.getColor() == colorForState) {
            return false;
        }
        this.IsOverlapping.setColor(colorForState);
        this.isInside = true;
        invalidateSelf();
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.toIntRange;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.IsOverlapping.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        if (this.isInside) {
            Rect bounds = getBounds();
            float f = this.getMax * 1.5f;
            this.toDoubleRange.set(((float) bounds.left) + this.getMax, ((float) bounds.top) + f, ((float) bounds.right) - this.getMax, ((float) bounds.bottom) - f);
            float f2 = this.getMin;
            RectF rectF = new RectF(-f2, -f2, f2, f2);
            RectF rectF2 = new RectF(rectF);
            float f3 = this.hashCode;
            rectF2.inset(-f3, -f3);
            Path path = this.values;
            if (path == null) {
                this.values = new Path();
            } else {
                path.reset();
            }
            this.values.setFillType(Path.FillType.EVEN_ODD);
            this.values.moveTo(-this.getMin, 0.0f);
            this.values.rLineTo(-this.hashCode, 0.0f);
            this.values.arcTo(rectF2, 180.0f, 90.0f, false);
            this.values.arcTo(rectF, 270.0f, -90.0f, false);
            this.values.close();
            float f4 = this.getMin;
            float f5 = f4 / (this.hashCode + f4);
            Paint paint = this.FastBitmap$CoordinateSystem;
            float f6 = this.getMin + this.hashCode;
            int i2 = this.Mean$Arithmetic;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.invoke}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.toString;
            float f7 = this.getMin;
            float f8 = this.hashCode;
            int i3 = this.Mean$Arithmetic;
            paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.invoke}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.toString.setAntiAlias(false);
            this.isInside = false;
        }
        canvas2.translate(0.0f, this.length / 2.0f);
        float f9 = this.getMin;
        float f10 = (-f9) - this.hashCode;
        float f11 = f9 + ((float) this.setMax) + (this.length / 2.0f);
        float f12 = f11 * 2.0f;
        boolean z = this.toDoubleRange.width() - f12 > 0.0f;
        boolean z2 = this.toDoubleRange.height() - f12 > 0.0f;
        int save = canvas.save();
        canvas2.translate(this.toDoubleRange.left + f11, this.toDoubleRange.top + f11);
        canvas2.drawPath(this.values, this.FastBitmap$CoordinateSystem);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f10, this.toDoubleRange.width() - f12, -this.getMin, this.toString);
        } else {
            i = save;
        }
        canvas2.restoreToCount(i);
        int save2 = canvas.save();
        canvas2.translate(this.toDoubleRange.right - f11, this.toDoubleRange.bottom - f11);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.values, this.FastBitmap$CoordinateSystem);
        if (z) {
            canvas.drawRect(0.0f, f10, this.toDoubleRange.width() - f12, (-this.getMin) + this.hashCode, this.toString);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        canvas2.translate(this.toDoubleRange.left + f11, this.toDoubleRange.bottom - f11);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.values, this.FastBitmap$CoordinateSystem);
        if (z2) {
            canvas.drawRect(0.0f, f10, this.toDoubleRange.height() - f12, -this.getMin, this.toString);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.toDoubleRange.right - f11, this.toDoubleRange.top + f11);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.values, this.FastBitmap$CoordinateSystem);
        if (z2) {
            canvas.drawRect(0.0f, f10, this.toDoubleRange.height() - f12, -this.getMin, this.toString);
        }
        canvas2.restoreToCount(save4);
        canvas2.translate(0.0f, (-this.length) / 2.0f);
        setMin.setMax(canvas2, this.toDoubleRange, this.getMin, this.IsOverlapping);
    }

    /* access modifiers changed from: package-private */
    public final void getMin(float f, float f2) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            int i = (int) (f + 0.5f);
            if (i % 2 == 1) {
                i--;
            }
            float f3 = (float) i;
            int i2 = (int) (f2 + 0.5f);
            if (i2 % 2 == 1) {
                i2--;
            }
            float f4 = (float) i2;
            if (f3 > f4) {
                if (!this.valueOf) {
                    this.valueOf = true;
                }
                f3 = f4;
            }
            if (this.length != f3 || this.getMax != f4) {
                this.length = f3;
                this.getMax = f4;
                this.hashCode = (float) ((int) ((f3 * 1.5f) + ((float) this.setMax) + 0.5f));
                this.isInside = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
