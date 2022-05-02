package com.alibaba.griver.base.common.utils;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.api.APWebSettings;
import com.alibaba.griver.base.common.webview.WebViewSettingExtension;

public class GriverWebViewUtils {
    public static APWebSettings getWebSetting(Page page) {
        if (page != null) {
            return ((WebViewSettingExtension) RVProxy.get(WebViewSettingExtension.class)).getWebViewSettings(page);
        }
        RVLogger.e("WebViewSettingExtension", "page is null");
        return null;
    }
}
