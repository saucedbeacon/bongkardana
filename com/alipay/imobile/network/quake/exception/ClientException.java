package com.alipay.imobile.network.quake.exception;

import com.alipay.mobile.common.rpc.RpcException;

public class ClientException extends RpcException {
    public ClientException(Integer num, String str) {
        super(num, str);
    }

    public ClientException(Integer num, Throwable th) {
        super(num, th);
    }
}
