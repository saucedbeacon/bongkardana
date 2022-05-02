package com.iap.ac.android.acs.plugin.biz.region.miniprogram.repository;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;

public interface MiniProgramOpenReportFacade {
    @OperationType("eco.region.client.recentlyused.uploadLastUsedApp")
    @ACRpcRequest
    @SignCheck
    MiniProgramOpenReportRpcResult reportMiniProgramOpen(MiniProgramOpenReportRequest miniProgramOpenReportRequest);
}
