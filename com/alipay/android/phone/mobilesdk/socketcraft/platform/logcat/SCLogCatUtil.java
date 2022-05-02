package com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat;

public final class SCLogCatUtil {
    public static final void info(String str, String str2) {
        getSCLog().info("WS_".concat(String.valueOf(str)), str2);
    }

    public static final void verbose(String str, String str2) {
        getSCLog().verbose("WS_".concat(String.valueOf(str)), str2);
    }

    public static final void debug(String str, String str2) {
        getSCLog().debug("WS_".concat(String.valueOf(str)), str2);
    }

    public static final void warn(String str, String str2) {
        getSCLog().warn("WS_".concat(String.valueOf(str)), str2);
    }

    public static final void warn(String str, Throwable th) {
        getSCLog().warn("WS_".concat(String.valueOf(str)), th);
    }

    public static final void warn(String str, String str2, Throwable th) {
        getSCLog().warn("WS_".concat(String.valueOf(str)), str2, th);
    }

    public static final void error(String str, String str2) {
        getSCLog().error("WS_".concat(String.valueOf(str)), str2);
    }

    public static final void error(String str, Throwable th) {
        getSCLog().error("WS_".concat(String.valueOf(str)), th);
    }

    public static final void error(String str, String str2, Throwable th) {
        getSCLog().error("WS_".concat(String.valueOf(str)), str2, th);
    }

    public static final void printInfo(String str, String str2) {
        getSCLog().printInfo("WS_".concat(String.valueOf(str)), str2);
    }

    public static final void printError(String str, Throwable th) {
        getSCLog().printError("WS_".concat(String.valueOf(str)), th);
    }

    private static SCLogCatInterface getSCLog() {
        return SCLogCatFactory.getSCLog();
    }
}
