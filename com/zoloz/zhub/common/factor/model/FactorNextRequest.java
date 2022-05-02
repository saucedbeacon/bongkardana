package com.zoloz.zhub.common.factor.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactorNextRequest {
    public String bizId = "";
    public String hummerId = "";
    public Integer nextIndex = 0;
    public Map<String, Object> params = new HashMap();
    public String versionToken = "";
    public List<Map<String, String>> zStack = new ArrayList();

    public String toString() {
        StringBuilder sb = new StringBuilder("FactorNextRequest{hummerId = ");
        sb.append(this.hummerId);
        sb.append(", nextIndex = ");
        sb.append(this.nextIndex);
        sb.append(", bizId = ");
        sb.append(this.bizId);
        sb.append(", versionToken = ");
        sb.append(this.versionToken);
        sb.append(", zStack = ");
        sb.append(this.zStack.toString());
        sb.append(", params = ");
        sb.append(this.params.toString());
        sb.append('}');
        return sb.toString();
    }
}
