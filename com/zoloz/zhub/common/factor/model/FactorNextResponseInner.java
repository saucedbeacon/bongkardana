package com.zoloz.zhub.common.factor.model;

import java.util.Map;

public class FactorNextResponseInner {
    public Map<String, Object> outParams;
    public String retCode;
    public String retCodeSub;
    public String retMessageSub;
    public Integer taskIndex;

    public String toString() {
        StringBuilder sb = new StringBuilder("FactorNextResponseInner{taskIndex = ");
        sb.append(this.taskIndex);
        sb.append(", retCode = ");
        sb.append(this.retCode);
        sb.append(", retCodeSub = ");
        sb.append(this.retCodeSub);
        sb.append(", retMessageSub = ");
        sb.append(this.retMessageSub);
        sb.append(", outParams = ");
        sb.append(this.outParams.toString());
        sb.append('}');
        return sb.toString();
    }
}
