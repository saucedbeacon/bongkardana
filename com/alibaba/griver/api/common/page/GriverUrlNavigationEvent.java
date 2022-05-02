package com.alibaba.griver.api.common.page;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverEvent;

public interface GriverUrlNavigationEvent extends GriverEvent {
    boolean onStartUrlNavigation(Page page, String str);
}
