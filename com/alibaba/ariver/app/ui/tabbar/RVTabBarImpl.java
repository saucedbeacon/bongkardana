package com.alibaba.ariver.app.ui.tabbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.R;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarBadgeModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarItemModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.app.ui.BaseTabBar;
import com.alibaba.ariver.app.ui.tabbar.RVTabbarLayout;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.network.RVTransportService;
import com.alibaba.ariver.kernel.common.network.http.RVHttpRequest;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.ImageUtil;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class RVTabBarImpl extends BaseTabBar {

    /* renamed from: a  reason: collision with root package name */
    private long f9959a = 0;
    private Activity b;
    private RVTabbarLayout c;
    /* access modifiers changed from: private */
    public LinearLayout d;
    private String e;
    public boolean enableTabClick = true;
    private View f;
    private boolean g;
    /* access modifiers changed from: private */
    public RVTabbarLayout.Listener h = new RVTabbarLayout.Listener() {
        public void onTabItemClicked(int i, View view) {
            if (RVTabBarImpl.this.enableTabClick) {
                if (!RVTabBarImpl.this.isFastClick() || RVTabBarImpl.this.getCurrentIndex() != i) {
                    RVLogger.d("AriverInt:SessionTabBar", "tabClick index:".concat(String.valueOf(i)));
                    if (RVTabBarImpl.this.getApp().getActivePage() != null) {
                        RVTabBarImpl.this.clearBadge(i);
                        if (!RVTabBarImpl.this.enableInterceptTabClick()) {
                            RVTabBarImpl.this.setSelectedIndex(i);
                        }
                        RVTabBarImpl.this.switchTab(i, 2);
                    }
                }
            }
        }
    };

    public interface ImageListener {
        void onFailed(String str);

        void onLoad(Bitmap bitmap);
    }

    public RVTabBarImpl(App app, Activity activity, IFragmentManager iFragmentManager, ViewGroup viewGroup) {
        super(app, iFragmentManager);
        this.b = activity;
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        viewGroup.addView(this.d, new ViewGroup.LayoutParams(-1, activity.getResources().getDimensionPixelSize(R.dimen.ariver_tabbar_height)));
        this.g = a(app.getAppId(), JSONUtils.getJSONArray(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_eventThroughWorker"), RVEvents.TAB_CLICK, (JSONArray) null));
    }

    private boolean a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("isAppIdInWhiteList, appId = ");
        sb.append(str);
        sb.append(", appIdWhiteList = ");
        sb.append(jSONArray);
        RVLogger.d("AriverInt:SessionTabBar", sb.toString());
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (TextUtils.equals(string, ".*") || TextUtils.equals(string, str)) {
                return true;
            }
        }
        return false;
    }

    public void onSwitchTab(int i) {
        super.onSwitchTab(i);
        setSelectedIndex(i);
    }

    /* access modifiers changed from: package-private */
    public void setSelectedIndex(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(169975357, oncanceled);
            onCancelLoad.getMin(169975357, oncanceled);
        }
        RVTabbarLayout rVTabbarLayout = this.c;
        if (rVTabbarLayout != null) {
            rVTabbarLayout.selectTab(i);
        } else {
            RVLogger.e("AriverInt:SessionTabBar", "setSelectedIndex but tabHost not null!!!");
        }
    }

    public void clearBadge(int i) {
        RVTabBarItem tabBarItemAt = this.c.getTabBarItemAt(i);
        TextView badgeAreaView = tabBarItemAt.getBadgeAreaView();
        if (badgeAreaView != null) {
            badgeAreaView.setVisibility(8);
        }
        RVTabDotView smallDotView = tabBarItemAt.getSmallDotView();
        if (smallDotView != null) {
            smallDotView.setVisibility(8);
        }
    }

    public boolean enableInterceptTabClick() {
        return this.g;
    }

    public synchronized boolean isFastClick() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f9959a > 500) {
            z = false;
            this.f9959a = currentTimeMillis;
        } else {
            z = true;
        }
        return z;
    }

    public void init(TabBarModel tabBarModel) {
        super.init(tabBarModel);
        this.d.removeAllViews();
        this.c = new RVTabbarLayout(this.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        View view = new View(this.b);
        this.f = view;
        view.setBackgroundColor(-5526610);
        this.d.addView(this.f, layoutParams);
        this.d.addView(this.c, new LinearLayout.LayoutParams(-1, -1));
        this.e = "default";
        long backgroundColor = tabBarModel.getBackgroundColor();
        if (backgroundColor <= 16777215) {
            backgroundColor |= -16777216;
        }
        this.c.setBackgroundColor((int) backgroundColor);
    }

    public void create(Page page) {
        super.create(page);
        getApp().getStartParams().putInt("selectedIndex", getCurrentIndex());
        if (isAlphaBackground()) {
            onBackgroundAlphaStatusChanged(true);
        }
        this.c.selectTab(getCurrentIndex());
        this.c.setTabListener(new RVTabbarLayout.Listener() {
            public void onTabItemClicked(int i, View view) {
                RVTabBarImpl.this.h.onTabItemClicked(i, view);
            }
        });
    }

    public void addTabItem(int i, TabBarItemModel tabBarItemModel, boolean z) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(224175004, oncanceled);
            onCancelLoad.getMin(224175004, oncanceled);
        }
        super.addTabItem(i, tabBarItemModel, z);
        TabBarModel tabbarModel = getTabbarModel();
        if (tabBarItemModel != null) {
            String name = tabBarItemModel.getName();
            String tag = tabBarItemModel.getTag();
            String icon = tabBarItemModel.getIcon();
            String activeIcon = tabBarItemModel.getActiveIcon();
            RVTabBarItem rVTabBarItem = new RVTabBarItem(this.b);
            rVTabBarItem.setTag(tag);
            TextView iconAreaView = rVTabBarItem.getIconAreaView();
            iconAreaView.setText(name);
            Integer textColor = tabBarItemModel.getTextColor() == null ? tabbarModel.getTextColor() : tabBarItemModel.getTextColor();
            if (textColor == null) {
                textColor = -16777216;
            }
            Integer selectedColor = tabBarItemModel.getSelectedColor() == null ? tabbarModel.getSelectedColor() : tabBarItemModel.getSelectedColor();
            if (selectedColor == null) {
                selectedColor = -16777216;
            }
            iconAreaView.setTextColor(TabBarUtils.generateTextColor(textColor.intValue(), selectedColor.intValue()));
            StateListDrawable generateEmptyTopDrawable = TabBarUtils.generateEmptyTopDrawable();
            int a2 = a();
            generateEmptyTopDrawable.setBounds(0, 0, a2, a2);
            a(activeIcon, iconAreaView, generateEmptyTopDrawable, this.b, a2, true);
            a(icon, iconAreaView, generateEmptyTopDrawable, this.b, a2, false);
            this.c.addTab(i, rVTabBarItem);
        }
    }

    private void a(String str, TextView textView, StateListDrawable stateListDrawable, Context context, int i, boolean z) {
        String str2 = str;
        StateListDrawable stateListDrawable2 = stateListDrawable;
        RVLogger.d("AriverInt:SessionTabBar", "loadImageAsync: ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            boolean z2 = false;
            if (ImageUtil.isBase64Url(str)) {
                Bitmap base64ToBitmap = ImageUtil.base64ToBitmap(str);
                if (base64ToBitmap != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), base64ToBitmap);
                    int i2 = i;
                    bitmapDrawable.setBounds(0, 0, i2, i2);
                    if (z) {
                        TabBarUtils.addCheckedState(stateListDrawable, bitmapDrawable);
                    } else {
                        TabBarUtils.addNormalState(stateListDrawable, bitmapDrawable);
                    }
                    TextView textView2 = textView;
                    textView.setCompoundDrawables((Drawable) null, stateListDrawable, (Drawable) null, (Drawable) null);
                    return;
                }
                return;
            }
            TextView textView3 = textView;
            int i3 = i;
            AppModel appModel = (AppModel) getApp().getData(AppModel.class);
            if (appModel != null) {
                String vhost = appModel.getAppInfoModel().getVhost();
                if (str.startsWith("http")) {
                    z2 = str.startsWith(vhost);
                } else {
                    str2 = FileUtils.combinePath(vhost, str);
                    z2 = true;
                }
            }
            String str3 = str2;
            if (!z2) {
                final Context context2 = context;
                final int i4 = i;
                final boolean z3 = z;
                final StateListDrawable stateListDrawable3 = stateListDrawable;
                final TextView textView4 = textView;
                loadOnlineImage(str3, new ImageListener() {
                    public void onLoad(Bitmap bitmap) {
                        if (bitmap != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(context2.getResources(), bitmap);
                            int i = i4;
                            bitmapDrawable.setBounds(0, 0, i, i);
                            if (z3) {
                                TabBarUtils.addCheckedState(stateListDrawable3, bitmapDrawable);
                            } else {
                                TabBarUtils.addNormalState(stateListDrawable3, bitmapDrawable);
                            }
                            ExecutorUtils.runOnMain(new Runnable() {
                                public void run() {
                                    textView4.setCompoundDrawables((Drawable) null, stateListDrawable3, (Drawable) null, (Drawable) null);
                                }
                            });
                        }
                    }

                    public void onFailed(String str) {
                        RVLogger.d("AriverInt:SessionTabBar", "load onlineImage onFailed!".concat(String.valueOf(str)));
                    }
                });
                return;
            }
            final String str4 = str3;
            final Context context3 = context;
            final int i5 = i;
            final boolean z4 = z;
            final StateListDrawable stateListDrawable4 = stateListDrawable;
            final TextView textView5 = textView;
            ExecutorUtils.execute(ExecutorType.IO, new Runnable() {
                public void run() {
                    Bitmap decodeStream;
                    Resource load = ExtensionPoint.as(ResourceLoadPoint.class).node(RVTabBarImpl.this.getApp()).create().load(ResourceLoadContext.newBuilder().originUrl(str4).canUseFallback(true).build());
                    if (load != null && (decodeStream = BitmapFactory.decodeStream(load.getStream())) != null) {
                        final BitmapDrawable bitmapDrawable = new BitmapDrawable(context3.getResources(), decodeStream);
                        int i = i5;
                        bitmapDrawable.setBounds(0, 0, i, i);
                        ExecutorUtils.runOnMain(new Runnable() {
                            public void run() {
                                if (z4) {
                                    TabBarUtils.addCheckedState(stateListDrawable4, bitmapDrawable);
                                } else {
                                    TabBarUtils.addNormalState(stateListDrawable4, bitmapDrawable);
                                }
                                textView5.setCompoundDrawables((Drawable) null, stateListDrawable4, (Drawable) null, (Drawable) null);
                            }
                        });
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void loadOnlineImage(final String str, @NonNull final ImageListener imageListener) {
        ExecutorUtils.execute(ExecutorType.NETWORK, new Runnable() {
            public void run() {
                try {
                    imageListener.onLoad(BitmapFactory.decodeStream(((RVTransportService) RVProxy.get(RVTransportService.class)).httpRequest(RVHttpRequest.newBuilder().url(str).build()).getResStream()));
                } catch (Throwable th) {
                    imageListener.onFailed(th.getMessage());
                }
            }
        });
    }

    private int a() {
        if (TextUtils.isEmpty(this.e) || !this.e.equalsIgnoreCase("large")) {
            return this.b.getResources().getDimensionPixelSize(R.dimen.ariver_tabbar_tab_icon);
        }
        return this.b.getResources().getDimensionPixelSize(R.dimen.ariver_tabbar_tab_large_icon);
    }

    private int b() {
        RVTabbarLayout rVTabbarLayout = this.c;
        if (rVTabbarLayout != null) {
            return rVTabbarLayout.getTabSize();
        }
        return 0;
    }

    private void a(int i, TabBarModel tabBarModel, TabBarItemModel tabBarItemModel) {
        String str;
        RVLogger.d("AriverInt:SessionTabBar", "setTabBarItem ");
        Bundle startParams = getApp().getStartParams();
        String icon = tabBarItemModel.getIcon();
        String activeIcon = tabBarItemModel.getActiveIcon();
        if (this.c != null) {
            try {
                if (ImageUtil.base64ToBitmap(icon) == null) {
                    icon = TabBarUtils.getAbsoluteUrl(icon, startParams);
                }
            } catch (Throwable unused) {
                icon = TabBarUtils.getAbsoluteUrl(icon, startParams);
            }
            String str2 = icon;
            try {
                if (ImageUtil.base64ToBitmap(activeIcon) == null) {
                    activeIcon = TabBarUtils.getAbsoluteUrl(activeIcon, startParams);
                }
                str = activeIcon;
            } catch (Throwable unused2) {
                str = TabBarUtils.getAbsoluteUrl(activeIcon, startParams);
            }
            StringBuilder sb = new StringBuilder("setTabBarItem iconURL is ");
            sb.append(str2);
            sb.append(", activeIconURL is ");
            sb.append(str);
            RVLogger.d("AriverInt:SessionTabBar", sb.toString());
            TextView iconAreaView = this.c.getTabBarItemAt(i).getIconAreaView();
            if (iconAreaView != null) {
                iconAreaView.setText(tabBarItemModel.getName());
            }
            Integer textColor = tabBarItemModel.getTextColor() == null ? tabBarModel.getTextColor() : tabBarItemModel.getTextColor();
            if (textColor == null) {
                textColor = -16777216;
            }
            Integer selectedColor = tabBarItemModel.getSelectedColor() == null ? tabBarModel.getSelectedColor() : tabBarItemModel.getSelectedColor();
            if (selectedColor == null) {
                selectedColor = -16777216;
            }
            if (iconAreaView != null) {
                iconAreaView.setTextColor(TabBarUtils.generateTextColor(textColor.intValue(), selectedColor.intValue()));
            }
            StateListDrawable generateEmptyTopDrawable = TabBarUtils.generateEmptyTopDrawable();
            int a2 = a();
            generateEmptyTopDrawable.setBounds(0, 0, a2, a2);
            TextView textView = iconAreaView;
            StateListDrawable stateListDrawable = generateEmptyTopDrawable;
            int i2 = a2;
            a(str, textView, stateListDrawable, this.b, i2, true);
            a(str2, textView, stateListDrawable, this.b, i2, false);
        }
    }

    public void onThemeChanged(boolean z) {
        super.onThemeChanged(z);
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            a(i, getTabbarModel(), getTabbarModel().getItems().get(i));
        }
    }

    public void removeTabItem(int i) {
        super.removeTabItem(i);
        RVTabbarLayout rVTabbarLayout = this.c;
        if (rVTabbarLayout != null) {
            rVTabbarLayout.removeTab(i);
        }
    }

    public void setTabItem(int i, TabBarItemModel tabBarItemModel) {
        super.setTabItem(i, tabBarItemModel);
        if (this.c != null) {
            a(i, getTabbarModel(), tabBarItemModel);
        }
    }

    public void reset() {
        super.reset();
        RVTabbarLayout rVTabbarLayout = this.c;
        if (rVTabbarLayout != null) {
            rVTabbarLayout.removeAllViews();
        } else {
            RVLogger.w("AriverInt:SessionTabBar", "reset but not init!");
        }
    }

    public void show(@Nullable Page page, @Nullable Animation animation) {
        super.show(page, animation);
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            if (animation != null) {
                linearLayout.clearAnimation();
                this.d.startAnimation(animation);
            }
            this.d.setVisibility(0);
        }
    }

    public void hide(@Nullable Animation animation) {
        super.hide(animation);
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        if (animation != null) {
            linearLayout.clearAnimation();
            this.d.startAnimation(animation);
            animation.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    RVTabBarImpl.this.d.setVisibility(8);
                }
            });
            return;
        }
        linearLayout.setVisibility(8);
    }

    public void changeTabBarStyle(TabBarModel tabBarModel, @Nullable Integer num) {
        boolean isAlphaBackground = isAlphaBackground();
        super.changeTabBarStyle(tabBarModel, num);
        if (this.c != null) {
            if (tabBarModel.getTextColor() != null) {
                tabBarModel.setTextColor(getTabbarModel().getTextColor().intValue());
            }
            if (tabBarModel.getSelectedColor() != null) {
                tabBarModel.setSelectedColor(getTabbarModel().getSelectedColor().intValue());
            }
            if (num != null) {
                this.f.setBackgroundColor(num.intValue());
            }
            if (isAlphaBackground() != isAlphaBackground) {
                onBackgroundAlphaStatusChanged(isAlphaBackground());
            }
            int childCount = this.c.getChildCount();
            Integer textColor = tabBarModel.getTextColor();
            Integer selectedColor = tabBarModel.getSelectedColor();
            if (textColor == null || selectedColor == null) {
                RVLogger.d("AriverInt:SessionTabBar", "changeTabBarStyle textColor or selectedColor null.");
                return;
            }
            for (int i = 0; i < childCount; i++) {
                TextView iconAreaView = this.c.getTabBarItemAt(i).getIconAreaView();
                if (iconAreaView != null) {
                    iconAreaView.setTextColor(TabBarUtils.generateTextColor(textColor.intValue(), selectedColor.intValue()));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBackgroundAlphaStatusChanged(boolean z) {
        RVLogger.d("AriverInt:SessionTabBar", "onBackgroundAlphaStatusChanged alpha? ".concat(String.valueOf(z)));
    }

    public void setTabBarBadge(int i, TabBarBadgeModel tabBarBadgeModel) {
        RVLogger.d("AriverInt:SessionTabBar", "setTabBadge ".concat(String.valueOf(i)));
        String badgeText = tabBarBadgeModel.getBadgeText();
        int badgeSize = tabBarBadgeModel.getBadgeSize();
        int badgeColor = tabBarBadgeModel.getBadgeColor();
        if (TextUtils.isEmpty(badgeText)) {
            badgeText = "0";
        }
        if (this.c != null) {
            RVLogger.d("AriverInt:SessionTabBar", "setTabBadge value is ".concat(String.valueOf(badgeText)));
            RVTabBarItem tabBarItemAt = this.c.getTabBarItemAt(i);
            TextView badgeAreaView = tabBarItemAt.getBadgeAreaView();
            RVTabDotView smallDotView = tabBarItemAt.getSmallDotView();
            if (!TextUtils.isEmpty(badgeText)) {
                String trim = badgeText.trim();
                if (!TextUtils.equals("-1", trim)) {
                    if (TextUtils.equals("0", trim)) {
                        badgeAreaView.setVisibility(8);
                        smallDotView.setDotColor(badgeColor);
                        smallDotView.setDotWidth(badgeSize);
                        smallDotView.setVisibility(0);
                        return;
                    }
                    badgeAreaView.setText(trim);
                    badgeAreaView.setVisibility(0);
                    smallDotView.setVisibility(8);
                    return;
                }
            }
            badgeAreaView.setVisibility(8);
            smallDotView.setVisibility(8);
        }
    }

    public void removeTabBarBadge(int i) {
        RVLogger.d("AriverInt:SessionTabBar", "removeTabBadge ".concat(String.valueOf(i)));
        RVTabbarLayout rVTabbarLayout = this.c;
        if (rVTabbarLayout != null) {
            RVTabBarItem tabBarItemAt = rVTabbarLayout.getTabBarItemAt(i);
            TextView badgeAreaView = tabBarItemAt.getBadgeAreaView();
            if (badgeAreaView != null) {
                badgeAreaView.setVisibility(8);
            }
            RVTabDotView smallDotView = tabBarItemAt.getSmallDotView();
            if (smallDotView != null) {
                smallDotView.setVisibility(8);
            }
        }
    }
}
