package com.alipay.mobile.rome.longlinkservice;

public class LongLinkAppConfig {
    public String appId;
    public String appKey;
    public String authCode;
    public String productId;
    public String productVersion;
    public String servHost;
    public String servPort;
    public String workspaceId;

    public String toString() {
        StringBuilder sb = new StringBuilder("LongLinkAppConfig [ productId = ");
        sb.append(this.productId);
        sb.append(", productVersion = ");
        sb.append(this.productVersion);
        sb.append(", appId = ");
        sb.append(this.appId);
        sb.append(", appKey = ");
        sb.append(this.appKey);
        sb.append(", authCode = ");
        sb.append(this.authCode);
        sb.append(", workspaceId = ");
        sb.append(this.workspaceId);
        sb.append(", servHost = ");
        sb.append(this.servHost);
        sb.append(", servPort = ");
        sb.append(this.servPort);
        sb.append(" ]");
        return sb.toString();
    }
}
