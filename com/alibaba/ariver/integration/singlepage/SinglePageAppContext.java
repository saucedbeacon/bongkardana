package com.alibaba.ariver.integration.singlepage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.FontBar;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;

@Keep
public class SinglePageAppContext implements AppContext {
    private Activity mActivity;
    private App mApp;

    public void createTabBar(Page page) {
    }

    public void destroy() {
    }

    public void exitPage(Page page, boolean z) {
    }

    public FontBar getFontBar() {
        return null;
    }

    public SplashView getSplashView() {
        return null;
    }

    public TabBar getTabBar() {
        return null;
    }

    public ViewSpecProvider getViewSpecProvider() {
        return null;
    }

    public boolean isTaskRoot() {
        return false;
    }

    public boolean moveToBackground() {
        return false;
    }

    public SinglePageAppContext(App app, Activity activity) {
        this.mActivity = activity;
        this.mApp = app;
    }

    public Context getContext() {
        return this.mActivity;
    }

    public Intent getActivityStartIntent() {
        return this.mActivity.getIntent();
    }

    public void start(Page page) {
        if (page.getPageContext() == null) {
            page.bindContext(new SinglePageContext(this.mApp, this.mActivity));
        }
        page.enter();
    }

    public boolean pushPage(Page page) {
        RVMain.startApp(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), page.getApp().getAppId(), page.getStartParams(), page.getSceneParams());
        page.exit(true);
        return true;
    }
}
