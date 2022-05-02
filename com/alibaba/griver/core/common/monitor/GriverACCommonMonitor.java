package com.alibaba.griver.core.common.monitor;

import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.common.log.event.PageLogEvent;
import java.util.Map;

public class GriverACCommonMonitor implements GriverMonitorProxy {
    public void performance(String str, String str2, Map<String, String> map) {
        LogEvent logEvent = new LogEvent(str, map);
        logEvent.eventType = LogEventType.PERFORMANCE_LOG;
        logEvent.bizCode = str2;
        ACMonitor.logEvent(logEvent);
    }

    public void event(String str, String str2, Map<String, String> map) {
        LogEvent logEvent = new LogEvent(str, map);
        logEvent.bizCode = str2;
        ACMonitor.logEvent(logEvent);
    }

    public void error(String str, String str2, Map<String, String> map) {
        LogEvent logEvent = new LogEvent(str, map);
        logEvent.eventType = LogEventType.CRUCIAL_LOG;
        logEvent.bizCode = str2;
        ACMonitor.logEvent(logEvent);
    }

    public void pageStart(Object obj, String str) {
        ACMonitor.logPageEvent(new PageLogEvent(str, PageLogEvent.PageEvent.START, obj, (Map<String, String>) null));
    }

    public void pageExit(Object obj, String str, String str2, Map<String, String> map) {
        PageLogEvent pageLogEvent = new PageLogEvent(str, PageLogEvent.PageEvent.END, obj, map);
        pageLogEvent.bizCode = str2;
        ACMonitor.logPageEvent(pageLogEvent);
    }

    public void pageDestroy(Object obj) {
        ACMonitor.logPageEvent(new PageLogEvent((String) null, PageLogEvent.PageEvent.DESTORY, obj, (Map<String, String>) null));
    }

    public void upload() {
        ACMonitor.flush();
    }
}
