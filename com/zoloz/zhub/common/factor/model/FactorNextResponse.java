package com.zoloz.zhub.common.factor.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FactorNextResponse {
    public Integer nextIndex;
    public List<FactorNextResponseInner> response = new ArrayList();
    public String versionToken = "";
    public List<Map<String, String>> zStack = new ArrayList();

    public String toString() {
        StringBuilder sb = new StringBuilder("FactorNextResponse{nextIndex = ");
        sb.append(this.nextIndex);
        sb.append(", versionToken = ");
        sb.append(this.versionToken);
        sb.append(", response = ");
        sb.append(this.response.toString());
        sb.append(", zStack = ");
        sb.append(this.zStack.toString());
        sb.append('}');
        return sb.toString();
    }
}
