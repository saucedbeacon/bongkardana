package com.alipay.iap.android.aplog.core.layout.mas;

import android.os.Build;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.aplog.log.apm.ApmLog;
import com.alipay.iap.android.aplog.util.DeviceUtil;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.NetUtil;

public class MasApmLog implements MasLog<ApmLog> {
    private static final String DIAGNOSE_MAGIC = "D-EM";
    private static final String STACK_FRAME = "stackFrame";
    private LogContext logContext;

    public MasApmLog(LogContext logContext2) {
        this.logContext = logContext2;
    }

    public String getLayout(ApmLog apmLog) {
        StringBuilder sb = new StringBuilder();
        sb.append(DIAGNOSE_MAGIC);
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.logContext.getProductID());
        LoggingUtil.appendParam(sb, this.logContext.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendParam(sb, this.logContext.getUserID());
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.logContext.getApplicationContext()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, apmLog.getType());
        LoggingUtil.appendParam(sb, apmLog.getBizType());
        if (apmLog.getCause() != null) {
            apmLog.getExtParam().put(STACK_FRAME, LoggingUtil.throwableToString(apmLog.getCause()));
        }
        LoggingUtil.appendExtParam(sb, apmLog.getExtParam());
        LoggingUtil.appendParam(sb, this.logContext.getLanguage());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getNumCoresOfCPU()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.getCPUMaxFreqMHz()));
        LoggingUtil.appendParam(sb, String.valueOf(String.valueOf(DeviceUtil.getTotalMem(this.logContext.getApplicationContext()))));
        LoggingUtil.appendParam(sb, (String) null);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb, this.logContext.getDeviceID());
        LoggingUtil.appendExtParam(sb, this.logContext.getBizExternParams());
        LoggingUtil.appendParam(sb, apmLog.getSequenceID());
        sb.append(MasLog.Constant.GAP);
        return sb.toString();
    }
}
