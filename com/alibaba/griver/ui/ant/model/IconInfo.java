package com.alibaba.griver.ui.ant.model;

import android.graphics.drawable.Drawable;

public class IconInfo {
    public static final int TYPE_DRAWABLE = 3;
    public static final int TYPE_ICONFONT = 2;
    public static final int TYPE_URL = 1;
    public Drawable drawable;
    public String icon;
    public int iconRes;
    public int type;

    public IconInfo() {
        this.type = 2;
    }

    public IconInfo(String str) {
        this.type = 2;
        this.type = 2;
        this.icon = str;
    }

    public IconInfo(Drawable drawable2) {
        this.type = 2;
        this.type = 3;
        this.drawable = drawable2;
    }

    public IconInfo(int i) {
        this.type = 2;
        this.type = 3;
        this.iconRes = i;
    }
}
