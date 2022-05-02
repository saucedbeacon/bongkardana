package com.iap.ac.android.common.utils;

import android.content.Context;
import android.os.Build;
import com.iap.ac.android.common.log.ACLog;

public class PermissionUtils {
    private PermissionUtils() {
    }

    public static boolean hasPermission(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23 || context.checkCallingOrSelfPermission(str) != -1) {
            return true;
        }
        ACLog.i("PermissionUtils", "PERMISSION_DENIED, can not read phone state");
        return false;
    }
}
