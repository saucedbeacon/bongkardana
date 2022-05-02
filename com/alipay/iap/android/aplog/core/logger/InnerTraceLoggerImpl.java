package com.alipay.iap.android.aplog.core.logger;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class InnerTraceLoggerImpl implements TraceLogger {
    public boolean isDebuggable() {
        return LoggingUtil.isDebuggable();
    }

    public void verbose(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void verbose(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void debug(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(871377713, oncanceled);
            onCancelLoad.getMin(871377713, oncanceled);
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void debug(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void info(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void info(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void warn(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void warn(String str, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            isDebuggable();
        }
    }

    public void warn(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            isDebuggable();
        }
    }

    public void error(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
        }
    }

    public void error(String str, Throwable th) {
        if (!TextUtils.isEmpty(str) && isDebuggable()) {
            th.getMessage();
        }
    }

    public void error(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            isDebuggable();
        }
    }
}
