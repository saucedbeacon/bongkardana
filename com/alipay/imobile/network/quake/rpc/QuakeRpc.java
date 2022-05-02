package com.alipay.imobile.network.quake.rpc;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.IQuake;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.QuakeConfig;
import com.alipay.mobile.common.rpc.RpcException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class QuakeRpc implements IQuakeRpc {
    private static IQuakeRpc c;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, RpcInterceptor> f9368a = new HashMap();
    private IQuake b;

    protected QuakeRpc(Context context) {
        this.b = Quake.createInstance(context);
    }

    private synchronized void a(String str, RpcInterceptor rpcInterceptor) throws IllegalArgumentException {
        RpcInterceptor rpcInterceptor2;
        if (TextUtils.isEmpty(str) || rpcInterceptor == null) {
            throw new IllegalArgumentException("the input parameter can not be null");
        }
        if (this.f9368a.containsKey(str) && (rpcInterceptor2 = this.f9368a.get(str)) != null) {
            if (!rpcInterceptor2.equals(rpcInterceptor)) {
                StringBuilder sb = new StringBuilder("The RPC interceptor to be registered with the key: ");
                sb.append(str);
                sb.append(" has exist");
                String obj = sb.toString();
                LoggerWrapper.e(Quake.TAG, obj);
                throw new IllegalArgumentException(obj);
            }
        }
        this.f9368a.put(str, rpcInterceptor);
    }

    public static synchronized IQuakeRpc createInstance(Context context) {
        IQuakeRpc iQuakeRpc;
        synchronized (QuakeRpc.class) {
            if (c == null) {
                c = new QuakeRpc(context);
            }
            iQuakeRpc = c;
        }
        return iQuakeRpc;
    }

    public static synchronized IQuakeRpc instance() throws RpcException {
        IQuakeRpc iQuakeRpc;
        synchronized (QuakeRpc.class) {
            if (c != null) {
                iQuakeRpc = c;
            } else {
                throw new RpcException((Integer) 9, "IQuakeRpc has not been initialized by createInstance(Context).");
            }
        }
        return iQuakeRpc;
    }

    public synchronized IQuake getQuake() {
        return this.b;
    }

    public QuakeConfig getRpcConfig(Object obj) {
        try {
            return ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).a();
        } catch (Throwable th) {
            LoggerWrapper.e("QuakeRpc", "getRpcConfig failed.", th);
            return new QuakeConfig("", "");
        }
    }

    public synchronized RpcInterceptor getRpcInterceptor(Class<? extends Annotation> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        return this.f9368a.get(name);
    }

    public synchronized <T> T getRpcProxy(Class<T> cls) throws IllegalArgumentException {
        if (cls != null) {
        } else {
            throw new IllegalArgumentException("the input parameter can not be null");
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(instance(), cls));
    }

    public synchronized void registerRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) throws IllegalArgumentException {
        if (cls != null) {
            if (!TextUtils.isEmpty(cls.getName()) && rpcInterceptor != null) {
                a(cls.getName(), rpcInterceptor);
            }
        }
        throw new IllegalArgumentException("the input parameter can not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.alipay.imobile.network.quake.rpc.IQuakeRpc r0 = c     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 0
            c = r0     // Catch:{ all -> 0x0022 }
            com.alipay.imobile.network.quake.IQuake r1 = r2.b     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0015
            com.alipay.imobile.network.quake.IQuake r1 = r2.b     // Catch:{ all -> 0x0022 }
            r1.release()     // Catch:{ all -> 0x0022 }
            r2.b = r0     // Catch:{ all -> 0x0022 }
        L_0x0015:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.rpc.RpcInterceptor> r1 = r2.f9368a     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0020
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.rpc.RpcInterceptor> r1 = r2.f9368a     // Catch:{ all -> 0x0022 }
            r1.clear()     // Catch:{ all -> 0x0022 }
            r2.f9368a = r0     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.rpc.QuakeRpc.release():void");
    }
}
