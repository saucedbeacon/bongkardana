package com.alibaba.griver.core.render;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.service.TinyAppInnerProxy;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.common.CommonBackPerform;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class g extends CommonBackPerform {

    /* renamed from: a  reason: collision with root package name */
    private c f10337a;

    public g(c cVar) {
        super(cVar);
        this.f10337a = cVar;
    }

    public boolean enableInterceptBack(Render render) {
        if (!BundleUtils.getBoolean(render.getStartParams(), RVParams.isTinyApp, false)) {
            return true;
        }
        if (!((TinyAppInnerProxy) RVProxy.get(TinyAppInnerProxy.class)).isInner((App) render.getPage().bubbleFindNode(App.class))) {
            return super.enableInterceptBack(render);
        }
        RVLogger.d("H5WebViewGoBackPerform", "innerApp enable back intercept!");
        return true;
    }

    public void performBack(GoBackCallback goBackCallback) {
        c cVar;
        StringBuilder sb = new StringBuilder("perform back behavior ");
        sb.append(this.backBehavior);
        GriverLogger.d("H5WebViewGoBackPerform", sb.toString());
        if (this.backBehavior == CommonBackPerform.POP) {
            if (goBackCallback != null) {
                goBackCallback.afterProcess(false);
            }
        } else if (this.backBehavior == CommonBackPerform.BACK && (cVar = this.f10337a) != null && cVar.a() != null) {
            f a2 = this.f10337a.a();
            if (!a2.canGoBack()) {
                GriverLogger.d("H5WebViewGoBackPerform", "webview can't go back and do exit!");
                if (goBackCallback != null) {
                    goBackCallback.afterProcess(false);
                }
            } else if (a2.copyBackForwardList().getCurrentIndex() <= 0) {
                GriverLogger.d("H5WebViewGoBackPerform", "webview with no history and do exit!");
                if (goBackCallback != null) {
                    goBackCallback.afterProcess(false);
                }
            } else {
                a2.goBack();
                if (goBackCallback != null) {
                    goBackCallback.afterProcess(true);
                }
            }
        }
    }
}
