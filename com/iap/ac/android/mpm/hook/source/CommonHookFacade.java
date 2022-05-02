package com.iap.ac.android.mpm.hook.source;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.mpm.base.model.hook.request.CommonHookRequest;
import com.iap.ac.android.mpm.base.model.hook.result.CommonHookResult;

public interface CommonHookFacade {
    @OperationType("ac.mobilepayment.common.client.hook")
    @ACRpcRequest
    @SignCheck
    CommonHookResult commonHook(CommonHookRequest commonHookRequest);
}
