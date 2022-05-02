package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import o.EmojiMetadata$HasGlyph;
import o.findOpenDrawer;
import o.onHasView;

public class LineChart extends BarLineChartBase<findOpenDrawer> implements EmojiMetadata$HasGlyph {
    public LineChart(Context context) {
        super(context);
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mRenderer = new onHasView(this, this.mAnimator, this.mViewPortHandler);
    }

    public findOpenDrawer getLineData() {
        return (findOpenDrawer) this.mData;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.mRenderer != null && (this.mRenderer instanceof onHasView)) {
            ((onHasView) this.mRenderer).getMin();
        }
        super.onDetachedFromWindow();
    }
}
