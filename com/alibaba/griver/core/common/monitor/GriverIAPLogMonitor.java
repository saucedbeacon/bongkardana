package com.alibaba.griver.core.common.monitor;

import android.text.TextUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import com.alipay.iap.android.aplog.api.LogHelper;
import com.alipay.iap.android.aplog.api.TinyAppLogHelper;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;
import java.util.HashMap;
import java.util.Map;

public class GriverIAPLogMonitor implements GriverMonitorProxy {
    public void pageDestroy(Object obj) {
    }

    public void pageExit(Object obj, String str, String str2, Map<String, String> map) {
    }

    public void pageStart(Object obj, String str) {
    }

    public void performance(String str, String str2, Map<String, String> map) {
        TinyAppLogHelper.performance(str, str2, map);
    }

    public void event(String str, String str2, Map<String, String> map) {
        BehaviourLog behaviourLog = new BehaviourLog();
        behaviourLog.setSeedID(str);
        behaviourLog.setBizType(str2);
        if (map != null && map.size() > 0) {
            for (String next : map.keySet()) {
                if (!TextUtils.isEmpty(next)) {
                    String str3 = map.get(next);
                    if (!TextUtils.isEmpty(str3)) {
                        behaviourLog.putExtParam(next, str3);
                    }
                }
            }
        }
        if (LoggerFactory.getLogContext() != null) {
            LoggerFactory.getLogContext().appendLog(behaviourLog);
        }
    }

    public void error(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("exceptionType", str);
        LogHelper.exception(str2, map);
    }

    public void upload() {
        LoggerFactory.getLogContext().uploadAll();
    }
}
