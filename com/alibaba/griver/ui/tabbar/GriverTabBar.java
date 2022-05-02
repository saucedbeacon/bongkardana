package com.alibaba.griver.ui.tabbar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarBadgeModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarItemModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.app.ui.BaseTabBar;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.ui.tabbar.GVTabBar;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.tabbar.TabBarLayout;

public class GriverTabBar extends BaseTabBar implements GVTabBar {

    /* renamed from: a  reason: collision with root package name */
    private long f10623a = 0;
    private Activity b;
    /* access modifiers changed from: private */
    public TabBarLayoutWrapper c;
    private TabBarLayout.H5TabListener d = new TabBarLayout.H5TabListener() {
        public void onTabItemClicked(int i, View view) {
            if (GriverTabBar.this.enableTabClick && !GriverTabBar.this.isFastClick()) {
                RVLogger.d("AriverInt:GriverTabBar", "tabClick index:".concat(String.valueOf(i)));
                if (GriverTabBar.this.getApp().getActivePage() != null) {
                    GriverTabBar.this.c.clearBadge(i);
                    GriverTabBar.this.c.setSelectedIndex(i);
                    GriverTabBar.this.switchTab(i, 2);
                }
            }
        }
    };
    public boolean enableTabClick = true;

    public void setHasShowTab(boolean z) {
    }

    public GriverTabBar(App app, Activity activity, IFragmentManager iFragmentManager, ViewGroup viewGroup) {
        super(app, iFragmentManager);
        this.b = activity;
        this.c = new TabBarLayoutWrapper(app, activity, viewGroup);
    }

    public void onSwitchTab(int i) {
        super.onSwitchTab(i);
        this.c.setSelectedIndex(i);
    }

    public boolean enableInterceptTabClick() {
        Page activePage = getApp().getActivePage();
        if (activePage != null) {
            return BundleUtils.getBoolean(activePage.getStartParams(), "tabClick_h5EventThroughWorker", false);
        }
        return false;
    }

    public void showDefaultTab(int i) {
        super.showDefaultTab(i);
        if (i >= 2) {
            TabBarLayoutWrapper tabBarLayoutWrapper = this.c;
            if (tabBarLayoutWrapper != null) {
                tabBarLayoutWrapper.createDefaultTabBar(i);
                this.c.getContent().setVisibility(0);
                return;
            }
            return;
        }
        RVLogger.w("AriverInt:GriverTabBar", "createDefaultSessionTab num < 2");
    }

    public synchronized boolean isFastClick() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        z = currentTimeMillis - this.f10623a <= 500;
        this.f10623a = currentTimeMillis;
        return z;
    }

    public void init(TabBarModel tabBarModel) {
        super.init(tabBarModel);
        this.c.init(tabBarModel);
    }

    public void create(Page page) {
        super.create(page);
        getApp().getStartParams().putInt("selectedIndex", getCurrentIndex());
        if (isAlphaBackground()) {
            View findViewById = this.b.findViewById(R.id.fragment_container);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.addRule(2, 0);
            findViewById.setLayoutParams(layoutParams);
        }
        this.c.onInflateTab(getCurrentIndex(), this.d);
    }

    public void addTabItem(int i, TabBarItemModel tabBarItemModel, boolean z) {
        super.addTabItem(i, tabBarItemModel, z);
        this.c.addTabItem(i, getTabbarModel(), tabBarItemModel);
    }

    public void setTabItem(int i, TabBarItemModel tabBarItemModel) {
        super.setTabItem(i, tabBarItemModel);
        TabBarLayoutWrapper tabBarLayoutWrapper = this.c;
        if (tabBarLayoutWrapper != null) {
            tabBarLayoutWrapper.setTabBarItem(i, getTabbarModel(), tabBarItemModel);
        }
    }

    public void reset() {
        super.reset();
        this.c.reset();
    }

    public void show(@Nullable Page page, @Nullable Animation animation) {
        super.show(page, animation);
        TabBarLayoutWrapper tabBarLayoutWrapper = this.c;
        if (tabBarLayoutWrapper != null) {
            if (animation != null) {
                tabBarLayoutWrapper.getContent().clearAnimation();
                this.c.getContent().startAnimation(animation);
            }
            this.c.getContent().setVisibility(0);
        }
    }

    public void hide(@Nullable Animation animation) {
        super.hide(animation);
        TabBarLayoutWrapper tabBarLayoutWrapper = this.c;
        if (tabBarLayoutWrapper == null) {
            return;
        }
        if (animation != null) {
            tabBarLayoutWrapper.getContent().clearAnimation();
            this.c.getContent().startAnimation(animation);
            animation.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    GriverTabBar.this.c.getContent().setVisibility(8);
                }
            });
            return;
        }
        tabBarLayoutWrapper.getContent().setVisibility(8);
    }

    public void changeTabBarStyle(TabBarModel tabBarModel, @Nullable Integer num) {
        super.changeTabBarStyle(tabBarModel, num);
        if (this.c != null) {
            if (tabBarModel.getTextColor() == null) {
                tabBarModel.setTextColor(getTabbarModel().getTextColor().intValue());
            }
            if (tabBarModel.getSelectedColor() == null) {
                tabBarModel.setSelectedColor(getTabbarModel().getSelectedColor().intValue());
            }
            this.c.changeTabBarStyle(tabBarModel, num);
        }
    }

    public void setTabBarBadge(int i, TabBarBadgeModel tabBarBadgeModel) {
        TabBarLayoutWrapper tabBarLayoutWrapper = this.c;
        if (tabBarLayoutWrapper != null) {
            tabBarLayoutWrapper.setTabBadge(i, tabBarBadgeModel.getBadgeText(), tabBarBadgeModel.getBadgeSize(), tabBarBadgeModel.getBadgeColor());
        }
    }

    public void removeTabBarBadge(int i) {
        TabBarLayoutWrapper tabBarLayoutWrapper = this.c;
        if (tabBarLayoutWrapper != null) {
            tabBarLayoutWrapper.removeTabBadge(i);
        }
    }
}
