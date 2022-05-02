package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

public class setTitleMarginTop<T> {
    public PointF FastBitmap$CoordinateSystem;
    private float Grayscale$Algorithm;
    @Nullable
    public final Interpolator IsOverlapping;
    public final float equals;
    @Nullable
    public final Interpolator getMax;
    @Nullable
    public T getMin;
    private float hashCode;
    public float isInside;
    @Nullable
    public final Interpolator length;
    @Nullable
    public final T setMax;
    @Nullable
    private final setVerticalGravity setMin;
    public PointF toDoubleRange;
    public float toFloatRange;
    @Nullable
    public Float toIntRange;
    public int toString;
    public int values;

    public setTitleMarginTop(setVerticalGravity setverticalgravity, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.isInside = -3987645.8f;
        this.toFloatRange = -3987645.8f;
        this.toString = 784923401;
        this.values = 784923401;
        this.hashCode = Float.MIN_VALUE;
        this.Grayscale$Algorithm = Float.MIN_VALUE;
        this.FastBitmap$CoordinateSystem = null;
        this.toDoubleRange = null;
        this.setMin = setverticalgravity;
        this.setMax = t;
        this.getMin = t2;
        this.getMax = interpolator;
        this.length = null;
        this.IsOverlapping = null;
        this.equals = f;
        this.toIntRange = f2;
    }

    public setTitleMarginTop(setVerticalGravity setverticalgravity, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f) {
        this.isInside = -3987645.8f;
        this.toFloatRange = -3987645.8f;
        this.toString = 784923401;
        this.values = 784923401;
        this.hashCode = Float.MIN_VALUE;
        this.Grayscale$Algorithm = Float.MIN_VALUE;
        this.FastBitmap$CoordinateSystem = null;
        this.toDoubleRange = null;
        this.setMin = setverticalgravity;
        this.setMax = t;
        this.getMin = t2;
        this.getMax = null;
        this.length = interpolator;
        this.IsOverlapping = interpolator2;
        this.equals = f;
        this.toIntRange = null;
    }

    public setTitleMarginTop(setVerticalGravity setverticalgravity, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.isInside = -3987645.8f;
        this.toFloatRange = -3987645.8f;
        this.toString = 784923401;
        this.values = 784923401;
        this.hashCode = Float.MIN_VALUE;
        this.Grayscale$Algorithm = Float.MIN_VALUE;
        this.FastBitmap$CoordinateSystem = null;
        this.toDoubleRange = null;
        this.setMin = setverticalgravity;
        this.setMax = t;
        this.getMin = t2;
        this.getMax = interpolator;
        this.length = interpolator2;
        this.IsOverlapping = interpolator3;
        this.equals = f;
        this.toIntRange = f2;
    }

    public setTitleMarginTop(T t) {
        this.isInside = -3987645.8f;
        this.toFloatRange = -3987645.8f;
        this.toString = 784923401;
        this.values = 784923401;
        this.hashCode = Float.MIN_VALUE;
        this.Grayscale$Algorithm = Float.MIN_VALUE;
        this.FastBitmap$CoordinateSystem = null;
        this.toDoubleRange = null;
        this.setMin = null;
        this.setMax = t;
        this.getMin = t;
        this.getMax = null;
        this.length = null;
        this.IsOverlapping = null;
        this.equals = Float.MIN_VALUE;
        this.toIntRange = Float.valueOf(Float.MAX_VALUE);
    }

    public final float getMin() {
        setVerticalGravity setverticalgravity = this.setMin;
        if (setverticalgravity == null) {
            return 0.0f;
        }
        if (this.hashCode == Float.MIN_VALUE) {
            float f = this.equals - setverticalgravity.values;
            setVerticalGravity setverticalgravity2 = this.setMin;
            this.hashCode = f / (setverticalgravity2.toDoubleRange - setverticalgravity2.values);
        }
        return this.hashCode;
    }

    public final float setMin() {
        if (this.setMin == null) {
            return 1.0f;
        }
        if (this.Grayscale$Algorithm == Float.MIN_VALUE) {
            if (this.toIntRange == null) {
                this.Grayscale$Algorithm = 1.0f;
            } else {
                float min = getMin();
                float floatValue = this.toIntRange.floatValue() - this.equals;
                setVerticalGravity setverticalgravity = this.setMin;
                this.Grayscale$Algorithm = min + (floatValue / (setverticalgravity.toDoubleRange - setverticalgravity.values));
            }
        }
        return this.Grayscale$Algorithm;
    }

    public final boolean getMax() {
        return this.getMax == null && this.length == null && this.IsOverlapping == null;
    }

    public final boolean getMin(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= getMin() && f < setMin();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.setMax);
        sb.append(", endValue=");
        sb.append(this.getMin);
        sb.append(", startFrame=");
        sb.append(this.equals);
        sb.append(", endFrame=");
        sb.append(this.toIntRange);
        sb.append(", interpolator=");
        sb.append(this.getMax);
        sb.append('}');
        return sb.toString();
    }
}
