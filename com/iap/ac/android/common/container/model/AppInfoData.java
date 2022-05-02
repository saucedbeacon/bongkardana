package com.iap.ac.android.common.container.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppInfoData implements Serializable {
    private String appDesc;
    private String appId;
    private String appName;
    private String appSlogan;
    private List<CategoryInfoData> categoryInfos = new ArrayList();
    private String deployVersion;
    private String iconUrl;
    private String status;

    public String getAppSlogan() {
        return this.appSlogan;
    }

    public void setAppSlogan(String str) {
        this.appSlogan = str;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getAppDesc() {
        return this.appDesc;
    }

    public void setAppDesc(String str) {
        this.appDesc = str;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getDeployVersion() {
        return this.deployVersion;
    }

    public void setDeployVersion(String str) {
        this.deployVersion = str;
    }

    public List<CategoryInfoData> getCategoryInfos() {
        return this.categoryInfos;
    }

    public void setCategoryInfos(List<CategoryInfoData> list) {
        this.categoryInfos = list;
    }
}
