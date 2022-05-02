package com.iap.ac.android.acs.plugin.utils;

import android.content.Context;

public class DeviceUtils {
    public static boolean isApkInDebug(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }
}
