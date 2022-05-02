package com.alibaba.griver.api.ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.ErrorView;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.loading.LoadingView;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.api.ui.pagecontainer.GVPageContainer;
import com.alibaba.griver.api.ui.tabbar.GVTabBar;
import com.alibaba.griver.api.ui.titlebar.GVTitleBar;

public interface GVViewFactory extends GriverExtension {
    ErrorView createErrorView(Context context);

    LoadingView createLoadingView(Context context, Page page);

    GVPageContainer createPageContainer(Context context, App app, ViewGroup viewGroup);

    GVSplashView createSplashView(FragmentManager fragmentManager, App app, AppModel appModel);

    GVTabBar createTabBar(Context context, App app, IFragmentManager iFragmentManager, ViewGroup viewGroup);

    GVTitleBar createTitleBar(Context context, App app);

    void preload(Context context);
}
