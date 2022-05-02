package com.alipay.multigateway.sdk.util;

public class ParseUtil {
    private static final String TAG = "ParseUtil";

    public static float parseFloat(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static float[] parseFloatArray(String str) {
        String[] split = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        float[] fArr = new float[split.length];
        int i = 0;
        while (i < split.length) {
            try {
                fArr[i] = Float.parseFloat(split[i]);
                i++;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return fArr;
    }
}
