package com.alibaba.griver.core.render.extensions;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.webview.PageAbnormalPoint;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import java.lang.ref.WeakReference;

public class GriverPageAbnormalExtension implements NodeAware<Page>, PageAbnormalPoint {
    WeakReference<Page> pageWeakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void pageAbnoraml(String str, String str2, String str3) {
        WeakReference<Page> weakReference = this.pageWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            Page page = this.pageWeakReference.get();
            GriverMonitor.error(GriverMonitorConstants.ERROR_PAGE_ABNORMAL, "GriverAppContainer", new MonitorMap.Builder().appId(page.getApp().getAppId()).version(page.getApp()).url(page.getPageURI()).pageUrl(page.getOriginalURI()).code(str2).append("networkType", NetworkUtil.getSimpleNetworkType(GriverEnv.getApplicationContext())).append(GriverMonitorConstants.KEY_ERROR_TYPE, str).message(GriverMonitorConstants.MESSAGE_RECEIVED_PAGE_ERROR).needAsynAppType(true).build());
        }
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.pageWeakReference = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }
}
