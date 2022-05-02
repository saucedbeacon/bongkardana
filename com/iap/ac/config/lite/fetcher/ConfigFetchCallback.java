package com.iap.ac.config.lite.fetcher;

import androidx.annotation.NonNull;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;

public interface ConfigFetchCallback {
    void onFetchByKeysSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult);

    void onFetchFailed(String str, String str2);

    void onFetchSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult, String str);
}
