package com.alibaba.griver.core.model.aboutinfo;

import com.alibaba.griver.base.common.rpc.BaseGriverRpcRequest;

public class GetAboutInfoRequest extends BaseGriverRpcRequest {
    private String appId;
    private String version;

    public GetAboutInfoRequest(String str, String str2) {
        this.appId = str;
        this.version = str2;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
