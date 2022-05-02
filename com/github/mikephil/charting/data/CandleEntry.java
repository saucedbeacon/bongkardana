package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

@SuppressLint({"ParcelCreator"})
public class CandleEntry extends Entry {
    public float getMin;
    public float length;
    public float setMax;
    public float setMin;

    public final float getMin() {
        return super.getMin();
    }
}
