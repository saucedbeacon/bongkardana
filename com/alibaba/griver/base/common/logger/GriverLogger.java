package com.alibaba.griver.base.common.logger;

import com.alibaba.griver.api.common.logger.GriverLoggerProxy;
import com.iap.ac.android.diagnoselog.api.DiagnoseLogHelper;

public class GriverLogger {

    /* renamed from: a  reason: collision with root package name */
    private static GriverLoggerProxy f9052a = new GriverLogcatLogger();
    private static boolean b = true;

    private static boolean a(String str) {
        return str != null;
    }

    public static void debug(String str, String str2) {
        if (a(str2)) {
            if (f9052a.isEnable()) {
                f9052a.debug(str, str2);
            }
            if (b && diagnoseExist()) {
                try {
                    DiagnoseLogHelper.d(str, str2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void d(String str, String str2) {
        if (a(str2)) {
            if (f9052a.isEnable()) {
                f9052a.d(str, str2);
            }
            if (b && diagnoseExist()) {
                try {
                    DiagnoseLogHelper.d(str, str2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void w(String str, String str2) {
        if (a(str2)) {
            if (f9052a.isEnable()) {
                f9052a.w(str, str2);
            }
            if (b && diagnoseExist()) {
                try {
                    DiagnoseLogHelper.w(str, str2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (a(str2)) {
            if (f9052a.isEnable()) {
                f9052a.w(str, str2, th);
            }
            if (b && diagnoseExist()) {
                try {
                    DiagnoseLogHelper.w(str, str2, th);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void e(String str, String str2) {
        if (a(str2)) {
            if (f9052a.isEnable()) {
                f9052a.e(str, str2);
            }
            if (b && diagnoseExist()) {
                try {
                    DiagnoseLogHelper.e(str, str2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (a(str2)) {
            if (f9052a.isEnable()) {
                f9052a.e(str, str2, th);
            }
            if (b && diagnoseExist()) {
                try {
                    DiagnoseLogHelper.e(str, str2, th);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void setLogger(GriverLoggerProxy griverLoggerProxy) {
        if (griverLoggerProxy != null) {
            f9052a = griverLoggerProxy;
        }
    }

    public static boolean diagnoseExist() {
        try {
            Class.forName("com.iap.ac.android.diagnoselog.api.DiagnoseLogHelper");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setDiagnoseEnable(boolean z) {
        b = z;
    }
}
