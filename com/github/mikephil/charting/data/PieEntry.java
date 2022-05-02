package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

@SuppressLint({"ParcelCreator"})
public class PieEntry extends Entry {
    public String getMin;

    @Deprecated
    public final void getMax(float f) {
        super.getMax(f);
    }

    @Deprecated
    public final float length() {
        return super.length();
    }
}
