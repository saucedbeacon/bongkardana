package com.alipay.iap.android.aplog.core.logger;

public interface TraceLogger {
    void debug(String str, String str2);

    void debug(String str, String str2, Throwable th);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th);

    void error(String str, Throwable th);

    void info(String str, String str2);

    void info(String str, String str2, Throwable th);

    boolean isDebuggable();

    void verbose(String str, String str2);

    void verbose(String str, String str2, Throwable th);

    void warn(String str, String str2);

    void warn(String str, String str2, Throwable th);

    void warn(String str, Throwable th);
}
