package com.alipay.mobile.security.bio.utils;

import android.util.Log;

public final class BioLog {
    public static final String DIAGNOSE = "diagnose";
    private static final String TAG = "BIOLOGY";
    private static final String TAG_PREFIX = "BIOLOGY_";
    private static Logger sTargetLogger = new AndroidLogger();

    static final class AndroidLogger extends Logger {
        private AndroidLogger() {
        }

        public final int verbose(String str, String str2) {
            return Log.v(str, str2);
        }

        public final int debug(String str, String str2) {
            return Log.d(str, str2);
        }

        public final int info(String str, String str2) {
            return Log.i(str, str2);
        }

        public final int warn(String str, String str2) {
            return Log.w(str, str2);
        }

        public final int error(String str, String str2) {
            return Log.e(str, str2);
        }

        /* access modifiers changed from: protected */
        public final String getStackTraceString(Throwable th) {
            return Log.getStackTraceString(th);
        }
    }

    private BioLog() {
    }

    public static void setLogger(Logger logger) {
        sTargetLogger = logger;
    }

    public static void v(String str) {
        sTargetLogger.v("BIOLOGY", str);
    }

    public static void v(String str, String str2) {
        sTargetLogger.v(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void d(String str) {
        sTargetLogger.d("BIOLOGY", str);
    }

    public static void d(String str, String str2) {
        sTargetLogger.d(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void i(String str) {
        sTargetLogger.i("BIOLOGY", str);
    }

    public static void i(String str, String str2) {
        sTargetLogger.i(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void w(String str) {
        sTargetLogger.w("BIOLOGY", str);
    }

    public static void w(String str, String str2) {
        sTargetLogger.w(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void w(Throwable th) {
        sTargetLogger.w("BIOLOGY", th);
    }

    public static void w(String str, Throwable th) {
        sTargetLogger.w(TAG_PREFIX.concat(String.valueOf(str)), th);
    }

    public static void w(String str, String str2, Throwable th) {
        sTargetLogger.w(TAG_PREFIX.concat(String.valueOf(str)), str2, th);
    }

    public static void e(String str) {
        sTargetLogger.e("BIOLOGY", str);
    }

    public static void e(String str, String str2) {
        sTargetLogger.e(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void e(Throwable th) {
        sTargetLogger.e("BIOLOGY", th);
    }

    public static void e(String str, Throwable th) {
        sTargetLogger.e(TAG_PREFIX.concat(String.valueOf(str)), th);
    }

    public static void e(String str, String str2, Throwable th) {
        sTargetLogger.e(TAG_PREFIX.concat(String.valueOf(str)), str2, th);
    }
}
