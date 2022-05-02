package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

public class getViewLifecycleOwner extends isCancelable {
    protected RectF FastBitmap$CoordinateSystem = new RectF();
    protected XAxis IsOverlapping;
    protected float[] hashCode = new float[2];
    protected Path isInside = new Path();
    protected float[] toFloatRange = new float[2];
    protected RectF toIntRange = new RectF();
    float[] toString = new float[4];
    private Path values = new Path();

    public getViewLifecycleOwner(setTargetFragment settargetfragment, XAxis xAxis, getActivity getactivity) {
        super(settargetfragment, getactivity, xAxis);
        this.IsOverlapping = xAxis;
        this.getMax.setColor(-16777216);
        this.getMax.setTextAlign(Paint.Align.CENTER);
        this.getMax.setTextSize(getTargetFragment.setMax(10.0f));
    }

    public void getMax(float f, float f2, boolean z) {
        double d;
        if (this.invokeSuspend.IsOverlapping() > 10.0f && !this.invokeSuspend.create()) {
            getActivity getactivity = this.setMax;
            float isInside2 = this.invokeSuspend.isInside();
            float intRange = this.invokeSuspend.toIntRange();
            isStateSaved min = isStateSaved.getMin(0.0d, 0.0d);
            getactivity.length(isInside2, intRange, min);
            getActivity getactivity2 = this.setMax;
            float equals = this.invokeSuspend.equals();
            float intRange2 = this.invokeSuspend.toIntRange();
            isStateSaved min2 = isStateSaved.getMin(0.0d, 0.0d);
            getactivity2.length(equals, intRange2, min2);
            if (z) {
                f = (float) min2.length;
                d = min.length;
            } else {
                f = (float) min.length;
                d = min2.length;
            }
            f2 = (float) d;
            isStateSaved.getMax(min);
            isStateSaved.getMax(min2);
        }
        super.length(f, f2);
        getMax();
    }

    /* access modifiers changed from: protected */
    public final void length(float f, float f2) {
        super.length(f, f2);
        getMax();
    }

    /* access modifiers changed from: protected */
    public void getMax() {
        String values2 = this.IsOverlapping.values();
        this.getMax.setTypeface(this.IsOverlapping.getCause());
        this.getMax.setTextSize(this.IsOverlapping.onNavigationEvent());
        getArguments length = getTargetFragment.length(this.getMax, values2);
        float f = length.length;
        float max = (float) getTargetFragment.setMax(this.getMax, "Q");
        getArguments max2 = getTargetFragment.getMax(f, max, this.IsOverlapping.b());
        this.IsOverlapping.ICustomTabsService = Math.round(f);
        this.IsOverlapping.getInterfaceDescriptor = Math.round(max);
        this.IsOverlapping.setDefaultImpl = Math.round(max2.length);
        this.IsOverlapping.ICustomTabsCallback$Stub$Proxy = Math.round(max2.setMax);
        getArguments.setMin(max2);
        getArguments.setMin(length);
    }

    public void getMax(Canvas canvas) {
        if (this.IsOverlapping.create() && this.IsOverlapping.length()) {
            float Mean$Arithmetic = this.IsOverlapping.Mean$Arithmetic();
            this.getMax.setTypeface(this.IsOverlapping.getCause());
            this.getMax.setTextSize(this.IsOverlapping.onNavigationEvent());
            this.getMax.setColor(this.IsOverlapping.ICustomTabsCallback());
            setArguments max = setArguments.getMax(0.0f, 0.0f);
            if (this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP) {
                max.length = 0.5f;
                max.getMin = 1.0f;
                length(canvas, this.invokeSuspend.toIntRange() - Mean$Arithmetic, max);
            } else if (this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP_INSIDE) {
                max.length = 0.5f;
                max.getMin = 1.0f;
                length(canvas, this.invokeSuspend.toIntRange() + Mean$Arithmetic + ((float) this.IsOverlapping.ICustomTabsCallback$Stub$Proxy), max);
            } else if (this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM) {
                max.length = 0.5f;
                max.getMin = 0.0f;
                length(canvas, this.invokeSuspend.toFloatRange() + Mean$Arithmetic, max);
            } else if (this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                max.length = 0.5f;
                max.getMin = 0.0f;
                length(canvas, (this.invokeSuspend.toFloatRange() - Mean$Arithmetic) - ((float) this.IsOverlapping.ICustomTabsCallback$Stub$Proxy), max);
            } else {
                max.length = 0.5f;
                max.getMin = 1.0f;
                length(canvas, this.invokeSuspend.toIntRange() - Mean$Arithmetic, max);
                max.length = 0.5f;
                max.getMin = 0.0f;
                length(canvas, this.invokeSuspend.toFloatRange() + Mean$Arithmetic, max);
            }
            setArguments.setMin(max);
        }
    }

    public void length(Canvas canvas) {
        if (this.IsOverlapping.setMin() && this.IsOverlapping.create()) {
            this.getMin.setColor(this.IsOverlapping.getMax);
            this.getMin.setStrokeWidth(this.IsOverlapping.setMax);
            this.getMin.setPathEffect(this.IsOverlapping.invokeSuspend);
            if (this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP || this.IsOverlapping.newSession == XAxis.XAxisPosition.TOP_INSIDE || this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.invokeSuspend.isInside(), this.invokeSuspend.toIntRange(), this.invokeSuspend.equals(), this.invokeSuspend.toIntRange(), this.getMin);
            }
            if (this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM || this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTTOM_INSIDE || this.IsOverlapping.newSession == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.invokeSuspend.isInside(), this.invokeSuspend.toFloatRange(), this.invokeSuspend.equals(), this.invokeSuspend.toFloatRange(), this.getMin);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void length(Canvas canvas, float f, setArguments setarguments) {
        float b = this.IsOverlapping.b();
        boolean min = this.IsOverlapping.getMin();
        int i = this.IsOverlapping.isInside * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (min) {
                fArr[i2] = this.IsOverlapping.toFloatRange[i2 / 2];
            } else {
                fArr[i2] = this.IsOverlapping.toIntRange[i2 / 2];
            }
        }
        this.setMax.length(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            if (this.invokeSuspend.setMax(f2)) {
                int i4 = i3 / 2;
                String min2 = this.IsOverlapping.invoke().getMin(this.IsOverlapping.toIntRange[i4]);
                if (this.IsOverlapping.onRelationshipValidationResult()) {
                    if (i4 == this.IsOverlapping.isInside - 1 && this.IsOverlapping.isInside > 1) {
                        float min3 = (float) getTargetFragment.getMin(this.getMax, min2);
                        if (min3 > this.invokeSuspend.length() * 2.0f && f2 + min3 > this.invokeSuspend.invoke()) {
                            f2 -= min3 / 2.0f;
                        }
                    } else if (i3 == 0) {
                        f2 += ((float) getTargetFragment.getMin(this.getMax, min2)) / 2.0f;
                    }
                }
                getTargetFragment.setMax(canvas, min2, f2, f, this.getMax, setarguments, b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMin(Canvas canvas, String str, float f, float f2, setArguments setarguments, float f3) {
        getTargetFragment.setMax(canvas, str, f, f2, this.getMax, setarguments, f3);
    }

    public final void getMin(Canvas canvas) {
        if (this.IsOverlapping.setMax() && this.IsOverlapping.create()) {
            int save = canvas.save();
            canvas.clipRect(getMin());
            if (this.toFloatRange.length != this.setMin.isInside * 2) {
                this.toFloatRange = new float[(this.IsOverlapping.isInside * 2)];
            }
            float[] fArr = this.toFloatRange;
            for (int i = 0; i < fArr.length; i += 2) {
                int i2 = i / 2;
                fArr[i] = this.IsOverlapping.toIntRange[i2];
                fArr[i + 1] = this.IsOverlapping.toIntRange[i2];
            }
            this.setMax.length(fArr);
            this.length.setColor(this.IsOverlapping.setMin);
            this.length.setStrokeWidth(this.IsOverlapping.length);
            this.length.setPathEffect(this.IsOverlapping.Mean$Arithmetic);
            Path path = this.isInside;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                getMax(canvas, fArr[i3], fArr[i3 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    public RectF getMin() {
        this.toIntRange.set(this.invokeSuspend.toDoubleRange());
        this.toIntRange.inset(-this.setMin.length, 0.0f);
        return this.toIntRange;
    }

    /* access modifiers changed from: protected */
    public void getMax(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(f, this.invokeSuspend.toFloatRange());
        path.lineTo(f, this.invokeSuspend.toIntRange());
        canvas.drawPath(path, this.length);
        path.reset();
    }

    public void setMin(Canvas canvas) {
        List<LimitLine> isInside2 = this.IsOverlapping.isInside();
        if (isInside2 != null && isInside2.size() > 0) {
            float[] fArr = this.hashCode;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i = 0; i < isInside2.size(); i++) {
                LimitLine limitLine = isInside2.get(i);
                if (limitLine.create()) {
                    int save = canvas.save();
                    this.FastBitmap$CoordinateSystem.set(this.invokeSuspend.toDoubleRange());
                    this.FastBitmap$CoordinateSystem.inset(-limitLine.getMin, 0.0f);
                    canvas.clipRect(this.FastBitmap$CoordinateSystem);
                    fArr[0] = limitLine.setMin;
                    fArr[1] = 0.0f;
                    this.setMax.length(fArr);
                    float[] fArr2 = this.toString;
                    fArr2[0] = fArr[0];
                    fArr2[1] = this.invokeSuspend.toIntRange();
                    float[] fArr3 = this.toString;
                    fArr3[2] = fArr[0];
                    fArr3[3] = this.invokeSuspend.toFloatRange();
                    this.values.reset();
                    Path path = this.values;
                    float[] fArr4 = this.toString;
                    path.moveTo(fArr4[0], fArr4[1]);
                    Path path2 = this.values;
                    float[] fArr5 = this.toString;
                    path2.lineTo(fArr5[2], fArr5[3]);
                    this.equals.setStyle(Paint.Style.STROKE);
                    this.equals.setColor(limitLine.setMax);
                    this.equals.setStrokeWidth(limitLine.getMin);
                    this.equals.setPathEffect(limitLine.IsOverlapping);
                    canvas.drawPath(this.values, this.equals);
                    float Mean$Arithmetic = limitLine.Mean$Arithmetic() + 2.0f;
                    String str = limitLine.getMax;
                    if (str != null && !str.equals("")) {
                        this.equals.setStyle(limitLine.length);
                        this.equals.setPathEffect((PathEffect) null);
                        this.equals.setColor(limitLine.ICustomTabsCallback());
                        this.equals.setStrokeWidth(0.5f);
                        this.equals.setTextSize(limitLine.onNavigationEvent());
                        float invokeSuspend = limitLine.getMin + limitLine.invokeSuspend();
                        LimitLine.LimitLabelPosition limitLabelPosition = limitLine.toIntRange;
                        if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.equals.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, fArr[0] + invokeSuspend, this.invokeSuspend.toIntRange() + Mean$Arithmetic + ((float) getTargetFragment.setMax(this.equals, str)), this.equals);
                        } else if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.equals.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, fArr[0] + invokeSuspend, this.invokeSuspend.toFloatRange() - Mean$Arithmetic, this.equals);
                        } else if (limitLabelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            this.equals.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, fArr[0] - invokeSuspend, this.invokeSuspend.toIntRange() + Mean$Arithmetic + ((float) getTargetFragment.setMax(this.equals, str)), this.equals);
                        } else {
                            this.equals.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, fArr[0] - invokeSuspend, this.invokeSuspend.toFloatRange() - Mean$Arithmetic, this.equals);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
