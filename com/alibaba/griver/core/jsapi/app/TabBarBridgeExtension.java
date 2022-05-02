package com.alibaba.griver.core.jsapi.app;

import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarBadgeModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarItemModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.alibaba.fastjson.JSONObject;

@Keep
public class TabBarBridgeExtension implements BridgeExtension {
    private static final String TAG = "AriverApp:TabBarBridgeExtension";
    private static final String TYPE_ANIM_ALPHA = "alpha";
    private static final String TYPE_ANIM_TRANSLATE = "translate";

    public void onFinalized() {
    }

    public Permission permit() {
        return null;
    }

    public void onInitialized() {
        RVLogger.d(TAG, "onInitialized");
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setTabBar(@BindingParam({"actionType"}) String str, @BindingParam({"tag"}) String str2, @BindingParam({"index"}) Integer num, @BindingRequest JSONObject jSONObject, @BindingNode(App.class) App app) {
        int i;
        TabBarItemModel tabBarItemModel;
        int parseColorInt;
        if (app.getAppContext() == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        TabBar tabBar = app.getAppContext().getTabBar();
        if (tabBar == null) {
            RVLogger.w(TAG, "setTabBar but no tabber!");
            return BridgeResponse.SUCCESS;
        } else if (TextUtils.equals(str, "enable")) {
            tabBar.setEnableTabClick(true);
            return BridgeResponse.SUCCESS;
        } else if (TextUtils.equals(str, "disable")) {
            tabBar.setEnableTabClick(false);
            return BridgeResponse.SUCCESS;
        } else if (TextUtils.equals(str, "showTabBar")) {
            showTabBar(jSONObject, tabBar);
            return BridgeResponse.SUCCESS;
        } else if (TextUtils.equals(str, "hideTabBar")) {
            hideTabBar(jSONObject, tabBar);
            return BridgeResponse.SUCCESS;
        } else if (TextUtils.equals(str, "setTabBarStyle")) {
            Integer colorInt = JSONUtils.getColorInt(jSONObject, "color");
            if (jSONObject.containsKey("color") && colorInt == null) {
                return BridgeResponse.newError(2, "color invalid!");
            }
            Integer colorInt2 = JSONUtils.getColorInt(jSONObject, "selectedColor");
            if (jSONObject.containsKey("selectedColor") && colorInt2 == null) {
                return BridgeResponse.newError(2, "selectedColor invalid!");
            }
            Integer colorInt3 = JSONUtils.getColorInt(jSONObject, "backgroundColor");
            if (jSONObject.containsKey("backgroundColor") && colorInt3 == null) {
                return BridgeResponse.newError(2, "backgroundColor invalid!");
            }
            String string = JSONUtils.getString(jSONObject, "borderStyle");
            Integer num2 = null;
            if (!TextUtils.isEmpty(string)) {
                if (TextUtils.equals(string, "white")) {
                    parseColorInt = -1;
                } else if (TextUtils.equals(string, "black")) {
                    parseColorInt = -16777216;
                } else {
                    parseColorInt = TypeUtils.parseColorInt(string);
                }
                num2 = parseColorInt;
                if (num2 == null) {
                    return BridgeResponse.newError(2, "borderStyleColor invalid!");
                }
            }
            TabBarModel tabbarModel = tabBar.getTabbarModel();
            if (colorInt != null) {
                tabbarModel.setTextColor(colorInt.intValue());
            }
            if (colorInt2 != null) {
                tabbarModel.setSelectedColor(colorInt2.intValue());
            }
            if (colorInt3 != null) {
                tabbarModel.setBackgroundColor((long) colorInt3.intValue());
            }
            tabBar.changeTabBarStyle(tabbarModel, num2);
            return BridgeResponse.SUCCESS;
        } else {
            if (num != null) {
                i = num.intValue();
            } else {
                i = tabBar.getIndexByPage(str2);
            }
            if (i < 0 || i > tabBar.getTabbarModel().getItems().size() - 1) {
                return new BridgeResponse.Error(2, "you should specify index or tag!");
            }
            if (TextUtils.equals(str, "redDot")) {
                TabBarBadgeModel tabBarBadgeModel = new TabBarBadgeModel();
                String string2 = JSONUtils.getString(jSONObject, "redDot");
                int i2 = JSONUtils.getInt(jSONObject, "redDotColor");
                int i3 = JSONUtils.getInt(jSONObject, "redDotSize");
                tabBarBadgeModel.setBadgeText(string2);
                tabBarBadgeModel.setBadgeColor(i2);
                tabBarBadgeModel.setBadgeSize(i3);
                tabBar.setTabBarBadge(i, tabBarBadgeModel);
            } else {
                if (TextUtils.equals(str, "textColor")) {
                    tabBarItemModel = new TabBarItemModel(tabBar.getTabbarModel().getItems().get(i));
                    int i4 = JSONUtils.getInt(jSONObject, "textColor");
                    int i5 = JSONUtils.getInt(jSONObject, "selectedColor");
                    tabBarItemModel.setTextColor(Integer.valueOf(i4));
                    tabBarItemModel.setSelectedColor(Integer.valueOf(i5));
                } else if (TextUtils.equals(str, "icon")) {
                    tabBarItemModel = new TabBarItemModel(tabBar.getTabbarModel().getItems().get(i));
                    String string3 = JSONUtils.getString(jSONObject, "icon");
                    String string4 = JSONUtils.getString(jSONObject, "activeIcon");
                    tabBarItemModel.setIcon(string3);
                    tabBarItemModel.setActiveIcon(string4);
                } else if (TextUtils.equals(str, "setTabBarBadge")) {
                    TabBarBadgeModel tabBarBadgeModel2 = new TabBarBadgeModel();
                    String string5 = JSONUtils.getString(jSONObject, "text");
                    if (TextUtils.isEmpty(string5)) {
                        return BridgeResponse.INVALID_PARAM;
                    }
                    tabBarBadgeModel2.setBadgeText(string5);
                    tabBar.setTabBarBadge(i, tabBarBadgeModel2);
                } else if (TextUtils.equals(str, "removeTabBarBadge")) {
                    tabBar.removeTabBarBadge(i);
                } else if (TextUtils.equals(str, "showTabBarRedDot")) {
                    tabBar.setTabBarBadge(i, new TabBarBadgeModel());
                } else if (TextUtils.equals(str, "hideTabBarRedDot")) {
                    tabBar.removeTabBarBadge(i);
                } else if (TextUtils.equals(str, "setTabBarItem")) {
                    tabBarItemModel = new TabBarItemModel(tabBar.getTabbarModel().getItems().get(i));
                    String string6 = JSONUtils.getString(jSONObject, "text");
                    if (jSONObject.containsKey("text") && TextUtils.isEmpty(string6)) {
                        return BridgeResponse.newError(2, "text invalid!");
                    }
                    String string7 = JSONUtils.getString(jSONObject, "iconPath");
                    if (jSONObject.containsKey("iconPath") && TextUtils.isEmpty(string7)) {
                        return BridgeResponse.newError(2, "iconPath invalid!");
                    }
                    String string8 = JSONUtils.getString(jSONObject, "selectedIconPath");
                    if (jSONObject.containsKey("selectedIconPath") && TextUtils.isEmpty(string8)) {
                        return BridgeResponse.newError(2, "selectedIconPath invalid!");
                    }
                    if (!TextUtils.isEmpty(string7)) {
                        tabBarItemModel.setIcon(string7);
                    }
                    if (!TextUtils.isEmpty(string8)) {
                        tabBarItemModel.setActiveIcon(string8);
                    }
                    if (!TextUtils.isEmpty(string6)) {
                        tabBarItemModel.setName(string6);
                    }
                }
                tabBar.setTabItem(i, tabBarItemModel);
            }
            return BridgeResponse.SUCCESS;
        }
    }

    private void hideTabBar(@BindingRequest JSONObject jSONObject, final TabBar tabBar) {
        final boolean z = JSONUtils.getBoolean(jSONObject, "animation", false);
        final String string = JSONUtils.getString(jSONObject, "animationType");
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                if (tabBar.isShowing()) {
                    tabBar.setAutoShow(false);
                    if (z) {
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.setInterpolator(new AccelerateInterpolator());
                        animationSet.setStartTime(AnimationUtils.currentAnimationTimeMillis());
                        animationSet.setDuration(300);
                        if (TabBarBridgeExtension.TYPE_ANIM_ALPHA.equals(string)) {
                            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                        } else if (TabBarBridgeExtension.TYPE_ANIM_TRANSLATE.equals(string)) {
                            animationSet.addAnimation(new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f));
                        } else {
                            TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            animationSet.addAnimation(translateAnimation);
                            animationSet.addAnimation(alphaAnimation);
                        }
                        tabBar.hide(animationSet);
                        return;
                    }
                    tabBar.hide((Animation) null);
                }
            }
        });
    }

    private void showTabBar(@BindingRequest JSONObject jSONObject, final TabBar tabBar) {
        final boolean z = JSONUtils.getBoolean(jSONObject, "animation", false);
        final String string = JSONUtils.getString(jSONObject, "animationType");
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                if (!tabBar.isShowing()) {
                    tabBar.setAutoShow(true);
                    if (z) {
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.setInterpolator(new DecelerateInterpolator());
                        animationSet.setStartTime(AnimationUtils.currentAnimationTimeMillis());
                        animationSet.setDuration(300);
                        if (TabBarBridgeExtension.TYPE_ANIM_ALPHA.equals(string)) {
                            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                        } else if (TabBarBridgeExtension.TYPE_ANIM_TRANSLATE.equals(string)) {
                            animationSet.addAnimation(new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f));
                        } else {
                            TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            animationSet.addAnimation(translateAnimation);
                            animationSet.addAnimation(alphaAnimation);
                        }
                        tabBar.show((Page) null, animationSet);
                        return;
                    }
                    tabBar.show((Page) null, (Animation) null);
                }
            }
        });
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse switchTab(@BindingParam({"tag"}) String str, @BindingParam({"recreate"}) boolean z, @BindingNode(Page.class) Page page) {
        if (page.getApp().getAppContext() == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        TabBar tabBar = page.getApp().getAppContext().getTabBar();
        if (tabBar == null) {
            page.getApp().getAppContext().createTabBar(page);
            tabBar = page.getApp().getAppContext().getTabBar();
        }
        tabBar.setEnableTabClick(true);
        if (z) {
            tabBar.recreate(str);
        } else {
            int indexByPage = tabBar.getIndexByPage(str);
            if (indexByPage < 0) {
                return BridgeResponse.INVALID_PARAM;
            }
            tabBar.switchTab(indexByPage, 1);
        }
        return BridgeResponse.SUCCESS;
    }
}
