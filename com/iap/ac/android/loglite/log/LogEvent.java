package com.iap.ac.android.loglite.log;

import android.text.TextUtils;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import com.iap.ac.android.loglite.utils.TraceIdUtil;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class LogEvent {

    /* renamed from: a  reason: collision with root package name */
    public String f9736a;
    public Map<String, String> b;
    public String c;
    public Map<String, String> d = new ConcurrentHashMap();
    public String e;

    public LogEvent(String str, Map<String, String> map) {
        this.f9736a = str;
        this.b = map;
    }

    public Map<String, String> a() {
        Map<String, String> globalExtParam = AnalyticsContext.getInstance().getGlobalExtParam();
        if (globalExtParam != null && globalExtParam.size() > 0) {
            for (Map.Entry next : globalExtParam.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (!TextUtils.isEmpty(str)) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    this.b.put(str, str2);
                }
            }
        }
        return this.b;
    }

    public String b() {
        StringBuilder sb = new StringBuilder("20000000");
        sb.append(LoggingUtil.getServerTime());
        if (TraceIdUtil.f9746a == 10000) {
            TraceIdUtil.f9746a = 1;
        }
        Locale locale = Locale.getDefault();
        int i = TraceIdUtil.f9746a;
        TraceIdUtil.f9746a = i + 1;
        sb.append(String.format(locale, "%04d", new Object[]{Integer.valueOf(i)}));
        return sb.toString();
    }

    public String c() {
        return TextUtils.isEmpty(this.c) ? d() : this.c;
    }

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public String g() {
        boolean z;
        boolean z2 = false;
        if (TextUtils.isEmpty(this.e)) {
            z2 = AnalyticsContext.getInstance().getConfigurationManager().e;
            z = AnalyticsContext.getInstance().getConfigurationManager().g;
        } else if ("ac_biz".equals(this.e)) {
            z2 = AnalyticsContext.getInstance().getConfigurationManager().c;
            z = AnalyticsContext.getInstance().getConfigurationManager().f;
        } else {
            z = false;
        }
        if (!z2) {
            return "-";
        }
        String openId = ACUserInfoManager.getInstance(this.e).getOpenId();
        if (TextUtils.isEmpty(openId)) {
            return "-";
        }
        return z ? AnalyticsContext.getInstance().getAnonymizationInfo(openId) : openId;
    }
}
