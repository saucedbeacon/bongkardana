package com.iap.ac.android.mpm.oauth.agreement.source;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.mpm.base.model.oauth.request.ApplyAgreementAuthRequest;
import com.iap.ac.android.mpm.base.model.oauth.request.PrepareAgreementAuthRequest;
import com.iap.ac.android.mpm.base.model.oauth.result.ApplyAgreementAuthResult;
import com.iap.ac.android.mpm.base.model.oauth.result.PrepareAgreementAuthResult;

public interface AgreementAuthFacade {
    @OperationType("ac.mobilepayment.agreement.oauth.apply")
    @ACRpcRequest
    @SignCheck
    ApplyAgreementAuthResult Apply(ApplyAgreementAuthRequest applyAgreementAuthRequest);

    @OperationType("ac.mobilepayment.agreement.oauth.prepare")
    @ACRpcRequest
    @SignCheck
    PrepareAgreementAuthResult prepare(PrepareAgreementAuthRequest prepareAgreementAuthRequest);
}
