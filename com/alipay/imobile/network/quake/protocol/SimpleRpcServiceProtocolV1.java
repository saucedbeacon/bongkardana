package com.alipay.imobile.network.quake.protocol;

import android.content.Context;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.protocol.json.SignedJsonProtocolV1;
import com.alipay.imobile.network.quake.rpc.RpcRequest;

public class SimpleRpcServiceProtocolV1 extends SignedJsonProtocolV1 {
    public SimpleRpcServiceProtocolV1(Context context) {
        super(context);
    }

    public String getRequestDataJson(Request request) {
        Object params;
        if (request != null && (request instanceof RpcRequest)) {
            RpcRequest rpcRequest = (RpcRequest) request;
            if (rpcRequest.isSkipRequestSerialize() && (params = rpcRequest.getParams()) != null) {
                return params.toString();
            }
        }
        return super.getRequestDataJson(request);
    }
}
