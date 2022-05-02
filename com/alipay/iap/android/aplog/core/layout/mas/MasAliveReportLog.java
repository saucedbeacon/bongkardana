package com.alipay.iap.android.aplog.core.layout.mas;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.aplog.log.behavior.AliveReportLog;
import com.alipay.iap.android.aplog.util.DeviceUtil;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.NetUtil;
import com.alipay.iap.android.wallet.acl.base.Result;

public class MasAliveReportLog implements MasLog<AliveReportLog> {
    private static final String LOG_MAGIC = "D-VM";
    public static final String TAG = "MasAliveReportLog";
    private LogContext logContext;

    public MasAliveReportLog(LogContext logContext2) {
        this.logContext = logContext2;
    }

    public String getLayout(AliveReportLog aliveReportLog) {
        StringBuilder sb = new StringBuilder();
        sb.append(LOG_MAGIC);
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.logContext.getProductID());
        LoggingUtil.appendParam(sb, this.logContext.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb, this.logContext.getSessionID());
        LoggingUtil.appendParam(sb, this.logContext.getUserID());
        if (!TextUtils.isEmpty(aliveReportLog.getBehaviourID())) {
            LoggingUtil.appendParam(sb, aliveReportLog.getBehaviourID());
        } else {
            LoggingUtil.appendParam(sb, "event");
        }
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        if (aliveReportLog.getSeedID() != null) {
            LoggingUtil.appendParam(sb, aliveReportLog.getSeedID());
        }
        LoggingUtil.appendParam(sb, "reportActive");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aliveReportLog.getLoggerLevel());
        LoggingUtil.appendParam(sb, sb2.toString());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "c");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, aliveReportLog.getExtParam());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Result.ERROR_CODE_UNKNOWN_ERROR);
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.logContext.getApplicationContext()));
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, this.logContext.getLanguage());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getNumCoresOfCPU()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getCPUMaxFreqMHz()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getTotalMem(this.logContext.getApplicationContext())));
        LoggingUtil.appendExtParam(sb, this.logContext.getBizExternParams());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggingUtil.getResolution());
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb, aliveReportLog.getSequenceID());
        sb.append(MasLog.Constant.GAP);
        return sb.toString();
    }
}
