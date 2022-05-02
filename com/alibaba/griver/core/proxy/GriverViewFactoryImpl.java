package com.alibaba.griver.core.proxy;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.ErrorView;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.app.api.ui.RVViewFactory;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.loading.LoadingView;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.ui.GVViewFactory;

public class GriverViewFactoryImpl implements RVViewFactory {
    public ErrorView createErrorView(Context context) {
        return null;
    }

    public void preload(Context context) {
    }

    public PageContainer createPageContainer(Context context, App app, ViewGroup viewGroup) {
        return ((GVViewFactory) RVProxy.get(GVViewFactory.class)).createPageContainer(context, app, viewGroup);
    }

    public TabBar createTabBar(Context context, App app, IFragmentManager iFragmentManager, ViewGroup viewGroup) {
        return ((GVViewFactory) RVProxy.get(GVViewFactory.class)).createTabBar(context, app, iFragmentManager, viewGroup);
    }

    public TitleBar createTitleBar(Context context, App app) {
        return ((GVViewFactory) RVProxy.get(GVViewFactory.class)).createTitleBar(context, app);
    }

    public LoadingView createLoadingView(Context context, Page page) {
        return ((GVViewFactory) RVProxy.get(GVViewFactory.class)).createLoadingView(context, page);
    }
}
