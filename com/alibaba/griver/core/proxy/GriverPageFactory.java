package com.alibaba.griver.core.proxy;

import android.os.Bundle;
import com.alibaba.ariver.app.PageNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.proxy.RVPageFactory;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.core.ui.GriverPage;

public class GriverPageFactory implements RVPageFactory {
    public PageNode createPage(App app, String str, Bundle bundle, Bundle bundle2) {
        GriverPage griverPage = new GriverPage(app, str, BundleUtils.clone(bundle), BundleUtils.clone(bundle2));
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(app, str, PerfId.pageInit);
        return griverPage;
    }
}
