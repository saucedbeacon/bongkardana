package com.alibaba.griver.h5.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageStartedPoint;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.api.constants.GriverEvents;
import com.alibaba.griver.ui.container.GriverPageContainer;
import java.lang.ref.WeakReference;

public class PageStartedExtension implements PageStartedPoint, NodeAware<Page> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Page> f10444a;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onStarted(String str) {
        WeakReference<Page> weakReference = this.f10444a;
        if (weakReference != null && weakReference.get() != null) {
            Page page = this.f10444a.get();
            if (!(!BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false) || page.getApp() == null || page.getApp().getEngineProxy() == null || page.getApp().getEngineProxy().getBridge() == null)) {
                page.getApp().getEngineProxy().getBridge().sendToNative(new NativeCallContext.Builder().name(GriverEvents.EVENT_SHOW_BACK_BUTTON).node(page).build(), (SendToNativeCallback) null);
            }
            PageContainer pageContainer = page.getPageContext().getPageContainer();
            if (pageContainer instanceof GriverPageContainer) {
                ((GriverPageContainer) pageContainer).onStarted(str);
            }
        }
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.f10444a = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }
}
