package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import androidx.annotation.ColorInt;
import java.util.Arrays;
import javax.annotation.Nullable;

public final class clearKeyboardFocusForVirtualView extends getVirtualViewAt {
    private static final RectF getMax = new RectF();
    private static final RectF setMax = new RectF();
    private boolean equals;
    private Path getMin;
    private Paint length;
    private final length setMin;

    public static class setMin {
        public length length = new length();
    }

    public final int getOpacity() {
        return -1;
    }

    public /* synthetic */ clearKeyboardFocusForVirtualView(length length2, byte b) {
        this(length2);
    }

    private clearKeyboardFocusForVirtualView(length length2) {
        this.setMin = length2;
    }

    private static void getMin(Canvas canvas, RectF rectF, Path path, float[] fArr, Paint paint) {
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        if (path == null) {
            float min2 = Math.min(min, fArr[0]);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            return;
        }
        if (path.isEmpty()) {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        canvas.drawPath(path, paint);
    }

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        boolean z = false;
        if (this.length == null || this.getMin == null) {
            this.length = new Paint();
            this.getMin = new Path();
            int i2 = 0;
            float f = 0.0f;
            boolean z2 = false;
            while (true) {
                if (i2 >= this.setMin.IsOverlapping.length) {
                    break;
                }
                float f2 = this.setMin.IsOverlapping[i2];
                if (f2 > 0.0f) {
                    z2 = true;
                }
                if (i2 == 0) {
                    f = f2;
                } else if (f != f2) {
                    this.equals = true;
                    break;
                }
                i2++;
            }
            if (this.equals && this.setMin.IsOverlapping.length != 8) {
                float[] fArr = new float[8];
                for (int i3 = 0; i3 < 4; i3++) {
                    int i4 = i3 * 2;
                    fArr[i4] = this.setMin.IsOverlapping[i3];
                    fArr[i4 + 1] = this.setMin.IsOverlapping[i3];
                }
                this.setMin.IsOverlapping = fArr;
            }
            this.length.setPathEffect(this.setMin.toFloatRange);
            this.length.setAntiAlias(this.setMin.toFloatRange != null || z2);
            this.length.setStyle(Paint.Style.STROKE);
        }
        boolean z3 = this.setMin.getMax == this.setMin.toIntRange && this.setMin.toIntRange == this.setMin.isInside && this.setMin.isInside == this.setMin.equals;
        if (this.setMin.setMin == this.setMin.length && this.setMin.length == this.setMin.getMin && this.setMin.getMin == this.setMin.setMax) {
            z = true;
        }
        if (z && this.setMin.setMin == 0.0f) {
            return;
        }
        if (z && z3) {
            float f3 = this.setMin.setMin;
            int i5 = this.setMin.getMax;
            float f4 = f3 / 2.0f;
            setMax.set(getBounds());
            setMax.inset(f4, f4);
            this.length.setStrokeWidth(f3);
            this.length.setColor(i5);
            getMin(canvas2, setMax, this.equals ? this.getMin : null, this.setMin.IsOverlapping, this.length);
        } else if (z) {
            float f5 = this.setMin.setMin / 2.0f;
            setMax.set(getBounds());
            int save = canvas.save();
            canvas2.translate(setMax.left, setMax.top);
            setMax.offsetTo(0.0f, 0.0f);
            this.length.setStrokeWidth(this.setMin.setMin);
            int round = Math.round(setMax.height());
            int round2 = Math.round(setMax.width());
            float f6 = (float) round;
            float f7 = f6 / 2.0f;
            int round3 = (int) Math.round(Math.sqrt((double) (2.0f * f7 * f7)));
            setMax.inset(f5, f5);
            if (this.setMin.getMax != 0) {
                int save2 = canvas.save();
                canvas2.rotate(45.0f, 0.0f, 0.0f);
                float f8 = (float) round3;
                canvas2.clipRect(0.0f, 0.0f, f8, f8);
                canvas2.rotate(-45.0f, 0.0f, 0.0f);
                this.length.setColor(this.setMin.getMax);
                getMin(canvas2, setMax, this.equals ? this.getMin : null, this.setMin.IsOverlapping, this.length);
                canvas2.restoreToCount(save2);
            }
            if (this.setMin.isInside != 0) {
                int save3 = canvas.save();
                float f9 = (float) round2;
                canvas2.rotate(-45.0f, f9, 0.0f);
                canvas2.clipRect((float) (round2 - round3), 0.0f, f9, (float) round3);
                canvas2.rotate(45.0f, f9, 0.0f);
                this.length.setColor(this.setMin.isInside);
                getMin(canvas2, setMax, this.equals ? this.getMin : null, this.setMin.IsOverlapping, this.length);
                canvas2.restoreToCount(save3);
            }
            if (this.setMin.toIntRange != 0) {
                int save4 = canvas.save();
                canvas2.rotate(-45.0f, 0.0f, 0.0f);
                float f10 = (float) round3;
                canvas2.clipRect(0.0f, 0.0f, f10, f10);
                canvas2.rotate(45.0f, 0.0f, 0.0f);
                float f11 = (float) round2;
                canvas2.rotate(45.0f, f11, 0.0f);
                float f12 = (float) (round2 - round3);
                float f13 = f11;
                float f14 = f10;
                int i6 = save4;
                float f15 = f14;
                canvas.clipRect(f12, 0.0f, f13, f15, Region.Op.UNION);
                canvas2.rotate(-45.0f, f13, 0.0f);
                canvas.clipRect(f14, 0.0f, f12, f15, Region.Op.UNION);
                this.length.setColor(this.setMin.toIntRange);
                getMin(canvas2, setMax, this.equals ? this.getMin : null, this.setMin.IsOverlapping, this.length);
                canvas2.restoreToCount(i6);
            }
            if (this.setMin.equals != 0) {
                int save5 = canvas.save();
                canvas2.rotate(45.0f, 0.0f, f6);
                float f16 = (float) (round - round3);
                float f17 = (float) round3;
                canvas2.clipRect(0.0f, f16, f17, f6);
                canvas2.rotate(-45.0f, 0.0f, f6);
                float f18 = (float) round2;
                canvas2.rotate(-45.0f, f18, f6);
                float f19 = (float) (round2 - round3);
                Canvas canvas3 = canvas;
                float f20 = f16;
                float f21 = f17;
                float f22 = f6;
                int i7 = save;
                canvas3.clipRect(f19, f20, f18, f22, Region.Op.UNION);
                canvas2.rotate(45.0f, f18, f6);
                canvas3.clipRect(f21, f20, f19, f22, Region.Op.UNION);
                this.length.setColor(this.setMin.equals);
                getMin(canvas2, setMax, this.equals ? this.getMin : null, this.setMin.IsOverlapping, this.length);
                canvas2.restoreToCount(save5);
                i = i7;
            } else {
                i = save;
            }
            canvas2.restoreToCount(i);
        } else {
            Rect bounds = getBounds();
            if (this.setMin.setMin > 0.0f && this.setMin.getMax != 0) {
                getMin(canvas, this.setMin.getMax, this.setMin.setMin, (float) bounds.left, (float) bounds.top, Math.min(((float) bounds.left) + this.setMin.setMin, (float) bounds.right), (float) bounds.bottom, true);
            }
            if (this.setMin.getMin > 0.0f && this.setMin.isInside != 0) {
                getMin(canvas, this.setMin.isInside, this.setMin.getMin, Math.max(((float) bounds.right) - this.setMin.getMin, (float) bounds.left), (float) bounds.top, (float) bounds.right, (float) bounds.bottom, true);
            }
            if (this.setMin.length > 0.0f && this.setMin.toIntRange != 0) {
                getMin(canvas, this.setMin.toIntRange, this.setMin.length, (float) bounds.left, (float) bounds.top, (float) bounds.right, Math.min(((float) bounds.top) + this.setMin.length, (float) bounds.bottom), false);
            }
            if (this.setMin.setMax > 0.0f && this.setMin.equals != 0) {
                getMin(canvas, this.setMin.equals, this.setMin.setMax, (float) bounds.left, Math.max(((float) bounds.bottom) - this.setMin.setMax, (float) bounds.top), (float) bounds.right, (float) bounds.bottom, false);
            }
        }
    }

    private void getMin(Canvas canvas, @ColorInt int i, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.length.setStrokeWidth(f);
        this.length.setColor(i);
        getMax.set(f2, f3, f4, f5);
        setMax.set(getBounds());
        if (z) {
            setMax.inset(getMax.centerX() - getMax.left, 0.0f);
        } else {
            setMax.inset(0.0f, getMax.centerY() - getMax.top);
        }
        int save = canvas.save();
        canvas.clipRect(getMax);
        getMin(canvas, setMax, this.equals ? this.getMin : null, this.setMin.IsOverlapping, this.length);
        canvas.restoreToCount(save);
    }

    public final void setAlpha(int i) {
        Paint paint = this.length;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.length;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    public final boolean getMin(getVirtualViewAt getvirtualviewat) {
        return equals(getvirtualviewat);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearKeyboardFocusForVirtualView)) {
            return false;
        }
        return processorFinished.length(this.setMin, ((clearKeyboardFocusForVirtualView) obj).setMin);
    }

    public final int hashCode() {
        return this.setMin.hashCode();
    }

    public static class length {
        public float[] IsOverlapping;
        @ColorInt
        public int equals;
        @ColorInt
        public int getMax;
        public float getMin;
        @ColorInt
        public int isInside;
        public float length;
        public float setMax;
        public float setMin;
        @Nullable
        public PathEffect toFloatRange;
        @ColorInt
        public int toIntRange;

        length() {
        }

        public final int hashCode() {
            int i = 0;
            int i2 = (((((((((((((((((int) this.setMin) + 0) * 31) + ((int) this.length)) * 31) + ((int) this.getMin)) * 31) + ((int) this.setMax)) * 31) + this.getMax) * 31) + this.toIntRange) * 31) + this.isInside) * 31) + this.equals) * 31;
            PathEffect pathEffect = this.toFloatRange;
            if (pathEffect != null) {
                i = pathEffect.hashCode();
            }
            return ((i2 + i) * 31) + Arrays.hashCode(this.IsOverlapping);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                length length2 = (length) obj;
                return length2.setMin == this.setMin && length2.length == this.length && length2.getMin == this.getMin && length2.setMax == this.setMax && this.getMax == length2.getMax && this.toIntRange == length2.toIntRange && this.isInside == length2.isInside && this.equals == length2.equals && processorFinished.length(this.toFloatRange, length2.toFloatRange) && Arrays.equals(this.IsOverlapping, length2.IsOverlapping);
            }
        }
    }
}
