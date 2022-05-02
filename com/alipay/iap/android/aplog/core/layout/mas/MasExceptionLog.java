package com.alipay.iap.android.aplog.core.layout.mas;

import android.os.Build;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.aplog.core.os.LogLifecycleCallback;
import com.alipay.iap.android.aplog.log.exception.ExceptionLog;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.NetUtil;

public class MasExceptionLog implements MasLog<ExceptionLog> {
    private static final String BEHAVIOR_ID = "exception";
    private static final String EXCEPTION_MAGIC = "e";
    public static final String TAG = "MasExceptionLog";
    private LogContext logContext;

    public MasExceptionLog(LogContext logContext2) {
        this.logContext = logContext2;
    }

    public String getLayout(ExceptionLog exceptionLog) {
        StringBuilder sb = new StringBuilder();
        sb.append(EXCEPTION_MAGIC);
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.logContext.getProductID());
        LoggingUtil.appendParam(sb, this.logContext.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb, this.logContext.getSessionID());
        LoggingUtil.appendParam(sb, this.logContext.getUserID());
        LoggingUtil.appendParam(sb, "exception");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, exceptionLog.getExceptionType());
        LoggingUtil.appendParam(sb, exceptionLog.getStackTrace());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggerFactory.getLogContext().getLastPage());
        LoggingUtil.appendParam(sb, exceptionLog.getThreadName());
        LoggingUtil.appendParam(sb, LogLifecycleCallback.isBackground ? "bg" : "fg");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.logContext.getApplicationContext()));
        LoggingUtil.appendExtParam(sb, exceptionLog.getExtParam());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb, this.logContext.getLanguage());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        if (exceptionLog.getThreadName() != null) {
            LoggingUtil.appendParam(sb, exceptionLog.getThreadName());
        } else {
            LoggingUtil.appendParam(sb, "-");
        }
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        sb.append(MasLog.Constant.GAP);
        return sb.toString().replaceAll("\n", "###");
    }
}
