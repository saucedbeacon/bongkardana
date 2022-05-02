package com.iap.ac.android.rpc.multigateway;

import androidx.annotation.NonNull;
import com.alipay.multigateway.sdk.GatewayInfo;
import com.alipay.multigateway.sdk.NetworkDelegate;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.rpc.utils.RpcUtils;

public class RpcGatewayDelegate implements NetworkDelegate {
    private static final String TAG = RpcUtils.logTag("RpcGatewayDelegate");

    public void setGatewayInfo(@NonNull GatewayInfo gatewayInfo, @NonNull Object obj) {
        if (obj instanceof RpcRequest) {
            RpcAppInfo rpcAppInfo = new RpcAppInfo();
            rpcAppInfo.rpcGateWayUrl = gatewayInfo.targetUrl;
            rpcAppInfo.addHeaders(gatewayInfo.headers);
            GatewayInfo.SignInfo signInfo = gatewayInfo.signInfo;
            if (!(signInfo == null || signInfo.extra == null)) {
                rpcAppInfo.appId = signInfo.extra.get("appId");
                rpcAppInfo.appKey = signInfo.extra.get("appKey");
                rpcAppInfo.authCode = signInfo.extra.get("authCode");
            }
            ((RpcRequest) obj).setRpcAppInfo(rpcAppInfo);
        }
    }
}
