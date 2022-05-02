package com.iap.ac.android.biz.common.rpc.result;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;

public class MobilePaymentInquireQuoteResult extends BaseRpcResult {
    public String baseCurrency;
    public String quoteCurrencyPair;
    public String quoteExpiryTime;
    public String quoteId;
    public String quotePrice;
    public String quoteStartTime;
    public String quoteUnit;
}
