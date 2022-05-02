package com.iap.ac.android.common.rpc.model;

public class RpcExceptionInterceptResult {
    public boolean isHandled;
    public Object response;

    public String toString() {
        StringBuilder sb = new StringBuilder("RpcExceptionInterceptResult{isHandled=");
        sb.append(this.isHandled);
        sb.append(", response=");
        sb.append(this.response);
        sb.append('}');
        return sb.toString();
    }
}
