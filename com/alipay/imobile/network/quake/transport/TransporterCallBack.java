package com.alipay.imobile.network.quake.transport;

import com.alipay.imobile.network.quake.NetworkResponse;
import com.alipay.imobile.network.quake.Request;
import com.alipay.mobile.common.rpc.RpcException;

public interface TransporterCallBack {
    void onCompeleted(Request request, NetworkResponse networkResponse);

    void onException(Request request, RpcException rpcException);
}
