package com.iap.ac.android.cpm.online.rpc.facade;

import androidx.annotation.NonNull;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.cpm.online.rpc.service.MobileInStorePaymentEncodeRpcRequest;
import com.iap.ac.android.cpm.online.rpc.service.MobileInStorePaymentEncodeRpcResult;

public interface MobileInStorePaymentEncodeRpcFacade {
    @OperationType("ac.mobilepayment.instorepayment.cpm.encode")
    @ACRpcRequest
    @SignCheck
    MobileInStorePaymentEncodeRpcResult encode(@NonNull MobileInStorePaymentEncodeRpcRequest mobileInStorePaymentEncodeRpcRequest);
}
