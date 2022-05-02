package com.google.android.datatransport.runtime.logging;

public final class Logging {
    private Logging() {
    }

    private static String getTag(String str) {
        return "TransportRuntime.".concat(String.valueOf(str));
    }

    public static void d(String str, String str2) {
        getTag(str);
    }

    public static void d(String str, String str2, Object obj) {
        getTag(str);
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        getTag(str);
    }

    public static void d(String str, String str2, Object... objArr) {
        getTag(str);
    }

    public static void i(String str, String str2) {
        getTag(str);
    }

    public static void e(String str, String str2, Throwable th) {
        getTag(str);
    }

    public static void w(String str, String str2, Object obj) {
        getTag(str);
    }
}
