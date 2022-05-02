package com.iap.ac.android.common.log.event;

import androidx.annotation.NonNull;
import java.util.Map;

public class PageLogEvent extends BaseLogEvent {
    @NonNull
    public PageEvent event;
    @NonNull
    public Object page;
    @NonNull
    public String pageId;

    public enum PageEvent {
        START,
        END,
        DESTORY
    }

    public PageLogEvent(String str, PageEvent pageEvent, Object obj, Map<String, String> map) {
        this.pageId = str;
        this.event = pageEvent;
        this.page = obj;
        this.params = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PageLogEvent{page=");
        sb.append(this.page);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", pageId='");
        sb.append(this.pageId);
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
