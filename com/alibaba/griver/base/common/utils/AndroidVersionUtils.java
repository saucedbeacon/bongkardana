package com.alibaba.griver.base.common.utils;

import android.os.Build;

public class AndroidVersionUtils {
    public static boolean isRAndAbove() {
        return getBuildVersion() >= 30;
    }

    public static boolean isQAndAbove() {
        return getBuildVersion() >= 29;
    }

    public static boolean isNAndAbove() {
        return getBuildVersion() >= 24;
    }

    public static int getBuildVersion() {
        return Build.VERSION.SDK_INT;
    }
}
