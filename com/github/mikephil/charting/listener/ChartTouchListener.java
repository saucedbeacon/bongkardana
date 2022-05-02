package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import o.addFocusables;

public abstract class ChartTouchListener<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    protected T getMax;
    protected ChartGesture getMin = ChartGesture.NONE;
    protected GestureDetector length;
    protected int setMax = 0;
    protected addFocusables setMin;

    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(T t) {
        this.getMax = t;
        this.length = new GestureDetector(t.getContext(), this);
    }

    public final void getMin() {
        this.getMax.getOnChartGestureListener();
    }

    public final void setMax() {
        this.getMax.getOnChartGestureListener();
    }

    public final void getMin(addFocusables addfocusables) {
        this.setMin = addfocusables;
    }

    /* access modifiers changed from: protected */
    public final void setMin(addFocusables addfocusables) {
        if (addfocusables == null || addfocusables.length(this.setMin)) {
            this.getMax.highlightValue((addFocusables) null, true);
            this.setMin = null;
            return;
        }
        this.getMax.highlightValue(addfocusables, true);
        this.setMin = addfocusables;
    }
}
