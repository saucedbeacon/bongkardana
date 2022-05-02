package com.iap.ac.android.common.log;

import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.PageLogEvent;
import java.util.Map;

public interface IACMonitor {
    void flush();

    void logEvent(LogEvent logEvent);

    void logPageEvent(PageLogEvent pageLogEvent);

    void setGlobalParameters(Map<String, String> map);
}
