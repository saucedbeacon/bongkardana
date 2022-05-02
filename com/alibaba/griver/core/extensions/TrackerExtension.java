package com.alibaba.griver.core.extensions;

import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.webview.PageFinishedPoint;
import com.alibaba.griver.base.api.GriverPerformanceStages;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.core.webview.k;
import java.lang.ref.WeakReference;

@Keep
public class TrackerExtension implements AppStartPoint, NodeAware<App>, PageFinishedPoint {
    WeakReference<App> weakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onAppStart(App app) {
        if (app != null) {
            App app2 = app;
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(app2, app.getStartUrl(), PerfId.jumpAppStart, GriverPerformanceStages.jumpAppStart);
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(app2, app.getStartUrl(), GriverPerformanceStages.KEY_APP_INFO_START, GriverPerformanceStages.appInfoStart);
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(app2, app.getStartUrl(), GriverPerformanceStages.KEY_APP_INFO_END, GriverPerformanceStages.appInfoEnd);
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(app2, app.getStartUrl(), GriverPerformanceStages.KEY_RESOURCE_READY, GriverPerformanceStages.resourceReady);
            if (BundleUtils.getBoolean(app.getStartParams(), RVParams.isH5App, false)) {
                GriverMonitor.event(GriverMonitorConstants.EVENT_START_APP, "GriverAppContainer", new MonitorMap.Builder().appId(app.getAppId()).version(app).url(BundleUtils.getString(app.getStartParams(), "url")).needAsynAppType(true).build());
            }
        }
    }

    public void onPageFinished(String str) {
        WeakReference<App> weakReference2 = this.weakReference;
        if (weakReference2 != null && weakReference2.get() != null) {
            App app = this.weakReference.get();
            boolean z = false;
            boolean z2 = BundleUtils.getBoolean(app.getStartParams(), RVParams.isH5App, false);
            boolean isEmbeddedApp = AppInfoUtils.isEmbeddedApp(app.getActivePage());
            if (z2 || isEmbeddedApp) {
                boolean z3 = app.getActivePage() != null;
                if (app.getActivePage().getRender() != null) {
                    z = true;
                }
                if ((z3 && z) && (app.getActivePage().getRender().getView() instanceof k)) {
                    ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(app, str, "firstScreen");
                }
            }
        }
    }

    public void setNode(WeakReference<App> weakReference2) {
        this.weakReference = weakReference2;
    }

    public Class<App> getNodeType() {
        return App.class;
    }
}
