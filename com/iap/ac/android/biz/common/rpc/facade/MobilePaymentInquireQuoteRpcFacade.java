package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentInquireQuoteResult;

public interface MobilePaymentInquireQuoteRpcFacade {
    @OperationType("ac.mobilepayment.common.exchange.rate.query.by.currency.pair")
    @ACRpcRequest
    @SignCheck
    MobilePaymentInquireQuoteResult inquireQuote(MobilePaymentInquireQuoteRequest mobilePaymentInquireQuoteRequest);
}
