package com.iap.ac.android.loglite.log;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.DeviceHWInfo;
import com.iap.ac.android.loglite.utils.DeviceUtil;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class BehaviorLog extends LogEvent {
    public Map<String, String> f;
    public String g;

    public BehaviorLog(String str, Map<String, String> map) {
        super(str, map);
        h();
    }

    public String d() {
        return "user_behavior";
    }

    public String e() {
        return LogCategory.LOG_BEHAVIOUR_MANUAL;
    }

    public String f() {
        AnalyticsContext instance = AnalyticsContext.getInstance();
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = this.b;
        boolean equals = TextUtils.equals(SummaryActivity.CHECKED, map != null ? map.get(GriverMonitorConstants.KEY_AUTO_LOG) : null);
        sb.append(equals ? "D-AM" : "D-VM");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, instance.getProductId());
        LoggingUtil.appendParam(sb, instance.getContextInfo().b);
        LoggingUtil.appendParam(sb, "2");
        instance.getContextInfo();
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, instance.getSessionId());
        LoggingUtil.appendParam(sb, g());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(equals ? "auto_" : "");
        sb2.append(i());
        LoggingUtil.appendParam(sb, sb2.toString());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, m());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, this.f9736a);
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, c());
        LoggingUtil.appendParam(sb, "c");
        Map<String, String> map2 = this.b;
        LoggingUtil.appendParam(sb, map2 != null ? map2.get("spmtracker_refer_page") : "-");
        LoggingUtil.appendParam(sb, k());
        LoggingUtil.appendParam(sb, l());
        LoggingUtil.appendExtParam(sb, a());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, n());
        LoggingUtil.appendParam(sb, instance.getInstanceId());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, j());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Result.ERROR_CODE_UNKNOWN_ERROR);
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, BizCodeMatchUtils.a((Context) instance.getApplication()));
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, Locale.getDefault().toString());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWInfo.a()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.a()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceUtil.a(instance.getApplication())));
        LoggingUtil.appendExtParam(sb, instance.getExtraParamMap());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, LoggingUtil.getResolution());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, b());
        instance.getApplication();
        synchronized (DeviceUtil.class) {
        }
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, this.f);
        sb.append(MasLog.Constant.GAP);
        return sb.toString();
    }

    public final void h() {
        HashMap hashMap = new HashMap();
        this.f = hashMap;
        hashMap.put(H5GetLogInfoBridge.RESULT_TIMEZONE, TimeZone.getDefault().getID());
        this.f.put("OS", "android");
        this.f.put("TimeStamp", String.valueOf(System.currentTimeMillis()));
    }

    public String i() {
        return TextUtils.isEmpty(this.g) ? "event" : this.g;
    }

    public String j() {
        return "-";
    }

    public String k() {
        return "-";
    }

    public String l() {
        return "-";
    }

    public String m() {
        return "-";
    }

    public String n() {
        return "-";
    }
}
