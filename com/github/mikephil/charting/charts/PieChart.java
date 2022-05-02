package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieEntry;
import java.util.List;
import o.addFocusables;
import o.getEmojiReplaceStrategy;
import o.getStatusBarBackgroundDrawable;
import o.getTargetFragment;
import o.includeChildForAccessibility;
import o.onCancel;
import o.setArguments;

public class PieChart extends PieRadarChartBase<getStatusBarBackgroundDrawable> {
    private float FastBitmap$CoordinateSystem = 0.0f;
    private boolean IsOverlapping = false;
    private setArguments equals = setArguments.getMax(0.0f, 0.0f);
    private boolean getMax = true;
    private float[] getMin = new float[1];
    private boolean isInside = false;
    private float[] length = new float[1];
    protected float mMaxAngle = 360.0f;
    protected float mTransparentCircleRadiusPercent = 55.0f;
    private RectF setMax = new RectF();
    private boolean setMin = true;
    private float toDoubleRange = 50.0f;
    private CharSequence toFloatRange = "";
    private boolean toIntRange = false;
    private float toString = 100.0f;
    private boolean values = true;

    /* access modifiers changed from: protected */
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    public PieChart(Context context) {
        super(context);
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mRenderer = new onCancel(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new includeChildForAccessibility(this);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData != null) {
            this.mRenderer.getMax(canvas);
            if (valuesToHighlight()) {
                this.mRenderer.setMax(canvas, this.mIndicesToHighlight);
            }
            this.mRenderer.setMin(canvas);
            this.mRenderer.setMax(canvas);
            this.mLegendRenderer.setMax(canvas);
            drawDescription(canvas);
            drawMarkers(canvas);
        }
    }

    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData != null) {
            float diameter = getDiameter() / 2.0f;
            setArguments centerOffsets = getCenterOffsets();
            float ICustomTabsCallback$Stub = ((getStatusBarBackgroundDrawable) this.mData).toDoubleRange().ICustomTabsCallback$Stub();
            this.setMax.set((centerOffsets.length - diameter) + ICustomTabsCallback$Stub, (centerOffsets.getMin - diameter) + ICustomTabsCallback$Stub, (centerOffsets.length + diameter) - ICustomTabsCallback$Stub, (centerOffsets.getMin + diameter) - ICustomTabsCallback$Stub);
            setArguments.setMin(centerOffsets);
        }
    }

    /* access modifiers changed from: protected */
    public float[] getMarkerPosition(addFocusables addfocusables) {
        setArguments centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            f = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f2 = radius - f;
        float rotationAngle = getRotationAngle();
        int i = (int) addfocusables.setMax;
        float f3 = this.getMin[i] / 2.0f;
        double d = (double) f2;
        double cos = Math.cos(Math.toRadians((double) (((this.length[i] + rotationAngle) - f3) * this.mAnimator.length())));
        Double.isNaN(d);
        double d2 = (double) centerCircleBox.length;
        Double.isNaN(d2);
        float f4 = (float) ((cos * d) + d2);
        double sin = Math.sin(Math.toRadians((double) (((rotationAngle + this.length[i]) - f3) * this.mAnimator.length())));
        Double.isNaN(d);
        double d3 = d * sin;
        double d4 = (double) centerCircleBox.getMin;
        Double.isNaN(d4);
        setArguments.setMin(centerCircleBox);
        return new float[]{f4, (float) (d3 + d4)};
    }

    public boolean needsHighlight(int i) {
        if (!valuesToHighlight()) {
            return false;
        }
        for (addFocusables addfocusables : this.mIndicesToHighlight) {
            if (((int) addfocusables.setMax) == i) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    public int getIndexForAngle(float f) {
        float min = getTargetFragment.getMin(f - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.length;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > min) {
                return i;
            }
            i++;
        }
    }

    public int getDataSetIndexForIndex(int i) {
        List intRange = ((getStatusBarBackgroundDrawable) this.mData).toIntRange();
        for (int i2 = 0; i2 < intRange.size(); i2++) {
            if (((getEmojiReplaceStrategy) intRange.get(i2)).length((float) i, Float.NaN) != null) {
                return i2;
            }
        }
        return -1;
    }

    public float[] getDrawAngles() {
        return this.getMin;
    }

    public float[] getAbsoluteAngles() {
        return this.length;
    }

    public void setHoleColor(int i) {
        ((onCancel) this.mRenderer).getMax().setColor(i);
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.toIntRange = z;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.toIntRange;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.getMax = z;
    }

    public boolean isDrawHoleEnabled() {
        return this.getMax;
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.toFloatRange = "";
        } else {
            this.toFloatRange = charSequence;
        }
    }

    public CharSequence getCenterText() {
        return this.toFloatRange;
    }

    public void setDrawCenterText(boolean z) {
        this.values = z;
    }

    public boolean isDrawCenterTextEnabled() {
        return this.values;
    }

    /* access modifiers changed from: protected */
    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.getMax().getTextSize() * 2.0f;
    }

    public float getRadius() {
        RectF rectF = this.setMax;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.setMax.height() / 2.0f);
    }

    public RectF getCircleBox() {
        return this.setMax;
    }

    public setArguments getCenterCircleBox() {
        return setArguments.getMax(this.setMax.centerX(), this.setMax.centerY());
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((onCancel) this.mRenderer).getMax.setTypeface(typeface);
    }

    public void setCenterTextSize(float f) {
        ((onCancel) this.mRenderer).getMax.setTextSize(getTargetFragment.setMax(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((onCancel) this.mRenderer).getMax.setTextSize(f);
    }

    public void setCenterTextOffset(float f, float f2) {
        this.equals.length = getTargetFragment.setMax(f);
        this.equals.getMin = getTargetFragment.setMax(f2);
    }

    public setArguments getCenterTextOffset() {
        return setArguments.getMax(this.equals.length, this.equals.getMin);
    }

    public void setCenterTextColor(int i) {
        ((onCancel) this.mRenderer).getMax.setColor(i);
    }

    public void setHoleRadius(float f) {
        this.toDoubleRange = f;
    }

    public float getHoleRadius() {
        return this.toDoubleRange;
    }

    public void setTransparentCircleColor(int i) {
        Paint min = ((onCancel) this.mRenderer).getMin();
        int alpha = min.getAlpha();
        min.setColor(i);
        min.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.mTransparentCircleRadiusPercent = f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    public void setTransparentCircleAlpha(int i) {
        ((onCancel) this.mRenderer).getMin().setAlpha(i);
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.setMin = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.setMin = z;
    }

    public boolean isDrawEntryLabelsEnabled() {
        return this.setMin;
    }

    public void setEntryLabelColor(int i) {
        ((onCancel) this.mRenderer).isInside.setColor(i);
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((onCancel) this.mRenderer).isInside.setTypeface(typeface);
    }

    public void setEntryLabelTextSize(float f) {
        ((onCancel) this.mRenderer).isInside.setTextSize(getTargetFragment.setMax(f));
    }

    public void setDrawRoundedSlices(boolean z) {
        this.isInside = z;
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.isInside;
    }

    public void setUsePercentValues(boolean z) {
        this.IsOverlapping = z;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.IsOverlapping;
    }

    public void setCenterTextRadiusPercent(float f) {
        this.toString = f;
    }

    public float getCenterTextRadiusPercent() {
        return this.toString;
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.mMaxAngle = f;
    }

    public float getMinAngleForSlices() {
        return this.FastBitmap$CoordinateSystem;
    }

    public void setMinAngleForSlices(float f) {
        float f2 = this.mMaxAngle;
        if (f > f2 / 2.0f) {
            f = f2 / 2.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.FastBitmap$CoordinateSystem = f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.mRenderer != null && (this.mRenderer instanceof onCancel)) {
            ((onCancel) this.mRenderer).length();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void calcMinMax() {
        int isInside2 = ((getStatusBarBackgroundDrawable) this.mData).isInside();
        if (this.getMin.length != isInside2) {
            this.getMin = new float[isInside2];
        } else {
            for (int i = 0; i < isInside2; i++) {
                this.getMin[i] = 0.0f;
            }
        }
        if (this.length.length != isInside2) {
            this.length = new float[isInside2];
        } else {
            for (int i2 = 0; i2 < isInside2; i2++) {
                this.length[i2] = 0.0f;
            }
        }
        float values2 = ((getStatusBarBackgroundDrawable) this.mData).values();
        List intRange = ((getStatusBarBackgroundDrawable) this.mData).toIntRange();
        float f = this.FastBitmap$CoordinateSystem;
        boolean z = f != 0.0f && ((float) isInside2) * f <= this.mMaxAngle;
        float[] fArr = new float[isInside2];
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((getStatusBarBackgroundDrawable) this.mData).setMin(); i4++) {
            getEmojiReplaceStrategy getemojireplacestrategy = (getEmojiReplaceStrategy) intRange.get(i4);
            for (int i5 = 0; i5 < getemojireplacestrategy.ICustomTabsCallback(); i5++) {
                float abs = (Math.abs(((PieEntry) getemojireplacestrategy.toIntRange(i5)).getMin()) / values2) * this.mMaxAngle;
                if (z) {
                    float f4 = this.FastBitmap$CoordinateSystem;
                    float f5 = abs - f4;
                    if (f5 <= 0.0f) {
                        fArr[i3] = f4;
                        f2 += -f5;
                    } else {
                        fArr[i3] = abs;
                        f3 += f5;
                    }
                }
                float[] fArr2 = this.getMin;
                fArr2[i3] = abs;
                if (i3 == 0) {
                    this.length[i3] = fArr2[i3];
                } else {
                    float[] fArr3 = this.length;
                    fArr3[i3] = fArr3[i3 - 1] + fArr2[i3];
                }
                i3++;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < isInside2; i6++) {
                fArr[i6] = fArr[i6] - (((fArr[i6] - this.FastBitmap$CoordinateSystem) / f3) * f2);
                if (i6 == 0) {
                    this.length[0] = fArr[0];
                } else {
                    float[] fArr4 = this.length;
                    fArr4[i6] = fArr4[i6 - 1] + fArr[i6];
                }
            }
            this.getMin = fArr;
        }
    }
}
