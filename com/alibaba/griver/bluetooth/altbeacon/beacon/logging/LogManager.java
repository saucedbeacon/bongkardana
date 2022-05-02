package com.alibaba.griver.bluetooth.altbeacon.beacon.logging;

public final class LogManager {

    /* renamed from: a  reason: collision with root package name */
    private static Logger f10252a = Loggers.infoLogger();
    private static boolean b = false;

    private LogManager() {
    }

    public static Logger getLogger() {
        return f10252a;
    }

    public static void setLogger(Logger logger) {
        if (logger != null) {
            f10252a = logger;
            return;
        }
        throw new NullPointerException("Logger may not be null.");
    }

    public static boolean isVerboseLoggingEnabled() {
        return b;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        b = z;
    }

    public static void v(String str, String str2, Object... objArr) {
        f10252a.v(str, str2, objArr);
    }

    public static void v(Throwable th, String str, String str2, Object... objArr) {
        f10252a.v(th, str, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        f10252a.d(str, str2, objArr);
    }

    public static void d(Throwable th, String str, String str2, Object... objArr) {
        f10252a.d(th, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        f10252a.i(str, str2, objArr);
    }

    public static void i(Throwable th, String str, String str2, Object... objArr) {
        f10252a.i(th, str, str2, objArr);
    }

    public static void w(String str, String str2, Object... objArr) {
        f10252a.w(str, str2, objArr);
    }

    public static void w(Throwable th, String str, String str2, Object... objArr) {
        f10252a.w(th, str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        f10252a.e(str, str2, objArr);
    }

    public static void e(Throwable th, String str, String str2, Object... objArr) {
        f10252a.e(th, str, str2, objArr);
    }
}
