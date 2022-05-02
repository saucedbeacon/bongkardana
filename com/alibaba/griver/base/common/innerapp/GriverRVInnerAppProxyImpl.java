package com.alibaba.griver.base.common.innerapp;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.service.TinyAppInnerProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverRVInnerAppProxyImpl implements TinyAppInnerProxy {
    public boolean isEmbedWebViewInnerAppBlack(Page page) {
        return false;
    }

    public boolean isInner(App app) {
        if (app != null) {
            return GriverInnerAppUtil.isInnerApp(app);
        }
        GriverLogger.w("GriverRVInnerAppProxyImpl", "app is null, return false directly", (Throwable) null);
        return false;
    }
}
