package com.iap.ac.android.mpm.payment.source;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.mpm.base.model.payment.request.SwapOrderRequest;
import com.iap.ac.android.mpm.base.model.payment.result.SwapOrderResult;

public interface SwapOrderFacade {
    @OperationType("ac.mobilepayment.mpm.order.exchangeorderid")
    @ACRpcRequest
    @SignCheck
    SwapOrderResult swapOrder(SwapOrderRequest swapOrderRequest);
}
