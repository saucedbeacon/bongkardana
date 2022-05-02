package com.alibaba.ariver.app.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.FontBar;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.app.ipc.IpcClientUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;

public abstract class EmbedAppContext implements AppContext {

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f9964a;
    private App b;
    private IFragmentManager c;
    private boolean d = false;

    /* access modifiers changed from: protected */
    public abstract IFragmentManager createFragmentManager();

    /* access modifiers changed from: protected */
    public abstract EmbedPageContext createPageContext();

    public void createTabBar(Page page) {
    }

    public FontBar getFontBar() {
        return null;
    }

    public TabBar getTabBar() {
        return null;
    }

    public boolean moveToBackground() {
        return false;
    }

    public EmbedAppContext(App app, FragmentActivity fragmentActivity) {
        this.f9964a = fragmentActivity;
        this.b = app;
        Bundle bundle = new Bundle();
        bundle.putString("appId", app.getAppId());
        bundle.putString(RVConstants.EXTRA_ACTIVITY_CLZ, this.f9964a.getClass().getName());
        bundle.putBundle("startParams", app.getStartParams());
        IpcClientUtils.sendMsgToServerByApp(app, 1, bundle);
    }

    /* access modifiers changed from: protected */
    public FragmentActivity getActivity() {
        return this.f9964a;
    }

    /* access modifiers changed from: protected */
    public App getApp() {
        return this.b;
    }

    public Context getContext() {
        return this.f9964a;
    }

    public Intent getActivityStartIntent() {
        return this.f9964a.getIntent();
    }

    public IFragmentManager getFragmentManager() {
        if (this.c == null) {
            this.c = createFragmentManager();
        }
        return this.c;
    }

    public void start(Page page) {
        if (ExecutorUtils.isMainThread()) {
            RVLogger.d("AriverInt:BaseAppContext", "startPage with page: ".concat(String.valueOf(page)));
            Bundle bundle = new Bundle();
            bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, getApp().getNodeId());
            IpcClientUtils.sendMsgToServerByApp(getApp(), 3, bundle);
            if (!page.isExited()) {
                createPageContext().renderPage(page);
                Bundle bundle2 = new Bundle();
                bundle2.putLong(IpcMessageConstants.EXTRA_NODE_ID, page.getNodeId());
                IpcClientUtils.sendMsgToServerByApp(getApp(), 4, bundle2);
                return;
            }
            return;
        }
        throw new IllegalStateException("pushPage can only invoked in main thread!");
    }

    public boolean pushPage(Page page) {
        if (!ExecutorUtils.isMainThread()) {
            throw new IllegalStateException("pushPage can only invoked in main thread!");
        } else if (page.isExited()) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder("pushPage with page: ");
            sb.append(page);
            sb.append(" with stack: ");
            sb.append(Log.getStackTraceString(new Throwable("Just Print")));
            RVLogger.d("AriverInt:BaseAppContext", sb.toString());
            RVFragment readyFragment = getFragmentManager().getReadyFragment();
            if (!readyFragment.isAdded()) {
                Bundle bundle = new Bundle();
                bundle.putLong(RVConstants.EXTRA_APP_INSTANCE_ID, this.b.getNodeId());
                bundle.putLong(RVConstants.EXTRA_PAGE_INSTANCE_ID, page.getNodeId());
                readyFragment.setArguments(bundle);
            } else {
                readyFragment.setPage(page);
            }
            Bundle startParams = page.getStartParams();
            boolean equals = RVStartParams.FROM_TYPE_PUSH_WINDOW.equals(BundleUtils.getString(startParams, RVStartParams.KEY_FROM_TYPE, ""));
            boolean z = BundleUtils.getBoolean(startParams, RVParams.LONG_PUSHWINDOW_WITH_TRANS_ANIM, true);
            StringBuilder sb2 = new StringBuilder("pushPage useTranslateAnim : ");
            sb2.append(z);
            sb2.append(" fromPushWindow: ");
            sb2.append(equals);
            RVLogger.d("AriverInt:BaseAppContext", sb2.toString());
            if (!z || !equals) {
                getFragmentManager().pushPage(page, readyFragment, false);
            } else {
                getFragmentManager().pushPage(page, readyFragment, true);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putLong(IpcMessageConstants.EXTRA_NODE_ID, page.getNodeId());
            IpcClientUtils.sendMsgToServerByApp(getApp(), 4, bundle2);
            return true;
        }
    }

    public void exitPage(Page page, boolean z) {
        RVLogger.d("AriverInt:BaseAppContext", "exitPage ".concat(String.valueOf(page)));
        if (getFragmentManager() == null) {
            RVLogger.d("AriverInt:BaseAppContext", "exitPage but already exited");
            return;
        }
        if (getFragmentManager().findFragmentForPage(page) != null) {
            getFragmentManager().exitPage(page, !this.b.isExited(), false);
        } else {
            RVLogger.d("AriverInt:BaseAppContext", "exitPage but fragment already exited!");
            if (this.b.getAlivePageCount() == 0) {
                page.exit(z);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, page.getNodeId());
        IpcClientUtils.sendMsgToServerByApp(getApp(), 5, bundle);
    }

    public synchronized void destroy() {
        if (!this.d) {
            this.d = true;
            onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Bundle bundle = new Bundle();
        bundle.putString("appId", getApp().getAppId());
        bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, getApp().getNodeId());
        IpcClientUtils.sendMsgToServerByApp(getApp(), 2, bundle);
        this.f9964a = null;
        ClientMsgReceiver.getInstance().unRegisterAppHandler(this.b.getStartToken());
        this.b = null;
    }

    public boolean isTaskRoot() {
        return this.f9964a.isTaskRoot();
    }
}
