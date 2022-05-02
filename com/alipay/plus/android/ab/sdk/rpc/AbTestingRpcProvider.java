package com.alipay.plus.android.ab.sdk.rpc;

import androidx.annotation.NonNull;
import com.alipay.plus.android.ab.sdk.facade.request.AbTestingRequest;
import com.alipay.plus.android.ab.sdk.facade.result.AbTestingResponse;

public interface AbTestingRpcProvider {
    AbTestingResponse fetchVariation(@NonNull AbTestingRequest abTestingRequest) throws Throwable;
}
