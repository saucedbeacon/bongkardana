package com.alipay.iap.android.aplog.core.layout;

public class LogLayout {
    public static final String TAG = "LogLayout";
    private String Content;
    private String layoutType;
    private String logCategory;

    public String getLogCategory() {
        return this.logCategory;
    }

    public void setLogCategory(String str) {
        this.logCategory = str;
    }

    public String getContent() {
        return this.Content;
    }

    public void setContent(String str) {
        this.Content = str;
    }

    public String getLayoutType() {
        return this.layoutType;
    }

    public void setLayoutType(String str) {
        this.layoutType = str;
    }
}
