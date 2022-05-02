package com.iap.ac.android.gol.rpc.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class AuthPrepareRequest extends BaseRpcRequest {
    public String clientId;
    public String content;
    public String pspId;
}
