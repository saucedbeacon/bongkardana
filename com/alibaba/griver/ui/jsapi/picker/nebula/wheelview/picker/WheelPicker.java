package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.picker;

import android.app.Activity;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.widget.ConfirmPopup;

public abstract class WheelPicker extends ConfirmPopup<View> {
    protected int lineColor = -8139290;
    protected boolean lineVisible = true;
    protected int offset = 1;
    protected int textColorFocus = -16611122;
    protected int textColorNormal = -4473925;
    protected int textSize = 16;

    public WheelPicker(Activity activity) {
        super(activity);
    }

    public void setTextSize(int i) {
        this.textSize = i;
    }

    public void setTextColor(@ColorInt int i, @ColorInt int i2) {
        this.textColorFocus = i;
        this.textColorNormal = i2;
    }

    public void setTextColor(@ColorInt int i) {
        this.textColorFocus = i;
    }

    public void setLineVisible(boolean z) {
        this.lineVisible = z;
    }

    public void setLineColor(@ColorInt int i) {
        this.lineColor = i;
    }

    public void setOffset(@IntRange(from = 1, to = 4) int i) {
        this.offset = i;
    }
}
