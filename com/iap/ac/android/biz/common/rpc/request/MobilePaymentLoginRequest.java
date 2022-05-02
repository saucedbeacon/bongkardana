package com.iap.ac.android.biz.common.rpc.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class MobilePaymentLoginRequest extends BaseRpcRequest {
    public String authCode;
    public String instanceId;
}
