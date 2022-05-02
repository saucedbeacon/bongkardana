package com.iap.ac.android.mpm.base.model.oauth.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class ApplyAgreementAuthRequest extends BaseRpcRequest {
    public String authCode;
    public String state;
}
