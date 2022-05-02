package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.lang.ref.WeakReference;

public final class onCancel extends createFragmentContainer {
    protected Canvas FastBitmap$CoordinateSystem;
    private RectF Grayscale$Algorithm = new RectF();
    private Path ICustomTabsCallback = new Path();
    private RectF[] Mean$Arithmetic = {new RectF(), new RectF(), new RectF()};
    private RectF create = new RectF();
    public TextPaint getMax;
    protected PieChart getMin;
    protected Path hashCode = new Path();
    private StaticLayout invoke;
    public Paint isInside;
    protected Paint length;
    private Path onNavigationEvent = new Path();
    protected Paint setMax;
    protected Paint setMin;
    protected WeakReference<Bitmap> toDoubleRange;
    private CharSequence valueOf;
    protected RectF values = new RectF();

    public final void setMax() {
    }

    public onCancel(PieChart pieChart, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.getMin = pieChart;
        Paint paint = new Paint(1);
        this.setMax = paint;
        paint.setColor(-1);
        this.setMax.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.length = paint2;
        paint2.setColor(-1);
        this.length.setStyle(Paint.Style.FILL);
        this.length.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.getMax = textPaint;
        textPaint.setColor(-16777216);
        this.getMax.setTextSize(getTargetFragment.setMax(12.0f));
        this.toString.setTextSize(getTargetFragment.setMax(13.0f));
        this.toString.setColor(-1);
        this.toString.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.isInside = paint3;
        paint3.setColor(-1);
        this.isInside.setTextAlign(Paint.Align.CENTER);
        this.isInside.setTextSize(getTargetFragment.setMax(13.0f));
        Paint paint4 = new Paint(1);
        this.setMin = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public final Paint getMax() {
        return this.setMax;
    }

    public final Paint getMin() {
        return this.length;
    }

    public final void getMax(Canvas canvas) {
        int invoke2 = (int) this.invokeSuspend.invoke();
        int Grayscale$Algorithm2 = (int) this.invokeSuspend.Grayscale$Algorithm();
        WeakReference<Bitmap> weakReference = this.toDoubleRange;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (!(bitmap != null && bitmap.getWidth() == invoke2 && bitmap.getHeight() == Grayscale$Algorithm2)) {
            if (invoke2 > 0 && Grayscale$Algorithm2 > 0) {
                bitmap = Bitmap.createBitmap(invoke2, Grayscale$Algorithm2, Bitmap.Config.ARGB_4444);
                this.toDoubleRange = new WeakReference<>(bitmap);
                this.FastBitmap$CoordinateSystem = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (getEmojiReplaceStrategy getemojireplacestrategy : ((getStatusBarBackgroundDrawable) this.getMin.getData()).toIntRange()) {
            if (getemojireplacestrategy.b() && getemojireplacestrategy.ICustomTabsCallback() > 0) {
                getMax(getemojireplacestrategy);
            }
        }
    }

    private static float getMax(setArguments setarguments, float f, float f2, float f3, float f4, float f5, float f6) {
        setArguments setarguments2 = setarguments;
        double d = (double) ((f5 + f6) * 0.017453292f);
        float cos = setarguments2.length + (((float) Math.cos(d)) * f);
        float sin = setarguments2.getMin + (((float) Math.sin(d)) * f);
        double d2 = (double) ((f5 + (f6 / 2.0f)) * 0.017453292f);
        float cos2 = setarguments2.length + (((float) Math.cos(d2)) * f);
        float sin2 = setarguments2.getMin + (((float) Math.sin(d2)) * f);
        double d3 = (double) f2;
        Double.isNaN(d3);
        double sqrt = (double) (f - ((float) ((Math.sqrt(Math.pow((double) (cos - f3), 2.0d) + Math.pow((double) (sin - f4), 2.0d)) / 2.0d) * Math.tan(((180.0d - d3) / 2.0d) * 0.017453292519943295d))));
        double sqrt2 = Math.sqrt(Math.pow((double) (cos2 - ((cos + f3) / 2.0f)), 2.0d) + Math.pow((double) (sin2 - ((sin + f4) / 2.0f)), 2.0d));
        Double.isNaN(sqrt);
        return (float) (sqrt - sqrt2);
    }

    private float setMin(getEmojiReplaceStrategy getemojireplacestrategy) {
        if (!getemojireplacestrategy.extraCallback()) {
            return getemojireplacestrategy.getMin();
        }
        if (getemojireplacestrategy.getMin() / this.invokeSuspend.valueOf() > (getemojireplacestrategy.onRelationshipValidationResult() / ((getStatusBarBackgroundDrawable) this.getMin.getData()).values()) * 2.0f) {
            return 0.0f;
        }
        return getemojireplacestrategy.getMin();
    }

    private void getMax(getEmojiReplaceStrategy getemojireplacestrategy) {
        float f;
        RectF rectF;
        float f2;
        int i;
        float[] fArr;
        int i2;
        float f3;
        RectF rectF2;
        float f4;
        int i3;
        int i4;
        float f5;
        float f6;
        RectF rectF3;
        float f7;
        int i5;
        RectF rectF4;
        int i6;
        float f8;
        float f9;
        getEmojiReplaceStrategy getemojireplacestrategy2 = getemojireplacestrategy;
        float rotationAngle = this.getMin.getRotationAngle();
        float min = this.equals.getMin();
        float length2 = this.equals.length();
        RectF circleBox = this.getMin.getCircleBox();
        int ICustomTabsCallback2 = getemojireplacestrategy.ICustomTabsCallback();
        float[] drawAngles = this.getMin.getDrawAngles();
        setArguments centerCircleBox = this.getMin.getCenterCircleBox();
        float radius = this.getMin.getRadius();
        boolean z = this.getMin.isDrawHoleEnabled() && !this.getMin.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (this.getMin.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.getMin.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF5 = new RectF();
        boolean z2 = z && this.getMin.isDrawRoundedSlicesEnabled();
        int i7 = 0;
        for (int i8 = 0; i8 < ICustomTabsCallback2; i8++) {
            if (Math.abs(((PieEntry) getemojireplacestrategy2.toIntRange(i8)).getMin()) > getTargetFragment.setMin) {
                i7++;
            }
        }
        if (i7 <= 1) {
            f = 0.0f;
        } else {
            f = setMin(getemojireplacestrategy);
        }
        int i9 = 0;
        float f10 = 0.0f;
        while (i9 < ICustomTabsCallback2) {
            float f11 = drawAngles[i9];
            if (Math.abs(getemojireplacestrategy2.toIntRange(i9).getMin()) > getTargetFragment.setMin && (!this.getMin.needsHighlight(i9) || z2)) {
                boolean z3 = f > 0.0f && f11 <= 180.0f;
                this.toFloatRange.setColor(getemojireplacestrategy2.setMax(i9));
                float f12 = i7 == 1 ? 0.0f : f / (radius * 0.017453292f);
                float f13 = rotationAngle + ((f10 + (f12 / 2.0f)) * length2);
                float f14 = (f11 - f12) * length2;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                this.onNavigationEvent.reset();
                if (z2) {
                    float f15 = radius - holeRadius2;
                    i2 = ICustomTabsCallback2;
                    fArr = drawAngles;
                    double d = (double) (f13 * 0.017453292f);
                    i = i9;
                    i4 = i7;
                    float cos = centerCircleBox.length + (((float) Math.cos(d)) * f15);
                    float sin = centerCircleBox.getMin + (f15 * ((float) Math.sin(d)));
                    rectF5.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                } else {
                    i2 = ICustomTabsCallback2;
                    fArr = drawAngles;
                    i = i9;
                    i4 = i7;
                }
                double d2 = (double) (f13 * 0.017453292f);
                float cos2 = centerCircleBox.length + (((float) Math.cos(d2)) * radius);
                float sin2 = (((float) Math.sin(d2)) * radius) + centerCircleBox.getMin;
                if (f14 < 360.0f || f14 % 360.0f > getTargetFragment.setMin) {
                    f2 = min;
                    if (z2) {
                        this.onNavigationEvent.arcTo(rectF5, f13 + 180.0f, -180.0f);
                    }
                    this.onNavigationEvent.arcTo(circleBox, f13, f14);
                } else {
                    f2 = min;
                    this.onNavigationEvent.addCircle(centerCircleBox.length, centerCircleBox.getMin, radius, Path.Direction.CW);
                }
                rectF = circleBox;
                this.create.set(centerCircleBox.length - holeRadius, centerCircleBox.getMin - holeRadius, centerCircleBox.length + holeRadius, centerCircleBox.getMin + holeRadius);
                if (!z) {
                    f6 = f14;
                    rectF3 = rectF5;
                    f4 = holeRadius;
                    f7 = radius;
                    i5 = i4;
                    f5 = 360.0f;
                } else if (holeRadius > 0.0f || z3) {
                    if (z3) {
                        f8 = f14;
                        int i10 = i;
                        i3 = i4;
                        rectF4 = rectF5;
                        float f16 = cos2;
                        f9 = holeRadius;
                        float f17 = sin2;
                        i6 = 1;
                        f3 = radius;
                        float max = getMax(centerCircleBox, radius, f11 * length2, f16, f17, f13, f8);
                        if (max < 0.0f) {
                            max = -max;
                        }
                        holeRadius = Math.max(f9, max);
                    } else {
                        f8 = f14;
                        rectF4 = rectF5;
                        f9 = holeRadius;
                        f3 = radius;
                        i3 = i4;
                        i6 = 1;
                    }
                    float f18 = (i3 == i6 || holeRadius == 0.0f) ? 0.0f : f / (holeRadius * 0.017453292f);
                    float f19 = ((f10 + (f18 / 2.0f)) * length2) + rotationAngle;
                    float f20 = (f11 - f18) * length2;
                    if (f20 < 0.0f) {
                        f20 = 0.0f;
                    }
                    float f21 = f19 + f20;
                    if (f8 < 360.0f || f8 % 360.0f > getTargetFragment.setMin) {
                        if (z2) {
                            float f22 = f3 - holeRadius2;
                            double d3 = (double) (f21 * 0.017453292f);
                            float cos3 = centerCircleBox.length + (((float) Math.cos(d3)) * f22);
                            float sin3 = centerCircleBox.getMin + (f22 * ((float) Math.sin(d3)));
                            rectF4.set(cos3 - holeRadius2, sin3 - holeRadius2, cos3 + holeRadius2, sin3 + holeRadius2);
                            this.onNavigationEvent.arcTo(rectF4, f21, 180.0f);
                            rectF2 = rectF4;
                        } else {
                            double d4 = (double) (f21 * 0.017453292f);
                            rectF2 = rectF4;
                            this.onNavigationEvent.lineTo(centerCircleBox.length + (((float) Math.cos(d4)) * holeRadius), centerCircleBox.getMin + (holeRadius * ((float) Math.sin(d4))));
                        }
                        this.onNavigationEvent.arcTo(this.create, f21, -f20);
                        f4 = f9;
                        this.onNavigationEvent.close();
                        this.FastBitmap$CoordinateSystem.drawPath(this.onNavigationEvent, this.toFloatRange);
                        f10 += f11 * f2;
                    } else {
                        this.onNavigationEvent.addCircle(centerCircleBox.length, centerCircleBox.getMin, holeRadius, Path.Direction.CCW);
                        rectF2 = rectF4;
                        f4 = f9;
                        this.onNavigationEvent.close();
                        this.FastBitmap$CoordinateSystem.drawPath(this.onNavigationEvent, this.toFloatRange);
                        f10 += f11 * f2;
                    }
                } else {
                    f6 = f14;
                    rectF3 = rectF5;
                    f4 = holeRadius;
                    f7 = radius;
                    i5 = i4;
                    f5 = 360.0f;
                }
                if (f6 % f5 > getTargetFragment.setMin) {
                    if (z3) {
                        float max2 = getMax(centerCircleBox, f3, f11 * length2, cos2, sin2, f13, f6);
                        double d5 = (double) ((f13 + (f6 / 2.0f)) * 0.017453292f);
                        this.onNavigationEvent.lineTo(centerCircleBox.length + (((float) Math.cos(d5)) * max2), centerCircleBox.getMin + (max2 * ((float) Math.sin(d5))));
                    } else {
                        this.onNavigationEvent.lineTo(centerCircleBox.length, centerCircleBox.getMin);
                    }
                }
                this.onNavigationEvent.close();
                this.FastBitmap$CoordinateSystem.drawPath(this.onNavigationEvent, this.toFloatRange);
                f10 += f11 * f2;
            } else {
                f10 += f11 * min;
                f2 = min;
                rectF = circleBox;
                i2 = ICustomTabsCallback2;
                fArr = drawAngles;
                i = i9;
                i3 = i7;
                rectF2 = rectF5;
                f4 = holeRadius;
                f3 = radius;
            }
            i9 = i + 1;
            getemojireplacestrategy2 = getemojireplacestrategy;
            i7 = i3;
            holeRadius = f4;
            rectF5 = rectF2;
            radius = f3;
            ICustomTabsCallback2 = i2;
            drawAngles = fArr;
            min = f2;
            circleBox = rectF;
        }
        setArguments.setMin(centerCircleBox);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(android.graphics.Canvas r54) {
        /*
            r53 = this;
            r0 = r53
            r7 = r54
            com.github.mikephil.charting.charts.PieChart r1 = r0.getMin
            o.setArguments r8 = r1.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r1 = r0.getMin
            float r9 = r1.getRadius()
            com.github.mikephil.charting.charts.PieChart r1 = r0.getMin
            float r1 = r1.getRotationAngle()
            com.github.mikephil.charting.charts.PieChart r2 = r0.getMin
            float[] r10 = r2.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r2 = r0.getMin
            float[] r11 = r2.getAbsoluteAngles()
            o.setDrawerShadow r2 = r0.equals
            float r12 = r2.getMin()
            o.setDrawerShadow r2 = r0.equals
            float r13 = r2.length()
            com.github.mikephil.charting.charts.PieChart r2 = r0.getMin
            float r2 = r2.getHoleRadius()
            float r2 = r2 * r9
            r14 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r14
            float r2 = r9 - r2
            r15 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r15
            com.github.mikephil.charting.charts.PieChart r3 = r0.getMin
            float r3 = r3.getHoleRadius()
            float r16 = r3 / r14
            r3 = 1092616192(0x41200000, float:10.0)
            float r3 = r9 / r3
            r4 = 1080452710(0x40666666, float:3.6)
            float r3 = r3 * r4
            com.github.mikephil.charting.charts.PieChart r4 = r0.getMin
            boolean r4 = r4.isDrawHoleEnabled()
            if (r4 == 0) goto L_0x0086
            float r3 = r9 * r16
            float r3 = r9 - r3
            float r3 = r3 / r15
            com.github.mikephil.charting.charts.PieChart r4 = r0.getMin
            boolean r4 = r4.isDrawSlicesUnderHoleEnabled()
            if (r4 != 0) goto L_0x0086
            com.github.mikephil.charting.charts.PieChart r4 = r0.getMin
            boolean r4 = r4.isDrawRoundedSlicesEnabled()
            if (r4 == 0) goto L_0x0086
            double r4 = (double) r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 * r1
            double r1 = (double) r2
            r17 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r14 = (double) r9
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r17
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r14
            java.lang.Double.isNaN(r4)
            double r4 = r4 + r1
            float r1 = (float) r4
        L_0x0086:
            r14 = r1
            float r15 = r9 - r3
            com.github.mikephil.charting.charts.PieChart r1 = r0.getMin
            o.checkDrawerViewAbsoluteGravity r1 = r1.getData()
            r17 = r1
            o.getStatusBarBackgroundDrawable r17 = (o.getStatusBarBackgroundDrawable) r17
            java.util.List r6 = r17.toIntRange()
            float r18 = r17.values()
            com.github.mikephil.charting.charts.PieChart r1 = r0.getMin
            boolean r21 = r1.isDrawEntryLabelsEnabled()
            r54.save()
            r1 = 1084227584(0x40a00000, float:5.0)
            float r22 = o.getTargetFragment.setMax(r1)
            r23 = 0
            r1 = 0
            r5 = 0
        L_0x00ae:
            int r2 = r6.size()
            if (r5 >= r2) goto L_0x0435
            java.lang.Object r2 = r6.get(r5)
            r4 = r2
            o.getEmojiReplaceStrategy r4 = (o.getEmojiReplaceStrategy) r4
            boolean r24 = r4.Mean$Arithmetic()
            if (r24 != 0) goto L_0x00de
            if (r21 == 0) goto L_0x00c4
            goto L_0x00de
        L_0x00c4:
            r26 = r5
            r28 = r6
            r44 = r9
            r34 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r40 = r14
            r35 = r15
            r11 = 1073741824(0x40000000, float:2.0)
            r19 = 1120403456(0x42c80000, float:100.0)
            r9 = r7
            r10 = r8
            goto L_0x041f
        L_0x00de:
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r3 = r4.onTransact()
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r2 = r4.ICustomTabsCallback$Default()
            r0.length((o.EmojiAppCompatTextView) r4)
            r25 = r1
            android.graphics.Paint r1 = r0.toString
            r26 = r5
            java.lang.String r5 = "Q"
            int r1 = o.getTargetFragment.setMax((android.graphics.Paint) r1, (java.lang.String) r5)
            float r1 = (float) r1
            r5 = 1082130432(0x40800000, float:4.0)
            float r5 = o.getTargetFragment.setMax(r5)
            float r27 = r1 + r5
            o.closeDrawers r5 = r4.toFloatRange()
            int r1 = r4.ICustomTabsCallback()
            r28 = r6
            android.graphics.Paint r6 = r0.setMin
            int r7 = r4.asInterface()
            r6.setColor(r7)
            android.graphics.Paint r6 = r0.setMin
            float r7 = r4.ICustomTabsCallback$Stub$Proxy()
            float r7 = o.getTargetFragment.setMax(r7)
            r6.setStrokeWidth(r7)
            float r7 = r0.setMin((o.getEmojiReplaceStrategy) r4)
            o.setArguments r6 = r4.onNavigationEvent()
            o.setArguments r6 = o.setArguments.setMax(r6)
            r29 = r8
            float r8 = r6.length
            float r8 = o.getTargetFragment.setMax(r8)
            r6.length = r8
            float r8 = r6.getMin
            float r8 = o.getTargetFragment.setMax(r8)
            r6.getMin = r8
            r8 = 0
        L_0x013d:
            if (r8 >= r1) goto L_0x0403
            com.github.mikephil.charting.data.Entry r30 = r4.toIntRange(r8)
            r31 = r6
            r6 = r30
            com.github.mikephil.charting.data.PieEntry r6 = (com.github.mikephil.charting.data.PieEntry) r6
            if (r25 != 0) goto L_0x014e
            r30 = 0
            goto L_0x0154
        L_0x014e:
            int r30 = r25 + -1
            r30 = r11[r30]
            float r30 = r30 * r12
        L_0x0154:
            r32 = r10[r25]
            r33 = 1016003125(0x3c8efa35, float:0.017453292)
            float r34 = r15 * r33
            float r34 = r7 / r34
            r20 = 1073741824(0x40000000, float:2.0)
            float r34 = r34 / r20
            float r32 = r32 - r34
            float r32 = r32 / r20
            float r30 = r30 + r32
            float r30 = r30 * r13
            r32 = r1
            float r1 = r14 + r30
            r30 = r7
            com.github.mikephil.charting.charts.PieChart r7 = r0.getMin
            boolean r7 = r7.isUsePercentValuesEnabled()
            if (r7 == 0) goto L_0x0182
            float r7 = r6.getMin()
            float r7 = r7 / r18
            r19 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r19
            goto L_0x0186
        L_0x0182:
            float r7 = r6.getMin()
        L_0x0186:
            java.lang.String r7 = r5.getMin(r7)
            r34 = r10
            java.lang.String r10 = r6.getMin
            r35 = r5
            float r5 = r1 * r33
            r33 = r6
            double r5 = (double) r5
            r36 = r11
            r37 = r12
            double r11 = java.lang.Math.cos(r5)
            float r11 = (float) r11
            r38 = r13
            double r12 = java.lang.Math.sin(r5)
            float r12 = (float) r12
            if (r21 == 0) goto L_0x01ad
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r13 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r3 != r13) goto L_0x01ad
            r13 = 1
            goto L_0x01ae
        L_0x01ad:
            r13 = 0
        L_0x01ae:
            r40 = r14
            if (r24 == 0) goto L_0x01b8
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r14 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r2 != r14) goto L_0x01b8
            r14 = 1
            goto L_0x01b9
        L_0x01b8:
            r14 = 0
        L_0x01b9:
            r41 = r10
            if (r21 == 0) goto L_0x01c3
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r10 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r3 != r10) goto L_0x01c3
            r10 = 1
            goto L_0x01c4
        L_0x01c3:
            r10 = 0
        L_0x01c4:
            r42 = r3
            if (r24 == 0) goto L_0x01cf
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r3 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r2 != r3) goto L_0x01cf
            r39 = 1
            goto L_0x01d1
        L_0x01cf:
            r39 = 0
        L_0x01d1:
            if (r13 != 0) goto L_0x01f3
            if (r14 == 0) goto L_0x01d6
            goto L_0x01f3
        L_0x01d6:
            r45 = r2
            r44 = r9
            r47 = r10
            r46 = r11
            r50 = r29
            r51 = r31
            r52 = r33
            r48 = r35
            r2 = r41
            r19 = 1120403456(0x42c80000, float:100.0)
            r9 = r54
            r29 = r12
            r35 = r15
            r15 = r4
            goto L_0x0338
        L_0x01f3:
            float r3 = r4.getDefaultImpl()
            float r43 = r4.ICustomTabsService()
            float r44 = r4.setDefaultImpl()
            r19 = 1120403456(0x42c80000, float:100.0)
            float r44 = r44 / r19
            r45 = r2
            com.github.mikephil.charting.charts.PieChart r2 = r0.getMin
            boolean r2 = r2.isDrawHoleEnabled()
            if (r2 == 0) goto L_0x0216
            float r2 = r9 * r16
            float r46 = r9 - r2
            float r46 = r46 * r44
            float r46 = r46 + r2
            goto L_0x0218
        L_0x0216:
            float r46 = r9 * r44
        L_0x0218:
            boolean r2 = r4.getInterfaceDescriptor()
            if (r2 == 0) goto L_0x022c
            float r43 = r43 * r15
            double r5 = java.lang.Math.sin(r5)
            float r2 = (float) r5
            float r2 = java.lang.Math.abs(r2)
            float r43 = r43 * r2
            goto L_0x022e
        L_0x022c:
            float r43 = r43 * r15
        L_0x022e:
            float r2 = r46 * r11
            r6 = r29
            float r5 = r6.length
            float r2 = r2 + r5
            float r46 = r46 * r12
            float r5 = r6.getMin
            float r5 = r46 + r5
            r29 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r29
            float r3 = r3 * r15
            float r29 = r3 * r11
            r44 = r9
            float r9 = r6.length
            float r9 = r29 + r9
            float r3 = r3 * r12
            r29 = r12
            float r12 = r6.getMin
            float r12 = r12 + r3
            r47 = r10
            r46 = r11
            double r10 = (double) r1
            r48 = 4645040803167600640(0x4076800000000000, double:360.0)
            java.lang.Double.isNaN(r10)
            double r10 = r10 % r48
            r48 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r1 = (r10 > r48 ? 1 : (r10 == r48 ? 0 : -1))
            if (r1 < 0) goto L_0x0288
            r48 = 4643457506423603200(0x4070e00000000000, double:270.0)
            int r1 = (r10 > r48 ? 1 : (r10 == r48 ? 0 : -1))
            if (r1 > 0) goto L_0x0288
            float r1 = r9 - r43
            android.graphics.Paint r3 = r0.toString
            android.graphics.Paint$Align r10 = android.graphics.Paint.Align.RIGHT
            r3.setTextAlign(r10)
            if (r13 == 0) goto L_0x0283
            android.graphics.Paint r3 = r0.isInside
            android.graphics.Paint$Align r10 = android.graphics.Paint.Align.RIGHT
            r3.setTextAlign(r10)
        L_0x0283:
            float r3 = r1 - r22
            r43 = r1
            goto L_0x029c
        L_0x0288:
            float r43 = r9 + r43
            android.graphics.Paint r1 = r0.toString
            android.graphics.Paint$Align r3 = android.graphics.Paint.Align.LEFT
            r1.setTextAlign(r3)
            if (r13 == 0) goto L_0x029a
            android.graphics.Paint r1 = r0.isInside
            android.graphics.Paint$Align r3 = android.graphics.Paint.Align.LEFT
            r1.setTextAlign(r3)
        L_0x029a:
            float r3 = r43 + r22
        L_0x029c:
            r10 = r3
            int r1 = r4.asInterface()
            r3 = 1122867(0x112233, float:1.573472E-39)
            if (r1 == r3) goto L_0x02d6
            boolean r1 = r4.asBinder()
            if (r1 == 0) goto L_0x02b5
            android.graphics.Paint r1 = r0.setMin
            int r3 = r4.setMax((int) r8)
            r1.setColor(r3)
        L_0x02b5:
            android.graphics.Paint r11 = r0.setMin
            r1 = r54
            r3 = r5
            r5 = r4
            r4 = r9
            r48 = r35
            r35 = r15
            r15 = r5
            r5 = r12
            r50 = r6
            r51 = r31
            r52 = r33
            r6 = r11
            r1.drawLine(r2, r3, r4, r5, r6)
            android.graphics.Paint r6 = r0.setMin
            r2 = r9
            r3 = r12
            r4 = r43
            r1.drawLine(r2, r3, r4, r5, r6)
            goto L_0x02e1
        L_0x02d6:
            r50 = r6
            r51 = r31
            r52 = r33
            r48 = r35
            r35 = r15
            r15 = r4
        L_0x02e1:
            if (r13 == 0) goto L_0x030a
            if (r14 == 0) goto L_0x030a
            int r1 = r15.getMin((int) r8)
            android.graphics.Paint r2 = r0.toString
            r2.setColor(r1)
            android.graphics.Paint r1 = r0.toString
            r9 = r54
            r9.drawText(r7, r10, r12, r1)
            int r1 = r17.isInside()
            if (r8 >= r1) goto L_0x0307
            if (r41 == 0) goto L_0x0307
            float r12 = r12 + r27
            android.graphics.Paint r1 = r0.isInside
            r2 = r41
            r9.drawText(r2, r10, r12, r1)
            goto L_0x0338
        L_0x0307:
            r2 = r41
            goto L_0x0338
        L_0x030a:
            r9 = r54
            r2 = r41
            if (r13 == 0) goto L_0x0323
            int r1 = r17.isInside()
            if (r8 >= r1) goto L_0x0338
            if (r2 == 0) goto L_0x0338
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r27 / r1
            float r12 = r12 + r3
            android.graphics.Paint r3 = r0.isInside
            r9.drawText(r2, r10, r12, r3)
            goto L_0x0338
        L_0x0323:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r14 == 0) goto L_0x0338
            float r3 = r27 / r1
            float r12 = r12 + r3
            int r1 = r15.getMin((int) r8)
            android.graphics.Paint r3 = r0.toString
            r3.setColor(r1)
            android.graphics.Paint r1 = r0.toString
            r9.drawText(r7, r10, r12, r1)
        L_0x0338:
            if (r47 != 0) goto L_0x0344
            if (r39 == 0) goto L_0x033d
            goto L_0x0344
        L_0x033d:
            r10 = r50
        L_0x033f:
            r1 = r52
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x03a8
        L_0x0344:
            float r1 = r35 * r46
            r10 = r50
            float r3 = r10.length
            float r1 = r1 + r3
            float r3 = r35 * r29
            float r4 = r10.getMin
            float r3 = r3 + r4
            android.graphics.Paint r4 = r0.toString
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r5)
            if (r47 == 0) goto L_0x0379
            if (r39 == 0) goto L_0x0379
            int r4 = r15.getMin((int) r8)
            android.graphics.Paint r5 = r0.toString
            r5.setColor(r4)
            android.graphics.Paint r4 = r0.toString
            r9.drawText(r7, r1, r3, r4)
            int r4 = r17.isInside()
            if (r8 >= r4) goto L_0x033f
            if (r2 == 0) goto L_0x033f
            float r3 = r3 + r27
            android.graphics.Paint r4 = r0.isInside
            r9.drawText(r2, r1, r3, r4)
            goto L_0x033f
        L_0x0379:
            if (r47 == 0) goto L_0x0391
            int r4 = r17.isInside()
            if (r8 >= r4) goto L_0x038e
            if (r2 == 0) goto L_0x038e
            r11 = 1073741824(0x40000000, float:2.0)
            float r4 = r27 / r11
            float r3 = r3 + r4
            android.graphics.Paint r4 = r0.isInside
            r9.drawText(r2, r1, r3, r4)
            goto L_0x03a6
        L_0x038e:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x03a6
        L_0x0391:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r39 == 0) goto L_0x03a6
            float r2 = r27 / r11
            float r3 = r3 + r2
            int r2 = r15.getMin((int) r8)
            android.graphics.Paint r4 = r0.toString
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.toString
            r9.drawText(r7, r1, r3, r2)
        L_0x03a6:
            r1 = r52
        L_0x03a8:
            android.graphics.drawable.Drawable r2 = r1.equals
            if (r2 == 0) goto L_0x03df
            boolean r2 = r15.create()
            if (r2 == 0) goto L_0x03df
            android.graphics.drawable.Drawable r2 = r1.equals
            r7 = r51
            float r1 = r7.getMin
            float r1 = r35 + r1
            float r1 = r1 * r46
            float r3 = r10.length
            float r1 = r1 + r3
            float r3 = r7.getMin
            float r3 = r35 + r3
            float r3 = r3 * r29
            float r4 = r10.getMin
            float r3 = r3 + r4
            float r4 = r7.length
            float r3 = r3 + r4
            int r4 = (int) r1
            int r5 = (int) r3
            int r6 = r2.getIntrinsicWidth()
            int r12 = r2.getIntrinsicHeight()
            r1 = r54
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            o.getTargetFragment.setMax(r1, r2, r3, r4, r5, r6)
            goto L_0x03e1
        L_0x03df:
            r7 = r51
        L_0x03e1:
            int r25 = r25 + 1
            int r8 = r8 + 1
            r6 = r7
            r29 = r10
            r4 = r15
            r7 = r30
            r1 = r32
            r10 = r34
            r15 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r40
            r3 = r42
            r9 = r44
            r2 = r45
            r5 = r48
            goto L_0x013d
        L_0x0403:
            r7 = r6
            r44 = r9
            r34 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r40 = r14
            r35 = r15
            r10 = r29
            r11 = 1073741824(0x40000000, float:2.0)
            r19 = 1120403456(0x42c80000, float:100.0)
            r9 = r54
            o.setArguments.setMin(r7)
            r1 = r25
        L_0x041f:
            int r5 = r26 + 1
            r7 = r9
            r8 = r10
            r6 = r28
            r10 = r34
            r15 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r40
            r9 = r44
            goto L_0x00ae
        L_0x0435:
            r9 = r7
            r10 = r8
            o.setArguments.setMin(r10)
            r54.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCancel.setMax(android.graphics.Canvas):void");
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        float f;
        float f2;
        boolean z;
        int i;
        float[] fArr;
        float[] fArr2;
        float f3;
        RectF rectF;
        float f4;
        getEmojiReplaceStrategy max;
        float f5;
        float f6;
        int i2;
        int i3;
        float f7;
        int i4;
        float f8;
        float f9;
        float f10;
        addFocusables[] addfocusablesArr2 = addfocusablesArr;
        boolean z2 = this.getMin.isDrawHoleEnabled() && !this.getMin.isDrawSlicesUnderHoleEnabled();
        if (!z2 || !this.getMin.isDrawRoundedSlicesEnabled()) {
            float min = this.equals.getMin();
            float length2 = this.equals.length();
            float rotationAngle = this.getMin.getRotationAngle();
            float[] drawAngles = this.getMin.getDrawAngles();
            float[] absoluteAngles = this.getMin.getAbsoluteAngles();
            setArguments centerCircleBox = this.getMin.getCenterCircleBox();
            float radius = this.getMin.getRadius();
            float holeRadius = z2 ? (this.getMin.getHoleRadius() / 100.0f) * radius : 0.0f;
            RectF rectF2 = this.values;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i5 = 0;
            while (i5 < addfocusablesArr2.length) {
                int i6 = (int) addfocusablesArr2[i5].setMax;
                if (i6 >= drawAngles.length || (max = ((getStatusBarBackgroundDrawable) this.getMin.getData()).getMax(addfocusablesArr2[i5].equals)) == null || !max.toIntRange()) {
                    z = z2;
                    f3 = min;
                    f2 = length2;
                    f = rotationAngle;
                    fArr2 = drawAngles;
                    fArr = absoluteAngles;
                    i = i5;
                    rectF = rectF2;
                    f4 = holeRadius;
                } else {
                    int ICustomTabsCallback2 = max.ICustomTabsCallback();
                    int i7 = 0;
                    for (int i8 = 0; i8 < ICustomTabsCallback2; i8++) {
                        if (Math.abs(((PieEntry) max.toIntRange(i8)).getMin()) > getTargetFragment.setMin) {
                            i7++;
                        }
                    }
                    if (i6 == 0) {
                        f5 = 0.0f;
                    } else {
                        f5 = absoluteAngles[i6 - 1] * min;
                    }
                    if (i7 <= 1) {
                        f6 = 0.0f;
                    } else {
                        f6 = max.getMin();
                    }
                    float f11 = drawAngles[i6];
                    float ICustomTabsCallback$Stub = max.ICustomTabsCallback$Stub();
                    f3 = min;
                    float f12 = radius + ICustomTabsCallback$Stub;
                    fArr2 = drawAngles;
                    rectF2.set(this.getMin.getCircleBox());
                    float f13 = -ICustomTabsCallback$Stub;
                    rectF2.inset(f13, f13);
                    boolean z3 = f6 > 0.0f && f11 <= 180.0f;
                    this.toFloatRange.setColor(max.setMax(i6));
                    float f14 = i7 == 1 ? 0.0f : f6 / (radius * 0.017453292f);
                    float f15 = i7 == 1 ? 0.0f : f6 / (f12 * 0.017453292f);
                    float f16 = rotationAngle + ((f5 + (f14 / 2.0f)) * length2);
                    float f17 = (f11 - f14) * length2;
                    float f18 = f17 < 0.0f ? 0.0f : f17;
                    float f19 = (((f15 / 2.0f) + f5) * length2) + rotationAngle;
                    float f20 = (f11 - f15) * length2;
                    if (f20 < 0.0f) {
                        f20 = 0.0f;
                    }
                    this.onNavigationEvent.reset();
                    if (f18 < 360.0f || f18 % 360.0f > getTargetFragment.setMin) {
                        fArr = absoluteAngles;
                        i3 = i5;
                        i2 = i7;
                        z = z2;
                        double d = (double) (f19 * 0.017453292f);
                        f2 = length2;
                        f = rotationAngle;
                        this.onNavigationEvent.moveTo(centerCircleBox.length + (((float) Math.cos(d)) * f12), centerCircleBox.getMin + (f12 * ((float) Math.sin(d))));
                        this.onNavigationEvent.arcTo(rectF2, f19, f20);
                    } else {
                        fArr = absoluteAngles;
                        this.onNavigationEvent.addCircle(centerCircleBox.length, centerCircleBox.getMin, f12, Path.Direction.CW);
                        i2 = i7;
                        z = z2;
                        f2 = length2;
                        f = rotationAngle;
                        i3 = i5;
                    }
                    if (z3) {
                        double d2 = (double) (f16 * 0.017453292f);
                        float cos = centerCircleBox.length + (((float) Math.cos(d2)) * radius);
                        float sin = centerCircleBox.getMin + (((float) Math.sin(d2)) * radius);
                        i4 = i3;
                        rectF = rectF2;
                        f4 = holeRadius;
                        float f21 = cos;
                        f8 = 0.0f;
                        f7 = getMax(centerCircleBox, radius, f11 * f2, f21, sin, f16, f18);
                    } else {
                        rectF = rectF2;
                        f4 = holeRadius;
                        i4 = i3;
                        f8 = 0.0f;
                        f7 = 0.0f;
                    }
                    this.create.set(centerCircleBox.length - f4, centerCircleBox.getMin - f4, centerCircleBox.length + f4, centerCircleBox.getMin + f4);
                    if (!z) {
                        i = i4;
                        f9 = 360.0f;
                    } else if (f4 > f8 || z3) {
                        if (z3) {
                            if (f7 < f8) {
                                f7 = -f7;
                            }
                            f10 = Math.max(f4, f7);
                        } else {
                            f10 = f4;
                        }
                        float f22 = (i2 == 1 || f10 == f8) ? 0.0f : f6 / (f10 * 0.017453292f);
                        float f23 = f + ((f5 + (f22 / 2.0f)) * f2);
                        float f24 = (f11 - f22) * f2;
                        if (f24 < f8) {
                            f24 = 0.0f;
                        }
                        float f25 = f23 + f24;
                        if (f18 < 360.0f || f18 % 360.0f > getTargetFragment.setMin) {
                            double d3 = (double) (0.017453292f * f25);
                            i = i4;
                            this.onNavigationEvent.lineTo(centerCircleBox.length + (((float) Math.cos(d3)) * f10), centerCircleBox.getMin + (f10 * ((float) Math.sin(d3))));
                            this.onNavigationEvent.arcTo(this.create, f25, -f24);
                        } else {
                            this.onNavigationEvent.addCircle(centerCircleBox.length, centerCircleBox.getMin, f10, Path.Direction.CCW);
                            i = i4;
                        }
                        this.onNavigationEvent.close();
                        this.FastBitmap$CoordinateSystem.drawPath(this.onNavigationEvent, this.toFloatRange);
                    } else {
                        i = i4;
                        f9 = 360.0f;
                    }
                    if (f18 % f9 > getTargetFragment.setMin) {
                        if (z3) {
                            double d4 = (double) (0.017453292f * (f16 + (f18 / 2.0f)));
                            this.onNavigationEvent.lineTo(centerCircleBox.length + (((float) Math.cos(d4)) * f7), centerCircleBox.getMin + (f7 * ((float) Math.sin(d4))));
                        } else {
                            this.onNavigationEvent.lineTo(centerCircleBox.length, centerCircleBox.getMin);
                        }
                    }
                    this.onNavigationEvent.close();
                    this.FastBitmap$CoordinateSystem.drawPath(this.onNavigationEvent, this.toFloatRange);
                }
                i5 = i + 1;
                holeRadius = f4;
                rectF2 = rectF;
                min = f3;
                drawAngles = fArr2;
                absoluteAngles = fArr;
                z2 = z;
                length2 = f2;
                rotationAngle = f;
                addfocusablesArr2 = addfocusablesArr;
            }
            setArguments.setMin(centerCircleBox);
        }
    }

    public final void length() {
        Canvas canvas = this.FastBitmap$CoordinateSystem;
        if (canvas != null) {
            canvas.setBitmap((Bitmap) null);
            this.FastBitmap$CoordinateSystem = null;
        }
        WeakReference<Bitmap> weakReference = this.toDoubleRange;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.toDoubleRange.clear();
            this.toDoubleRange = null;
        }
    }

    public final void setMin(Canvas canvas) {
        float f;
        RectF rectF;
        Canvas canvas2 = canvas;
        if (this.getMin.isDrawHoleEnabled() && this.FastBitmap$CoordinateSystem != null) {
            float radius = this.getMin.getRadius();
            float holeRadius = (this.getMin.getHoleRadius() / 100.0f) * radius;
            setArguments centerCircleBox = this.getMin.getCenterCircleBox();
            if (Color.alpha(this.setMax.getColor()) > 0) {
                this.FastBitmap$CoordinateSystem.drawCircle(centerCircleBox.length, centerCircleBox.getMin, holeRadius, this.setMax);
            }
            if (Color.alpha(this.length.getColor()) > 0 && this.getMin.getTransparentCircleRadius() > this.getMin.getHoleRadius()) {
                int alpha = this.length.getAlpha();
                float transparentCircleRadius = radius * (this.getMin.getTransparentCircleRadius() / 100.0f);
                this.length.setAlpha((int) (((float) alpha) * this.equals.getMin() * this.equals.length()));
                this.ICustomTabsCallback.reset();
                this.ICustomTabsCallback.addCircle(centerCircleBox.length, centerCircleBox.getMin, transparentCircleRadius, Path.Direction.CW);
                this.ICustomTabsCallback.addCircle(centerCircleBox.length, centerCircleBox.getMin, holeRadius, Path.Direction.CCW);
                this.FastBitmap$CoordinateSystem.drawPath(this.ICustomTabsCallback, this.length);
                this.length.setAlpha(alpha);
            }
            setArguments.setMin(centerCircleBox);
        }
        canvas2.drawBitmap(this.toDoubleRange.get(), 0.0f, 0.0f, (Paint) null);
        CharSequence centerText = this.getMin.getCenterText();
        if (this.getMin.isDrawCenterTextEnabled() && centerText != null) {
            setArguments centerCircleBox2 = this.getMin.getCenterCircleBox();
            setArguments centerTextOffset = this.getMin.getCenterTextOffset();
            float f2 = centerCircleBox2.length + centerTextOffset.length;
            float f3 = centerCircleBox2.getMin + centerTextOffset.getMin;
            if (!this.getMin.isDrawHoleEnabled() || this.getMin.isDrawSlicesUnderHoleEnabled()) {
                f = this.getMin.getRadius();
            } else {
                f = this.getMin.getRadius() * (this.getMin.getHoleRadius() / 100.0f);
            }
            RectF rectF2 = this.Mean$Arithmetic[0];
            rectF2.left = f2 - f;
            rectF2.top = f3 - f;
            rectF2.right = f2 + f;
            rectF2.bottom = f3 + f;
            RectF rectF3 = this.Mean$Arithmetic[1];
            rectF3.set(rectF2);
            float centerTextRadiusPercent = this.getMin.getCenterTextRadiusPercent() / 100.0f;
            if (((double) centerTextRadiusPercent) > 0.0d) {
                rectF3.inset((rectF3.width() - (rectF3.width() * centerTextRadiusPercent)) / 2.0f, (rectF3.height() - (rectF3.height() * centerTextRadiusPercent)) / 2.0f);
            }
            if (!centerText.equals(this.valueOf) || !rectF3.equals(this.Grayscale$Algorithm)) {
                this.Grayscale$Algorithm.set(rectF3);
                this.valueOf = centerText;
                StaticLayout staticLayout = r4;
                rectF = rectF3;
                StaticLayout staticLayout2 = new StaticLayout(centerText, 0, centerText.length(), this.getMax, (int) Math.max(Math.ceil((double) this.Grayscale$Algorithm.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.invoke = staticLayout;
            } else {
                rectF = rectF3;
            }
            float height = (float) this.invoke.getHeight();
            canvas.save();
            if (Build.VERSION.SDK_INT >= 18) {
                Path path = this.hashCode;
                path.reset();
                path.addOval(rectF2, Path.Direction.CW);
                canvas2.clipPath(path);
            }
            canvas2.translate(rectF.left, rectF.top + ((rectF.height() - height) / 2.0f));
            this.invoke.draw(canvas2);
            canvas.restore();
            setArguments.setMin(centerCircleBox2);
            setArguments.setMin(centerTextOffset);
        }
    }
}
