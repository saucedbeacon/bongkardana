package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentLogoutRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentLogoutResult;

public interface MobilePaymentLogoutRpcFacade {
    @OperationType("ac.mobilepayment.auth.logout")
    @ACRpcRequest
    @SignCheck
    MobilePaymentLogoutResult logout(MobilePaymentLogoutRequest mobilePaymentLogoutRequest);
}
