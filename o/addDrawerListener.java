package o;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.components.Legend;

public final class addDrawerListener {
    public int equals = 1122867;
    public DashPathEffect getMax = null;
    public float getMin = Float.NaN;
    public String length;
    public float setMax = Float.NaN;
    public Legend.LegendForm setMin = Legend.LegendForm.DEFAULT;

    public addDrawerListener() {
    }

    public addDrawerListener(String str, Legend.LegendForm legendForm, float f, float f2, DashPathEffect dashPathEffect, int i) {
        this.length = str;
        this.setMin = legendForm;
        this.setMax = f;
        this.getMin = f2;
        this.getMax = dashPathEffect;
        this.equals = i;
    }
}
