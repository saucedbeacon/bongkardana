package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import o.EmojiAppCompatEditText;
import o.addFocusables;
import o.getDrawerTitle;
import o.getTargetFragment;
import o.getTargetRequestCode;
import o.isDrawerVisible;
import o.isInBackStack;
import o.onFindViewById;
import o.onViewStateRestored;
import o.requireArguments;
import o.setArguments;

public class HorizontalBarChart extends BarChart {
    protected float[] mGetPositionBuffer = new float[2];
    private RectF setMin = new RectF();

    public HorizontalBarChart(Context context) {
        super(context);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.mViewPortHandler = new requireArguments();
        super.init();
        this.mLeftAxisTransformer = new getTargetRequestCode(this.mViewPortHandler);
        this.mRightAxisTransformer = new getTargetRequestCode(this.mViewPortHandler);
        this.mRenderer = new onFindViewById(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new isDrawerVisible(this));
        this.mAxisRendererLeft = new isInBackStack(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new isInBackStack(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new onViewStateRestored(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, this);
    }

    public void calculateOffsets() {
        calculateLegendOffsets(this.setMin);
        float f = this.setMin.left + 0.0f;
        float f2 = this.setMin.top + 0.0f;
        float f3 = this.setMin.right + 0.0f;
        float f4 = this.setMin.bottom + 0.0f;
        if (this.mAxisLeft.onTransact()) {
            f2 += this.mAxisLeft.setMin(this.mAxisRendererLeft.setMax());
        }
        if (this.mAxisRight.onTransact()) {
            f4 += this.mAxisRight.setMin(this.mAxisRendererRight.setMax());
        }
        float f5 = (float) this.mXAxis.setDefaultImpl;
        if (this.mXAxis.create()) {
            if (this.mXAxis.newSession == XAxis.XAxisPosition.BOTTOM) {
                f += f5;
            } else {
                if (this.mXAxis.newSession != XAxis.XAxisPosition.TOP) {
                    if (this.mXAxis.newSession == XAxis.XAxisPosition.BOTH_SIDED) {
                        f += f5;
                    }
                }
                f3 += f5;
            }
        }
        float extraTopOffset = f2 + getExtraTopOffset();
        float extraRightOffset = f3 + getExtraRightOffset();
        float extraBottomOffset = f4 + getExtraBottomOffset();
        float extraLeftOffset = f + getExtraLeftOffset();
        float max = getTargetFragment.setMax(this.mMinOffset);
        this.mViewPortHandler.getMin(Math.max(max, extraLeftOffset), Math.max(max, extraTopOffset), Math.max(max, extraRightOffset), Math.max(max, extraBottomOffset));
        if (this.mLogEnabled) {
            this.mViewPortHandler.toDoubleRange();
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    /* access modifiers changed from: protected */
    public void prepareValuePxMatrix() {
        this.mRightAxisTransformer.getMin(this.mAxisRight.onPostMessage, this.mAxisRight.extraCallbackWithResult, this.mXAxis.extraCallbackWithResult, this.mXAxis.onPostMessage);
        this.mLeftAxisTransformer.getMin(this.mAxisLeft.onPostMessage, this.mAxisLeft.extraCallbackWithResult, this.mXAxis.extraCallbackWithResult, this.mXAxis.onPostMessage);
    }

    public void getBarBounds(BarEntry barEntry, RectF rectF) {
        EmojiAppCompatEditText emojiAppCompatEditText = (EmojiAppCompatEditText) ((getDrawerTitle) this.mData).length((Entry) barEntry);
        if (emojiAppCompatEditText == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float min = barEntry.getMin();
        float length = barEntry.length();
        float f = ((getDrawerTitle) this.mData).getMax / 2.0f;
        float f2 = length - f;
        float f3 = length + f;
        float f4 = min >= 0.0f ? min : 0.0f;
        if (min > 0.0f) {
            min = 0.0f;
        }
        rectF.set(f4, f2, min, f3);
        getTransformer(emojiAppCompatEditText.getCause()).setMax(rectF);
    }

    public setArguments getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.mGetPositionBuffer;
        fArr[0] = entry.getMin();
        fArr[1] = entry.length();
        getTransformer(axisDependency).length(fArr);
        return setArguments.getMax(fArr[0], fArr[1]);
    }

    public addFocusables getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        return getHighlighter().setMax(f2, f);
    }

    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).length(this.mViewPortHandler.isInside(), this.mViewPortHandler.toFloatRange(), this.posForGetLowestVisibleX);
        return (float) Math.max((double) this.mXAxis.onPostMessage, this.posForGetLowestVisibleX.getMin);
    }

    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).length(this.mViewPortHandler.isInside(), this.mViewPortHandler.toIntRange(), this.posForGetHighestVisibleX);
        return (float) Math.min((double) this.mXAxis.onMessageChannelReady, this.posForGetHighestVisibleX.getMin);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.mViewPortHandler.getMin(this.mXAxis.extraCallbackWithResult / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.mViewPortHandler.setMin(this.mXAxis.extraCallbackWithResult / f);
    }

    public void setVisibleXRange(float f, float f2) {
        this.mViewPortHandler.getMax(this.mXAxis.extraCallbackWithResult / f, this.mXAxis.extraCallbackWithResult / f2);
    }

    public void setVisibleYRangeMaximum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.getMax(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRangeMinimum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.length(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRange(float f, float f2, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMin(getAxisRange(axisDependency) / f, getAxisRange(axisDependency) / f2);
    }

    /* access modifiers changed from: protected */
    public float[] getMarkerPosition(addFocusables addfocusables) {
        return new float[]{addfocusables.IsOverlapping, addfocusables.isInside};
    }
}
