package com.alibaba.griver.core.extensions;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.api.APWebSettings;
import com.alibaba.griver.base.common.webview.WebViewSettingExtension;
import com.alibaba.griver.core.render.c;
import com.alibaba.griver.core.render.f;

public class DefaultWebViewSettingExtensionImpl implements WebViewSettingExtension {
    public APWebSettings getWebViewSettings(Page page) {
        if (page == null) {
            RVLogger.e("GriverWebViewUtils", "page is null");
            return null;
        }
        f a2 = ((c) page.getRender()).a();
        if (a2 != null) {
            return a2.getSettings();
        }
        RVLogger.e("GriverWebViewUtils", "webView is null");
        return null;
    }
}
