package com.alibaba.griver.api.common.menu;

import com.alibaba.ariver.app.api.Page;

public abstract class GriverMenuItem {
    public static final int ROW_ONE = 1;
    public static final int ROW_TWO = 2;
    public int iconDrawable;
    public String iconUrl;
    public String identifier;
    public OnMenuItemClickListener listener;
    public String name;
    public GRVMPMoreMenuItemPriority priority = GRVMPMoreMenuItemPriority.GRVMPMoreMenuItemPriorityDefault;
    public int row;

    public abstract boolean canShow(Page page);

    public GriverMenuItem() {
    }

    public GriverMenuItem(String str, String str2, String str3, int i, OnMenuItemClickListener onMenuItemClickListener) {
        this.identifier = str;
        this.name = str2;
        this.iconUrl = str3;
        this.row = i;
        this.listener = onMenuItemClickListener;
    }

    public GriverMenuItem(String str, String str2, int i, int i2, OnMenuItemClickListener onMenuItemClickListener) {
        this.identifier = str;
        this.name = str2;
        this.iconDrawable = i;
        this.row = i2;
        this.listener = onMenuItemClickListener;
    }
}
