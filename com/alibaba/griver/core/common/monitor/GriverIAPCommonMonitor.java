package com.alibaba.griver.core.common.monitor;

import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import com.alipay.iap.android.common.log.MonitorWrapper;
import java.util.HashMap;
import java.util.Map;

public class GriverIAPCommonMonitor implements GriverMonitorProxy {
    public void performance(String str, String str2, Map<String, String> map) {
        MonitorWrapper.performance(str, str2, map);
    }

    public void event(String str, String str2, Map<String, String> map) {
        MonitorWrapper.behaviour(str, str2, map);
    }

    public void error(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("exceptionType", str);
        MonitorWrapper.exception(str2, map);
    }

    public void pageStart(Object obj, String str) {
        MonitorWrapper.pageOnStart(obj, str);
    }

    public void pageExit(Object obj, String str, String str2, Map<String, String> map) {
        MonitorWrapper.pageOnEnd(obj, str, str2, map);
    }

    public void pageDestroy(Object obj) {
        MonitorWrapper.pageOnDestroy(obj);
    }

    public void upload() {
        MonitorWrapper.flush();
    }
}
