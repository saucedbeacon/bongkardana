package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.fastjson.annotation.JSONField;

public class TabBarColorModel {
    public static final long DEFAULT_BACKGROUND_COLOR = -460551;
    @JSONField

    /* renamed from: a  reason: collision with root package name */
    private Integer f8959a;
    @JSONField
    private Integer b;
    @JSONField
    private long c = DEFAULT_BACKGROUND_COLOR;

    public Integer getTextColor() {
        return this.f8959a;
    }

    public void setTextColor(Integer num) {
        this.f8959a = num;
    }

    public Integer getSelectedColor() {
        return this.b;
    }

    public void setSelectedColor(Integer num) {
        this.b = num;
    }

    public long getBackgroundColor() {
        return this.c;
    }

    public void setBackgroundColor(long j) {
        this.c = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TabBarColorModel{textColor=");
        sb.append(this.f8959a);
        sb.append(", selectedColor=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
