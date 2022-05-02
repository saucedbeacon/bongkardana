package com.alipay.iap.android.aplog.monitor.util;

import android.content.Context;
import com.alipay.iap.android.aplog.core.LoggerFactory;

public class MonitorUtils {

    /* renamed from: a  reason: collision with root package name */
    private static int f10662a = -1;

    public static boolean a() {
        if (f10662a < 0) {
            Context applicationContext = LoggerFactory.getLogContext().getApplicationContext();
            if (applicationContext == null) {
                return false;
            }
            try {
                f10662a = (applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 16384).flags & 2) == 2 ? 1 : 0;
            } catch (Throwable unused) {
                f10662a = 0;
            }
        }
        return f10662a == 1;
    }
}
