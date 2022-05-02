package com.alipay.iap.android.common.rpcintegration;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.IQuake;
import com.alipay.imobile.network.quake.QuakeConfig;
import com.alipay.imobile.network.quake.exception.ReinitializationException;
import com.alipay.imobile.network.quake.rpc.QuakeRpc;
import com.alipay.imobile.network.quake.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.RpcException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class RPCProxyHost {
    private static Map<String, Object> hostMap = new HashMap();
    private static IRPCProxy rpcOuterImplement = null;

    public interface IRPCProxy {
        <T> T getInterfaceProxy(Class<T> cls);
    }

    public static <T> T getInterfaceProxy(Class<T> cls) {
        if (hostMap.containsKey(cls.getName())) {
            return hostMap.get(cls.getName());
        }
        IRPCProxy iRPCProxy = rpcOuterImplement;
        if (iRPCProxy == null) {
            return null;
        }
        T interfaceProxy = iRPCProxy.getInterfaceProxy(cls);
        hostMap.put(cls.getName(), interfaceProxy);
        return interfaceProxy;
    }

    public static void setRPCImplement(IRPCProxy iRPCProxy) {
        rpcOuterImplement = iRPCProxy;
    }

    private static boolean checkQuakeExist() throws ClassNotFoundException {
        try {
            return Class.forName("com.alipay.imobile.network.quake.rpc.IQuakeRpc") != null;
        } catch (ClassNotFoundException unused) {
            LoggerWrapper.w("RPCProxyHost", "Quake not in application package.");
            if (rpcOuterImplement != null) {
                return false;
            }
            throw new ClassNotFoundException("Neither IAPNetworkKit in this package nor another RPC implementation is set to RPCHost, network will not be available");
        }
    }

    public static void initRPC(Context context, String str, String str2, String str3) throws ReinitializationException, IllegalArgumentException, ClassNotFoundException {
        if (checkQuakeExist()) {
            IQuake quake = QuakeRpc.createInstance(context).getQuake();
            if (TextUtils.isEmpty(str2)) {
                LoggerWrapper.i("RPCProxyHost", "the appKey for security guard is empty");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb = new StringBuilder("[Use user-passed configuration] configuration:appkey=");
                sb.append(str2);
                sb.append(", gwurl=");
                sb.append(str3);
                LoggerWrapper.i("RPCProxyHost", sb.toString());
                quake.config(new QuakeConfig(str, str2, str3));
                setRPCImplement(new IRPCProxy() {
                    public final <T> T getInterfaceProxy(Class<T> cls) {
                        return QuakeRpc.instance().getRpcProxy(cls);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("the url of gate way is empty");
        }
    }

    public static void initRPC(Context context, String str, String str2) throws ReinitializationException, IllegalArgumentException, ClassNotFoundException {
        if (checkQuakeExist()) {
            IQuake quake = QuakeRpc.createInstance(context).getQuake();
            if (TextUtils.isEmpty(str)) {
                LoggerWrapper.i("RPCProxyHost", "the appKey for security guard is empty");
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder("[Use user-passed configuration] configuration:appkey=");
                sb.append(str);
                sb.append(", gwurl=");
                sb.append(str2);
                LoggerWrapper.i("RPCProxyHost", sb.toString());
                quake.config(new QuakeConfig(str, str, str2));
                setRPCImplement(new IRPCProxy() {
                    public final <T> T getInterfaceProxy(Class<T> cls) {
                        return QuakeRpc.instance().getRpcProxy(cls);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("the url of gate way is empty");
        }
    }

    public static void registerRpcInterceptor(Context context, Class<? extends Annotation> cls, final RpcInterceptorHost rpcInterceptorHost) throws IllegalArgumentException, ClassNotFoundException {
        if (context == null || cls == null || rpcInterceptorHost == null) {
            throw new IllegalArgumentException("the arguments is illegal");
        } else if (checkQuakeExist()) {
            QuakeRpc.createInstance(context).registerRpcInterceptor(cls, new RpcInterceptor() {
                public final boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, String str, ThreadLocal<Map<String, Object>> threadLocal2) throws RpcException {
                    return rpcInterceptorHost.preHandle(obj, threadLocal, bArr, cls, method, objArr, str, threadLocal2);
                }

                public final boolean postHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, String str) throws RpcException {
                    return rpcInterceptorHost.postHandle(obj, threadLocal, bArr, cls, method, objArr, str);
                }

                public final boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException, String str) throws RpcException {
                    return rpcInterceptorHost.exceptionHandle(obj, threadLocal, bArr, cls, method, objArr, rpcException, str);
                }
            });
        }
    }
}
