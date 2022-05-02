package com.alipay.imobile.network.quake.rpc;

import com.alipay.imobile.network.quake.IQuake;
import com.alipay.imobile.network.quake.QuakeConfig;
import java.lang.annotation.Annotation;

public interface IQuakeRpc {
    IQuake getQuake();

    QuakeConfig getRpcConfig(Object obj);

    RpcInterceptor getRpcInterceptor(Class<? extends Annotation> cls);

    <T> T getRpcProxy(Class<T> cls) throws IllegalArgumentException;

    void registerRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) throws IllegalArgumentException;

    void release();
}
