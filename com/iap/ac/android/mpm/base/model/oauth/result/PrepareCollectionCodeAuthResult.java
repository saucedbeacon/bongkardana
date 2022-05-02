package com.iap.ac.android.mpm.base.model.oauth.result;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.List;

public class PrepareCollectionCodeAuthResult extends BaseRpcResult {
    public String authClientId;
    public String authRedirectUrl;
    public List<String> scopes;
}
