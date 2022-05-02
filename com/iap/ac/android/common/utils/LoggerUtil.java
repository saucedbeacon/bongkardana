package com.iap.ac.android.common.utils;

import android.util.Log;
import android.util.Pair;

public class LoggerUtil {
    public static String stackTraceToString(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-StackTrace:");
        for (StackTraceElement append : stackTrace) {
            sb.append("###\tat ");
            sb.append(append);
        }
        sb.append("###");
        return sb.toString();
    }

    public static String throwableToString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static Pair<String, String> backTrackInvoker() {
        return backTrackInvoker(2);
    }

    public static Pair<String, String> backTrackInvoker(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return Pair.create("", "");
        }
        if (i <= 0) {
            i = 1;
        }
        int i2 = i + 3;
        if (i2 >= stackTrace.length) {
            i2 = stackTrace.length - 1;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        if (stackTraceElement == null) {
            return Pair.create("", "");
        }
        return Pair.create(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
    }
}
