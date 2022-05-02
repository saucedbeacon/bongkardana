package com.alipay.androidinter.safepaylog.utils;

import android.content.Context;

public class LogDebuger {
    private static boolean DEBUG = false;

    public static void initialize(Context context) {
        if (context != null) {
            DEBUG = isDebug(context);
        }
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    private static boolean isDebug(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
