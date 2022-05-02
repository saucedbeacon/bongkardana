package com.alipay.multigateway.sdk.adapter.network.quake;

import com.alipay.imobile.network.quake.Request;
import com.alipay.multigateway.sdk.GatewayCallback;
import com.alipay.multigateway.sdk.GatewayInfo;

public abstract class QuakeCallback implements GatewayCallback<Request> {
    public String getPlaintextForSign(GatewayInfo gatewayInfo, Request request) {
        return "";
    }

    public void onAfterGatewayApply(GatewayInfo gatewayInfo, Request request) {
    }

    public void onNoRuleMatch(Request request) {
    }

    public boolean shouldApplyGateway(GatewayInfo gatewayInfo, Request request) {
        return true;
    }
}
