package com.iap.ac.android.common.rpc.interfaces;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import java.util.Map;

public interface SignRpcRequestPlugin {
    String signRequest(@NonNull RpcAppInfo rpcAppInfo, @NonNull String str, @NonNull Map<String, String> map);
}
