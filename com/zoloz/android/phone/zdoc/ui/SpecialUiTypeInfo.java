package com.zoloz.android.phone.zdoc.ui;

import com.alibaba.fastjson.annotation.JSONField;

public class SpecialUiTypeInfo {
    @JSONField(name = "layout")
    private String layout;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "textResId")
    private String testResId;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getLayout() {
        return this.layout;
    }

    public void setLayout(String str) {
        this.layout = str;
    }

    public String getTestResId() {
        return this.testResId;
    }

    public void setTestResId(String str) {
        this.testResId = str;
    }
}
