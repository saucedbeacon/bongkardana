package com.alibaba.ariver.app.api.monitor;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.List;
import java.util.Map;

public interface RVPerformanceTracker extends Proxiable {
    void addData2Performance(App app, String str, String str2, String str3);

    void addDatas2Performance(App app, String str, String str2, Map<String, String> map);

    void addEvent2Performance(App app, String str, String str2, Map<String, String> map);

    void init(String str, String str2, Long l, String str3);

    void setPerformanceStageReentrantWhiteList(List<String> list);

    void track(App app, String str, String str2);

    void track(App app, String str, String str2, long j);

    void track(App app, String str, String str2, Map<String, Object> map, Map<String, Object> map2, long j);

    void uploadPerfLog(App app, String str, String str2);
}
