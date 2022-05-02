package com.iap.ac.android.biz.common.rpc.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class MobilePaymentInquireQuoteRequest extends BaseRpcRequest {
    public String buyCurrency;
    public String sellCurrency;
}
