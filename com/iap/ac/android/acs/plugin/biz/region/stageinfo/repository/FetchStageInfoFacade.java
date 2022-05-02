package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;

public interface FetchStageInfoFacade {
    public static final String FETCH_STAGE_INFO = "eco.region.client.stage.batchQueryByStageCode";

    @OperationType("eco.region.client.stage.batchQueryByStageCode")
    @ACRpcRequest
    @SignCheck
    FetchStageInfosResult fetchStageInfo(FetchStageInfoRequest fetchStageInfoRequest);
}
