package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentLoginRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentLoginResult;

public interface MobilePaymentLoginRpcFacade {
    @OperationType("ac.mobilepayment.auth.authlogin")
    @ACRpcRequest
    @SignCheck
    MobilePaymentLoginResult login(MobilePaymentLoginRequest mobilePaymentLoginRequest);
}
