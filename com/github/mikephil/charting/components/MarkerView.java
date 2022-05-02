package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import o.addFocusables;
import o.removeDrawerListener;
import o.setArguments;

public class MarkerView extends RelativeLayout implements removeDrawerListener {
    private WeakReference<Chart> getMin;
    private setArguments length = new setArguments();
    private setArguments setMax = new setArguments();

    public MarkerView(Context context, int i) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(i, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    public void setOffset(setArguments setarguments) {
        this.setMax = setarguments;
        if (setarguments == null) {
            this.setMax = new setArguments();
        }
    }

    public void setOffset(float f, float f2) {
        this.setMax.length = f;
        this.setMax.getMin = f2;
    }

    public setArguments getOffset() {
        return this.setMax;
    }

    public void setChartView(Chart chart) {
        this.getMin = new WeakReference<>(chart);
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.getMin;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public setArguments getOffsetForDrawingAtPoint(float f, float f2) {
        setArguments offset = getOffset();
        this.length.length = offset.length;
        this.length.getMin = offset.getMin;
        Chart chartView = getChartView();
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (this.length.length + f < 0.0f) {
            this.length.length = -f;
        } else if (chartView != null && f + width + this.length.length > ((float) chartView.getWidth())) {
            this.length.length = (((float) chartView.getWidth()) - f) - width;
        }
        if (this.length.getMin + f2 < 0.0f) {
            this.length.getMin = -f2;
        } else if (chartView != null && f2 + height + this.length.getMin > ((float) chartView.getHeight())) {
            this.length.getMin = (((float) chartView.getHeight()) - f2) - height;
        }
        return this.length;
    }

    public void refreshContent(Entry entry, addFocusables addfocusables) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void draw(Canvas canvas, float f, float f2) {
        setArguments offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        int save = canvas.save();
        canvas.translate(f + offsetForDrawingAtPoint.length, f2 + offsetForDrawingAtPoint.getMin);
        draw(canvas);
        canvas.restoreToCount(save);
    }
}
