package com.alipay.iap.android.aplog.monitor;

import android.app.ActivityManager;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogHelper;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.HashMap;
import java.util.Map;

public class LagMonitorImpl extends ANRMonitor {
    /* access modifiers changed from: package-private */
    public String b() {
        return "SMOOTHNESS_KEY_TIME_TODAY_FOR_LAG";
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return "SMOOTHNESS_KEY_LAST_DAY_TIME_FOR_LAG";
    }

    public LagMonitorImpl(long j, String str) {
        super(j, str);
        this.f = new LagTimeOuter(this, j);
    }

    /* access modifiers changed from: package-private */
    public void c(long j, long j2) {
        if (d()) {
            HashMap hashMap = new HashMap();
            String f = f();
            if (!TextUtils.isEmpty(f) && f.hashCode() != g) {
                hashMap.put("stackFrame", f);
                hashMap.put("currentPage", h());
                hashMap.put("lagTime", String.valueOf(j2 - j));
                a(hashMap);
            }
            g = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public String h() {
        try {
            return ((ActivityManager) LoggerFactory.getLogContext().getApplicationContext().getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getRunningTasks(1).get(0).topActivity.getClassName();
        } catch (Exception e) {
            LoggerFactory.getTraceLogger().error("ANRMonitor", TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, String> map) {
        LogHelper.apm("performance", "lag", (Throwable) null, map);
        a();
    }
}
