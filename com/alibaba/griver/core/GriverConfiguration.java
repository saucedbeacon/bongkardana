package com.alibaba.griver.core;

import java.io.Serializable;

public class GriverConfiguration implements Serializable {
    private static final String DEFAULT_PRESET_PACKAGE_PATH = "Griver";
    private String appId;
    private String appendUserAgent;
    private String gatewaySignKey;
    private GriverPageConfiguration pageConfiguration;
    private String presetPackagePath = "Griver";
    private String verifyPackagePublicKey;
    private String webSocketURLPrefixForDebug;
    private String workSpaceId;

    public String getGatewaySignKey() {
        return this.gatewaySignKey;
    }

    public GriverConfiguration setGatewaySignKey(String str) {
        this.gatewaySignKey = str;
        return this;
    }

    public String getAppId() {
        return this.appId;
    }

    public GriverConfiguration setAppId(String str) {
        this.appId = str;
        return this;
    }

    public String getWorkSpaceId() {
        return this.workSpaceId;
    }

    public GriverConfiguration setWorkSpaceId(String str) {
        this.workSpaceId = str;
        return this;
    }

    public String getVerifyPackagePublicKey() {
        return this.verifyPackagePublicKey;
    }

    public GriverConfiguration setVerifyPackagePublicKey(String str) {
        this.verifyPackagePublicKey = str;
        return this;
    }

    public String getAppendUserAgent() {
        return this.appendUserAgent;
    }

    public GriverConfiguration setAppendUserAgent(String str) {
        this.appendUserAgent = str;
        return this;
    }

    public String getWebSocketURLPrefixForDebug() {
        return this.webSocketURLPrefixForDebug;
    }

    public void setWebSocketURLPrefixForDebug(String str) {
        this.webSocketURLPrefixForDebug = str;
    }

    public String getPresetPackagePath() {
        return this.presetPackagePath;
    }

    public GriverConfiguration setPresetPackagePath(String str) {
        this.presetPackagePath = str;
        return this;
    }

    public GriverPageConfiguration getPageConfiguration() {
        return this.pageConfiguration;
    }

    public GriverConfiguration setPageConfiguration(GriverPageConfiguration griverPageConfiguration) {
        this.pageConfiguration = griverPageConfiguration;
        return this;
    }
}
