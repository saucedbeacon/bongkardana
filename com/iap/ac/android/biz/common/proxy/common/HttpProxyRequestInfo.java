package com.iap.ac.android.biz.common.proxy.common;

public class HttpProxyRequestInfo {
    public String proxyRequestData;
    public String requestHeader;
    public ProxyScene scene;

    public String getProxyRequestData() {
        return this.proxyRequestData;
    }

    public String getRequestHeader() {
        return this.requestHeader;
    }

    public ProxyScene getScene() {
        return this.scene;
    }

    public void setProxyRequestData(String str) {
        this.proxyRequestData = str;
    }

    public void setRequestHeader(String str) {
        this.requestHeader = str;
    }

    public void setScene(ProxyScene proxyScene) {
        this.scene = proxyScene;
    }
}
