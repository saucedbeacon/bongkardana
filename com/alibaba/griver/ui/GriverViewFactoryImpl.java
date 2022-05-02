package com.alibaba.griver.ui;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.ui.GVSplashView;
import com.alibaba.griver.api.ui.GVViewFactory;
import com.alibaba.griver.api.ui.errorview.GVErrorView;
import com.alibaba.griver.api.ui.loadingview.GVLoadingView;
import com.alibaba.griver.api.ui.pagecontainer.GVPageContainer;
import com.alibaba.griver.api.ui.tabbar.GVTabBar;
import com.alibaba.griver.api.ui.titlebar.GVTitleBar;
import com.alibaba.griver.base.common.utils.H5SplitCompatUtils;
import com.alibaba.griver.ui.container.GriverPageContainer;
import com.alibaba.griver.ui.loading.NebulaLoadingView;
import com.alibaba.griver.ui.splash.GriverSplashView;
import com.alibaba.griver.ui.tabbar.GriverTabBar;
import com.alibaba.griver.ui.titlebar.GriverTitleBar;

public class GriverViewFactoryImpl implements GVViewFactory {
    public GVErrorView createErrorView(Context context) {
        return null;
    }

    public void preload(Context context) {
    }

    public GVPageContainer createPageContainer(Context context, App app, ViewGroup viewGroup) {
        H5SplitCompatUtils.doInstall(context);
        return new GriverPageContainer(context, app);
    }

    public GVTabBar createTabBar(Context context, App app, IFragmentManager iFragmentManager, ViewGroup viewGroup) {
        return new GriverTabBar(app, (Activity) context, iFragmentManager, viewGroup);
    }

    public GVTitleBar createTitleBar(Context context, App app) {
        return new GriverTitleBar(context);
    }

    public GVLoadingView createLoadingView(Context context, Page page) {
        return new NebulaLoadingView(context);
    }

    public GVSplashView createSplashView(FragmentManager fragmentManager, App app, AppModel appModel) {
        return new GriverSplashView(fragmentManager, app, appModel);
    }
}
