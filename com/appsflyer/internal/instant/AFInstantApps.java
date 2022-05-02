package com.appsflyer.internal.instant;

import android.content.Context;
import android.os.Build;

public class AFInstantApps {
    public static boolean isInstantApp(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
