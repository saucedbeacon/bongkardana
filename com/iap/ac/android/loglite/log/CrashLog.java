package com.iap.ac.android.loglite.log;

import android.content.Context;
import android.os.Build;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import com.uc.crashsdk.export.LogType;
import java.util.Locale;
import java.util.Map;

public class CrashLog extends LogEvent {
    public CrashLog(String str, Map<String, String> map) {
        super(str, map);
    }

    public String d() {
        return "crash";
    }

    public String e() {
        return "crash";
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        AnalyticsContext instance = AnalyticsContext.getInstance();
        sb.append("e");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, instance.getProductId());
        LoggingUtil.appendParam(sb, instance.getContextInfo().b);
        LoggingUtil.appendParam(sb, "2");
        instance.getContextInfo();
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, g());
        LoggingUtil.appendParam(sb, "exception");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "call_write_crash_log_api");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "MonitorPoint_Crash");
        LoggingUtil.appendParam(sb, this.b.get("stackTrace"));
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, this.f9736a);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, BizCodeMatchUtils.a((Context) instance.getApplication()));
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, instance.getInstanceId());
        LoggingUtil.appendParam(sb, Locale.getDefault().toString());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, this.b.get("threadName"));
        LoggingUtil.appendParam(sb, LogType.JAVA_TYPE);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, instance.getExtraParamMap());
        LoggingUtil.appendParam(sb, b());
        sb.append(MasLog.Constant.GAP);
        return sb.toString();
    }
}
