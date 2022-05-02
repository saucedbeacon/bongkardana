package com.alibaba.ariver.jsapi.logging;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.point.app.AppExitPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.point.page.PageInitPoint;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import java.lang.ref.WeakReference;

public class RVPerfLogLifeCycleExtension implements AppExitPoint, PageExitPoint, PageInitPoint, NodeAware<App> {
    WeakReference<App> weakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onPageExit(Page page) {
        App app = page.getApp();
        String pageURI = page.getPageURI();
        StringBuilder sb = new StringBuilder("");
        sb.append(page.getIntValue(RVConstants.JSAPI_COUNT));
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).addData2Performance(app, pageURI, "apiCalledSum", sb.toString());
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).uploadPerfLog(page.getApp(), page.getPageURI(), "RV_APP_PAGE");
    }

    public void onPageInit(String str, Bundle bundle, Bundle bundle2) {
        String string = BundleUtils.getString(bundle, "appId");
        WeakReference<App> weakReference2 = this.weakReference;
        if (!(weakReference2 == null || weakReference2.get() == null || (bundle2 != null && bundle2.containsKey(RVConstants.EXTRA_START_TOKEN)))) {
            bundle2 = this.weakReference.get().getSceneParams();
        }
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).init("RV_APP_PAGE", string, Long.valueOf(BundleUtils.getLong(bundle2, RVConstants.EXTRA_START_TOKEN)), str);
    }

    public void onAppExit(App app) {
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).uploadPerfLog(app, app.getStartUrl(), "RV_APP_STARTUP");
    }

    public void setNode(WeakReference<App> weakReference2) {
        this.weakReference = weakReference2;
    }

    public Class<App> getNodeType() {
        return App.class;
    }
}
