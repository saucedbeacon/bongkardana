package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import java.util.List;

public class FetchStageInfoRequest extends BaseRpcRequest {
    public List<String> stageCodeList;
}
