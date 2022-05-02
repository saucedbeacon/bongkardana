package com.alipay.zoloz.hardware.camera.widget.utils;

import android.graphics.Rect;
import android.hardware.Camera;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class FocusAreaUtils {
    @NonNull
    public static List<Camera.Area> computeMeteringAreas(float f, float f2, int i, int i2, int i3) {
        double d = (double) (-i3);
        Double.isNaN(d);
        double d2 = (d * 3.141592653589793d) / 180.0d;
        double d3 = (double) (((f / ((float) i)) * 2000.0f) - 0.0040893555f);
        double cos = Math.cos(d2);
        Double.isNaN(d3);
        double d4 = (double) (((f2 / ((float) i2)) * 2000.0f) - 0.0040893555f);
        double sin = Math.sin(d2);
        Double.isNaN(d4);
        double d5 = (cos * d3) - (sin * d4);
        double sin2 = Math.sin(d2);
        Double.isNaN(d3);
        double cos2 = Math.cos(d2);
        Double.isNaN(d4);
        double d6 = d5;
        double d7 = (d3 * sin2) + (d4 * cos2);
        Rect computeMeteringArea = computeMeteringArea(d6, d7, 150.0d);
        Rect computeMeteringArea2 = computeMeteringArea(d6, d7, 300.0d);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new Camera.Area(computeMeteringArea, 1000));
        arrayList.add(new Camera.Area(computeMeteringArea2, 100));
        return arrayList;
    }

    private static Rect computeMeteringArea(double d, double d2, double d3) {
        double d4 = d3 / 2.0d;
        return new Rect((int) Math.max(d - d4, -1000.0d), (int) Math.max(d2 - d4, -1000.0d), (int) Math.min(d + d4, 1000.0d), (int) Math.min(d2 + d4, 1000.0d));
    }
}
