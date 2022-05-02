package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentFetchConfigsRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentFetchConfigsResult;

public interface MobilePaymentConfigRpcFacade {
    @OperationType("ac.mobilepayment.common.fetch.configs")
    @ACRpcRequest
    @SignCheck
    MobilePaymentFetchConfigsResult fetchConfigs(MobilePaymentFetchConfigsRequest mobilePaymentFetchConfigsRequest);
}
