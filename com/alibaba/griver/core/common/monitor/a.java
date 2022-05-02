package com.alibaba.griver.core.common.monitor;

import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class a {
    public static GriverMonitorProxy a() {
        try {
            Class.forName("com.iap.ac.android.loglite.api.InnerAnalyticsHelper");
            GriverLogger.d("GriverMonitorProxyManager", "use log lite");
            return new GriverIAPLiteMonitor();
        } catch (Exception unused) {
            try {
                Class.forName("com.alipay.iap.android.aplog.api.LogHelper");
                GriverLogger.d("GriverMonitorProxyManager", "use iap log");
                return new GriverIAPLogMonitor();
            } catch (Exception unused2) {
                return new GriverEmptyMonitor();
            }
        }
    }
}
