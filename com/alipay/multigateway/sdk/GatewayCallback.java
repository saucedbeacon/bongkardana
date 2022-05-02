package com.alipay.multigateway.sdk;

public interface GatewayCallback<Req> {
    String getPlaintextForSign(GatewayInfo gatewayInfo, Req req);

    void onAfterGatewayApply(GatewayInfo gatewayInfo, Req req);

    void onNoRuleMatch(Req req);

    boolean shouldApplyGateway(GatewayInfo gatewayInfo, Req req);
}
