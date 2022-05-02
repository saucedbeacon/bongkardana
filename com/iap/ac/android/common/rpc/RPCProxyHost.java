package com.iap.ac.android.common.rpc;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.common.rpc.interfaces.RpcInterceptor;
import com.iap.ac.android.common.rpc.interfaces.SignRpcRequestPlugin;
import com.iap.ac.android.common.rpc.interfaces.SslPinningPlugin;
import java.util.HashMap;
import java.util.Map;

public class RPCProxyHost {
    private static final String EVENT_GET_DEFAULT_IMPL = "ac_common_get_rpc_defalut_impl";
    private static final String EVENT_GET_IMPL_ERROR = "ac_common_get_rpc_impl_error";
    private static final String TAG = "RPCProxyHost";
    private static IRPCProxy defaultProxy = new IRPCProxy() {
        public final <T> T getInterfaceProxy(Class<T> cls) {
            RPCProxyHost.noImplementationError();
            return null;
        }

        public final <T> T getInterfaceProxy(Class<T> cls, RpcInvocationHandlerListener rpcInvocationHandlerListener) {
            RPCProxyHost.noImplementationError();
            return null;
        }

        public final void setSignRequest(SignRpcRequestPlugin signRpcRequestPlugin) {
            RPCProxyHost.noImplementationError();
        }

        public final void setSslPinningPlugin(SslPinningPlugin sslPinningPlugin) {
            RPCProxyHost.noImplementationError();
        }

        public final void addRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor) {
            RPCProxyHost.noImplementationError();
        }

        public final void removeRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor) {
            RPCProxyHost.noImplementationError();
        }

        public final void clearRpcInterceptors() {
            RPCProxyHost.noImplementationError();
        }
    };
    private static IRPCProxy irpcProxy = null;
    private static final Map<String, IRPCProxy> rpcProxyMap = new HashMap();

    public interface IRPCProxy {
        void addRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor);

        void clearRpcInterceptors();

        <T> T getInterfaceProxy(Class<T> cls);

        <T> T getInterfaceProxy(Class<T> cls, RpcInvocationHandlerListener rpcInvocationHandlerListener);

        void removeRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor);

        void setSignRequest(SignRpcRequestPlugin signRpcRequestPlugin);

        void setSslPinningPlugin(SslPinningPlugin sslPinningPlugin);
    }

    public interface RpcInvocationHandlerListener {
        void onBeforeSend(@NonNull RpcRequest rpcRequest);
    }

    public static <T> T getInterfaceProxy(Class<T> cls) {
        IRPCProxy iRPCProxy = irpcProxy;
        if (iRPCProxy == null) {
            return null;
        }
        return iRPCProxy.getInterfaceProxy(cls);
    }

    public static <T> T getInterfaceProxy(Class<T> cls, @NonNull String str) {
        return getInterfaceProxy(cls, str, (RpcInvocationHandlerListener) null);
    }

    public static <T> T getInterfaceProxy(Class<T> cls, @NonNull String str, RpcInvocationHandlerListener rpcInvocationHandlerListener) {
        return getInstance(str).getInterfaceProxy(cls, rpcInvocationHandlerListener);
    }

    @NonNull
    public static IRPCProxy getInstance(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return getInstance();
        }
        IRPCProxy iRPCProxy = rpcProxyMap.get(str);
        if (iRPCProxy == null && (iRPCProxy = irpcProxy) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", str);
            hashMap.put("msg", "Cannot find the implemetation for this bizCode. Using default instead.");
            LogEvent logEvent = new LogEvent(EVENT_GET_DEFAULT_IMPL, hashMap);
            logEvent.bizCode = str;
            ACMonitor.getInstance(str).logEvent(logEvent);
        }
        if (iRPCProxy != null) {
            return iRPCProxy;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bizCode", str);
        hashMap2.put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, "Cannot find the implemetation for this bizCode.");
        LogEvent logEvent2 = new LogEvent(EVENT_GET_IMPL_ERROR, hashMap2);
        logEvent2.bizCode = str;
        logEvent2.eventType = LogEventType.CRUCIAL_LOG;
        ACMonitor.getInstance(str).logEvent(logEvent2);
        return defaultProxy;
    }

    @NonNull
    public static IRPCProxy getInstance() {
        IRPCProxy iRPCProxy = irpcProxy;
        if (iRPCProxy != null) {
            return iRPCProxy;
        }
        return defaultProxy;
    }

    public static void setRpcProxy(IRPCProxy iRPCProxy) {
        irpcProxy = iRPCProxy;
    }

    public static void setRpcProxy(@NonNull IRPCProxy iRPCProxy, @NonNull String str) {
        rpcProxyMap.put(str, iRPCProxy);
    }

    public static boolean isRpcProxyExist() {
        return irpcProxy != null;
    }

    public static boolean isRpcProxyExist(String str) {
        return rpcProxyMap.get(str) != null;
    }

    public static void setSignRequest(SignRpcRequestPlugin signRpcRequestPlugin) {
        IRPCProxy iRPCProxy = irpcProxy;
        if (iRPCProxy != null) {
            iRPCProxy.setSignRequest(signRpcRequestPlugin);
        }
    }

    public static void addRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor) {
        IRPCProxy iRPCProxy = irpcProxy;
        if (iRPCProxy == null) {
            noImplementationError();
        } else {
            iRPCProxy.addRpcInterceptor(rpcInterceptor);
        }
    }

    /* access modifiers changed from: private */
    public static void noImplementationError() {
        ACLog.e(TAG, "There is no implementation of Rpc. Please setRpcProxy before using it.");
    }

    public static void removeRpcInterceptor(@NonNull RpcInterceptor rpcInterceptor) {
        IRPCProxy iRPCProxy = irpcProxy;
        if (iRPCProxy == null) {
            noImplementationError();
        } else {
            iRPCProxy.removeRpcInterceptor(rpcInterceptor);
        }
    }

    public static void clearRpcInterceptors() {
        IRPCProxy iRPCProxy = irpcProxy;
        if (iRPCProxy == null) {
            noImplementationError();
        } else {
            iRPCProxy.clearRpcInterceptors();
        }
    }

    public static void setSslPinningPlugin(SslPinningPlugin sslPinningPlugin) {
        IRPCProxy iRPCProxy = irpcProxy;
        if (iRPCProxy == null) {
            noImplementationError();
        } else {
            iRPCProxy.setSslPinningPlugin(sslPinningPlugin);
        }
    }
}
