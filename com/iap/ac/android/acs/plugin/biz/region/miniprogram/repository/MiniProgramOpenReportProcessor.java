package com.iap.ac.android.acs.plugin.biz.region.miniprogram.repository;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;

public class MiniProgramOpenReportProcessor extends BaseNetwork<MiniProgramOpenReportFacade> {
    public String getBizCode() {
        return "region_biz";
    }

    public Class<MiniProgramOpenReportFacade> getFacadeClass() {
        return MiniProgramOpenReportFacade.class;
    }

    public MiniProgramOpenReportRpcResult openReport(@NonNull String str, @NonNull Map<String, String> map) {
        try {
            MiniProgramOpenReportRequest miniProgramOpenReportRequest = new MiniProgramOpenReportRequest();
            miniProgramOpenReportRequest.appId = str;
            miniProgramOpenReportRequest.startupParams = map;
            MiniProgramOpenReportFacade miniProgramOpenReportFacade = (MiniProgramOpenReportFacade) getFacade();
            if (miniProgramOpenReportFacade != null) {
                return miniProgramOpenReportFacade.reportMiniProgramOpen(miniProgramOpenReportRequest);
            }
            ACLog.e(Constants.TAG, "do not implementation network proxy spi");
            return null;
        } catch (Exception e) {
            ACLog.e(Constants.TAG, e.getMessage());
            return null;
        }
    }
}
