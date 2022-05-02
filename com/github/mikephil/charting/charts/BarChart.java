package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import o.EmojiAppCompatEditText;
import o.EmojiCompat$LoadStrategy;
import o.addFocusables;
import o.cancelChildViewTouch;
import o.getDrawerTitle;
import o.requireDialog;

public class BarChart extends BarLineChartBase<getDrawerTitle> implements EmojiCompat$LoadStrategy {
    private boolean getMax = false;
    protected boolean mHighlightFullBarEnabled = false;
    private boolean setMax = false;
    private boolean setMin = true;

    public BarChart(Context context) {
        super(context);
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mRenderer = new requireDialog(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new cancelChildViewTouch(this));
        getXAxis().Grayscale$Algorithm();
        getXAxis().valueOf();
    }

    /* access modifiers changed from: protected */
    public void calcMinMax() {
        if (this.getMax) {
            this.mXAxis.setMax(((getDrawerTitle) this.mData).toFloatRange() - (((getDrawerTitle) this.mData).getMax / 2.0f), ((getDrawerTitle) this.mData).equals() + (((getDrawerTitle) this.mData).getMax / 2.0f));
        } else {
            this.mXAxis.setMax(((getDrawerTitle) this.mData).toFloatRange(), ((getDrawerTitle) this.mData).equals());
        }
        this.mAxisLeft.setMax(((getDrawerTitle) this.mData).length(YAxis.AxisDependency.LEFT), ((getDrawerTitle) this.mData).getMin(YAxis.AxisDependency.LEFT));
        this.mAxisRight.setMax(((getDrawerTitle) this.mData).length(YAxis.AxisDependency.RIGHT), ((getDrawerTitle) this.mData).getMin(YAxis.AxisDependency.RIGHT));
    }

    public addFocusables getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        addFocusables max = getHighlighter().setMax(f, f2);
        return (max == null || !isHighlightFullBarEnabled()) ? max : new addFocusables(max.setMax, max.getMin, max.getMax, max.setMin, max.equals, -1, max.toFloatRange);
    }

    public RectF getBarBounds(BarEntry barEntry) {
        RectF rectF = new RectF();
        getBarBounds(barEntry, rectF);
        return rectF;
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
        rectF.set(f2, f4, f3, min);
        getTransformer(emojiAppCompatEditText.getCause()).setMax(rectF);
    }

    public void setDrawValueAboveBar(boolean z) {
        this.setMin = z;
    }

    public boolean isDrawValueAboveBarEnabled() {
        return this.setMin;
    }

    public void setDrawBarShadow(boolean z) {
        this.setMax = z;
    }

    public boolean isDrawBarShadowEnabled() {
        return this.setMax;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.mHighlightFullBarEnabled = z;
    }

    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public void highlightValue(float f, int i, int i2) {
        highlightValue(new addFocusables(f, i, i2), false);
    }

    public getDrawerTitle getBarData() {
        return (getDrawerTitle) this.mData;
    }

    public void setFitBars(boolean z) {
        this.getMax = z;
    }

    public void groupBars(float f, float f2, float f3) {
        if (getBarData() != null) {
            getBarData().setMax(f, f2, f3);
            notifyDataSetChanged();
            return;
        }
        throw new RuntimeException("You need to set data for the chart before grouping bars.");
    }
}
