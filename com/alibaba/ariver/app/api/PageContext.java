package com.alibaba.ariver.app.api;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.ui.ErrorView;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.app.api.ui.loading.LoadingView;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;

public interface PageContext {
    void applyTransparentTitle(boolean z);

    void destroy();

    Activity getActivity();

    ViewGroup getContentView();

    IEmbedViewManager getEmbedViewManager();

    ErrorView getErrorView();

    LoadingView getLoadingView();

    PageContainer getPageContainer();

    TitleBar getTitleBar();
}
