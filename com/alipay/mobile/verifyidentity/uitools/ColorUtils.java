package com.alipay.mobile.verifyidentity.uitools;

import android.graphics.Color;

public class ColorUtils {
    public static boolean isColorInvalid(int i) {
        return i == Integer.MAX_VALUE;
    }

    public static int parseColor(String str) {
        if (str == null || str.length() == 0) {
            return Integer.MAX_VALUE;
        }
        try {
            if (!str.startsWith("#")) {
                str = "#".concat(String.valueOf(str));
            }
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }
}
