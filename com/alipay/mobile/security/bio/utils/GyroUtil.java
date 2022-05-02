package com.alipay.mobile.security.bio.utils;

public class GyroUtil {
    public static double getDeviceAngle(float f, float f2) {
        double sqrt = Math.sqrt((double) ((f2 * f2) + (f * f)));
        double d = (double) f;
        Double.isNaN(d);
        double d2 = d / sqrt;
        if (d2 > 1.0d) {
            d2 = 1.0d;
        } else if (d2 < -1.0d) {
            d2 = -1.0d;
        }
        double acos = Math.acos(d2);
        if (f2 < 0.0f) {
            acos = 6.283185307179586d - acos;
        }
        return (acos * 360.0d) / 6.283185307179586d;
    }
}
