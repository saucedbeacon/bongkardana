package com.alibaba.griver.core.common.monitor;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppLoadResult;
import com.alibaba.ariver.app.api.point.app.AppOnLoadResultPoint;
import com.alibaba.griver.base.common.monitor.GriverMonitorAnalyticsConfigManager;

public class GriverMonitorAnalyticsTriggerExtension implements AppOnLoadResultPoint {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onLoadResult(App app, AppLoadResult appLoadResult) {
        if (app != null && appLoadResult != null && app.isTinyApp()) {
            GriverMonitorAnalyticsConfigManager.syncMonitorConfig(app, appLoadResult.appVersion);
        }
    }
}
