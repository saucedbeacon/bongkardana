package com.alibaba.ariver.app.api.ui.tabbar.model;

import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

@Keep
public class TabBarBadgeModel {
    @ColorInt
    private int badgeColor;
    private int badgeSize;
    @Nullable
    private String badgeText;

    @Nullable
    public String getBadgeText() {
        return this.badgeText;
    }

    public void setBadgeText(@Nullable String str) {
        this.badgeText = str;
    }

    public int getBadgeSize() {
        return this.badgeSize;
    }

    public void setBadgeSize(int i) {
        this.badgeSize = i;
    }

    public int getBadgeColor() {
        return this.badgeColor;
    }

    public void setBadgeColor(@ColorInt int i) {
        this.badgeColor = i;
    }
}
