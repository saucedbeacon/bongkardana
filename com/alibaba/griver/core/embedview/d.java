package com.alibaba.griver.core.embedview;

import com.alibaba.ariver.app.PageNode;
import com.alibaba.ariver.app.api.EmbedType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.render.c;
import com.alibaba.griver.core.render.f;

public class d {
    /* access modifiers changed from: protected */
    public boolean interceptBack(PageNode pageNode) {
        if (pageNode == null) {
            try {
                RVLogger.e("Griver:NXEmbedBackIntercept", " embedPage is null");
                return false;
            } catch (Throwable th) {
                GriverLogger.e("Griver:NXEmbedBackIntercept", "interceptBackEvent...e=".concat(String.valueOf(th)));
                return false;
            }
        } else if (EmbedType.MINI == pageNode.getEmbedType()) {
            RVLogger.d("Griver:NXEmbedBackIntercept", "mini embed webView  not interceptBack ");
            return false;
        } else if (((c) pageNode.getRender()).b()) {
            RVLogger.d("Griver:NXEmbedBackIntercept", "embedPage video full screen playing intercept");
            return true;
        } else {
            f a2 = ((c) pageNode.getRender()).a();
            if (a2 != null) {
                if (a2.canGoBack()) {
                    if (a2.copyBackForwardList().getCurrentIndex() <= 0) {
                        GriverLogger.d("Griver:NXEmbedBackIntercept", "interceptBackEvent...webview with no history");
                        return false;
                    }
                    GriverLogger.e("Griver:NXEmbedBackIntercept", "interceptBackEvent...go back");
                    a2.goBack();
                    return true;
                }
            }
            GriverLogger.d("Griver:NXEmbedBackIntercept", "interceptBackEvent...can not go back");
            return false;
        }
    }
}
