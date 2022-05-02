package com.alibaba.griver.api.common.webview;

import com.alibaba.griver.api.common.GriverEvent;

public interface GriverFullScreenEvent extends GriverEvent {
    void toggledFullscreen(boolean z);
}
