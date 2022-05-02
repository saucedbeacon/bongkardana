package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;

public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    private Log() {
    }

    public static int getLogLevel() {
        return logLevel;
    }

    public final boolean getLogStackTraces() {
        return logStackTraces;
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    public static void setLogStackTraces(boolean z) {
        logStackTraces = z;
    }

    public static void d(String str, String str2, @Nullable Throwable th) {
        if (!logStackTraces) {
            d(str, appendThrowableMessage(str2, th));
        }
    }

    public static void i(String str, String str2, @Nullable Throwable th) {
        if (!logStackTraces) {
            i(str, appendThrowableMessage(str2, th));
        }
    }

    public static void w(String str, String str2, @Nullable Throwable th) {
        if (!logStackTraces) {
            w(str, appendThrowableMessage(str2, th));
        }
    }

    public static void e(String str, String str2, @Nullable Throwable th) {
        if (!logStackTraces) {
            e(str, appendThrowableMessage(str2, th));
        }
    }

    private static String appendThrowableMessage(String str, @Nullable Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(message);
        return sb.toString();
    }
}
