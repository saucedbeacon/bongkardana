package com.iap.ac.android.gol.rpc.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class AuthPrepareCallbackRequest extends BaseRpcRequest {
    public String authCode;
    public String authRedirectUrl;
    public String authState;
    public String passThroughInfo;
    public String referenceAgreementId;
}
