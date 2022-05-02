package com.alipay.mobile.verifyidentity.base.log;

import com.alipay.mobile.verifyidentity.adapterapi.log.ILog;
import com.alipay.mobile.verifyidentity.adapterapi.log.NormalLog;
import com.alipay.mobile.verifyidentity.base.adapter.AdapterManager;
import java.io.PrintWriter;
import java.io.StringWriter;

public class VILog {
    private static ILog log = null;
    private static String sExtraTag = "";

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    static {
        ILog log2 = AdapterManager.getConfig() != null ? AdapterManager.getConfig().getLog() : null;
        log = log2;
        if (log2 == null) {
            log2 = new NormalLog();
        }
        log = log2;
    }

    public static void e(String str, Throwable th) {
        getExceptionMsg(th);
    }

    public static void e(String str, String str2, Throwable th) {
        getExceptionMsg(th);
    }

    public static void w(String str, Throwable th) {
        getExceptionMsg(th);
    }

    public static void w(String str, String str2, Throwable th) {
        getExceptionMsg(th);
    }

    public static void i(String str, Throwable th) {
        getExceptionMsg(th);
    }

    public static void i(String str, String str2, Throwable th) {
        getExceptionMsg(th);
    }

    public static void d(String str, Throwable th) {
        getExceptionMsg(th);
    }

    public static void d(String str, String str2, Throwable th) {
        getExceptionMsg(th);
    }

    public static void v(String str, Throwable th) {
        getExceptionMsg(th);
    }

    public static void v(String str, String str2, Throwable th) {
        getExceptionMsg(th);
    }

    public static String getExceptionMsg(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            Throwable cause = th.getCause();
            if (cause == null) {
                th.printStackTrace(printWriter);
            }
            while (cause != null) {
                cause.printStackTrace(printWriter);
                cause = cause.getCause();
            }
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
