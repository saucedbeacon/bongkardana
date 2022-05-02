package com.alipay.iap.android.wallet.acl.base;

import java.util.Map;
import org.json.JSONObject;

public class MiniProgramMetaData {
    private Map<String, String> acParams;
    private String acquirerId;
    public String appId;
    private int appType;
    @Deprecated
    private String authClientId;
    private String clientId;
    private JSONObject clientParams;
    private String deployVersion;
    private String desc;
    private String developerVersion;
    private JSONObject languages;
    private String logo;
    private String merchantId;
    private String name;
    private String publishStatus;

    public MiniProgramMetaData(String str) {
        this.merchantId = this.merchantId;
    }

    public MiniProgramMetaData(String str, String str2) {
        this.appId = str;
        this.merchantId = str2;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public String getDeployVersion() {
        return this.deployVersion;
    }

    public void setDeployVersion(String str) {
        this.deployVersion = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String getDeveloperVersion() {
        return this.developerVersion;
    }

    public void setDeveloperVersion(String str) {
        this.developerVersion = str;
    }

    public int getAppType() {
        return this.appType;
    }

    public void setAppType(int i) {
        this.appType = i;
    }

    public String getAcquirerId() {
        return this.acquirerId;
    }

    public void setAcquirerId(String str) {
        this.acquirerId = str;
    }

    public JSONObject getLanguages() {
        return this.languages;
    }

    public void setLanguages(JSONObject jSONObject) {
        this.languages = jSONObject;
    }

    public JSONObject getClientParams() {
        return this.clientParams;
    }

    public void setClientParams(JSONObject jSONObject) {
        this.clientParams = jSONObject;
    }

    public String getPublishStatus() {
        return this.publishStatus;
    }

    public void setPublishStatus(String str) {
        this.publishStatus = str;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public Map<String, String> getAcParams() {
        return this.acParams;
    }

    public void setAcParams(Map<String, String> map) {
        this.acParams = map;
    }

    @Deprecated
    public String getAuthClientId() {
        return this.authClientId;
    }

    @Deprecated
    public void setAuthClientId(String str) {
        this.authClientId = str;
    }
}
