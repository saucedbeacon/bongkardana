package com.alipay.multigateway.sdk.adapter.signature;

import androidx.annotation.NonNull;
import com.alipay.multigateway.sdk.GatewayInfo;

public interface SignatureHandler {
    String signRequest(String str, @NonNull GatewayInfo.SignInfo signInfo) throws Exception;
}
