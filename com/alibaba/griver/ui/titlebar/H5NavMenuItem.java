package com.alibaba.griver.ui.titlebar;

import android.graphics.drawable.Drawable;

public class H5NavMenuItem {
    public Drawable icon;
    public boolean iconDownloading;
    public String iconUrl;
    public String name;
    public String redDotNum;
    public boolean selected;
    public String tag;
    public boolean temp;

    public H5NavMenuItem(String str, String str2, Drawable drawable, boolean z, boolean z2) {
        this.name = str;
        this.tag = str2;
        this.icon = drawable;
        this.temp = z;
        this.selected = z2;
        this.iconDownloading = false;
    }

    public H5NavMenuItem(String str, String str2, Drawable drawable, boolean z) {
        this(str, str2, drawable, z, false);
    }

    public H5NavMenuItem(Drawable drawable, String str, boolean z) {
        this((String) null, str, drawable, false, z);
    }

    public void setRedDotNum(String str) {
        this.redDotNum = str;
    }
}
