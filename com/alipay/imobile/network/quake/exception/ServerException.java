package com.alipay.imobile.network.quake.exception;

import com.alipay.mobile.common.rpc.RpcException;

public class ServerException extends RpcException {
    public ServerException(Integer num, String str) {
        super(num, str);
    }

    public ServerException(Integer num, Throwable th) {
        super(num, th);
    }
}
