package com.alibaba.griver.core.model.applist;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

public class FetchAppInfo implements Serializable {
    private String appDesc;
    private String appId;
    private String appName;
    private String appSlogan;
    private List<CategoryInfo> categoryInfos;
    private Long createTime;
    private String deployVersion;
    private String developerVersion;
    private JSONObject extendInfo;
    private String iconUrl;
    private String packageSize;
    private String siteName;
    private String status;

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public String getDeveloperVersion() {
        return this.developerVersion;
    }

    public void setDeveloperVersion(String str) {
        this.developerVersion = str;
    }

    public String getDeployVersion() {
        return this.deployVersion;
    }

    public void setDeployVersion(String str) {
        this.deployVersion = str;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setSiteName(String str) {
        this.siteName = str;
    }

    public String getAppSlogan() {
        return this.appSlogan;
    }

    public void setAppSlogan(String str) {
        this.appSlogan = str;
    }

    public String getAppDesc() {
        return this.appDesc;
    }

    public void setAppDesc(String str) {
        this.appDesc = str;
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

    public String getPackageSize() {
        return this.packageSize;
    }

    public void setPackageSize(String str) {
        this.packageSize = str;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public JSONObject getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(JSONObject jSONObject) {
        this.extendInfo = jSONObject;
    }

    public List<CategoryInfo> getCategoryInfos() {
        return this.categoryInfos;
    }

    public void setCategoryInfos(List<CategoryInfo> list) {
        this.categoryInfos = list;
    }

    public static class CategoryInfo implements Serializable {
        private String category;
        private String categoryId;
        private String catogory;

        public String getCategory() {
            if (TextUtils.isEmpty(this.category)) {
                return this.catogory;
            }
            return this.category;
        }

        public void setCategory(String str) {
            this.category = str;
        }

        public String getCategoryId() {
            return this.categoryId;
        }

        public void setCategoryId(String str) {
            this.categoryId = str;
        }

        public String getCatogory() {
            return this.catogory;
        }

        public void setCatogory(String str) {
            this.catogory = str;
        }
    }
}
