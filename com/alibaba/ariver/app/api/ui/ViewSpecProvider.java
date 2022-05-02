package com.alibaba.ariver.app.api.ui;

public interface ViewSpecProvider {
    int getHeightSpec();

    int getPageHeightSpec(boolean z);

    int getTabBarHeightSpec();

    int getTitleBarHeightSpec();

    int getTitleBarRawHeight();

    int getWidthSpec();
}
