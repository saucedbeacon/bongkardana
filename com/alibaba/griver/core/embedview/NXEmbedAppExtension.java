package com.alibaba.griver.core.embedview;

import com.alibaba.ariver.app.PageNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.BackKeyDownPoint;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.core.render.c;

public class NXEmbedAppExtension extends d implements BackKeyDownPoint {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Boolean intercept(App app) {
        RVLogger.d("Griver:NXEmbedAppExtension", "intercept  app back down ");
        if (app == null || app.getActivePage() == null || app.getActivePage().getRender() == null) {
            RVLogger.d("Griver:NXEmbedAppExtension", " not exist active page ,don't intercept ");
            return Boolean.FALSE;
        } else if (((c) app.getActivePage().getRender()).b()) {
            RVLogger.d("Griver:NXEmbedAppExtension", "video full screen playing intercept");
            return Boolean.TRUE;
        } else {
            PageNode pageNode = (PageNode) app.getActivePage();
            if (AppInfoUtils.isEmbeddedApp(app.getActivePage())) {
                return Boolean.valueOf(interceptBack(pageNode));
            }
            if (pageNode.getEmbedPage() != null) {
                return Boolean.valueOf(interceptBack(pageNode.getEmbedPage()));
            }
            RVLogger.d("Griver:NXEmbedAppExtension", " not exist embed page  ,don't intercept ");
            return Boolean.FALSE;
        }
    }
}
