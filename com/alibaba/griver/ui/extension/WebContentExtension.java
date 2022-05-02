package com.alibaba.griver.ui.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.point.biz.DisclaimerPoint;
import com.alibaba.ariver.app.api.point.page.BackPressedPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarCloseClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarDisclaimerClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarTitleClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarTransparentPoint;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.view.GriverTitleBarEvent;
import com.alibaba.griver.ui.container.GriverPageContainer;
import java.lang.ref.WeakReference;

public class WebContentExtension implements DisclaimerPoint, BackPressedPoint, TitleBarCloseClickPoint, TitleBarDisclaimerClickPoint, TitleBarTitleClickPoint, TitleBarTransparentPoint, NodeAware<Page> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Page> f10580a;

    public void onDisclaimerClick() {
    }

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onTrasparentTitle(String str) {
    }

    public void showDisclaimer(int i) {
    }

    public void onCloseClick() {
        WeakReference<Page> weakReference = this.f10580a;
        if (weakReference != null && weakReference.get() != null && a() != null) {
            a().handleCloseEvent();
        }
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.f10580a = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    private GriverPageContainer a() {
        PageContext pageContext;
        WeakReference<Page> weakReference = this.f10580a;
        if (weakReference == null || weakReference.get() == null || (pageContext = this.f10580a.get().getPageContext()) == null || pageContext.getPageContainer() == null || !(pageContext.getPageContainer() instanceof GriverPageContainer)) {
            return null;
        }
        return (GriverPageContainer) pageContext.getPageContainer();
    }

    public void onTitleClick() {
        WeakReference<Page> weakReference = this.f10580a;
        if (weakReference != null) {
            EngineUtils.sendToRender(weakReference.get().getRender(), RVEvents.TITLE_CLICK, (JSONObject) null, (SendToRenderCallback) null);
            ExtensionPoint.as(GriverTitleBarEvent.class).node(this.f10580a.get()).create().onTitleClick();
        }
    }

    public void onSubTitleClick() {
        WeakReference<Page> weakReference = this.f10580a;
        if (weakReference != null) {
            EngineUtils.sendToRender(weakReference.get().getRender(), "subtitleClick", (JSONObject) null, (SendToRenderCallback) null);
        }
    }

    public Boolean handleBackPressed(Page page) {
        page.backPressed();
        return Boolean.TRUE;
    }
}
