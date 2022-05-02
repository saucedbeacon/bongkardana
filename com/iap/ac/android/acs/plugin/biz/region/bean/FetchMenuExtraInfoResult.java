package com.iap.ac.android.acs.plugin.biz.region.bean;

import androidx.annotation.Keep;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.Map;

@Keep
public class FetchMenuExtraInfoResult extends BaseRpcResult {
    public Map<String, MenuExtraInfo> menuExtraInfos;
}
