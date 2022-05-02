package com.alibaba.griver.core.embedview;

import com.alibaba.ariver.engine.api.embedview.EmbedViewConstant;
import com.alibaba.ariver.engine.api.embedview.EmbedViewProvider;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.canvas.misc.CanvasEmbedView;
import com.alipay.mobile.embedview.H5EmbedMapView;

public class NXEmbedViewFactory implements EmbedViewProvider {
    public NXEmbedViewFactory() {
        a();
    }

    private void a() {
        e.a().a(new a("mobile-nebulaintegration", "com.alibaba.griver.core.embedview.NXEmbedWebView", EmbedViewConstant.TYPE_WEBVIEW));
        e.a().a(new a("mobile-nebulaintegration", "com.alibaba.griver.canvas.misc.CanvasEmbedView", "canvas"));
        e.a().a(new a("mobile-nebulaintegration", "com.alipay.mobile.embedview.H5EmbedMapView", "map"));
    }

    public IEmbedView createEmbedView(String str) {
        IEmbedView a2 = a(str);
        if (a2 != null) {
            RVLogger.d("Griver:NXEmbedViewFactory", "getEmbedView from no warp type=".concat(String.valueOf(str)));
            return a2;
        }
        RVLogger.w("Griver:NXEmbedViewFactory", "getEmbedView from legacy type=".concat(String.valueOf(str)));
        return null;
    }

    private IEmbedView a(String str) {
        if (e.a().a(str) == null) {
            return null;
        }
        if (EmbedViewConstant.TYPE_WEBVIEW.equals(str)) {
            return new f();
        }
        if ("canvas".equals(str)) {
            return new CanvasEmbedView();
        }
        if ("map".equals(str)) {
            return new H5EmbedMapView();
        }
        return null;
    }
}
