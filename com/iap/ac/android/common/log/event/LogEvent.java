package com.iap.ac.android.common.log.event;

import java.util.Map;

public class LogEvent extends BaseLogEvent {
    public String eventName;
    public LogEventType eventType = LogEventType.BEHAVIOR_LOG;

    public LogEvent(String str, Map<String, String> map) {
        this.eventName = str;
        this.params = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{eventName='");
        sb.append(this.eventName);
        sb.append('\'');
        sb.append(", params=");
        sb.append(this.params);
        sb.append(", bizCode='");
        sb.append(this.bizCode);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
