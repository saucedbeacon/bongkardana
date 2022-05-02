package com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat;

import com.google.firebase.perf.metrics.resource.ResourceType;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class JavaSCLogCatImpl implements SCLogCatInterface {
    public void info(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCommonPrefix(str, "I"));
        sb.append(":");
        sb.append(str2);
        systemOut(sb.toString());
    }

    public void verbose(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCommonPrefix(str, "V"));
        sb.append(":");
        sb.append(str2);
        systemOut(sb.toString());
    }

    public void debug(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCommonPrefix(str, "D"));
        sb.append(":");
        sb.append(str2);
        systemOut(sb.toString());
    }

    public void warn(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCommonPrefix(str, "W"));
        sb.append(":");
        sb.append(str2);
        systemOut(sb.toString());
    }

    public void warn(String str, Throwable th) {
        printLog(getCommonPrefix(str, "W"), th);
    }

    public void warn(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCommonPrefix(str, "W"));
        sb.append(":");
        sb.append(str2);
        printLog(sb.toString(), th);
    }

    private void systemOut(String str) {
        try {
            Class<?> cls = Class.forName("java.lang.System");
            Object obj = cls.getField("out").get(cls);
            obj.getClass().getMethod("println", new Class[]{String.class}).invoke(obj, new Object[]{str});
        } catch (Throwable unused) {
        }
    }

    public void error(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-332566084, oncanceled);
            onCancelLoad.getMin(-332566084, oncanceled);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getCommonPrefix(str, "E"));
        sb.append(":");
        sb.append(str2);
        printLog(sb.toString(), (Throwable) null);
    }

    public void error(String str, Throwable th) {
        printLog(getCommonPrefix(str, "E"), th);
    }

    public void error(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCommonPrefix(str, "E"));
        sb.append(":");
        sb.append(str2);
        printLog(sb.toString(), th);
    }

    public void printInfo(String str, String str2) {
        info(str, str2);
    }

    public void printError(String str, Throwable th) {
        error(str, th);
    }

    private String getCommonPrefix(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().toLocaleString());
        sb.append(" ");
        sb.append(Thread.currentThread().getId());
        sb.append(" ");
        sb.append(Thread.currentThread().getName());
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        return sb.toString();
    }

    private void printLog(String str, Throwable th) {
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(exception2String(th));
            str = sb.toString();
        }
        systemOut(str);
    }

    /* access modifiers changed from: protected */
    public String exception2String(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.getClass().getMethod(String.format("%s%s%s", new Object[]{"print", "Stack", ResourceType.TRACE}), new Class[]{PrintWriter.class}).invoke(th, new Object[]{printWriter});
            printWriter.flush();
        } catch (Throwable unused) {
        }
        return stringWriter.toString();
    }
}
