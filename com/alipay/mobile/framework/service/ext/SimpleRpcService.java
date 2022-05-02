package com.alipay.mobile.framework.service.ext;

import com.alipay.mobile.framework.service.annotation.OperationType;

public interface SimpleRpcService {
    public static final String OPERATION_TYPE = "alipay.client.executerpc";

    @OperationType("alipay.client.executerpc")
    String executeRPC(String str, String str2);

    Object getRpcConfig();
}
