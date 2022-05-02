package com.alibaba.ariver.integration.singlepage;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.ui.ErrorView;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.app.api.ui.loading.LoadingView;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;

@Keep
public class SinglePageContext implements PageContext {
    private Activity mActivity;

    public void applyTransparentTitle(boolean z) {
    }

    public void destroy() {
    }

    public ViewGroup getContentView() {
        return null;
    }

    public IEmbedViewManager getEmbedViewManager() {
        return null;
    }

    public ErrorView getErrorView() {
        return null;
    }

    public LoadingView getLoadingView() {
        return null;
    }

    public PageContainer getPageContainer() {
        return null;
    }

    public TitleBar getTitleBar() {
        return null;
    }

    public SinglePageContext(App app, Activity activity) {
        this.mActivity = activity;
    }

    public Activity getActivity() {
        return this.mActivity;
    }
}
