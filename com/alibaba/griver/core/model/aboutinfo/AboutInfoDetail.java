package com.alibaba.griver.core.model.aboutinfo;

import java.io.Serializable;

public class AboutInfoDetail implements Serializable {
    private String appDesc;
    private String appId;
    private String appIntro;
    private String appName;
    private Long createDate;
    private String iconUrl;
    private Long lastModifiedDate;
    private String merchantId;
    private String serviceEmail;
    private String serviceTel;
    private String version;

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public String getAppIntro() {
        return this.appIntro;
    }

    public void setAppIntro(String str) {
        this.appIntro = str;
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

    public String getServiceTel() {
        return this.serviceTel;
    }

    public void setServiceTel(String str) {
        this.serviceTel = str;
    }

    public String getServiceEmail() {
        return this.serviceEmail;
    }

    public void setServiceEmail(String str) {
        this.serviceEmail = str;
    }

    public Long getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Long l) {
        this.createDate = l;
    }

    public Long getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Long l) {
        this.lastModifiedDate = l;
    }
}
