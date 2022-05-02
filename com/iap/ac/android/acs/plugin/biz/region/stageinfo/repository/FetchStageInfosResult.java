package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import androidx.annotation.Keep;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.Map;

@Keep
public class FetchStageInfosResult extends BaseRpcResult {
    public Map<String, StageInfo> stageInfo;
}
