package com.alipay.mobileiclib.common.service.facade.solution.dto;

import com.alipay.mobileiclib.common.service.model.ToString;

public class MICRpcRequest extends ToString {
    public String action;
    public String bizRequestData;
    public String data;
    public String envData;
    public String module;
    public String prodmngId;
    public String token;
    public String verifyId;
    public String version;

    public String toString() {
        StringBuilder sb = new StringBuilder("MICRpcRequest{module='");
        sb.append(this.module);
        sb.append('\'');
        sb.append(", action='");
        sb.append(this.action);
        sb.append('\'');
        sb.append(", data='");
        sb.append(this.data);
        sb.append('\'');
        sb.append(", token='");
        sb.append(this.token);
        sb.append('\'');
        sb.append(", verifyId='");
        sb.append(this.verifyId);
        sb.append('\'');
        sb.append(", version='");
        sb.append(this.version);
        sb.append('\'');
        sb.append(", envData='");
        sb.append(this.envData);
        sb.append('\'');
        sb.append(", bizRequestData='");
        sb.append(this.bizRequestData);
        sb.append('\'');
        sb.append(", prodmngId='");
        sb.append(this.prodmngId);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
