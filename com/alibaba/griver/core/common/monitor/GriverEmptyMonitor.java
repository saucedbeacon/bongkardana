package com.alibaba.griver.core.common.monitor;

import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import java.util.Map;

public class GriverEmptyMonitor implements GriverMonitorProxy {
    public void error(String str, String str2, Map<String, String> map) {
    }

    public void event(String str, String str2, Map<String, String> map) {
    }

    public void pageDestroy(Object obj) {
    }

    public void pageExit(Object obj, String str, String str2, Map<String, String> map) {
    }

    public void pageStart(Object obj, String str) {
    }

    public void performance(String str, String str2, Map<String, String> map) {
    }

    public void upload() {
    }
}
