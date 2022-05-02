package com.iap.ac.config.lite.delegate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcV1Request;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcV1Request;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;

public interface ConfigRpcProvider {
    @Nullable
    AmcsConfigRpcResult fetchConfig(@NonNull AmcsConfigRpcRequest amcsConfigRpcRequest) throws Exception;

    @Nullable
    AmcsConfigRpcResult fetchConfigByKeys(@NonNull AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest) throws Exception;

    @Nullable
    AmcsConfigRpcResult fetchConfigByKeysV1(@NonNull AmcsConfigByKeysRpcV1Request amcsConfigByKeysRpcV1Request) throws Exception;

    @Nullable
    AmcsConfigRpcResult fetchConfigV1(@NonNull AmcsConfigRpcV1Request amcsConfigRpcV1Request) throws Exception;
}
