package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import o.setInitialSavedState;

@SuppressLint({"NewApi"})
public final class onUpdateExtractingViews extends ExifInterface$IfdType implements Animator.AnimatorListener {
    private static setInitialSavedState<onUpdateExtractingViews> valueOf = setInitialSavedState.getMax(8, new onUpdateExtractingViews());
    protected float IsOverlapping = 0.0f;
    protected float equals;
    protected float isInside = 0.0f;
    protected float setMin = 0.0f;
    protected YAxis toFloatRange;
    protected float toIntRange = 0.0f;
    protected Matrix toString = new Matrix();

    public final void getMin() {
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public static onUpdateExtractingViews getMax(setTargetFragment settargetfragment, View view, getActivity getactivity, YAxis yAxis, float f, float f2, float f3, float f4, float f5, long j) {
        onUpdateExtractingViews max = valueOf.setMax();
        max.hashCode = settargetfragment;
        max.toDoubleRange = f2;
        max.FastBitmap$CoordinateSystem = f3;
        max.invoke = getactivity;
        max.Grayscale$Algorithm = view;
        max.length = f4;
        max.getMax = f5;
        max.toFloatRange = yAxis;
        max.equals = f;
        max.length();
        max.getMin.setDuration(j);
        return max;
    }

    @SuppressLint({"NewApi"})
    private onUpdateExtractingViews() {
        this.getMin.addListener(this);
        this.toFloatRange = null;
        this.equals = 0.0f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.length + ((this.toDoubleRange - this.length) * this.setMax);
        float f2 = this.getMax + ((this.FastBitmap$CoordinateSystem - this.getMax) * this.setMax);
        Matrix matrix = this.toString;
        this.hashCode.setMin(f, f2, matrix);
        this.hashCode.getMin(matrix, this.Grayscale$Algorithm, false);
        float f3 = this.toFloatRange.extraCallbackWithResult / this.hashCode.IsOverlapping;
        float f4 = this.equals / this.hashCode.getMin;
        float[] fArr = this.values;
        float f5 = this.setMin;
        fArr[0] = f5 + (((this.isInside - (f4 / 2.0f)) - f5) * this.setMax);
        float[] fArr2 = this.values;
        float f6 = this.toIntRange;
        fArr2[1] = f6 + (((this.IsOverlapping + (f3 / 2.0f)) - f6) * this.setMax);
        this.invoke.length(this.values);
        this.hashCode.length(this.values, matrix);
        this.hashCode.getMin(matrix, this.Grayscale$Algorithm, true);
    }

    public final void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.Grayscale$Algorithm).calculateOffsets();
        this.Grayscale$Algorithm.postInvalidate();
    }

    public final setInitialSavedState.setMax setMin() {
        return new onUpdateExtractingViews();
    }
}
