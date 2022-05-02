package com.ap.zoloz.hummer.rpc;

import com.zoloz.zhub.common.factor.model.FactorNextRequest;

public class RpcRequest {
    public String currentTaskName = "";
    public FactorNextRequest factorNextRequest = new FactorNextRequest();
    public boolean showLoading = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("RpcRequest{factorNextRequest = ");
        sb.append(this.factorNextRequest.toString());
        sb.append(", currentTaskName = ");
        sb.append(this.currentTaskName);
        sb.append(", showLoading = ");
        sb.append(this.showLoading);
        sb.append('}');
        return sb.toString();
    }
}
