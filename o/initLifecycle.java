package o;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

public class initLifecycle extends restoreViewState {
    private Path Grayscale$Algorithm = new Path();
    private RadarChart Mean$Arithmetic;

    public initLifecycle(setTargetFragment settargetfragment, YAxis yAxis, RadarChart radarChart) {
        super(settargetfragment, yAxis, (getActivity) null);
        this.Mean$Arithmetic = radarChart;
    }

    /* access modifiers changed from: protected */
    public final void length(float f, float f2) {
        double d;
        double d2;
        boolean z;
        float f3 = f;
        float f4 = f2;
        int i = this.setMin.IsOverlapping;
        double abs = (double) Math.abs(f4 - f3);
        if (i == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            this.setMin.toIntRange = new float[0];
            this.setMin.toFloatRange = new float[0];
            this.setMin.isInside = 0;
            return;
        }
        double d3 = (double) i;
        Double.isNaN(abs);
        Double.isNaN(d3);
        double min = (double) getTargetFragment.setMin(abs / d3);
        if (this.setMin.toIntRange() && min < ((double) this.setMin.IsOverlapping())) {
            min = (double) this.setMin.IsOverlapping();
        }
        double min2 = (double) getTargetFragment.setMin(Math.pow(10.0d, (double) ((int) Math.log10(min))));
        Double.isNaN(min2);
        if (((int) (min / min2)) > 5) {
            Double.isNaN(min2);
            min = Math.floor(min2 * 10.0d);
        }
        boolean min3 = this.setMin.getMin();
        if (this.setMin.equals()) {
            float f5 = ((float) abs) / ((float) (i - 1));
            this.setMin.isInside = i;
            if (this.setMin.toIntRange.length < i) {
                this.setMin.toIntRange = new float[i];
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.setMin.toIntRange[i2] = f3;
                f3 += f5;
            }
        } else {
            if (min == 0.0d) {
                d = 0.0d;
            } else {
                double d4 = (double) f3;
                Double.isNaN(d4);
                d = Math.ceil(d4 / min) * min;
            }
            if (min3) {
                d -= min;
            }
            if (min == 0.0d) {
                d2 = 0.0d;
            } else {
                double d5 = (double) f4;
                Double.isNaN(d5);
                d2 = getTargetFragment.getMax(Math.floor(d5 / min) * min);
            }
            if (min != 0.0d) {
                z = min3;
                for (double d6 = d; d6 <= d2; d6 += min) {
                    z++;
                }
            } else {
                z = min3;
            }
            int i3 = ((int) z) + 1;
            this.setMin.isInside = i3;
            if (this.setMin.toIntRange.length < i3) {
                this.setMin.toIntRange = new float[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (d == 0.0d) {
                    d = 0.0d;
                }
                this.setMin.toIntRange[i4] = (float) d;
                d += min;
            }
            i = i3;
        }
        if (min < 1.0d) {
            this.setMin.equals = (int) Math.ceil(-Math.log10(min));
        } else {
            this.setMin.equals = 0;
        }
        if (min3) {
            if (this.setMin.toFloatRange.length < i) {
                this.setMin.toFloatRange = new float[i];
            }
            float f6 = (this.setMin.toIntRange[1] - this.setMin.toIntRange[0]) / 2.0f;
            for (int i5 = 0; i5 < i; i5++) {
                this.setMin.toFloatRange[i5] = this.setMin.toIntRange[i5] + f6;
            }
        }
        this.setMin.onPostMessage = this.setMin.toIntRange[0];
        this.setMin.onMessageChannelReady = this.setMin.toIntRange[i - 1];
        this.setMin.extraCallbackWithResult = Math.abs(this.setMin.onMessageChannelReady - this.setMin.onPostMessage);
    }

    public final void setMin(Canvas canvas) {
        if (this.isInside.create() && this.isInside.length()) {
            this.getMax.setTypeface(this.isInside.getCause());
            this.getMax.setTextSize(this.isInside.onNavigationEvent());
            this.getMax.setColor(this.isInside.ICustomTabsCallback());
            setArguments centerOffsets = this.Mean$Arithmetic.getCenterOffsets();
            setArguments max = setArguments.getMax(0.0f, 0.0f);
            float factor = this.Mean$Arithmetic.getFactor();
            int i = this.isInside.b() ? this.isInside.isInside : this.isInside.isInside - 1;
            for (int i2 = !this.isInside.onRelationshipValidationResult(); i2 < i; i2++) {
                getTargetFragment.setMax(centerOffsets, (this.isInside.toIntRange[i2] - this.isInside.onPostMessage) * factor, this.Mean$Arithmetic.getRotationAngle(), max);
                canvas.drawText(this.isInside.getMax(i2), max.length + 10.0f, max.getMin, this.getMax);
            }
            setArguments.setMin(centerOffsets);
            setArguments.setMin(max);
        }
    }

    public final void setMax(Canvas canvas) {
        List<LimitLine> isInside = this.isInside.isInside();
        if (isInside != null) {
            float sliceAngle = this.Mean$Arithmetic.getSliceAngle();
            float factor = this.Mean$Arithmetic.getFactor();
            setArguments centerOffsets = this.Mean$Arithmetic.getCenterOffsets();
            setArguments max = setArguments.getMax(0.0f, 0.0f);
            for (int i = 0; i < isInside.size(); i++) {
                LimitLine limitLine = isInside.get(i);
                if (limitLine.create()) {
                    this.equals.setColor(limitLine.setMax);
                    this.equals.setPathEffect(limitLine.IsOverlapping);
                    this.equals.setStrokeWidth(limitLine.getMin);
                    float yChartMin = (limitLine.setMin - this.Mean$Arithmetic.getYChartMin()) * factor;
                    Path path = this.Grayscale$Algorithm;
                    path.reset();
                    for (int i2 = 0; i2 < ((EmojiExtractTextLayout) ((gravityToString) this.Mean$Arithmetic.getData()).FastBitmap$CoordinateSystem()).ICustomTabsCallback(); i2++) {
                        getTargetFragment.setMax(centerOffsets, yChartMin, (((float) i2) * sliceAngle) + this.Mean$Arithmetic.getRotationAngle(), max);
                        if (i2 == 0) {
                            path.moveTo(max.length, max.getMin);
                        } else {
                            path.lineTo(max.length, max.getMin);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, this.equals);
                }
            }
            setArguments.setMin(centerOffsets);
            setArguments.setMin(max);
        }
    }
}
