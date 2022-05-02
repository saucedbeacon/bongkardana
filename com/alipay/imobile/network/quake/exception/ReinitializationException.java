package com.alipay.imobile.network.quake.exception;

import com.alipay.mobile.common.rpc.RpcException;

public class ReinitializationException extends RpcException {
    public ReinitializationException(int i, String str) {
        super(Integer.valueOf(i), str);
    }
}
