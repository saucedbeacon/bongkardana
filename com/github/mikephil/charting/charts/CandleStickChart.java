package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import o.EmojiCompat$LoadState;
import o.getDrawerViewAbsoluteGravity;
import o.performCreateView;

public class CandleStickChart extends BarLineChartBase<getDrawerViewAbsoluteGravity> implements EmojiCompat$LoadState {
    public CandleStickChart(Context context) {
        super(context);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mRenderer = new performCreateView(this, this.mAnimator, this.mViewPortHandler);
        getXAxis().Grayscale$Algorithm();
        getXAxis().valueOf();
    }

    public getDrawerViewAbsoluteGravity getCandleData() {
        return (getDrawerViewAbsoluteGravity) this.mData;
    }
}
