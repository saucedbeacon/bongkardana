package com.alibaba.griver.core.model.applist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppInfo implements Serializable {
    private List<AppCategory> categories = new ArrayList();
    private String iconURL;
    private String identifier;
    private String introduction;
    private String name;
    private String releaseVersion;
    private String slogan;

    public AppInfo() {
    }

    public AppInfo(String str, String str2, String str3, String str4, String str5, String str6, List<AppCategory> list) {
        this.slogan = str;
        this.identifier = str2;
        this.introduction = str3;
        this.name = str4;
        this.iconURL = str5;
        this.releaseVersion = str6;
        this.categories = list;
    }

    public static AppInfo convertAppInfo(DeployAppInfo deployAppInfo) {
        ArrayList arrayList = new ArrayList();
        if (deployAppInfo.getCategoryInfos() != null) {
            for (CategoryInfo next : deployAppInfo.getCategoryInfos()) {
                arrayList.add(new AppCategory(next.getCategory(), next.getCategoryId()));
            }
        }
        return new AppInfo(deployAppInfo.getAppSlogan(), deployAppInfo.getAppId(), deployAppInfo.getAppDesc(), deployAppInfo.getAppName(), deployAppInfo.getIconUrl(), deployAppInfo.getDeployVersion(), arrayList);
    }

    public String getSlogan() {
        return this.slogan;
    }

    public void setSlogan(String str) {
        this.slogan = str;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(String str) {
        this.introduction = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getIconURL() {
        return this.iconURL;
    }

    public void setIconURL(String str) {
        this.iconURL = str;
    }

    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public void setReleaseVersion(String str) {
        this.releaseVersion = str;
    }

    public List<AppCategory> getCategories() {
        return this.categories;
    }

    public void setCategories(List<AppCategory> list) {
        this.categories = list;
    }
}
