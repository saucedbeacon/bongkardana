package com.iap.ac.android.loglite.log;

import android.content.Context;
import android.os.Build;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.DeviceHWInfo;
import com.iap.ac.android.loglite.utils.DeviceUtil;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import java.util.Locale;
import java.util.Map;

public class PerformanceLog extends LogEvent {
    public PerformanceLog(String str, Map<String, String> map) {
        super(str, map);
    }

    public String d() {
        return "performance";
    }

    public String e() {
        return "performance";
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        AnalyticsContext instance = AnalyticsContext.getInstance();
        sb.append("D-MM");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, instance.getProductId());
        LoggingUtil.appendParam(sb, instance.getContextInfo().b);
        LoggingUtil.appendParam(sb, "2");
        instance.getContextInfo();
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, instance.getSessionId());
        LoggingUtil.appendParam(sb, g());
        LoggingUtil.appendParam(sb, this.f9736a);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Result.ERROR_CODE_UNKNOWN_ERROR);
        LoggingUtil.appendParam(sb, h());
        LoggingUtil.appendParam(sb, c());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, a());
        LoggingUtil.appendParam(sb, "android");
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, BizCodeMatchUtils.a((Context) instance.getApplication()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, instance.getInstanceId());
        LoggingUtil.appendParam(sb, Locale.getDefault().toString());
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWInfo.a()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.a()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.a(instance.getApplication())));
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        Map<String, String> extraParamMap = instance.getExtraParamMap();
        Map<String, String> map = this.d;
        if (map != null && map.size() > 0) {
            extraParamMap.putAll(this.d);
        }
        LoggingUtil.appendExtParam(sb, extraParamMap);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggingUtil.getResolution());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, b());
        LoggingUtil.appendParam(sb, "2");
        sb.append(MasLog.Constant.GAP);
        return sb.toString();
    }

    public String h() {
        return "performance";
    }
}
