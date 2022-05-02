package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import o.getDrawerViewOffset;
import o.getValue;
import o.setShowsDialog;

public class BubbleChart extends BarLineChartBase<getDrawerViewOffset> implements getValue {
    public BubbleChart(Context context) {
        super(context);
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mRenderer = new setShowsDialog(this, this.mAnimator, this.mViewPortHandler);
    }

    public getDrawerViewOffset getBubbleData() {
        return (getDrawerViewOffset) this.mData;
    }
}
