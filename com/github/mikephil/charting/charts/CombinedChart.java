package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import o.addFocusables;
import o.findOpenDrawer;
import o.getDrawerTitle;
import o.getDrawerViewAbsoluteGravity;
import o.getDrawerViewOffset;
import o.isDrawerOpen;
import o.moveDrawerToOffset;
import o.onDetach;
import o.setAllCaps;
import o.setDrawerViewOffset;

public class CombinedChart extends BarLineChartBase<setDrawerViewOffset> implements setAllCaps {
    private boolean length = false;
    protected DrawOrder[] mDrawOrder;
    protected boolean mHighlightFullBarEnabled = false;
    private boolean setMin = true;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mDrawOrder = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new isDrawerOpen(this, this));
        setHighlightFullBarEnabled(true);
        this.mRenderer = new onDetach(this, this.mAnimator, this.mViewPortHandler);
    }

    public setDrawerViewOffset getCombinedData() {
        return (setDrawerViewOffset) this.mData;
    }

    public void setData(setDrawerViewOffset setdrawerviewoffset) {
        super.setData(setdrawerviewoffset);
        setHighlighter(new isDrawerOpen(this, this));
        ((onDetach) this.mRenderer).getMax();
        this.mRenderer.setMax();
    }

    public addFocusables getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        addFocusables max = getHighlighter().setMax(f, f2);
        return (max == null || !isHighlightFullBarEnabled()) ? max : new addFocusables(max.setMax, max.getMin, max.getMax, max.setMin, max.equals, -1, max.toFloatRange);
    }

    public findOpenDrawer getLineData() {
        if (this.mData == null) {
            return null;
        }
        return ((setDrawerViewOffset) this.mData).getMax;
    }

    public getDrawerTitle getBarData() {
        if (this.mData == null) {
            return null;
        }
        return ((setDrawerViewOffset) this.mData).values;
    }

    public moveDrawerToOffset getScatterData() {
        if (this.mData == null) {
            return null;
        }
        return ((setDrawerViewOffset) this.mData).hashCode;
    }

    public getDrawerViewAbsoluteGravity getCandleData() {
        if (this.mData == null) {
            return null;
        }
        return ((setDrawerViewOffset) this.mData).toString;
    }

    public getDrawerViewOffset getBubbleData() {
        if (this.mData == null) {
            return null;
        }
        return ((setDrawerViewOffset) this.mData).FastBitmap$CoordinateSystem;
    }

    public boolean isDrawBarShadowEnabled() {
        return this.length;
    }

    public boolean isDrawValueAboveBarEnabled() {
        return this.setMin;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.setMin = z;
    }

    public void setDrawBarShadow(boolean z) {
        this.length = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.mHighlightFullBarEnabled = z;
    }

    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public DrawOrder[] getDrawOrder() {
        return this.mDrawOrder;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr != null && drawOrderArr.length > 0) {
            this.mDrawOrder = drawOrderArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: o.EmojiAppCompatButton} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawMarkers(android.graphics.Canvas r10) {
        /*
            r9 = this;
            o.removeDrawerListener r0 = r9.mMarker
            if (r0 == 0) goto L_0x0093
            boolean r0 = r9.isDrawMarkersEnabled()
            if (r0 == 0) goto L_0x0093
            boolean r0 = r9.valuesToHighlight()
            if (r0 != 0) goto L_0x0012
            goto L_0x0093
        L_0x0012:
            r0 = 0
            r1 = 0
        L_0x0014:
            o.addFocusables[] r2 = r9.mIndicesToHighlight
            int r2 = r2.length
            if (r1 >= r2) goto L_0x0093
            o.addFocusables[] r2 = r9.mIndicesToHighlight
            r2 = r2[r1]
            o.checkDrawerViewAbsoluteGravity r3 = r9.mData
            o.setDrawerViewOffset r3 = (o.setDrawerViewOffset) r3
            int r4 = r2.length
            java.util.List r5 = r3.values()
            int r5 = r5.size()
            r6 = 0
            if (r4 < r5) goto L_0x002f
            goto L_0x0051
        L_0x002f:
            int r4 = r2.length
            java.util.List r3 = r3.values()
            java.lang.Object r3 = r3.get(r4)
            o.dispatchOnDrawerClosed r3 = (o.dispatchOnDrawerClosed) r3
            int r4 = r2.equals
            int r5 = r3.setMin()
            if (r4 < r5) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            java.util.List r3 = r3.toIntRange()
            int r4 = r2.equals
            java.lang.Object r3 = r3.get(r4)
            r6 = r3
            o.EmojiAppCompatButton r6 = (o.EmojiAppCompatButton) r6
        L_0x0051:
            o.checkDrawerViewAbsoluteGravity r3 = r9.mData
            o.setDrawerViewOffset r3 = (o.setDrawerViewOffset) r3
            com.github.mikephil.charting.data.Entry r3 = r3.setMax(r2)
            if (r3 == 0) goto L_0x0090
            int r4 = r6.getMin(r3)
            float r4 = (float) r4
            int r5 = r6.ICustomTabsCallback()
            float r5 = (float) r5
            o.setDrawerShadow r6 = r9.mAnimator
            float r6 = r6.getMin()
            float r5 = r5 * r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0090
            float[] r4 = r9.getMarkerPosition(r2)
            o.setTargetFragment r5 = r9.mViewPortHandler
            r6 = r4[r0]
            r7 = 1
            r8 = r4[r7]
            boolean r5 = r5.setMax(r6, r8)
            if (r5 == 0) goto L_0x0090
            o.removeDrawerListener r5 = r9.mMarker
            r5.refreshContent(r3, r2)
            o.removeDrawerListener r2 = r9.mMarker
            r3 = r4[r0]
            r4 = r4[r7]
            r2.draw(r10, r3, r4)
        L_0x0090:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.CombinedChart.drawMarkers(android.graphics.Canvas):void");
    }
}
