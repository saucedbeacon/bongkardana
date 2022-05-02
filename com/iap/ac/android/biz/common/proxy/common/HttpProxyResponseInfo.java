package com.iap.ac.android.biz.common.proxy.common;

public class HttpProxyResponseInfo {
    public String errorCode;
    public String errorMessage;
    public boolean isSuccess;
    public String proxyResponseData;
    public String proxyResponseHeader;

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getProxyResponseData() {
        return this.proxyResponseData;
    }

    public String getProxyResponseHeader() {
        return this.proxyResponseHeader;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setProxyResponseData(String str) {
        this.proxyResponseData = str;
    }

    public void setProxyResponseHeader(String str) {
        this.proxyResponseHeader = str;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }
}
