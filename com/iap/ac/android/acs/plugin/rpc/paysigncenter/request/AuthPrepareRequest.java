package com.iap.ac.android.acs.plugin.rpc.paysigncenter.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class AuthPrepareRequest extends BaseRpcRequest {
    public String appId;
    public String signStr;
}
