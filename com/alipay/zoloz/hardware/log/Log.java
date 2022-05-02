package com.alipay.zoloz.hardware.log;

public final class Log {
    public static final String CONFIRM = "confirm";
    public static final String DIAGNOSE = "diagnose";
    private static final String TAG = "HD";
    private static final String TAG_PREFIX = "HD_";
    private static Logger sTargetLogger = new AndroidLogger();

    static final class AndroidLogger extends Logger {
        private AndroidLogger() {
        }

        public final int verbose(String str, String str2) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(Thread.currentThread().getName());
            sb.append("]");
            sb.append(str2);
            return android.util.Log.v(str, sb.toString());
        }

        public final int debug(String str, String str2) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(Thread.currentThread().getName());
            sb.append("]");
            sb.append(str2);
            return android.util.Log.d(str, sb.toString());
        }

        public final int info(String str, String str2) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(Thread.currentThread().getName());
            sb.append("]");
            sb.append(str2);
            return android.util.Log.i(str, sb.toString());
        }

        public final int warn(String str, String str2) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(Thread.currentThread().getName());
            sb.append("]");
            sb.append(str2);
            return android.util.Log.w(str, sb.toString());
        }

        public final int error(String str, String str2) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(Thread.currentThread().getName());
            sb.append("]");
            sb.append(str2);
            return android.util.Log.e(str, sb.toString());
        }

        /* access modifiers changed from: protected */
        public final String getStackTraceString(Throwable th) {
            return android.util.Log.getStackTraceString(th);
        }
    }

    private Log() {
    }

    public static void setLogLevel(int i) {
        Logger logger = sTargetLogger;
        if (logger != null) {
            logger.setLogLevel(i);
        }
    }

    public static void setLogger(Logger logger) {
        sTargetLogger = logger;
    }

    public static void v(String str) {
        sTargetLogger.v(TAG, str);
    }

    public static void v(String str, String str2) {
        sTargetLogger.v(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void d(String str) {
        sTargetLogger.d(TAG, str);
    }

    public static void d(String str, String str2) {
        sTargetLogger.d(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void i(String str) {
        sTargetLogger.i(TAG, str);
    }

    public static void i(String str, String str2) {
        sTargetLogger.i(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void w(String str) {
        sTargetLogger.w(TAG, str);
    }

    public static void w(String str, String str2) {
        sTargetLogger.w(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void w(Throwable th) {
        sTargetLogger.w(TAG, th);
    }

    public static void w(String str, Throwable th) {
        sTargetLogger.w(TAG_PREFIX.concat(String.valueOf(str)), th);
    }

    public static void w(String str, String str2, Throwable th) {
        sTargetLogger.w(TAG_PREFIX.concat(String.valueOf(str)), str2, th);
    }

    public static void e(String str) {
        sTargetLogger.e(TAG, str);
    }

    public static void e(String str, String str2) {
        sTargetLogger.e(TAG_PREFIX.concat(String.valueOf(str)), str2);
    }

    public static void e(Throwable th) {
        sTargetLogger.e(TAG, th);
    }

    public static void e(String str, Throwable th) {
        sTargetLogger.e(TAG_PREFIX.concat(String.valueOf(str)), th);
    }

    public static void e(String str, String str2, Throwable th) {
        sTargetLogger.e(TAG_PREFIX.concat(String.valueOf(str)), str2, th);
    }
}
