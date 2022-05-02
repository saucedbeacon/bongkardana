package com.iap.ac.android.cpm.online.rpc.service;

import com.iap.ac.android.cpm.online.rpc.model.MobileInStorePaymentEncodeResultInfo;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.List;

public class MobileInStorePaymentEncodeRpcResult extends BaseRpcResult {
    public String currentServerTime;
    public List<MobileInStorePaymentEncodeResultInfo> mobileInStorePaymentEncodeResultInfos;
}
