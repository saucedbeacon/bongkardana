package com.alipay.zoloz.zface.utils;

import android.os.Handler;
import android.os.Looper;

public class Tools {
    public static void runMainLooper(Runnable runnable) {
        runMainLooper(runnable, 0);
    }

    public static void runMainLooper(Runnable runnable, long j) {
        if (runnable != null) {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
        }
    }
}
