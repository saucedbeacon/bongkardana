package com.alibaba.griver.core.render.extensions;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageStartedPoint;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.griver.api.webview.PageFinishedPoint;
import com.alibaba.griver.base.api.ReceivedTitlePoint;
import com.alibaba.griver.core.render.c;
import com.alibaba.griver.core.render.e;
import com.alibaba.griver.image.photo.PhotoContext;
import java.lang.ref.WeakReference;

public class GriverBridgeInjectExtension implements PageStartedPoint, NodeAware<Page>, PageFinishedPoint, ReceivedTitlePoint {
    WeakReference<Page> pageWeakReference;
    e scriptLoader;

    public void onInitialized() {
    }

    public void onStarted(String str) {
        e eVar;
        if (a(str) && (eVar = this.scriptLoader) != null) {
            eVar.a();
        }
    }

    public void onFinalized() {
        this.scriptLoader = null;
    }

    public void setNode(WeakReference<Page> weakReference) {
        if (weakReference != null) {
            this.pageWeakReference = weakReference;
        }
        WeakReference<Page> weakReference2 = this.pageWeakReference;
        if (weakReference2 != null && weakReference2.get() != null) {
            Render render = this.pageWeakReference.get().getRender();
            if (render instanceof c) {
                this.scriptLoader = ((c) render).d();
            }
        }
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    public void onPageFinished(String str) {
        e eVar;
        if (a(str) && (eVar = this.scriptLoader) != null) {
            eVar.b();
        }
    }

    public void onReceivedTitle(String str, String str2) {
        e eVar;
        if (a(str) && (eVar = this.scriptLoader) != null) {
            eVar.b();
        }
    }

    private boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(PhotoContext.FILE_SCHEME) || str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }
}
