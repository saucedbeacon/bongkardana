package com.iap.ac.android.gol.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.gol.rpc.request.AuthPrepareCallbackRequest;
import com.iap.ac.android.gol.rpc.request.AuthPrepareRequest;
import com.iap.ac.android.gol.rpc.result.AuthPrepareCallbackResult;
import com.iap.ac.android.gol.rpc.result.AuthPrepareResult;

public interface AuthFacade {
    @OperationType("ac.mobilepayment.agreement.oauth.extension.prepare")
    @ACRpcRequest
    @SignCheck
    AuthPrepareResult prepare(AuthPrepareRequest authPrepareRequest);

    @OperationType("ac.mobilepayment.agreement.oauth.prepare.callback")
    @ACRpcRequest
    @SignCheck
    AuthPrepareCallbackResult prepareCallback(AuthPrepareCallbackRequest authPrepareCallbackRequest);
}
