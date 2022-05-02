package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

public final class onViewStateRestored extends getViewLifecycleOwner {
    protected BarChart toDoubleRange;
    protected Path values = new Path();

    public onViewStateRestored(setTargetFragment settargetfragment, XAxis xAxis, getActivity getactivity, BarChart barChart) {
        super(settargetfragment, xAxis, getactivity);
        this.toDoubleRange = barChart;
    }

    public final void getMax(float f, float f2, boolean z) {
        double d;
        if (this.invokeSuspend.IsOverlapping() > 10.0f && !this.invokeSuspend.b()) {
            getActivity getactivity = this.setMax;
            float isInside = this.invokeSuspend.isInside();
            float floatRange = this.invokeSuspend.toFloatRange();
            isStateSaved min = isStateSaved.getMin(0.0d, 0.0d);
            getactivity.length(isInside, floatRange, min);
            getActivity getactivity2 = this.setMax;
            float isInside2 = this.invokeSuspend.isInside();
            float intRange = this.invokeSuspend.toIntRange();
            isStateSaved min2 = isStateSaved.getMin(0.0d, 0.0d);
            getactivity2.length(isInside2, intRange, min2);
            if (z) {
                f = (float) min2.getMin;
                d = min.getMin;
            } else {
                f = (float) min.getMin;
                d = min2.getMin;
            }
            f2 = (float) d;
            isStateSaved.getMax(min);
            isStateSaved.getMax(min2);
        }
        length(f, f2);
    }

    /* access modifiers changed from: protected */
    public final void getMax() {
        this.getMax.setTypeface(this.IsOverlapping.getCause());
        this.getMax.setTextSize(this.IsOverlapping.onNavigationEvent());
        getArguments length = getTargetFragment.length(this.getMax, this.IsOverlapping.values());
        float f = length.setMax;
        getArguments max = getTargetFragment.getMax(length.length, f, this.IsOverlapping.b());
        this.IsOverlapping.ICustomTabsService = Math.round((float) ((int) (length.length + (this.IsOverlapping.invokeSuspend() * 3.5f))));
        this.IsOverlapping.getInterfaceDescriptor = Math.round(f);
        this.IsOverlapping.setDefaultImpl = (int) (max.length + (this.IsOverlapping.invokeSuspend() * 3.5f));
        this.IsOverlapping.ICustomTabsCallback$Stub$Proxy = Math.round(max.setMax);
        getArguments.setMin(max);
    }

    public final void getMax(Canvas canvas) {
        if (this.IsOverlapping.create() && this.IsOverlapping.length()) {
            float invokeSuspend = this.IsOverlapping.invokeSuspend();
            this.getMax.setTypeface(this.IsOverlapping.getCause());
            this.getMax.setTextSize(this.IsOverlapping.onNavigationEvent());
            this.getMax.setColor(this.IsOverlapping.ICustomTabsCallback());
            setArguments max = setArguments.getMax(0.0f, 0.0f);
            if (this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP) {
                max.length = 0.0f;
                max.getMin = 0.5f;
                length(canvas, this.invokeSuspend.equals() + invokeSuspend, max);
            } else if (this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP_INSIDE) {
                max.length = 1.0f;
                max.getMin = 0.5f;
                length(canvas, this.invokeSuspend.equals() - invokeSuspend, max);
            } else if (this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM) {
                max.length = 1.0f;
                max.getMin = 0.5f;
                length(canvas, this.invokeSuspend.isInside() - invokeSuspend, max);
            } else if (this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                max.length = 1.0f;
                max.getMin = 0.5f;
                length(canvas, this.invokeSuspend.isInside() + invokeSuspend, max);
            } else {
                max.length = 0.0f;
                max.getMin = 0.5f;
                length(canvas, this.invokeSuspend.equals() + invokeSuspend, max);
                max.length = 1.0f;
                max.getMin = 0.5f;
                length(canvas, this.invokeSuspend.isInside() - invokeSuspend, max);
            }
            setArguments.setMin(max);
        }
    }

    /* access modifiers changed from: protected */
    public final void length(Canvas canvas, float f, setArguments setarguments) {
        float b = this.IsOverlapping.b();
        boolean min = this.IsOverlapping.getMin();
        int i = this.IsOverlapping.isInside * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (min) {
                fArr[i2 + 1] = this.IsOverlapping.toFloatRange[i2 / 2];
            } else {
                fArr[i2 + 1] = this.IsOverlapping.toIntRange[i2 / 2];
            }
        }
        this.setMax.length(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (this.invokeSuspend.IsOverlapping(f2)) {
                setMin(canvas, this.IsOverlapping.invoke().getMin(this.IsOverlapping.toIntRange[i3 / 2]), f, f2, setarguments, b);
            }
        }
    }

    public final RectF getMin() {
        this.toIntRange.set(this.invokeSuspend.toDoubleRange());
        this.toIntRange.inset(0.0f, -this.setMin.length);
        return this.toIntRange;
    }

    /* access modifiers changed from: protected */
    public final void getMax(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(this.invokeSuspend.equals(), f2);
        path.lineTo(this.invokeSuspend.isInside(), f2);
        canvas.drawPath(path, this.length);
        path.reset();
    }

    public final void length(Canvas canvas) {
        if (this.IsOverlapping.setMin() && this.IsOverlapping.create()) {
            this.getMin.setColor(this.IsOverlapping.getMax);
            this.getMin.setStrokeWidth(this.IsOverlapping.setMax);
            if (this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP || this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP_INSIDE || this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.invokeSuspend.equals(), this.invokeSuspend.toIntRange(), this.invokeSuspend.equals(), this.invokeSuspend.toFloatRange(), this.getMin);
            }
            if (this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM || this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM_INSIDE || this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.invokeSuspend.isInside(), this.invokeSuspend.toIntRange(), this.invokeSuspend.isInside(), this.invokeSuspend.toFloatRange(), this.getMin);
            }
        }
    }

    public final void setMin(Canvas canvas) {
        List<LimitLine> isInside = this.IsOverlapping.isInside();
        if (isInside != null && isInside.size() > 0) {
            float[] fArr = this.hashCode;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.values;
            path.reset();
            for (int i = 0; i < isInside.size(); i++) {
                LimitLine limitLine = isInside.get(i);
                if (limitLine.create()) {
                    int save = canvas.save();
                    this.FastBitmap$CoordinateSystem.set(this.invokeSuspend.toDoubleRange());
                    this.FastBitmap$CoordinateSystem.inset(0.0f, -limitLine.getMin);
                    canvas.clipRect(this.FastBitmap$CoordinateSystem);
                    this.equals.setStyle(Paint.Style.STROKE);
                    this.equals.setColor(limitLine.setMax);
                    this.equals.setStrokeWidth(limitLine.getMin);
                    this.equals.setPathEffect(limitLine.IsOverlapping);
                    fArr[1] = limitLine.setMin;
                    this.setMax.length(fArr);
                    path.moveTo(this.invokeSuspend.isInside(), fArr[1]);
                    path.lineTo(this.invokeSuspend.equals(), fArr[1]);
                    canvas.drawPath(path, this.equals);
                    path.reset();
                    String str = limitLine.getMax;
                    if (str != null && !str.equals("")) {
                        this.equals.setStyle(limitLine.length);
                        this.equals.setPathEffect((PathEffect) null);
                        this.equals.setColor(limitLine.ICustomTabsCallback());
                        this.equals.setStrokeWidth(0.5f);
                        this.equals.setTextSize(limitLine.onNavigationEvent());
                        float max = (float) getTargetFragment.setMax(this.equals, str);
                        float max2 = getTargetFragment.setMax(4.0f) + limitLine.invokeSuspend();
                        float Mean$Arithmetic = limitLine.getMin + max + limitLine.Mean$Arithmetic();
                        LimitLine.LimitLabelPosition limitLabelPosition = limitLine.toIntRange;
                        if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.equals.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, this.invokeSuspend.equals() - max2, (fArr[1] - Mean$Arithmetic) + max, this.equals);
                        } else if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.equals.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, this.invokeSuspend.equals() - max2, fArr[1] + Mean$Arithmetic, this.equals);
                        } else if (limitLabelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            this.equals.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, this.invokeSuspend.isInside() + max2, (fArr[1] - Mean$Arithmetic) + max, this.equals);
                        } else {
                            this.equals.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, this.invokeSuspend.setMin() + max2, fArr[1] + Mean$Arithmetic, this.equals);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
