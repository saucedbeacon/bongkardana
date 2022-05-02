package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.YAxis;
import o.DrawerLayout;
import o.EmojiExtractTextLayout;
import o.getTargetFragment;
import o.getViewLifecycleOwnerLiveData;
import o.gravityToString;
import o.initLifecycle;
import o.prepareDialog;

public class RadarChart extends PieRadarChartBase<gravityToString> {
    private YAxis IsOverlapping;
    private boolean equals = true;
    private float getMax = 1.5f;
    private int getMin = 150;
    private int length = Color.rgb(122, 122, 122);
    protected getViewLifecycleOwnerLiveData mXAxisRenderer;
    protected initLifecycle mYAxisRenderer;
    private float setMax = 2.5f;
    private int setMin = Color.rgb(122, 122, 122);
    private int toFloatRange = 0;

    public RadarChart(Context context) {
        super(context);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.IsOverlapping = new YAxis(YAxis.AxisDependency.LEFT);
        this.setMax = getTargetFragment.setMax(1.5f);
        this.getMax = getTargetFragment.setMax(0.75f);
        this.mRenderer = new prepareDialog(this, this.mAnimator, this.mViewPortHandler);
        this.mYAxisRenderer = new initLifecycle(this.mViewPortHandler, this.IsOverlapping, this);
        this.mXAxisRenderer = new getViewLifecycleOwnerLiveData(this.mViewPortHandler, this.mXAxis, this);
        this.mHighlighter = new DrawerLayout.LayoutParams(this);
    }

    /* access modifiers changed from: protected */
    public void calcMinMax() {
        super.calcMinMax();
        this.IsOverlapping.setMax(((gravityToString) this.mData).length(YAxis.AxisDependency.LEFT), ((gravityToString) this.mData).getMin(YAxis.AxisDependency.LEFT));
        this.mXAxis.setMax(0.0f, (float) ((EmojiExtractTextLayout) ((gravityToString) this.mData).FastBitmap$CoordinateSystem()).ICustomTabsCallback());
    }

    public void notifyDataSetChanged() {
        if (this.mData != null) {
            calcMinMax();
            this.mYAxisRenderer.getMax(this.IsOverlapping.onPostMessage, this.IsOverlapping.onMessageChannelReady, this.IsOverlapping.extraCallbackWithResult());
            this.mXAxisRenderer.getMax(this.mXAxis.onPostMessage, this.mXAxis.onMessageChannelReady, false);
            if (this.mLegend != null && !this.mLegend.length()) {
                this.mLegendRenderer.getMax(this.mData);
            }
            calculateOffsets();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData != null) {
            if (this.mXAxis.create()) {
                this.mXAxisRenderer.getMax(this.mXAxis.onPostMessage, this.mXAxis.onMessageChannelReady, false);
            }
            this.mXAxisRenderer.getMax(canvas);
            if (this.equals) {
                this.mRenderer.setMin(canvas);
            }
            if (this.IsOverlapping.create() && this.IsOverlapping.toFloatRange()) {
                this.mYAxisRenderer.setMax(canvas);
            }
            this.mRenderer.getMax(canvas);
            if (valuesToHighlight()) {
                this.mRenderer.setMax(canvas, this.mIndicesToHighlight);
            }
            if (this.IsOverlapping.create() && !this.IsOverlapping.toFloatRange()) {
                this.mYAxisRenderer.setMax(canvas);
            }
            this.mYAxisRenderer.setMin(canvas);
            this.mRenderer.setMax(canvas);
            this.mLegendRenderer.setMax(canvas);
            drawDescription(canvas);
            drawMarkers(canvas);
        }
    }

    public float getFactor() {
        RectF doubleRange = this.mViewPortHandler.toDoubleRange();
        return Math.min(doubleRange.width() / 2.0f, doubleRange.height() / 2.0f) / this.IsOverlapping.extraCallbackWithResult;
    }

    public float getSliceAngle() {
        return 360.0f / ((float) ((EmojiExtractTextLayout) ((gravityToString) this.mData).FastBitmap$CoordinateSystem()).ICustomTabsCallback());
    }

    public int getIndexForAngle(float f) {
        float min = getTargetFragment.getMin(f - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int ICustomTabsCallback = ((EmojiExtractTextLayout) ((gravityToString) this.mData).FastBitmap$CoordinateSystem()).ICustomTabsCallback();
        int i = 0;
        while (i < ICustomTabsCallback) {
            int i2 = i + 1;
            if ((((float) i2) * sliceAngle) - (sliceAngle / 2.0f) > min) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public YAxis getYAxis() {
        return this.IsOverlapping;
    }

    public void setWebLineWidth(float f) {
        this.setMax = getTargetFragment.setMax(f);
    }

    public float getWebLineWidth() {
        return this.setMax;
    }

    public void setWebLineWidthInner(float f) {
        this.getMax = getTargetFragment.setMax(f);
    }

    public float getWebLineWidthInner() {
        return this.getMax;
    }

    public void setWebAlpha(int i) {
        this.getMin = i;
    }

    public int getWebAlpha() {
        return this.getMin;
    }

    public void setWebColor(int i) {
        this.length = i;
    }

    public int getWebColor() {
        return this.length;
    }

    public void setWebColorInner(int i) {
        this.setMin = i;
    }

    public int getWebColorInner() {
        return this.setMin;
    }

    public void setDrawWeb(boolean z) {
        this.equals = z;
    }

    public void setSkipWebLineCount(int i) {
        this.toFloatRange = Math.max(0, i);
    }

    public int getSkipWebLineCount() {
        return this.toFloatRange;
    }

    /* access modifiers changed from: protected */
    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.getMax().getTextSize() * 4.0f;
    }

    /* access modifiers changed from: protected */
    public float getRequiredBaseOffset() {
        if (!this.mXAxis.create() || !this.mXAxis.length()) {
            return getTargetFragment.setMax(10.0f);
        }
        return (float) this.mXAxis.setDefaultImpl;
    }

    public float getRadius() {
        RectF doubleRange = this.mViewPortHandler.toDoubleRange();
        return Math.min(doubleRange.width() / 2.0f, doubleRange.height() / 2.0f);
    }

    public float getYChartMax() {
        return this.IsOverlapping.onMessageChannelReady;
    }

    public float getYChartMin() {
        return this.IsOverlapping.onPostMessage;
    }

    public float getYRange() {
        return this.IsOverlapping.extraCallbackWithResult;
    }
}
