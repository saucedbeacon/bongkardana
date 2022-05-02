package com.ta.audid.g;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import id.dana.danah5.akulaku.AkuEventParamsKey;

public class a {
    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion;
        } catch (Exception e) {
            m.e("", e, new Object[0]);
            return 0;
        }
    }

    public static String s(Context context) {
        PackageInfo a2 = a(context);
        return a2 != null ? a2.packageName : "";
    }

    public static String t(Context context) {
        PackageInfo a2 = a(context);
        return a2 != null ? a2.versionName : "";
    }

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getCurProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Boolean a() {
        if (Build.VERSION.SDK_INT < 23) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
