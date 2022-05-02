package com.iap.ac.config.lite.facade.config;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcV1Request;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcV1Request;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;

public interface AmcsConfigRpcFacade {
    @OperationType("ap.mobileamcs.cloud.fetch.config")
    AmcsConfigRpcResult fetchConfig(AmcsConfigRpcRequest amcsConfigRpcRequest) throws Exception;

    @OperationType("ap.mobileamcs.cloud.fetch.config.by.keys")
    AmcsConfigRpcResult fetchConfigListByKeys(AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest) throws Exception;

    @OperationType("ap.mobileprod.amcs.config.fetch.by.keys")
    AmcsConfigRpcResult fetchConfigListByKeysV1(AmcsConfigByKeysRpcV1Request amcsConfigByKeysRpcV1Request) throws Exception;

    @OperationType("ap.mobileprod.amcs.config.local.fetch")
    AmcsConfigRpcResult fetchConfigV1(AmcsConfigRpcV1Request amcsConfigRpcV1Request) throws Exception;
}
