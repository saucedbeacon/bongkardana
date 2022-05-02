package com.alibaba.ariver.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.view.TabBarInfoQueryPoint;
import com.alibaba.ariver.app.api.ui.FontBar;
import com.alibaba.ariver.app.api.ui.RVViewFactory;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;
import com.alibaba.ariver.app.api.ui.loading.SplashUtils;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.app.ipc.IpcClientUtils;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;

public abstract class BaseAppContext implements AppContext {

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f8946a;
    /* access modifiers changed from: private */
    public TabBar b;
    private ViewSpecProvider c;
    private boolean d;
    private boolean e = false;
    protected App mApp;
    protected IFragmentManager mFragmentManager;

    /* access modifiers changed from: protected */
    public abstract IFragmentManager createFragmentManager();

    public FontBar getFontBar() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract ViewGroup getTabBarContainer();

    public boolean moveToBackground() {
        return false;
    }

    public BaseAppContext(App app, FragmentActivity fragmentActivity) {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppContext_constructor);
        this.mApp = app;
        this.f8946a = fragmentActivity;
        this.mFragmentManager = createFragmentManager();
        this.c = new DefaultViewSpecProvider(fragmentActivity);
        Bundle bundle = new Bundle();
        bundle.putString("appId", app.getAppId());
        bundle.putString(RVConstants.EXTRA_ACTIVITY_CLZ, fragmentActivity.getClass().getName());
        bundle.putBundle("startParams", app.getStartParams());
        IpcClientUtils.sendMsgToServerByApp(app, 1, bundle);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_constructor);
    }

    public IFragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    /* access modifiers changed from: protected */
    public FragmentActivity getActivity() {
        return this.f8946a;
    }

    /* access modifiers changed from: protected */
    public App getApp() {
        return this.mApp;
    }

    /* access modifiers changed from: private */
    public void a(final Page page, final TabBarModel tabBarModel) {
        if (!this.f8946a.isFinishing() && !this.d) {
            this.d = true;
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    BaseAppContext.this.getTabBarContainer().setVisibility(0);
                    BaseAppContext.this.b.init(tabBarModel);
                    if (BaseAppContext.this.b.isTabPage(page)) {
                        page.getStartParams().putString(RVStartParams.KEY_FRAGMENT_TYPE, RVStartParams.FRAGMENT_TYPE_SUB_TAB);
                        BaseAppContext.this.b.create(page);
                        BaseAppContext.this.b.show(page, (Animation) null);
                        return;
                    }
                    BaseAppContext.this.b.hide((Animation) null);
                    StringBuilder sb = new StringBuilder("init with ");
                    sb.append(page);
                    sb.append(" not tabPage!");
                    RVLogger.d("AriverInt:BaseAppContext", sb.toString());
                }
            });
        }
    }

    public Context getContext() {
        return this.f8946a;
    }

    public Intent getActivityStartIntent() {
        return this.f8946a.getIntent();
    }

    public ViewSpecProvider getViewSpecProvider() {
        return this.c;
    }

    /* JADX INFO: finally extract failed */
    public void start(Page page) {
        try {
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppContext_start);
            if (ExecutorUtils.isMainThread()) {
                RVLogger.d("AriverInt:BaseAppContext", "startPage with page: ".concat(String.valueOf(page)));
                Bundle bundle = new Bundle();
                bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, getApp().getNodeId());
                IpcClientUtils.sendMsgToServerByApp(getApp(), 3, bundle);
                a(page);
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppContext_pushPage);
                pushPage(page);
                RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_pushPage);
                ExecutorUtils.postMain(new Runnable() {
                    public void run() {
                        if (BaseAppContext.this.mApp == null || BaseAppContext.this.mApp.isExited() || BaseAppContext.this.mApp.isDestroyed()) {
                            RVLogger.d("AriverInt:BaseAppContext", "when splashView exit,mapp has destroy");
                            return;
                        }
                        boolean useSuperSplash = SplashUtils.useSuperSplash(BaseAppContext.this.mApp.getStartParams());
                        SplashView splashView = BaseAppContext.this.mApp.getAppContext() == null ? null : BaseAppContext.this.mApp.getAppContext().getSplashView();
                        StringBuilder sb = new StringBuilder("splashView exit. delaySplashHide= ");
                        sb.append(useSuperSplash);
                        sb.append(", splashView_is_null=");
                        sb.append(splashView == null);
                        RVLogger.d("AriverInt:BaseAppContext", sb.toString());
                        if (!useSuperSplash && splashView != null) {
                            splashView.exit((SplashView.ExitListener) null);
                        }
                    }
                });
                RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_start);
                return;
            }
            throw new IllegalStateException("pushPage can only invoked in main thread!");
        } catch (Throwable th) {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_start);
            throw th;
        }
    }

    private void a(Page page) {
        if (TextUtils.equals("YES", BundleUtils.getString(this.mApp.getStartParams(), "enableTabBar"))) {
            createTabBar(page);
        }
    }

    public void createTabBar(Page page) {
        this.b = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createTabBar(this.f8946a, this.mApp, this.mFragmentManager, getTabBarContainer());
        ExtensionPoint.as(TabBarInfoQueryPoint.class).node(this.mApp).create().queryTabBarInfo(new InitTabBarListener(page));
    }

    public boolean pushPage(Page page) {
        if (ExecutorUtils.isMainThread()) {
            StringBuilder sb = new StringBuilder("pushPage with page: ");
            sb.append(page);
            sb.append(" with stack: ");
            sb.append(Log.getStackTraceString(new Throwable("Just Print")));
            RVLogger.d("AriverInt:BaseAppContext", sb.toString());
            if (this.mFragmentManager == null || page.isExited()) {
                RVLogger.w("AriverInt:BaseAppContext", "pushPage but is exited!");
                return false;
            }
            RVFragment readyFragment = this.mFragmentManager.getReadyFragment();
            if (!readyFragment.isAdded()) {
                Bundle bundle = new Bundle();
                bundle.putLong(RVConstants.EXTRA_APP_INSTANCE_ID, this.mApp.getNodeId());
                bundle.putLong(RVConstants.EXTRA_PAGE_INSTANCE_ID, page.getNodeId());
                readyFragment.setArguments(bundle);
            } else {
                readyFragment.setPage(page);
            }
            Bundle startParams = page.getStartParams();
            boolean equals = RVStartParams.FROM_TYPE_PUSH_WINDOW.equals(BundleUtils.getString(startParams, RVStartParams.KEY_FROM_TYPE, ""));
            boolean z = BundleUtils.getBoolean(startParams, RVStartParams.KEY_FROM_RELAUNCH, false);
            boolean z2 = BundleUtils.getBoolean(startParams, RVParams.LONG_PUSHWINDOW_WITH_TRANS_ANIM, true);
            StringBuilder sb2 = new StringBuilder("pushPage useTranslateAnim : ");
            sb2.append(z2);
            sb2.append(" fromRelaunch: ");
            sb2.append(z);
            sb2.append(" fromPushWindow: ");
            sb2.append(equals);
            RVLogger.d("AriverInt:BaseAppContext", sb2.toString());
            if (z || !z2 || !equals || ((Page.AnimStore) page.getData(Page.AnimStore.class, true)).disableEnter) {
                this.mFragmentManager.pushPage(page, readyFragment, false);
            } else {
                this.mFragmentManager.pushPage(page, readyFragment, true);
            }
            TabBar tabBar = this.b;
            if (tabBar != null && !tabBar.isCreated() && this.b.isTabPage(page)) {
                this.b.create(page);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putLong(IpcMessageConstants.EXTRA_NODE_ID, page.getNodeId());
            IpcClientUtils.sendMsgToServerByApp(getApp(), 4, bundle2);
            return true;
        }
        throw new IllegalStateException("pushPage can only invoked in main thread!");
    }

    public void exitPage(Page page, boolean z) {
        RVLogger.d("AriverInt:BaseAppContext", "exitPage ".concat(String.valueOf(page)));
        IFragmentManager iFragmentManager = this.mFragmentManager;
        if (iFragmentManager == null) {
            RVLogger.d("AriverInt:BaseAppContext", "exitPage but already exited");
            return;
        }
        if (iFragmentManager.findFragmentForPage(page) != null) {
            boolean z2 = true;
            if (!BundleUtils.getBoolean(page.getStartParams(), RVParams.LONG_PUSHWINDOW_WITH_TRANS_ANIM, true) || this.mApp.isExited() || ((Page.AnimStore) page.getData(Page.AnimStore.class, true)).disableExit) {
                z2 = false;
            }
            this.mFragmentManager.exitPage(page, z2, z);
        } else {
            RVLogger.d("AriverInt:BaseAppContext", "exitPage but fragment already exited!");
        }
        Bundle bundle = new Bundle();
        bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, page.getNodeId());
        IpcClientUtils.sendMsgToServerByApp(getApp(), 5, bundle);
    }

    public synchronized void destroy() {
        if (!this.e) {
            this.e = true;
            onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Bundle bundle = new Bundle();
        bundle.putString("appId", getApp().getAppId());
        bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, getApp().getNodeId());
        IpcClientUtils.sendMsgToServerByApp(getApp(), 2, bundle);
        FragmentActivity fragmentActivity = this.f8946a;
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            RVLogger.w("AriverInt:BaseAppContext", "NebulaActivity finish by AppContext.destroy()");
            if (this.f8946a.isTaskRoot()) {
                if (Build.VERSION.SDK_INT >= 21) {
                    RVLogger.w("AriverInt:BaseAppContext", "NebulaActivity finishAndRemoveTask by Activity API");
                    this.f8946a.finishAndRemoveTask();
                    this.f8946a = null;
                } else {
                    RVLogger.w("AriverInt:BaseAppContext", "NebulaActivity removeFromRecentTasksList by LiteProcess");
                }
            }
            this.f8946a.finish();
            this.f8946a = null;
        }
        IFragmentManager iFragmentManager = this.mFragmentManager;
        if (iFragmentManager != null) {
            iFragmentManager.release();
            this.mFragmentManager = null;
        }
        ClientMsgReceiver.getInstance().unRegisterAppHandler(this.mApp.getStartToken());
        this.mApp = null;
    }

    public TabBar getTabBar() {
        return this.b;
    }

    public boolean isTaskRoot() {
        return this.f8946a.isTaskRoot();
    }

    class InitTabBarListener implements TabBarInfoQueryPoint.OnTabBarInfoQueryListener {

        /* renamed from: a  reason: collision with root package name */
        private Page f9953a;

        private InitTabBarListener(Page page) {
            this.f9953a = page;
        }

        public void onTabInfoGot(TabBarModel tabBarModel) {
            RVLogger.d("AriverInt:BaseAppContext", "onTabInfoGot data ".concat(String.valueOf(tabBarModel)));
            BaseAppContext.this.a(this.f9953a, tabBarModel);
        }
    }
}
