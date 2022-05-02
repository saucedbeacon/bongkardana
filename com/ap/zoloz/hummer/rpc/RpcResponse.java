package com.ap.zoloz.hummer.rpc;

import com.zoloz.zhub.common.factor.model.FactorNextResponse;

public class RpcResponse {
    public String exception = "";
    public FactorNextResponse factorNextResponse = new FactorNextResponse();

    public String toString() {
        StringBuilder sb = new StringBuilder("RpcResponse{factorNextResponse = ");
        sb.append(this.factorNextResponse.toString());
        sb.append(", exception = ");
        sb.append(this.exception);
        sb.append('}');
        return sb.toString();
    }
}
