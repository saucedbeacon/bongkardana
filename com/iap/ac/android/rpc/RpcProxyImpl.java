package com.iap.ac.android.rpc;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.common.rpc.http.HttpTransportFactory;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.interfaces.FacadeInvoker;
import com.iap.ac.android.common.rpc.interfaces.RpcInterceptor;
import com.iap.ac.android.common.rpc.interfaces.SignRpcRequestPlugin;
import com.iap.ac.android.common.rpc.interfaces.SslPinningPlugin;
import com.iap.ac.android.rpc.http.impl.HttpUrlTransport;
import com.iap.ac.android.rpc.utils.RpcUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class RpcProxyImpl implements RPCProxyHost.IRPCProxy {
    @NonNull
    private static final RpcProxyImpl INSTANCE = new RpcProxyImpl("");
    private static final String TAG = RpcUtils.logTag("RpcProxyImpl");
    private static final Map<String, RpcProxyImpl> instanceMap = new HashMap();
    public String bizCode = "";
    private Context mContext;
    @NonNull
    private FacadeInvoker mDefaultFacadeInvoker;
    @NonNull
    private final Map<String, FacadeInvoker> mFacadeInvokerMap = new HashMap();
    @NonNull
    private RpcAppInfo mRpcAppInfo = new RpcAppInfo();
    @NonNull
    private final CopyOnWriteArrayList<RpcInterceptor> mRpcInterceptors = new CopyOnWriteArrayList<>();
    @Nullable
    private SignRpcRequestPlugin mRpcSignPlugin;
    @Nullable
    private SslPinningPlugin mSslPinningPlugin;

    private RpcProxyImpl(@NonNull String str) {
        this.bizCode = str;
        this.mDefaultFacadeInvoker = new BaseRpcFacadeInvoker(this, str);
    }

    @NonNull
    public static RpcProxyImpl getInstance(String str) {
        if (TextUtils.isEmpty(str)) {
            return getInstance();
        }
        RpcProxyImpl rpcProxyImpl = instanceMap.get(str);
        if (rpcProxyImpl != null) {
            return rpcProxyImpl;
        }
        RpcProxyImpl rpcProxyImpl2 = new RpcProxyImpl(str);
        instanceMap.put(str, rpcProxyImpl2);
        return rpcProxyImpl2;
    }

    @NonNull
    public static RpcProxyImpl getInstance() {
        return INSTANCE;
    }

    @Nullable
    public static String getRpcOperationType(@NonNull Method method) {
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (operationType != null) {
            return operationType.value();
        }
        return null;
    }

    public void initialize(@NonNull Context context, @NonNull RpcAppInfo rpcAppInfo) {
        this.mContext = context.getApplicationContext();
        this.mRpcAppInfo = rpcAppInfo;
        if (HttpTransportFactory.getCreater() == null) {
            HttpTransportFactory.setCreater(new HttpTransportFactory.Creater() {
                public AbstractHttpTransport createHttpTransport(@NonNull Context context) throws Exception {
                    return new HttpUrlTransport(false, context);
                }
            });
        }
    }

    @NonNull
    public RpcAppInfo getRpcAppInfo() {
        return this.mRpcAppInfo;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.mContext;
    }

    @NonNull
    public List<RpcInterceptor> getRpcInterceptors() {
        return this.mRpcInterceptors;
    }

    public void customizeRpcFacadeInvoker(@NonNull String str, @NonNull FacadeInvoker facadeInvoker) {
        this.mFacadeInvokerMap.put(str, facadeInvoker);
    }

    @NonNull
    public FacadeInvoker getRpcFacadeInvoker(@NonNull String str) {
        FacadeInvoker facadeInvoker = this.mFacadeInvokerMap.get(str);
        return facadeInvoker == null ? this.mDefaultFacadeInvoker : facadeInvoker;
    }

    public <T> T getInterfaceProxy(Class<T> cls) {
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.bizCode));
        if (cls.isInstance(newProxyInstance)) {
            return newProxyInstance;
        }
        return null;
    }

    public <T> T getInterfaceProxy(Class<T> cls, @NonNull RPCProxyHost.RpcInvocationHandlerListener rpcInvocationHandlerListener) {
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.bizCode, rpcInvocationHandlerListener));
        if (cls.isInstance(newProxyInstance)) {
            return newProxyInstance;
        }
        return null;
    }

    public void setSignRequest(@Nullable SignRpcRequestPlugin signRpcRequestPlugin) {
        this.mRpcSignPlugin = signRpcRequestPlugin;
    }

    @Nullable
    public String signRequest(@NonNull RpcAppInfo rpcAppInfo, String str, Map<String, String> map) {
        SignRpcRequestPlugin signRpcRequestPlugin = this.mRpcSignPlugin;
        if (signRpcRequestPlugin == null) {
            return null;
        }
        return signRpcRequestPlugin.signRequest(rpcAppInfo, str, map);
    }

    @Nullable
    public SslPinningPlugin getSslPinningPlugin() {
        return this.mSslPinningPlugin;
    }

    public void setSslPinningPlugin(@NonNull SslPinningPlugin sslPinningPlugin) {
        this.mSslPinningPlugin = sslPinningPlugin;
    }

    public void addRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor) {
        this.mRpcInterceptors.add(rpcInterceptor);
    }

    public void removeRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor) {
        this.mRpcInterceptors.remove(rpcInterceptor);
    }

    public void clearRpcInterceptors() {
        this.mRpcInterceptors.clear();
    }
}
