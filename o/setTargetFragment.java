package o;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

public class setTargetFragment {
    private float FastBitmap$CoordinateSystem = 1.0f;
    private float Grayscale$Algorithm = 0.0f;
    public float IsOverlapping = 1.0f;
    protected Matrix equals = new Matrix();
    protected RectF getMax = new RectF();
    public float getMin = 1.0f;
    private float hashCode = 1.0f;
    private float invoke = 0.0f;
    public float isInside = 0.0f;
    protected float length = 0.0f;
    protected final Matrix setMax = new Matrix();
    protected float setMin = 0.0f;
    protected final float[] toDoubleRange = new float[9];
    public float toFloatRange = 0.0f;
    protected float[] toIntRange = new float[9];
    private float toString = Float.MAX_VALUE;
    private float values = Float.MAX_VALUE;

    public final boolean getMax() {
        return this.length > 0.0f && this.setMin > 0.0f;
    }

    public final void getMin(float f, float f2, float f3, float f4) {
        this.getMax.set(f, f2, this.setMin - f3, this.length - f4);
    }

    public final float setMin() {
        return this.getMax.left;
    }

    public final float length() {
        return this.setMin - this.getMax.right;
    }

    public final float setMax() {
        return this.getMax.top;
    }

    public final float getMin() {
        return this.length - this.getMax.bottom;
    }

    public final float toIntRange() {
        return this.getMax.top;
    }

    public final float isInside() {
        return this.getMax.left;
    }

    public final float equals() {
        return this.getMax.right;
    }

    public final float toFloatRange() {
        return this.getMax.bottom;
    }

    public final float IsOverlapping() {
        return this.getMax.width();
    }

    public final float values() {
        return this.getMax.height();
    }

    public final RectF toDoubleRange() {
        return this.getMax;
    }

    public final setArguments FastBitmap$CoordinateSystem() {
        return setArguments.getMax(this.getMax.centerX(), this.getMax.centerY());
    }

    public final float Grayscale$Algorithm() {
        return this.length;
    }

    public final float invoke() {
        return this.setMin;
    }

    public final float valueOf() {
        return Math.min(this.getMax.width(), this.getMax.height());
    }

    public final void getMin(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.setMax);
        matrix.postScale(1.4f, 1.4f, f, f2);
    }

    public final void length(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.setMax);
        matrix.postScale(0.7f, 0.7f, f, f2);
    }

    public final void length(Matrix matrix) {
        matrix.reset();
        matrix.set(this.setMax);
        matrix.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public final void getMax(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.setMax);
        matrix.postScale(f, f2);
    }

    public final void length(float f, float f2, float f3, float f4, Matrix matrix) {
        matrix.reset();
        matrix.set(this.setMax);
        matrix.postScale(f, f2, f3, f4);
    }

    public final void setMin(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.setMax);
        matrix.setScale(f, f2);
    }

    public final void setMin(Matrix matrix) {
        this.FastBitmap$CoordinateSystem = 1.0f;
        this.hashCode = 1.0f;
        matrix.set(this.setMax);
        float[] fArr = this.toIntRange;
        for (int i = 0; i < 9; i++) {
            fArr[i] = 0.0f;
        }
        matrix.getValues(fArr);
        fArr[2] = 0.0f;
        fArr[5] = 0.0f;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        matrix.setValues(fArr);
    }

    public final void length(float[] fArr, Matrix matrix) {
        matrix.reset();
        matrix.set(this.setMax);
        matrix.postTranslate(-(fArr[0] - this.getMax.left), -(fArr[1] - this.getMax.top));
    }

    public final void getMin(float[] fArr, View view) {
        Matrix matrix = this.equals;
        matrix.reset();
        matrix.set(this.setMax);
        matrix.postTranslate(-(fArr[0] - this.getMax.left), -(fArr[1] - this.getMax.top));
        getMin(matrix, view, true);
    }

    public final Matrix getMin(Matrix matrix, View view, boolean z) {
        this.setMax.set(matrix);
        setMin(this.setMax, this.getMax);
        if (z) {
            view.invalidate();
        }
        matrix.set(this.setMax);
        return matrix;
    }

    private void setMin(Matrix matrix, RectF rectF) {
        float f;
        matrix.getValues(this.toDoubleRange);
        float[] fArr = this.toDoubleRange;
        float f2 = fArr[2];
        float f3 = fArr[0];
        float f4 = fArr[5];
        float f5 = fArr[4];
        this.getMin = Math.min(Math.max(this.FastBitmap$CoordinateSystem, f3), this.toString);
        this.IsOverlapping = Math.min(Math.max(this.hashCode, f5), this.values);
        float f6 = 0.0f;
        if (rectF != null) {
            f6 = rectF.width();
            f = rectF.height();
        } else {
            f = 0.0f;
        }
        this.Grayscale$Algorithm = Math.min(Math.max(f2, ((-f6) * (this.getMin - 1.0f)) - this.isInside), this.isInside);
        float max = Math.max(Math.min(f4, (f * (this.IsOverlapping - 1.0f)) + this.toFloatRange), -this.toFloatRange);
        this.invoke = max;
        float[] fArr2 = this.toDoubleRange;
        fArr2[2] = this.Grayscale$Algorithm;
        fArr2[0] = this.getMin;
        fArr2[5] = max;
        fArr2[4] = this.IsOverlapping;
        matrix.setValues(fArr2);
    }

    public final void getMax(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.FastBitmap$CoordinateSystem = f;
        setMin(this.setMax, this.getMax);
    }

    public final void length(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.toString = f;
        setMin(this.setMax, this.getMax);
    }

    public final void setMin(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.FastBitmap$CoordinateSystem = f;
        this.toString = f2;
        setMin(this.setMax, this.getMax);
    }

    public final void getMin(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.hashCode = f;
        setMin(this.setMax, this.getMax);
    }

    public final void setMin(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.values = f;
        setMin(this.setMax, this.getMax);
    }

    public final void getMax(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.hashCode = f;
        this.values = f2;
        setMin(this.setMax, this.getMax);
    }

    public final Matrix Mean$Arithmetic() {
        return this.setMax;
    }

    public final boolean setMax(float f) {
        return toFloatRange(f) && isInside(f);
    }

    public final boolean IsOverlapping(float f) {
        return toIntRange(f) && equals(f);
    }

    public final boolean setMax(float f, float f2) {
        return setMax(f) && IsOverlapping(f2);
    }

    public final boolean toFloatRange(float f) {
        return this.getMax.left <= f + 1.0f;
    }

    public final boolean isInside(float f) {
        return this.getMax.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean toIntRange(float f) {
        return this.getMax.top <= f;
    }

    public final boolean equals(float f) {
        return this.getMax.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public final boolean invokeSuspend() {
        return create() && b();
    }

    public final boolean b() {
        float f = this.IsOverlapping;
        float f2 = this.hashCode;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean create() {
        float f = this.getMin;
        float f2 = this.FastBitmap$CoordinateSystem;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean onNavigationEvent() {
        return this.isInside <= 0.0f && this.toFloatRange <= 0.0f;
    }

    public final boolean getCause() {
        return this.getMin > this.FastBitmap$CoordinateSystem;
    }

    public final boolean ICustomTabsCallback() {
        return this.getMin < this.toString;
    }

    public final boolean onRelationshipValidationResult() {
        return this.IsOverlapping > this.hashCode;
    }

    public final boolean onMessageChannelReady() {
        return this.IsOverlapping < this.values;
    }

    public final void length(float f, float f2) {
        float f3 = this.getMax.left;
        float f4 = this.getMax.top;
        float f5 = this.setMin - this.getMax.right;
        float f6 = this.length - this.getMax.bottom;
        this.length = f2;
        this.setMin = f;
        this.getMax.set(f3, f4, f - f5, f2 - f6);
    }
}
