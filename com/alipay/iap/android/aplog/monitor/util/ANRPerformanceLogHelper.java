package com.alipay.iap.android.aplog.monitor.util;

import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.log.performance.PerformanceID;
import com.alipay.iap.android.aplog.log.performance.PerformanceLog;
import com.alipay.iap.android.aplog.monitor.api.APMConstants;
import java.util.Map;

public class ANRPerformanceLogHelper {
    public static PerformanceLog a(String str, String str2, Map<String, String> map) {
        PerformanceLog performanceLog = new PerformanceLog();
        performanceLog.setPerformanceID(PerformanceID.MONITORPOINT_KEYBIZTRACE);
        performanceLog.setLogCategory(LogCategory.LOG_CATEGORY_HIGHAVAIL);
        performanceLog.setBizType("BizCanNotUse");
        performanceLog.setParam1(APMConstants.f10655a);
        performanceLog.setParam2(str);
        performanceLog.setParam3(str2);
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                performanceLog.putExtParam((String) next.getKey(), (String) next.getValue());
            }
        }
        return performanceLog;
    }
}
