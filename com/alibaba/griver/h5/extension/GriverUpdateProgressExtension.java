package com.alibaba.griver.h5.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.griver.base.api.PageProcessPoint;
import com.alibaba.griver.ui.container.GriverPageContainer;
import java.lang.ref.WeakReference;

public class GriverUpdateProgressExtension implements NodeAware<Page>, PageProcessPoint {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Page> f10443a;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.f10443a = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    public void onProgressChanged(String str, int i) {
        Page page;
        WeakReference<Page> weakReference = this.f10443a;
        if (weakReference != null && weakReference.get() != null && (page = this.f10443a.get()) != null && page.getPageContext() != null) {
            PageContainer pageContainer = page.getPageContext().getPageContainer();
            if (pageContainer instanceof GriverPageContainer) {
                GriverPageContainer griverPageContainer = (GriverPageContainer) pageContainer;
                griverPageContainer.onProgressChanged(i);
                if (i == 100) {
                    griverPageContainer.getProgressBar().setVisibility(8);
                }
            }
        }
    }
}
