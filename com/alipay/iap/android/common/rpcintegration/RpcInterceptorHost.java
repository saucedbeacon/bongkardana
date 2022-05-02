package com.alipay.iap.android.common.rpcintegration;

import com.alipay.mobile.common.rpc.RpcException;
import java.lang.reflect.Method;
import java.util.Map;

public interface RpcInterceptorHost {
    boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException, String str) throws RpcException;

    boolean postHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, String str) throws RpcException;

    boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, String str, ThreadLocal<Map<String, Object>> threadLocal2) throws RpcException;
}
