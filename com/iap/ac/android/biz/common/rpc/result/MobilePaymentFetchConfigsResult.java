package com.iap.ac.android.biz.common.rpc.result;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.Map;

public class MobilePaymentFetchConfigsResult extends BaseRpcResult {
    public Map<String, String> basicConfigs;
    public Map<String, String> cpmConfigs;
    public Map<String, String> mpmConfigs;
}
