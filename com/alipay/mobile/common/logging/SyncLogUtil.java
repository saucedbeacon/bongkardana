package com.alipay.mobile.common.logging;

import android.content.Context;

public class SyncLogUtil {
    private static boolean debuggable;

    private SyncLogUtil() {
    }

    public static void init(Context context) {
        debuggable = isApkDebuggable(context);
    }

    private static boolean isApkDebuggable(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static boolean isDebuggable() {
        return debuggable;
    }
}
