package com.iap.ac.android.common.container.provider.ui;

import android.os.Bundle;

public abstract class ContainerUIProvider {
    public static final String KEY_APP_ID = "appId";
    public static final String KEY_APP_NAME = "appName";
    public static final String KEY_FAVORITE_STATUS = "AppFavoriteStatus";
    public static final String KEY_MENU_TYPE = "ContainerMoreMenuItemType";
    public static final String KEY_RED_DOT = "redDot";
    private ContainerMenuDataChangeListener listener;

    public abstract boolean itemShowFilter(String str, ContainerMoreMenuItemType containerMoreMenuItemType);

    public abstract boolean itemShowRedDot(String str, ContainerMoreMenuItemType containerMoreMenuItemType);

    public abstract void onContainerFavoriteMenuClick(String str, String str2, AppFavoriteStatus appFavoriteStatus, Bundle bundle);

    public abstract void onContainerFeedbackMenuClick(String str, String str2, Bundle bundle);

    public abstract void onContainerNotificationMenuClick(String str, String str2, Bundle bundle);

    public void setFavoriteStatus(String str, AppFavoriteStatus appFavoriteStatus) {
        if (this.listener != null) {
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_MENU_TYPE, ContainerMoreMenuItemType.Favorite.getValue());
            bundle.putInt(KEY_FAVORITE_STATUS, appFavoriteStatus.getValue());
            this.listener.onMenuDataChange(str, bundle);
        }
    }

    public void setShowRedDot(String str, ContainerMoreMenuItemType containerMoreMenuItemType, boolean z) {
        if (this.listener != null) {
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_MENU_TYPE, containerMoreMenuItemType.getValue());
            bundle.putBoolean("redDot", z);
            this.listener.onMenuDataChange(str, bundle);
        }
    }

    public void addMenuDataChangeListener(ContainerMenuDataChangeListener containerMenuDataChangeListener) {
        this.listener = containerMenuDataChangeListener;
    }
}
