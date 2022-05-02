package com.iap.ac.android.common.rpc;

import androidx.annotation.Nullable;
import java.io.Serializable;

public class RpcRequest implements Serializable {
    public String operationType;
    public Object request;
    private RpcAppInfo rpcAppInfo;

    public RpcRequest(String str, Object obj) {
        this.operationType = str;
        this.request = obj;
    }

    @Nullable
    public RpcAppInfo getRpcAppInfo() {
        return this.rpcAppInfo;
    }

    public void setRpcAppInfo(@Nullable RpcAppInfo rpcAppInfo2) {
        this.rpcAppInfo = rpcAppInfo2;
    }

    public String getOperationType() {
        return this.operationType;
    }

    public void setOperationType(String str) {
        this.operationType = str;
    }
}
