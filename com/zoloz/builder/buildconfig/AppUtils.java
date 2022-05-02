package com.zoloz.builder.buildconfig;

import android.content.Context;

public class AppUtils {
    public static boolean isDebug(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
