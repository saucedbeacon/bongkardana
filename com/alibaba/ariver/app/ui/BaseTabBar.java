package com.alibaba.ariver.app.ui;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.animation.Animation;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.point.app.AppOnConfigurationChangedPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;
import com.alibaba.ariver.app.api.ui.tabbar.SwitchTabPoint;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarItemModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.app.proxy.RVPageFactory;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.AppLogContext;
import com.alibaba.ariver.kernel.common.log.AppLogUtils;
import com.alibaba.ariver.kernel.common.log.PageSource;
import com.alibaba.ariver.kernel.common.service.RVExtensionService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Keep
public abstract class BaseTabBar implements TabBar {
    protected static final String TAG = "AriverInt:TabBar";
    private boolean mAlphaBackground = false;
    private boolean mAlreadyCreated = false;
    /* access modifiers changed from: private */
    public App mApp;
    private boolean mAutoShow = true;
    private int mCreateIndex = -1;
    /* access modifiers changed from: private */
    public int mCurrentIndex = -1;
    /* access modifiers changed from: private */
    public boolean mCurrentUsingDarkMode = false;
    private boolean mEnableTabClick = true;
    private IFragmentManager mFragmentManager;
    private boolean mIsCreating = false;
    /* access modifiers changed from: private */
    public boolean mIsInReset = false;
    private boolean mIsShowing = false;
    /* access modifiers changed from: private */
    public final SparseArray<Page> mPageIndexArray = new SparseArray<>();
    private Page mSelectedPage;
    private TabBarModel mTabBarItemModel;
    /* access modifiers changed from: private */
    public final Set<Page> mTabPages = new HashSet();

    /* access modifiers changed from: protected */
    public boolean enableInterceptTabClick() {
        return false;
    }

    public void showDefaultTab(int i) {
    }

    class TabBarManageExtension implements AppOnConfigurationChangedPoint, PageExitPoint {
        public void onFinalized() {
        }

        public void onInitialized() {
        }

        TabBarManageExtension() {
        }

        public void onPageExit(Page page) {
            StringBuilder sb = new StringBuilder("handle page exit! isInReset: ");
            sb.append(BaseTabBar.this.mIsInReset);
            RVLogger.d(BaseTabBar.TAG, sb.toString());
            if (!BaseTabBar.this.mIsInReset && page.getApp() != null && !page.getApp().isExited()) {
                int size = BaseTabBar.this.mPageIndexArray.size();
                for (int i = 0; i < size; i++) {
                    if (BaseTabBar.this.mPageIndexArray.get(i) == page) {
                        BaseTabBar.this.mPageIndexArray.delete(i);
                    }
                }
                if (BaseTabBar.this.mTabPages.remove(page) && BaseTabBar.this.mTabPages.size() == 0) {
                    BaseTabBar.this.reset();
                }
            }
        }

        public void onConfigurationChanged(App app, Configuration configuration, String str) {
            boolean isDarkMode;
            RVLogger.d(BaseTabBar.TAG, "onConfigurationChanged colorScheme: ".concat(String.valueOf(str)));
            if (ThemeUtils.isSupportDarkTheme(BaseTabBar.this.mApp) && BaseTabBar.this.mCurrentUsingDarkMode != (isDarkMode = ThemeUtils.isDarkMode(BaseTabBar.this.mApp.getAppContext().getContext()))) {
                boolean unused = BaseTabBar.this.mCurrentUsingDarkMode = isDarkMode;
                BaseTabBar.this.onThemeChanged(isDarkMode);
            }
        }
    }

    public BaseTabBar(App app, IFragmentManager iFragmentManager) {
        this.mApp = app;
        this.mFragmentManager = iFragmentManager;
        ExtensionManager extensionManager = ((RVExtensionService) RVProxy.get(RVExtensionService.class)).getExtensionManager();
        extensionManager.registerExtensionByPoint(this.mApp, PageExitPoint.class, new TabBarManageExtension());
        extensionManager.registerExtensionByPoint(this.mApp, AppOnConfigurationChangedPoint.class, new TabBarManageExtension());
    }

    public boolean isAutoShow() {
        return this.mAutoShow;
    }

    public void setAutoShow(boolean z) {
        this.mAutoShow = z;
    }

    public synchronized Page getSelectedPage() {
        return this.mSelectedPage;
    }

    public synchronized void setSelectedPage(Page page) {
        this.mSelectedPage = page;
    }

    /* access modifiers changed from: protected */
    public Page getPageAt(int i) {
        return this.mPageIndexArray.get(i);
    }

    public Page createPage(String str, Bundle bundle, Bundle bundle2) {
        Bundle clone = BundleUtils.clone(bundle);
        Bundle clone2 = BundleUtils.clone(bundle2);
        ParamUtils.filterCreatePageParams(clone);
        clone.putString(RVStartParams.KEY_FRAGMENT_TYPE, RVStartParams.FRAGMENT_TYPE_SUB_TAB);
        return ((RVPageFactory) RVProxy.get(RVPageFactory.class)).createPage(this.mApp, str, clone, clone2);
    }

    public void onThemeChanged(boolean z) {
        setAlphaBackground(getTabbarModel().getBackgroundColor());
        RVLogger.d(TAG, "onThemeChanged! useDarkMode: ".concat(String.valueOf(z)));
    }

    public void init(TabBarModel tabBarModel) {
        if (tabBarModel != null && this.mApp.getAppContext() != null) {
            this.mTabBarItemModel = tabBarModel;
            this.mCurrentUsingDarkMode = ThemeUtils.isDarkMode(this.mApp.getAppContext().getContext());
            setAlphaBackground(getTabbarModel().getBackgroundColor());
            boolean isDisableOnInit = this.mTabBarItemModel.isDisableOnInit();
            StringBuilder sb = new StringBuilder("TabBar.init usingDarkMode: ");
            sb.append(this.mCurrentUsingDarkMode);
            sb.append(" disableOnInit ");
            sb.append(isDisableOnInit);
            RVLogger.d(TAG, sb.toString());
            if (isDisableOnInit) {
                this.mEnableTabClick = false;
            }
        }
    }

    private void setAlphaBackground(long j) {
        if (j <= 16777215) {
            j |= -16777216;
        }
        if (Color.alpha((int) j) != 255) {
            this.mAlphaBackground = true;
        }
    }

    public int getCreateIndex() {
        return this.mCreateIndex;
    }

    public void create(Page page) {
        this.mAlreadyCreated = true;
        this.mIsCreating = true;
        this.mSelectedPage = page;
        TabBarModel tabBarModel = this.mTabBarItemModel;
        if (tabBarModel != null) {
            List<TabBarItemModel> items = tabBarModel.getItems();
            String hash = UrlUtils.getHash(page.getPageURI());
            int i = -1;
            if (items != null && !items.isEmpty()) {
                int size = items.size();
                int i2 = 0;
                while (i2 < size && i2 < 5) {
                    TabBarItemModel tabBarItemModel = items.get(i2);
                    if (TextUtils.equals(hash, tabBarItemModel.getLaunchParamsTag())) {
                        i = i2;
                    }
                    addTabItem(i2, tabBarItemModel, i2 == i);
                    i2++;
                }
            }
            this.mCreateIndex = i;
            this.mCurrentIndex = i;
            this.mTabPages.add(page);
            this.mPageIndexArray.put(i, page);
        }
        this.mIsCreating = false;
    }

    public void addTabItem(int i, TabBarItemModel tabBarItemModel, boolean z) {
        StringBuilder sb = new StringBuilder("addTabItem with model, index: ");
        sb.append(i);
        sb.append(" model: ");
        sb.append(tabBarItemModel);
        RVLogger.d(TAG, sb.toString());
        if (!this.mIsCreating) {
            for (int size = this.mTabBarItemModel.getItems().size() - 1; size >= i; size--) {
                Page page = this.mPageIndexArray.get(size);
                if (page != null) {
                    this.mPageIndexArray.remove(size);
                    this.mPageIndexArray.put(size + 1, page);
                }
            }
            int i2 = this.mCurrentIndex;
            if (i <= i2) {
                this.mCurrentIndex = i2 + 1;
            }
        }
    }

    public void removeTabItem(int i) {
        RVLogger.d(TAG, "removeTabItem: ".concat(String.valueOf(i)));
        int size = this.mTabBarItemModel.getItems().size();
        Page pageAt = getPageAt(i);
        int i2 = i;
        while (i2 < size - 1) {
            int i3 = i2 + 1;
            Page page = this.mPageIndexArray.get(i3);
            if (page != null) {
                this.mPageIndexArray.remove(i3);
                this.mPageIndexArray.put(i2, page);
            }
            i2 = i3;
        }
        if (pageAt != null) {
            this.mTabPages.remove(pageAt);
            pageAt.exit(false);
        }
        this.mTabBarItemModel.getItems().remove(i);
        int i4 = this.mCurrentIndex;
        if (i <= i4) {
            this.mCurrentIndex = i4 - 1;
        }
    }

    public void changeTabBarStyle(TabBarModel tabBarModel, @Nullable Integer num) {
        setAlphaBackground(tabBarModel.getBackgroundColor());
    }

    @CallSuper
    public void show(@Nullable Page page, @Nullable Animation animation) {
        RVLogger.d(TAG, "tabbar show!");
        this.mIsShowing = true;
        if (page == null) {
            return;
        }
        if (!this.mAlreadyCreated) {
            create(page);
        } else {
            handleSwitchTab(page, false);
        }
    }

    @CallSuper
    public void hide(@Nullable Animation animation) {
        RVLogger.d(TAG, "tabbar hide!");
        this.mIsShowing = false;
    }

    public boolean isShowing() {
        return this.mIsShowing;
    }

    public boolean isCreated() {
        return this.mAlreadyCreated;
    }

    public void setEnableTabClick(boolean z) {
        this.mEnableTabClick = z;
    }

    public boolean isEnableTabClick() {
        return this.mEnableTabClick;
    }

    public boolean isAlphaBackground() {
        return this.mAlphaBackground;
    }

    public App getApp() {
        return this.mApp;
    }

    public int getPageCount() {
        return this.mTabPages.size();
    }

    public int getCurrentIndex() {
        return this.mCurrentIndex;
    }

    public boolean isTabPage(Page page) {
        if (this.mTabPages.contains(page)) {
            return true;
        }
        if (BundleUtils.getBoolean(page.getStartParams(), RVStartParams.KEY_NEW_PAGE_FROM_PUSH_WINDOW, false)) {
            return false;
        }
        String hash = UrlUtils.getHash(page.getPageURI());
        TabBarModel tabBarModel = this.mTabBarItemModel;
        if (!(tabBarModel == null || tabBarModel.getItems() == null)) {
            for (TabBarItemModel launchParamsTag : this.mTabBarItemModel.getItems()) {
                if (TextUtils.equals(launchParamsTag.getLaunchParamsTag(), hash)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getIndexByPage(String str) {
        List<TabBarItemModel> items;
        TabBarModel tabBarModel = this.mTabBarItemModel;
        if (!(tabBarModel == null || (items = tabBarModel.getItems()) == null || items.size() == 0)) {
            int size = items.size();
            for (int i = 0; i < size; i++) {
                if (TextUtils.equals(str, items.get(i).getLaunchParamsTag())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getIndexByPage(Page page) {
        return getIndexByPage(UrlUtils.getHash(page.getPageURI()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.mApp.getActivePage().getPageURI();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void recreate(java.lang.String r5) {
        /*
            r4 = this;
            com.alibaba.ariver.app.api.App r0 = r4.mApp
            com.alibaba.ariver.app.api.Page r0 = r0.getActivePage()
            if (r0 == 0) goto L_0x0051
            com.alibaba.ariver.app.api.App r0 = r4.mApp
            com.alibaba.ariver.app.api.Page r0 = r0.getActivePage()
            java.lang.String r0 = r0.getPageURI()
            r1 = 35
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 == r2) goto L_0x0051
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r3, r1)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.alibaba.ariver.app.api.App r0 = r4.mApp
            android.os.Bundle r0 = r0.getStartParams()
            android.os.Bundle r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.clone(r0)
            java.lang.String r1 = "fromType"
            java.lang.String r2 = "relaunch"
            r0.putString(r1, r2)
            com.alibaba.ariver.app.api.App r1 = r4.mApp
            android.os.Bundle r1 = r1.getSceneParams()
            android.os.Bundle r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.clone(r1)
            com.alibaba.ariver.app.api.App r2 = r4.mApp
            r2.relaunchToUrl(r5, r0, r1)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.ui.BaseTabBar.recreate(java.lang.String):void");
    }

    public boolean switchTab(final int i, int i2) {
        StringBuilder sb = new StringBuilder("switchTab to index: ");
        sb.append(i);
        sb.append(" fromType: ");
        sb.append(i2);
        RVLogger.d(TAG, sb.toString());
        if (i2 == 2 && !isEnableTabClick()) {
            return false;
        }
        if (i2 == 1) {
            setEnableTabClick(true);
        }
        if (this.mAlreadyCreated) {
            ArrayList<Page> arrayList = new ArrayList<>();
            for (int alivePageCount = this.mApp.getAlivePageCount() - 1; alivePageCount >= 0; alivePageCount--) {
                Page pageByIndex = this.mApp.getPageByIndex(alivePageCount);
                if (!pageByIndex.isUseForEmbed() && !this.mTabPages.contains(pageByIndex)) {
                    RVLogger.d(TAG, "switchTab exit nonTabBar Page: ".concat(String.valueOf(pageByIndex)));
                    arrayList.add(pageByIndex);
                }
            }
            for (Page page : arrayList) {
                ((Page.AnimStore) page.getData(Page.AnimStore.class, true)).disableExit = true;
                page.exit(false);
            }
        }
        final int i3 = this.mCurrentIndex;
        if (i == i3) {
            RVLogger.e(TAG, "switchTab already in this index!!!");
            return false;
        }
        this.mCurrentIndex = i;
        if (this.mTabBarItemModel == null) {
            RVLogger.e(TAG, "switchTab but not inflate yet!!!");
        }
        if (i2 == 2) {
            TabBarItemModel tabBarItemModel = getTabbarModel().getItems().get(i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", (Object) tabBarItemModel.getTag());
            jSONObject.put("index", (Object) Integer.valueOf(i));
            jSONObject.put("pagePath", (Object) tabBarItemModel.getTag());
            jSONObject.put("text", (Object) getTabbarModel().getItems().get(i).getName());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            Page activePage = getApp().getActivePage();
            if (!(activePage == null || activePage.getRender() == null)) {
                RVLogger.d(TAG, "switchTab with tabClick!");
                final boolean enableInterceptTabClick = enableInterceptTabClick();
                EngineUtils.sendToRender(activePage.getRender(), RVEvents.TAB_CLICK, jSONObject2, new SendToRenderCallback() {
                    public void onCallBack(JSONObject jSONObject) {
                        if (enableInterceptTabClick) {
                            if (JSONUtils.getBoolean(jSONObject, RVConstants.EXTRA_PREVENTED, false)) {
                                StringBuilder sb = new StringBuilder("sendTabClickEventToWeb prevented change current to origin: ");
                                sb.append(i3);
                                RVLogger.d(BaseTabBar.TAG, sb.toString());
                                int unused = BaseTabBar.this.mCurrentIndex = i3;
                                return;
                            }
                            ExecutorUtils.runOnMain(new Runnable() {
                                public void run() {
                                    if (BaseTabBar.this.getApp() != null && !BaseTabBar.this.getApp().isExited()) {
                                        BaseTabBar.this.onSwitchTab(i);
                                    }
                                }
                            });
                        }
                    }
                });
                if (!enableInterceptTabClick) {
                    onSwitchTab(i);
                }
            }
            return true;
        }
        RVLogger.d(TAG, "switchTabDirect!");
        onSwitchTab(i);
        return true;
    }

    public void onSwitchTab(int i) {
        TabBarItemModel tabBarItemModel = this.mTabBarItemModel.getItems().get(i);
        Page pageAt = getPageAt(i);
        if (pageAt != null) {
            handleSwitchTab(pageAt, false);
        } else {
            Bundle startParams = this.mApp.getStartParams();
            Page createPage = createPage(FileUtils.combinePath(BundleUtils.getString(startParams, "onlineHost"), tabBarItemModel.getUrl()), startParams, this.mApp.getSceneParams());
            this.mPageIndexArray.put(i, createPage);
            handleSwitchTab(createPage, true);
        }
        ExtensionPoint.as(SwitchTabPoint.class).node(this.mApp).create().onSwitchTab(this.mApp, i);
    }

    private synchronized void handleSwitchTab(Page page, boolean z) {
        boolean z2;
        if (!isCreated()) {
            RVLogger.d(TAG, "handleSwitchTab but not created! createTabBar for ".concat(String.valueOf(page)));
            create(page);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || page != this.mSelectedPage) {
            String parentId = AppLogUtils.getParentId(this.mSelectedPage);
            PageSource pageSource = ((AppLogContext) page.getData(AppLogContext.class, true)).getPageSource();
            pageSource.sourcePageAppLogToken = parentId;
            pageSource.sourceType = PageSource.SourceType.SWITCH_TAB;
            if (this.mSelectedPage != null) {
                pageSource.sourceDesc = this.mSelectedPage.getPageURI();
            }
            StringBuilder sb = new StringBuilder("handleSwitchTab newPage: ");
            sb.append(page);
            sb.append(" selectedPage: ");
            sb.append(this.mSelectedPage);
            RVLogger.d(TAG, sb.toString());
            this.mSelectedPage = page;
            while (this.mApp.peekChild() != null) {
                Page page2 = (Page) this.mApp.peekChild();
                page2.hide();
                if (!isTabPage(page2)) {
                    RVLogger.d(TAG, "handleSwitchTab exit notTabPage ".concat(String.valueOf(page2)));
                    page2.exit(false);
                }
                this.mApp.removeChild(page2);
            }
            this.mApp.pushChild(page);
            if (z) {
                this.mTabPages.add(page);
            } else {
                page.show((JSONObject) null);
            }
            RVFragment findFragmentForPage = this.mFragmentManager.findFragmentForPage(page);
            if (findFragmentForPage == null) {
                findFragmentForPage = this.mFragmentManager.createFragment();
                Bundle bundle = new Bundle();
                bundle.putLong(RVConstants.EXTRA_APP_INSTANCE_ID, this.mApp.getNodeId());
                bundle.putLong(RVConstants.EXTRA_PAGE_INSTANCE_ID, page.getNodeId());
                findFragmentForPage.setArguments(bundle);
                this.mFragmentManager.pushPage(page, findFragmentForPage, false);
            } else {
                this.mFragmentManager.attachFragment(findFragmentForPage, false);
            }
            this.mFragmentManager.resetFragmentToTop(findFragmentForPage);
            if (!(this.mApp.getEngineProxy() == null || this.mApp.getEngineProxy().getEngineRouter() == null || page.getRender() == null)) {
                this.mApp.getEngineProxy().getEngineRouter().resetRenderToTop(page.getRender());
            }
            Set<RVFragment> fragments = this.mFragmentManager.getFragments();
            if (fragments != null) {
                for (RVFragment next : fragments) {
                    if (next != findFragmentForPage) {
                        this.mFragmentManager.detachFragment(next, false);
                    }
                }
            }
        }
    }

    public TabBarModel getTabbarModel() {
        return this.mTabBarItemModel;
    }

    @CallSuper
    public void setTabItem(int i, TabBarItemModel tabBarItemModel) {
        TabBarModel tabBarModel;
        if (i >= 0 && tabBarItemModel != null && (tabBarModel = this.mTabBarItemModel) != null) {
            tabBarModel.getItems().set(i, tabBarItemModel);
        }
    }

    public void reset() {
        this.mIsInReset = true;
        try {
            this.mCurrentIndex = -1;
            this.mAlreadyCreated = false;
            for (Page next : this.mTabPages) {
                ((Page.AnimStore) next.getData(Page.AnimStore.class, true)).disableExit = true;
                next.exit(this.mApp.isExited());
            }
            this.mTabPages.clear();
            this.mPageIndexArray.clear();
        } finally {
            this.mIsInReset = false;
        }
    }

    public Set<Page> getTabPages() {
        return this.mTabPages;
    }

    public void onDestroy() {
        reset();
    }
}
