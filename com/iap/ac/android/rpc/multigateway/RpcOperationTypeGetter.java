package com.iap.ac.android.rpc.multigateway;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.multigateway.sdk.decision.condition.getter.IGetter;
import com.iap.ac.android.common.rpc.RpcRequest;

public class RpcOperationTypeGetter implements IGetter {
    @Nullable
    public String getValue(@NonNull Object obj) {
        if (obj instanceof RpcRequest) {
            return ((RpcRequest) obj).operationType;
        }
        return null;
    }
}
