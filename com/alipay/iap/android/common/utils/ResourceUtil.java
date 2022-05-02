package com.alipay.iap.android.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

public class ResourceUtil {
    public int getIdentifier(String str, String str2, Context context) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public static Drawable getAppIcon(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationIcon(packageManager.getApplicationInfo(context.getPackageName(), 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
