package com.alibaba.ariver.permission.openauth.model.result;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;

@Keep
public final class AuthContentResultModel {
    private List<AuthAgreementModel> agreements;
    private String appLogoLink;
    private String appName;
    private List<String> authText;
    private String errorCode;
    private String errorMsg;
    private Map<String, String> extInfo;
    private Boolean isSuccess;
    private Boolean isvAgent;
    private String isvAgentDesc;

    public final Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public final void setExtInfo(Map<String, String> map) {
        this.extInfo = map;
    }

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

    public final List<String> getAuthText() {
        return this.authText;
    }

    public final void setAuthText(List<String> list) {
        this.authText = list;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final String getAppLogoLink() {
        return this.appLogoLink;
    }

    public final void setAppLogoLink(String str) {
        this.appLogoLink = str;
    }

    public final List<AuthAgreementModel> getAgreements() {
        return this.agreements;
    }

    public final void setAgreements(List<AuthAgreementModel> list) {
        this.agreements = list;
    }

    public final Boolean getIsvAgent() {
        return this.isvAgent;
    }

    public final void setIsvAgent(Boolean bool) {
        this.isvAgent = bool;
    }

    public final String getIsvAgentDesc() {
        return this.isvAgentDesc;
    }

    public final void setIsvAgentDesc(String str) {
        this.isvAgentDesc = str;
    }
}
