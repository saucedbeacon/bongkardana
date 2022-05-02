package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

public class MiniCircleImageView extends ImageView {
    private int getMax;
    private int getMin;
    private Paint length;

    public MiniCircleImageView(Context context) {
        super(context);
        setMax();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMax();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMax();
    }

    private void setMax() {
        this.length = new Paint(1);
        if (Build.VERSION.SDK_INT >= 23) {
            this.length.setColor(getResources().getColor(17170443, (Resources.Theme) null));
        } else {
            this.length.setColor(getResources().getColor(17170443));
        }
        this.length.setStyle(Paint.Style.STROKE);
        this.length.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.getMin = i;
        this.getMax = i2;
    }
}
