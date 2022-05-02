package o;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import o.setInitialSavedState;

public final class EmojiTextView extends ExtractButtonCompat {
    private static setInitialSavedState<EmojiTextView> setMin;
    protected Matrix getMax = new Matrix();
    protected float getMin = 0.0f;
    protected float length = 0.0f;
    protected YAxis.AxisDependency setMax = null;

    static {
        setInitialSavedState<EmojiTextView> max = setInitialSavedState.getMax(1, new EmojiTextView());
        setMin = max;
        max.setMax = 0.5f;
    }

    public static EmojiTextView getMax(setTargetFragment settargetfragment, float f, float f2, float f3, float f4, getActivity getactivity, YAxis.AxisDependency axisDependency, View view) {
        EmojiTextView max = setMin.setMax();
        max.toDoubleRange = f3;
        max.FastBitmap$CoordinateSystem = f4;
        max.length = f;
        max.getMin = f2;
        max.hashCode = settargetfragment;
        max.invoke = getactivity;
        max.setMax = axisDependency;
        max.Grayscale$Algorithm = view;
        return max;
    }

    private EmojiTextView() {
        super((setTargetFragment) null, 0.0f, 0.0f, (getActivity) null, (View) null);
    }

    public final void run() {
        Matrix matrix = this.getMax;
        this.hashCode.getMax(this.length, this.getMin, matrix);
        this.hashCode.getMin(matrix, this.Grayscale$Algorithm, false);
        float f = ((BarLineChartBase) this.Grayscale$Algorithm).getAxis(this.setMax).extraCallbackWithResult / this.hashCode.IsOverlapping;
        this.values[0] = this.toDoubleRange - ((((BarLineChartBase) this.Grayscale$Algorithm).getXAxis().extraCallbackWithResult / this.hashCode.getMin) / 2.0f);
        this.values[1] = this.FastBitmap$CoordinateSystem + (f / 2.0f);
        this.invoke.length(this.values);
        this.hashCode.length(this.values, matrix);
        this.hashCode.getMin(matrix, this.Grayscale$Algorithm, false);
        ((BarLineChartBase) this.Grayscale$Algorithm).calculateOffsets();
        this.Grayscale$Algorithm.postInvalidate();
        setMin.getMax(this);
    }

    public final setInitialSavedState.setMax setMin() {
        return new EmojiTextView();
    }
}
