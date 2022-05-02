package com.alipay.iap.android.aplog.core.logger;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.Level;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.TraceLog;
import com.alipay.iap.android.aplog.util.LoggingUtil;

public class TraceLoggerImpl implements TraceLogger {
    public boolean isDebuggable() {
        return LoggingUtil.isDebuggable();
    }

    public void verbose(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.VERBOSE, str2, (Throwable) null));
            }
        }
    }

    public void verbose(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.VERBOSE, str2, th));
            }
        }
    }

    public void debug(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.DEBUG, str2, (Throwable) null));
            }
        }
    }

    public void debug(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.DEBUG, str2, th));
            }
        }
    }

    public void info(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.INFO, str2, (Throwable) null));
            }
        }
    }

    public void info(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.INFO, str2, th));
            }
        }
    }

    public void warn(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.WARN, str2, (Throwable) null));
            }
        }
    }

    public void warn(String str, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.WARN, LoggingUtil.throwableToString(th), th));
            }
        }
    }

    public void warn(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.WARN, str2, th));
            }
        }
    }

    public void error(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.ERROR, str2, (Throwable) null));
            }
        }
    }

    public void error(String str, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            if (isDebuggable()) {
                th.getMessage();
            }
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.ERROR, LoggingUtil.throwableToString(th), th));
            }
        }
    }

    public void error(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            isDebuggable();
            if (LoggerFactory.getLogContext() != null) {
                LoggerFactory.getLogContext().appendLog(new TraceLog(str, Level.ERROR, str2, th));
            }
        }
    }
}
