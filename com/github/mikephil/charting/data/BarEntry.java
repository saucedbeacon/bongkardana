package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import o.createFloatPropertyCompat;

@SuppressLint({"ParcelCreator"})
public class BarEntry extends Entry {
    public float getMin;
    public float length;
    public createFloatPropertyCompat[] setMax;
    public float[] setMin;

    public final float getMin() {
        return super.getMin();
    }

    public final boolean getMax() {
        return this.setMin != null;
    }
}
