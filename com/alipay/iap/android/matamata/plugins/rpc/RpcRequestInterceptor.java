package com.alipay.iap.android.matamata.plugins.rpc;

import androidx.annotation.NonNull;
import com.alipay.iap.android.matamata.plugins.rpc.model.RPCRequest;
import com.alipay.iap.android.matamata.plugins.rpc.model.RPCResponse;
import com.alipay.imobile.network.quake.NetworkResponse;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.request.RequestInterceptor;
import com.alipay.imobile.network.quake.rpc.RpcRequest;
import java.util.HashMap;

public class RpcRequestInterceptor implements RequestInterceptor {
    private final RPCPlugin rpcPlugin;

    public RpcRequestInterceptor(RPCPlugin rPCPlugin) {
        this.rpcPlugin = rPCPlugin;
    }

    public void beforeSendRequest(@NonNull Request request) {
        if (request instanceof RpcRequest) {
            RpcRequest rpcRequest = (RpcRequest) request;
            RPCRequest rPCRequest = new RPCRequest();
            rPCRequest.requestId = Integer.toString(rpcRequest.hashCode());
            Object params = rpcRequest.getParams();
            if (params != null && (params instanceof Object[])) {
                rPCRequest.arguments = (Object[]) params;
            }
            HashMap hashMap = new HashMap();
            if (rpcRequest.getProtocol().getExternalInfo(rpcRequest) != null) {
                hashMap.putAll(rpcRequest.getProtocol().getExternalInfo(rpcRequest));
            }
            if (rpcRequest.getExternalInfo() != null) {
                hashMap.putAll(rpcRequest.getExternalInfo());
            }
            rPCRequest.headers = hashMap;
            rPCRequest.timeStamp = System.currentTimeMillis();
            rPCRequest.method = rpcRequest.getActionType();
            rPCRequest.url = rpcRequest.getUrl();
            this.rpcPlugin.reportRequest(rPCRequest);
        }
    }

    public void afterReceiveResponse(@NonNull Request request, @NonNull NetworkResponse networkResponse) {
        if (request instanceof RpcRequest) {
            RPCResponse rPCResponse = new RPCResponse();
            rPCResponse.requestId = Integer.toString(((RpcRequest) request).hashCode());
            rPCResponse.timeStamp = System.currentTimeMillis();
            rPCResponse.headers = networkResponse.extData;
            rPCResponse.result = new String(networkResponse.data);
            this.rpcPlugin.reportResponse(rPCResponse);
        }
    }
}
