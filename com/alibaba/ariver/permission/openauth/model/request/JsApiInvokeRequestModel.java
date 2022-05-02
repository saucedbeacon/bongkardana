package com.alibaba.ariver.permission.openauth.model.request;

import androidx.annotation.Keep;
import java.util.Map;

@Keep
public final class JsApiInvokeRequestModel {
    private String appId;
    private String bizContent;
    private Map<String, String> extParams;
    private String method;

    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final String getMethod() {
        return this.method;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final String getBizContent() {
        return this.bizContent;
    }

    public final void setBizContent(String str) {
        this.bizContent = str;
    }

    public final Map<String, String> getExtParams() {
        return this.extParams;
    }

    public final void setExtParams(Map<String, String> map) {
        this.extParams = map;
    }
}
