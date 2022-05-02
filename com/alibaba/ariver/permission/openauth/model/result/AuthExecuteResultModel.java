package com.alibaba.ariver.permission.openauth.model.result;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;

@Keep
public final class AuthExecuteResultModel {
    private String appId;
    private String authCode;
    private byte[] data;
    private String errorCode;
    private String errorMsg;
    private Map<String, String> errorScopes;
    private Map<String, String> extInfo;
    private Boolean isSuccess;
    private String isvAppId;
    private String state;
    private List<String> successScopes;

    public final Boolean getSuccess() {
        return this.isSuccess;
    }

    public final void setSuccess(Boolean bool) {
        this.isSuccess = bool;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final void setAuthCode(String str) {
        this.authCode = str;
    }

    public final List<String> getSuccessScopes() {
        return this.successScopes;
    }

    public final void setSuccessScopes(List<String> list) {
        this.successScopes = list;
    }

    public final Map<String, String> getErrorScopes() {
        return this.errorScopes;
    }

    public final void setErrorScopes(Map<String, String> map) {
        this.errorScopes = map;
    }

    public final String getState() {
        return this.state;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final String getIsvAppId() {
        return this.isvAppId;
    }

    public final void setIsvAppId(String str) {
        this.isvAppId = str;
    }

    public final Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public final void setExtInfo(Map<String, String> map) {
        this.extInfo = map;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final void setData(byte[] bArr) {
        this.data = bArr;
    }
}
