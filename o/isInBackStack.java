package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

public final class isInBackStack extends restoreViewState {
    protected float[] Grayscale$Algorithm = new float[4];
    protected Path Mean$Arithmetic = new Path();
    protected Path invoke = new Path();

    public isInBackStack(setTargetFragment settargetfragment, YAxis yAxis, getActivity getactivity) {
        super(settargetfragment, yAxis, getactivity);
        this.equals.setTextAlign(Paint.Align.LEFT);
    }

    public final void getMax(float f, float f2, boolean z) {
        double d;
        if (this.invokeSuspend.values() > 10.0f && !this.invokeSuspend.create()) {
            getActivity getactivity = this.setMax;
            float isInside = this.invokeSuspend.isInside();
            float intRange = this.invokeSuspend.toIntRange();
            isStateSaved min = isStateSaved.getMin(0.0d, 0.0d);
            getactivity.length(isInside, intRange, min);
            getActivity getactivity2 = this.setMax;
            float equals = this.invokeSuspend.equals();
            float intRange2 = this.invokeSuspend.toIntRange();
            isStateSaved min2 = isStateSaved.getMin(0.0d, 0.0d);
            getactivity2.length(equals, intRange2, min2);
            if (!z) {
                f = (float) min.length;
                d = min2.length;
            } else {
                f = (float) min2.length;
                d = min.length;
            }
            f2 = (float) d;
            isStateSaved.getMax(min);
            isStateSaved.getMax(min2);
        }
        length(f, f2);
    }

    public final void setMin(Canvas canvas) {
        float f;
        float f2;
        if (this.isInside.create() && this.isInside.length()) {
            float[] min = setMin();
            this.getMax.setTypeface(this.isInside.getCause());
            this.getMax.setTextSize(this.isInside.onNavigationEvent());
            this.getMax.setColor(this.isInside.ICustomTabsCallback());
            this.getMax.setTextAlign(Paint.Align.CENTER);
            float max = getTargetFragment.setMax(2.5f);
            float max2 = (float) getTargetFragment.setMax(this.getMax, "Q");
            YAxis.AxisDependency axisDependency = this.isInside.newSessionWithExtras;
            YAxis.YAxisLabelPosition yAxisLabelPosition = this.isInside.extraCommand;
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                if (yAxisLabelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    f2 = this.invokeSuspend.toIntRange();
                } else {
                    f2 = this.invokeSuspend.toIntRange();
                }
                f = f2 - max;
            } else {
                YAxis.YAxisLabelPosition yAxisLabelPosition2 = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                f = this.invokeSuspend.toFloatRange() + max2 + max;
            }
            getMin(canvas, f, min, this.isInside.Mean$Arithmetic());
        }
    }

    public final void getMax(Canvas canvas) {
        if (this.isInside.create() && this.isInside.setMin()) {
            this.getMin.setColor(this.isInside.getMax);
            this.getMin.setStrokeWidth(this.isInside.setMax);
            if (this.isInside.newSessionWithExtras == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.invokeSuspend.isInside(), this.invokeSuspend.toIntRange(), this.invokeSuspend.equals(), this.invokeSuspend.toIntRange(), this.getMin);
                return;
            }
            canvas.drawLine(this.invokeSuspend.isInside(), this.invokeSuspend.toFloatRange(), this.invokeSuspend.equals(), this.invokeSuspend.toFloatRange(), this.getMin);
        }
    }

    /* access modifiers changed from: protected */
    public final void getMin(Canvas canvas, float f, float[] fArr, float f2) {
        this.getMax.setTypeface(this.isInside.getCause());
        this.getMax.setTextSize(this.isInside.onNavigationEvent());
        this.getMax.setColor(this.isInside.ICustomTabsCallback());
        int i = this.isInside.b() ? this.isInside.isInside : this.isInside.isInside - 1;
        for (int i2 = !this.isInside.onRelationshipValidationResult(); i2 < i; i2++) {
            canvas.drawText(this.isInside.getMax(i2), fArr[i2 * 2], f - f2, this.getMax);
        }
    }

    /* access modifiers changed from: protected */
    public final float[] setMin() {
        if (this.toDoubleRange.length != this.isInside.isInside * 2) {
            this.toDoubleRange = new float[(this.isInside.isInside * 2)];
        }
        float[] fArr = this.toDoubleRange;
        for (int i = 0; i < fArr.length; i += 2) {
            fArr[i] = this.isInside.toIntRange[i / 2];
        }
        this.setMax.length(fArr);
        return fArr;
    }

    public final RectF length() {
        this.IsOverlapping.set(this.invokeSuspend.toDoubleRange());
        this.IsOverlapping.inset(-this.setMin.length, 0.0f);
        return this.IsOverlapping;
    }

    /* access modifiers changed from: protected */
    public final Path getMax(Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], this.invokeSuspend.toIntRange());
        path.lineTo(fArr[i], this.invokeSuspend.toFloatRange());
        return path;
    }

    /* access modifiers changed from: protected */
    public final void getMin(Canvas canvas) {
        int save = canvas.save();
        this.FastBitmap$CoordinateSystem.set(this.invokeSuspend.toDoubleRange());
        this.FastBitmap$CoordinateSystem.inset(-this.isInside.ICustomTabsCallback$Stub(), 0.0f);
        canvas.clipRect(this.valueOf);
        isStateSaved max = this.setMax.getMax(0.0f, 0.0f);
        this.toIntRange.setColor(this.isInside.extraCallback());
        this.toIntRange.setStrokeWidth(this.isInside.ICustomTabsCallback$Stub());
        Path path = this.Mean$Arithmetic;
        path.reset();
        path.moveTo(((float) max.length) - 1.0f, this.invokeSuspend.toIntRange());
        path.lineTo(((float) max.length) - 1.0f, this.invokeSuspend.toFloatRange());
        canvas.drawPath(path, this.toIntRange);
        canvas.restoreToCount(save);
    }

    public final void setMax(Canvas canvas) {
        Canvas canvas2 = canvas;
        List<LimitLine> isInside = this.isInside.isInside();
        if (isInside != null && isInside.size() > 0) {
            float[] fArr = this.Grayscale$Algorithm;
            float f = 0.0f;
            fArr[0] = 0.0f;
            char c = 1;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            Path path = this.invoke;
            path.reset();
            int i = 0;
            while (i < isInside.size()) {
                LimitLine limitLine = isInside.get(i);
                if (limitLine.create()) {
                    int save = canvas.save();
                    this.valueOf.set(this.invokeSuspend.toDoubleRange());
                    this.valueOf.inset(-limitLine.getMin, f);
                    canvas2.clipRect(this.valueOf);
                    fArr[0] = limitLine.setMin;
                    fArr[2] = limitLine.setMin;
                    this.setMax.length(fArr);
                    fArr[c] = this.invokeSuspend.toIntRange();
                    fArr[3] = this.invokeSuspend.toFloatRange();
                    path.moveTo(fArr[0], fArr[c]);
                    path.lineTo(fArr[2], fArr[3]);
                    this.equals.setStyle(Paint.Style.STROKE);
                    this.equals.setColor(limitLine.setMax);
                    this.equals.setPathEffect(limitLine.IsOverlapping);
                    this.equals.setStrokeWidth(limitLine.getMin);
                    canvas2.drawPath(path, this.equals);
                    path.reset();
                    String str = limitLine.getMax;
                    if (str != null && !str.equals("")) {
                        this.equals.setStyle(limitLine.length);
                        this.equals.setPathEffect((PathEffect) null);
                        this.equals.setColor(limitLine.ICustomTabsCallback());
                        this.equals.setTypeface(limitLine.getCause());
                        this.equals.setStrokeWidth(0.5f);
                        this.equals.setTextSize(limitLine.onNavigationEvent());
                        float invokeSuspend = limitLine.getMin + limitLine.invokeSuspend();
                        float max = getTargetFragment.setMax(2.0f) + limitLine.Mean$Arithmetic();
                        LimitLine.LimitLabelPosition limitLabelPosition = limitLine.toIntRange;
                        if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.equals.setTextAlign(Paint.Align.LEFT);
                            canvas2.drawText(str, fArr[0] + invokeSuspend, this.invokeSuspend.toIntRange() + max + ((float) getTargetFragment.setMax(this.equals, str)), this.equals);
                        } else if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.equals.setTextAlign(Paint.Align.LEFT);
                            canvas2.drawText(str, fArr[0] + invokeSuspend, this.invokeSuspend.toFloatRange() - max, this.equals);
                        } else if (limitLabelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            this.equals.setTextAlign(Paint.Align.RIGHT);
                            canvas2.drawText(str, fArr[0] - invokeSuspend, this.invokeSuspend.toIntRange() + max + ((float) getTargetFragment.setMax(this.equals, str)), this.equals);
                        } else {
                            this.equals.setTextAlign(Paint.Align.RIGHT);
                            canvas2.drawText(str, fArr[0] - invokeSuspend, this.invokeSuspend.toFloatRange() - max, this.equals);
                        }
                    }
                    canvas2.restoreToCount(save);
                }
                i++;
                f = 0.0f;
                c = 1;
            }
        }
    }
}
