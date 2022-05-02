package com.alipay.imobile.network.quake;

import com.alipay.imobile.network.quake.cache.Cache;
import com.alipay.mobile.common.rpc.RpcException;

public class Response<T> {
    public final Cache.Entry cacheEntry;
    public final RpcException error;
    public boolean intermediate;
    public final T result;

    private Response(RpcException rpcException) {
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = rpcException;
    }

    private Response(T t, Cache.Entry entry) {
        this.intermediate = false;
        this.result = t;
        this.cacheEntry = entry;
        this.error = null;
    }

    public static <T> Response<T> error(RpcException rpcException) {
        return new Response<>(rpcException);
    }

    public static <T> Response<T> success(T t, Cache.Entry entry) {
        return new Response<>(t, entry);
    }

    public boolean isSuccess() {
        return this.error == null;
    }
}
