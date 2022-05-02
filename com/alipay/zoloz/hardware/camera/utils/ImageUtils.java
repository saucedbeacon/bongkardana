package com.alipay.zoloz.hardware.camera.utils;

import android.graphics.Rect;

public class ImageUtils {
    public static Rect cropImage(int i, int i2, int i3, int i4) {
        float f = (((float) i) * 1.0f) / ((float) i2);
        float f2 = (((float) i3) * 1.0f) / ((float) i4);
        Rect rect = new Rect();
        if (f >= f2) {
            int i5 = (i3 * i2) / i4;
            rect.left = (i - i5) / 2;
            rect.right = rect.left + i5;
            rect.top = 0;
            rect.bottom = i2;
        } else {
            rect.left = 0;
            rect.right = i;
            int i6 = (i4 * i) / i3;
            rect.top = (i2 - i6) / 2;
            rect.bottom = rect.top + i6;
        }
        return rect;
    }
}
