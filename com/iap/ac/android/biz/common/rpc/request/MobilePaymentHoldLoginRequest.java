package com.iap.ac.android.biz.common.rpc.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class MobilePaymentHoldLoginRequest extends BaseRpcRequest {
    public String clientKeyDigest;
    public String instanceId;
    public String nonce;
    public String openId;
    public long timestamp;
}
