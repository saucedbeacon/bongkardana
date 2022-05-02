package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentHoldLoginRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentHoldLoginResult;

public interface MobilePaymentHoldLoginRpcFacade {
    @OperationType("ac.mobilepayment.auth.holdlogin")
    @ACRpcRequest
    @SignCheck
    MobilePaymentHoldLoginResult holdLogin(MobilePaymentHoldLoginRequest mobilePaymentHoldLoginRequest);
}
