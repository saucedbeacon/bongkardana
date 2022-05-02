package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.data.Entry;
import o.EmojiAppCompatTextView;
import o.checkDrawerViewAbsoluteGravity;
import o.dismissInternal;
import o.getTargetFragment;
import o.setArguments;
import o.setScrimColor;

public abstract class PieRadarChartBase<T extends checkDrawerViewAbsoluteGravity<? extends EmojiAppCompatTextView<? extends Entry>>> extends Chart<T> {
    private float getMin = 270.0f;
    protected float mMinOffset = 0.0f;
    protected boolean mRotateEnabled = true;
    private float setMin = 270.0f;

    /* access modifiers changed from: protected */
    public void calcMinMax() {
    }

    public abstract int getIndexForAngle(float f);

    public abstract float getRadius();

    /* access modifiers changed from: protected */
    public abstract float getRequiredBaseOffset();

    /* access modifiers changed from: protected */
    public abstract float getRequiredLegendOffset();

    public float getYChartMax() {
        return 0.0f;
    }

    public float getYChartMin() {
        return 0.0f;
    }

    public PieRadarChartBase(Context context) {
        super(context);
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mChartTouchListener = new dismissInternal(this);
    }

    public int getMaxVisibleCount() {
        return this.mData.isInside();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mTouchEnabled || this.mChartTouchListener == null) {
            return super.onTouchEvent(motionEvent);
        }
        return this.mChartTouchListener.onTouch(this, motionEvent);
    }

    public void computeScroll() {
        if (this.mChartTouchListener instanceof dismissInternal) {
            ((dismissInternal) this.mChartTouchListener).length();
        }
    }

    public void notifyDataSetChanged() {
        if (this.mData != null) {
            calcMinMax();
            if (this.mLegend != null) {
                this.mLegendRenderer.getMax(this.mData);
            }
            calculateOffsets();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r2 != 2) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void calculateOffsets() {
        /*
            r11 = this;
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            r1 = 0
            if (r0 == 0) goto L_0x017d
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            boolean r0 = r0.create()
            if (r0 == 0) goto L_0x017d
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            boolean r0 = r0.setMax()
            if (r0 != 0) goto L_0x017d
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.Grayscale$Algorithm
            o.setTargetFragment r2 = r11.mViewPortHandler
            float r2 = r2.invoke()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.FastBitmap$CoordinateSystem
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass1.getMax
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendOrientation r3 = r3.length
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0082
            if (r2 == r3) goto L_0x003c
            goto L_0x0075
        L_0x003c:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.getMin
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            if (r0 == r2) goto L_0x004c
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.getMin
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM
            if (r0 != r2) goto L_0x0075
        L_0x004c:
            float r0 = r11.getRequiredLegendOffset()
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            float r2 = r2.invokeSuspend
            float r2 = r2 + r0
            o.setTargetFragment r0 = r11.mViewPortHandler
            float r0 = r0.Grayscale$Algorithm()
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            float r5 = r5.FastBitmap$CoordinateSystem
            float r0 = r0 * r5
            float r0 = java.lang.Math.min(r2, r0)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass1.setMin
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = r5.getMin
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L_0x007f
            if (r2 == r3) goto L_0x007a
        L_0x0075:
            r0 = 0
        L_0x0076:
            r2 = 0
        L_0x0077:
            r3 = 0
            goto L_0x0168
        L_0x007a:
            r3 = r0
            r0 = 0
            r2 = 0
            goto L_0x0168
        L_0x007f:
            r2 = r0
            r0 = 0
            goto L_0x0077
        L_0x0082:
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.getMax
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            if (r2 == r5) goto L_0x0096
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.getMax
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            if (r2 != r5) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r0 = 0
            goto L_0x0112
        L_0x0096:
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.getMin
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER
            if (r2 != r5) goto L_0x00a6
            r2 = 1095761920(0x41500000, float:13.0)
            float r2 = o.getTargetFragment.setMax(r2)
            float r0 = r0 + r2
            goto L_0x0112
        L_0x00a6:
            r2 = 1090519040(0x41000000, float:8.0)
            float r2 = o.getTargetFragment.setMax(r2)
            float r0 = r0 + r2
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            float r2 = r2.invokeSuspend
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            float r5 = r5.invoke
            float r2 = r2 + r5
            o.setArguments r5 = r11.getCenter()
            com.github.mikephil.charting.components.Legend r6 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r6 = r6.getMax
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r7 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r8 = 1097859072(0x41700000, float:15.0)
            if (r6 != r7) goto L_0x00cc
            int r6 = r11.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = r6 + r8
            goto L_0x00ce
        L_0x00cc:
            float r6 = r0 - r8
        L_0x00ce:
            float r2 = r2 + r8
            float r7 = r11.distanceToCenter(r6, r2)
            float r8 = r11.getRadius()
            float r6 = r11.getAngleForPoint(r6, r2)
            o.setArguments r6 = r11.getPosition(r5, r8, r6)
            float r8 = r6.length
            float r9 = r6.getMin
            float r8 = r11.distanceToCenter(r8, r9)
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = o.getTargetFragment.setMax(r9)
            float r10 = r5.getMin
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0103
            int r2 = r11.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r0
            int r10 = r11.getWidth()
            float r10 = (float) r10
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0103
            goto L_0x010c
        L_0x0103:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
            float r8 = r8 - r7
            float r9 = r9 + r8
            r0 = r9
            goto L_0x010c
        L_0x010b:
            r0 = 0
        L_0x010c:
            o.setArguments.setMin(r5)
            o.setArguments.setMin(r6)
        L_0x0112:
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass1.getMin
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = r5.getMax
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L_0x0165
            if (r2 == r3) goto L_0x0076
            r0 = 3
            if (r2 == r0) goto L_0x0126
            goto L_0x0136
        L_0x0126:
            int[] r0 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass1.setMin
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.getMin
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r4) goto L_0x014f
            if (r0 == r3) goto L_0x0139
        L_0x0136:
            r0 = 0
            goto L_0x007a
        L_0x0139:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.invokeSuspend
            o.setTargetFragment r2 = r11.mViewPortHandler
            float r2 = r2.Grayscale$Algorithm()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.FastBitmap$CoordinateSystem
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L_0x007a
        L_0x014f:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.invokeSuspend
            o.setTargetFragment r2 = r11.mViewPortHandler
            float r2 = r2.Grayscale$Algorithm()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.FastBitmap$CoordinateSystem
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L_0x007f
        L_0x0165:
            r1 = r0
            goto L_0x0075
        L_0x0168:
            float r4 = r11.getRequiredBaseOffset()
            float r1 = r1 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r0 = r0 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r2 = r2 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r3 = r3 + r4
            goto L_0x0180
        L_0x017d:
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x0180:
            float r4 = r11.mMinOffset
            float r4 = o.getTargetFragment.setMax(r4)
            boolean r5 = r11 instanceof com.github.mikephil.charting.charts.RadarChart
            if (r5 == 0) goto L_0x01a1
            com.github.mikephil.charting.components.XAxis r5 = r11.getXAxis()
            boolean r6 = r5.create()
            if (r6 == 0) goto L_0x01a1
            boolean r6 = r5.length()
            if (r6 == 0) goto L_0x01a1
            int r5 = r5.setDefaultImpl
            float r5 = (float) r5
            float r4 = java.lang.Math.max(r4, r5)
        L_0x01a1:
            float r5 = r11.getExtraTopOffset()
            float r2 = r2 + r5
            float r5 = r11.getExtraRightOffset()
            float r0 = r0 + r5
            float r5 = r11.getExtraBottomOffset()
            float r3 = r3 + r5
            float r5 = r11.getExtraLeftOffset()
            float r1 = r1 + r5
            float r1 = java.lang.Math.max(r4, r1)
            float r2 = java.lang.Math.max(r4, r2)
            float r0 = java.lang.Math.max(r4, r0)
            float r5 = r11.getRequiredBaseOffset()
            float r3 = java.lang.Math.max(r5, r3)
            float r3 = java.lang.Math.max(r4, r3)
            o.setTargetFragment r4 = r11.mViewPortHandler
            r4.getMin(r1, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.calculateOffsets():void");
    }

    /* renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMax;
        static final /* synthetic */ int[] getMin;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(2:13|14)|15|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                getMin = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = getMin     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = getMin     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                setMin = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = setMin     // Catch:{ NoSuchFieldError -> 0x005e }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass1.<clinit>():void");
        }
    }

    public float getAngleForPoint(float f, float f2) {
        setArguments centerOffsets = getCenterOffsets();
        double d = (double) (f - centerOffsets.length);
        double d2 = (double) (f2 - centerOffsets.getMin);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d2);
        double sqrt = Math.sqrt((d * d) + (d2 * d2));
        Double.isNaN(d2);
        float degrees = (float) Math.toDegrees(Math.acos(d2 / sqrt));
        if (f > centerOffsets.length) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        setArguments.setMin(centerOffsets);
        return f3;
    }

    public setArguments getPosition(setArguments setarguments, float f, float f2) {
        setArguments max = setArguments.getMax(0.0f, 0.0f);
        getPosition(setarguments, f, f2, max);
        return max;
    }

    public void getPosition(setArguments setarguments, float f, float f2, setArguments setarguments2) {
        double d = (double) setarguments.length;
        double d2 = (double) f;
        double d3 = (double) f2;
        double cos = Math.cos(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d);
        setarguments2.length = (float) (d + (cos * d2));
        double d4 = (double) setarguments.getMin;
        double sin = Math.sin(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d4);
        setarguments2.getMin = (float) (d4 + (d2 * sin));
    }

    public float distanceToCenter(float f, float f2) {
        float f3;
        float f4;
        setArguments centerOffsets = getCenterOffsets();
        if (f > centerOffsets.length) {
            f3 = f - centerOffsets.length;
        } else {
            f3 = centerOffsets.length - f;
        }
        if (f2 > centerOffsets.getMin) {
            f4 = f2 - centerOffsets.getMin;
        } else {
            f4 = centerOffsets.getMin - f2;
        }
        float sqrt = (float) Math.sqrt(Math.pow((double) f3, 2.0d) + Math.pow((double) f4, 2.0d));
        setArguments.setMin(centerOffsets);
        return sqrt;
    }

    public void setRotationAngle(float f) {
        this.setMin = f;
        this.getMin = getTargetFragment.getMin(f);
    }

    public float getRawRotationAngle() {
        return this.setMin;
    }

    public float getRotationAngle() {
        return this.getMin;
    }

    public void setRotationEnabled(boolean z) {
        this.mRotateEnabled = z;
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public float getDiameter() {
        RectF doubleRange = this.mViewPortHandler.toDoubleRange();
        doubleRange.left += getExtraLeftOffset();
        doubleRange.top += getExtraTopOffset();
        doubleRange.right -= getExtraRightOffset();
        doubleRange.bottom -= getExtraBottomOffset();
        return Math.min(doubleRange.width(), doubleRange.height());
    }

    @SuppressLint({"NewApi"})
    public void spin(int i, float f, float f2, setScrimColor.setMin setmin) {
        setRotationAngle(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotationAngle", new float[]{f, f2});
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(setmin);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PieRadarChartBase.this.postInvalidate();
            }
        });
        ofFloat.start();
    }
}
