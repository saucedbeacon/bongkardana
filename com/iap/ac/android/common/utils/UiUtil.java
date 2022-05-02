package com.iap.ac.android.common.utils;

import android.content.res.Resources;
import android.util.TypedValue;

public class UiUtil {
    private static final long CLICK_TIME = 500;
    private static long lastClickTime;

    private UiUtil() {
    }

    public static synchronized boolean isFastClick() {
        synchronized (UiUtil.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastClickTime < CLICK_TIME) {
                return true;
            }
            lastClickTime = currentTimeMillis;
            return false;
        }
    }

    public static int dp2px(Resources resources, float f) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
