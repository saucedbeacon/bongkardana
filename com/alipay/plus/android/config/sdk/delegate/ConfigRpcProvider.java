package com.alipay.plus.android.config.sdk.delegate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysLiteRpcRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysRpcRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;

public interface ConfigRpcProvider {
    @Nullable
    AmcsConfigRpcResult fetchApps(@NonNull AmcsConfigByKeysLiteRpcRequest amcsConfigByKeysLiteRpcRequest) throws Throwable;

    @Nullable
    AmcsConfigRpcResult fetchConfig(@NonNull AmcsConfigRpcRequest amcsConfigRpcRequest, @Nullable String str) throws Throwable;

    @Nullable
    AmcsConfigRpcResult fetchConfigByKeys(@NonNull AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest, @Nullable String str) throws Throwable;
}
