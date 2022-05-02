package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import o.getMinimumMaxLifecycleState;
import o.moveDrawerToOffset;
import o.setFilters;

public class ScatterChart extends BarLineChartBase<moveDrawerToOffset> implements setFilters {
    public ScatterChart(Context context) {
        super(context);
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mRenderer = new getMinimumMaxLifecycleState(this, this.mAnimator, this.mViewPortHandler);
        getXAxis().Grayscale$Algorithm();
        getXAxis().valueOf();
    }

    public moveDrawerToOffset getScatterData() {
        return (moveDrawerToOffset) this.mData;
    }
}
