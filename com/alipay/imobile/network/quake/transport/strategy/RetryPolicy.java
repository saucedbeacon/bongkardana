package com.alipay.imobile.network.quake.transport.strategy;

import com.alipay.mobile.common.rpc.RpcException;

public interface RetryPolicy {
    int getCurrentRetryCount();

    int getCurrentTimeout();

    void retry(RpcException rpcException) throws RpcException;
}
