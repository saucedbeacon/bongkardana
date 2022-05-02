package com.iap.ac.android.acs.plugin.biz.region.miniprogram.repository;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import java.util.Map;

public class MiniProgramOpenReportRequest extends BaseRpcRequest {
    public String appId;
    public Map<String, String> startupParams;
}
