package com.alibaba.griver.core.webview.extension;

import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.base.api.APWebSettings;

public interface GriverWebViewSettingsExtension extends GriverExtension {
    void customizeWebViewSettings(APWebSettings aPWebSettings);
}
