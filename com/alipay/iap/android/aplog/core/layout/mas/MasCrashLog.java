package com.alipay.iap.android.aplog.core.layout.mas;

import android.os.Build;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.aplog.core.os.LogLifecycleCallback;
import com.alipay.iap.android.aplog.log.crash.CrashLog;
import com.alipay.iap.android.aplog.util.CpuInfo;
import com.alipay.iap.android.aplog.util.DeviceUtil;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.NetUtil;
import com.uc.crashsdk.export.LogType;

public class MasCrashLog implements MasLog<CrashLog> {
    public static final String TAG = "MasCrashLog";

    /* renamed from: a  reason: collision with root package name */
    private LogContext f9298a;

    public MasCrashLog(LogContext logContext) {
        this.f9298a = logContext;
    }

    public String getLayout(CrashLog crashLog) {
        StringBuilder sb = new StringBuilder();
        sb.append("e");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.f9298a.getProductID());
        LoggingUtil.appendParam(sb, this.f9298a.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.f9298a.getDeviceID());
        LoggingUtil.appendExtParam(sb, crashLog.getExtParam());
        LoggingUtil.appendParam(sb, this.f9298a.getUserID());
        LoggingUtil.appendParam(sb, "exception");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "call_write_crash_log_api");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, crashLog.getExceptionID().getDes());
        LoggingUtil.appendParam(sb, crashLog.getStackTrace());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggerFactory.getLogContext().getLastPage());
        LoggingUtil.appendParam(sb, crashLog.getThreadName());
        LoggingUtil.appendParam(sb, LogLifecycleCallback.isBackground ? "bg" : "fg");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.f9298a.getApplicationContext()));
        LoggingUtil.appendParam(sb, a());
        LoggingUtil.appendParam(sb, this.f9298a.getProductVersion());
        LoggingUtil.appendParam(sb, this.f9298a.getDeviceID());
        LoggingUtil.appendParam(sb, this.f9298a.getLanguage());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        if (crashLog.getThreadName() != null) {
            LoggingUtil.appendParam(sb, crashLog.getThreadName());
        } else {
            LoggingUtil.appendParam(sb, "-");
        }
        LoggingUtil.appendParam(sb, crashLog.isJavaCrash() ? LogType.JAVA_TYPE : "native");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, this.f9298a.getBizExternParams());
        LoggingUtil.appendParam(sb, crashLog.getSequenceID());
        sb.append(MasLog.Constant.GAP);
        return sb.toString().replaceAll("\n", "###");
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeviceUtil.getNumCoresOfCPU());
        sb.append("_");
        sb.append(DeviceUtil.getCPUMaxFreqMHz());
        sb.append("_");
        sb.append(new CpuInfo().getCpuRateInfo());
        sb.append("_");
        sb.append(DeviceUtil.getTotalMem(this.f9298a.getApplicationContext()));
        sb.append("_");
        sb.append(DeviceUtil.getPidMemorySize(this.f9298a.getApplicationContext()));
        return sb.toString();
    }
}
