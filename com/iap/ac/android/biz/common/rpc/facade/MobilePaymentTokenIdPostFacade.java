package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentTokenIdPostRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentTokenIdPostResult;

public interface MobilePaymentTokenIdPostFacade {
    @OperationType("ac.mobilepayment.device.tokenid.post")
    @ACRpcRequest
    @SignCheck
    MobilePaymentTokenIdPostResult reportTokenId(MobilePaymentTokenIdPostRequest mobilePaymentTokenIdPostRequest);
}
