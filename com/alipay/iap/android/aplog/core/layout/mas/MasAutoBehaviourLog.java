package com.alipay.iap.android.aplog.core.layout.mas;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.api.LogSeedID;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.log.behavior.AutoBehaviourLog;
import com.alipay.iap.android.aplog.util.DeviceUtil;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.NetUtil;
import com.alipay.iap.android.wallet.acl.base.Result;

public class MasAutoBehaviourLog implements MasLog<AutoBehaviourLog> {
    private static final String LOG_MAGIC = "D-AM";
    public static final String TAG = "MasAutoBehaviourLog";
    private LogContext logContext;

    public MasAutoBehaviourLog(LogContext logContext2) {
        this.logContext = logContext2;
    }

    public String getLayout(AutoBehaviourLog autoBehaviourLog) {
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        StringBuilder sb = new StringBuilder("last page:  ");
        sb.append(autoBehaviourLog.getBehaviourPageInfo().getLastPage());
        traceLogger.debug(TAG, sb.toString());
        autoBehaviourLog.dealAbTestInfo(autoBehaviourLog);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LOG_MAGIC);
        LoggingUtil.appendParam(sb2, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb2, this.logContext.getProductID());
        LoggingUtil.appendParam(sb2, this.logContext.getProductVersion());
        LoggingUtil.appendParam(sb2, "2");
        LoggingUtil.appendParam(sb2, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb2, this.logContext.getSessionID());
        LoggingUtil.appendParam(sb2, this.logContext.getUserID());
        if (!TextUtils.isEmpty(autoBehaviourLog.getBehaviourID())) {
            LoggingUtil.appendParam(sb2, autoBehaviourLog.getBehaviourID());
        } else {
            LoggingUtil.appendParam(sb2, "event");
        }
        LoggingUtil.appendParam(sb2, autoBehaviourLog.getAbTestInfo());
        if (autoBehaviourLog.getBehaviourPageInfo() == null || TextUtils.isEmpty(autoBehaviourLog.getBehaviourPageInfo().getLastPage())) {
            LoggingUtil.appendParam(sb2, "-");
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(LoggingUtil.getViewID(autoBehaviourLog.getBehaviourPageInfo().getLastPage()));
            sb3.append("|");
            sb3.append(autoBehaviourLog.getBehaviourPageInfo().getLastPage());
            LoggingUtil.appendParam(sb2, sb3.toString());
        }
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, "-");
        if (autoBehaviourLog.getBehaviourPageInfo().getViewID() != null) {
            StringBuilder sb4 = new StringBuilder("//");
            sb4.append(autoBehaviourLog.getBehaviourPageInfo().getViewID());
            LoggingUtil.appendParam(sb2, sb4.toString());
        } else {
            LoggingUtil.appendParam(sb2, "-");
        }
        LoggingUtil.appendParam(sb2, "-");
        if (autoBehaviourLog.getSeedID() != null) {
            LoggingUtil.appendParam(sb2, autoBehaviourLog.getSeedID());
        } else {
            LoggingUtil.appendParam(sb2, "-");
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(autoBehaviourLog.getLoggerLevel());
        LoggingUtil.appendParam(sb2, sb5.toString());
        LoggingUtil.appendParam(sb2, LogSeedID.AUTO_TRACK);
        LoggingUtil.appendParam(sb2, "c");
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendExtParam(sb2, autoBehaviourLog.getExtParam());
        LoggingUtil.appendParam(sb2, autoBehaviourLog.getSourceID());
        if (autoBehaviourLog.getBehaviourPageInfo().getEndTime() == null || autoBehaviourLog.getBehaviourPageInfo().getStartTime() == null) {
            LoggingUtil.appendParam(sb2, "-");
        } else {
            try {
                LoggingUtil.appendParam(sb2, String.valueOf(Long.valueOf(Long.valueOf(autoBehaviourLog.getBehaviourPageInfo().getEndTime()).longValue() - Long.valueOf(autoBehaviourLog.getBehaviourPageInfo().getStartTime()).longValue())));
            } catch (Exception unused) {
            }
        }
        LoggingUtil.appendParam(sb2, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb2, "-");
        if (autoBehaviourLog.getBehaviourPageInfo() == null || autoBehaviourLog.getBehaviourPageInfo().getPageID() == null) {
            LoggingUtil.appendParam(sb2, "-");
        } else {
            LoggingUtil.appendParam(sb2, autoBehaviourLog.getBehaviourPageInfo().getPageID());
        }
        if (autoBehaviourLog.getBehaviourPageInfo() == null || autoBehaviourLog.getBehaviourPageInfo().getLastPage() == null) {
            LoggingUtil.appendParam(sb2, "-");
        } else {
            LoggingUtil.appendParam(sb2, autoBehaviourLog.getBehaviourPageInfo().getLastPage());
        }
        if (autoBehaviourLog.getBehaviourPageInfo().getViewID() != null) {
            LoggingUtil.appendParam(sb2, autoBehaviourLog.getBehaviourPageInfo().getViewID());
        } else {
            LoggingUtil.appendParam(sb2, "-");
        }
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, Result.ERROR_CODE_UNKNOWN_ERROR);
        LoggingUtil.appendParam(sb2, Build.MODEL);
        LoggingUtil.appendParam(sb2, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb2, NetUtil.getNetworkTypeOptimized(this.logContext.getApplicationContext()));
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, this.logContext.getLanguage());
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, String.valueOf(DeviceUtil.getNumCoresOfCPU()));
        LoggingUtil.appendParam(sb2, String.valueOf(DeviceUtil.getCPUMaxFreqMHz()));
        LoggingUtil.appendParam(sb2, String.valueOf(DeviceUtil.getTotalMem(this.logContext.getApplicationContext())));
        LoggingUtil.appendExtParam(sb2, this.logContext.getBizExternParams());
        LoggingUtil.appendParam(sb2, "-");
        LoggingUtil.appendParam(sb2, LoggingUtil.getResolution());
        LoggingUtil.appendParam(sb2, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb2, autoBehaviourLog.getSequenceID());
        sb2.append(MasLog.Constant.GAP);
        return sb2.toString();
    }
}
