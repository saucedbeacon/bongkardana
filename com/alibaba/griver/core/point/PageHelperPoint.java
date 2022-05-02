package com.alibaba.griver.core.point;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageBackPoint;
import com.alibaba.ariver.app.api.point.page.PageDestroyPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.point.page.PagePausePoint;
import com.alibaba.ariver.app.api.point.page.PageResumePoint;
import com.alibaba.ariver.app.api.point.page.PageStartedPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.griver.api.common.page.GriverPageHelperEvent;
import com.alibaba.griver.api.webview.PageFinishedPoint;
import com.alibaba.griver.base.api.PageProcessPoint;
import java.lang.ref.WeakReference;

public class PageHelperPoint implements PageBackPoint, PageDestroyPoint, PageExitPoint, PagePausePoint, PageResumePoint, PageStartedPoint, NodeAware<Page>, PageFinishedPoint, PageProcessPoint {
    WeakReference<Page> pageWeakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onStarted(String str) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(this.pageWeakReference.get()).create().onPageStarted(this.pageWeakReference.get(), str);
    }

    public void onProgressChanged(String str, int i) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(this.pageWeakReference.get()).create().onProgressChanged(this.pageWeakReference.get(), str, i);
    }

    public void onPageFinished(String str) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(this.pageWeakReference.get()).create().onPageFinished(this.pageWeakReference.get(), str);
    }

    public void onPageResume(Page page) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(page).create().onPageResume(page);
    }

    public void onPagePause(Page page) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(page).create().onPagePause(page);
    }

    public void onBackPerformed(Page page) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(page).create().onPageBacked(page);
    }

    public void onPageDestroy(Page page) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(page).create().onPageDestroy(page);
    }

    public void onPageExit(Page page) {
        ExtensionPoint.as(GriverPageHelperEvent.class).node(page).create().onPageExit(page);
    }

    public void setNode(WeakReference<Page> weakReference) {
        if (weakReference != null) {
            this.pageWeakReference = weakReference;
        }
        WeakReference<Page> weakReference2 = this.pageWeakReference;
        if (weakReference2 == null || weakReference2.get() == null) {
        }
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }
}
