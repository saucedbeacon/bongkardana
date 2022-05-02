package com.alipay.multigateway.sdk;

import androidx.annotation.NonNull;

public interface NetworkDelegate {
    void setGatewayInfo(@NonNull GatewayInfo gatewayInfo, @NonNull Object obj);
}
