package com.iap.ac.android.mpm.base.model.oauth.result;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.Map;

public class ApplyAgreementAuthResult extends BaseRpcResult {
    public Map<String, String> bizResult;
    public String extInfo;
    public String token;
}
