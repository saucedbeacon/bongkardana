package com.iap.ac.android.common.container.provider.ui;

public enum AppFavoriteStatus {
    Unknow(-1),
    Uncollected(0),
    Collected(1);
    
    int value;

    private AppFavoriteStatus(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public static AppFavoriteStatus parseValue(int i) {
        AppFavoriteStatus appFavoriteStatus = Unknow;
        if (i == -1) {
            return appFavoriteStatus;
        }
        if (i == 0) {
            return Uncollected;
        }
        if (i != 1) {
            return appFavoriteStatus;
        }
        return Collected;
    }
}
