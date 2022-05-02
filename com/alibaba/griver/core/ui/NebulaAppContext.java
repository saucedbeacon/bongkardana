package com.alibaba.griver.core.ui;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.BaseAppContext;
import com.alibaba.ariver.app.activity.DefaultFragmentManager;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.common.page.GriverStartPageFailedExtension;
import com.alibaba.griver.api.ui.GVViewFactory;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.core.R;
import com.alibaba.griver.ui.splash.SplashViewSpecProvider;

public class NebulaAppContext extends BaseAppContext {

    /* renamed from: a  reason: collision with root package name */
    private SplashView f9192a;
    private ViewGroup b;
    private ViewSpecProvider c;

    public NebulaAppContext(App app, FragmentActivity fragmentActivity) {
        super(app, fragmentActivity);
        this.c = new SplashViewSpecProvider(fragmentActivity);
        this.f9192a = ((GVViewFactory) RVProxy.get(GVViewFactory.class)).createSplashView(getFragmentManager().getInnerManager(), app, (AppModel) BundleUtils.getParcelable(app.getSceneParams(), "appInfo"));
    }

    public SplashView getSplashView() {
        return this.f9192a;
    }

    public ViewGroup getTabBarContainer() {
        if (this.b == null) {
            this.b = (ViewGroup) getActivity().findViewById(R.id.tab_container);
        }
        return this.b;
    }

    public IFragmentManager createFragmentManager() {
        return new DefaultFragmentManager(getApp(), R.id.fragment_container, getActivity());
    }

    public void start(Page page) {
        try {
            super.start(page);
        } catch (Throwable th) {
            GriverLogger.e("NebulaAppContext", "push page failed", th);
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.appId(getApp().getAppId());
            builder.version(getApp());
            builder.url(getApp().getStartUrl());
            builder.exception(th);
            builder.message("Start page failed");
            GriverMonitor.error(GriverMonitorConstants.ERROR_START_PAGE, "GriverAppContainer", builder.build());
            ((GriverStartPageFailedExtension) RVProxy.get(GriverStartPageFailedExtension.class)).startFailed(th, GriverEnv.getApplicationContext());
            if (page != null) {
                page.exit(true);
            } else {
                getApp().exit();
            }
        }
    }

    public ViewSpecProvider getViewSpecProvider() {
        return this.c;
    }
}
