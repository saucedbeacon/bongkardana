package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import java.util.List;

public class FetchStageInfoRepository {
    private static final String TAG = FetchStageInfoRepository.class.getSimpleName();

    public FetchStageInfosResult fetchStageInfo(List<String> list) {
        try {
            FetchStageInfoRequest fetchStageInfoRequest = new FetchStageInfoRequest();
            fetchStageInfoRequest.stageCodeList = list;
            return ((FetchStageInfoFacade) RPCProxyHost.getInterfaceProxy(FetchStageInfoFacade.class, "region_biz")).fetchStageInfo(fetchStageInfoRequest);
        } catch (Throwable th) {
            ACLog.e(TAG, "fetchStageInfo error:".concat(String.valueOf(th)));
            return null;
        }
    }
}
