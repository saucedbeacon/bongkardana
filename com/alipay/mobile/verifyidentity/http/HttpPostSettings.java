package com.alipay.mobile.verifyidentity.http;

import com.alipay.fc.riskcloud.biz.mic.rpc.ICRpcService;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICInitRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;

public class HttpPostSettings implements ICRpcService {
    private static HttpPostSettings instance;

    public static synchronized HttpPostSettings getInstance() {
        HttpPostSettings httpPostSettings;
        synchronized (HttpPostSettings.class) {
            if (instance == null) {
                instance = new HttpPostSettings();
            }
            httpPostSettings = instance;
        }
        return httpPostSettings;
    }

    public MICRpcResponse initVerifyTaskOuter(MICInitRequest mICInitRequest) {
        return HttpTaskUtil.getHttpResponse(mICInitRequest);
    }

    public MICRpcResponse dispatch(MICRpcRequest mICRpcRequest) {
        return HttpTaskUtil.getHttpResponse(mICRpcRequest);
    }
}
