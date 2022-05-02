package com.iap.ac.android.common.log;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.iap.ac.android.common.log.log.ILogPrinter;
import com.iap.ac.android.common.log.log.LogPrinter;

public final class ACLog {
    private static boolean DEBUG = false;
    private static ILogPrinter sLogPrinter = new LogPrinter();

    public static void setLogPrinter(ILogPrinter iLogPrinter) {
        if (iLogPrinter != null) {
            sLogPrinter = iLogPrinter;
        }
    }

    public static void setDebuggable(boolean z) {
        DEBUG = z;
    }

    public static void setDebuggableByContext(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (applicationInfo.flags & 2) != 0) {
                DEBUG = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e("TAG", "setDebuggableByContext error: ", e);
        }
    }

    public static int v(String str, String str2) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(2, str, str2);
    }

    public static int v(String str, String str2, Throwable th) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(2, str, str2, th);
    }

    public static int d(String str, String str2) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(3, str, str2);
    }

    public static int d(String str, String str2, Throwable th) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(3, str, str2, th);
    }

    public static int i(String str, String str2) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(4, str, str2);
    }

    public static int i(String str, String str2, Throwable th) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(4, str, str2, th);
    }

    public static int w(String str, String str2) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(5, str, str2);
    }

    public static int w(String str, String str2, Throwable th) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(5, str, str2, th);
    }

    public static int w(String str, Throwable th) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(5, str, (String) null, th);
    }

    public static int e(String str, String str2) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(6, str, str2);
    }

    public static int e(String str, String str2, Throwable th) {
        if (!DEBUG) {
            return 0;
        }
        return sLogPrinter.doPrint(6, str, str2, th);
    }
}
