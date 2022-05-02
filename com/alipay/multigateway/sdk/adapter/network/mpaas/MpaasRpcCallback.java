package com.alipay.multigateway.sdk.adapter.network.mpaas;

import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.multigateway.sdk.GatewayCallback;
import com.alipay.multigateway.sdk.GatewayInfo;

public abstract class MpaasRpcCallback implements GatewayCallback<RpcInvokeContext> {
    public abstract String getPlaintextForSign(GatewayInfo gatewayInfo, RpcInvokeContext rpcInvokeContext);

    public void onAfterGatewayApply(GatewayInfo gatewayInfo, RpcInvokeContext rpcInvokeContext) {
    }

    public void onNoRuleMatch(RpcInvokeContext rpcInvokeContext) {
    }

    public boolean shouldApplyGateway(GatewayInfo gatewayInfo, RpcInvokeContext rpcInvokeContext) {
        return true;
    }
}
