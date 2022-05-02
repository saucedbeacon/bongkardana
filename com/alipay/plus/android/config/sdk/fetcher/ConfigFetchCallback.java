package com.alipay.plus.android.config.sdk.fetcher;

import androidx.annotation.NonNull;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;

public interface ConfigFetchCallback {
    void onFetchByKeysSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult);

    void onFetchFailed(String str, String str2);

    void onFetchSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult, String str);
}
