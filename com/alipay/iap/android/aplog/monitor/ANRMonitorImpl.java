package com.alipay.iap.android.aplog.monitor;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogHelper;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.util.ANRPerformanceLogHelper;
import com.alipay.iap.android.aplog.monitor.util.ANRUtil;
import java.util.HashMap;
import java.util.Map;

public class ANRMonitorImpl extends ANRMonitor {
    /* access modifiers changed from: package-private */
    public String b() {
        return "SMOOTHNESS_KEY_TIME_TODAY_FOR_ANR";
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return "SMOOTHNESS_KEY_LAST_DAY_TIME_FOR_ANR";
    }

    public ANRMonitorImpl(long j, String str) {
        super(j, str);
        this.f = new ANRTimeOuter(this, j);
    }

    /* access modifiers changed from: package-private */
    public void c(long j, long j2) {
        if (d()) {
            LoggerFactory.getTraceLogger().info("ANRMonitor", "notifyBlockEvent");
            boolean z = true;
            if (this.b != j) {
                z = false;
            }
            try {
                String a2 = a(j, j2);
                String str = this.f10651a;
                if (!ANRUtil.a(0, a2)) {
                    str = "1001";
                }
                g = a2.hashCode();
                HashMap hashMap = new HashMap();
                hashMap.put("stackFrame", a2);
                hashMap.put("errorCode", str);
                String a3 = this.d.a(j, j2);
                if (!TextUtils.isEmpty(a3)) {
                    hashMap.put("threadsTrace", a3);
                }
                String a4 = this.c.a(j, j2);
                if (!TextUtils.isEmpty(a4)) {
                    hashMap.put("historyStacks", a4);
                }
                hashMap.put("cpuBusy", String.valueOf(this.e.a(j, j2)));
                String d = this.e.d();
                if (!TextUtils.isEmpty(d)) {
                    hashMap.put("cpuRate", d);
                }
                String concat = "startTime:".concat(String.valueOf(j));
                StringBuilder sb = new StringBuilder();
                sb.append(concat);
                sb.append(" endTime:");
                sb.append(j2);
                hashMap.put("timePeriod", sb.toString());
                if (z) {
                    a(hashMap);
                    LoggerFactory.getTraceLogger().warn("ANRMonitor", "report:".concat(String.valueOf(str)));
                    return;
                }
                LoggerFactory.getTraceLogger().warn("ANRMonitor", "no report:".concat(String.valueOf(str)));
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().warn("ANRMonitor", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, String> map) {
        LogHelper.performance(ANRPerformanceLogHelper.a("APM_ANR", this.f10651a, map));
        a();
    }
}
