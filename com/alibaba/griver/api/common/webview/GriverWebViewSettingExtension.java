package com.alibaba.griver.api.common.webview;

import com.alibaba.griver.api.common.GriverExtension;

public interface GriverWebViewSettingExtension extends GriverExtension {
    String getUserAgent();

    void setUserAgent(String str);
}
