package com.iap.ac.android.acs.plugin.rpc.paysigncenter;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.acs.plugin.rpc.paysigncenter.request.AuthApplyRequest;
import com.iap.ac.android.acs.plugin.rpc.paysigncenter.request.AuthPrepareRequest;
import com.iap.ac.android.acs.plugin.rpc.paysigncenter.result.AuthPrepareResult;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;

public interface PaySignCenterFacade {
    public static final String OPERATION_TYPE_AUTH_APPLY = "ac.mobilepayment.agreement.oauth.apply";
    public static final String OPERATION_TYPE_AUTH_PREPARE = "ac.mobilepayment.agreement.oauth.prepare";

    @OperationType("ac.mobilepayment.agreement.oauth.apply")
    @ACRpcRequest
    @SignCheck
    BaseRpcResult authApply(AuthApplyRequest authApplyRequest);

    @OperationType("ac.mobilepayment.agreement.oauth.prepare")
    @ACRpcRequest
    @SignCheck
    AuthPrepareResult authPrepare(AuthPrepareRequest authPrepareRequest);
}
