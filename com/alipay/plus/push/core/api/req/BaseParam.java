package com.alipay.plus.push.core.api.req;

import java.util.Map;

public class BaseParam {
    private int action;
    private String appId;
    private Map<String, String> extended_params;
    private String notifyType;
    private int silent;
    private String workspaceId;

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public void setWorkspaceId(String str) {
        this.workspaceId = str;
    }

    public String getNotifyType() {
        return this.notifyType;
    }

    public void setNotifyType(String str) {
        this.notifyType = str;
    }

    public int getAction() {
        return this.action;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public int getSilent() {
        return this.silent;
    }

    public void setSilent(int i) {
        this.silent = i;
    }

    public Map<String, String> getExtended_params() {
        return this.extended_params;
    }

    public void setExtended_params(Map<String, String> map) {
        this.extended_params = map;
    }
}
