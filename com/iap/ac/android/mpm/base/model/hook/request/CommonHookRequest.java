package com.iap.ac.android.mpm.base.model.hook.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class CommonHookRequest extends BaseRpcRequest {
    public String acquirerId;
    public String hookCategory;
    public String hookUrl;
    public TradePayParams tradePayParams;
}
