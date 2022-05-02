package com.alipay.iap.android.aplog.core.layout.mas;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.aplog.log.performance.PerformanceLog;
import com.alipay.iap.android.aplog.util.DeviceUtil;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.NetUtil;
import com.alipay.iap.android.wallet.acl.base.Result;

public class MasPerformanceLog implements MasLog<PerformanceLog> {
    private static final String OS = "android";
    private static final String PERFORMANCE_MAGIC = "D-MM";
    private LogContext logContext;

    public MasPerformanceLog(LogContext logContext2) {
        this.logContext = logContext2;
    }

    public String getLayout(PerformanceLog performanceLog) {
        StringBuilder sb = new StringBuilder();
        sb.append(PERFORMANCE_MAGIC);
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.logContext.getProductID());
        LoggingUtil.appendParam(sb, this.logContext.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb, this.logContext.getSessionID());
        LoggingUtil.appendParam(sb, this.logContext.getUserID());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Result.ERROR_CODE_UNKNOWN_ERROR);
        if (TextUtils.isEmpty(performanceLog.getPerformanceIdDesc())) {
            LoggingUtil.appendParam(sb, performanceLog.getPerformanceID().getDes());
        } else {
            LoggingUtil.appendParam(sb, performanceLog.getPerformanceIdDesc());
        }
        LoggingUtil.appendParam(sb, performanceLog.getBizType());
        LoggingUtil.appendParam(sb, performanceLog.getParam1());
        LoggingUtil.appendParam(sb, performanceLog.getParam2());
        LoggingUtil.appendParam(sb, performanceLog.getParam3());
        LoggingUtil.appendExtParam(sb, performanceLog.getExtParam());
        LoggingUtil.appendParam(sb, OS);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.logContext.getApplicationContext()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb, this.logContext.getLanguage());
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getNumCoresOfCPU()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getCPUMaxFreqMHz()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getTotalMem(this.logContext.getApplicationContext())));
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, this.logContext.getBizExternParams());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggingUtil.getResolution());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb, performanceLog.getSequenceID());
        LoggingUtil.appendParam(sb, String.valueOf(performanceLog.getLoggerLevel()));
        sb.append(MasLog.Constant.GAP);
        return sb.toString();
    }
}
