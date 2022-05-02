package com.alipay.iap.android.common.log;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Locale;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class LoggerWrapper {
    public static String TAG = "LoggerWrapper";
    private static boolean sIsloggable = false;
    private static ILogger sLogger = new ILogger() {
        public final void d(String str, String str2) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1502840101, oncanceled);
                onCancelLoad.getMin(-1502840101, oncanceled);
            }
        }

        public final void d(String str, String str2, Throwable th) {
        }

        public final void e(String str, String str2) {
        }

        public final void e(String str, String str2, Throwable th) {
        }

        public final void i(String str, String str2) {
        }

        public final void i(String str, String str2, Throwable th) {
        }

        public final void v(String str, String str2) {
        }

        public final void v(String str, String str2, Throwable th) {
        }

        public final void w(String str, String str2) {
        }

        public final void w(String str, String str2, Throwable th) {
        }

        public final void w(String str, Throwable th) {
        }

        public final boolean isLoggable() {
            return Log.isLoggable(LoggerWrapper.TAG, 2);
        }
    };
    private static boolean sUseCustomLogger = false;

    private LoggerWrapper() {
    }

    public static void init(Context context) {
        sIsloggable = isDebuggable(context) | sIsloggable;
    }

    private static boolean isDebuggable(Context context) {
        if (sUseCustomLogger) {
            return sLogger.isLoggable();
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e(TAG, "", e);
            return false;
        }
    }

    public static boolean isDebuggable() {
        return sIsloggable;
    }

    public static void activateDebug(boolean z) {
        sIsloggable = z;
    }

    public static void customizeLogger(ILogger iLogger) {
        if (iLogger != null) {
            sLogger = iLogger;
            sUseCustomLogger = true;
            sIsloggable = iLogger.isLoggable();
        }
    }

    public static void v(String str, String str2) {
        if (sIsloggable) {
            sLogger.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (sIsloggable) {
            sLogger.v(str, str2, th);
        }
    }

    public static void i(String str, String str2) {
        if (sIsloggable) {
            sLogger.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (sIsloggable) {
            sLogger.i(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (sIsloggable) {
            sLogger.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (sIsloggable) {
            sLogger.d(str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        if (sIsloggable) {
            sLogger.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (sIsloggable) {
            sLogger.w(str, str2, th);
        }
    }

    public static void w(String str, Throwable th) {
        if (sIsloggable) {
            sLogger.w(str, th);
        }
    }

    public static void e(String str, String str2) {
        if (sIsloggable) {
            sLogger.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (sIsloggable) {
            sLogger.e(str, str2, th);
        }
    }

    public static String buildMessage(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(LoggerWrapper.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                StringBuilder sb = new StringBuilder();
                sb.append(substring2);
                sb.append(".");
                sb.append(stackTrace[i].getMethodName());
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049 A[SYNTHETIC, Splitter:B:20:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String throwableToString(java.lang.Throwable r4) {
        /*
            if (r4 != 0) goto L_0x0005
            java.lang.String r4 = ""
            return r4
        L_0x0005:
            java.lang.String r0 = r4.getMessage()
            r1 = 0
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0046 }
            r2.<init>()     // Catch:{ all -> 0x0046 }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x0046 }
            r3.<init>(r2)     // Catch:{ all -> 0x0046 }
            java.lang.Throwable r1 = r4.getCause()     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x001e
            r4.printStackTrace(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0028
        L_0x001e:
            if (r1 == 0) goto L_0x0028
            r1.printStackTrace(r3)     // Catch:{ all -> 0x0044 }
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x0044 }
            goto L_0x001e
        L_0x0028:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r4.<init>()     // Catch:{ all -> 0x0044 }
            r4.append(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "\r\n"
            r4.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0044 }
            r4.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0044 }
            r3.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            return r4
        L_0x0044:
            r1 = r3
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.log.LoggerWrapper.throwableToString(java.lang.Throwable):java.lang.String");
    }
}
