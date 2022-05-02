package com.iap.ac.android.mpm.base.model.hook.result;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;

public class CommonHookResult extends BaseRpcResult {
    public String action;
    public DecodeParams decodeParams;
    public OpenParams openParams;
    public PayParams payParams;
    public PrepareMerchantAuthParams prepareMerchantAuthParams;
}
