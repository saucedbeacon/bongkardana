package com.alibaba.griver.ui.titlebar;

import android.graphics.drawable.Drawable;

public class PopMenuItem {
    public Drawable icon;
    public boolean iconDownloading;
    public String iconUrl;
    public String name;
    public String redDotNum;
    public boolean selected;
    public String tag;
    public boolean temp;

    public PopMenuItem(String str, String str2, Drawable drawable, boolean z, boolean z2) {
        this.name = str;
        this.tag = str2;
        this.icon = drawable;
        this.temp = z;
        this.selected = z2;
        this.iconDownloading = false;
    }

    public PopMenuItem(String str, String str2, Drawable drawable, boolean z) {
        this(str, str2, drawable, z, false);
    }

    public PopMenuItem(Drawable drawable, String str, boolean z) {
        this((String) null, str, drawable, false, z);
    }
}
