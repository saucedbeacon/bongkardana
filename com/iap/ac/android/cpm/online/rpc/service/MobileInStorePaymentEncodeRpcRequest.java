package com.iap.ac.android.cpm.online.rpc.service;

import com.iap.ac.android.cpm.online.rpc.model.MobileInStorePaymentInitInfo;
import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class MobileInStorePaymentEncodeRpcRequest extends BaseRpcRequest {
    public int batchCount;
    public String codeType;
    public int generateInterval;
    public MobileInStorePaymentInitInfo mobileInStorePaymentInitInfo;
}
