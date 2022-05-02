package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

public class restoreViewState extends isCancelable {
    protected RectF FastBitmap$CoordinateSystem = new RectF();
    protected RectF IsOverlapping = new RectF();
    protected Path hashCode = new Path();
    protected YAxis isInside;
    protected float[] toDoubleRange = new float[2];
    protected Path toFloatRange = new Path();
    protected Paint toIntRange;
    protected float[] toString = new float[2];
    protected RectF valueOf = new RectF();
    protected Path values = new Path();

    public restoreViewState(setTargetFragment settargetfragment, YAxis yAxis, getActivity getactivity) {
        super(settargetfragment, getactivity, yAxis);
        this.isInside = yAxis;
        if (this.invokeSuspend != null) {
            this.getMax.setColor(-16777216);
            this.getMax.setTextSize(getTargetFragment.setMax(10.0f));
            Paint paint = new Paint(1);
            this.toIntRange = paint;
            paint.setColor(-7829368);
            this.toIntRange.setStrokeWidth(1.0f);
            this.toIntRange.setStyle(Paint.Style.STROKE);
        }
    }

    public void setMin(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.isInside.create() && this.isInside.length()) {
            float[] min = setMin();
            this.getMax.setTypeface(this.isInside.getCause());
            this.getMax.setTextSize(this.isInside.onNavigationEvent());
            this.getMax.setColor(this.isInside.ICustomTabsCallback());
            float invokeSuspend = this.isInside.invokeSuspend();
            float max = (((float) getTargetFragment.setMax(this.getMax, "A")) / 2.5f) + this.isInside.Mean$Arithmetic();
            YAxis.AxisDependency axisDependency = this.isInside.newSessionWithExtras;
            YAxis.YAxisLabelPosition yAxisLabelPosition = this.isInside.extraCommand;
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                if (yAxisLabelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    this.getMax.setTextAlign(Paint.Align.RIGHT);
                    f2 = this.invokeSuspend.setMin();
                    f = f2 - invokeSuspend;
                    getMin(canvas, f, min, max);
                }
                this.getMax.setTextAlign(Paint.Align.LEFT);
                f3 = this.invokeSuspend.setMin();
            } else if (yAxisLabelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                this.getMax.setTextAlign(Paint.Align.LEFT);
                f3 = this.invokeSuspend.equals();
            } else {
                this.getMax.setTextAlign(Paint.Align.RIGHT);
                f2 = this.invokeSuspend.equals();
                f = f2 - invokeSuspend;
                getMin(canvas, f, min, max);
            }
            f = f3 + invokeSuspend;
            getMin(canvas, f, min, max);
        }
    }

    public void getMax(Canvas canvas) {
        if (this.isInside.create() && this.isInside.setMin()) {
            this.getMin.setColor(this.isInside.getMax);
            this.getMin.setStrokeWidth(this.isInside.setMax);
            if (this.isInside.newSessionWithExtras == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.invokeSuspend.isInside(), this.invokeSuspend.toIntRange(), this.invokeSuspend.isInside(), this.invokeSuspend.toFloatRange(), this.getMin);
                return;
            }
            canvas.drawLine(this.invokeSuspend.equals(), this.invokeSuspend.toIntRange(), this.invokeSuspend.equals(), this.invokeSuspend.toFloatRange(), this.getMin);
        }
    }

    /* access modifiers changed from: protected */
    public void getMin(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.isInside.b() ? this.isInside.isInside : this.isInside.isInside - 1;
        for (int i2 = !this.isInside.onRelationshipValidationResult(); i2 < i; i2++) {
            canvas.drawText(this.isInside.getMax(i2), f, fArr[(i2 * 2) + 1] + f2, this.getMax);
        }
    }

    public final void length(Canvas canvas) {
        if (this.isInside.create()) {
            if (this.isInside.setMax()) {
                int save = canvas.save();
                canvas.clipRect(length());
                float[] min = setMin();
                this.length.setColor(this.isInside.setMin);
                this.length.setStrokeWidth(this.isInside.length);
                this.length.setPathEffect(this.isInside.Mean$Arithmetic);
                Path path = this.toFloatRange;
                path.reset();
                for (int i = 0; i < min.length; i += 2) {
                    canvas.drawPath(getMax(path, i, min), this.length);
                    path.reset();
                }
                canvas.restoreToCount(save);
            }
            if (this.isInside.onPostMessage()) {
                getMin(canvas);
            }
        }
    }

    public RectF length() {
        this.IsOverlapping.set(this.invokeSuspend.toDoubleRange());
        this.IsOverlapping.inset(0.0f, -this.setMin.length);
        return this.IsOverlapping;
    }

    /* access modifiers changed from: protected */
    public Path getMax(Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(this.invokeSuspend.setMin(), fArr[i2]);
        path.lineTo(this.invokeSuspend.equals(), fArr[i2]);
        return path;
    }

    /* access modifiers changed from: protected */
    public float[] setMin() {
        if (this.toDoubleRange.length != this.isInside.isInside * 2) {
            this.toDoubleRange = new float[(this.isInside.isInside * 2)];
        }
        float[] fArr = this.toDoubleRange;
        for (int i = 0; i < fArr.length; i += 2) {
            fArr[i + 1] = this.isInside.toIntRange[i / 2];
        }
        this.setMax.length(fArr);
        return fArr;
    }

    /* access modifiers changed from: protected */
    public void getMin(Canvas canvas) {
        int save = canvas.save();
        this.FastBitmap$CoordinateSystem.set(this.invokeSuspend.toDoubleRange());
        this.FastBitmap$CoordinateSystem.inset(0.0f, -this.isInside.ICustomTabsCallback$Stub());
        canvas.clipRect(this.FastBitmap$CoordinateSystem);
        isStateSaved max = this.setMax.getMax(0.0f, 0.0f);
        this.toIntRange.setColor(this.isInside.extraCallback());
        this.toIntRange.setStrokeWidth(this.isInside.ICustomTabsCallback$Stub());
        Path path = this.hashCode;
        path.reset();
        path.moveTo(this.invokeSuspend.isInside(), (float) max.getMin);
        path.lineTo(this.invokeSuspend.equals(), (float) max.getMin);
        canvas.drawPath(path, this.toIntRange);
        canvas.restoreToCount(save);
    }

    public void setMax(Canvas canvas) {
        List<LimitLine> isInside2 = this.isInside.isInside();
        if (isInside2 != null && isInside2.size() > 0) {
            float[] fArr = this.toString;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.values;
            path.reset();
            for (int i = 0; i < isInside2.size(); i++) {
                LimitLine limitLine = isInside2.get(i);
                if (limitLine.create()) {
                    int save = canvas.save();
                    this.valueOf.set(this.invokeSuspend.toDoubleRange());
                    this.valueOf.inset(0.0f, -limitLine.getMin);
                    canvas.clipRect(this.valueOf);
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
                        this.equals.setTypeface(limitLine.getCause());
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
