package com.alibaba.ariver.permission.openauth.model.request;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;

@Keep
public final class AuthSkipRequestModel {
    private Map<String, String> appExtInfo;
    private String appId;
    private AuthRequestContextModel authRequestContext;
    private String currentPageUrl;
    private Map<String, String> extInfo;
    private String fromSystem;
    private String isvAppId;
    private List<String> scopeNicks;
    private String state;

    public AuthSkipRequestModel(AuthSkipRequestModel authSkipRequestModel) {
        if (authSkipRequestModel != null) {
            this.fromSystem = authSkipRequestModel.fromSystem;
            this.authRequestContext = authSkipRequestModel.authRequestContext;
            this.appId = authSkipRequestModel.appId;
            this.scopeNicks = authSkipRequestModel.scopeNicks;
            this.state = authSkipRequestModel.state;
            this.currentPageUrl = authSkipRequestModel.currentPageUrl;
            this.isvAppId = authSkipRequestModel.isvAppId;
            this.extInfo = authSkipRequestModel.extInfo;
            this.appExtInfo = authSkipRequestModel.appExtInfo;
        }
    }

    public AuthSkipRequestModel() {
    }

    public final String getFromSystem() {
        return this.fromSystem;
    }

    public final void setFromSystem(String str) {
        this.fromSystem = str;
    }

    public final AuthRequestContextModel getAuthRequestContext() {
        return this.authRequestContext;
    }

    public final void setAuthRequestContext(AuthRequestContextModel authRequestContextModel) {
        this.authRequestContext = authRequestContextModel;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final List<String> getScopeNicks() {
        return this.scopeNicks;
    }

    public final void setScopeNicks(List<String> list) {
        this.scopeNicks = list;
    }

    public final String getState() {
        return this.state;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final String getCurrentPageUrl() {
        return this.currentPageUrl;
    }

    public final void setCurrentPageUrl(String str) {
        this.currentPageUrl = str;
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

    public final Map<String, String> getAppExtInfo() {
        return this.appExtInfo;
    }

    public final void setAppExtInfo(Map<String, String> map) {
        this.appExtInfo = map;
    }
}
