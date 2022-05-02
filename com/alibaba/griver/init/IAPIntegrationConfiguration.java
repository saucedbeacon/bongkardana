package com.alibaba.griver.init;

import java.io.Serializable;

public class IAPIntegrationConfiguration implements Serializable {
    private String appId;
    private String appendUserAgent;
    private String bizCode;
    private String env;
    private String gatewayUrl;
    private String logProductId;
    private String logUploadURL;
    private String workSpaceId;

    public String getAppId() {
        return this.appId;
    }

    public IAPIntegrationConfiguration setAppId(String str) {
        this.appId = str;
        return this;
    }

    public String getWorkSpaceId() {
        return this.workSpaceId;
    }

    public IAPIntegrationConfiguration setWorkSpaceId(String str) {
        this.workSpaceId = str;
        return this;
    }

    public String getEnv() {
        return this.env;
    }

    public IAPIntegrationConfiguration setEnv(String str) {
        this.env = str;
        return this;
    }

    public String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public IAPIntegrationConfiguration setGatewayUrl(String str) {
        this.gatewayUrl = str;
        return this;
    }

    public String getLogProductId() {
        return this.logProductId;
    }

    public IAPIntegrationConfiguration setLogProductId(String str) {
        this.logProductId = str;
        return this;
    }

    public String getLogUploadURL() {
        return this.logUploadURL;
    }

    public IAPIntegrationConfiguration setLogUploadURL(String str) {
        this.logUploadURL = str;
        return this;
    }

    public String getAppendUserAgent() {
        return this.appendUserAgent;
    }

    public IAPIntegrationConfiguration setAppendUserAgent(String str) {
        this.appendUserAgent = str;
        return this;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }
}
