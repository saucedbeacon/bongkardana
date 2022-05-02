package com.alibaba.griver.api.common.monitor;

import com.alibaba.griver.api.common.GriverExtension;
import java.util.Map;

public interface GriverMonitorProxy extends GriverExtension {
    void error(String str, String str2, Map<String, String> map);

    void event(String str, String str2, Map<String, String> map);

    void pageDestroy(Object obj);

    void pageExit(Object obj, String str, String str2, Map<String, String> map);

    void pageStart(Object obj, String str);

    void performance(String str, String str2, Map<String, String> map);

    void upload();
}
