package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.fastjson.annotation.JSONField;

public class TabBarItemColorModel {
    @JSONField

    /* renamed from: a  reason: collision with root package name */
    private String f8960a;
    @JSONField
    private String b;

    public String getIcon() {
        return this.f8960a;
    }

    public void setIcon(String str) {
        this.f8960a = str;
    }

    public String getActiveIcon() {
        return this.b;
    }

    public void setActiveIcon(String str) {
        this.b = str;
    }
}
