package com.alipay.multigateway.sdk.adapter.network.mpaas;

import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.framework.MicroApplicationContext;
import com.alipay.multigateway.sdk.GatewayController;

public class MpaasRpcGatewayControllerFactory {
    private static GatewayController sController;

    public static GatewayController createController(MicroApplicationContext microApplicationContext) {
        GatewayController gatewayController = sController;
        if (gatewayController != null) {
            return gatewayController;
        }
        sController = new GatewayController();
        sController.init(microApplicationContext.getApplicationContext(), new MpaasRpcNetworkDelegate());
        return sController;
    }

    public static GatewayController getController() {
        return sController;
    }

    public static RpcInterceptor getInterceptor() {
        return sController.getDelegate();
    }
}
