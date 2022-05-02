package com.alibaba.griver.bluetooth.altbeacon.beacon.logging;

import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class VerboseAndroidLogger extends AbstractAndroidLogger {
    VerboseAndroidLogger() {
    }

    public final void v(String str, String str2, Object... objArr) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-370966599, oncanceled);
            onCancelLoad.getMin(-370966599, oncanceled);
        }
        RVLogger.d(str, formatString(str2, objArr));
    }

    public final void v(Throwable th, String str, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatString(str2, objArr));
        sb.append(" ");
        sb.append(Log.getStackTraceString(th));
        RVLogger.d(str, sb.toString());
    }

    public final void d(String str, String str2, Object... objArr) {
        RVLogger.d(str, formatString(str2, objArr));
    }

    public final void d(Throwable th, String str, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatString(str2, objArr));
        sb.append(" ");
        sb.append(Log.getStackTraceString(th));
        RVLogger.d(str, sb.toString());
    }

    public final void i(String str, String str2, Object... objArr) {
        RVLogger.d(str, formatString(str2, objArr));
    }

    public final void i(Throwable th, String str, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatString(str2, objArr));
        sb.append(" ");
        sb.append(Log.getStackTraceString(th));
        RVLogger.d(str, sb.toString());
    }

    public final void w(String str, String str2, Object... objArr) {
        RVLogger.w(str, formatString(str2, objArr));
    }

    public final void w(Throwable th, String str, String str2, Object... objArr) {
        RVLogger.w(str, formatString(str2, objArr), th);
    }

    public final void e(String str, String str2, Object... objArr) {
        RVLogger.e(str, formatString(str2, objArr));
    }

    public final void e(Throwable th, String str, String str2, Object... objArr) {
        RVLogger.e(str, formatString(str2, objArr), th);
    }
}
