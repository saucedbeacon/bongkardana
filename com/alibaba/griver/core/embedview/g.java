package com.alibaba.griver.core.embedview;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.ui.ErrorView;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.app.api.ui.loading.LoadingView;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class g implements PageContext {

    /* renamed from: a  reason: collision with root package name */
    private App f10299a;
    private Page b;

    public void destroy() {
    }

    public ViewGroup getContentView() {
        return null;
    }

    public g(App app, Page page) {
        RVLogger.d("Griver:SinglePageContext", "construct SinglePageContext");
        this.f10299a = app;
        this.b = page;
    }

    public Activity getActivity() {
        return (Activity) this.f10299a.getAppContext().getContext();
    }

    public PageContainer getPageContainer() {
        return this.b.getPageContext().getPageContainer();
    }

    public TitleBar getTitleBar() {
        return this.b.getPageContext().getTitleBar();
    }

    public LoadingView getLoadingView() {
        return this.b.getPageContext().getLoadingView();
    }

    public ErrorView getErrorView() {
        return this.b.getPageContext().getErrorView();
    }

    public IEmbedViewManager getEmbedViewManager() {
        return this.b.getPageContext().getEmbedViewManager();
    }

    public void applyTransparentTitle(boolean z) {
        this.b.getPageContext().applyTransparentTitle(z);
    }
}
