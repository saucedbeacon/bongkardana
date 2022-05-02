package com.alipay.plus.android.config.sdk.facade.config;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysLiteRpcRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysRpcRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigRpcLiteRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;

public interface AmcsConfigRpcFacade {
    public static final String CONFIG_EXTERNAL_FETCH = "ap.mobileprod.amcs.config.fetch";
    public static final String CONFIG_FETCH_BY_KEYS = "ap.mobileprod.amcs.config.fetch.by.keys";
    public static final String CONFIG_GRAYSCALE_FETCH = "ap.mobileprod.amcs.config.local.fetch";
    public static final String CONFIG_LITE_FETCH = "ap.mobileamcs.cloud.fetch.config";
    public static final String CONFIG_LITE_FETCH_BY_KEYS = "ap.mobileamcs.cloud.fetch.config.by.keys";
    public static final String CONFIG_NORMAL_FETCH = "com.alipayintl.imobileprod.imcs.config.fetch";

    @OperationType("com.alipayintl.imobileprod.imcs.config.fetch")
    @SignCheck
    AmcsConfigRpcResult fetchConfigList(AmcsConfigRpcRequest amcsConfigRpcRequest) throws Throwable;

    @OperationType("ap.mobileprod.amcs.config.fetch.by.keys")
    @SignCheck
    AmcsConfigRpcResult fetchConfigListByKeys(AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest) throws Throwable;

    @OperationType("ap.mobileprod.amcs.config.fetch")
    @SignCheck
    AmcsConfigRpcResult fetchConfigListExternal(AmcsConfigRpcRequest amcsConfigRpcRequest) throws Throwable;

    @OperationType("ap.mobileprod.amcs.config.local.fetch")
    AmcsConfigRpcResult fetchConfigListGrayscale(AmcsConfigRpcRequest amcsConfigRpcRequest) throws Throwable;

    @OperationType("ap.mobileamcs.cloud.fetch.config")
    @SignCheck
    AmcsConfigRpcResult fetchLiteConfig(AmcsConfigRpcLiteRequest amcsConfigRpcLiteRequest) throws Throwable;

    @OperationType("ap.mobileamcs.cloud.fetch.config.by.keys")
    @SignCheck
    AmcsConfigRpcResult fetchLiteConfigByKeys(AmcsConfigByKeysLiteRpcRequest amcsConfigByKeysLiteRpcRequest) throws Throwable;
}
