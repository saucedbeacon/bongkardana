package com.iap.ac.android.acs.plugin.rpc.paysigncenter.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class AuthApplyRequest extends BaseRpcRequest {
    public String authCode;
    public String state;
}
