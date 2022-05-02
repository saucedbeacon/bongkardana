package com.alibaba.griver.api.common.page;

import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.api.common.GriverEvent;

public interface GriverAppEvent extends GriverEvent {
    void onAppExit(App app);

    void onAppStart(App app);
}
