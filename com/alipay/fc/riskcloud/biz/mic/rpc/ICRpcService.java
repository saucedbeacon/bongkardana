package com.alipay.fc.riskcloud.biz.mic.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICInitRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;

public interface ICRpcService {
    public static final String COMMON_RPC_ANTCLOUD_PREFIX = "com.antcloud.ifcidentitycloud.";
    public static final String COMMON_RPC_APLIPAY_PREFIX = "com.alipay.fc.riskcloud.";
    public static final String COMMON_RPC_PREFIX = "com.alipay.fc.riskcloud.";

    @OperationType("com.alipay.fc.riskcloud.dispatch")
    @SignCheck
    MICRpcResponse dispatch(MICRpcRequest mICRpcRequest);

    @OperationType("com.alipay.fc.riskcloud.initTask")
    @SignCheck
    MICRpcResponse initVerifyTaskOuter(MICInitRequest mICInitRequest);
}
