package com.alipay.mobile.security.bio.workspace;

public class NavPageConfig {
    private boolean enable = true;
    private boolean titleVisible = false;
    private String url = "";
    private String userNameHidden = "";
    private String version = "";

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getUserNameHidden() {
        return this.userNameHidden;
    }

    public void setUserNameHidden(String str) {
        this.userNameHidden = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean isTitleVisible() {
        return this.titleVisible;
    }

    public void setTitleVisible(boolean z) {
        this.titleVisible = z;
    }
}
