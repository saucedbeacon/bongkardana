package com.alibaba.griver.core.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alibaba.griver.base.common.utils.ReflectUtils;

public class d {
    public static boolean a(Context context) {
        if (!ReflectUtils.classExist("com.google.android.gms.common.GooglePlayServicesUtil")) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
