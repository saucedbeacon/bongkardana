package com.alipay.mobileiclib.common.service.facade.solution.dto;

import java.util.Map;

public class MICInitRequest extends MICRpcRequest {
    public String action;
    public String bizId;
    public Map<String, Object> externParams;
    public String module;
    public String sceneId;

    public String toString() {
        StringBuilder sb = new StringBuilder("MICInitRequest{sceneId='");
        sb.append(this.sceneId);
        sb.append('\'');
        sb.append(", bizId='");
        sb.append(this.bizId);
        sb.append('\'');
        sb.append(", module='");
        sb.append(this.module);
        sb.append('\'');
        sb.append(", action='");
        sb.append(this.action);
        sb.append('\'');
        sb.append(", externParams=");
        sb.append(this.externParams);
        sb.append('}');
        return sb.toString();
    }
}
