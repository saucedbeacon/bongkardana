package com.alipay.iap.android.common.utils;

import android.content.Context;
import android.os.Build;
import com.alipay.iap.android.common.log.LoggerWrapper;

public class PermissionUtils {
    private PermissionUtils() {
    }

    public static boolean hasPermission(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23 || context.checkCallingOrSelfPermission(str) != -1) {
            return true;
        }
        LoggerWrapper.i("PermissionUtils", "PERMISSION_DENIED, can not read phone state");
        return false;
    }
}
