package com.alipay.mobile.common.logging.api;

import android.content.Context;
import com.alipay.mobile.common.logging.SyncLogUtil;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.impl.TraceLoggerImpl;

public class LoggerFactory {
    private LoggerFactory() {
    }

    public static synchronized void init(Context context) {
        synchronized (LoggerFactory.class) {
            SyncLogUtil.init(context);
        }
    }

    public static synchronized TraceLogger getTraceLogger() {
        TraceLoggerImpl traceLoggerImpl;
        synchronized (LoggerFactory.class) {
            traceLoggerImpl = new TraceLoggerImpl();
        }
        return traceLoggerImpl;
    }
}
