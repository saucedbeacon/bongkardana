package com.alipay.zoloz.config.util;

public class ConfigLog {
    private static final boolean IS_DEBUG = false;

    private static boolean isDebug() {
        return false;
    }

    public static void d(String str, String str2) {
        isDebug();
    }

    public static void w(String str, String str2) {
        isDebug();
    }

    public static void e(String str, String str2, Exception exc) {
        isDebug();
    }

    public static void e(String str, Exception exc) {
        isDebug();
    }

    public static void e(String str, String str2) {
        isDebug();
    }
}
