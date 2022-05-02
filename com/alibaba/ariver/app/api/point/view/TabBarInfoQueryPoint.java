package com.alibaba.ariver.app.api.point.view;

import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface TabBarInfoQueryPoint extends Extension {

    public interface OnTabBarInfoQueryListener {
        void onTabInfoGot(TabBarModel tabBarModel);
    }

    void queryTabBarInfo(OnTabBarInfoQueryListener onTabBarInfoQueryListener);
}
