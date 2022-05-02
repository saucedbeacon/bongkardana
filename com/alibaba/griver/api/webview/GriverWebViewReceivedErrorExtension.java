package com.alibaba.griver.api.webview;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverWebViewReceivedErrorExtension extends GriverExtension {
    void showError(Page page, String str, int i);
}
